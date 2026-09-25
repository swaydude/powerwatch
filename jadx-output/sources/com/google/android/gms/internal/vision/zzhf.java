package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzhf<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.vision.zzhd> zzxw;

    private zzhf(java.util.Map.Entry<K, com.google.android.gms.internal.vision.zzhd> entry) {
        this.zzxw = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzxw.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.zzxw.getValue() == null) {
            return null;
        }
        return com.google.android.gms.internal.vision.zzhd.zzgu();
    }

    public final com.google.android.gms.internal.vision.zzhd zzgw() {
        return this.zzxw.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.vision.zzic)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zzxw.getValue().zzi((com.google.android.gms.internal.vision.zzic) obj);
    }
}
