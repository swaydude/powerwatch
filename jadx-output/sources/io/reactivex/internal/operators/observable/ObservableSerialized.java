package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSerialized<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableSerialized(io.reactivex.Observable<T> observable) {
        super(observable);
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.observers.SerializedObserver(observer));
    }
}
