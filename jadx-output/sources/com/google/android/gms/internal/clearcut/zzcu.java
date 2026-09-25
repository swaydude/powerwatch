package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzcu<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zzlm;

    public zzcu(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.zzlm = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzlm.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.zzlm.next();
        return next.getValue() instanceof com.google.android.gms.internal.clearcut.zzcr ? new com.google.android.gms.internal.clearcut.zzct(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzlm.remove();
    }
}
