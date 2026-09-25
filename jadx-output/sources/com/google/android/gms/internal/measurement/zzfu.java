package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfu<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zza;

    public zzfu(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.zza.next();
        return next.getValue() instanceof com.google.android.gms.internal.measurement.zzfp ? new com.google.android.gms.internal.measurement.zzfr(next) : next;
    }
}
