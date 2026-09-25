package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableFromObservable<T> extends io.reactivex.Completable {
    final io.reactivex.ObservableSource<T> observable;

    public CompletableFromObservable(io.reactivex.ObservableSource<T> observableSource) {
        this.observable = observableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.observable.subscribe(new io.reactivex.internal.operators.completable.CompletableFromObservable.CompletableFromObservableObserver(completableObserver));
    }

    static final class CompletableFromObservableObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.CompletableObserver co;

        @Override // io.reactivex.Observer
        public void onNext(T t) {
        }

        CompletableFromObservableObserver(io.reactivex.CompletableObserver completableObserver) {
            this.co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.co.onSubscribe(disposable);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            this.co.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.co.onComplete();
        }
    }
}
