package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface Observer<T> {
    void onComplete();

    void onError(java.lang.Throwable th);

    void onNext(T t);

    void onSubscribe(io.reactivex.disposables.Disposable disposable);
}
