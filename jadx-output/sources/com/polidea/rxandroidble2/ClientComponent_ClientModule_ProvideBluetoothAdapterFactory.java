package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientComponent_ClientModule_ProvideBluetoothAdapterFactory implements bleshadow.dagger.internal.Factory<android.bluetooth.BluetoothAdapter> {
    private static final com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothAdapterFactory INSTANCE = new com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothAdapterFactory();

    @Override // bleshadow.javax.inject.Provider
    public android.bluetooth.BluetoothAdapter get() {
        return com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothAdapter();
    }

    public static com.polidea.rxandroidble2.ClientComponent_ClientModule_ProvideBluetoothAdapterFactory create() {
        return INSTANCE;
    }

    public static android.bluetooth.BluetoothAdapter proxyProvideBluetoothAdapter() {
        return com.polidea.rxandroidble2.ClientComponent.ClientModule.provideBluetoothAdapter();
    }
}
