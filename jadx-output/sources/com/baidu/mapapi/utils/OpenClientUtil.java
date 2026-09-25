package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
public class OpenClientUtil {
    public static int getBaiduMapVersion(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo("com.baidu.BaiduMap", 0).versionName;
            if (str != null && str.length() > 0) {
                return java.lang.Integer.valueOf(str.trim().replace(".", "").trim()).intValue();
            }
        } catch (java.lang.Exception unused) {
        }
        return 0;
    }

    public static void getLatestBaiduMapApp(android.content.Context context) {
        if (context == null) {
            return;
        }
        java.lang.String strB = com.baidu.mapapi.utils.b.b(context);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse("http://map.baidu.com/zt/client/index/?fr=sdk_[" + strB + "]"));
        context.startActivity(intent);
    }
}
