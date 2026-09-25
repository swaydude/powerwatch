package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static android.content.Context a = null;
    public static java.lang.String d = null;
    private static final java.lang.String e = "h";
    private static java.lang.String h;
    private static java.lang.String i;
    private static java.lang.String j;
    private static java.lang.String k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static int p;
    private static int q;
    private static java.lang.String r;
    private static java.lang.String w;
    private static java.lang.String x;
    private static com.baidu.mapsdkplatform.comjni.util.a f = new com.baidu.mapsdkplatform.comjni.util.a();
    private static java.lang.String g = "02";
    private static java.lang.String s = "baidu";
    private static java.lang.String t = "";
    private static java.lang.String u = "";
    private static java.lang.String v = "";
    private static java.lang.String y = "-1";
    private static java.lang.String z = "-1";
    public static final int b = java.lang.Integer.parseInt(android.os.Build.VERSION.SDK);
    public static float c = 1.0f;
    private static java.lang.String A = "";
    private static java.util.Map<java.lang.String, java.lang.String> B = new java.util.HashMap();

    public static void a() {
        d();
    }

    public static void a(java.lang.String str) {
        r = str;
        f();
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        y = str2;
        z = str;
        f();
    }

    public static byte[] a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("cpu", t);
        bundle.putString("resid", g);
        bundle.putString("channel", s);
        bundle.putString("glr", u);
        bundle.putString("glv", v);
        bundle.putString("mb", g());
        bundle.putString("sv", i());
        bundle.putString("os", k());
        bundle.putInt("dpi_x", l());
        bundle.putInt("dpi_y", l());
        bundle.putString("net", r);
        bundle.putString("cuid", A);
        bundle.putByteArray("signature", a(a));
        bundle.putString("pcn", a.getPackageName());
        bundle.putInt("screen_x", h());
        bundle.putInt("screen_y", j());
        com.baidu.mapsdkplatform.comjni.util.a aVar = f;
        if (aVar != null) {
            aVar.a(bundle);
        }
        return bundle;
    }

    public static void b(android.content.Context context) {
        a = context;
        if (context.getFilesDir() != null) {
            w = context.getFilesDir().getAbsolutePath();
        }
        if (context.getCacheDir() != null) {
            x = context.getCacheDir().getAbsolutePath();
        }
        i = android.os.Build.MODEL;
        j = "Android" + android.os.Build.VERSION.SDK;
        h = context.getPackageName();
        c(context);
        d(context);
        q();
        A = p();
        B.put("resid", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(g));
        B.put("channel", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(m()));
        B.put("mb", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(g()));
        B.put("sv", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(i()));
        B.put("os", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(k()));
        B.put("dpi", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(java.lang.String.format("%d,%d", java.lang.Integer.valueOf(l()), java.lang.Integer.valueOf(l()))));
        B.put("cuid", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(A));
        B.put("pcn", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(a.getPackageName()));
        B.put("screen", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(java.lang.String.format("%d,%d", java.lang.Integer.valueOf(h()), java.lang.Integer.valueOf(j()))));
        com.baidu.mapsdkplatform.comjni.util.a aVar = f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static java.lang.String c() {
        if (B == null) {
            return null;
        }
        java.util.Date date = new java.util.Date();
        long time = date.getTime() + ((long) (date.getSeconds() * 1000));
        B.put("ctm", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(java.lang.String.format("%f", java.lang.Double.valueOf((time / 1000) + ((time % 1000) / 1000.0d)))));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : B.entrySet()) {
            sb.append("&");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    private static void c(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            java.lang.String apiVersion = com.baidu.mapapi.VersionInfo.getApiVersion();
            k = apiVersion;
            if (apiVersion != null && !apiVersion.equals("")) {
                k = k.replace('_', '.');
            }
            l = packageInfo.versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            k = "1.0.0";
            l = 1;
        }
    }

    public static void d() {
        com.baidu.mapsdkplatform.comjni.util.a aVar = f;
        if (aVar != null) {
            aVar.b();
        }
    }

    private static void d(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
        if (defaultDisplay != null) {
            m = defaultDisplay.getWidth();
            n = defaultDisplay.getHeight();
            defaultDisplay.getMetrics(displayMetrics);
        }
        c = displayMetrics.density;
        o = (int) displayMetrics.xdpi;
        p = (int) displayMetrics.ydpi;
        if (b > 3) {
            q = displayMetrics.densityDpi;
        } else {
            q = 160;
        }
        if (q == 0) {
            q = 160;
        }
    }

    public static java.lang.String e() {
        return r;
    }

    public static void f() {
        B.put("net", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(e()));
        B.put("appid", com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(y));
        B.put("bduid", "");
        if (f == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("cpu", t);
        bundle.putString("resid", g);
        bundle.putString("channel", s);
        bundle.putString("glr", u);
        bundle.putString("glv", v);
        bundle.putString("mb", g());
        bundle.putString("sv", i());
        bundle.putString("os", k());
        bundle.putInt("dpi_x", l());
        bundle.putInt("dpi_y", l());
        bundle.putString("net", r);
        bundle.putString("cuid", A);
        bundle.putString("pcn", a.getPackageName());
        bundle.putInt("screen_x", h());
        bundle.putInt("screen_y", j());
        bundle.putString("appid", y);
        bundle.putString("duid", z);
        if (!android.text.TextUtils.isEmpty(d)) {
            bundle.putString("token", d);
        }
        f.a(bundle);
        com.baidu.mapsdkplatform.comapi.util.SysUpdateObservable.getInstance().updatePhoneInfo();
    }

    public static java.lang.String g() {
        return i;
    }

    public static int h() {
        return m;
    }

    public static java.lang.String i() {
        return k;
    }

    public static int j() {
        return n;
    }

    public static java.lang.String k() {
        return j;
    }

    public static int l() {
        return q;
    }

    public static java.lang.String m() {
        return s;
    }

    public static java.lang.String n() {
        return h;
    }

    public static java.lang.String o() {
        return w;
    }

    public static java.lang.String p() {
        java.lang.String cuid;
        try {
            cuid = com.baidu.android.bbalbs.common.util.CommonParam.getCUID(a);
        } catch (java.lang.Exception unused) {
            cuid = "";
        }
        return cuid == null ? "" : cuid;
    }

    private static void q() {
        r = "0";
    }
}
