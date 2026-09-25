package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzix implements java.util.Iterator<java.lang.String> {
    private java.util.Iterator<java.lang.String> zzzf;
    private final /* synthetic */ com.google.android.gms.internal.fitness.zziv zzzg;

    zzix(com.google.android.gms.internal.fitness.zziv zzivVar) {
        this.zzzg = zzivVar;
        this.zzzf = zzivVar.zzze.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzzf.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zzzf.next();
    }
}
