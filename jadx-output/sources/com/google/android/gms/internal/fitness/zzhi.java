package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhi<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.fitness.zzhi zzxj;
    private boolean zzrc;

    private zzhi() {
        this.zzrc = true;
    }

    private zzhi(java.util.Map<K, V> map) {
        super(map);
        this.zzrc = true;
    }

    public final void zza(com.google.android.gms.internal.fitness.zzhi<K, V> zzhiVar) {
        zzcd();
        if (zzhiVar.isEmpty()) {
            return;
        }
        putAll(zzhiVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzcd();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzcd();
        com.google.android.gms.internal.fitness.zzgk.checkNotNull(k);
        com.google.android.gms.internal.fitness.zzgk.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        zzcd();
        for (K k : map.keySet()) {
            com.google.android.gms.internal.fitness.zzgk.checkNotNull(k);
            com.google.android.gms.internal.fitness.zzgk.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zzcd();
        return (V) super.remove(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean zEquals;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this == map) {
                z = true;
            } else {
                if (size() == map.size()) {
                    java.util.Iterator<java.util.Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.util.Map.Entry<K, V> next = it.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                java.lang.Object obj2 = map.get(next.getKey());
                                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                    zEquals = java.util.Arrays.equals((byte[]) value, (byte[]) obj2);
                                } else {
                                    zEquals = value.equals(obj2);
                                }
                                if (!zEquals) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static int zzi(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.fitness.zzgk.hashCode((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.fitness.zzgj) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzi = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            iZzi += zzi(entry.getValue()) ^ zzi(entry.getKey());
        }
        return iZzi;
    }

    public final com.google.android.gms.internal.fitness.zzhi<K, V> zzcc() {
        return isEmpty() ? new com.google.android.gms.internal.fitness.zzhi<>() : new com.google.android.gms.internal.fitness.zzhi<>(this);
    }

    public final void zzal() {
        this.zzrc = false;
    }

    public final boolean isMutable() {
        return this.zzrc;
    }

    private final void zzcd() {
        if (!this.zzrc) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.android.gms.internal.fitness.zzhi zzhiVar = new com.google.android.gms.internal.fitness.zzhi();
        zzxj = zzhiVar;
        zzhiVar.zzrc = false;
    }
}
