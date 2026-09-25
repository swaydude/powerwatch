package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class n implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.play.core.splitcompat.SplitCompat a;

    n(com.google.android.play.core.splitcompat.SplitCompat splitCompat) {
        this.a = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.b.a();
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e);
        }
    }
}
