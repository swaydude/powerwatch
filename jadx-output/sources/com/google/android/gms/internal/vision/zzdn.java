package com.google.android.gms.internal.vision;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdn<K, V> extends com.google.android.gms.internal.vision.zzdf<java.util.Map.Entry<K, V>> {
    private final /* synthetic */ com.google.android.gms.internal.vision.zzdk zzmb;

    zzdn(com.google.android.gms.internal.vision.zzdk zzdkVar) {
        this.zzmb = zzdkVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzmb.size;
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        com.google.android.gms.internal.vision.zzct.zzc(i, this.zzmb.size);
        int i2 = i * 2;
        return new java.util.AbstractMap.SimpleImmutableEntry(this.zzmb.zzlx[i2], this.zzmb.zzlx[i2 + 1]);
    }
}
