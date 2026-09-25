package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class n1 implements com.bugfender.sdk.m1 {
    private android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // com.bugfender.sdk.m1
    public void a(java.lang.Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // com.bugfender.sdk.m1
    public boolean a() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }
}
