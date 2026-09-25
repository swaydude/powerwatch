package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzfr<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.measurement.zzfp> zza;

    private zzfr(java.util.Map.Entry<K, com.google.android.gms.internal.measurement.zzfp> entry) {
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return com.google.android.gms.internal.measurement.zzfp.zza();
    }

    public final com.google.android.gms.internal.measurement.zzfp zza() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzgo)) {
            throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zza.getValue().zza((com.google.android.gms.internal.measurement.zzgo) obj);
    }
}
