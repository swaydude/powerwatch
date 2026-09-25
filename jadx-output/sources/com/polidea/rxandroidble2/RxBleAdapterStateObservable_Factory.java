package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class RxBleAdapterStateObservable_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.RxBleAdapterStateObservable> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;

    public RxBleAdapterStateObservable_Factory(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.RxBleAdapterStateObservable get() {
        return new com.polidea.rxandroidble2.RxBleAdapterStateObservable(this.contextProvider.get());
    }

    public static com.polidea.rxandroidble2.RxBleAdapterStateObservable_Factory create(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        return new com.polidea.rxandroidble2.RxBleAdapterStateObservable_Factory(provider);
    }
}
