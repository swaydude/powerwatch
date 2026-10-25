import SwiftUI
import UIKit

struct ShareSheet: UIViewControllerRepresentable {
    let items: [Any]
    var completion: (() -> Void)? = nil

    func makeUIViewController(context: Context) -> UIActivityViewController {
        let controller = UIActivityViewController(activityItems: items, applicationActivities: nil)
        if let completion { controller.completionWithItemsHandler = { _, _, _, _ in completion() } }
        return controller
    }

    func updateUIViewController(_ uiViewController: UIActivityViewController, context: Context) {}
}

/// Lets the History screen hand a workout to another app, mirroring the APK's
/// `ShareFileProvider` (`GenericFileProvider`) based file sharing.
struct ActivityShareButton: View {
    let session: UserActivitySession
    @State private var sharing: [URL] = []
    @State private var showShare = false

    var body: some View {
        Menu {
            ForEach(ActivityExport.Format.allCases) { format in
                Button(format.rawValue) {
                    if let file = ActivityExport.write(session, format: format) {
                        sharing = [file.url]
                        showShare = true
                    }
                }
            }
        } label: {
            Label("Export", systemImage: "square.and.arrow.up")
        }
        .sheet(isPresented: $showShare) {
            if sharing.isEmpty {
                ContentUnavailableView("Nothing to export", systemImage: "square.and.arrow.up")
            } else {
                ShareSheet(items: sharing)
            }
        }
    }
}
