package com.polidea.rxandroidble2.internal.scan;

/* JADX INFO: loaded from: classes2.dex */
public final class ScanSettingsEmulator_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> schedulerProvider;

    public ScanSettingsEmulator_Factory(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider) {
        this.schedulerProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator get() {
        return new com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator(this.schedulerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator_Factory create(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider) {
        return new com.polidea.rxandroidble2.internal.scan.ScanSettingsEmulator_Factory(provider);
    }
}
