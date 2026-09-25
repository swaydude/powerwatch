package com.baidu.mapapi.utils;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static int a = -1;
    private static final java.lang.String c = "com.baidu.mapapi.utils.b";
    private static com.baidu.mapframework.open.aidl.a d;
    private static com.baidu.mapframework.open.aidl.IComOpenClient e;
    private static int f;
    private static java.lang.String g;
    private static java.lang.String h;
    private static java.lang.String i;
    private static com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType o;
    private static java.lang.Thread v;
    private static java.util.List<com.baidu.mapapi.utils.poi.DispathcPoiData> j = new java.util.ArrayList();
    private static com.baidu.mapapi.model.LatLng k = null;
    private static com.baidu.mapapi.model.LatLng l = null;
    private static java.lang.String m = null;
    private static java.lang.String n = null;
    private static java.lang.String p = null;
    private static java.lang.String q = null;
    private static com.baidu.mapapi.model.LatLng r = null;
    private static int s = 0;
    private static boolean t = false;
    private static boolean u = false;
    static android.content.ServiceConnection b = new com.baidu.mapapi.utils.d();

    public static java.lang.String a() {
        return com.baidu.mapapi.common.AppTools.getBaiduMapToken();
    }

    public static void a(int i2, android.content.Context context) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
                c(context, i2);
                break;
            case 3:
                c(context);
                break;
            case 4:
                d(context);
                break;
            case 5:
                e(context);
                break;
            case 7:
                f(context);
                break;
            case 8:
                g(context);
                break;
            case 9:
                h(context);
                break;
        }
    }

    public static void a(android.content.Context context) {
        if (u) {
            context.unbindService(b);
            u = false;
        }
    }

    private static void a(java.util.List<com.baidu.mapapi.utils.poi.DispathcPoiData> list, android.content.Context context) {
        g = context.getPackageName();
        h = b(context);
        i = "";
        java.util.List<com.baidu.mapapi.utils.poi.DispathcPoiData> list2 = j;
        if (list2 != null) {
            list2.clear();
        }
        java.util.Iterator<com.baidu.mapapi.utils.poi.DispathcPoiData> it = list.iterator();
        while (it.hasNext()) {
            j.add(it.next());
        }
    }

    public static boolean a(int i2) {
        switch (i2) {
            case 0:
            case 1:
            case 2:
                return g();
            case 3:
                return h();
            case 4:
                return m();
            case 5:
                return j();
            case 6:
                return i();
            case 7:
                return k();
            case 8:
                return l();
            default:
                return false;
        }
    }

    public static boolean a(android.content.Context context, int i2) {
        try {
            if (!com.baidu.platform.comapi.a.a.a(context)) {
                android.util.Log.d(c, "package sign verify failed");
                return false;
            }
            t = false;
            switch (i2) {
                case 0:
                    a = 0;
                    break;
                case 1:
                    a = 1;
                    break;
                case 2:
                    a = 2;
                    break;
                case 3:
                    a = 3;
                    break;
                case 4:
                    a = 4;
                    break;
                case 5:
                    a = 5;
                    break;
                case 6:
                    a = 6;
                    break;
                case 7:
                    a = 7;
                    break;
                case 8:
                    a = 8;
                    break;
                case 9:
                    a = 9;
                    break;
            }
            if (i2 == 9) {
                u = false;
            }
            com.baidu.mapframework.open.aidl.a aVar = d;
            if (aVar == null || !u) {
                b(context, i2);
            } else {
                if (e != null) {
                    t = true;
                    return a(i2);
                }
                aVar.a(new com.baidu.mapapi.utils.c(i2));
            }
            return true;
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean a(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context, int i2) {
        b(naviParaOption, context, i2);
        return a(context, i2);
    }

    public static boolean a(com.baidu.mapapi.utils.poi.PoiParaOption poiParaOption, android.content.Context context, int i2) {
        b(poiParaOption, context, i2);
        return a(context, i2);
    }

    public static boolean a(com.baidu.mapapi.utils.route.RouteParaOption routeParaOption, android.content.Context context, int i2) {
        b(routeParaOption, context, i2);
        return a(context, i2);
    }

    public static boolean a(java.util.List<com.baidu.mapapi.utils.poi.DispathcPoiData> list, android.content.Context context, int i2) {
        a(list, context);
        return a(context, i2);
    }

    public static java.lang.String b(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        android.content.pm.ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (java.lang.String) packageManager.getApplicationLabel(applicationInfo);
    }

    private static void b(android.content.Context context, int i2) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String strA = a();
        if (strA == null) {
            return;
        }
        intent.putExtra("api_token", strA);
        intent.setAction("com.baidu.map.action.OPEN_SERVICE");
        intent.setPackage("com.baidu.BaiduMap");
        if (i2 != 9) {
            u = context.bindService(intent, b, 1);
        }
        if (!u) {
            android.util.Log.e("baidumapsdk", "bind service failed，call openapi");
            a(i2, context);
        } else {
            java.lang.Thread thread = new java.lang.Thread(new com.baidu.mapapi.utils.f(context, i2));
            v = thread;
            thread.setDaemon(true);
            v.start();
        }
    }

    private static void b(com.baidu.mapapi.navi.NaviParaOption naviParaOption, android.content.Context context, int i2) {
        g = context.getPackageName();
        m = null;
        k = null;
        n = null;
        l = null;
        if (naviParaOption.getStartPoint() != null) {
            k = naviParaOption.getStartPoint();
        }
        if (naviParaOption.getEndPoint() != null) {
            l = naviParaOption.getEndPoint();
        }
        if (naviParaOption.getStartName() != null) {
            m = naviParaOption.getStartName();
        }
        if (naviParaOption.getEndName() != null) {
            n = naviParaOption.getEndName();
        }
    }

    private static void b(com.baidu.mapapi.utils.poi.PoiParaOption poiParaOption, android.content.Context context, int i2) {
        p = null;
        q = null;
        r = null;
        s = 0;
        g = context.getPackageName();
        if (poiParaOption.getUid() != null) {
            p = poiParaOption.getUid();
        }
        if (poiParaOption.getKey() != null) {
            q = poiParaOption.getKey();
        }
        if (poiParaOption.getCenter() != null) {
            r = poiParaOption.getCenter();
        }
        if (poiParaOption.getRadius() != 0) {
            s = poiParaOption.getRadius();
        }
    }

    private static void b(com.baidu.mapapi.utils.route.RouteParaOption routeParaOption, android.content.Context context, int i2) {
        int i3;
        m = null;
        k = null;
        n = null;
        l = null;
        g = context.getPackageName();
        if (routeParaOption.getStartPoint() != null) {
            k = routeParaOption.getStartPoint();
        }
        if (routeParaOption.getEndPoint() != null) {
            l = routeParaOption.getEndPoint();
        }
        if (routeParaOption.getStartName() != null) {
            m = routeParaOption.getStartName();
        }
        if (routeParaOption.getEndName() != null) {
            n = routeParaOption.getEndName();
        }
        if (routeParaOption.getBusStrategyType() != null) {
            o = routeParaOption.getBusStrategyType();
        }
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    return;
                }
            }
        } else {
            i3 = 0;
        }
        f = i3;
    }

    private static void c(android.content.Context context) {
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/place/detail?");
        sb.append("uid=");
        sb.append(p);
        sb.append("&show_type=");
        sb.append("detail_page");
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[PHI: r2
      0x00a8: PHI (r2v19 com.baidu.mapapi.model.LatLng) = (r2v16 com.baidu.mapapi.model.LatLng), (r2v25 com.baidu.mapapi.model.LatLng) binds: [B:37:0x00c8, B:31:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    private static void c(android.content.Context context, int i2) {
        com.baidu.mapapi.model.LatLng latLng;
        com.baidu.mapapi.model.LatLng latLng2;
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.String[] strArr = {"driving", "transit", com.google.android.gms.fitness.FitnessActivities.WALKING};
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/direction?");
        sb.append("origin=");
        if (k != null && com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
        }
        if (android.text.TextUtils.isEmpty(m) || k == null) {
            if (android.text.TextUtils.isEmpty(m)) {
                latLng = k;
                if (latLng != null) {
                }
            } else {
                sb.append(m);
            }
            sb.append("&destination=");
            if (l != null && com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
            }
            if (!android.text.TextUtils.isEmpty(n) || l == null) {
                if (android.text.TextUtils.isEmpty(n)) {
                    latLng2 = l;
                    if (latLng2 != null) {
                    }
                } else {
                    sb.append(n);
                }
                sb.append("&mode=");
                sb.append(strArr[i2]);
                sb.append("&target=");
                sb.append("1");
                sb.append("&src=");
                sb.append("sdk_[" + g + "]");
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
                intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
                context.startActivity(intent);
            }
            sb.append("name:");
            sb.append(n);
            sb.append("|latlng:");
            latLng2 = l;
            sb.append(latLng2.latitude);
            sb.append(",");
            sb.append(l.longitude);
            sb.append("&mode=");
            sb.append(strArr[i2]);
            sb.append("&target=");
            sb.append("1");
            sb.append("&src=");
            sb.append("sdk_[" + g + "]");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
            intent2.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent2);
        }
        sb.append("name:");
        sb.append(m);
        sb.append("|latlng:");
        latLng = k;
        sb.append(latLng.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&destination=");
        if (l != null) {
            l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
        }
        if (android.text.TextUtils.isEmpty(n)) {
            if (android.text.TextUtils.isEmpty(n)) {
                sb.append(n);
            } else {
                latLng2 = l;
                if (latLng2 != null) {
                    sb.append(latLng2.latitude);
                    sb.append(",");
                    sb.append(l.longitude);
                }
            }
        } else if (android.text.TextUtils.isEmpty(n)) {
            sb.append(n);
        } else {
            latLng2 = l;
            if (latLng2 != null) {
                sb.append(latLng2.latitude);
                sb.append(",");
                sb.append(l.longitude);
            }
        }
        sb.append("&mode=");
        sb.append(strArr[i2]);
        sb.append("&target=");
        sb.append("1");
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent3.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent3);
    }

    private static void d(android.content.Context context) {
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/nearbysearch?");
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            r = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(r);
        }
        sb.append("center=");
        sb.append(r.latitude);
        sb.append(",");
        sb.append(r.longitude);
        sb.append("&query=");
        sb.append(q);
        sb.append("&radius=");
        sb.append(s);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    private static void e(android.content.Context context) {
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/navi?");
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
        }
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&location=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    private static void f(android.content.Context context) {
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/walknavi?");
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
        }
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&destination=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    private static void g(android.content.Context context) {
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/bikenavi?");
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
        }
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&destination=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    private static boolean g() {
        try {
            java.lang.String str = c;
            android.util.Log.d(str, "callDispatchTakeOutRoute");
            java.lang.String strA = e.a("map.android.baidu.mainmap");
            if (strA == null) {
                android.util.Log.d(str, "callDispatchTakeOut com not found");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("target", "route_search_page");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("route_type", f);
            bundle2.putInt("bus_strategy", o.ordinal());
            bundle2.putInt("cross_city_bus_strategy", 5);
            if (k != null) {
                bundle2.putInt("start_type", 1);
                bundle2.putInt("start_longitude", (int) com.baidu.mapapi.model.CoordUtil.ll2mc(k).getLongitudeE6());
                bundle2.putInt("start_latitude", (int) com.baidu.mapapi.model.CoordUtil.ll2mc(k).getLatitudeE6());
            } else {
                bundle2.putInt("start_type", 2);
                bundle2.putInt("start_longitude", 0);
                bundle2.putInt("start_latitude", 0);
            }
            java.lang.String str2 = m;
            if (str2 != null) {
                bundle2.putString("start_keyword", str2);
            } else {
                bundle2.putString("start_keyword", "地图上的点");
            }
            bundle2.putString("start_uid", "");
            if (l != null) {
                bundle2.putInt("end_type", 1);
                bundle2.putInt("end_longitude", (int) com.baidu.mapapi.model.CoordUtil.ll2mc(l).getLongitudeE6());
                bundle2.putInt("end_latitude", (int) com.baidu.mapapi.model.CoordUtil.ll2mc(l).getLatitudeE6());
            } else {
                bundle2.putInt("end_type", 2);
                bundle2.putInt("end_longitude", 0);
                bundle2.putInt("end_latitude", 0);
            }
            java.lang.String str3 = n;
            if (str3 != null) {
                bundle2.putString("end_keyword", str3);
            } else {
                bundle2.putString("end_keyword", "地图上的点");
            }
            bundle2.putString("end_uid", "");
            bundle.putBundle("base_params", bundle2);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", strA, bundle);
        } catch (android.os.RemoteException e2) {
            android.util.Log.d(c, "callDispatchTakeOut exception", e2);
        }
    }

    private static void h(android.content.Context context) {
        java.lang.Thread thread = v;
        if (thread != null) {
            thread.interrupt();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("baidumap://map/walknavi?");
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
        }
        sb.append("origin=");
        sb.append(k.latitude);
        sb.append(",");
        sb.append(k.longitude);
        sb.append("&destination=");
        sb.append(l.latitude);
        sb.append(",");
        sb.append(l.longitude);
        sb.append("&mode=");
        sb.append("walking_ar");
        sb.append("&src=");
        sb.append("sdk_[" + g + "]");
        android.util.Log.e("test", sb.toString());
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(sb.toString()));
        intent.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        context.startActivity(intent);
    }

    private static boolean h() {
        try {
            java.lang.String str = c;
            android.util.Log.d(str, "callDispatchTakeOutPoiDetials");
            java.lang.String strA = e.a("map.android.baidu.mainmap");
            if (strA == null) {
                android.util.Log.d(str, "callDispatchTakeOut com not found");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("target", "request_poi_detail_page");
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.lang.String str2 = p;
            if (str2 == null) {
                str2 = "";
            }
            bundle2.putString("uid", str2);
            bundle.putBundle("base_params", bundle2);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", strA, bundle);
        } catch (android.os.RemoteException e2) {
            android.util.Log.d(c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }

    private static boolean i() {
        java.util.List<com.baidu.mapapi.utils.poi.DispathcPoiData> list = j;
        if (list != null && list.size() > 0) {
            try {
                java.lang.String str = c;
                android.util.Log.d(str, "callDispatchPoiToBaiduMap");
                java.lang.String strA = e.a("map.android.baidu.mainmap");
                if (strA != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("target", "favorite_page");
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    int i2 = 0;
                    for (int i3 = 0; i3 < j.size(); i3++) {
                        if (j.get(i3).name != null && !j.get(i3).name.equals("") && j.get(i3).pt != null) {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            try {
                                jSONObject.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, j.get(i3).name);
                                com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(j.get(i3).pt);
                                jSONObject.put("ptx", geoPointLl2mc.getLongitudeE6());
                                jSONObject.put("pty", geoPointLl2mc.getLatitudeE6());
                                jSONObject.put("addr", j.get(i3).addr);
                                jSONObject.put("uid", j.get(i3).uid);
                                i2++;
                                jSONArray.put(jSONObject);
                            } catch (org.json.JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (i2 == 0) {
                        return false;
                    }
                    bundle2.putString("data", jSONArray.toString());
                    bundle2.putString("from", h);
                    bundle2.putString("pkg", g);
                    bundle2.putString("cls", i);
                    bundle2.putInt("count", i2);
                    bundle.putBundle("base_params", bundle2);
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putString("launch_from", "sdk_[" + g + "]");
                    bundle.putBundle("ext_params", bundle3);
                    return e.a("map.android.baidu.mainmap", strA, bundle);
                }
                android.util.Log.d(str, "callDispatchPoiToBaiduMap com not found");
            } catch (android.os.RemoteException e3) {
                android.util.Log.d(c, "callDispatchPoiToBaiduMap exception", e3);
            }
        }
        return false;
    }

    private static boolean j() {
        try {
            java.lang.String str = c;
            android.util.Log.d(str, "callDispatchTakeOutRouteNavi");
            java.lang.String strA = e.a("map.android.baidu.mainmap");
            if (strA == null) {
                android.util.Log.d(str, "callDispatchTakeOut com not found");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("target", "navigation_page");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("coord_type", com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL);
            bundle2.putString("type", "DIS");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (m != null) {
                stringBuffer.append("name:" + m + "|");
            }
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            }
            stringBuffer.append(java.lang.String.format("latlng:%f,%f", java.lang.Double.valueOf(k.latitude), java.lang.Double.valueOf(k.longitude)));
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            if (n != null) {
                stringBuffer2.append("name:" + n + "|");
            }
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
            }
            stringBuffer2.append(java.lang.String.format("latlng:%f,%f", java.lang.Double.valueOf(l.latitude), java.lang.Double.valueOf(l.longitude)));
            bundle2.putString("origin", stringBuffer.toString());
            bundle2.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, stringBuffer2.toString());
            bundle.putBundle("base_params", bundle2);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", strA, bundle);
        } catch (android.os.RemoteException e2) {
            android.util.Log.d(c, "callDispatchTakeOut exception", e2);
        }
    }

    private static boolean k() {
        try {
            java.lang.String str = c;
            android.util.Log.d(str, "callDispatchTakeOutRouteNavi");
            java.lang.String strA = e.a("map.android.baidu.mainmap");
            if (strA == null) {
                android.util.Log.d(str, "callDispatchTakeOut com not found");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("target", "walknavi_page");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("coord_type", com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (m != null) {
                stringBuffer.append("name:" + m + "|");
            }
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            }
            stringBuffer.append(java.lang.String.format("latlng:%f,%f", java.lang.Double.valueOf(k.latitude), java.lang.Double.valueOf(k.longitude)));
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            if (n != null) {
                stringBuffer2.append("name:" + n + "|");
            }
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
            }
            stringBuffer2.append(java.lang.String.format("latlng:%f,%f", java.lang.Double.valueOf(l.latitude), java.lang.Double.valueOf(l.longitude)));
            bundle2.putString("origin", stringBuffer.toString());
            bundle2.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, stringBuffer2.toString());
            bundle.putBundle("base_params", bundle2);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", strA, bundle);
        } catch (java.lang.Exception e2) {
            android.util.Log.d(c, "callDispatchTakeOut exception", e2);
        }
    }

    private static boolean l() {
        try {
            java.lang.String str = c;
            android.util.Log.d(str, "callDispatchTakeOutRouteRidingNavi");
            java.lang.String strA = e.a("map.android.baidu.mainmap");
            if (strA == null) {
                android.util.Log.d(str, "callDispatchTakeOut com not found");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("target", "bikenavi_page");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("coord_type", com.baidu.mapsdkplatform.comapi.location.CoordinateType.BD09LL);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (m != null) {
                stringBuffer.append("name:" + m + "|");
            }
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                k = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(k);
            }
            stringBuffer.append(java.lang.String.format("latlng:%f,%f", java.lang.Double.valueOf(k.latitude), java.lang.Double.valueOf(k.longitude)));
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            if (n != null) {
                stringBuffer2.append("name:" + n + "|");
            }
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                l = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(l);
            }
            stringBuffer2.append(java.lang.String.format("latlng:%f,%f", java.lang.Double.valueOf(l.latitude), java.lang.Double.valueOf(l.longitude)));
            bundle2.putString("origin", stringBuffer.toString());
            bundle2.putString(com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, stringBuffer2.toString());
            bundle.putBundle("base_params", bundle2);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", strA, bundle);
        } catch (android.os.RemoteException e2) {
            android.util.Log.d(c, "callDispatchTakeOut exception", e2);
        }
    }

    private static boolean m() {
        try {
            java.lang.String str = c;
            android.util.Log.d(str, "callDispatchTakeOutPoiNearbySearch");
            java.lang.String strA = e.a("map.android.baidu.mainmap");
            if (strA == null) {
                android.util.Log.d(str, "callDispatchTakeOut com not found");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("target", "poi_search_page");
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.lang.String str2 = q;
            if (str2 != null) {
                bundle2.putString("search_key", str2);
            } else {
                bundle2.putString("search_key", "");
            }
            com.baidu.mapapi.model.LatLng latLng = r;
            if (latLng != null) {
                bundle2.putInt("center_pt_x", (int) com.baidu.mapapi.model.CoordUtil.ll2mc(latLng).getLongitudeE6());
                bundle2.putInt("center_pt_y", (int) com.baidu.mapapi.model.CoordUtil.ll2mc(r).getLatitudeE6());
            } else {
                bundle2.putString("search_key", "");
            }
            int i2 = s;
            if (i2 != 0) {
                bundle2.putInt("search_radius", i2);
            } else {
                bundle2.putInt("search_radius", 1000);
            }
            bundle2.putBoolean("is_direct_search", true);
            bundle2.putBoolean("is_direct_area_search", true);
            bundle.putBundle("base_params", bundle2);
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putString("launch_from", "sdk_[" + g + "]");
            bundle.putBundle("ext_params", bundle3);
            return e.a("map.android.baidu.mainmap", strA, bundle);
        } catch (android.os.RemoteException e2) {
            android.util.Log.d(c, "callDispatchTakeOut exception", e2);
            return false;
        }
    }
}
