package io.reactivex.internal.fuseable;

/* JADX INFO: loaded from: classes2.dex */
public interface ConditionalSubscriber<T> extends io.reactivex.FlowableSubscriber<T> {
    boolean tryOnNext(T t);
}
