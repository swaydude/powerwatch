package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzec {
    private final com.google.android.gms.internal.measurement.zzen zza;
    private final byte[] zzb;

    private zzec(int i) {
        byte[] bArr = new byte[i];
        this.zzb = bArr;
        this.zza = com.google.android.gms.internal.measurement.zzen.zza(bArr);
    }

    public final com.google.android.gms.internal.measurement.zzdu zza() {
        this.zza.zzb();
        return new com.google.android.gms.internal.measurement.zzee(this.zzb);
    }

    public final com.google.android.gms.internal.measurement.zzen zzb() {
        return this.zza;
    }

    /* synthetic */ zzec(int i, com.google.android.gms.internal.measurement.zzdx zzdxVar) {
        this(i);
    }
}
