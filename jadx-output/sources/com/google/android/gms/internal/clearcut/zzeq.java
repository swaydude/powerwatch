package com.google.android.gms.internal.clearcut;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
final class zzeq<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzor;
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzei zzos;
    private boolean zzow;

    private zzeq(com.google.android.gms.internal.clearcut.zzei zzeiVar) {
        this.zzos = zzeiVar;
        this.pos = -1;
    }

    /* synthetic */ zzeq(com.google.android.gms.internal.clearcut.zzei zzeiVar, com.google.android.gms.internal.clearcut.zzej zzejVar) {
        this(zzeiVar);
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzdw() {
        if (this.zzor == null) {
            this.zzor = this.zzos.zzon.entrySet().iterator();
        }
        return this.zzor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos + 1 < this.zzos.zzom.size() || (!this.zzos.zzon.isEmpty() && zzdw().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.zzow = true;
        int i = this.pos + 1;
        this.pos = i;
        return i < this.zzos.zzom.size() ? (java.util.Map.Entry<K, V>) this.zzos.zzom.get(this.pos) : zzdw().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzow) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzow = false;
        this.zzos.zzdu();
        if (this.pos >= this.zzos.zzom.size()) {
            zzdw().remove();
            return;
        }
        com.google.android.gms.internal.clearcut.zzei zzeiVar = this.zzos;
        int i = this.pos;
        this.pos = i - 1;
        zzeiVar.zzal(i);
    }
}
