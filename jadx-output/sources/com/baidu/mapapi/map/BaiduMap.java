package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class BaiduMap {
    public static final int MAP_TYPE_NONE = 3;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    private static final java.lang.String e = "BaiduMap";
    public static int mapStatusReason;
    private com.baidu.mapapi.map.BaiduMap.OnMyLocationClickListener A;
    private com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback B;
    private com.baidu.mapapi.map.BaiduMap.OnMapDrawFrameCallback C;
    private com.baidu.mapapi.map.BaiduMap.OnBaseIndoorMapListener D;
    private com.baidu.mapapi.map.BaiduMap.OnMapRenderValidDataListener E;
    private com.baidu.mapapi.map.BaiduMap.OnSynchronizationListener F;
    private com.baidu.mapapi.map.TileOverlay G;
    private com.baidu.mapapi.map.HeatMap H;
    private java.util.concurrent.locks.Lock I;
    private java.util.concurrent.locks.Lock J;
    private java.util.Map<java.lang.String, com.baidu.mapapi.map.InfoWindow> K;
    private java.util.Map<com.baidu.mapapi.map.InfoWindow, com.baidu.mapapi.map.Marker> L;
    private com.baidu.mapapi.map.Marker M;
    private com.baidu.mapapi.map.MyLocationData N;
    private com.baidu.mapapi.map.MyLocationConfiguration O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private android.graphics.Point T;
    com.baidu.mapapi.map.MapView a;
    com.baidu.mapapi.map.TextureMapView b;
    com.baidu.mapapi.map.WearMapView c;
    com.baidu.mapsdkplatform.comapi.map.ac d;
    private com.baidu.mapapi.map.Projection f;
    private com.baidu.mapapi.map.UiSettings g;
    private com.baidu.mapsdkplatform.comapi.map.l h;
    private com.baidu.mapsdkplatform.comapi.map.e i;
    private com.baidu.mapsdkplatform.comapi.map.ae j;
    private java.util.List<com.baidu.mapapi.map.Overlay> k;
    private java.util.List<com.baidu.mapapi.map.Marker> l;
    private java.util.List<com.baidu.mapapi.map.Marker> m;
    private java.util.List<com.baidu.mapapi.map.InfoWindow> n;
    private com.baidu.mapapi.map.Overlay.a o;
    private com.baidu.mapapi.map.InfoWindow.a p;
    private com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener q;
    private com.baidu.mapapi.map.BaiduMap.OnMapTouchListener r;
    private com.baidu.mapapi.map.BaiduMap.OnMapClickListener s;
    private com.baidu.mapapi.map.BaiduMap.OnMapLoadedCallback t;
    private com.baidu.mapapi.map.BaiduMap.OnMapRenderCallback u;
    private com.baidu.mapapi.map.BaiduMap.OnMapDoubleClickListener v;
    private com.baidu.mapapi.map.BaiduMap.OnMapLongClickListener w;
    private java.util.concurrent.CopyOnWriteArrayList<com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener> x;
    private java.util.concurrent.CopyOnWriteArrayList<com.baidu.mapapi.map.BaiduMap.OnPolylineClickListener> y;
    private com.baidu.mapapi.map.BaiduMap.OnMarkerDragListener z;

    public interface OnBaseIndoorMapListener {
        void onBaseIndoorMapMode(boolean z, com.baidu.mapapi.map.MapBaseIndoorMapInfo mapBaseIndoorMapInfo);
    }

    public interface OnMapClickListener {
        void onMapClick(com.baidu.mapapi.model.LatLng latLng);

        void onMapPoiClick(com.baidu.mapapi.map.MapPoi mapPoi);
    }

    public interface OnMapDoubleClickListener {
        void onMapDoubleClick(com.baidu.mapapi.model.LatLng latLng);
    }

    public interface OnMapDrawFrameCallback {
        void onMapDrawFrame(com.baidu.mapapi.map.MapStatus mapStatus);

        @java.lang.Deprecated
        void onMapDrawFrame(javax.microedition.khronos.opengles.GL10 gl10, com.baidu.mapapi.map.MapStatus mapStatus);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(com.baidu.mapapi.model.LatLng latLng);
    }

    public interface OnMapRenderCallback {
        void onMapRenderFinished();
    }

    public interface OnMapRenderValidDataListener {
        void onMapRenderValidData(boolean z, int i, java.lang.String str);
    }

    public interface OnMapStatusChangeListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onMapStatusChange(com.baidu.mapapi.map.MapStatus mapStatus);

        void onMapStatusChangeFinish(com.baidu.mapapi.map.MapStatus mapStatus);

        void onMapStatusChangeStart(com.baidu.mapapi.map.MapStatus mapStatus);

        void onMapStatusChangeStart(com.baidu.mapapi.map.MapStatus mapStatus, int i);
    }

    public interface OnMapTouchListener {
        void onTouch(android.view.MotionEvent motionEvent);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(com.baidu.mapapi.map.Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(com.baidu.mapapi.map.Marker marker);

        void onMarkerDragEnd(com.baidu.mapapi.map.Marker marker);

        void onMarkerDragStart(com.baidu.mapapi.map.Marker marker);
    }

    public interface OnMyLocationClickListener {
        boolean onMyLocationClick();
    }

    public interface OnPolylineClickListener {
        boolean onPolylineClick(com.baidu.mapapi.map.Polyline polyline);
    }

    public interface OnSynchronizationListener {
        void onMapStatusChangeReason(int i);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(android.graphics.Bitmap bitmap);
    }

    BaiduMap(com.baidu.mapsdkplatform.comapi.map.ae aeVar) {
        this.x = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.y = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.I = new java.util.concurrent.locks.ReentrantLock();
        this.J = new java.util.concurrent.locks.ReentrantLock();
        this.j = aeVar;
        this.i = aeVar.b();
        this.d = com.baidu.mapsdkplatform.comapi.map.ac.TextureView;
        c();
    }

    BaiduMap(com.baidu.mapsdkplatform.comapi.map.l lVar) {
        this.x = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.y = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.I = new java.util.concurrent.locks.ReentrantLock();
        this.J = new java.util.concurrent.locks.ReentrantLock();
        this.h = lVar;
        this.i = lVar.a();
        this.d = com.baidu.mapsdkplatform.comapi.map.ac.GLSurfaceView;
        c();
    }

    private android.graphics.Point a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (java.lang.String str2 : str.replaceAll("^\\{", "").replaceAll("\\}$", "").split(",")) {
            java.lang.String[] strArrSplit = str2.replaceAll("\"", "").split(":");
            if ("x".equals(strArrSplit[0])) {
                iIntValue = java.lang.Integer.valueOf(strArrSplit[1]).intValue();
            }
            if ("y".equals(strArrSplit[0])) {
                iIntValue2 = java.lang.Integer.valueOf(strArrSplit[1]).intValue();
            }
        }
        return new android.graphics.Point(iIntValue, iIntValue2);
    }

    private com.baidu.mapsdkplatform.comapi.map.ad a(com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        com.baidu.mapsdkplatform.comapi.map.ad adVarE = eVar.E();
        com.baidu.mapapi.map.MapStatus mapStatusA = mapStatusUpdate.a(this.i, getMapStatus());
        if (mapStatusA == null) {
            return null;
        }
        return mapStatusA.b(adVarE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(int i) {
        if (i == 0) {
            return "数据请求成功";
        }
        switch (i) {
            case androidx.core.view.PointerIconCompat.TYPE_WAIT /* 1004 */:
                return "网络连接错误";
            case 1005:
                return "请求发送错误";
            case androidx.core.view.PointerIconCompat.TYPE_CELL /* 1006 */:
                return "响应数据读取失败";
            case androidx.core.view.PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                return "返回响应数据过大，数据溢出";
            case androidx.core.view.PointerIconCompat.TYPE_TEXT /* 1008 */:
                return "当前网络类型有问题";
            case androidx.core.view.PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                return "数据不一致";
            case androidx.core.view.PointerIconCompat.TYPE_ALIAS /* 1010 */:
                return "请求取消";
            case androidx.core.view.PointerIconCompat.TYPE_COPY /* 1011 */:
                return "网络超时错误";
            case androidx.core.view.PointerIconCompat.TYPE_NO_DROP /* 1012 */:
                return "网络连接超时";
            case androidx.core.view.PointerIconCompat.TYPE_ALL_SCROLL /* 1013 */:
                return "网络发送超时";
            case androidx.core.view.PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW /* 1014 */:
                return "网络接收超时";
            case androidx.core.view.PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW /* 1015 */:
                return "DNS解析错误";
            case androidx.core.view.PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW /* 1016 */:
                return "DNS解析超时";
            case androidx.core.view.PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW /* 1017 */:
                return "网络写错误";
            case androidx.core.view.PointerIconCompat.TYPE_ZOOM_IN /* 1018 */:
                return "SSL握手错误";
            case androidx.core.view.PointerIconCompat.TYPE_ZOOM_OUT /* 1019 */:
                return "SSL握手超时";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    public void a(com.baidu.mapapi.map.InfoWindow infoWindow) {
        boolean z;
        com.baidu.mapapi.map.MapView mapView;
        if (infoWindow == null) {
            return;
        }
        java.util.Set<com.baidu.mapapi.map.InfoWindow> setKeySet = this.L.keySet();
        if (setKeySet.isEmpty() || !setKeySet.contains(infoWindow)) {
            showInfoWindow(infoWindow, false);
            return;
        }
        android.view.View view = infoWindow.b;
        if (view == null || !infoWindow.j) {
            z = true;
        } else {
            view.destroyDrawingCache();
            com.baidu.mapapi.map.MapViewLayoutParams mapViewLayoutParamsBuild = new com.baidu.mapapi.map.MapViewLayoutParams.Builder().layoutMode(com.baidu.mapapi.map.MapViewLayoutParams.ELayoutMode.mapMode).position(infoWindow.c).yOffset(infoWindow.f).build();
            int i = com.baidu.mapapi.map.f.b[this.d.ordinal()];
            if (i == 1) {
                com.baidu.mapapi.map.TextureMapView textureMapView = this.b;
                if (textureMapView != null) {
                    textureMapView.removeView(view);
                    this.b.addView(view, mapViewLayoutParamsBuild);
                }
            } else if (i == 2 && (mapView = this.a) != null) {
                mapView.removeView(view);
                this.a.addView(view, mapViewLayoutParamsBuild);
            }
            if (infoWindow.i) {
                z = false;
            } else {
                z = true;
            }
        }
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorB = b(infoWindow);
        com.baidu.mapapi.map.Marker marker = this.L.get(infoWindow);
        if (marker != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (infoWindow.a != null) {
                marker.type = com.baidu.mapsdkplatform.comapi.map.j.popup;
                marker.b = bitmapDescriptorB;
                if (infoWindow.b != null) {
                    bundle.putInt("draw_with_view", 1);
                } else {
                    bundle.putInt("draw_with_view", 0);
                }
            }
            marker.a = infoWindow.c;
            marker.a(bundle);
            com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
            if (eVar == null || !z) {
                return;
            }
            eVar.c(bundle);
        }
    }

    private final void a(com.baidu.mapapi.map.MyLocationData myLocationData, com.baidu.mapapi.map.MyLocationConfiguration myLocationConfiguration) {
        android.os.Bundle bundle;
        com.baidu.mapapi.map.MapStatus.Builder builderZoom;
        float f;
        if (myLocationData == null || myLocationConfiguration == null || !isMyLocationEnabled()) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(myLocationData.latitude, myLocationData.longitude);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng);
        try {
            jSONObject.put("type", 0);
            jSONObject2.put("ptx", geoPointLl2mc.getLongitudeE6());
            jSONObject2.put("pty", geoPointLl2mc.getLatitudeE6());
            jSONObject2.put("radius", com.baidu.mapapi.model.CoordUtil.getMCDistanceByOneLatLngAndRadius(latLng, (int) myLocationData.accuracy));
            float f2 = myLocationData.direction;
            if (myLocationConfiguration.enableDirection) {
                f = myLocationData.direction % 360.0f;
                if (f > 180.0f) {
                    f -= 360.0f;
                } else if (f < -180.0f) {
                    f += 360.0f;
                }
            } else {
                f = -1001.0f;
            }
            jSONObject2.put("direction", f);
            jSONObject2.put("iconarrownor", "NormalLocArrow");
            jSONObject2.put("iconarrownorid", 28);
            jSONObject2.put("iconarrowfoc", "FocusLocArrow");
            jSONObject2.put("iconarrowfocid", 29);
            jSONObject2.put("lineid", myLocationConfiguration.accuracyCircleStrokeColor);
            jSONObject2.put("areaid", myLocationConfiguration.accuracyCircleFillColor);
            jSONArray.put(jSONObject2);
            jSONObject.put("data", jSONArray);
            if (myLocationConfiguration.locationMode == com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.COMPASS) {
                jSONObject3.put("ptx", geoPointLl2mc.getLongitudeE6());
                jSONObject3.put("pty", geoPointLl2mc.getLatitudeE6());
                try {
                    jSONObject3.put("radius", 0);
                    jSONObject3.put("direction", 0);
                    jSONObject3.put("iconarrownor", "direction_wheel");
                    jSONObject3.put("iconarrownorid", 54);
                    jSONObject3.put("iconarrowfoc", "direction_wheel");
                    jSONObject3.put("iconarrowfocid", 54);
                    jSONArray.put(jSONObject3);
                } catch (org.json.JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            }
        } catch (org.json.JSONException e3) {
            e = e3;
        }
        if (myLocationConfiguration.customMarker == null) {
            bundle = null;
        } else {
            java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> arrayList = new java.util.ArrayList();
            arrayList.add(myLocationConfiguration.customMarker);
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor : arrayList) {
                com.baidu.mapapi.model.ParcelItem parcelItem = new com.baidu.mapapi.model.ParcelItem();
                android.os.Bundle bundle3 = new android.os.Bundle();
                android.graphics.Bitmap bitmap = bitmapDescriptor.a;
                java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
                bitmap.copyPixelsToBuffer(byteBufferAllocate);
                bundle3.putByteArray("imgdata", byteBufferAllocate.array());
                bundle3.putInt("imgindex", bitmapDescriptor.hashCode());
                bundle3.putInt("imgH", bitmap.getHeight());
                bundle3.putInt("imgW", bitmap.getWidth());
                parcelItem.setBundle(bundle3);
                arrayList2.add(parcelItem);
            }
            if (arrayList2.size() > 0) {
                com.baidu.mapapi.model.ParcelItem[] parcelItemArr = new com.baidu.mapapi.model.ParcelItem[arrayList2.size()];
                for (int i = 0; i < arrayList2.size(); i++) {
                    parcelItemArr[i] = (com.baidu.mapapi.model.ParcelItem) arrayList2.get(i);
                }
                bundle2.putParcelableArray("icondata", parcelItemArr);
            }
            bundle = bundle2;
        }
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.a(jSONObject.toString(), bundle);
        }
        int i2 = com.baidu.mapapi.map.f.a[myLocationConfiguration.locationMode.ordinal()];
        if (i2 == 1) {
            builderZoom = new com.baidu.mapapi.map.MapStatus.Builder().rotate(myLocationData.direction).overlook(-45.0f).target(new com.baidu.mapapi.model.LatLng(myLocationData.latitude, myLocationData.longitude)).targetScreen(getMapStatus().targetScreen).zoom(getMapStatus().zoom);
        } else if (i2 != 2) {
            return;
        } else {
            builderZoom = new com.baidu.mapapi.map.MapStatus.Builder().target(new com.baidu.mapapi.model.LatLng(myLocationData.latitude, myLocationData.longitude)).zoom(getMapStatus().zoom).rotate(getMapStatus().rotate).overlook(getMapStatus().overlook).targetScreen(getMapStatus().targetScreen);
        }
        animateMapStatus(com.baidu.mapapi.map.MapStatusUpdateFactory.newMapStatus(builderZoom.build()));
    }

    private com.baidu.mapapi.map.BitmapDescriptor b(com.baidu.mapapi.map.InfoWindow infoWindow) {
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromView;
        if (infoWindow.b == null || !infoWindow.j) {
            return infoWindow.a;
        }
        if (infoWindow.g) {
            if (infoWindow.h <= 0) {
                infoWindow.h = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
            }
            bitmapDescriptorFromView = com.baidu.mapapi.map.BitmapDescriptorFactory.fromViewWithDpi(infoWindow.b, infoWindow.h);
        } else {
            bitmapDescriptorFromView = com.baidu.mapapi.map.BitmapDescriptorFactory.fromView(infoWindow.b);
        }
        infoWindow.a = bitmapDescriptorFromView;
        return bitmapDescriptorFromView;
    }

    private void c() {
        this.k = new java.util.concurrent.CopyOnWriteArrayList();
        this.l = new java.util.concurrent.CopyOnWriteArrayList();
        this.m = new java.util.concurrent.CopyOnWriteArrayList();
        this.K = new java.util.concurrent.ConcurrentHashMap();
        this.L = new java.util.concurrent.ConcurrentHashMap();
        this.n = new java.util.concurrent.CopyOnWriteArrayList();
        this.T = new android.graphics.Point((int) (com.baidu.mapapi.common.SysOSUtil.getDensity() * 40.0f), (int) (com.baidu.mapapi.common.SysOSUtil.getDensity() * 40.0f));
        this.g = new com.baidu.mapapi.map.UiSettings(this.i);
        this.o = new com.baidu.mapapi.map.a(this);
        this.p = new com.baidu.mapapi.map.b(this);
        this.i.a(new com.baidu.mapapi.map.c(this));
        this.i.a(new com.baidu.mapapi.map.d(this));
        this.i.a(new com.baidu.mapapi.map.e(this));
        this.P = this.i.C();
        this.Q = this.i.D();
    }

    void a() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.t();
    }

    void a(com.baidu.mapapi.map.HeatMap heatMap) {
        this.I.lock();
        try {
            com.baidu.mapapi.map.HeatMap heatMap2 = this.H;
            if (heatMap2 != null && this.i != null && heatMap == heatMap2) {
                heatMap2.b();
                this.H.c();
                this.H.a = null;
                this.i.o();
                this.H = null;
                this.i.p(false);
            }
        } finally {
            this.I.unlock();
        }
    }

    void a(com.baidu.mapapi.map.TileOverlay tileOverlay) {
        this.J.lock();
        if (tileOverlay != null) {
            try {
                if (this.G == tileOverlay) {
                    tileOverlay.b();
                    tileOverlay.a = null;
                    com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
                    if (eVar != null) {
                        eVar.f(false);
                    }
                }
            } finally {
                this.G = null;
                this.J.unlock();
            }
        }
    }

    public void addHeatMap(com.baidu.mapapi.map.HeatMap heatMap) {
        if (heatMap == null || this.i == null) {
            return;
        }
        this.I.lock();
        try {
            com.baidu.mapapi.map.HeatMap heatMap2 = this.H;
            if (heatMap == heatMap2) {
                return;
            }
            if (heatMap2 != null) {
                heatMap2.b();
                this.H.c();
                this.H.a = null;
                this.i.o();
            }
            this.H = heatMap;
            heatMap.a = this;
            this.i.p(true);
        } finally {
            this.I.unlock();
        }
    }

    public final com.baidu.mapapi.map.Overlay addOverlay(com.baidu.mapapi.map.OverlayOptions overlayOptions) {
        if (overlayOptions == null) {
            return null;
        }
        com.baidu.mapapi.map.Overlay overlayA = overlayOptions.a();
        overlayA.listener = this.o;
        if (overlayA instanceof com.baidu.mapapi.map.Marker) {
            com.baidu.mapapi.map.Marker marker = (com.baidu.mapapi.map.Marker) overlayA;
            marker.x = this.p;
            if (marker.p != null && marker.p.size() != 0) {
                this.l.add(marker);
                com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
                if (eVar != null) {
                    eVar.b(true);
                }
            }
            this.m.add(marker);
            if (marker.w != null) {
                showInfoWindow(marker.w, false);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        overlayA.a(bundle);
        com.baidu.mapsdkplatform.comapi.map.e eVar2 = this.i;
        if (eVar2 != null) {
            eVar2.b(bundle);
        }
        this.k.add(overlayA);
        return overlayA;
    }

    public final java.util.List<com.baidu.mapapi.map.Overlay> addOverlays(java.util.List<com.baidu.mapapi.map.OverlayOptions> list) {
        int i;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        android.os.Bundle[] bundleArr = new android.os.Bundle[size];
        int i2 = 0;
        for (com.baidu.mapapi.map.OverlayOptions overlayOptions : list) {
            if (overlayOptions != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                com.baidu.mapapi.map.Overlay overlayA = overlayOptions.a();
                overlayA.listener = this.o;
                if (overlayA instanceof com.baidu.mapapi.map.Marker) {
                    com.baidu.mapapi.map.Marker marker = (com.baidu.mapapi.map.Marker) overlayA;
                    marker.x = this.p;
                    if (marker.p != null && marker.p.size() != 0) {
                        this.l.add(marker);
                        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
                        if (eVar != null) {
                            eVar.b(true);
                        }
                    }
                    this.m.add(marker);
                }
                this.k.add(overlayA);
                arrayList.add(overlayA);
                overlayA.a(bundle);
                bundleArr[i2] = bundle;
                i2++;
            }
        }
        int i3 = size / 400;
        for (int i4 = 0; i4 < i3 + 1; i4++) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i5 = 0; i5 < 400 && (i = (i4 * 400) + i5) < size; i5++) {
                if (bundleArr[i] != null) {
                    arrayList2.add(bundleArr[i]);
                }
            }
            com.baidu.mapsdkplatform.comapi.map.e eVar2 = this.i;
            if (eVar2 != null) {
                eVar2.a(arrayList2);
            }
        }
        return arrayList;
    }

    public com.baidu.mapapi.map.TileOverlay addTileLayer(com.baidu.mapapi.map.TileOverlayOptions tileOverlayOptions) {
        if (tileOverlayOptions == null) {
            return null;
        }
        com.baidu.mapapi.map.TileOverlay tileOverlay = this.G;
        if (tileOverlay != null) {
            tileOverlay.b();
            this.G.a = null;
        }
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null || !eVar.a(tileOverlayOptions.a())) {
            return null;
        }
        com.baidu.mapapi.map.TileOverlay tileOverlayA = tileOverlayOptions.a(this);
        this.G = tileOverlayA;
        return tileOverlayA;
    }

    public final void animateMapStatus(com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate) {
        animateMapStatus(mapStatusUpdate, 300);
    }

    public final void animateMapStatus(com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate, int i) {
        if (mapStatusUpdate == null || i <= 0) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.ad adVarA = a(mapStatusUpdate);
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        mapStatusReason |= 256;
        if (this.S) {
            eVar.a(adVarA, i);
        } else {
            eVar.a(adVarA);
        }
    }

    boolean b() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.e();
    }

    public void changeLocationLayerOrder(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.d(z);
    }

    public void cleanCache(int i) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.b(i);
    }

    public final void clear() {
        this.k.clear();
        this.l.clear();
        this.m.clear();
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.b(false);
            this.i.n();
        }
        hideInfoWindow();
    }

    public java.util.List<com.baidu.mapapi.map.InfoWindow> getAllInfoWindows() {
        return this.n;
    }

    public final android.graphics.Point getCompassPosition() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            return a(eVar.h());
        }
        return null;
    }

    public com.baidu.mapapi.map.MapBaseIndoorMapInfo getFocusedBaseIndoorMapInfo() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        return eVar.p();
    }

    public com.baidu.mapsdkplatform.comapi.map.l getGLMapView() {
        return this.h;
    }

    @java.lang.Deprecated
    public final com.baidu.mapapi.map.MyLocationConfiguration getLocationConfigeration() {
        return getLocationConfiguration();
    }

    public final com.baidu.mapapi.map.MyLocationConfiguration getLocationConfiguration() {
        return this.O;
    }

    public final com.baidu.mapapi.map.MyLocationData getLocationData() {
        return this.N;
    }

    public final com.baidu.mapapi.map.MapStatus getMapStatus() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        return com.baidu.mapapi.map.MapStatus.a(eVar.E());
    }

    public final com.baidu.mapapi.model.LatLngBounds getMapStatusLimit() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        return eVar.F();
    }

    public final int getMapType() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return 1;
        }
        if (eVar.l()) {
            return this.i.k() ? 2 : 1;
        }
        return 3;
    }

    public java.util.List<com.baidu.mapapi.map.Marker> getMarkersInBounds(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        if (getMapStatus() == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.m.size() == 0) {
            return null;
        }
        for (com.baidu.mapapi.map.Marker marker : this.m) {
            if (latLngBounds.contains(marker.getPosition())) {
                arrayList.add(marker);
            }
        }
        return arrayList;
    }

    public final float getMaxZoomLevel() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return 0.0f;
        }
        return eVar.a;
    }

    public final float getMinZoomLevel() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return 0.0f;
        }
        return eVar.b;
    }

    public final com.baidu.mapapi.map.Projection getProjection() {
        return this.f;
    }

    public float[] getProjectionMatrix() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        return eVar.N();
    }

    public final com.baidu.mapapi.map.UiSettings getUiSettings() {
        return this.g;
    }

    public float[] getViewMatrix() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return null;
        }
        return eVar.O();
    }

    public float getZoomToBound(int i, int i2, int i3, int i4, int i5, int i6) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return 0.0f;
        }
        return eVar.a(i, i2, i3, i4, i5, i6);
    }

    @java.lang.Deprecated
    public com.baidu.mapsdkplatform.comapi.map.l getmGLMapView() {
        return this.h;
    }

    public void hideInfoWindow() {
        android.view.View view;
        com.baidu.mapapi.map.MapView mapView;
        java.util.Collection<com.baidu.mapapi.map.InfoWindow> collectionValues = this.K.values();
        if (!collectionValues.isEmpty()) {
            for (com.baidu.mapapi.map.InfoWindow infoWindow : collectionValues) {
                if (infoWindow != null && (view = infoWindow.b) != null) {
                    int i = com.baidu.mapapi.map.f.b[this.d.ordinal()];
                    if (i == 1) {
                        com.baidu.mapapi.map.TextureMapView textureMapView = this.b;
                        if (textureMapView != null) {
                            textureMapView.removeView(view);
                        }
                    } else if (i == 2 && (mapView = this.a) != null) {
                        mapView.removeView(view);
                    }
                }
            }
        }
        for (com.baidu.mapapi.map.Overlay overlay : this.k) {
            java.util.Set<java.lang.String> setKeySet = this.K.keySet();
            java.lang.String str = overlay.z;
            if ((overlay instanceof com.baidu.mapapi.map.Marker) && !setKeySet.isEmpty() && setKeySet.contains(str)) {
                overlay.remove();
            }
        }
        this.K.clear();
        this.L.clear();
        this.n.clear();
    }

    public void hideInfoWindow(com.baidu.mapapi.map.InfoWindow infoWindow) {
        com.baidu.mapapi.map.MapView mapView;
        java.util.Set<com.baidu.mapapi.map.InfoWindow> setKeySet = this.L.keySet();
        if (infoWindow == null || setKeySet.isEmpty() || !setKeySet.contains(infoWindow)) {
            return;
        }
        android.view.View view = infoWindow.b;
        if (view != null) {
            int i = com.baidu.mapapi.map.f.b[this.d.ordinal()];
            if (i == 1) {
                com.baidu.mapapi.map.TextureMapView textureMapView = this.b;
                if (textureMapView != null) {
                    textureMapView.removeView(view);
                }
            } else if (i == 2 && (mapView = this.a) != null) {
                mapView.removeView(view);
            }
        }
        com.baidu.mapapi.map.Marker marker = this.L.get(infoWindow);
        if (marker != null) {
            marker.remove();
            this.K.remove(marker.z);
        }
        this.L.remove(infoWindow);
        this.n.remove(infoWindow);
    }

    public void hideSDKLayer() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }

    public final boolean isBaiduHeatMapEnabled() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.i();
    }

    public boolean isBaseIndoorMapMode() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    public final boolean isBuildingsEnabled() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.m();
    }

    public final boolean isMyLocationEnabled() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public final boolean isSupportBaiduHeatMap() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.j();
    }

    public final boolean isTrafficEnabled() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return false;
        }
        return eVar.g();
    }

    public final void removeMarkerClickListener(com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener onMarkerClickListener) {
        if (this.x.contains(onMarkerClickListener)) {
            this.x.remove(onMarkerClickListener);
        }
    }

    public final void setBaiduHeatMapEnabled(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.h(z);
        }
    }

    public final void setBuildingsEnabled(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.j(z);
        }
    }

    public void setCompassEnable(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.e(z);
    }

    public void setCompassIcon(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: compass's icon can not be null");
        }
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.a(bitmap);
    }

    public void setCompassPosition(android.graphics.Point point) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null && eVar.a(point)) {
            this.T = point;
        }
    }

    public boolean setCustomTrafficColor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (this.i == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str4)) {
            if (!android.text.TextUtils.isEmpty(str) || !android.text.TextUtils.isEmpty(str2) || !android.text.TextUtils.isEmpty(str3) || !android.text.TextUtils.isEmpty(str4)) {
                return true;
            }
            this.i.a(android.graphics.Color.parseColor("#ffffffff"), android.graphics.Color.parseColor("#ffffffff"), android.graphics.Color.parseColor("#ffffffff"), android.graphics.Color.parseColor("#ffffffff"), false);
            return true;
        }
        if (str.matches("^#[0-9a-fA-F]{8}$") && str2.matches("^#[0-9a-fA-F]{8}$") && str3.matches("^#[0-9a-fA-F]{8}$") && str4.matches("^#[0-9a-fA-F]{8}$")) {
            this.i.a(android.graphics.Color.parseColor(str), android.graphics.Color.parseColor(str2), android.graphics.Color.parseColor(str3), android.graphics.Color.parseColor(str4), true);
            return true;
        }
        android.util.Log.e(e, "the string of the input customTrafficColor is error");
        return false;
    }

    public final void setIndoorEnable(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            this.R = z;
            eVar.l(z);
        }
        com.baidu.mapapi.map.BaiduMap.OnBaseIndoorMapListener onBaseIndoorMapListener = this.D;
        if (onBaseIndoorMapListener == null || z) {
            return;
        }
        onBaseIndoorMapListener.onBaseIndoorMapMode(false, null);
    }

    public void setLayerClickable(com.baidu.mapapi.map.MapLayer mapLayer, boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.a(mapLayer, z);
    }

    public final void setMapStatus(com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate) {
        if (mapStatusUpdate == null) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.ad adVarA = a(mapStatusUpdate);
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.a(adVarA);
        com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener = this.q;
        if (onMapStatusChangeListener != null) {
            onMapStatusChangeListener.onMapStatusChange(getMapStatus());
        }
    }

    public final void setMapStatusLimits(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.a(latLngBounds);
        setMapStatus(com.baidu.mapapi.map.MapStatusUpdateFactory.newLatLngBounds(latLngBounds));
    }

    public final void setMapType(int i) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        if (i == 1) {
            eVar.a(false);
            this.i.v(this.P);
            this.i.w(this.Q);
            this.i.g(true);
            this.i.l(this.R);
        } else if (i == 2) {
            eVar.a(true);
            this.i.v(this.P);
            this.i.w(this.Q);
            this.i.g(true);
        } else if (i == 3) {
            if (eVar.C()) {
                this.i.v(false);
            }
            if (this.i.D()) {
                this.i.w(false);
            }
            this.i.g(false);
            this.i.l(false);
        }
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.h;
        if (lVar != null) {
            lVar.a(i);
        }
    }

    public final void setMaxAndMinZoomLevel(float f, float f2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar;
        if (f <= 21.0f && f2 >= 4.0f && f >= f2 && (eVar = this.i) != null) {
            eVar.a(f, f2);
        }
    }

    @java.lang.Deprecated
    public final void setMyLocationConfigeration(com.baidu.mapapi.map.MyLocationConfiguration myLocationConfiguration) {
        setMyLocationConfiguration(myLocationConfiguration);
    }

    public final void setMyLocationConfiguration(com.baidu.mapapi.map.MyLocationConfiguration myLocationConfiguration) {
        this.O = myLocationConfiguration;
        a(this.N, myLocationConfiguration);
    }

    public final void setMyLocationData(com.baidu.mapapi.map.MyLocationData myLocationData) {
        this.N = myLocationData;
        if (this.O == null) {
            this.O = new com.baidu.mapapi.map.MyLocationConfiguration(com.baidu.mapapi.map.MyLocationConfiguration.LocationMode.NORMAL, false, null);
        }
        a(myLocationData, this.O);
    }

    public final void setMyLocationEnabled(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.o(z);
        }
    }

    public final void setOnBaseIndoorMapListener(com.baidu.mapapi.map.BaiduMap.OnBaseIndoorMapListener onBaseIndoorMapListener) {
        this.D = onBaseIndoorMapListener;
    }

    public final void setOnMapClickListener(com.baidu.mapapi.map.BaiduMap.OnMapClickListener onMapClickListener) {
        this.s = onMapClickListener;
    }

    public final void setOnMapDoubleClickListener(com.baidu.mapapi.map.BaiduMap.OnMapDoubleClickListener onMapDoubleClickListener) {
        this.v = onMapDoubleClickListener;
    }

    public final void setOnMapDrawFrameCallback(com.baidu.mapapi.map.BaiduMap.OnMapDrawFrameCallback onMapDrawFrameCallback) {
        this.C = onMapDrawFrameCallback;
    }

    public void setOnMapLoadedCallback(com.baidu.mapapi.map.BaiduMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.t = onMapLoadedCallback;
    }

    public final void setOnMapLongClickListener(com.baidu.mapapi.map.BaiduMap.OnMapLongClickListener onMapLongClickListener) {
        this.w = onMapLongClickListener;
    }

    public void setOnMapRenderCallbadk(com.baidu.mapapi.map.BaiduMap.OnMapRenderCallback onMapRenderCallback) {
        this.u = onMapRenderCallback;
    }

    public final void setOnMapRenderValidDataListener(com.baidu.mapapi.map.BaiduMap.OnMapRenderValidDataListener onMapRenderValidDataListener) {
        this.E = onMapRenderValidDataListener;
    }

    public final void setOnMapStatusChangeListener(com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener) {
        this.q = onMapStatusChangeListener;
    }

    public final void setOnMapTouchListener(com.baidu.mapapi.map.BaiduMap.OnMapTouchListener onMapTouchListener) {
        this.r = onMapTouchListener;
    }

    public final void setOnMarkerClickListener(com.baidu.mapapi.map.BaiduMap.OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null || this.x.contains(onMarkerClickListener)) {
            return;
        }
        this.x.add(onMarkerClickListener);
    }

    public final void setOnMarkerDragListener(com.baidu.mapapi.map.BaiduMap.OnMarkerDragListener onMarkerDragListener) {
        this.z = onMarkerDragListener;
    }

    public final void setOnMyLocationClickListener(com.baidu.mapapi.map.BaiduMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.A = onMyLocationClickListener;
    }

    public final void setOnPolylineClickListener(com.baidu.mapapi.map.BaiduMap.OnPolylineClickListener onPolylineClickListener) {
        if (onPolylineClickListener != null) {
            this.y.add(onPolylineClickListener);
        }
    }

    public final void setOnSynchronizationListener(com.baidu.mapapi.map.BaiduMap.OnSynchronizationListener onSynchronizationListener) {
        this.F = onSynchronizationListener;
    }

    public void setOverlayUnderPoi(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.c(z);
    }

    @java.lang.Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        setViewPadding(i, i2, i3, i4);
    }

    public void setPixelFormatTransparent(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.l lVar = this.h;
        if (lVar == null) {
            return;
        }
        if (z) {
            lVar.d();
        } else {
            lVar.e();
        }
    }

    public final void setTrafficEnabled(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.i(z);
        }
    }

    public final void setViewPadding(int i, int i2, int i3, int i4) {
        com.baidu.mapapi.map.MapView mapView;
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || this.i == null) {
            return;
        }
        int i5 = com.baidu.mapapi.map.f.b[this.d.ordinal()];
        if (i5 != 1) {
            if (i5 == 2 && (mapView = this.a) != null) {
                this.i.a(new android.graphics.Point((int) (i + (this.T.x * (((mapView.getWidth() - i) - i3) / this.a.getWidth()))), (int) (i2 + (this.T.y * (((this.a.getHeight() - i2) - i4) / this.a.getHeight())))));
                this.a.setPadding(i, i2, i3, i4);
                this.a.invalidate();
                return;
            }
            return;
        }
        com.baidu.mapapi.map.TextureMapView textureMapView = this.b;
        if (textureMapView == null) {
            return;
        }
        this.i.a(new android.graphics.Point((int) (i + (this.T.x * (((textureMapView.getWidth() - i) - i3) / this.b.getWidth()))), (int) (i2 + (this.T.y * (((this.b.getHeight() - i2) - i4) / this.b.getHeight())))));
        this.b.setPadding(i, i2, i3, i4);
        this.b.invalidate();
    }

    public void showInfoWindow(com.baidu.mapapi.map.InfoWindow infoWindow) {
        showInfoWindow(infoWindow, true);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    public void showInfoWindow(com.baidu.mapapi.map.InfoWindow infoWindow, boolean z) {
        boolean z2;
        java.util.Set<com.baidu.mapapi.map.InfoWindow> setKeySet = this.L.keySet();
        if (infoWindow == null || setKeySet.contains(infoWindow)) {
            return;
        }
        if (z) {
            hideInfoWindow();
        }
        infoWindow.e = this.p;
        if (infoWindow.b == null || !infoWindow.j) {
            z2 = true;
        } else {
            android.view.View view = infoWindow.b;
            view.destroyDrawingCache();
            com.baidu.mapapi.map.MapViewLayoutParams mapViewLayoutParamsBuild = new com.baidu.mapapi.map.MapViewLayoutParams.Builder().layoutMode(com.baidu.mapapi.map.MapViewLayoutParams.ELayoutMode.mapMode).position(infoWindow.c).yOffset(infoWindow.f).build();
            int i = com.baidu.mapapi.map.f.b[this.d.ordinal()];
            if (i == 1) {
                com.baidu.mapapi.map.TextureMapView textureMapView = this.b;
                if (textureMapView != null) {
                    textureMapView.addView(view, mapViewLayoutParamsBuild);
                }
            } else if (i == 2 && this.h != null) {
                this.a.addView(view, mapViewLayoutParamsBuild);
            }
            if (infoWindow.i) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        com.baidu.mapapi.map.Overlay overlayA = new com.baidu.mapapi.map.MarkerOptions().perspective(false).icon(b(infoWindow)).position(infoWindow.c).zIndex(Integer.MAX_VALUE).yOffset(infoWindow.f).infoWindow(infoWindow).a();
        overlayA.listener = this.o;
        overlayA.type = com.baidu.mapsdkplatform.comapi.map.j.popup;
        android.os.Bundle bundle = new android.os.Bundle();
        overlayA.a(bundle);
        if (infoWindow.b != null) {
            bundle.putInt("draw_with_view", 1);
        } else {
            bundle.putInt("draw_with_view", 0);
        }
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null && z2) {
            eVar.b(bundle);
            this.k.add(overlayA);
        }
        com.baidu.mapapi.map.Marker marker = (com.baidu.mapapi.map.Marker) overlayA;
        marker.x = this.p;
        this.K.put(marker.z, infoWindow);
        this.L.put(infoWindow, marker);
        this.n.add(infoWindow);
    }

    public void showInfoWindows(java.util.List<com.baidu.mapapi.map.InfoWindow> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.baidu.mapapi.map.InfoWindow> it = list.iterator();
        while (it.hasNext()) {
            showInfoWindow(it.next(), false);
        }
    }

    public final void showMapIndoorPoi(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.w(z);
            this.Q = z;
        }
    }

    public final void showMapPoi(boolean z) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar != null) {
            eVar.v(z);
            this.P = z;
        }
    }

    public void showSDKLayer() {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    public final void snapshot(com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback snapshotReadyCallback) {
        com.baidu.mapsdkplatform.comapi.map.l lVar;
        this.B = snapshotReadyCallback;
        int i = com.baidu.mapapi.map.f.b[this.d.ordinal()];
        if (i != 1) {
            if (i == 2 && (lVar = this.h) != null) {
                lVar.a("anything", (android.graphics.Rect) null);
                return;
            }
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.ae aeVar = this.j;
        if (aeVar != null) {
            aeVar.a("anything", null);
        }
    }

    public final void snapshotScope(android.graphics.Rect rect, com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback snapshotReadyCallback) {
        com.baidu.mapsdkplatform.comapi.map.l lVar;
        this.B = snapshotReadyCallback;
        int i = com.baidu.mapapi.map.f.b[this.d.ordinal()];
        if (i != 1) {
            if (i == 2 && (lVar = this.h) != null) {
                lVar.a("anything", rect);
                return;
            }
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.ae aeVar = this.j;
        if (aeVar != null) {
            aeVar.a("anything", rect);
        }
    }

    public com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError switchBaseIndoorMapFloor(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError.FLOOR_INFO_ERROR;
        }
        com.baidu.mapapi.map.MapBaseIndoorMapInfo focusedBaseIndoorMapInfo = getFocusedBaseIndoorMapInfo();
        if (focusedBaseIndoorMapInfo == null) {
            return com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_ERROR;
        }
        if (!str2.equals(focusedBaseIndoorMapInfo.a)) {
            return com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError.FOCUSED_ID_ERROR;
        }
        java.util.ArrayList<java.lang.String> floors = focusedBaseIndoorMapInfo.getFloors();
        if (floors == null || !floors.contains(str)) {
            return com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError.FLOOR_OVERLFLOW;
        }
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        return (eVar == null || !eVar.a(str, str2)) ? com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_ERROR : com.baidu.mapapi.map.MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_OK;
    }

    public void switchLayerOrder(com.baidu.mapapi.map.MapLayer mapLayer, com.baidu.mapapi.map.MapLayer mapLayer2) {
        com.baidu.mapsdkplatform.comapi.map.e eVar = this.i;
        if (eVar == null) {
            return;
        }
        eVar.a(mapLayer, mapLayer2);
    }
}
