// swift-tools-version:5.9
import PackageDescription

let package = Package(
    name: "PowerWatchCore",
    platforms: [.iOS(.v17), .macOS(.v14)],
    products: [
        .library(name: "PowerWatchCore", targets: ["PowerWatchCore"])
    ],
    dependencies: [
        // Local persistence — port of the Android Room/SQLite layer (T2.1)
        .package(url: "https://github.com/groue/GRDB.swift", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "PowerWatchCore",
            dependencies: [.product(name: "GRDB", package: "GRDB.swift")],
            path: "Sources/PowerWatchCore"
        ),
        .testTarget(
            name: "PowerWatchCoreTests",
            dependencies: ["PowerWatchCore"],
            path: "Tests/PowerWatchCoreTests",
            resources: [.copy("Fixtures")]
        ),
    ]
)
