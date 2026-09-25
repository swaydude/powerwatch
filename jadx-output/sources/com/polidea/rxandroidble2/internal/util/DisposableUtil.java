package com.polidea.rxandroidble2.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public class DisposableUtil {
    private DisposableUtil() {
    }

    public static <T> io.reactivex.observers.DisposableSingleObserver<T> disposableSingleObserverFromEmitter(final io.reactivex.SingleEmitter<T> singleEmitter) {
        return new io.reactivex.observers.DisposableSingleObserver<T>() { // from class: com.polidea.rxandroidble2.internal.util.DisposableUtil.1
            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                singleEmitter.onSuccess(t);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                singleEmitter.tryOnError(th);
            }
        };
    }

    public static <T> io.reactivex.observers.DisposableObserver<T> disposableObserverFromEmitter(final io.reactivex.ObservableEmitter<T> observableEmitter) {
        return new io.reactivex.observers.DisposableObserver<T>() { // from class: com.polidea.rxandroidble2.internal.util.DisposableUtil.2
            @Override // io.reactivex.Observer
            public void onNext(T t) {
                observableEmitter.onNext(t);
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                observableEmitter.tryOnError(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                observableEmitter.onComplete();
            }
        };
    }

    public static <T> io.reactivex.observers.DisposableSingleObserver<T> disposableSingleObserverFromEmitter(final io.reactivex.ObservableEmitter<T> observableEmitter) {
        return new io.reactivex.observers.DisposableSingleObserver<T>() { // from class: com.polidea.rxandroidble2.internal.util.DisposableUtil.3
            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                observableEmitter.onNext(t);
                observableEmitter.onComplete();
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable th) {
                observableEmitter.tryOnError(th);
            }
        };
    }

    public static <T> io.reactivex.observers.DisposableObserver<T> disposableObserver(final io.reactivex.Observer<T> observer) {
        return new io.reactivex.observers.DisposableObserver<T>() { // from class: com.polidea.rxandroidble2.internal.util.DisposableUtil.4
            @Override // io.reactivex.Observer
            public void onNext(T t) {
                observer.onNext(t);
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                observer.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                observer.onComplete();
            }
        };
    }
}
