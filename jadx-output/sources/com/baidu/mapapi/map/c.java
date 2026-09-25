package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class c implements com.baidu.mapsdkplatform.comapi.map.n {
    final /* synthetic */ com.baidu.mapapi.map.BaiduMap a;

    c(com.baidu.mapapi.map.BaiduMap baiduMap) {
        this.a = baiduMap;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a() {
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(android.graphics.Bitmap bitmap) {
        if (this.a.B != null) {
            this.a.B.onSnapshotReady(bitmap);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(android.view.MotionEvent motionEvent) {
        if (this.a.r != null) {
            this.a.r.onTouch(motionEvent);
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        if (this.a.s != null) {
            this.a.s.onMapClick(com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (!this.a.K.values().isEmpty()) {
            for (com.baidu.mapapi.map.InfoWindow infoWindow : this.a.K.values()) {
                if (infoWindow.b != null && !infoWindow.i) {
                    infoWindow.b.setVisibility(4);
                }
            }
        }
        int i = (com.baidu.mapapi.map.BaiduMap.mapStatusReason & 256) == 256 ? 3 : (com.baidu.mapapi.map.BaiduMap.mapStatusReason & 16) == 16 ? 2 : 1;
        if (this.a.q != null) {
            com.baidu.mapapi.map.MapStatus mapStatusA = com.baidu.mapapi.map.MapStatus.a(adVar);
            this.a.q.onMapStatusChangeStart(mapStatusA);
            this.a.q.onMapStatusChangeStart(mapStatusA, i);
        }
        if (this.a.F != null) {
            this.a.F.onMapStatusChangeReason(i);
        }
        com.baidu.mapapi.map.BaiduMap.mapStatusReason = 0;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(java.lang.String str) {
        com.baidu.mapsdkplatform.comapi.map.ad adVarE;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONArray("dataset").optJSONObject(0);
            com.baidu.mapapi.model.inner.GeoPoint geoPointB = this.a.i.b(jSONObject.optInt("px"), jSONObject.optInt("py"));
            int iOptInt = jSONObjectOptJSONObject.optInt("ty");
            if (iOptInt == 17) {
                if (this.a.s != null) {
                    com.baidu.mapapi.map.MapPoi mapPoi = new com.baidu.mapapi.map.MapPoi();
                    mapPoi.a(jSONObjectOptJSONObject);
                    this.a.s.onMapPoiClick(mapPoi);
                    return;
                }
                return;
            }
            if (iOptInt != 18) {
                if (iOptInt == 19) {
                    if (this.a.i == null || (adVarE = this.a.i.E()) == null) {
                        return;
                    }
                    adVarE.c = 0;
                    adVarE.b = 0;
                    com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 16;
                    this.a.i.a(adVarE, 300);
                    return;
                }
                if (iOptInt != 90909) {
                    if (iOptInt == 90910) {
                        java.lang.String strOptString = jSONObjectOptJSONObject.optString("polyline_id");
                        for (com.baidu.mapapi.map.Overlay overlay : this.a.k) {
                            if ((overlay instanceof com.baidu.mapapi.map.Polyline) && overlay.z.equals(strOptString)) {
                                if (this.a.y.isEmpty()) {
                                    a(geoPointB);
                                } else {
                                    java.util.Iterator it = this.a.y.iterator();
                                    while (it.hasNext()) {
                                        ((com.baidu.mapapi.map.BaiduMap.OnPolylineClickListener) it.next()).onPolylineClick((com.baidu.mapapi.map.Polyline) overlay);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("marker_id");
                java.util.Set<java.lang.String> setKeySet = this.a.K.keySet();
                if (!setKeySet.isEmpty() && setKeySet.contains(strOptString2)) {
                    for (java.lang.String str2 : setKeySet) {
                        if (str2 != null && str2.equals(strOptString2)) {
                            com.baidu.mapapi.map.InfoWindow infoWindow = (com.baidu.mapapi.map.InfoWindow) this.a.K.get(str2);
                            if (infoWindow != null && infoWindow.d != null) {
                                infoWindow.d.onInfoWindowClick();
                                return;
                            }
                        }
                    }
                    return;
                }
                for (com.baidu.mapapi.map.Overlay overlay2 : this.a.k) {
                    if ((overlay2 instanceof com.baidu.mapapi.map.Marker) && overlay2.z.equals(strOptString2)) {
                        if (!this.a.x.isEmpty()) {
                            java.util.Iterator it2 = this.a.x.iterator();
                            while (it2.hasNext()) {
                                ((com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener) it2.next()).onMarkerClick((com.baidu.mapapi.map.Marker) overlay2);
                            }
                            return;
                        }
                        a(geoPointB);
                    }
                }
                return;
            }
            if (this.a.A != null) {
                this.a.A.onMyLocationClick();
                return;
            }
            a(geoPointB);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(javax.microedition.khronos.opengles.GL10 gl10, com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (this.a.C != null) {
            this.a.C.onMapDrawFrame(com.baidu.mapapi.map.MapStatus.a(adVar));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(boolean z) {
        if (this.a.D != null) {
            this.a.D.onBaseIndoorMapMode(z, this.a.getFocusedBaseIndoorMapInfo());
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void a(boolean z, int i) {
        if (this.a.E != null) {
            this.a.E.onMapRenderValidData(z, i, this.a.a(i));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void b() {
        com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
        baiduMap.f = new com.baidu.mapapi.map.Projection(baiduMap.i);
        this.a.S = true;
        if (this.a.t != null) {
            this.a.t.onMapLoaded();
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void b(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        if (this.a.v != null) {
            this.a.v.onMapDoubleClick(com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void b(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (this.a.q != null) {
            this.a.q.onMapStatusChange(com.baidu.mapapi.map.MapStatus.a(adVar));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public boolean b(java.lang.String str) {
        try {
            org.json.JSONObject jSONObjectOptJSONObject = new org.json.JSONObject(str).optJSONArray("dataset").optJSONObject(0);
            if (jSONObjectOptJSONObject.optInt("ty") != 90909) {
                return false;
            }
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("marker_id");
            java.util.Set setKeySet = this.a.K.keySet();
            if (!setKeySet.isEmpty() && setKeySet.contains(strOptString)) {
                return false;
            }
            for (com.baidu.mapapi.map.Overlay overlay : this.a.k) {
                if ((overlay instanceof com.baidu.mapapi.map.Marker) && overlay.z.equals(strOptString)) {
                    com.baidu.mapapi.map.Marker marker = (com.baidu.mapapi.map.Marker) overlay;
                    if (!marker.f) {
                        return false;
                    }
                    this.a.M = marker;
                    android.graphics.Point screenLocation = this.a.f.toScreenLocation(this.a.M.a);
                    this.a.M.setPosition(this.a.f.fromScreenLocation(new android.graphics.Point(screenLocation.x, screenLocation.y - 60)));
                    if (this.a.z != null) {
                        this.a.z.onMarkerDragStart(this.a.M);
                    }
                    return true;
                }
            }
            return false;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void c() {
        if (this.a.u != null) {
            this.a.u.onMapRenderFinished();
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void c(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        if (this.a.w != null) {
            this.a.w.onMapLongClick(com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void c(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (!this.a.K.values().isEmpty()) {
            java.util.Iterator it = this.a.K.values().iterator();
            while (it.hasNext()) {
                android.view.View view = ((com.baidu.mapapi.map.InfoWindow) it.next()).b;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }
        if (this.a.q != null) {
            this.a.q.onMapStatusChangeFinish(com.baidu.mapapi.map.MapStatus.a(adVar));
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void d() {
        this.a.I.lock();
        try {
            if (this.a.H != null) {
                this.a.H.a();
            }
        } finally {
            this.a.I.unlock();
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void d(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        if (this.a.M == null || !this.a.M.f) {
            return;
        }
        android.graphics.Point screenLocation = this.a.f.toScreenLocation(com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint));
        this.a.M.setPosition(this.a.f.fromScreenLocation(new android.graphics.Point(screenLocation.x, screenLocation.y - 60)));
        if (this.a.z == null || !this.a.M.f) {
            return;
        }
        this.a.z.onMarkerDrag(this.a.M);
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void e() {
        this.a.I.lock();
        try {
            if (this.a.H != null && this.a.i != null) {
                this.a.H.a();
                this.a.i.o();
            }
        } finally {
            this.a.I.unlock();
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void e(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        if (this.a.M == null || !this.a.M.f) {
            return;
        }
        android.graphics.Point screenLocation = this.a.f.toScreenLocation(com.baidu.mapapi.model.CoordUtil.mc2ll(geoPoint));
        this.a.M.setPosition(this.a.f.fromScreenLocation(new android.graphics.Point(screenLocation.x, screenLocation.y - 60)));
        if (this.a.z != null && this.a.M.f) {
            this.a.z.onMarkerDragEnd(this.a.M);
        }
        this.a.M = null;
    }

    @Override // com.baidu.mapsdkplatform.comapi.map.n
    public void f() {
        if (this.a.i != null) {
            this.a.i.b(false);
        }
        this.a.I.lock();
        try {
            if (this.a.H != null) {
                com.baidu.mapapi.map.BaiduMap baiduMap = this.a;
                baiduMap.a(baiduMap.H);
            }
        } finally {
            this.a.I.unlock();
        }
    }
}
