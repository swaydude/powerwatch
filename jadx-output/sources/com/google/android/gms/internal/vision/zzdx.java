package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdx extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int zzmi;

    public zzdx(java.lang.Throwable th, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th, referenceQueue);
        java.util.Objects.requireNonNull(th, "The referent cannot be null");
        this.zzmi = java.lang.System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zzmi;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            com.google.android.gms.internal.vision.zzdx zzdxVar = (com.google.android.gms.internal.vision.zzdx) obj;
            if (this.zzmi == zzdxVar.zzmi && get() == zzdxVar.get()) {
                return true;
            }
        }
        return false;
    }
}
