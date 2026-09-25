package com.polidea.rxandroidble2.internal.serialization;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientOperationQueueImpl_Factory implements bleshadow.dagger.internal.Factory<com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl> {
    private final bleshadow.javax.inject.Provider<io.reactivex.Scheduler> callbackSchedulerProvider;

    public ClientOperationQueueImpl_Factory(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider) {
        this.callbackSchedulerProvider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl get() {
        return new com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl(this.callbackSchedulerProvider.get());
    }

    public static com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl_Factory create(bleshadow.javax.inject.Provider<io.reactivex.Scheduler> provider) {
        return new com.polidea.rxandroidble2.internal.serialization.ClientOperationQueueImpl_Factory(provider);
    }
}
