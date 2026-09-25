package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(java.util.Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf() {
        return java.util.Collections.emptyList();
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T t) {
        return java.util.Collections.singletonList(t);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return listOf();
        }
        if (length == 1) {
            return listOf(tArr[0]);
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(tArr));
    }

    private static <T> java.util.Set<T> zza(int i, boolean z) {
        float f = z ? 0.75f : 1.0f;
        if (i <= (z ? 128 : 256)) {
            return new androidx.collection.ArraySet(i);
        }
        return new java.util.HashSet(i, f);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T t, T t2, T t3) {
        java.util.Set setZza = zza(3, false);
        setZza.add(t);
        setZza.add(t2);
        setZza.add(t3);
        return java.util.Collections.unmodifiableSet(setZza);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptySet();
        }
        if (length == 1) {
            return java.util.Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            java.util.Set setZza = zza(2, false);
            setZza.add(t);
            setZza.add(t2);
            return java.util.Collections.unmodifiableSet(setZza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length == 4) {
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            java.util.Set setZza2 = zza(4, false);
            setZza2.add(t3);
            setZza2.add(t4);
            setZza2.add(t5);
            setZza2.add(t6);
            return java.util.Collections.unmodifiableSet(setZza2);
        }
        java.util.Set setZza3 = zza(tArr.length, false);
        java.util.Collections.addAll(setZza3, tArr);
        return java.util.Collections.unmodifiableSet(setZza3);
    }

    public static <T> java.util.Set<T> mutableSetOfWithSize(int i) {
        if (i == 0) {
            return new androidx.collection.ArraySet();
        }
        return zza(i, true);
    }

    private static <K, V> java.util.Map<K, V> zzb(int i, boolean z) {
        if (i <= 256) {
            return new androidx.collection.ArrayMap(i);
        }
        return new java.util.HashMap(i, 1.0f);
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3) {
        java.util.Map mapZzb = zzb(3, false);
        mapZzb.put(k, v);
        mapZzb.put(k2, v2);
        mapZzb.put(k3, v3);
        return java.util.Collections.unmodifiableMap(mapZzb);
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        java.util.Map mapZzb = zzb(6, false);
        mapZzb.put(k, v);
        mapZzb.put(k2, v2);
        mapZzb.put(k3, v3);
        mapZzb.put(k4, v4);
        mapZzb.put(k5, v5);
        mapZzb.put(k6, v6);
        return java.util.Collections.unmodifiableMap(mapZzb);
    }

    public static <K, V> java.util.Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            int length2 = vArr.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(66);
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int length3 = kArr.length;
        if (length3 == 0) {
            return java.util.Collections.emptyMap();
        }
        if (length3 == 1) {
            return java.util.Collections.singletonMap(kArr[0], vArr[0]);
        }
        java.util.Map mapZzb = zzb(kArr.length, false);
        for (int i = 0; i < kArr.length; i++) {
            mapZzb.put(kArr[i], vArr[i]);
        }
        return java.util.Collections.unmodifiableMap(mapZzb);
    }
}
