package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class bk extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int a;

    public bk(java.lang.Throwable th, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th, referenceQueue);
        java.util.Objects.requireNonNull(th, "The referent cannot be null");
        this.a = java.lang.System.identityHashCode(th);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            com.google.android.play.core.internal.bk bkVar = (com.google.android.play.core.internal.bk) obj;
            if (this.a == bkVar.a && get() == bkVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
