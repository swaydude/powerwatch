package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private static final com.google.android.play.core.splitcompat.a a = new com.google.android.play.core.splitcompat.a("SplitInstallInfoProvider");
    private final android.content.Context b;
    private final java.lang.String c;
    private com.google.android.play.core.splitinstall.k d = null;
    private com.google.android.play.core.splitinstall.f e = null;

    public l(android.content.Context context, java.lang.String str) {
        this.b = context;
        this.c = str;
    }

    public static boolean a(java.lang.String str) {
        return str.startsWith("config.");
    }

    public static boolean b(java.lang.String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static java.lang.String c(java.lang.String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    private final java.util.Set<java.lang.String> d() {
        java.util.HashSet hashSet = new java.util.HashSet();
        android.os.Bundle bundleF = f();
        if (bundleF != null) {
            java.lang.String string = bundleF.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                a.b("App has no fused modules.", new java.lang.Object[0]);
            } else {
                java.util.Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
            }
        }
        if (android.os.Build.VERSION.SDK_INT < 21) {
            return hashSet;
        }
        java.lang.String[] strArrE = e();
        if (strArrE != null) {
            a.b("Adding splits from package manager: %s", java.util.Arrays.toString(strArrE));
            java.util.Collections.addAll(hashSet, strArrE);
        } else {
            a.b("No splits are found or app cannot be found in package manager.", new java.lang.Object[0]);
        }
        com.google.android.play.core.splitinstall.k kVarA = com.google.android.play.core.splitinstall.i.a();
        if (kVarA != null) {
            hashSet.addAll(kVarA.a());
        }
        return hashSet;
    }

    private final java.lang.String[] e() {
        try {
            android.content.pm.PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.c, 0);
            if (packageInfo != null) {
                return packageInfo.splitNames;
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            a.c("App is not found in PackageManager", new java.lang.Object[0]);
            return null;
        }
    }

    private final android.os.Bundle f() {
        try {
            android.content.pm.ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.c, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            a.b("App has no applicationInfo or metaData", new java.lang.Object[0]);
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            a.c("App is not found in PackageManager", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.util.Set<java.lang.String> a() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : d()) {
            if (!b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    final java.util.Set<java.lang.String> b() {
        com.google.android.play.core.splitinstall.f fVarC = c();
        if (fVarC == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<java.lang.String> setD = d();
        setD.add("");
        java.util.Set<java.lang.String> setA = a();
        setA.add("");
        for (java.util.Map.Entry<java.lang.String, java.util.Set<java.lang.String>> entry : fVarC.a(setA).entrySet()) {
            if (setD.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public final com.google.android.play.core.splitinstall.f c() {
        android.os.Bundle bundleF = f();
        if (bundleF == null) {
            return null;
        }
        int i = bundleF.getInt("com.android.vending.splits");
        if (i == 0) {
            a.c("No metadata found in AndroidManifest.", new java.lang.Object[0]);
            return null;
        }
        try {
            com.google.android.play.core.splitinstall.f fVarA = new com.google.android.play.core.splitinstall.ak(this.b.getResources().getXml(i)).a();
            if (fVarA == null) {
                a.c("Can't parse languages metadata.", new java.lang.Object[0]);
            }
            return fVarA;
        } catch (android.content.res.Resources.NotFoundException unused) {
            a.c("Resource with languages metadata doesn't exist.", new java.lang.Object[0]);
            return null;
        }
    }
}
