package com.baidu.mapsdkplatform.comapi;

/* JADX INFO: loaded from: classes.dex */
public class NativeLoader {
    private static final java.lang.String a = "NativeLoader";
    private static android.content.Context b;
    private static com.baidu.mapsdkplatform.comapi.NativeLoader e;
    private static final java.util.Set<java.lang.String> c = new java.util.HashSet();
    private static final java.util.Set<java.lang.String> d = new java.util.HashSet();
    private static com.baidu.mapsdkplatform.comapi.NativeLoader.a f = com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMEABI;
    private static boolean g = false;
    private static java.lang.String h = null;

    /* JADX INFO: Access modifiers changed from: private */
    enum a {
        ARMEABI("armeabi"),
        ARMV7("armeabi-v7a"),
        ARM64("arm64-v8a"),
        X86("x86"),
        X86_64("x86_64");

        private java.lang.String f;

        a(java.lang.String str) {
            this.f = str;
        }

        public java.lang.String a() {
            return this.f;
        }
    }

    private NativeLoader() {
    }

    private java.lang.String a() {
        return 8 <= android.os.Build.VERSION.SDK_INT ? b.getPackageCodePath() : "";
    }

    private java.lang.String a(com.baidu.mapsdkplatform.comapi.NativeLoader.a aVar) {
        return "lib/" + aVar.a() + "/";
    }

