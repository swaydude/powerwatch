package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjn implements java.util.ListIterator<java.lang.String> {
    private java.util.ListIterator<java.lang.String> zzaal;
    private final /* synthetic */ int zzaam;
    private final /* synthetic */ com.google.android.gms.internal.vision.zzjo zzaan;

    zzjn(com.google.android.gms.internal.vision.zzjo zzjoVar, int i) {
        this.zzaan = zzjoVar;
        this.zzaam = i;
        this.zzaal = zzjoVar.zzaao.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzaal.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzaal.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzaal.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzaal.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ java.lang.String previous() {
        return this.zzaal.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.zzaal.next();
    }
}
