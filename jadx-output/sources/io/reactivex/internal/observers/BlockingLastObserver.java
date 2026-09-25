package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingLastObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.value = t;
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        this.value = null;
        this.error = th;
        countDown();
    }
}
