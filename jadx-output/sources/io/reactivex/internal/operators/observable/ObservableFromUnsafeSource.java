package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFromUnsafeSource<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<T> source;

    public ObservableFromUnsafeSource(io.reactivex.ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(observer);
    }
}
