package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDoOnLifecycle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    private final io.reactivex.functions.Action onDispose;
    private final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;

    public ObservableDoOnLifecycle(io.reactivex.Observable<T> observable, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Action action) {
        super(observable);
        this.onSubscribe = consumer;
        this.onDispose = action;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.observers.DisposableLambdaObserver(observer, this.onSubscribe, this.onDispose));
    }
}
