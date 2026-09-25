package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class LoggingIllegalOperationHandler_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> messageCreatorProvider;

    public LoggingIllegalOperationHandler_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> provider) {
        this.messageCreatorProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler get() {
        return new com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler(this.messageCreatorProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> provider) {
        return new com.polidea.rxandroidble2.internal.connection.LoggingIllegalOperationHandler_Factory(provider);
    }
}
