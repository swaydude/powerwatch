package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdh extends java.lang.ref.WeakReference<java.lang.Throwable> {
    private final int zza;

    public zzdh(java.lang.Throwable th, java.lang.ref.ReferenceQueue<java.lang.Throwable> referenceQueue) {
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
            com.google.android.gms.internal.measurement.zzdh zzdhVar = (com.google.android.gms.internal.measurement.zzdh) obj;
            if (this.zza == zzdhVar.zza && get() == zzdhVar.get()) {
                return true;
            }
        }
        return false;
    }
}
