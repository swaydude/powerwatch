package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> a;

    private f(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map) {
        this.a = map;
    }

    /* synthetic */ f(java.util.Map map, byte b) {
        this(map);
    }

    public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> a(java.util.Collection<java.lang.String> collection) {
        java.util.Set setUnmodifiableSet;
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : this.a.keySet()) {
            if (this.a.containsKey(str)) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                setUnmodifiableSet = java.util.Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = java.util.Collections.emptySet();
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
