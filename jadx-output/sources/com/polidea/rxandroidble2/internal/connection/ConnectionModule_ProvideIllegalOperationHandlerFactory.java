package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionModule_ProvideIllegalOperationHandlerFactory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler> loggingIllegalOperationHandlerProvider;
    private final bleshadow.javax.inject.Provider<java.lang.Boolean> suppressOperationCheckProvider;
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler> throwingIllegalOperationHandlerProvider;

    public ConnectionModule_ProvideIllegalOperationHandlerFactory(bleshadow.javax.inject.Provider<java.lang.Boolean> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler> provider3) {
        this.suppressOperationCheckProvider = provider;
        this.loggingIllegalOperationHandlerProvider = provider2;
        this.throwingIllegalOperationHandlerProvider = provider3;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler get() {
        return (com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.provideIllegalOperationHandler(this.suppressOperationCheckProvider.get().booleanValue(), this.loggingIllegalOperationHandlerProvider, this.throwingIllegalOperationHandlerProvider), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideIllegalOperationHandlerFactory create(bleshadow.javax.inject.Provider<java.lang.Boolean> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler> provider2, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler> provider3) {
        return new com.polidea.rxandroidble2.internal.connection.ConnectionModule_ProvideIllegalOperationHandlerFactory(provider, provider2, provider3);
    }

    public static com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler proxyProvideIllegalOperationHandler(boolean z, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler> provider, bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler> provider2) {
        return (com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler) bleshadow.dagger.internal.Preconditions.checkNotNull(com.polidea.rxandroidble2.internal.connection.ConnectionModule.provideIllegalOperationHandler(z, provider, provider2), "Cannot return null from a non-@Nullable @Provides method");
    }
}
