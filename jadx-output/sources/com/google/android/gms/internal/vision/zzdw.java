package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdw extends com.google.android.gms.internal.vision.zzdv {
    private final com.google.android.gms.internal.vision.zzdu zzmh = new com.google.android.gms.internal.vision.zzdu();

    zzdw() {
    }

    @Override // com.google.android.gms.internal.vision.zzdv
    public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == th) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        java.util.Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.zzmh.zza(th, true).add(th2);
    }

    @Override // com.google.android.gms.internal.vision.zzdv
    public final void zza(java.lang.Throwable th) {
        th.printStackTrace();
        java.util.List<java.lang.Throwable> listZza = this.zzmh.zza(th, false);
        if (listZza == null) {
            return;
        }
        synchronized (listZza) {
            for (java.lang.Throwable th2 : listZza) {
                java.lang.System.err.print("Suppressed: ");
                th2.printStackTrace();
            }
        }
    }
}
