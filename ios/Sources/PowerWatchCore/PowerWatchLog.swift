import Foundation

/// Trace logging for hardware sessions. Writes to stdout so it shows up in
/// `devicectl device process launch --console` and in Xcode's console. Cheap
/// (a timestamped print); kept behind a global switch so production builds
/// can silence it without code changes.
public enum PowerWatchLog {
    /// `false` silences every trace (one-line kill switch).
    public static var enabled = true

    /// When set, every trace line is also appended to this file (device
    /// debugging: real-device stdout is not reachable over `devicectl`, but
    /// the app container is pullable with `devicectl device copy from`).
    public static var fileURL: URL?
    private static let fileLock = NSLock()

    public static func log(_ message: String) {
        guard enabled else { return }
        let time = DateFormatter.localizedString(
            from: Date(), dateStyle: .none, timeStyle: .medium)
        let line = "[\(time)] \(message)"
        print(line)
        guard let url = fileURL else { return }
        fileLock.lock()
        defer { fileLock.unlock() }
        let data = (line + "\n").data(using: .utf8)!
        if let handle = try? FileHandle(forWritingTo: url) {
            handle.seekToEndOfFile()
            handle.write(data)
            try? handle.close()
        } else {
            try? data.write(to: url)
        }
    }
}
