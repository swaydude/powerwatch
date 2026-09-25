package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableAutoConnect<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.atomic.AtomicInteger clients = new java.util.concurrent.atomic.AtomicInteger();
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> connection;
    final int numberOfSubscribers;
    final io.reactivex.flowables.ConnectableFlowable<? extends T> source;

    public FlowableAutoConnect(io.reactivex.flowables.ConnectableFlowable<? extends T> connectableFlowable, int i, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        this.source = connectableFlowable;
        this.numberOfSubscribers = i;
        this.connection = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((org.reactivestreams.Subscriber<? super java.lang.Object>) subscriber);
        if (this.clients.incrementAndGet() == this.numberOfSubscribers) {
            this.source.connect(this.connection);
        }
    }
}
