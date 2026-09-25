package com.baidu.mapsdkplatform.comapi.util;

/* JADX INFO: loaded from: classes.dex */
public class b {
    static double[] a = {1.289059486E7d, 8362377.87d, 5591021.0d, 3481989.83d, 1678043.12d, 0.0d};
    static double[] b = {7.5E7d, 6.0E7d, 4.5E7d, 3.0E7d, 1.5E7d, 0.0d};
    static double[][] c = {new double[]{1.410526172116255E-8d, 8.98305509648872E-6d, -1.9939833816331d, 200.9824383106796d, -187.2403703815547d, 91.6087516669843d, -23.38765649603339d, 2.57121317296198d, -0.03801003308653d, 1.73379812E7d}, new double[]{-7.435856389565537E-9d, 8.983055097726239E-6d, -0.78625201886289d, 96.32687599759846d, -1.85204757529826d, -59.36935905485877d, 47.40033549296737d, -16.50741931063887d, 2.28786674699375d, 1.026014486E7d}, new double[]{-3.030883460898826E-8d, 8.98305509983578E-6d, 0.30071316287616d, 59.74293618442277d, 7.357984074871d, -25.38371002664745d, 13.45380521110908d, -3.29883767235584d, 0.32710905363475d, 6856817.37d}, new double[]{-1.981981304930552E-8d, 8.983055099779535E-6d, 0.03278182852591d, 40.31678527705744d, 0.65659298677277d, -4.44255534477492d, 0.85341911805263d, 0.12923347998204d, -0.04625736007561d, 4482777.06d}, new double[]{3.09191371068437E-9d, 8.983055096812155E-6d, 6.995724062E-5d, 23.10934304144901d, -2.3663490511E-4d, -0.6321817810242d, -0.00663494467273d, 0.03430082397953d, -0.00466043876332d, 2555164.4d}, new double[]{2.890871144776878E-9d, 8.983055095805407E-6d, -3.068298E-8d, 7.47137025468032d, -3.53937994E-6d, -0.02145144861037d, -1.234426596E-5d, 1.0322952773E-4d, -3.23890364E-6d, 826088.5d}};
    static double[][] d = {new double[]{-0.0015702102444d, 111320.7020616939d, 1.704480524535203E15d, -1.033898737604234E16d, 2.611266785660388E16d, -3.51496691766537E16d, 2.659570071840392E16d, -1.072501245418824E16d, 1.800819912950474E15d, 82.5d}, new double[]{8.277824516172526E-4d, 111320.7020463578d, 6.477955746671607E8d, -4.082003173641316E9d, 1.077490566351142E10d, -1.517187553151559E10d, 1.205306533862167E10d, -5.124939663577472E9d, 9.133119359512032E8d, 67.5d}, new double[]{0.00337398766765d, 111320.7020202162d, 4481351.045890365d, -2.339375119931662E7d, 7.968221547186455E7d, -1.159649932797253E8d, 9.723671115602145E7d, -4.366194633752821E7d, 8477230.501135234d, 52.5d}, new double[]{0.00220636496208d, 111320.7020209128d, 51751.86112841131d, 3796837.749470245d, 992013.7397791013d, -1221952.21711287d, 1340652.697009075d, -620943.6990984312d, 144416.9293806241d, 37.5d}, new double[]{-3.441963504368392E-4d, 111320.7020576856d, 278.2353980772752d, 2485758.690035394d, 6070.750963243378d, 54821.18345352118d, 9540.606633304236d, -2710.55326746645d, 1405.483844121726d, 22.5d}, new double[]{-3.218135878613132E-4d, 111320.7020701615d, 0.00369383431289d, 823725.6402795718d, 0.46104986909093d, 2351.343141331292d, 1.58060784298199d, 8.77738589078284d, 0.37238884252424d, 7.45d}};

    static class a {
        double a;
        double b;

        a() {
        }
    }

    public static int a(com.baidu.mapapi.model.LatLng latLng, int i) {
        com.baidu.mapapi.model.LatLng latLng2 = new com.baidu.mapapi.model.LatLng(latLng.latitude + (((double) i) / 111000.0d), latLng.longitude);
        com.baidu.mapapi.model.inner.GeoPoint geoPointA = a(latLng);
        com.baidu.mapapi.model.inner.GeoPoint geoPointA2 = a(latLng2);
        return (int) java.lang.Math.sqrt(java.lang.Math.pow(geoPointA.getLatitudeE6() - geoPointA2.getLatitudeE6(), 2.0d) + java.lang.Math.pow(geoPointA.getLongitudeE6() - geoPointA2.getLongitudeE6(), 2.0d));
    }

