package com.google.android.gms.internal.measurement;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhq<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int zza;
    private boolean zzb;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhi zzd;

    private zzhq(com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        this.zzd = zzhiVar;
        this.zza = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza + 1 < this.zzd.zzb.size() || (!this.zzd.zzc.isEmpty() && zza().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzb) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzf();
        if (this.zza < this.zzd.zzb.size()) {
            com.google.android.gms.internal.measurement.zzhi zzhiVar = this.zzd;
            int i = this.zza;
            this.zza = i - 1;
            zzhiVar.zzc(i);
            return;
        }
        zza().remove();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zza() {
        if (this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        if (i >= this.zzd.zzb.size()) {
            return zza().next();
        }
        return (java.util.Map.Entry) this.zzd.zzb.get(this.zza);
    }

    /* synthetic */ zzhq(com.google.android.gms.internal.measurement.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzhh zzhhVar) {
        this(zzhiVar);
    }
}
