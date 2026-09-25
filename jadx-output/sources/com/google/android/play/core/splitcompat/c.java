package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    private final java.io.File a;
    private final long b;

    public c(android.content.Context context) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        this(context.getFilesDir(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
    }

    private c(java.io.File file, long j) {
        java.lang.String absolutePath = file.getAbsolutePath();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(absolutePath).length() + 82);
        sb.append("FileStorage: initializing (files directory = ");
        sb.append(absolutePath);
        sb.append(", versionCode = ");
        sb.append(j);
        sb.append(")");
        android.util.Log.d("SplitCompat", sb.toString());
        this.a = file;
        this.b = j;
    }

    private static java.io.File c(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new java.lang.IllegalArgumentException("File input must be directory when it exists.");
        }
        file.mkdirs();
        if (file.isDirectory()) {
            return file;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(file.getAbsolutePath());
        throw new java.io.IOException(strValueOf.length() != 0 ? "Unable to create directory: ".concat(strValueOf) : new java.lang.String("Unable to create directory: "));
    }

    private static void d(java.io.File file) throws java.io.IOException {
        java.io.File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (java.io.File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException(java.lang.String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    private final java.io.File f() throws java.io.IOException {
        return c(new java.io.File(g(), "verified-splits"));
    }

    private final java.io.File g() throws java.io.IOException {
        return c(new java.io.File(h(), java.lang.Long.toString(this.b)));
    }

    private final java.io.File g(java.lang.String str) throws java.io.IOException {
        return c(new java.io.File(i(), str));
    }

    private final java.io.File h() throws java.io.IOException {
        return c(new java.io.File(this.a, "splitcompat"));
    }

    private static java.lang.String h(java.lang.String str) {
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        return ".apk".length() != 0 ? strValueOf.concat(".apk") : new java.lang.String(strValueOf);
    }

    private final java.io.File i() throws java.io.IOException {
        return c(new java.io.File(g(), "native-libraries"));
    }

    public final java.io.File a(java.io.File file) throws java.io.IOException {
        return new java.io.File(f(), file.getName());
    }

    public final java.io.File a(java.lang.String str) throws java.io.IOException {
        return new java.io.File(c(), h(str));
    }

    public final java.io.File a(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return new java.io.File(g(str), str2);
    }

    public final void a() throws java.io.IOException {
        java.io.File fileH = h();
        java.lang.String[] list = fileH.list();
        if (list != null) {
            for (java.lang.String str : list) {
                if (!str.equals(java.lang.Long.toString(this.b))) {
                    java.io.File file = new java.io.File(fileH, str);
                    java.lang.String strValueOf = java.lang.String.valueOf(file);
                    long j = this.b;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(strValueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    android.util.Log.d("SplitCompat", sb.toString());
                    d(file);
                }
            }
        }
    }

    public final java.io.File b() throws java.io.IOException {
        return new java.io.File(g(), "lock.tmp");
    }

    public final java.io.File b(java.lang.String str) throws java.io.IOException {
        return new java.io.File(f(), h(str));
    }

    final void b(java.io.File file) throws java.io.IOException {
        com.google.android.play.core.internal.ag.a(file.getParentFile().getParentFile().equals(i()), "File to remove is not a native library");
        d(file);
    }

    public final java.io.File c() throws java.io.IOException {
        return c(new java.io.File(g(), "unverified-splits"));
    }

    public final java.io.File c(java.lang.String str) throws java.io.IOException {
        return c(new java.io.File(c(new java.io.File(g(), "dex")), str));
    }

    final java.util.Set<com.google.android.play.core.splitcompat.q> d() throws java.io.IOException {
        java.io.File fileF = f();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.io.File[] fileArrListFiles = fileF.listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    java.lang.String name = file.getName();
                    hashSet.add(new com.google.android.play.core.splitcompat.b(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    final void d(java.lang.String str) throws java.io.IOException {
        d(g(str));
    }

    final java.util.List<java.lang.String> e() throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = i().listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    final java.util.Set<java.io.File> e(java.lang.String str) throws java.io.IOException {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.io.File[] fileArrListFiles = g(str).listFiles();
        if (fileArrListFiles != null) {
            for (java.io.File file : fileArrListFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    final void f(java.lang.String str) throws java.io.IOException {
        d(b(str));
    }
}
