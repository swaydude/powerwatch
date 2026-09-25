package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class IllegalOperationChecker_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker> {
    private final bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler> resultHandlerProvider;

    public IllegalOperationChecker_Factory(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler> provider) {
        this.resultHandlerProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker get() {
        return new com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker(this.resultHandlerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker_Factory create(bleshadow.javax.inject.Provider<com.polidea.rxandroidble2.internal.connection.IllegalOperationHandler> provider) {
        return new com.polidea.rxandroidble2.internal.connection.IllegalOperationChecker_Factory(provider);
    }
}
