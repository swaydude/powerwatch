package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> a = new java.util.HashMap();

    public final com.google.android.play.core.splitinstall.f a() {
        java.util.HashMap map = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> entry : this.a.entrySet()) {
            map.put(entry.getKey(), java.util.Collections.unmodifiableMap(new java.util.HashMap(entry.getValue())));
        }
        return new com.google.android.play.core.splitinstall.f(java.util.Collections.unmodifiableMap(map), (byte) 0);
    }

    public final com.google.android.play.core.splitinstall.h a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!this.a.containsKey(str2)) {
            this.a.put(str2, new java.util.HashMap());
        }
        this.a.get(str2).put(str, str3);
        return this;
    }
}
