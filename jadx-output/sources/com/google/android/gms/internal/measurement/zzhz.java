package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzhz implements java.util.ListIterator<java.lang.String> {
    private java.util.ListIterator<java.lang.String> zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzia zzc;

    zzhz(com.google.android.gms.internal.measurement.zzia zziaVar, int i) {
        this.zzc = zziaVar;
        this.zzb = i;
        this.zza = zziaVar.zza.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
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
        return this.zza.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.zza.next();
    }
}
