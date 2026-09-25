package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
final class p implements java.lang.Runnable {
    private final /* synthetic */ java.util.Set a;
    private final /* synthetic */ com.google.android.play.core.splitcompat.SplitCompat b;

    p(com.google.android.play.core.splitcompat.SplitCompat splitCompat, java.util.Set set) {
        this.b = splitCompat;
        this.a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.b.f((java.lang.String) it.next());
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e);
        }
    }
}
