package com.baidu.mapsdkplatform.comjni.tools;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static double a(com.baidu.mapapi.model.inner.Point point, com.baidu.mapapi.model.inner.Point point2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putDouble("x1", point.x);
        bundle.putDouble("y1", point.y);
        bundle.putDouble("x2", point2.x);
        bundle.putDouble("y2", point2.y);
        com.baidu.mapsdkplatform.comjni.tools.JNITools.GetDistanceByMC(bundle);
        return bundle.getDouble("distance");
    }

    public static com.baidu.mapapi.model.inner.a a(java.lang.String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("strkey", str);
        com.baidu.mapsdkplatform.comjni.tools.JNITools.TransGeoStr2ComplexPt(bundle);
        com.baidu.mapapi.model.inner.a aVar = new com.baidu.mapapi.model.inner.a();
        android.os.Bundle bundle2 = bundle.getBundle("map_bound");
        if (bundle2 != null) {
            android.os.Bundle bundle3 = bundle2.getBundle("ll");
            if (bundle3 != null) {
                aVar.b = new com.baidu.mapapi.model.inner.Point((int) bundle3.getDouble("ptx"), (int) bundle3.getDouble("pty"));
            }
            android.os.Bundle bundle4 = bundle2.getBundle("ru");
            if (bundle4 != null) {
                aVar.c = new com.baidu.mapapi.model.inner.Point((int) bundle4.getDouble("ptx"), (int) bundle4.getDouble("pty"));
            }
        }
        for (com.baidu.mapsdkplatform.comjni.tools.ParcelItem parcelItem : (com.baidu.mapsdkplatform.comjni.tools.ParcelItem[]) bundle.getParcelableArray("poly_line")) {
            if (aVar.d == null) {
                aVar.d = new java.util.ArrayList<>();
            }
            android.os.Bundle bundle5 = parcelItem.getBundle();
            if (bundle5 != null) {
                com.baidu.mapsdkplatform.comjni.tools.ParcelItem[] parcelItemArr = (com.baidu.mapsdkplatform.comjni.tools.ParcelItem[]) bundle5.getParcelableArray("point_array");
                java.util.ArrayList<com.baidu.mapapi.model.inner.Point> arrayList = new java.util.ArrayList<>();
                for (com.baidu.mapsdkplatform.comjni.tools.ParcelItem parcelItem2 : parcelItemArr) {
                    android.os.Bundle bundle6 = parcelItem2.getBundle();
                    if (bundle6 != null) {
                        arrayList.add(new com.baidu.mapapi.model.inner.Point((int) bundle6.getDouble("ptx"), (int) bundle6.getDouble("pty")));
                    }
                }
                arrayList.trimToSize();
                aVar.d.add(arrayList);
            }
        }
        aVar.d.trimToSize();
        aVar.a = (int) bundle.getDouble("type");
        return aVar;
    }

    public static java.lang.String a() {
        return com.baidu.mapsdkplatform.comjni.tools.JNITools.GetToken();
    }

    public static void a(boolean z, int i) {
        com.baidu.mapsdkplatform.comjni.tools.JNITools.openLogEnable(z, i);
    }

    public static void b() {
        com.baidu.mapsdkplatform.comjni.tools.JNITools.initClass(new android.os.Bundle(), 0);
    }
}