    private void a(java.io.InputStream inputStream, java.io.FileOutputStream fileOutputStream) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (java.lang.Throwable th) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e2) {
                    android.util.Log.e(a, "Close InputStream error", e2);
                }
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (java.io.IOException e3) {
                    android.util.Log.e(a, "Close OutputStream error", e3);
                    throw th;
                }
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (java.io.IOException e4) {
            android.util.Log.e(a, "Close InputStream error", e4);
        }
        try {
            fileOutputStream.close();
        } catch (java.io.IOException e5) {
            android.util.Log.e(a, "Close OutputStream error", e5);
        }
    }

    private void a(java.lang.Throwable th) {
        android.util.Log.e(a, "loadException", th);
        for (java.lang.String str : d) {
            android.util.Log.e(a, str + " Failed to load.");
        }
    }

    static void a(boolean z, java.lang.String str) {
        g = z;
        h = str;
    }

    private boolean a(java.lang.String str) {
        try {
            java.util.Set<java.lang.String> set = c;
            synchronized (set) {
                if (set.contains(str)) {
                    return true;
                }
                java.lang.System.loadLibrary(str);
                synchronized (set) {
                    set.add(str);
                }
                return true;
            }
        } catch (java.lang.Throwable unused) {
            return b(str);
        }
    }

    private boolean a(java.lang.String str, com.baidu.mapsdkplatform.comapi.NativeLoader.a aVar) throws java.lang.Throwable {
        java.io.File file = new java.io.File(b(), str);
        if (file.exists() && file.length() > 0) {
            return true;
        }
        java.lang.String str2 = a(aVar) + str;
        java.util.zip.ZipFile zipFile = null;
        java.lang.String strA = !g ? a() : h;
        if (strA != null) {
            try {
                if (!strA.isEmpty()) {
                    try {
                        java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(strA);
                        try {
                            java.util.zip.ZipEntry entry = zipFile2.getEntry(str2);
                            if (entry == null) {
                                try {
                                    zipFile2.close();
                                } catch (java.io.IOException e2) {
                                    android.util.Log.e(a, "Release file failed", e2);
                                }
                                return false;
                            }
                            a(zipFile2.getInputStream(entry), new java.io.FileOutputStream(new java.io.File(b(), str)));
                            try {
                                zipFile2.close();
                            } catch (java.io.IOException e3) {
                                android.util.Log.e(a, "Release file failed", e3);
                            }
                            return true;
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            zipFile = zipFile2;
                            android.util.Log.e(a, "Copy library file error", e);
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (java.io.IOException e5) {
                                    android.util.Log.e(a, "Release file failed", e5);
                                }
                            }
                            return false;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            zipFile = zipFile2;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (java.io.IOException e6) {
                                    android.util.Log.e(a, "Release file failed", e6);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e7) {
                        e = e7;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    private boolean a(java.lang.String str, java.lang.String str2) {
        return !a(str2, com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMV7) ? b(str, str2) : f(str2, str);
    }

    private java.lang.String b() {
        java.io.File file = new java.io.File(b.getFilesDir(), "libs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    private boolean b(java.lang.String str) {
        boolean zC;
        java.lang.String strMapLibraryName = java.lang.System.mapLibraryName(str);
        java.util.Set<java.lang.String> set = c;
        synchronized (set) {
            if (set.contains(str)) {
                return true;
            }
            int i = com.baidu.mapsdkplatform.comapi.d.a[f.ordinal()];
            if (i == 1) {
                zC = c(str, strMapLibraryName);
            } else if (i == 2) {
                zC = a(str, strMapLibraryName);
            } else if (i == 3) {
                zC = b(str, strMapLibraryName);
            } else if (i != 4) {
                zC = i != 5 ? false : d(str, strMapLibraryName);
            } else {
                zC = e(str, strMapLibraryName);
            }
            synchronized (set) {
                set.add(str);
            }
            return zC;
        }
    }

    private boolean b(java.lang.String str, java.lang.String str2) {
        if (a(str2, com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMEABI)) {
            return f(str2, str);
        }
        android.util.Log.e(a, "found lib" + str + ".so error");
        return false;
    }

    private static com.baidu.mapsdkplatform.comapi.NativeLoader.a c() {
        java.lang.String str = android.os.Build.VERSION.SDK_INT < 21 ? android.os.Build.CPU_ABI : android.os.Build.SUPPORTED_ABIS[0];
        if (str == null) {
            return com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMEABI;
        }
        if (str.contains("arm") && str.contains("v7")) {
            f = com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARMV7;
        }
        if (str.contains("arm") && str.contains("64") && d()) {
            f = com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARM64;
        }
        if (str.contains("x86")) {
            f = str.contains("64") ? com.baidu.mapsdkplatform.comapi.NativeLoader.a.X86_64 : com.baidu.mapsdkplatform.comapi.NativeLoader.a.X86;
        }
        return f;
    }

    private boolean c(java.lang.String str, java.lang.String str2) {
        return !a(str2, com.baidu.mapsdkplatform.comapi.NativeLoader.a.ARM64) ? a(str, str2) : f(str2, str);
    }

    private static boolean d() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return android.os.Process.is64Bit();
        }
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            return android.os.Build.CPU_ABI.equals(android.os.Build.SUPPORTED_64_BIT_ABIS[0]);
        }
        return false;
    }

    private boolean d(java.lang.String str, java.lang.String str2) {
        return !a(str2, com.baidu.mapsdkplatform.comapi.NativeLoader.a.X86) ? a(str, str2) : f(str2, str);
    }

    private boolean e(java.lang.String str, java.lang.String str2) {
        return !a(str2, com.baidu.mapsdkplatform.comapi.NativeLoader.a.X86_64) ? d(str, str2) : f(str2, str);
    }

    private boolean f(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.System.load(new java.io.File(b(), str).getAbsolutePath());
            java.util.Set<java.lang.String> set = c;
            synchronized (set) {
                set.add(str2);
            }
            return true;
        } catch (java.lang.Throwable th) {
            java.util.Set<java.lang.String> set2 = d;
            synchronized (set2) {
                set2.add(str2);
                a(th);
                return false;
            }
        }
    }

    public static synchronized com.baidu.mapsdkplatform.comapi.NativeLoader getInstance() {
        if (e == null) {
            e = new com.baidu.mapsdkplatform.comapi.NativeLoader();
            f = c();
        }
        return e;
    }

    public static void setContext(android.content.Context context) {
        b = context;
    }

    public synchronized boolean loadLibrary(java.lang.String str) {
        if (!g) {
            return a(str);
        }
        java.lang.String str2 = h;
        if (str2 == null || str2.isEmpty()) {
            android.util.Log.e(a, "Given custom so file path is null, please check!");
            return false;
        }
        return b(str);
    }
}
