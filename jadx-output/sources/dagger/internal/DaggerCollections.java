package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DaggerCollections {
    private static final int MAX_POWER_OF_TWO = 1073741824;

    private static int calculateInitialCapacity(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    private DaggerCollections() {
    }

    public static <T> java.util.List<T> presizedList(int i) {
        if (i == 0) {
            return java.util.Collections.emptyList();
        }
        return new java.util.ArrayList(i);
    }

    public static boolean hasDuplicates(java.util.List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new java.util.HashSet(list).size();
    }

    static <T> java.util.HashSet<T> newHashSetWithExpectedSize(int i) {
        return new java.util.HashSet<>(calculateInitialCapacity(i));
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new java.util.LinkedHashMap<>(calculateInitialCapacity(i));
    }
}
