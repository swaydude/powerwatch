package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class PermissionCheck {
    public static int a = 200;
    public static int b = 202;
    public static int c = 252;
    private static final java.lang.String d = "PermissionCheck";
    private static android.content.Context e = null;
    private static java.lang.String f = null;
    private static java.util.Hashtable<java.lang.String, java.lang.String> g = null;
    private static com.baidu.lbsapi.auth.LBSAuthManager h = null;
    private static com.baidu.lbsapi.auth.LBSAuthManagerListener i = null;
    private static com.baidu.mapsdkplatform.comapi.util.PermissionCheck.c j = null;
    private static int k = 601;

    private static class a implements com.baidu.lbsapi.auth.LBSAuthManagerListener {
        private a() {
        }

        @Override // com.baidu.lbsapi.auth.LBSAuthManagerListener
        public void onAuthResult(int i, java.lang.String str) {
            if (str == null) {
                android.util.Log.e(com.baidu.mapsdkplatform.comapi.util.PermissionCheck.d, "The result is null");
                int iPermissionCheck = com.baidu.mapsdkplatform.comapi.util.PermissionCheck.permissionCheck();
                android.util.Log.d(com.baidu.mapsdkplatform.comapi.util.PermissionCheck.d, "onAuthResult try permissionCheck result is: " + iPermissionCheck);
                return;
            }
            com.baidu.mapsdkplatform.comapi.util.PermissionCheck.b bVar = new com.baidu.mapsdkplatform.comapi.util.PermissionCheck.b();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                if (jSONObject.has("status")) {
                    bVar.a = jSONObject.optInt("status");
                }
                if (jSONObject.has("appid")) {
                    bVar.c = jSONObject.optString("appid");
                }
                if (jSONObject.has("uid")) {
                    bVar.b = jSONObject.optString("uid");
                }
                if (jSONObject.has(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY)) {
                    bVar.d = jSONObject.optString(io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY);
                }
                if (jSONObject.has("token")) {
                    bVar.e = jSONObject.optString("token");
                }
                if (jSONObject.has("ak_permission")) {
                    bVar.f = jSONObject.optInt("ak_permission");
                }
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
            int unused = com.baidu.mapsdkplatform.comapi.util.PermissionCheck.k = bVar.a;
            if (com.baidu.mapsdkplatform.comapi.util.PermissionCheck.j != null) {
                com.baidu.mapsdkplatform.comapi.util.PermissionCheck.j.a(bVar);
            }
        }
    }

    public static class b {
        public int a = 0;
        public java.lang.String b = "-1";
        public java.lang.String c = "-1";
        public java.lang.String d = "";
        public java.lang.String e;
        public int f;

        public java.lang.String toString() {
            return java.lang.String.format("=============================================\n----------------- 鉴权错误信息 ------------\nsha1;package:%s\nkey:%s\nerrorcode: %d uid: %s appid %s msg: %s\n请仔细核查 SHA1、package与key申请信息是否对应，key是否删除，平台是否匹配\nerrorcode为230时，请参考论坛链接：\nhttp://bbs.lbsyun.baidu.com/forum.php?mod=viewthread&tid=106461\n=============================================\n", com.baidu.mapsdkplatform.comapi.util.a.a(com.baidu.mapsdkplatform.comapi.util.PermissionCheck.e), com.baidu.mapsdkplatform.comapi.util.PermissionCheck.f, java.lang.Integer.valueOf(this.a), this.b, this.c, this.d);
        }
    }

    public interface c {
        void a(com.baidu.mapsdkplatform.comapi.util.PermissionCheck.b bVar);
    }

    public static void destory() {
        j = null;
        e = null;
        i = null;
    }

    public static int getPermissionResult() {
        return k;
    }

    public static void init(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.String string;
        e = context;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(e.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            f = applicationInfo.metaData.getString("com.baidu.lbsapi.API_KEY");
        }
        if (g == null) {
            g = new java.util.Hashtable<>();
        }
        if (h == null) {
            h = com.baidu.lbsapi.auth.LBSAuthManager.getInstance(e);
        }
        if (i == null) {
            i = new com.baidu.mapsdkplatform.comapi.util.PermissionCheck.a();
        }
        try {
            string = context.getPackageManager().getPackageInfo(e.getPackageName(), 0).applicationInfo.loadLabel(e.getPackageManager()).toString();
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
            string = "";
        }
        android.os.Bundle bundleB = com.baidu.mapsdkplatform.comapi.util.h.b();
        if (bundleB != null) {
            g.put("mb", bundleB.getString("mb"));
            g.put("os", bundleB.getString("os"));
            g.put("sv", bundleB.getString("sv"));
            g.put("imt", "1");
            g.put("net", bundleB.getString("net"));
            g.put("cpu", bundleB.getString("cpu"));
            g.put("glr", bundleB.getString("glr"));
            g.put("glv", bundleB.getString("glv"));
            g.put("resid", bundleB.getString("resid"));
            g.put("appid", "-1");
            g.put("ver", "1");
            g.put("screen", java.lang.String.format("(%d,%d)", java.lang.Integer.valueOf(bundleB.getInt("screen_x")), java.lang.Integer.valueOf(bundleB.getInt("screen_y"))));
            g.put("dpi", java.lang.String.format("(%d,%d)", java.lang.Integer.valueOf(bundleB.getInt("dpi_x")), java.lang.Integer.valueOf(bundleB.getInt("dpi_y"))));
            g.put("pcn", bundleB.getString("pcn"));
            g.put("cuid", bundleB.getString("cuid"));
            g.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, string);
        }
    }

    public static synchronized int permissionCheck() {
        com.baidu.lbsapi.auth.LBSAuthManagerListener lBSAuthManagerListener;
        com.baidu.lbsapi.auth.LBSAuthManager lBSAuthManager = h;
        if (lBSAuthManager != null && (lBSAuthManagerListener = i) != null && e != null) {
            int iAuthenticate = lBSAuthManager.authenticate(false, "lbs_androidmapsdk", g, lBSAuthManagerListener);
            if (iAuthenticate != 0) {
                android.util.Log.e(d, "permission check result is: " + iAuthenticate);
            }
            return iAuthenticate;
        }
        android.util.Log.e(d, "The authManager is: " + h + "; the authCallback is: " + i + "; the mContext is: " + e);
        return 0;
    }

    public static void setPermissionCheckResultListener(com.baidu.mapsdkplatform.comapi.util.PermissionCheck.c cVar) {
        j = cVar;
    }
}
