package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class TrimmedThrowableData {
    public final com.crashlytics.android.core.TrimmedThrowableData cause;
    public final java.lang.String className;
    public final java.lang.String localizedMessage;
    public final java.lang.StackTraceElement[] stacktrace;

    public TrimmedThrowableData(java.lang.Throwable th, com.crashlytics.android.core.StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        this.localizedMessage = th.getLocalizedMessage();
        this.className = th.getClass().getName();
        this.stacktrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(th.getStackTrace());
        java.lang.Throwable cause = th.getCause();
        this.cause = cause != null ? new com.crashlytics.android.core.TrimmedThrowableData(cause, stackTraceTrimmingStrategy) : null;
    }
}
