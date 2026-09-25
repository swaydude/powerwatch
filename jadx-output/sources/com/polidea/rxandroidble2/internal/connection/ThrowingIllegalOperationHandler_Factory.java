package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ThrowingIllegalOperationHandler_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> messageCreatorProvider;

    public ThrowingIllegalOperationHandler_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> provider) {
        this.messageCreatorProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler get() {
        return new com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler(this.messageCreatorProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationMessageCreator> provider) {
        return new com.polidea.rxandroidble2.internal.connection.ThrowingIllegalOperationHandler_Factory(provider);
    }
}
