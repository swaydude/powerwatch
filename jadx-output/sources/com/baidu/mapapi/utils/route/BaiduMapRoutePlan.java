package com.baidu.mapapi.utils.route;

/* JADX INFO: loaded from: classes.dex */
public class BaiduMapRoutePlan {
    private static boolean a = true;

    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    private static void a(com.baidu.mapapi.utils.route.RouteParaOption routeParaOption, android.content.Context context, int i) {
        com.baidu.mapapi.model.LatLng latLngGcjToBaidu;
        java.lang.String str;
        java.lang.String cityName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("http://api.map.baidu.com/direction?");
        sb.append("origin=");
        com.baidu.mapapi.model.LatLng latLngGcjToBaidu2 = routeParaOption.a;
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 && latLngGcjToBaidu2 != null) {
            latLngGcjToBaidu2 = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLngGcjToBaidu2);
        }
        if (routeParaOption.a == null || routeParaOption.c == null || routeParaOption.c.equals("") || latLngGcjToBaidu2 == null) {
            if (routeParaOption.a != null && latLngGcjToBaidu2 != null) {
                sb.append(latLngGcjToBaidu2.latitude);
                sb.append(",");
                sb.append(latLngGcjToBaidu2.longitude);
            }
            latLngGcjToBaidu = routeParaOption.b;
            if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02 && latLngGcjToBaidu != null) {
                latLngGcjToBaidu = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLngGcjToBaidu);
            }
            sb.append("&destination=");
            if (routeParaOption.b != null || routeParaOption.d == null || routeParaOption.d.equals("") || latLngGcjToBaidu == null) {
                if (routeParaOption.b == null && latLngGcjToBaidu != null) {
                    sb.append(latLngGcjToBaidu.latitude);
                    sb.append(",");
                    sb.append(latLngGcjToBaidu.longitude);
                }
                if (i == 0) {
                    str = "driving";
                } else if (i == 1) {
                    str = "transit";
                } else if (i != 2) {
                    str = "";
                } else {
                    str = com.google.android.gms.fitness.FitnessActivities.WALKING;
                }
                sb.append("&mode=");
                sb.append(str);
                sb.append("&region=");
                if (routeParaOption.getCityName() != null || routeParaOption.getCityName().equals("")) {
                    cityName = "全国";
                } else {
                    cityName = routeParaOption.getCityName();
                }
                sb.append(cityName);
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
            sb.append("latlng:");
            sb.append(latLngGcjToBaidu.latitude);
            sb.append(",");
            sb.append(latLngGcjToBaidu.longitude);
            sb.append("|");
            sb.append("name:");
            sb.append(routeParaOption.d);
            if (i == 0) {
                str = "driving";
            } else if (i == 1) {
                str = "transit";
            } else if (i != 2) {
                str = "";
            } else {
                str = com.google.android.gms.fitness.FitnessActivities.WALKING;
            }
            sb.append("&mode=");
            sb.append(str);
            sb.append("&region=");
            if (routeParaOption.getCityName() != null) {
                cityName = "全国";
            } else {
                cityName = "全国";
            }
            sb.append(cityName);
            sb.append("&output=html");
            sb.append("&src=");
            sb.append(context.getPackageName());
            android.net.Uri uri2 = android.net.Uri.parse(sb.toString());
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
            intent2.setData(uri2);
            context.startActivity(intent2);
        }
        sb.append("latlng:");
        sb.append(latLngGcjToBaidu2.latitude);
        sb.append(",");
        sb.append(latLngGcjToBaidu2.longitude);
        sb.append("|");
        sb.append("name:");
        sb.append(routeParaOption.c);
        latLngGcjToBaidu = routeParaOption.b;
        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
            latLngGcjToBaidu = com.baidu.mapsdkplatform.comapi.util.CoordTrans.gcjToBaidu(latLngGcjToBaidu);
        }
        sb.append("&destination=");
        if (routeParaOption.b != null) {
            if (routeParaOption.b == null) {
                sb.append(routeParaOption.d);
            } else {
                sb.append(routeParaOption.d);
            }
        } else if (routeParaOption.b == null) {
            sb.append(routeParaOption.d);
        } else {
            sb.append(routeParaOption.d);
        }
        if (i == 0) {
            str = "driving";
        } else if (i == 1) {
            str = "transit";
        } else if (i != 2) {
            str = "";
        } else {
            str = com.google.android.gms.fitness.FitnessActivities.WALKING;
        }
        sb.append("&mode=");
        sb.append(str);
        sb.append("&region=");
        if (routeParaOption.getCityName() != null) {
            cityName = "全国";
        } else {
            cityName = "全国";
        }
        sb.append(cityName);
        sb.append("&output=html");
        sb.append("&src=");
        sb.append(context.getPackageName());
        android.net.Uri uri3 = android.net.Uri.parse(sb.toString());
        android.content.Intent intent3 = new android.content.Intent();
        intent3.setAction("android.intent.action.VIEW");
        intent3.setFlags(net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
        intent3.setData(uri3);
        context.startActivity(intent3);
    }

    public static void finish(android.content.Context context) {
        if (context != null) {
            com.baidu.mapapi.utils.b.a(context);
        }
    }

    public static boolean openBaiduMapDrivingRoute(com.baidu.mapapi.utils.route.RouteParaOption routeParaOption, android.content.Context context) {
        if (routeParaOption == null || context == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (routeParaOption.b == null && routeParaOption.a == null && routeParaOption.d == null && routeParaOption.c == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: startPoint and endPoint and endName and startName not all null.");
        }
        if (routeParaOption.c == null && routeParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.d == null && routeParaOption.b == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if (((routeParaOption.c == null || routeParaOption.c.equals("")) && routeParaOption.a == null) || ((routeParaOption.d == null || routeParaOption.d.equals("")) && routeParaOption.b == null)) {
            android.util.Log.e(com.baidu.mapapi.utils.route.BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f == null) {
            routeParaOption.f = com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            android.util.Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!a) {
                throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 0);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.b.a(routeParaOption, context, 0);
        }
        android.util.Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!a) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 0);
        return true;
    }

    public static boolean openBaiduMapTransitRoute(com.baidu.mapapi.utils.route.RouteParaOption routeParaOption, android.content.Context context) {
        if (routeParaOption == null || context == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (routeParaOption.b == null && routeParaOption.a == null && routeParaOption.d == null && routeParaOption.c == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: startPoint and endPoint and endName and startName not all null.");
        }
        if (routeParaOption.c == null && routeParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.d == null && routeParaOption.b == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if (((routeParaOption.c == null || routeParaOption.c.equals("")) && routeParaOption.a == null) || ((routeParaOption.d == null || routeParaOption.d.equals("")) && routeParaOption.b == null)) {
            android.util.Log.e(com.baidu.mapapi.utils.route.BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f == null) {
            routeParaOption.f = com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            android.util.Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!a) {
                throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 1);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.b.a(routeParaOption, context, 1);
        }
        android.util.Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!a) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 1);
        return true;
    }

    public static boolean openBaiduMapWalkingRoute(com.baidu.mapapi.utils.route.RouteParaOption routeParaOption, android.content.Context context) {
        if (routeParaOption == null || context == null) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: para or context can not be null.");
        }
        if (routeParaOption.b == null && routeParaOption.a == null && routeParaOption.d == null && routeParaOption.c == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: startPoint and endPoint and endName and startName not all null.");
        }
        if (routeParaOption.c == null && routeParaOption.a == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: startPoint and startName not all null.");
        }
        if (routeParaOption.d == null && routeParaOption.b == null) {
            throw new com.baidu.mapapi.navi.IllegalNaviArgumentException("BDMapSDKException: endPoint and endName not all null.");
        }
        if (((routeParaOption.c == null || routeParaOption.c.equals("")) && routeParaOption.a == null) || ((routeParaOption.d == null || routeParaOption.d.equals("")) && routeParaOption.b == null)) {
            android.util.Log.e(com.baidu.mapapi.utils.route.BaiduMapRoutePlan.class.getName(), "poi startName or endName can not be empty string while pt is null");
            return false;
        }
        if (routeParaOption.f == null) {
            routeParaOption.f = com.baidu.mapapi.utils.route.RouteParaOption.EBusStrategyType.bus_recommend_way;
        }
        int baiduMapVersion = com.baidu.mapapi.utils.OpenClientUtil.getBaiduMapVersion(context);
        if (baiduMapVersion == 0) {
            android.util.Log.e("baidumapsdk", "BaiduMap app is not installed.");
            if (!a) {
                throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: BaiduMap app is not installed.");
            }
            a(routeParaOption, context, 2);
            return true;
        }
        if (baiduMapVersion >= 810) {
            return com.baidu.mapapi.utils.b.a(routeParaOption, context, 2);
        }
        android.util.Log.e("baidumapsdk", "Baidumap app version is too lowl.Version is greater than 8.1");
        if (!a) {
            throw new com.baidu.mapapi.utils.poi.IllegalPoiSearchArgumentException("BDMapSDKException: Baidumap app version is too lowl.Version is greater than 8.1");
        }
        a(routeParaOption, context, 2);
        return true;
    }

    public static void setSupportWebRoute(boolean z) {
        a = z;
    }
}
