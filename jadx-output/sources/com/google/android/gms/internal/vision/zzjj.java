package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzjj<T, B> {
    zzjj() {
    }

    abstract void zza(B b, int i, long j);

    abstract void zza(B b, int i, com.google.android.gms.internal.vision.zzfh zzfhVar);

    abstract void zza(B b, int i, T t);

    abstract void zza(T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException;

    abstract boolean zza(com.google.android.gms.internal.vision.zzis zzisVar);

    abstract void zzb(B b, int i, long j);

    abstract void zzc(B b, int i, int i2);

    abstract void zzc(T t, com.google.android.gms.internal.vision.zzkg zzkgVar) throws java.io.IOException;

    abstract void zzf(java.lang.Object obj, T t);

    abstract void zzg(java.lang.Object obj);

    abstract void zzg(java.lang.Object obj, B b);

    abstract T zzh(T t, T t2);

    abstract B zzif();

    abstract T zzn(B b);

    abstract int zzr(T t);

    abstract T zzv(java.lang.Object obj);

    abstract B zzw(java.lang.Object obj);

    abstract int zzx(T t);

    final boolean zza(B b, com.google.android.gms.internal.vision.zzis zzisVar) throws java.io.IOException {
        int tag = zzisVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza(b, i, zzisVar.zzdx());
            return true;
        }
        if (i2 == 1) {
            zzb(b, i, zzisVar.zzdz());
            return true;
        }
        if (i2 == 2) {
            zza((java.lang.Object) b, i, zzisVar.zzed());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw com.google.android.gms.internal.vision.zzhc.zzgr();
            }
            zzc(b, i, zzisVar.zzea());
            return true;
        }
        B bZzif = zzif();
        int i3 = 4 | (i << 3);
        while (zzisVar.zzdu() != Integer.MAX_VALUE && zza(bZzif, zzisVar)) {
        }
        if (i3 != zzisVar.getTag()) {
            throw com.google.android.gms.internal.vision.zzhc.zzgq();
        }
        zza(b, i, zzn(bZzif));
        return true;
    }
}
