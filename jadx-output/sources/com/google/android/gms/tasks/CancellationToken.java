package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
public abstract class CancellationToken {
    public abstract boolean isCancellationRequested();

    public abstract com.google.android.gms.tasks.CancellationToken onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener onTokenCanceledListener);
}
