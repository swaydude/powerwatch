package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class DaggerCollections {
    private static final int MAX_POWER_OF_TWO = 1073741824;

    private static int calculateInitialCapacity(int expectedSize) {
        if (expectedSize < 3) {
            return expectedSize + 1;
        }
        if (expectedSize < 1073741824) {
            return (int) ((expectedSize / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    private DaggerCollections() {
    }

    public static <T> java.util.List<T> presizedList(int size) {
        if (size == 0) {
            return java.util.Collections.emptyList();
        }
        return new java.util.ArrayList(size);
    }

    public static boolean hasDuplicates(java.util.List<?> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new java.util.HashSet(list).size();
    }

    static <T> java.util.HashSet<T> newHashSetWithExpectedSize(int expectedSize) {
        return new java.util.HashSet<>(calculateInitialCapacity(expectedSize));
    }

    static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int expectedSize) {
        return new java.util.LinkedHashMap<>(calculateInitialCapacity(expectedSize));
    }
}
