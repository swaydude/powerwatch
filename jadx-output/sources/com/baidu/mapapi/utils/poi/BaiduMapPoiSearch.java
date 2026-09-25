package com.baidu.mapapi.utils.poi;

/* JADX INFO: loaded from: classes.dex */
public class BaiduMapPoiSearch {
    private static boolean a = true;

    private static void a(com.baidu.mapapi.utils.poi.PoiParaOption poiParaOption, android.content.Context context) {
        android.net.Uri uri = android.net.Uri.parse("http://api.map.baidu.com/place/detail?uid=" + poiParaOption.a + "&output=html&src=" + context.getPackageName());
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setData(uri);
        context.startActivity(intent);
    }

    private static void b(com.baidu.mapapi.utils.poi.PoiParaOption poiParaOption, android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("http://api.map.baidu.com/place/search?");
        sb.append("query=");
        sb.append(poiParaOption.b);
        sb.append("&location=");
        com.baidu.mapapi.model.LatLng latLngGcjToBaidu = poiParaOption.c;
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            latLngGcjToBaidu = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLngGcjToBaidu);
        }
        sb.append(latLngGcjToBaidu.latitude);
        sb.append(",");
        sb.append(latLngGcjToBaidu.longitude);
        sb.append("&radius=");
        sb.append(poiParaOption.d);
        sb.append("&output=html");
        sb.append("&src=");
        sb.append(context.getPackageName());
        android.net.Uri uri = android.net.Uri.parse(sb.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.setData(uri);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(java.lang.String str, android.content.Context context) {
        if (str == null || str.length() == 0) {
            throw new java.lang.RuntimeException("BDMapSDKException: pano id can not be null.");
        }
        if (context == null) {
            throw new java.lang.RuntimeException("BDMapSDKException: context cannot be null.");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/streetscape?");
        sb.append("panoid=");
        sb.append(str);
        sb.append("&pid=");
        sb.append(str);
        sb.append("&panotype=");
        sb.append("street");
        sb.append("&src=");
        sb.append("sdk_[" + context.getPackageName() + "]");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            throw new java.lang.RuntimeException("BDMapSDKException: BaiduMap app is not installed.");
        }
        context.startActivity(intent);
    }

    public static boolean dispatchPoiToBaiduMap(java.util.List<com.baidu.mapapi.utils.poi.DispathcPoiData> list, android.content.Context context) throws java.lang.Exception {
        java.lang.String str;
        if (list.isEmpty() || list.size() <= 0) {
            throw new java.lang.NullPointerException("BDMapSDKException: dispatch poidata is null");
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            str = "BaiduMap app is not installed.";
        } else {
            if (baiduMapVersion >= 840) {
                return com.baidu.mapapi.utils.b.a(list, context, 6);
            }
            str = "Baidumap app version is too lowl.Version is greater than 8.4";
        }
        android.util.Log.e("baidumapsdk", str);
        return false;
    }

    public static void finish(android.content.Context context) {
        if (context != null) {
            com.baidu.mapapi.utils.b.a(context);
        }
    }

    public static void openBaiduMapPanoShow(java.lang.String str, android.content.Context context) {
        new com.baidu.platform.comapi.pano.a().a(str, new com.baidu.mapapi.utils.poi.a(context));
    }

    public static boolean openBaiduMapPoiDetialsPage(com.baidu.mapapi.utils.poi.PoiParaOption poiParaOption, android.content.Context context) {
        if (poiParaOption == null || context == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (poiParaOption.a == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: poi uid can not be null.");
        }
        if (poiParaOption.a.equals("")) {
            android.util.Log.e(com.baidu.mapapi.utils.route.BaiduMapRoutePlan.class.getName(), "poi uid can not be empty string");
            return false;
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            android.util.Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!a) {
                throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(poiParaOption, context);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.b.a(poiParaOption, context, 3);
        }
        android.util.Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!a) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(poiParaOption, context);
        return true;
    }

    public static boolean openBaiduMapPoiNearbySearch(com.baidu.mapapi.utils.poi.PoiParaOption poiParaOption, android.content.Context context) {
        if (poiParaOption == null || context == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (poiParaOption.b == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: poi search key can not be null.");
        }
        if (poiParaOption.c == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: poi search center can not be null.");
        }
        if (poiParaOption.c.longitude == 0.0d || poiParaOption.c.latitude == 0.0d) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: poi search center longitude or latitude can not be 0.");
        }
        if (poiParaOption.d == 0) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: poi search radius larger than 0.");
        }
        if (poiParaOption.b.equals("")) {
            android.util.Log.e(com.baidu.mapapi.utils.route.BaiduMapRoutePlan.class.getName(), "poi key can not be empty string");
            return false;
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            android.util.Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!a) {
                throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            b(poiParaOption, context);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.b.a(poiParaOption, context, 4);
        }
        android.util.Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!a) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        b(poiParaOption, context);
        return true;
    }

    public static void setSupportWebPoi(boolean z) {
        a = z;
    }
}
