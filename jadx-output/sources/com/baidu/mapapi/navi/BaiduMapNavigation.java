package com.baidu.mapapi.navi;

/* JADX INFO: loaded from: classes.dex */
public class BaiduMapNavigation {
    private static boolean a = true;

    private static java.lang.String a(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        android.content.pm.ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getApplicationContext().getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (java.lang.String) packageManager.getApplicationLabel(applicationInfo);
    }

    private static void a(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context) throws com.baidu.mapapi.navi.IllegalNaviArgumentException {
        if (naviParaOption == null || context == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.a == null || naviParaOption.c == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: you must set start and end point.");
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(naviParaOption.a);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(naviParaOption.c);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("http://app.navi.baidu.com/mobile/#navi/naving/");
        sb.append("&sy=0");
        sb.append("&endp=");
        sb.append("&start=");
        sb.append("&startwd=");
        sb.append("&endwd=");
        sb.append("&fromprod=map_sdk");
        sb.append("&app_version=");
        sb.append(com.baidu.mapapi.VersionInfo.VERSION_INFO);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put("type", "1");
            if (naviParaOption.b == null || naviParaOption.b.equals("")) {
                jSONObject.put("keyword", "");
            } else {
                jSONObject.put("keyword", naviParaOption.b);
            }
            jSONObject.put("xy", java.lang.String.valueOf(geoPointLl2mc.getLongitudeE6()) + "," + java.lang.String.valueOf(geoPointLl2mc.getLatitudeE6()));
            jSONArray.put(jSONObject);
            jSONObject2.put("type", "1");
            if (naviParaOption.d == null || naviParaOption.d.equals("")) {
                jSONObject.put("keyword", "");
            } else {
                jSONObject.put("keyword", naviParaOption.d);
            }
            jSONObject2.put("xy", java.lang.String.valueOf(geoPointLl2mc2.getLongitudeE6()) + "," + java.lang.String.valueOf(geoPointLl2mc2.getLatitudeE6()));
            jSONArray.put(jSONObject2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        if (jSONArray.length() > 0) {
            sb.append("&positions=");
            sb.append(jSONArray.toString());
        }
        sb.append("&ctrl_type=");
        sb.append("&mrsl=");
        sb.append("/vt=map&state=entry");
        android.net.Uri uri = android.net.Uri.parse(sb.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setData(uri);
        context.startActivity(intent);
    }

    public static void finish(android.content.Context context) {
        if (context != null) {
            com.baidu.mapapi.utils.b.a(context);
        }
    }

    public static boolean openBaiduMapBikeNavi(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context) {
        java.lang.String str;
        if (naviParaOption == null || context == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.c == null || naviParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "BaiduMap app is not installed.";
        } else {
            if (baiduMapVersion >= 869) {
                return com.baidu.mapapi.utils.b.a(naviParaOption, context, 8);
            }
            str = "Baidumap app version is too lowl.Version is greater than 8.6.6";
        }
        android.util.Log.e("baidumapsdk", str);
        return false;
    }

    public static boolean openBaiduMapNavi(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context) {
        if (naviParaOption == null || context == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.c == null || naviParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            android.util.Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!a) {
                throw new com.baidu.mapapi.navi.BaiduMapAppNotSupportNaviException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(naviParaOption, context);
            return true;
        }
        if (baiduMapVersion >= 830) {
            return com.baidu.mapapi.utils.b.a(naviParaOption, context, 5);
        }
        android.util.Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.2");
        if (!a) {
            throw new com.baidu.mapapi.navi.BaiduMapAppNotSupportNaviException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.2");
        }
        a(naviParaOption, context);
        return true;
    }

    public static boolean openBaiduMapWalkNavi(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context) {
        java.lang.String str;
        if (naviParaOption == null || context == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.c == null || naviParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "BaiduMap app is not installed.";
        } else {
            if (baiduMapVersion >= 869) {
                return com.baidu.mapapi.utils.b.a(naviParaOption, context, 7);
            }
            str = "Baidumap app version is too lowl.Version is greater than 8.6.6";
        }
        android.util.Log.e("baidumapsdk", str);
        return false;
    }

    public static boolean openBaiduMapWalkNaviAR(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context) {
        java.lang.String str;
        if (naviParaOption == null || context == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.c == null || naviParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: start point or end point can not be null.");
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "BaiduMap app is not installed.";
        } else {
            if (baiduMapVersion >= 869) {
                return com.baidu.mapapi.utils.b.a(naviParaOption, context, 9);
            }
            str = "Baidumap app version is too lowl.Version is greater than 8.6.6";
        }
        android.util.Log.e("baidumapsdk", str);
        return false;
    }

    @java.lang.Deprecated
    public static void openWebBaiduMapNavi(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context) throws com.baidu.mapapi.navi.IllegalNaviArgumentException {
        android.net.Uri uri;
        android.content.Intent intent;
        if (naviParaOption == null || context == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (naviParaOption.a != null && naviParaOption.c != null) {
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(naviParaOption.a);
            com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(naviParaOption.c);
            uri = android.net.Uri.parse("http://daohang.map.baidu.com/mobile/#navi/naving/start=" + geoPointLl2mc.getLongitudeE6() + "," + geoPointLl2mc.getLatitudeE6() + "&endp=" + geoPointLl2mc2.getLongitudeE6() + "," + geoPointLl2mc2.getLatitudeE6() + "&fromprod=" + a(context) + "/vt=map&state=entry");
            intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        } else {
            if (naviParaOption.b == null || naviParaOption.b.equals("") || naviParaOption.d == null || naviParaOption.d.equals("")) {
                throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: you must set start and end point or set the start and end name.");
            }
            uri = android.net.Uri.parse("http://daohang.map.baidu.com/mobile/#search/search/qt=nav&sn=2$$$$$$" + naviParaOption.b + "$$$$$$&en=2$$$$$$" + naviParaOption.d + "$$$$$$&fromprod=" + a(context));
            intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
        }
        intent.setData(uri);
        context.startActivity(intent);
    }

    public static void setSupportWebNavi(boolean z) {
        a = z;
    }
}
