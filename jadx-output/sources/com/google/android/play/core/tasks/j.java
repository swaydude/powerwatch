package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends java.lang.RuntimeException {
    public j(java.lang.String str) {
        super(str);
    }

    public j(java.lang.Throwable th) {
        super(th);
    }

    public abstract int getErrorCode();
}
