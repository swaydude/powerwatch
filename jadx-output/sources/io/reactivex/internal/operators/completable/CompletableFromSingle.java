package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromSingle<T> extends io.reactivex.Completable {
    final io.reactivex.SingleSource<T> single;

    public CompletableFromSingle(io.reactivex.SingleSource<T> singleSource) {
        this.single = singleSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.single.subscribe(new io.reactivex.internal.operators.completable.CompletableFromSingle.CompletableFromSingleObserver(completableObserver));
    }

    static final class CompletableFromSingleObserver<T> implements io.reactivex.SingleObserver<T> {
        final io.reactivex.CompletableObserver co;

        CompletableFromSingleObserver(io.reactivex.CompletableObserver completableObserver) {
            this.co = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            this.co.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.co.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.co.onComplete();
        }
    }
}
