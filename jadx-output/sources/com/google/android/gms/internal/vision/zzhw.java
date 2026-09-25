package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhw<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.vision.zzhw zzyp;
    private boolean zzrj;

    private zzhw() {
        this.zzrj = true;
    }

    private zzhw(java.util.Map<K, V> map) {
        super(map);
        this.zzrj = true;
    }

    public static <K, V> com.google.android.gms.internal.vision.zzhw<K, V> zzhc() {
        return zzyp;
    }

    public final void zza(com.google.android.gms.internal.vision.zzhw<K, V> zzhwVar) {
        zzhe();
        if (zzhwVar.isEmpty()) {
            return;
        }
        putAll(zzhwVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzhe();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzhe();
        com.google.android.gms.internal.vision.zzgt.checkNotNull(k);
        com.google.android.gms.internal.vision.zzgt.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        zzhe();
        for (K k : map.keySet()) {
            com.google.android.gms.internal.vision.zzgt.checkNotNull(k);
            com.google.android.gms.internal.vision.zzgt.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zzhe();
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

    private static int zzq(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.vision.zzgt.hashCode((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.vision.zzgw) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzq = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            iZzq += zzq(entry.getValue()) ^ zzq(entry.getKey());
        }
        return iZzq;
    }

    public final com.google.android.gms.internal.vision.zzhw<K, V> zzhd() {
        return isEmpty() ? new com.google.android.gms.internal.vision.zzhw<>() : new com.google.android.gms.internal.vision.zzhw<>(this);
    }

    public final void zzdp() {
        this.zzrj = false;
    }

    public final boolean isMutable() {
        return this.zzrj;
    }

    private final void zzhe() {
        if (!this.zzrj) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.android.gms.internal.vision.zzhw zzhwVar = new com.google.android.gms.internal.vision.zzhw();
        zzyp = zzhwVar;
        zzhwVar.zzrj = false;
    }
}
