package org.reactivestreams;

/* JADX INFO: loaded from: classes2.dex */
public interface Subscriber<T> {
    void onComplete();

    void onError(java.lang.Throwable th);

    void onNext(T t);

    void onSubscribe(org.reactivestreams.Subscription subscription);
}
