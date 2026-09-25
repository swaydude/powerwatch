package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class ScanPreconditionsVerifierApi24_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> scanPreconditionVerifierApi18Provider;
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> timeSchedulerProvider;

    public ScanPreconditionsVerifierApi24_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> provider, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider2) {
        this.scanPreconditionVerifierApi18Provider = provider;
        this.timeSchedulerProvider = provider2;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24 get() {
        return new com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24(this.scanPreconditionVerifierApi18Provider.get(), this.timeSchedulerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi18> provider, bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider2) {
        return new com.polidea.rxandroidble2.internal.scan.ScanPreconditionsVerifierApi24_Factory(provider, provider2);
    }
}
