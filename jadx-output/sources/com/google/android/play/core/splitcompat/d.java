package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class d implements java.util.concurrent.ThreadFactory {
    d() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "SplitCompatBackgroundThread");
    }
}
