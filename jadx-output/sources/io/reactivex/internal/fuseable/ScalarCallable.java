package io.reactivex.internal.fuseable;

/* JADX INFO: loaded from: classes2.dex */
public interface ScalarCallable<T> extends java.util.concurrent.Callable<T> {
    @Override // java.util.concurrent.Callable
    T call();
}
