package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Marker extends com.baidu.mapapi.map.Overlay {
    com.baidu.mapapi.model.LatLng a;
    com.baidu.mapapi.map.BitmapDescriptor b;
    float c;
    float d;
    boolean e;
    boolean f;
    float g;
    java.lang.String h;
    int i;
    float l;
    int m;
    java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> p;
    com.baidu.mapapi.animation.Animation r;
    android.graphics.Point v;
    com.baidu.mapapi.map.InfoWindow w;
    com.baidu.mapapi.map.InfoWindow.a x;
    boolean j = false;
    boolean k = false;
    boolean n = false;
    boolean o = true;
    int q = 20;
    float s = 1.0f;
    float t = 1.0f;
    float u = 1.0f;
    boolean y = false;

    Marker() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.marker;
    }

    private void a(java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> arrayList, android.os.Bundle bundle) {
        int i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<com.baidu.mapapi.map.BitmapDescriptor> it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            com.baidu.mapapi.map.BitmapDescriptor next = it.next();
            com.baidu.mapapi.model.ParcelItem parcelItem = new com.baidu.mapapi.model.ParcelItem();
            android.os.Bundle bundle2 = new android.os.Bundle();
            android.graphics.Bitmap bitmap = next.a;
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            bundle2.putByteArray("image_data", bArrArray);
            bundle2.putInt("image_width", bitmap.getWidth());
            bundle2.putInt("image_height", bitmap.getHeight());
            java.security.MessageDigest messageDigest = null;
            try {
                messageDigest = java.security.MessageDigest.getInstance("MD5");
            } catch (java.security.NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            if (messageDigest != null) {
                messageDigest.update(bArrArray, 0, bArrArray.length);
                byte[] bArrDigest = messageDigest.digest();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("");
                while (i < bArrDigest.length) {
                    sb.append(java.lang.Integer.toString((bArrDigest[i] & kotlin.UByte.MAX_VALUE) + 256, 16).substring(1));
                    i++;
                }
                bundle2.putString("image_hashcode", sb.toString());
            }
            parcelItem.setBundle(bundle2);
            arrayList2.add(parcelItem);
        }
        if (arrayList2.size() > 0) {
            com.baidu.mapapi.model.ParcelItem[] parcelItemArr = new com.baidu.mapapi.model.ParcelItem[arrayList2.size()];
            while (i < arrayList2.size()) {
                parcelItemArr[i] = (com.baidu.mapapi.model.ParcelItem) arrayList2.get(i);
                i++;
            }
            bundle.putParcelableArray("icons", parcelItemArr);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        super.a(bundle);
        android.os.Bundle bundle2 = new android.os.Bundle();
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor = this.b;
        if (bitmapDescriptor != null) {
            bundle.putBundle("image_info", bitmapDescriptor.b());
        }
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.a);
        bundle.putInt("animatetype", this.m);
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        bundle.putInt("perspective", this.e ? 1 : 0);
        bundle.putFloat("anchor_x", this.c);
        bundle.putFloat("anchor_y", this.d);
        bundle.putFloat("rotate", this.g);
        bundle.putInt("y_offset", this.i);
        bundle.putInt("isflat", this.j ? 1 : 0);
        bundle.putInt("istop", this.k ? 1 : 0);
        bundle.putInt("period", this.q);
        bundle.putFloat("alpha", this.l);
        bundle.putFloat("scaleX", this.s);
        bundle.putFloat("scaleY", this.t);
        bundle.putInt("isClickable", this.o ? 1 : 0);
        android.graphics.Point point = this.v;
        if (point != null) {
            bundle.putInt("fix_x", point.x);
            bundle.putInt("fix_y", this.v.y);
        }
        bundle.putInt("isfixed", this.n ? 1 : 0);
        java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> arrayList = this.p;
        if (arrayList != null && arrayList.size() > 0) {
            a(this.p, bundle);
        }
        bundle2.putBundle("param", bundle);
        return bundle;
    }

    public void cancelAnimation() {
        com.baidu.mapapi.animation.Animation animation = this.r;
        if (animation != null) {
            animation.bdAnimation.b();
        }
    }

    public float getAlpha() {
        return this.l;
    }

    public float getAnchorX() {
        return this.c;
    }

    public float getAnchorY() {
        return this.d;
    }

    public android.graphics.Point getFixedPosition() {
        return this.v;
    }

    public com.baidu.mapapi.map.BitmapDescriptor getIcon() {
        return this.b;
    }

    public java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> getIcons() {
        return this.p;
    }

    public java.lang.String getId() {
        return this.z;
    }

    public com.baidu.mapapi.map.InfoWindow getInfoWindow() {
        return this.w;
    }

    public int getPeriod() {
        return this.q;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.a;
    }

    public float getRotate() {
        return this.g;
    }

    public float getScale() {
        return this.u;
    }

    public float getScaleX() {
        return this.s;
    }

    public float getScaleY() {
        return this.t;
    }

    public java.lang.String getTitle() {
        return this.h;
    }

    public int getYOffset() {
        return this.i;
    }

    public void hideInfoWindow() {
        com.baidu.mapapi.map.InfoWindow.a aVar = this.x;
        if (aVar != null) {
            aVar.a(this.w);
            this.y = false;
        }
    }

    public boolean isClickable() {
        return this.o;
    }

    public boolean isDraggable() {
        return this.f;
    }

    public boolean isFixed() {
        return this.n;
    }

    public boolean isFlat() {
        return this.j;
    }

    public boolean isInfoWindowEnabled() {
        return this.y;
    }

    public boolean isPerspective() {
        return this.e;
    }

    public void setAlpha(float f) {
        if (f < 0.0f || f > 1.0d) {
            this.l = 1.0f;
        } else {
            this.l = f;
            this.listener.b(this);
        }
    }

    public void setAnchor(float f, float f2) {
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            return;
        }
        this.c = f;
        this.d = f2;
        this.listener.b(this);
    }

    public void setAnimateType(int i) {
        this.m = i;
        this.listener.b(this);
    }

    public void setAnimation(com.baidu.mapapi.animation.Animation animation) {
        if (animation != null) {
            this.r = animation;
            animation.bdAnimation.a(this, animation);
        }
    }

    public void setClickable(boolean z) {
        this.o = z;
        this.listener.b(this);
    }

    public void setDraggable(boolean z) {
        this.f = z;
        this.listener.b(this);
    }

    public void setFixedScreenPosition(android.graphics.Point point) {
        if (point == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: the screenPosition can not be null");
        }
        this.v = point;
        this.n = true;
        this.listener.b(this);
    }

    public void setFlat(boolean z) {
        this.j = z;
        this.listener.b(this);
    }

    public void setIcon(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's icon can not be null");
        }
        this.b = bitmapDescriptor;
        this.listener.b(this);
    }

    public void setIcons(java.util.ArrayList<com.baidu.mapapi.map.BitmapDescriptor> arrayList) {
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor;
        if (arrayList == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's icons can not be null");
        }
        if (arrayList.size() == 0) {
            return;
        }
        if (arrayList.size() == 1) {
            bitmapDescriptor = arrayList.get(0);
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) == null || arrayList.get(i).a == null) {
                    return;
                }
            }
            this.p = (java.util.ArrayList) arrayList.clone();
            bitmapDescriptor = null;
        }
        this.b = bitmapDescriptor;
        this.listener.b(this);
    }

    public void setPeriod(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's period must be greater than zero ");
        }
        this.q = i;
        this.listener.b(this);
    }

    public void setPerspective(boolean z) {
        this.e = z;
        this.listener.b(this);
    }

    public void setPosition(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's position can not be null");
        }
        this.a = latLng;
        this.listener.b(this);
    }

    public void setPositionWithInfoWindow(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: marker's position can not be null");
        }
        this.a = latLng;
        this.listener.b(this);
        com.baidu.mapapi.map.InfoWindow infoWindow = this.w;
        if (infoWindow != null) {
            infoWindow.setPosition(latLng);
        }
    }

    public void setRotate(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        this.g = f % 360.0f;
        this.listener.b(this);
    }

    public void setScale(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.s = f;
        this.t = f;
        this.listener.b(this);
    }

    public void setScaleX(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.s = f;
        this.listener.b(this);
    }

    public void setScaleY(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.t = f;
        this.listener.b(this);
    }

    public void setTitle(java.lang.String str) {
        this.h = str;
    }

    public void setToTop() {
        this.k = true;
        this.listener.b(this);
    }

    public void setYOffset(int i) {
        this.i = i;
        this.listener.b(this);
    }

    public void showInfoWindow(com.baidu.mapapi.map.InfoWindow infoWindow) {
        if (infoWindow == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: the InfoWindow can not be null");
        }
        this.w = infoWindow;
        com.baidu.mapapi.map.InfoWindow.a aVar = this.x;
        if (aVar != null) {
            aVar.b(infoWindow);
            this.y = true;
        }
    }

    public void showSmoothMoveInfoWindow(com.baidu.mapapi.map.InfoWindow infoWindow) {
        if (infoWindow == null) {
            return;
        }
        if (!infoWindow.j) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: the SmoothMoveInfoWindow must build with View");
        }
        if (infoWindow.b == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: the SmoothMoveInfoWindow's View can not be null");
        }
        this.w = infoWindow;
        infoWindow.i = true;
        com.baidu.mapapi.map.InfoWindow.a aVar = this.x;
        if (aVar != null) {
            aVar.b(infoWindow);
            this.y = true;
        }
    }

    public void startAnimation() {
        com.baidu.mapapi.animation.Animation animation = this.r;
        if (animation != null) {
            animation.bdAnimation.a();
        }
    }

    public void updateInfoWindowBitmapDescriptor(com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptor) {
        com.baidu.mapapi.map.InfoWindow infoWindow = this.w;
        if (infoWindow == null || infoWindow.k) {
            return;
        }
        this.w.setBitmapDescriptor(bitmapDescriptor);
    }

    public void updateInfoWindowPosition(com.baidu.mapapi.model.LatLng latLng) {
        com.baidu.mapapi.map.InfoWindow infoWindow = this.w;
        if (infoWindow != null) {
            infoWindow.setPosition(latLng);
        }
    }

    public void updateInfoWindowView(android.view.View view) {
        com.baidu.mapapi.map.InfoWindow infoWindow = this.w;
        if (infoWindow == null || !infoWindow.j) {
            return;
        }
        this.w.setView(view);
    }

    public void updateInfoWindowYOffset(int i) {
        com.baidu.mapapi.map.InfoWindow infoWindow = this.w;
        if (infoWindow != null) {
            infoWindow.setYOffset(i);
        }
    }
}
