package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableNever extends io.reactivex.Observable<java.lang.Object> {
    public static final io.reactivex.Observable<java.lang.Object> INSTANCE = new io.reactivex.internal.operators.observable.ObservableNever();

    private ObservableNever() {
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Object> observer) {
        observer.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.NEVER);
    }
}
