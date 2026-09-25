package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzct<K> implements java.util.Map.Entry<K, java.lang.Object> {
    private java.util.Map.Entry<K, com.google.android.gms.internal.clearcut.zzcr> zzll;

    private zzct(java.util.Map.Entry<K, com.google.android.gms.internal.clearcut.zzcr> entry) {
        this.zzll = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzll.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.zzll.getValue() == null) {
            return null;
        }
        return com.google.android.gms.internal.clearcut.zzcr.zzbr();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.clearcut.zzdo) {
            return this.zzll.getValue().zzi((com.google.android.gms.internal.clearcut.zzdo) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final com.google.android.gms.internal.clearcut.zzcr zzbs() {
        return this.zzll.getValue();
    }
}
