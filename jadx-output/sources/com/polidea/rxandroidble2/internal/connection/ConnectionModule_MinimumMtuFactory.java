package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionModule_MinimumMtuFactory implements bleshadow.dagger.internal.Factory<java.lang.Integer> {
    private static final com.polidea.rxandroidble2.internal.connection.ConnectionModule_MinimumMtuFactory INSTANCE = new com.polidea.rxandroidble2.internal.connection.ConnectionModule_MinimumMtuFactory();

    @Override // bleshadow.javax.inject.Provider
    public java.lang.Integer get() {
        return java.lang.Integer.valueOf(com.polidea.rxandroidble2.internal.connection.ConnectionModule.minimumMtu());
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionModule_MinimumMtuFactory create() {
        return INSTANCE;
    }

    public static int proxyMinimumMtu() {
        return com.polidea.rxandroidble2.internal.connection.ConnectionModule.minimumMtu();
    }
}
