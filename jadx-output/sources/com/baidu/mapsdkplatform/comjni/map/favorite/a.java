package com.baidu.mapsdkplatform.comjni.map.favorite;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private long a = 0;
    private com.baidu.mapsdkplatform.comjni.map.favorite.JNIFavorite b;

    /* JADX INFO: renamed from: com.baidu.mapsdkplatform.comjni.map.favorite.a$a, reason: collision with other inner class name */
    public static class C0013a {
        public static boolean a = false;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b() {
            a = true;
        }
    }

    public a() {
        this.b = null;
        this.b = new com.baidu.mapsdkplatform.comjni.map.favorite.JNIFavorite();
    }

    public int a(android.os.Bundle bundle) {
        try {
            return this.b.GetAll(this.a, bundle);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public long a() {
        long jCreate = this.b.Create();
        this.a = jCreate;
        return jCreate;
    }

    public boolean a(int i) {
        return this.b.SetType(this.a, i);
    }

    public boolean a(java.lang.String str) {
        return this.b.Remove(this.a, str);
    }

    public boolean a(java.lang.String str, java.lang.String str2) {
        com.baidu.mapsdkplatform.comjni.map.favorite.a.C0013a.b();
        return this.b.Add(this.a, str, str2);
    }

    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3) {
        return this.b.Load(this.a, str, str2, str3, i, i2, i3);
    }

    public int b() {
        return this.b.Release(this.a);
    }

    public java.lang.String b(java.lang.String str) {
        try {
            return this.b.GetValue(this.a, str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public boolean b(java.lang.String str, java.lang.String str2) {
        com.baidu.mapsdkplatform.comjni.map.favorite.a.C0013a.b();
        return this.b.Update(this.a, str, str2);
    }

    public boolean c() {
        return this.b.Clear(this.a);
    }

    public boolean c(java.lang.String str) {
        try {
            return this.b.IsExist(this.a, str);
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public boolean d() {
        return this.b.SaveCache(this.a);
    }
}
