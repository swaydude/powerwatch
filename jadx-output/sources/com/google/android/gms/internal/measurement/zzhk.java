package com.google.android.gms.internal.measurement;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhk<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int zza;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzhi zzc;

    private zzhk(com.google.android.gms.internal.measurement.zzhi zzhiVar) {
        this.zzc = zzhiVar;
        this.zza = zzhiVar.zzb.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        return (i > 0 && i <= this.zzc.zzb.size()) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zza() {
        if (this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (zza().hasNext()) {
            return zza().next();
        }
        java.util.List list = this.zzc.zzb;
        int i = this.zza - 1;
        this.zza = i;
        return (java.util.Map.Entry) list.get(i);
    }

    /* synthetic */ zzhk(com.google.android.gms.internal.measurement.zzhi zzhiVar, com.google.android.gms.internal.measurement.zzhh zzhhVar) {
        this(zzhiVar);
    }
}
