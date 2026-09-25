package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzfc implements java.util.Iterator<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzfa zzpe;
    private java.util.Iterator<java.lang.String> zzpf;

    zzfc(com.google.android.gms.internal.clearcut.zzfa zzfaVar) {
        this.zzpe = zzfaVar;
        this.zzpf = zzfaVar.zzpb.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzpf.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zzpf.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
