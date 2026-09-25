package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class BleConnectionCompat_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.util.BleConnectionCompat> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;

    public BleConnectionCompat_Factory(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.util.BleConnectionCompat get() {
        return new com.polidea.rxandroidble2.internal.util.BleConnectionCompat(this.contextProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.util.BleConnectionCompat_Factory create(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        return new com.polidea.rxandroidble2.internal.util.BleConnectionCompat_Factory(provider);
    }
}
