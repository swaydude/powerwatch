package com.google.android.play.core.tasks;

/* JADX INFO: loaded from: classes2.dex */
public class RuntimeExecutionException extends com.google.android.play.core.tasks.j {
    public RuntimeExecutionException(java.lang.Throwable th) {
        super(th);
    }

    @Override // com.google.android.play.core.tasks.j
    public int getErrorCode() {
        return -100;
    }
}
