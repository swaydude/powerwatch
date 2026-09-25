package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes2.dex */
public interface InnerQueuedSubscriberSupport<T> {
    void drain();

    void innerComplete(io.reactivex.internal.subscribers.InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void innerError(io.reactivex.internal.subscribers.InnerQueuedSubscriber<T> innerQueuedSubscriber, java.lang.Throwable th);

    void innerNext(io.reactivex.internal.subscribers.InnerQueuedSubscriber<T> innerQueuedSubscriber, T t);
}
