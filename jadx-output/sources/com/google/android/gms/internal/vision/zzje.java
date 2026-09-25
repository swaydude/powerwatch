package com.google.android.gms.internal.vision;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzje<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ com.google.android.gms.internal.vision.zziw zzaab;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzaac;
    private boolean zzaag;

    private zzje(com.google.android.gms.internal.vision.zziw zziwVar) {
        this.zzaab = zziwVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos + 1 < this.zzaab.zzzw.size() || (!this.zzaab.zzzx.isEmpty() && zzic().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzaag) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzaag = false;
        this.zzaab.zzia();
        if (this.pos < this.zzaab.zzzw.size()) {
            com.google.android.gms.internal.vision.zziw zziwVar = this.zzaab;
            int i = this.pos;
            this.pos = i - 1;
            zziwVar.zzbv(i);
            return;
        }
        zzic().remove();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzic() {
        if (this.zzaac == null) {
            this.zzaac = this.zzaab.zzzx.entrySet().iterator();
        }
        return this.zzaac;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.zzaag = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.zzaab.zzzw.size()) {
            return zzic().next();
        }
        return (java.util.Map.Entry) this.zzaab.zzzw.get(this.pos);
    }

    /* synthetic */ zzje(com.google.android.gms.internal.vision.zziw zziwVar, com.google.android.gms.internal.vision.zziv zzivVar) {
        this(zziwVar);
    }
}
