package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdk extends com.google.android.gms.internal.measurement.zzdf {
    zzdk() {
    }

    @Override // com.google.android.gms.internal.measurement.zzdf
    public final void zza(java.lang.Throwable th, java.lang.Throwable th2) {
        th.addSuppressed(th2);
    }
}