    public static com.baidu.mapapi.model.LatLng a(float f, float f2, java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("") || str.equals(com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL)) {
            return new com.baidu.mapapi.model.LatLng(f, f2);
        }
        if (!str.equals(com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL) && !str.equals(com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09MC) && !str.equals(com.baidu.mapsdkplatform.comapi.location.CoordinateType.GCJ02) && !str.equals(com.baidu.mapsdkplatform.comapi.location.CoordinateType.WGS84)) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.baidu.mapsdkplatform.comjni.tools.JNITools.CoordinateEncryptEx(f, f2, str, bundle);
        if (bundle.isEmpty()) {
            return null;
        }
        return new com.baidu.mapapi.model.LatLng(bundle.getDouble("y"), bundle.getDouble("x"));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[LOOP:0: B:26:0x0080->B:31:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[SYNTHETIC] */
    public static com.baidu.mapapi.model.LatLng a(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        double d2;
        double[] dArr;
        int i;
        com.baidu.mapsdkplatform.comapi.util.b.a aVar = new com.baidu.mapsdkplatform.comapi.util.b.a();
        aVar.a = geoPoint.getLongitudeE6();
        aVar.b = geoPoint.getLatitudeE6();
        com.baidu.mapsdkplatform.comapi.util.b.a aVar2 = new com.baidu.mapsdkplatform.comapi.util.b.a();
        aVar2.a = aVar.a;
        double d3 = aVar2.a;
        double d4 = aVar2.a;
        if (d3 <= 2.0037508342E7d) {
            if (d4 < -2.0037508342E7d) {
                d2 = 2.0037508342E7d - ((-2.0037508342E7d) - aVar2.a);
            }
            aVar2.b = aVar.b;
            if (aVar2.b >= 1.0E-6d && aVar2.b >= 0.0d) {
                aVar2.b = 1.0E-6d;
            } else if (aVar2.b >= 0.0d && aVar2.b > -1.0E-6d) {
                aVar2.b = -1.0E-6d;
            } else if (aVar2.b > 2.0037508342E7d) {
                aVar2.b = 2.0037508342E7d;
            } else if (aVar2.b < -2.0037508342E7d) {
                aVar2.b = -2.0037508342E7d;
            }
            dArr = new double[10];
            for (i = 0; i < 6; i++) {
                if (java.lang.Math.abs(aVar2.b) > a[i]) {
                    dArr = c[i];
                    break;
                }
            }
            com.baidu.mapsdkplatform.comapi.util.b.a aVarA = a(aVar2, dArr);
            return new com.baidu.mapapi.model.LatLng(aVarA.b, aVarA.a);
        }
        d2 = (d4 - 2.0037508342E7d) - 2.0037508342E7d;
        aVar2.a = d2;
        aVar2.b = aVar.b;
        if (aVar2.b >= 1.0E-6d) {
            if (aVar2.b >= 0.0d) {
                if (aVar2.b > 2.0037508342E7d) {
                    aVar2.b = 2.0037508342E7d;
                } else if (aVar2.b < -2.0037508342E7d) {
                    aVar2.b = -2.0037508342E7d;
                }
            } else if (aVar2.b > 2.0037508342E7d) {
                aVar2.b = 2.0037508342E7d;
            } else if (aVar2.b < -2.0037508342E7d) {
                aVar2.b = -2.0037508342E7d;
            }
        } else if (aVar2.b >= 0.0d) {
            if (aVar2.b > 2.0037508342E7d) {
                aVar2.b = 2.0037508342E7d;
            } else if (aVar2.b < -2.0037508342E7d) {
                aVar2.b = -2.0037508342E7d;
            }
        } else if (aVar2.b > 2.0037508342E7d) {
            aVar2.b = 2.0037508342E7d;
        } else if (aVar2.b < -2.0037508342E7d) {
            aVar2.b = -2.0037508342E7d;
        }
        dArr = new double[10];
        while (i < 6) {
            if (java.lang.Math.abs(aVar2.b) > a[i]) {
                dArr = c[i];
                break;
            }
        }
        com.baidu.mapsdkplatform.comapi.util.b.a aVarA2 = a(aVar2, dArr);
        return new com.baidu.mapapi.model.LatLng(aVarA2.b, aVarA2.a);
    }

    public static com.baidu.mapapi.model.LatLng a(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("strkey", str);
        com.baidu.mapsdkplatform.comjni.tools.JNITools.TransGeoStr2Pt(bundle);
        com.baidu.mapapi.model.inner.GeoPoint geoPoint = new com.baidu.mapapi.model.inner.GeoPoint(0.0d, 0.0d);
        geoPoint.setLongitudeE6(bundle.getInt("ptx"));
        geoPoint.setLatitudeE6(bundle.getInt("pty"));
        return a(geoPoint);
    }

    public static com.baidu.mapapi.model.inner.GeoPoint a(com.baidu.mapapi.model.LatLng latLng) {
        com.baidu.mapsdkplatform.comapi.util.b.a aVar = new com.baidu.mapsdkplatform.comapi.util.b.a();
        double[] dArr = new double[10];
        aVar.b = java.lang.Math.abs(latLng.latitude * 1000000.0d);
        if (aVar.b < 0.1d) {
            aVar.b = 0.1d;
        }
        for (int i = 0; i < b.length; i++) {
            if (aVar.b > b[i]) {
                dArr = d[i];
                break;
            }
        }
        aVar.a = latLng.longitude;
        aVar.b = latLng.latitude;
        com.baidu.mapsdkplatform.comapi.util.b.a aVarA = a(aVar, dArr);
        return new com.baidu.mapapi.model.inner.GeoPoint(aVarA.b, aVarA.a);
    }

    static com.baidu.mapsdkplatform.comapi.util.b.a a(com.baidu.mapsdkplatform.comapi.util.b.a aVar, double[] dArr) {
        com.baidu.mapsdkplatform.comapi.util.b.a aVar2 = new com.baidu.mapsdkplatform.comapi.util.b.a();
        aVar2.a = dArr[0] + (dArr[1] * java.lang.Math.abs(aVar.a));
        double dAbs = java.lang.Math.abs(aVar.b) / dArr[9];
        aVar2.b = dArr[2] + (dArr[3] * dAbs) + (dArr[4] * dAbs * dAbs) + (dArr[5] * dAbs * dAbs * dAbs) + (dArr[6] * dAbs * dAbs * dAbs * dAbs) + (dArr[7] * dAbs * dAbs * dAbs * dAbs * dAbs) + (dArr[8] * dAbs * dAbs * dAbs * dAbs * dAbs * dAbs);
        aVar2.a *= (double) (aVar.a < 0.0d ? -1 : 1);
        aVar2.b *= (double) (aVar.b < 0.0d ? -1 : 1);
        return aVar2;
    }

    public static com.baidu.mapapi.model.LatLng b(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("strkey", str);
        com.baidu.mapsdkplatform.comjni.tools.JNITools.TransNodeStr2Pt(bundle);
        return a(new com.baidu.mapapi.model.inner.GeoPoint(bundle.getDouble("pty"), bundle.getDouble("ptx")));
    }

    public static com.baidu.mapapi.model.inner.Point b(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.baidu.mapsdkplatform.comjni.tools.JNITools.CoordinateEncryptMc((float) latLng.longitude, (float) latLng.latitude, bundle);
        com.baidu.mapapi.model.inner.Point point = new com.baidu.mapapi.model.inner.Point(0, 0);
        point.setmPtx((int) bundle.getDouble("x"));
        point.setmPty((int) bundle.getDouble("y"));
        return point;
    }

    public static java.util.List<com.baidu.mapapi.model.LatLng> c(java.lang.String str) {
        com.baidu.mapapi.model.inner.a aVarA = com.baidu.mapsdkplatform.comjni.tools.a.a(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (aVarA == null || aVarA.d == null) {
            return null;
        }
        java.util.ArrayList<java.util.ArrayList<com.baidu.mapapi.model.inner.Point>> arrayList2 = aVarA.d;
        if (arrayList2.size() > 0) {
            java.util.ArrayList<com.baidu.mapapi.model.inner.Point> arrayList3 = arrayList2.get(0);
            for (int i = 0; i < arrayList3.size(); i++) {
                com.baidu.mapapi.model.inner.Point point = arrayList3.get(i);
                arrayList.add(com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(a(new com.baidu.mapapi.model.inner.GeoPoint(point.y / 100, point.x / 100))) : a(new com.baidu.mapapi.model.inner.GeoPoint(point.y / 100, point.x / 100)));
            }
        }
        return arrayList;
    }

    public static java.util.List<java.util.List<com.baidu.mapapi.model.LatLng>> d(java.lang.String str) {
        com.baidu.mapapi.model.inner.a aVarA = com.baidu.mapsdkplatform.comjni.tools.a.a(str);
        if (aVarA == null || aVarA.d == null) {
            return null;
        }
        java.util.ArrayList<java.util.ArrayList<com.baidu.mapapi.model.inner.Point>> arrayList = aVarA.d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.ArrayList<com.baidu.mapapi.model.inner.Point> arrayList3 : arrayList) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (com.baidu.mapapi.model.inner.Point point : arrayList3) {
                arrayList4.add(com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 ? com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(a(new com.baidu.mapapi.model.inner.GeoPoint(point.y / 100, point.x / 100))) : a(new com.baidu.mapapi.model.inner.GeoPoint(point.y / 100, point.x / 100)));
            }
            arrayList2.add(arrayList4);
        }
        return arrayList2;
    }
}
