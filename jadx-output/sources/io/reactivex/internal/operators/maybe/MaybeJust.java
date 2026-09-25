package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeJust<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    final T value;

    public MaybeJust(T t) {
        this.value = t;
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(io.reactivex.disposables.Disposables.disposed());
        maybeObserver.onSuccess(this.value);
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
        return this.value;
    }
}
