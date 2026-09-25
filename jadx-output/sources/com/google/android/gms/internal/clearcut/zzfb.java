package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzfb implements java.util.ListIterator<java.lang.String> {
    private java.util.ListIterator<java.lang.String> zzpc;
    private final /* synthetic */ int zzpd;
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzfa zzpe;

    zzfb(com.google.android.gms.internal.clearcut.zzfa zzfaVar, int i) {
        this.zzpe = zzfaVar;
        this.zzpd = i;
        this.zzpc = zzfaVar.zzpb.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzpc.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzpc.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.zzpc.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzpc.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ java.lang.String previous() {
        return this.zzpc.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzpc.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }
}
