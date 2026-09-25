package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionModule_GattWriteMtuOverheadFactory implements bleshadow.dagger.internal.Factory<java.lang.Integer> {
    private static final com.polidea.rxandroidble2.internal.connection.ConnectionModule_GattWriteMtuOverheadFactory INSTANCE = new com.polidea.rxandroidble2.internal.connection.ConnectionModule_GattWriteMtuOverheadFactory();

    @Override // bleshadow.javax.inject.Provider
    public java.lang.Integer get() {
        return java.lang.Integer.valueOf(com.polidea.rxandroidble2.internal.connection.ConnectionModule.gattWriteMtuOverhead());
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionModule_GattWriteMtuOverheadFactory create() {
        return INSTANCE;
    }

    public static int proxyGattWriteMtuOverhead() {
        return com.polidea.rxandroidble2.internal.connection.ConnectionModule.gattWriteMtuOverhead();
    }
}
