package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhi<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zzya;

    public zzhi(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.zzya = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzya.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzya.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.zzya.next();
        return next.getValue() instanceof com.google.android.gms.internal.vision.zzhd ? new com.google.android.gms.internal.vision.zzhf(next) : next;
    }
}
