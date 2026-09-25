package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzdi<K, V> extends java.util.LinkedHashMap<K, V> {
    private static final com.google.android.gms.internal.clearcut.zzdi zzme;
    private boolean zzfa;

    static {
        com.google.android.gms.internal.clearcut.zzdi zzdiVar = new com.google.android.gms.internal.clearcut.zzdi();
        zzme = zzdiVar;
        zzdiVar.zzfa = false;
    }

    private zzdi() {
        this.zzfa = true;
    }

    private zzdi(java.util.Map<K, V> map) {
        super(map);
        this.zzfa = true;
    }

    public static <K, V> com.google.android.gms.internal.clearcut.zzdi<K, V> zzbz() {
        return zzme;
    }

    private final void zzcb() {
        if (!this.zzfa) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private static int zzf(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return com.google.android.gms.internal.clearcut.zzci.hashCode((byte[]) obj);
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzcj) {
            throw new java.lang.UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzcb();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        boolean z;
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
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzf = 0;
        for (java.util.Map.Entry<K, V> entry : entrySet()) {
            iZzf += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return iZzf;
    }

    public final boolean isMutable() {
        return this.zzfa;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        zzcb();
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(k);
        com.google.android.gms.internal.clearcut.zzci.checkNotNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        zzcb();
        for (K k : map.keySet()) {
            com.google.android.gms.internal.clearcut.zzci.checkNotNull(k);
            com.google.android.gms.internal.clearcut.zzci.checkNotNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        zzcb();
        return (V) super.remove(obj);
    }

    public final void zza(com.google.android.gms.internal.clearcut.zzdi<K, V> zzdiVar) {
        zzcb();
        if (zzdiVar.isEmpty()) {
            return;
        }
        putAll(zzdiVar);
    }

    public final com.google.android.gms.internal.clearcut.zzdi<K, V> zzca() {
        return isEmpty() ? new com.google.android.gms.internal.clearcut.zzdi<>() : new com.google.android.gms.internal.clearcut.zzdi<>(this);
    }

    public final void zzv() {
        this.zzfa = false;
    }
}
