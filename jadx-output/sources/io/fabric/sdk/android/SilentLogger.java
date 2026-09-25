package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public class SilentLogger implements io.fabric.sdk.android.Logger {
    private int logLevel = 7;

    @Override // io.fabric.sdk.android.Logger
    public void d(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void e(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void i(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    @Override // io.fabric.sdk.android.Logger
    public boolean isLoggable(java.lang.String str, int i) {
        return false;
    }

    @Override // io.fabric.sdk.android.Logger
    public void log(int i, java.lang.String str, java.lang.String str2) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void log(int i, java.lang.String str, java.lang.String str2, boolean z) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void setLogLevel(int i) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void v(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void w(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.fabric.sdk.android.Logger
    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    @Override // io.fabric.sdk.android.Logger
    public int getLogLevel() {
        return this.logLevel;
    }
}
