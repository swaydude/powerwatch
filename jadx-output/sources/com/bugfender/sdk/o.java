package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class o implements java.lang.Thread.UncaughtExceptionHandler {
    private static final java.lang.Thread.UncaughtExceptionHandler c = new com.bugfender.sdk.o.a();
    private final com.bugfender.sdk.s a;
    private final java.lang.Thread.UncaughtExceptionHandler b;

    class a implements java.lang.Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        }
    }

    public o(com.bugfender.sdk.s sVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = sVar;
        this.b = uncaughtExceptionHandler == null ? c : uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.a.a(com.bugfender.sdk.t.a(thread, th));
        this.b.uncaughtException(thread, th);
    }
}
