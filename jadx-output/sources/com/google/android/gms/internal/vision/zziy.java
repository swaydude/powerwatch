package com.google.android.gms.internal.vision;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zziy<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ com.google.android.gms.internal.vision.zziw zzaab;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzaac;

    private zziy(com.google.android.gms.internal.vision.zziw zziwVar) {
        this.zzaab = zziwVar;
        this.pos = zziwVar.zzzw.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzaab.zzzw.size()) || zzic().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzic() {
        if (this.zzaac == null) {
            this.zzaac = this.zzaab.zzzz.entrySet().iterator();
        }
        return this.zzaac;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (zzic().hasNext()) {
            return zzic().next();
        }
        java.util.List list = this.zzaab.zzzw;
        int i = this.pos - 1;
        this.pos = i;
        return (java.util.Map.Entry) list.get(i);
    }

    /* synthetic */ zziy(com.google.android.gms.internal.vision.zziw zziwVar, com.google.android.gms.internal.vision.zziv zzivVar) {
        this(zziwVar);
    }
}
