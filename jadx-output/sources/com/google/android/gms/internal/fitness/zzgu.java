package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgu<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zzwv;

    public zzgu(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.zzwv = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzwv.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzwv.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.zzwv.next();
        return next.getValue() instanceof com.google.android.gms.internal.fitness.zzgp ? new com.google.android.gms.internal.fitness.zzgr(next) : next;
    }
}
