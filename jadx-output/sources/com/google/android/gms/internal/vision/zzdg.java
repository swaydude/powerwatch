package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzdg<K, V> implements java.io.Serializable, java.util.Map<K, V> {
    private static final java.util.Map.Entry<?, ?>[] zzlo = new java.util.Map.Entry[0];
    private transient com.google.android.gms.internal.vision.zzdj<java.util.Map.Entry<K, V>> zzlp;
    private transient com.google.android.gms.internal.vision.zzdj<K> zzlq;
    private transient com.google.android.gms.internal.vision.zzdc<V> zzlr;

    public static <K, V> com.google.android.gms.internal.vision.zzdg<K, V> zza(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        com.google.android.gms.internal.vision.zzda.zza(k, v);
        com.google.android.gms.internal.vision.zzda.zza(k2, v2);
        com.google.android.gms.internal.vision.zzda.zza(k3, v3);
        com.google.android.gms.internal.vision.zzda.zza(k4, v4);
        return com.google.android.gms.internal.vision.zzdl.zza(4, new java.lang.Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    @Override // java.util.Map
    public abstract V get(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj);

    abstract com.google.android.gms.internal.vision.zzdj<java.util.Map.Entry<K, V>> zzce();

    abstract com.google.android.gms.internal.vision.zzdj<K> zzcf();

    abstract com.google.android.gms.internal.vision.zzdc<V> zzcg();

    zzdg() {
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return ((com.google.android.gms.internal.vision.zzdc) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj, @org.checkerframework.checker.nullness.compatqual.NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return com.google.android.gms.internal.vision.zzdo.zza((com.google.android.gms.internal.vision.zzdj) entrySet());
    }

    public java.lang.String toString() {
        int size = size();
        if (size < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder((int) java.lang.Math.min(((long) size) << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ java.util.Set entrySet() {
        com.google.android.gms.internal.vision.zzdj<java.util.Map.Entry<K, V>> zzdjVar = this.zzlp;
        if (zzdjVar != null) {
            return zzdjVar;
        }
        com.google.android.gms.internal.vision.zzdj<java.util.Map.Entry<K, V>> zzdjVarZzce = zzce();
        this.zzlp = zzdjVarZzce;
        return zzdjVarZzce;
    }

    @Override // java.util.Map
    public /* synthetic */ java.util.Collection values() {
        com.google.android.gms.internal.vision.zzdc<V> zzdcVar = this.zzlr;
        if (zzdcVar != null) {
            return zzdcVar;
        }
        com.google.android.gms.internal.vision.zzdc<V> zzdcVarZzcg = zzcg();
        this.zzlr = zzdcVarZzcg;
        return zzdcVarZzcg;
    }

    @Override // java.util.Map
    public /* synthetic */ java.util.Set keySet() {
        com.google.android.gms.internal.vision.zzdj<K> zzdjVar = this.zzlq;
        if (zzdjVar != null) {
            return zzdjVar;
        }
        com.google.android.gms.internal.vision.zzdj<K> zzdjVarZzcf = zzcf();
        this.zzlq = zzdjVarZzcf;
        return zzdjVarZzcf;
    }
}
