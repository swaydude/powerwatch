package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdj extends com.google.android.gms.internal.measurement.zzdf {
    private final com.google.android.gms.internal.measurement.zzdi zza = new com.google.android.gms.internal.measurement.zzdi();

    zzdj() {
    }

    @Override // com.google.android.gms.internal.measurement.zzdf
    public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == th) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        java.util.Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.zza.zza(th, true).add(th2);
    }
}
