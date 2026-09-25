package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(com.google.android.gms.tasks.Task<TResult> task) throws java.lang.Exception;
}
