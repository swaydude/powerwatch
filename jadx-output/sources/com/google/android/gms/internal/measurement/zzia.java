package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzia extends java.util.AbstractList<java.lang.String> implements com.google.android.gms.internal.measurement.zzfv, java.util.RandomAccess {
    private final com.google.android.gms.internal.measurement.zzfv zza;

    public zzia(com.google.android.gms.internal.measurement.zzfv zzfvVar) {
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final com.google.android.gms.internal.measurement.zzfv g_() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final java.lang.Object zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final void zza(com.google.android.gms.internal.measurement.zzdu zzduVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new com.google.android.gms.internal.measurement.zzhz(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.measurement.zzic(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzfv
    public final java.util.List<?> zzb() {
        return this.zza.zzb();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return (java.lang.String) this.zza.get(i);
    }
}
