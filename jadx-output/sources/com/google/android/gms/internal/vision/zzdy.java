package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdy extends com.google.android.gms.internal.vision.zzdv {
    zzdy() {
    }

    @Override // com.google.android.gms.internal.vision.zzdv
    public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // com.google.android.gms.internal.vision.zzdv
    public final void zza(java.lang.Throwable th) {
        th.printStackTrace();
    }
}
