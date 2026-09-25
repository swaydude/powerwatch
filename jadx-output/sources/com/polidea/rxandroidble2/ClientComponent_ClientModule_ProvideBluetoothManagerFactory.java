package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideBluetoothManagerFactory implements bleshadow.dagger.internal.Factory<android.bluetooth.BluetoothManager> {
    private final bleshadow.javax.inject.Provider<android.content.Context> contextProvider;

    public ClientComponent_ClientModule_ProvideBluetoothManagerFactory(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public android.bluetooth.BluetoothManager get() {
        return (android.bluetooth.BluetoothManager) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothManager(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothManagerFactory create(bleshadow.javax.inject.Provider<android.content.Context> provider) {
        return new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothManagerFactory(provider);
    }

    public static android.bluetooth.BluetoothManager proxyProvideBluetoothManager(android.content.Context context) {
        return (android.bluetooth.BluetoothManager) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothManager(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
