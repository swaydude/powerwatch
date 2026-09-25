package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class CrashlyticsPinningInfoProvider implements io.fabric.sdk.android.services.network.PinningInfoProvider {
    private final com.crashlytics.android.core.PinningInfoProvider pinningInfo;

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public long getPinCreationTimeInMillis() {
        return -1L;
    }

    public CrashlyticsPinningInfoProvider(com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider) {
        this.pinningInfo = pinningInfoProvider;
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public java.io.InputStream getKeyStoreStream() {
        return this.pinningInfo.getKeyStoreStream();
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public java.lang.String getKeyStorePassword() {
        return this.pinningInfo.getKeyStorePassword();
    }

    @Override // io.fabric.sdk.android.services.network.PinningInfoProvider
    public java.lang.String[] getPins() {
        return this.pinningInfo.getPins();
    }
}
