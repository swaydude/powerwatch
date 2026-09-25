package io.fabric.sdk.android.services.concurrency;

/* JADX INFO: loaded from: classes2.dex */
public interface Task {
    java.lang.Throwable getError();

    boolean isFinished();

    void setError(java.lang.Throwable th);

    void setFinished(boolean z);
}
