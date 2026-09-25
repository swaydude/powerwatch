package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbc implements java.util.Iterator {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzbb zzfl;

    zzbc(com.google.android.gms.internal.clearcut.zzbb zzbbVar) {
        this.zzfl = zzbbVar;
        this.limit = zzbbVar.size();
    }

    private final byte nextByte() {
        try {
            com.google.android.gms.internal.clearcut.zzbb zzbbVar = this.zzfl;
            int i = this.position;
            this.position = i + 1;
            return zzbbVar.zzj(i);
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return java.lang.Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
