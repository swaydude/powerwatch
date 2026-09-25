package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeCallbackDispatcher_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher> {
    private static final com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher_Factory INSTANCE = new com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher_Factory();

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher get() {
        return new com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher();
    }

    public static com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher_Factory create() {
        return INSTANCE;
    }

    public static com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher newNativeCallbackDispatcher() {
        return new com.polidea.rxandroidble2.internal.connection.NativeCallbackDispatcher();
    }
}
