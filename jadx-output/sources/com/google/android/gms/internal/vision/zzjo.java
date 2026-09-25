package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjo extends java.util.AbstractList<java.lang.String> implements com.google.android.gms.internal.vision.zzhj, java.util.RandomAccess {
    private final com.google.android.gms.internal.vision.zzhj zzaao;

    public zzjo(com.google.android.gms.internal.vision.zzhj zzhjVar) {
        this.zzaao = zzhjVar;
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final com.google.android.gms.internal.vision.zzhj zzgy() {
        return this;
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final java.lang.Object getRaw(int i) {
        return this.zzaao.getRaw(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzaao.size();
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final void zzc(com.google.android.gms.internal.vision.zzfh zzfhVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new com.google.android.gms.internal.vision.zzjn(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.vision.zzjq(this);
    }

    @Override // com.google.android.gms.internal.vision.zzhj
    public final java.util.List<?> zzgx() {
        return this.zzaao.zzgx();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return (java.lang.String) this.zzaao.get(i);
    }
}
