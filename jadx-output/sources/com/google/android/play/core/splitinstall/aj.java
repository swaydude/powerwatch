package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class aj {
    private final android.content.Context a;

    aj(android.content.Context context) {
        this.a = context;
    }

    private final android.content.SharedPreferences b() {
        return this.a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    final synchronized java.util.Set<java.lang.String> a() {
        try {
            java.util.Set<java.lang.String> stringSet = b().getStringSet("deferred_uninstall_module_list", new java.util.HashSet());
            if (stringSet != null) {
                return stringSet;
            }
            return new java.util.HashSet();
        } catch (java.lang.Exception unused) {
            return new java.util.HashSet();
        }
        throw th;
    }

    final synchronized void a(java.util.Collection<java.lang.String> collection) {
        java.util.Set<java.lang.String> setA = a();
        boolean z = false;
        java.util.Iterator<java.lang.String> it = collection.iterator();
        while (it.hasNext()) {
            if (setA.add(it.next())) {
                z = true;
            }
        }
        if (z) {
            try {
                b().edit().putStringSet("deferred_uninstall_module_list", setA).apply();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
