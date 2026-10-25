import Foundation

/// Activity export. The Android app writes GPX and TCX files and hands them to
/// `Intent.createChooser`; the TCX namespace string
/// `http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2` is present in the
/// DEX, which is what pins the schema version. Sharing stays fully local via
/// `UIActivityViewController`.
enum ActivityExport {
    struct ExportedFile {
        var name: String
        var url: URL
        var mimeType: String
    }

    static func gpx(for session: UserActivitySession) -> String {
        let iso = ISO8601DateFormatter()
        var xml = """
        <?xml version="1.0" encoding="UTF-8"?>
        <gpx version="1.1" creator="PowerWatch2 for iOS"
             xmlns="http://www.topografix.com/GPX/1/1">
          <metadata>
            <name>\(escape(session.name))</name>
            <time>\(iso.string(from: session.startTime))</time>
          </metadata>
          <trk>
            <name>\(escape(session.name))</name>
            <type>\(escape(session.activityType.rawValue))</type>
            <trkseg>

        """
        for position in session.gpsPositions {
            xml += """
                  <trkpt lat="\(position.latitude)" lon="\(position.longitude)">
                    <ele>\(position.altitude)</ele>
                  </trkpt>

            """
        }
        xml += """
            </trkseg>
          </trk>
        </gpx>

        """
        return xml
    }

    static func tcx(for session: UserActivitySession) -> String {
        let iso = ISO8601DateFormatter()
        var xml = """
        <?xml version="1.0" encoding="UTF-8"?>
        <TrainingCenterDatabase
            xmlns="http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
          <Activities>
            <Activity Sport="\(tcxSport(session.activityType))">
              <Id>\(iso.string(from: session.startTime))</Id>
              <Lap StartTime="\(iso.string(from: session.startTime))">
                <TotalTimeSeconds>\(String(format: "%.0f", session.duration))</TotalTimeSeconds>
                <DistanceMeters>\(String(format: "%.0f", session.distance))</DistanceMeters>
                <Calories>\(session.activeCalories + session.bmrCalories)</Calories>
                <Intensity>Active</Intensity>
                <TriggerMethod>Manual</TriggerMethod>
                <Track>

        """
        for (index, position) in session.gpsPositions.enumerated() {
            let time = session.startTime.addingTimeInterval(
                session.duration * Double(index) / Double(max(1, session.gpsPositions.count - 1))
            )
            let heart = session.heartRates.indices.contains(index) ? session.heartRates[index].value : nil
            xml += """
                      <Trackpoint>
                        <Time>\(iso.string(from: time))</Time>
                        <Position>
                          <LatitudeDegrees>\(position.latitude)</LatitudeDegrees>
                          <LongitudeDegrees>\(position.longitude)</LongitudeDegrees>
                          <AltitudeMeters>\(position.altitude)</AltitudeMeters>
                        </Position>

            """
            if let heart {
                xml += """
                        <HeartRateBpm>
                          <Value>\(heart)</Value>
                        </HeartRateBpm>

                """
            }
            xml += "                      </Trackpoint>\n"
        }
        xml += """
                </Track>
              </Lap>
            </Activity>
          </Activities>
        </TrainingCenterDatabase>

        """
        return xml
    }

    private static func tcxSport(_ type: UserActivityType) -> String {
        switch type {
        case .outdoorRun, .indoorRun, .outdoorJog, .indoorJog, .outdoorWalk, .indoorWalk, .intervalTraining:
            return "Running"
        case .outdoorCycle, .indoorCycle:
            return "Biking"
        case .driving, .stationary, .unknown:
            return "Other"
        }
    }

    private static func escape(_ text: String) -> String {
        text.replacingOccurrences(of: "&", with: "&amp;")
            .replacingOccurrences(of: "<", with: "&lt;")
            .replacingOccurrences(of: ">", with: "&gt;")
    }

    // MARK: Writing files

    static func write(_ session: UserActivitySession, format: Format) -> ExportedFile? {
        let (content, suffix, mime): (String, String, String)
        switch format {
        case .gpx: (content, suffix, mime) = (gpx(for: session), "gpx", "application/gpx+xml")
        case .tcx: (content, suffix, mime) = (tcx(for: session), "tcx", "application/xml")
        }
        let stamp = Int(session.startTime.timeIntervalSince1970)
        let directory = FileManager.default.temporaryDirectory
        let url = directory.appendingPathComponent("\(Self.safeFileName(session.name))-\(stamp).\(suffix)")
        // `appendingPathComponent` does not interpret `..`, and a session name is
        // user-editable from History ▸ Edit, so the finished path is checked rather than
        // trusted (L2).
        guard url.standardizedFileURL.path.hasPrefix(directory.standardizedFileURL.path + "/") else {
            NSLog("pw2-export refused to write outside the temporary directory")
            return nil
        }
        do {
            try content.data(using: .utf8)?.write(to: url, options: .completeFileProtectionUnlessOpen)
            return ExportedFile(name: url.lastPathComponent, url: url, mimeType: mime)
        } catch {
            NSLog("pw2-export write failed: %@", error.localizedDescription)
            return nil
        }
    }

    /// A share-sheet filename out of a free-text session name: nothing that can navigate
    /// the sandbox, change extension, or start with a dot, and short enough to be usable.
    static func safeFileName(_ name: String) -> String {
        var allowed = CharacterSet.alphanumerics
        allowed.insert(charactersIn: "._- ")
        let kept = String(String.UnicodeScalarView(name.unicodeScalars.map { allowed.contains($0) ? $0 : " " }))
        let collapsed = kept.split(whereSeparator: { $0 == " " || $0 == "." })
            .joined(separator: "-")
            .prefix(64)
        return collapsed.isEmpty ? "session" : String(collapsed)
    }

    enum Format: String, CaseIterable, Identifiable {
        case gpx = "GPX"
        case tcx = "TCX"
        var id: String { rawValue }
    }
}

/// `Intent.createChooser` equivalent.
