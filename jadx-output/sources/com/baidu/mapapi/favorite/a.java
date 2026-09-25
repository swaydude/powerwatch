package com.baidu.mapapi.favorite;

/* JADX INFO: loaded from: classes.dex */
class a {
    static com.baidu.mapapi.favorite.FavoritePoiInfo a(com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoi) {
        if (favSyncPoi == null || favSyncPoi.c == null || favSyncPoi.b.equals("")) {
            return null;
        }
        com.baidu.mapapi.favorite.FavoritePoiInfo favoritePoiInfo = new com.baidu.mapapi.favorite.FavoritePoiInfo();
        favoritePoiInfo.a = favSyncPoi.a;
        favoritePoiInfo.b = favSyncPoi.b;
        favoritePoiInfo.c = new com.baidu.mapapi.model.LatLng(((double) favSyncPoi.c.y) / 1000000.0d, ((double) favSyncPoi.c.x) / 1000000.0d);
        favoritePoiInfo.e = favSyncPoi.e;
        favoritePoiInfo.f = favSyncPoi.f;
        favoritePoiInfo.d = favSyncPoi.d;
        favoritePoiInfo.g = java.lang.Long.parseLong(favSyncPoi.h);
        return favoritePoiInfo;
    }

    static com.baidu.mapapi.favorite.FavoritePoiInfo a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.baidu.mapapi.favorite.FavoritePoiInfo favoritePoiInfo = new com.baidu.mapapi.favorite.FavoritePoiInfo();
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pt");
        if (jSONObjectOptJSONObject != null) {
            favoritePoiInfo.c = new com.baidu.mapapi.model.LatLng(((double) jSONObjectOptJSONObject.optInt("y")) / 1000000.0d, ((double) jSONObjectOptJSONObject.optInt("x")) / 1000000.0d);
        }
        favoritePoiInfo.b = jSONObject.optString("uspoiname");
        favoritePoiInfo.g = java.lang.Long.parseLong(jSONObject.optString("addtimesec"));
        favoritePoiInfo.d = jSONObject.optString("addr");
        favoritePoiInfo.f = jSONObject.optString("uspoiuid");
        favoritePoiInfo.e = jSONObject.optString("ncityid");
        favoritePoiInfo.a = jSONObject.optString("key");
        return favoritePoiInfo;
    }

    static com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi a(com.baidu.mapapi.favorite.FavoritePoiInfo favoritePoiInfo) {
        if (favoritePoiInfo == null || favoritePoiInfo.c == null || favoritePoiInfo.b == null || favoritePoiInfo.b.equals("")) {
            return null;
        }
        com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoi = new com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi();
        favSyncPoi.b = favoritePoiInfo.b;
        favSyncPoi.c = new com.baidu.mapapi.model.inner.Point((int) (favoritePoiInfo.c.longitude * 1000000.0d), (int) (favoritePoiInfo.c.latitude * 1000000.0d));
        favSyncPoi.d = favoritePoiInfo.d;
        favSyncPoi.e = favoritePoiInfo.e;
        favSyncPoi.f = favoritePoiInfo.f;
        favSyncPoi.i = false;
        return favSyncPoi;
    }
}
