package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableAutoConnect<T> extends io.reactivex.Observable<T> {
    final java.util.concurrent.atomic.AtomicInteger clients = new java.util.concurrent.atomic.AtomicInteger();
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> connection;
    final int numberOfObservers;
    final io.reactivex.observables.ConnectableObservable<? extends T> source;

    public ObservableAutoConnect(io.reactivex.observables.ConnectableObservable<? extends T> connectableObservable, int i, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        this.source = connectableObservable;
        this.numberOfObservers = i;
        this.connection = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe((io.reactivex.Observer<? super java.lang.Object>) observer);
        if (this.clients.incrementAndGet() == this.numberOfObservers) {
            this.source.connect(this.connection);
        }
    }
}
