package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public class ScanPreconditionsVerifierApi24 implements com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier {
    private static final long EXCESSIVE_SCANNING_PERIOD = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);
    private static final int SCANS_LENGTH = 5;
    private final long[] previousChecks = new long[5];
    private final com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18 scanPreconditionVerifierApi18;
    private final io.reactivex.Scheduler timeScheduler;

    @bleshadow.javax.inject.Inject
    public ScanPreconditionsVerifierApi24(com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18 scanPreconditionsVerifierApi18, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.COMPUTATION) io.reactivex.Scheduler scheduler) {
        this.scanPreconditionVerifierApi18 = scanPreconditionsVerifierApi18;
        this.timeScheduler = scheduler;
    }

    @Override // com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifier
    public void verify(boolean z) {
        this.scanPreconditionVerifierApi18.verify(z);
        int oldestCheckTimestampIndex = getOldestCheckTimestampIndex();
        long j = this.previousChecks[oldestCheckTimestampIndex];
        long jNow = this.timeScheduler.now(java.util.concurrent.TimeUnit.MILLISECONDS);
        long j2 = jNow - j;
        long j3 = EXCESSIVE_SCANNING_PERIOD;
        if (j2 < j3) {
            throw new com.polidea.rxandroidble2.exceptions.BleScanException(com.polidea.rxandroidble2.exceptions.BleScanException.UNDOCUMENTED_SCAN_THROTTLE, new java.util.Date(j + j3));
        }
        this.previousChecks[oldestCheckTimestampIndex] = jNow;
    }

    private int getOldestCheckTimestampIndex() {
        long j = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < 5; i2++) {
            long j2 = this.previousChecks[i2];
            if (j2 < j) {
                i = i2;
                j = j2;
            }
        }
        return i;
    }
}
