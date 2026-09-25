package org.reactivestreams;

/* JADX INFO: loaded from: classes2.dex */
public interface Publisher<T> {
    void subscribe(org.reactivestreams.Subscriber<? super T> subscriber);
}
