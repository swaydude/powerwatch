package io.reactivex.internal.operators.single;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleJust<T> extends io.reactivex.Single<T> {
    final T value;

    public SingleJust(T t) {
        this.value = t;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        singleObserver.onSuccess(this.value);
    }
}
