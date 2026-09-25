package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzjq implements java.util.Iterator<java.lang.String> {
    private final /* synthetic */ com.google.android.gms.internal.vision.zzjo zzaan;
    private java.util.Iterator<java.lang.String> zzabj;

    zzjq(com.google.android.gms.internal.vision.zzjo zzjoVar) {
        this.zzaan = zzjoVar;
        this.zzabj = zzjoVar.zzaao.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzabj.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zzabj.next();
    }
}
