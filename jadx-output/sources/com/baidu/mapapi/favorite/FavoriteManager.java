package com.baidu.mapapi.favorite;

/* JADX INFO: loaded from: classes.dex */
public class FavoriteManager {
    private static com.baidu.mapapi.favorite.FavoriteManager a;
    private static com.baidu.mapsdkplatform.comapi.favrite.a b;

    private FavoriteManager() {
    }

    public static com.baidu.mapapi.favorite.FavoriteManager getInstance() {
        if (a == null) {
            a = new com.baidu.mapapi.favorite.FavoriteManager();
        }
        return a;
    }

    public int add(com.baidu.mapapi.favorite.FavoritePoiInfo favoritePoiInfo) {
        java.lang.String str;
        if (b == null) {
            str = "you may have not call init method!";
        } else {
            if (favoritePoiInfo != null && favoritePoiInfo.c != null) {
                if (favoritePoiInfo.b == null || favoritePoiInfo.b.equals("")) {
                    android.util.Log.e("baidumapsdk", "poiName can not be null or empty!");
                    return -1;
                }
                com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoiA = com.baidu.mapapi.favorite.a.a(favoritePoiInfo);
                int iA = b.a(favSyncPoiA.b, favSyncPoiA);
                if (iA == 1) {
                    favoritePoiInfo.a = favSyncPoiA.a;
                    favoritePoiInfo.g = java.lang.Long.parseLong(favSyncPoiA.h);
                }
                return iA;
            }
            str = "object or pt can not be null!";
        }
        android.util.Log.e("baidumapsdk", str);
        return 0;
    }

    public boolean clearAllFavPois() {
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = b;
        if (aVar != null) {
            return aVar.c();
        }
        android.util.Log.e("baidumapsdk", "you may have not call init method!");
        return false;
    }

    public boolean deleteFavPoi(java.lang.String str) {
        if (b == null) {
            android.util.Log.e("baidumapsdk", "you may have not call init method!");
            return false;
        }
        if (str == null || str.equals("")) {
            return false;
        }
        return b.a(str);
    }

    public void destroy() {
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = b;
        if (aVar != null) {
            aVar.b();
            b = null;
            com.baidu.mapapi.BMapManager.destroy();
            com.baidu.mapsdkplatform.comapi.map.k.b();
        }
    }

    public java.util.List<com.baidu.mapapi.favorite.FavoritePoiInfo> getAllFavPois() {
        org.json.JSONArray jSONArrayOptJSONArray;
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = b;
        if (aVar == null) {
            android.util.Log.e("baidumapsdk", "you may have not call init method!");
            return null;
        }
        java.lang.String strF = aVar.f();
        if (strF != null && !strF.equals("")) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strF);
                if (jSONObject.optInt("favpoinum") != 0 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("favcontents")) != null && jSONArrayOptJSONArray.length() > 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            arrayList.add(com.baidu.mapapi.favorite.a.a(jSONObject2));
                        }
                    }
                    return arrayList;
                }
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public com.baidu.mapapi.favorite.FavoritePoiInfo getFavPoi(java.lang.String str) {
        com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoiB;
        if (b == null) {
            android.util.Log.e("baidumapsdk", "you may have not call init method!");
            return null;
        }
        if (str == null || str.equals("") || (favSyncPoiB = b.b(str)) == null) {
            return null;
        }
        return com.baidu.mapapi.favorite.a.a(favSyncPoiB);
    }

    public void init() {
        if (b == null) {
            com.baidu.mapsdkplatform.comapi.map.k.a();
            com.baidu.mapapi.BMapManager.init();
            b = com.baidu.mapsdkplatform.comapi.favrite.a.a();
        }
    }

    public boolean updateFavPoi(java.lang.String str, com.baidu.mapapi.favorite.FavoritePoiInfo favoritePoiInfo) {
        java.lang.String str2;
        if (b == null) {
            str2 = "you may have not call init method!";
        } else {
            if (str == null || str.equals("") || favoritePoiInfo == null) {
                return false;
            }
            if (favoritePoiInfo == null || favoritePoiInfo.c == null) {
                str2 = "object or pt can not be null!";
            } else {
                if (favoritePoiInfo.b != null && !favoritePoiInfo.b.equals("")) {
                    favoritePoiInfo.a = str;
                    return b.b(str, com.baidu.mapapi.favorite.a.a(favoritePoiInfo));
                }
                str2 = "poiName can not be null or empty!";
            }
        }
        android.util.Log.e("baidumapsdk", str2);
        return false;
    }
}
