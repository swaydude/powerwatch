package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private final boolean a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;

    f(android.content.Context context) {
        java.lang.String absolutePath;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.io.File externalFilesDir = context.getExternalFilesDir(null);
            absolutePath = ((externalFilesDir == null || !externalFilesDir.exists()) ? context.getFilesDir() : externalFilesDir).getPath();
        } else {
            absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        this.b = absolutePath;
        this.a = false;
        this.c = this.b + java.io.File.separator + "BaiduMapSDKNew";
        this.d = context.getCacheDir().getAbsolutePath();
        this.e = "";
        this.f = "";
    }

    f(java.lang.String str, boolean z, java.lang.String str2, android.content.Context context) {
        this.a = z;
        this.b = str;
        java.lang.String str3 = str + java.io.File.separator + "BaiduMapSDKNew";
        this.c = str3;
        this.d = str3 + java.io.File.separator + "cache";
        this.e = context.getCacheDir().getAbsolutePath();
        this.f = str2;
    }

    public java.lang.String a() {
        return this.b;
    }

    public java.lang.String b() {
        return this.b + java.io.File.separator + "BaiduMapSDKNew";
    }

    public java.lang.String c() {
        return this.d;
    }

    public java.lang.String d() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !com.baidu.mapsdkplatform.comapi.util.f.class.isInstance(obj)) {
            return false;
        }
        return this.b.equals(((com.baidu.mapsdkplatform.comapi.util.f) obj).b);
    }
}
