package com.google.android.play.core.missingsplits;

/* JADX INFO: loaded from: classes2.dex */
final class a {
    private static final com.google.android.play.core.splitcompat.a a = new com.google.android.play.core.splitcompat.a("MissingSplitsAppComponentsHelper");
    private final android.content.Context b;
    private final android.content.pm.PackageManager c;

    a(android.content.Context context, android.content.pm.PackageManager packageManager) {
        this.b = context;
        this.c = packageManager;
    }

    private final void a(java.util.List<android.content.pm.ComponentInfo> list, int i) {
        for (android.content.pm.ComponentInfo componentInfo : list) {
            this.c.setComponentEnabledSetting(new android.content.ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    private final java.util.List<android.content.pm.ComponentInfo> d() {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.PackageInfo packageInfo = this.c.getPackageInfo(this.b.getPackageName(), 526);
            if (packageInfo.providers != null) {
                java.util.Collections.addAll(arrayList, packageInfo.providers);
            }
            if (packageInfo.receivers != null) {
                java.util.Collections.addAll(arrayList, packageInfo.receivers);
            }
            if (packageInfo.services != null) {
                java.util.Collections.addAll(arrayList, packageInfo.services);
            }
            return arrayList;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            a.c("Failed to resolve own package : %s", e);
            return java.util.Collections.emptyList();
        }
    }

    final boolean a() {
        for (android.content.pm.ComponentInfo componentInfo : d()) {
            if (this.c.getComponentEnabledSetting(new android.content.ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                a.b("Not all non-activity components are disabled", new java.lang.Object[0]);
                return false;
            }
        }
        a.b("All non-activity components are disabled", new java.lang.Object[0]);
        return true;
    }

    final void b() {
        a.a("Disabling all non-activity components", new java.lang.Object[0]);
        a(d(), 2);
    }

    final void c() {
        a.a("Resetting enabled state of all non-activity components", new java.lang.Object[0]);
        a(d(), 0);
    }
}
