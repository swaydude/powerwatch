package io.reactivex;

/* JADX INFO: loaded from: classes2.dex */
public interface MaybeSource<T> {
    void subscribe(io.reactivex.MaybeObserver<? super T> maybeObserver);
}
