package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgr<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.fitness.zzgp> zzwr;

    private zzgr(java.util.Map.Entry<K, com.google.android.gms.internal.fitness.zzgp> entry) {
        this.zzwr = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzwr.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.zzwr.getValue() == null) {
            return null;
        }
        return com.google.android.gms.internal.fitness.zzgp.zzbu();
    }

    public final com.google.android.gms.internal.fitness.zzgp zzbw() {
        return this.zzwr.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzho)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zzwr.getValue().zzh((com.google.android.gms.internal.fitness.zzho) obj);
    }
}
