package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zziv extends java.util.AbstractList<java.lang.String> implements com.google.android.gms.internal.fitness.zzgv, java.util.RandomAccess {
    private final com.google.android.gms.internal.fitness.zzgv zzze;

    public zziv(com.google.android.gms.internal.fitness.zzgv zzgvVar) {
        this.zzze = zzgvVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzgv
    public final com.google.android.gms.internal.fitness.zzgv zzby() {
        return this;
    }

    @Override // com.google.android.gms.internal.fitness.zzgv
    public final java.lang.Object zzad(int i) {
        return this.zzze.zzad(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzze.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new com.google.android.gms.internal.fitness.zziy(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.fitness.zzix(this);
    }

    @Override // com.google.android.gms.internal.fitness.zzgv
    public final java.util.List<?> zzbx() {
        return this.zzze.zzbx();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return (java.lang.String) this.zzze.get(i);
    }
}
