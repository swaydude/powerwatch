package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private java.util.ArrayList<java.lang.Integer> a;
    private android.content.Context b;

    private static class a {
        private static final com.baidu.mapsdkplatform.comapi.util.c a = new com.baidu.mapsdkplatform.comapi.util.c();
    }

    private c() {
        this.a = new java.util.ArrayList<>();
    }

    private int a(java.lang.String str) {
        android.content.Context context = this.b;
        if (context == null) {
            return -101;
        }
        return context.getSharedPreferences("ad_auth", 0).getInt(str, 0);
    }

    public static com.baidu.mapsdkplatform.comapi.util.c a() {
        return com.baidu.mapsdkplatform.comapi.util.c.a.a;
    }

    private void a(java.lang.String str, int i) {
        android.content.Context context = this.b;
        if (context == null) {
            return;
        }
        context.getSharedPreferences("ad_auth", 0).edit().putInt(str, i).apply();
    }

    public void a(int i) {
        if (i == -1 && (i = a("ad_key")) == -101) {
            return;
        }
        for (int i2 = i; i2 != 0; i2 /= 2) {
            this.a.add(java.lang.Integer.valueOf(i2 % 2));
        }
        a("ad_key", i);
    }

    public void a(android.content.Context context) {
        this.b = context;
    }

    public boolean b() {
        java.util.ArrayList<java.lang.Integer> arrayList = this.a;
        return arrayList != null && arrayList.size() > 0 && this.a.get(0).intValue() == 1;
    }
}
