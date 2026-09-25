package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultLogger implements io.fabric.sdk.android.Logger {
    private int logLevel;

    public DefaultLogger(int i) {
        this.logLevel = i;
    }

    public DefaultLogger() {
        this.logLevel = 4;
    }

    @Override // io.fabric.sdk.android.Logger
    public boolean isLoggable(java.lang.String str, int i) {
        return this.logLevel <= i || android.util.Log.isLoggable(str, i);
    }

    @Override // io.fabric.sdk.android.Logger
    public int getLogLevel() {
        return this.logLevel;
    }

    @Override // io.fabric.sdk.android.Logger
    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    @Override // io.fabric.sdk.android.Logger
    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (isLoggable(str, 3)) {
            android.util.Log.d(str, str2, th);
        }
    }

    @Override // io.fabric.sdk.android.Logger
    public void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (isLoggable(str, 2)) {
            android.util.Log.v(str, str2, th);
        }
    }

    @Override // io.fabric.sdk.android.Logger
    public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (isLoggable(str, 4)) {
            android.util.Log.i(str, str2, th);
        }
    }

    @Override // io.fabric.sdk.android.Logger
    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (isLoggable(str, 5)) {
            android.util.Log.w(str, str2, th);
        }
    }

    @Override // io.fabric.sdk.android.Logger
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (isLoggable(str, 6)) {
            android.util.Log.e(str, str2, th);
        }
    }

    @Override // io.fabric.sdk.android.Logger
    public void d(java.lang.String str, java.lang.String str2) {
        d(str, str2, null);
    }

    @Override // io.fabric.sdk.android.Logger
    public void v(java.lang.String str, java.lang.String str2) {
        v(str, str2, null);
    }

    @Override // io.fabric.sdk.android.Logger
    public void i(java.lang.String str, java.lang.String str2) {
        i(str, str2, null);
    }

    @Override // io.fabric.sdk.android.Logger
    public void w(java.lang.String str, java.lang.String str2) {
        w(str, str2, null);
    }

    @Override // io.fabric.sdk.android.Logger
    public void e(java.lang.String str, java.lang.String str2) {
        e(str, str2, null);
    }

    @Override // io.fabric.sdk.android.Logger
    public void log(int i, java.lang.String str, java.lang.String str2) {
        log(i, str, str2, false);
    }

    @Override // io.fabric.sdk.android.Logger
    public void log(int i, java.lang.String str, java.lang.String str2, boolean z) {
        if (z || isLoggable(str, i)) {
            android.util.Log.println(i, str, str2);
        }
    }
}
