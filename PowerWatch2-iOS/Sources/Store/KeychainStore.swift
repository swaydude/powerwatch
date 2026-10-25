import Foundation
import Security

/// Stores the locally-issued session token and the login secret.
///
/// In the APK the session was the Room table `PasswordCredentials`
/// (uid/accessToken/tokenType/refreshToken/expiresIn/scope/tokenValidUntil/
/// email/password) written by `TokenStorage_Impl` and read by `TokenProvider`.
/// That build also kept the **plaintext** password in Room — in `User.password`
/// and again in `PasswordCredentials.password` — so `CloudErrorHandlerImpl
/// .handleAuthError` could re-run the OAuth2 password grant after a 401. There is
/// no server to re-authorize against here, so the token is only a local marker;
/// but the password still has to survive relaunch to gate the local login, and it
/// goes to the keychain instead of the JSON snapshot.
struct KeychainStore {
    static let shared = KeychainStore()

    private let service = "com.matrixindustries.powerwatch2.ios.session"
    private let account = "local-session"

    struct LocalSession: Codable {
        var accessToken: String
        var tokenType: String
        var email: String
        /// Epoch seconds. The Android `TokenProvider` derives
        /// `tokenValidUntil = now + expiresIn * 1000`; we keep the same shape so
        /// `isLoggedIn()` behaves identically.
        var tokenValidUntil: TimeInterval
        var issuedAt: TimeInterval

        static func issue(email: String, lifetime: TimeInterval = 60 * 60 * 24 * 365 * 10) -> LocalSession {
            let now = Date().timeIntervalSince1970
            return LocalSession(
                accessToken: "local-\(UUID().uuidString)",
                tokenType: "Bearer",
                email: email,
                tokenValidUntil: now + lifetime,
                issuedAt: now
            )
        }

        var isValid: Bool { tokenValidUntil > Date().timeIntervalSince1970 }
    }

    private func baseQuery() -> [String: Any] {
        [
            kSecClass as String: kSecClassGenericPassword,
            kSecAttrService as String: service,
            kSecAttrAccount as String: account
        ]
    }

    /// Written items are kept off backups and off keychain sync (L1). This is only ever
    /// added to the *write* dictionary: an accessibility attribute in a read or delete
    /// query filters by class, which would leave items written by an earlier build
    /// — under the default class — unreachable and undeletable.
    private var protectionAttributes: [String: Any] {
        [kSecAttrAccessible as String: kSecAttrAccessibleAfterFirstUnlockThisDeviceOnly]
    }

    func save(_ session: LocalSession) {
        guard let data = try? JSONEncoder().encode(session) else {
            NSLog("pw2-store could not encode the local session; staying signed out")
            return
        }
        SecItemDelete(baseQuery() as CFDictionary)
        var add = baseQuery()
        add[kSecValueData as String] = data
        add.merge(protectionAttributes) { _, new in new }
        let status = SecItemAdd(add as CFDictionary, nil)
        if status != errSecSuccess { Self.vault.recordFailure(status) }
    }

    func read() -> LocalSession? {
        var q = baseQuery()
        q[kSecReturnData as String] = true
        q[kSecMatchLimit as String] = kSecMatchLimitOne
        var out: CFTypeRef?
        guard SecItemCopyMatching(q as CFDictionary, &out) == errSecSuccess,
              let data = out as? Data else { return nil }
        return try? JSONDecoder().decode(LocalSession.self, from: data)
    }

    /// Drops the session item only. `logout` deliberately uses `deleteAll` instead;
    /// this is for the paths that keep the account but reissue a session.
    func delete() {
        SecItemDelete(baseQuery() as CFDictionary)
    }

    /// Removes every item this store owns, whatever account or accessibility class it was
    /// written under. `logout` uses it so no `password:*` row can outlive the account (M1).
    func deleteAll() {
        SecItemDelete([
            kSecClass as String: kSecClassGenericPassword,
            kSecAttrService as String: service
        ] as CFDictionary)
        Self.vault.releaseAll()
    }

    var hasToken: Bool { read()?.isValid ?? false }

    // MARK: Password — replaces the plaintext `User.password` /
    // `PasswordCredentials.password` columns.

    private func passwordQuery(for email: String) -> [String: Any] {
        [
            kSecClass as String: kSecClassGenericPassword,
            kSecAttrService as String: service,
            // Separate account so the secret can never overwrite the session item.
            kSecAttrAccount as String: "password:\(email.lowercased())"
        ]
    }

    /// `TokenStorage_Impl.savePassword`. Returns `false` when the keychain refused
    /// the write so the caller can say so instead of losing the credential
    /// silently; in that case the value is kept process-local only.
    @discardableResult
    func savePassword(_ password: String, for email: String) -> Bool {
        SecItemDelete(passwordQuery(for: email) as CFDictionary)
        var add = passwordQuery(for: email)
        add[kSecValueData as String] = Data(password.utf8)
        add.merge(protectionAttributes) { _, new in new }
        let status = SecItemAdd(add as CFDictionary, nil)
        if status == errSecSuccess {
            Self.vault.clear(email)
            return true
        }
        Self.vault.recordFailure(status)
        Self.vault.set(password, for: email)
        return false
    }

    func password(for email: String) -> String? {
        var q = passwordQuery(for: email)
        q[kSecReturnData as String] = true
        q[kSecMatchLimit as String] = kSecMatchLimitOne
        var out: CFTypeRef?
        if SecItemCopyMatching(q as CFDictionary, &out) == errSecSuccess,
           let data = out as? Data, let stored = String(data: data, encoding: .utf8) {
            return stored
        }
        // Only reached on hosts with no usable keychain (a headless test runner,
        // for instance). Never backed by disk.
        return Self.vault.get(email)
    }

    /// Removes one account's secret. `logout` uses `deleteAll`, which cannot miss an
    /// account; this stays for a future per-account removal.
    func deletePassword(for email: String) {
        SecItemDelete(passwordQuery(for: email) as CFDictionary)
        Self.vault.clear(email)
    }

    /// Last `OSStatus` from a refused keychain write, for diagnostics.
    static var lastKeychainError: OSStatus? { vault.lastError }

    private static let vault = SecretVault()
}

/// Process-local fallback for keychain writes. Deliberately memory-only: if the
/// keychain is unavailable the password is forgotten at exit rather than written
/// to Application Support in the clear.
private final class SecretVault: @unchecked Sendable {
    private var storage: [String: String] = [:]
    private var failure: OSStatus?
    private let lock = NSLock()

    var lastError: OSStatus? {
        lock.lock(); defer { lock.unlock() }
        return failure
    }

    func recordFailure(_ status: OSStatus) {
        lock.lock(); failure = status; lock.unlock()
    }

    func set(_ value: String, for email: String) {
        lock.lock(); storage[email.lowercased()] = value; lock.unlock()
    }

    func get(_ email: String) -> String? {
        lock.lock(); defer { lock.unlock() }
        return storage[email.lowercased()]
    }

    func clear(_ email: String) {
        lock.lock(); storage[email.lowercased()] = nil; lock.unlock()
    }

    func releaseAll() {
        lock.lock(); storage.removeAll(); lock.unlock()
    }
}
