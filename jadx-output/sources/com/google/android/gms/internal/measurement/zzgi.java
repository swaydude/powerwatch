package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgi<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.measurement.zzgi zzb;
    private boolean zza;

    private zzgi() {
        this.zza = true;
    }

    private zzgi(java.util.Map<K, V> map) {
        super(map);
        this.zza = true;
    }

    public static <K, V> com.google.android.gms.internal.measurement.zzgi<K, V> zza() {
        return zzb;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzgi<K, V> zzgiVar) {
        zze();
        if (zzgiVar.isEmpty()) {
            return;
        }
        putAll(zzgiVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zze();
        com.google.android.gms.internal.measurement.zzff.zza(k);
        com.google.android.gms.internal.measurement.zzff.zza(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        zze();
        for (K k : map.keySet()) {
            com.google.android.gms.internal.measurement.zzff.zza(k);
            com.google.android.gms.internal.measurement.zzff.zza(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zze();
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

    private static int zza(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.measurement.zzff.zzc((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzfi) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZza = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            iZza += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return iZza;
    }

    public final com.google.android.gms.internal.measurement.zzgi<K, V> zzb() {
        return isEmpty() ? new com.google.android.gms.internal.measurement.zzgi<>() : new com.google.android.gms.internal.measurement.zzgi<>(this);
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    private final void zze() {
        if (!this.zza) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.android.gms.internal.measurement.zzgi zzgiVar = new com.google.android.gms.internal.measurement.zzgi();
        zzb = zzgiVar;
        zzgiVar.zza = false;
    }
}
