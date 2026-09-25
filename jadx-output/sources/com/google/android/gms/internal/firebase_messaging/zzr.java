package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzr extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int zza;

    public zzr(java.lang.Throwable th, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
        super(th, referenceQueue);
        java.util.Objects.requireNonNull(th, "The referent cannot be null");
        this.zza = java.lang.System.identityHashCode(th);
    }

    public final int hashCode() {
        return this.zza;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            com.google.android.gms.internal.firebase_messaging.zzr zzrVar = (com.google.android.gms.internal.firebase_messaging.zzr) obj;
            if (this.zza == zzrVar.zza && get() == zzrVar.get()) {
                return true;
            }
        }
        return false;
    }
}
