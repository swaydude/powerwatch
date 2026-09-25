package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public interface SuccessContinuation<TResult, TContinuationResult> {
    com.google.android.gms.tasks.Task<TContinuationResult> then(TResult tresult) throws java.lang.Exception;
}
