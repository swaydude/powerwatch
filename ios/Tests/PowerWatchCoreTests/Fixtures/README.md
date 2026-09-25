# Golden BLE fixtures

Captured watch frames live here once task T1.3 runs: hex-dump files, one per
command exchange, captured by instrumenting the patched Android app against the
real watch (reusing the `tools/capture_*.sh` instrumentation pattern).

Naming: `<command-id>_<direction>.hex`, e.g. `9107_response.hex`,
`9002_request.hex`. Lines starting with `#` are comments; payload bytes are
`90 01 ...` style hex.

Tests in `ProtocolGoldenTests.swift` (written alongside task T1.4) decode every
fixture and assert byte-identical re-encoding (TC-P01, TC-P02).
