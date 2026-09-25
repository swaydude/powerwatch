package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
public class SplitCompat {
    private static final java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitcompat.SplitCompat> a = new java.util.concurrent.atomic.AtomicReference<>(null);
    private final com.google.android.play.core.splitcompat.c b;
    private final java.util.Set<java.lang.String> c = new java.util.HashSet();

    private SplitCompat(android.content.Context context) {
        try {
            this.b = new com.google.android.play.core.splitcompat.c(context);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException e) {
            throw new com.google.android.play.core.internal.aa("Failed to initialize FileStorage", e);
        }
    }

    private static void a(android.content.Context context, java.util.Set<java.io.File> set) {
        android.content.res.AssetManager assets = context.getAssets();
        java.util.Iterator<java.io.File> it = set.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Integer) com.google.android.play.core.internal.ba.a(assets, "addAssetPath", java.lang.Integer.class, (java.lang.Class<java.lang.String>) java.lang.String.class, it.next().getPath())).intValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
            sb.append("addAssetPath completed with ");
            sb.append(iIntValue);
            android.util.Log.d("SplitCompat", sb.toString());
        }
    }

    public static boolean a() {
        return a.get() != null;
    }

    public static boolean a(android.content.Context context) {
        return a(context, true);
    }

    private static boolean a(android.content.Context context, boolean z) {
        if (b()) {
            return false;
        }
        java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitcompat.SplitCompat> atomicReference = a;
        boolean zCompareAndSet = atomicReference.compareAndSet(null, new com.google.android.play.core.splitcompat.SplitCompat(context));
        com.google.android.play.core.splitcompat.SplitCompat splitCompat = atomicReference.get();
        if (zCompareAndSet) {
            com.google.android.play.core.splitinstall.g.a(new com.google.android.play.core.internal.ac(context, com.google.android.play.core.splitcompat.a.a(), new com.google.android.play.core.internal.ba(context, splitCompat.b, new com.google.android.play.core.internal.ag()), splitCompat.b, new com.google.android.play.core.splitinstall.j()));
            com.google.android.play.core.splitinstall.i.a(new com.google.android.play.core.splitcompat.m(splitCompat));
            com.google.android.play.core.splitcompat.a.a().execute(new com.google.android.play.core.splitcompat.o(context));
        }
        try {
            splitCompat.b(context, z);
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    private static boolean a(com.google.android.play.core.splitcompat.q qVar) throws java.io.IOException {
        java.util.zip.ZipFile zipFile = null;
        try {
            java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(qVar.a());
            try {
                boolean z = zipFile2.getEntry("classes.dex") != null;
                zipFile2.close();
                return z;
            } catch (java.io.IOException e) {
                e = e;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (java.io.IOException e2) {
                        com.google.android.play.core.internal.bj.a(e, e2);
                    }
                }
                throw e;
            }
        } catch (java.io.IOException e3) {
            e = e3;
        }
    }

    private final synchronized void b(android.content.Context context) throws java.io.IOException {
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.android.play.core.splitcompat.SplitCompat splitCompat = a.get();
        java.util.Iterator<java.lang.String> it = (splitCompat == null ? java.util.Collections.emptySet() : splitCompat.c()).iterator();
        while (it.hasNext()) {
            hashSet.add(this.b.b(it.next()));
        }
        a(context, hashSet);
    }

    private final synchronized void b(android.content.Context context, boolean z) throws java.io.IOException {
        try {
            if (z) {
                this.b.a();
            } else {
                com.google.android.play.core.splitcompat.a.a().execute(new com.google.android.play.core.splitcompat.n(this));
            }
            java.util.List<java.lang.String> listC = c(context);
            java.util.Set<com.google.android.play.core.splitcompat.q> setD = this.b.d();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<com.google.android.play.core.splitcompat.q> it = setD.iterator();
            while (it.hasNext()) {
                java.lang.String strB = it.next().b();
                if (listC.contains(strB)) {
                    if (z) {
                        this.b.f(strB);
                    } else {
                        hashSet.add(strB);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                com.google.android.play.core.splitcompat.a.a().execute(new com.google.android.play.core.splitcompat.p(this, hashSet));
            }
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator<com.google.android.play.core.splitcompat.q> it2 = setD.iterator();
            while (it2.hasNext()) {
                java.lang.String strB2 = it2.next().b();
                if (!com.google.android.play.core.splitinstall.l.b(strB2)) {
                    hashSet2.add(strB2);
                }
            }
            for (java.lang.String str : listC) {
                if (!com.google.android.play.core.splitinstall.l.b(str)) {
                    hashSet2.add(str);
                }
            }
            java.util.HashSet<com.google.android.play.core.splitcompat.q> hashSet3 = new java.util.HashSet(setD.size());
            for (com.google.android.play.core.splitcompat.q qVar : setD) {
                if (com.google.android.play.core.splitinstall.l.a(qVar.b()) || hashSet2.contains(com.google.android.play.core.splitinstall.l.c(qVar.b()))) {
                    hashSet3.add(qVar);
                }
            }
            com.google.android.play.core.splitcompat.f fVar = new com.google.android.play.core.splitcompat.f(this.b);
            com.google.android.play.core.internal.ad adVarA = com.google.android.play.core.internal.ag.a();
            java.lang.ClassLoader classLoader = context.getClassLoader();
            if (z) {
                adVarA.a(classLoader, fVar.a());
            } else {
                java.util.Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    java.util.Set<java.io.File> setA = fVar.a((com.google.android.play.core.splitcompat.q) it3.next());
                    if (setA == null) {
                        it3.remove();
                    } else {
                        adVarA.a(classLoader, setA);
                    }
                }
            }
            java.util.HashSet hashSet4 = new java.util.HashSet();
            for (com.google.android.play.core.splitcompat.q qVar2 : hashSet3) {
                if (!a(qVar2) || adVarA.a(classLoader, this.b.c(qVar2.b()), qVar2.a(), z)) {
                    hashSet4.add(qVar2.a());
                } else {
                    java.lang.String strValueOf = java.lang.String.valueOf(qVar2.a());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 24);
                    sb.append("split was not installed ");
                    sb.append(strValueOf);
                    android.util.Log.w("SplitCompat", sb.toString());
                }
            }
            a(context, hashSet4);
            for (com.google.android.play.core.splitcompat.q qVar3 : hashSet3) {
                if (hashSet4.contains(qVar3.a())) {
                    java.lang.String strB3 = qVar3.b();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strB3).length() + 30);
                    sb2.append("Split '");
                    sb2.append(strB3);
                    sb2.append("' installation emulated");
                    android.util.Log.d("SplitCompat", sb2.toString());
                    this.c.add(qVar3.b());
                } else {
                    java.lang.String strB4 = qVar3.b();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strB4).length() + 35);
                    sb3.append("Split '");
                    sb3.append(strB4);
                    sb3.append("' installation not emulated.");
                    android.util.Log.d("SplitCompat", sb3.toString());
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    private static boolean b() {
        return android.os.Build.VERSION.SDK_INT < 21;
    }

    private static java.util.List<java.lang.String> c(android.content.Context context) throws java.io.IOException {
        java.lang.String packageName = context.getPackageName();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return packageInfo.splitNames == null ? new java.util.ArrayList() : java.util.Arrays.asList(packageInfo.splitNames);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.io.IOException(java.lang.String.format("Cannot load data for application '%s'", packageName), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized java.util.Set<java.lang.String> c() {
        return new java.util.HashSet(this.c);
    }

    public static boolean install(android.content.Context context) {
        return a(context, false);
    }

    public static boolean installActivity(android.content.Context context) {
        if (b()) {
            return false;
        }
        com.google.android.play.core.splitcompat.SplitCompat splitCompat = a.get();
        if (splitCompat == null) {
            throw new java.lang.IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
        }
        try {
            splitCompat.b(context);
            return true;
        } catch (java.lang.Exception e) {
            android.util.Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }
}
