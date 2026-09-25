package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zziy implements java.util.ListIterator<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.fitness.zziv zzzg;
    private java.util.ListIterator<java.lang.String> zzzh;
    private final /* synthetic */ int zzzi;

    zziy(com.google.android.gms.internal.fitness.zziv zzivVar, int i) {
        this.zzzg = zzivVar;
        this.zzzi = i;
        this.zzzh = zzivVar.zzze.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzzh.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzzh.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzzh.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzzh.previousIndex();
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
        return this.zzzh.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.zzzh.next();
    }
}
