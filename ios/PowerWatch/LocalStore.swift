import Foundation
import PowerWatchCore

/// Local persistence for the user profile and goals.
///
/// Phase 2 (task T2.2) replaces the JSON file with a GRDB database ported
/// from the Android Room schema; the interface stays the same.
struct LocalStore: Codable {
    var user: User?
    var goals: GoalConfiguration?
    var device: Device?

    static let sharedURL: URL = {
        let base = FileManager.default.urls(for: .applicationSupportDirectory, in: .userDomainMask)[0]
        try? FileManager.default.createDirectory(at: base, withIntermediateDirectories: true)
        return base.appendingPathComponent("powerwatch.json")
    }()

    static func load(url: URL = sharedURL) -> LocalStore {
        guard let data = try? Data(contentsOf: url),
              let store = try? JSONDecoder().decode(LocalStore.self, from: data) else {
            return LocalStore()
        }
        return store
    }

    static func deleteSaved(url: URL = sharedURL) {
        try? FileManager.default.removeItem(at: url)
    }

    func save(url: URL = sharedURL) {
        if let data = try? JSONEncoder().encode(self) {
            try? data.write(to: url, options: .atomic)
        }
    }

    var isOnboarded: Bool { user != nil && goals != nil }
}
