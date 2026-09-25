package com.google.android.gms.internal.clearcut;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
final class zzek<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzor;
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzei zzos;

    private zzek(com.google.android.gms.internal.clearcut.zzei zzeiVar) {
        this.zzos = zzeiVar;
        this.pos = zzeiVar.zzom.size();
    }

    /* synthetic */ zzek(com.google.android.gms.internal.clearcut.zzei zzeiVar, com.google.android.gms.internal.clearcut.zzej zzejVar) {
        this(zzeiVar);
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzdw() {
        if (this.zzor == null) {
            this.zzor = this.zzos.zzop.entrySet().iterator();
        }
        return this.zzor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzos.zzom.size()) || zzdw().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, V> next;
        if (zzdw().hasNext()) {
            next = zzdw().next();
        } else {
            java.util.List list = this.zzos.zzom;
            int i = this.pos - 1;
            this.pos = i;
            next = (java.util.Map.Entry<K, V>) list.get(i);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
