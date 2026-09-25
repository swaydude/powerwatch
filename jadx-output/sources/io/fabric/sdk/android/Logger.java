package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public interface Logger {
    void d(java.lang.String str, java.lang.String str2);

    void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    void e(java.lang.String str, java.lang.String str2);

    void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    int getLogLevel();

    void i(java.lang.String str, java.lang.String str2);

    void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    boolean isLoggable(java.lang.String str, int i);

    void log(int i, java.lang.String str, java.lang.String str2);

    void log(int i, java.lang.String str, java.lang.String str2, boolean z);

    void setLogLevel(int i);

    void v(java.lang.String str, java.lang.String str2);

    void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th);

    void w(java.lang.String str, java.lang.String str2);

    void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th);
}
