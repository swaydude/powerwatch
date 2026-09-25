package com.bugfender.sdk.logcat;

/* JADX INFO: loaded from: classes.dex */
public class InterceptedLog {
    private java.lang.String file;
    private com.bugfender.sdk.LogLevel level;
    private int lineNumber;
    private java.lang.String message;
    private java.lang.String method;
    private java.lang.String tag;

    public InterceptedLog(int i, java.lang.String str, java.lang.String str2, com.bugfender.sdk.LogLevel logLevel, java.lang.String str3, java.lang.String str4) {
        this.lineNumber = i;
        this.method = str;
        this.file = str2;
        this.level = logLevel;
        this.tag = str3;
        this.message = str4;
    }

    public java.lang.String getFile() {
        return this.file;
    }

    public com.bugfender.sdk.LogLevel getLevel() {
        return this.level;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.lang.String getMethod() {
        return this.method;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    public void setFile(java.lang.String str) {
        this.file = str;
    }

    public void setLevel(com.bugfender.sdk.LogLevel logLevel) {
        this.level = logLevel;
    }

    public void setLineNumber(int i) {
        this.lineNumber = i;
    }

    public void setMessage(java.lang.String str) {
        this.message = str;
    }

    public void setMethod(java.lang.String str) {
        this.method = str;
    }

    public void setTag(java.lang.String str) {
        this.tag = str;
    }
}
