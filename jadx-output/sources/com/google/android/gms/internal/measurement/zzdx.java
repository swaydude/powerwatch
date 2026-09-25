package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdx extends com.google.android.gms.internal.measurement.zzdz {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdu zzc;

    zzdx(com.google.android.gms.internal.measurement.zzdu zzduVar) {
        this.zzc = zzduVar;
        this.zzb = zzduVar.zza();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzed
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new java.util.NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }
}
