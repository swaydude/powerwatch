package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static volatile com.baidu.mapsdkplatform.comapi.util.g a;
    private boolean b = false;
    private boolean c = true;
    private final java.util.List<com.baidu.mapsdkplatform.comapi.util.f> d = new java.util.ArrayList();
    private com.baidu.mapsdkplatform.comapi.util.f e = null;
    private java.lang.String f;

    private g() {
    }

    public static com.baidu.mapsdkplatform.comapi.util.g a() {
        if (a == null) {
            synchronized (com.baidu.mapsdkplatform.comapi.util.g.class) {
                if (a == null) {
                    a = new com.baidu.mapsdkplatform.comapi.util.g();
                }
            }
        }
        return a;
    }

    private boolean a(java.lang.String str) {
        boolean zCreateNewFile = false;
        try {
            java.io.File file = new java.io.File(str + "/test.0");
            if (file.exists()) {
                file.delete();
            }
            zCreateNewFile = file.createNewFile();
            if (file.exists()) {
                file.delete();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return zCreateNewFile;
    }

    private void c(android.content.Context context) {
        boolean z;
        java.lang.Object[] objArr;
        try {
            android.os.storage.StorageManager storageManager = (android.os.storage.StorageManager) context.getSystemService("storage");
            java.lang.reflect.Method method = storageManager.getClass().getMethod("getVolumeList", new java.lang.Class[0]);
            int i = 1;
            java.lang.reflect.Method method2 = storageManager.getClass().getMethod("getVolumeState", java.lang.String.class);
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.storage.StorageVolume");
            java.lang.reflect.Method method3 = cls.getMethod("isRemovable", new java.lang.Class[0]);
            java.lang.reflect.Method method4 = cls.getMethod("getPath", new java.lang.Class[0]);
            java.lang.Object[] objArr2 = (java.lang.Object[]) method.invoke(storageManager, new java.lang.Object[0]);
            if (objArr2 != null) {
                int length = objArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    java.lang.Object obj = objArr2[i2];
                    java.lang.String str = (java.lang.String) method4.invoke(obj, new java.lang.Object[0]);
                    if (str == null || str.length() <= 0) {
                        objArr = objArr2;
                    } else {
                        objArr = objArr2;
                        java.lang.Object[] objArr3 = new java.lang.Object[i];
                        objArr3[0] = str;
                        if ("mounted".equals(method2.invoke(storageManager, objArr3))) {
                            boolean z2 = !((java.lang.Boolean) method3.invoke(obj, new java.lang.Object[0])).booleanValue();
                            if (android.os.Build.VERSION.SDK_INT <= 19 && a(str)) {
                                this.d.add(new com.baidu.mapsdkplatform.comapi.util.f(str, !z2, z2 ? "内置存储卡" : "外置存储卡", context));
                            } else if (android.os.Build.VERSION.SDK_INT >= 19) {
                                if (new java.io.File(str + java.io.File.separator + "BaiduMapSDKNew").exists() && str.equals(context.getSharedPreferences("map_pref", 0).getString("PREFFERED_SD_CARD", ""))) {
                                    this.f = str + java.io.File.separator + "BaiduMapSDKNew";
                                }
                            }
                        }
                    }
                    i2++;
                    objArr2 = objArr;
                    i = 1;
                }
                if (android.os.Build.VERSION.SDK_INT >= 19) {
                    java.io.File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(this.d);
                    for (int i3 = 0; i3 < externalFilesDirs.length && externalFilesDirs[i3] != null; i3++) {
                        java.lang.String absolutePath = externalFilesDirs[i3].getAbsolutePath();
                        java.util.Iterator<com.baidu.mapsdkplatform.comapi.util.f> it = this.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (absolutePath.startsWith(it.next().a())) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        java.lang.String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
                        if (str2 != null && !z && absolutePath.indexOf(str2) != -1) {
                            arrayList.add(new com.baidu.mapsdkplatform.comapi.util.f(absolutePath, true, "外置存储卡", context));
                        }
                    }
                    this.d.clear();
                    this.d.addAll(arrayList);
                }
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private void d(android.content.Context context) throws java.lang.Throwable {
        java.util.Scanner scanner;
        java.lang.String[] strArrSplit;
        java.lang.String[] strArrSplit2;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Scanner scanner2 = null;
        try {
            try {
                java.io.File file = new java.io.File("/proc/mounts");
                if (file.exists()) {
                    scanner = new java.util.Scanner(file);
                    while (scanner.hasNext()) {
                        try {
                            java.lang.String strNextLine = scanner.nextLine();
                            if (strNextLine.startsWith("/dev/block/vold/") && (strArrSplit2 = strNextLine.replace('\t', ' ').split(" ")) != null && strArrSplit2.length > 0) {
                                arrayList.add(strArrSplit2[1]);
                            }
                        } catch (java.lang.Exception e) {
                            e = e;
                            scanner2 = scanner;
                            e.printStackTrace();
                            if (scanner2 != null) {
                                scanner2.close();
                                return;
                            }
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            scanner2 = scanner;
                            if (scanner2 != null) {
                                scanner2.close();
                            }
                            throw th;
                        }
                    }
                    scanner.close();
                }
                java.io.File file2 = new java.io.File("/system/etc/vold.fstab");
                if (file2.exists()) {
                    scanner = new java.util.Scanner(file2);
                    while (scanner.hasNext()) {
                        java.lang.String strNextLine2 = scanner.nextLine();
                        if (strNextLine2.startsWith("dev_mount") && (strArrSplit = strNextLine2.replace('\t', ' ').split(" ")) != null && strArrSplit.length > 0) {
                            java.lang.String strSubstring = strArrSplit[2];
                            if (strSubstring.contains(":")) {
                                strSubstring = strSubstring.substring(0, strSubstring.indexOf(":"));
                            }
                            arrayList2.add(strSubstring);
                        }
                    }
                    scanner.close();
                }
                java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
                this.d.add(new com.baidu.mapsdkplatform.comapi.util.f(absolutePath, false, "Auto", context));
                for (java.lang.String str : arrayList) {
                    if (arrayList2.contains(str) && !str.equals(absolutePath)) {
                        java.io.File file3 = new java.io.File(str);
                        if (file3.exists() && file3.isDirectory() && file3.canWrite()) {
                            this.d.add(new com.baidu.mapsdkplatform.comapi.util.f(str, false, "Auto", context));
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public void a(android.content.Context context) throws java.lang.Throwable {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.c = false;
                this.e = new com.baidu.mapsdkplatform.comapi.util.f(context);
                this.d.clear();
                this.d.add(this.e);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 14) {
                c(context);
            } else {
                d(context);
            }
            try {
                if (this.d.size() > 0) {
                    fVar = null;
                    int i = 0;
                    for (com.baidu.mapsdkplatform.comapi.util.f fVar : this.d) {
                        if (new java.io.File(fVar.b()).exists()) {
                            i++;
                            fVar = fVar;
                        }
                    }
                    if (i != 0) {
                        if (i == 1) {
                            if (a(context, fVar)) {
                                this.e = fVar;
                                break;
                            }
                        } else {
                            this.e = b(context);
                        }
                    } else {
                        com.baidu.mapsdkplatform.comapi.util.f fVarB = b(context);
                        this.e = fVarB;
                        if (fVarB == null) {
                            for (com.baidu.mapsdkplatform.comapi.util.f fVar2 : this.d) {
                                if (a(context, fVar2)) {
                                    this.e = fVar2;
                                    break;
                                }
                            }
                        }
                    }
                    if (this.e == null) {
                        this.e = this.d.get(0);
                    }
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            try {
                com.baidu.mapsdkplatform.comapi.util.f fVar3 = this.e;
                if (fVar3 == null || !a(fVar3.a())) {
                    this.c = false;
                    this.e = new com.baidu.mapsdkplatform.comapi.util.f(context);
                    this.d.clear();
                    this.d.add(this.e);
                    return;
                }
                java.io.File file = new java.io.File(this.e.b());
                if (!file.exists()) {
                    file.mkdirs();
                }
                java.io.File file2 = new java.io.File(this.e.c());
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                java.io.File file3 = new java.io.File(file2, ".nomedia");
                if (file3.exists()) {
                    return;
                }
                file3.createNewFile();
            } catch (java.lang.Exception e2) {
                e2.printStackTrace();
            }
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
    }

    public boolean a(android.content.Context context, com.baidu.mapsdkplatform.comapi.util.f fVar) {
        java.lang.String strA = fVar.a();
        if (!a(strA)) {
            return false;
        }
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences("map_pref", 0).edit();
        editorEdit.putString("PREFFERED_SD_CARD", strA);
        return editorEdit.commit();
    }

    public com.baidu.mapsdkplatform.comapi.util.f b() {
        return this.e;
    }

    public com.baidu.mapsdkplatform.comapi.util.f b(android.content.Context context) {
        java.lang.String string = context.getSharedPreferences("map_pref", 0).getString("PREFFERED_SD_CARD", "");
        if (string == null || string.length() <= 0) {
            return null;
        }
        for (com.baidu.mapsdkplatform.comapi.util.f fVar : this.d) {
            if (fVar.a().equals(string)) {
                return fVar;
            }
        }
        return null;
    }
}
