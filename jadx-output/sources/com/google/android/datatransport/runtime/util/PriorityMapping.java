package com.google.android.datatransport.runtime.util;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class PriorityMapping {
    private static java.util.EnumMap<com.google.android.datatransport.Priority, java.lang.Integer> PRIORITY_INT_MAP;
    private static android.util.SparseArray<com.google.android.datatransport.Priority> PRIORITY_MAP = new android.util.SparseArray<>();

    static {
        java.util.EnumMap<com.google.android.datatransport.Priority, java.lang.Integer> enumMap = new java.util.EnumMap<>(com.google.android.datatransport.Priority.class);
        PRIORITY_INT_MAP = enumMap;
        enumMap.put(com.google.android.datatransport.Priority.DEFAULT, 0);
        PRIORITY_INT_MAP.put(com.google.android.datatransport.Priority.VERY_LOW, 1);
        PRIORITY_INT_MAP.put(com.google.android.datatransport.Priority.HIGHEST, 2);
        for (K k : PRIORITY_INT_MAP.keySet()) {
            PRIORITY_MAP.append(PRIORITY_INT_MAP.get(k).intValue(), k);
        }
    }

    public static com.google.android.datatransport.Priority valueOf(int i) {
        com.google.android.datatransport.Priority priority = PRIORITY_MAP.get(i);
        if (priority != null) {
            return priority;
        }
        throw new java.lang.IllegalArgumentException("Unknown Priority for value " + i);
    }

    public static int toInt(com.google.android.datatransport.Priority priority) {
        java.lang.Integer num = PRIORITY_INT_MAP.get(priority);
        if (num == null) {
            throw new java.lang.IllegalStateException("PriorityMapping is missing known Priority value " + priority);
        }
        return num.intValue();
    }
}
