package com.google.android.gms.internal.fitness;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzif<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzyu;
    private final /* synthetic */ com.google.android.gms.internal.fitness.zzid zzyv;

    private zzif(com.google.android.gms.internal.fitness.zzid zzidVar) {
        this.zzyv = zzidVar;
        this.pos = zzidVar.zzyl.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzyv.zzyl.size()) || zzda().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzda() {
        if (this.zzyu == null) {
            this.zzyu = this.zzyv.zzyo.entrySet().iterator();
        }
        return this.zzyu;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        if (zzda().hasNext()) {
            return zzda().next();
        }
        java.util.List list = this.zzyv.zzyl;
        int i = this.pos - 1;
        this.pos = i;
        return (java.util.Map.Entry) list.get(i);
    }

    /* synthetic */ zzif(com.google.android.gms.internal.fitness.zzid zzidVar, com.google.android.gms.internal.fitness.zzig zzigVar) {
        this(zzidVar);
    }
}
