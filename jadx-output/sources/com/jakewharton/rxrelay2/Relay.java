package com.jakewharton.rxrelay2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Relay<T> extends io.reactivex.Observable<T> implements io.reactivex.functions.Consumer<T> {
    public abstract void accept(T t);

    public abstract boolean hasObservers();

    @io.reactivex.annotations.CheckReturnValue
    public final com.jakewharton.rxrelay2.Relay<T> toSerialized() {
        return this instanceof com.jakewharton.rxrelay2.SerializedRelay ? this : new com.jakewharton.rxrelay2.SerializedRelay(this);
    }
}
