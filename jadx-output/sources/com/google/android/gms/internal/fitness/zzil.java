package com.google.android.gms.internal.fitness;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzil<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>> {
    private int pos;
    private java.util.Iterator<java.util.Map.Entry<K, V>> zzyu;
    private final /* synthetic */ com.google.android.gms.internal.fitness.zzid zzyv;
    private boolean zzyy;

    private zzil(com.google.android.gms.internal.fitness.zzid zzidVar) {
        this.zzyv = zzidVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos + 1 < this.zzyv.zzyl.size() || (!this.zzyv.zzym.isEmpty() && zzda().hasNext());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzyy) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzyy = false;
        this.zzyv.zzct();
        if (this.pos < this.zzyv.zzyl.size()) {
            com.google.android.gms.internal.fitness.zzid zzidVar = this.zzyv;
            int i = this.pos;
            this.pos = i - 1;
            zzidVar.zzak(i);
            return;
        }
        zzda().remove();
    }

    private final java.util.Iterator<java.util.Map.Entry<K, V>> zzda() {
        if (this.zzyu == null) {
            this.zzyu = this.zzyv.zzym.entrySet().iterator();
        }
        return this.zzyu;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.zzyy = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i >= this.zzyv.zzyl.size()) {
            return zzda().next();
        }
        return (java.util.Map.Entry) this.zzyv.zzyl.get(this.pos);
    }

    /* synthetic */ zzil(com.google.android.gms.internal.fitness.zzid zzidVar, com.google.android.gms.internal.fitness.zzig zzigVar) {
        this(zzidVar);
    }
}
