package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class MapStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.map.MapStatus> CREATOR = new com.baidu.mapapi.map.k();
    com.baidu.mapsdkplatform.comapi.map.ad a;
    private double b;
    public final com.baidu.mapapi.model.LatLngBounds bound;
    private double c;
    public final float overlook;
    public final float rotate;
    public final com.baidu.mapapi.model.LatLng target;
    public final android.graphics.Point targetScreen;
    public com.baidu.mapapi.map.WinRound winRound;
    public final float zoom;

    public static final class Builder {
        private float a;
        private com.baidu.mapapi.model.LatLng b;
        private float c;
        private float d;
        private android.graphics.Point e;
        private com.baidu.mapapi.model.LatLngBounds f;
        private double g;
        private double h;
        private final float i;

        public Builder() {
            this.a = -2.1474836E9f;
            this.b = null;
            this.c = -2.1474836E9f;
            this.d = -2.1474836E9f;
            this.e = null;
            this.f = null;
            this.g = 0.0d;
            this.h = 0.0d;
            this.i = 15.0f;
        }

        public Builder(com.baidu.mapapi.map.MapStatus mapStatus) {
            this.a = -2.1474836E9f;
            this.b = null;
            this.c = -2.1474836E9f;
            this.d = -2.1474836E9f;
            this.e = null;
            this.f = null;
            this.g = 0.0d;
            this.h = 0.0d;
            this.i = 15.0f;
            this.a = mapStatus.rotate;
            this.b = mapStatus.target;
            this.c = mapStatus.overlook;
            this.d = mapStatus.zoom;
            this.e = mapStatus.targetScreen;
            this.g = mapStatus.a();
            this.h = mapStatus.b();
        }

        private float a(float f) {
            if (15.0f == f) {
                return 15.5f;
            }
            return f;
        }

        public com.baidu.mapapi.map.MapStatus build() {
            return new com.baidu.mapapi.map.MapStatus(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public com.baidu.mapapi.map.MapStatus.Builder overlook(float f) {
            this.c = f;
            return this;
        }

        public com.baidu.mapapi.map.MapStatus.Builder rotate(float f) {
            this.a = f;
            return this;
        }

        public com.baidu.mapapi.map.MapStatus.Builder target(com.baidu.mapapi.model.LatLng latLng) {
            this.b = latLng;
            return this;
        }

        public com.baidu.mapapi.map.MapStatus.Builder targetScreen(android.graphics.Point point) {
            this.e = point;
            return this;
        }

        public com.baidu.mapapi.map.MapStatus.Builder zoom(float f) {
            this.d = a(f);
            return this;
        }
    }

    MapStatus(float f, com.baidu.mapapi.model.LatLng latLng, float f2, float f3, android.graphics.Point point, double d, double d2, com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        this.rotate = f;
        this.target = latLng;
        this.overlook = f2;
        this.zoom = f3;
        this.targetScreen = point;
        this.b = d;
        this.c = d2;
        this.bound = latLngBounds;
    }

    MapStatus(float f, com.baidu.mapapi.model.LatLng latLng, float f2, float f3, android.graphics.Point point, com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        this.rotate = f;
        this.target = latLng;
        this.overlook = f2;
        this.zoom = f3;
        this.targetScreen = point;
        if (latLng != null) {
            this.b = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng).getLongitudeE6();
            this.c = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng).getLatitudeE6();
        }
        this.bound = latLngBounds;
    }

    MapStatus(float f, com.baidu.mapapi.model.LatLng latLng, float f2, float f3, android.graphics.Point point, com.baidu.mapsdkplatform.comapi.map.ad adVar, double d, double d2, com.baidu.mapapi.model.LatLngBounds latLngBounds, com.baidu.mapapi.map.WinRound winRound) {
        this.rotate = f;
        this.target = latLng;
        this.overlook = f2;
        this.zoom = f3;
        this.targetScreen = point;
        this.a = adVar;
        this.b = d;
        this.c = d2;
        this.bound = latLngBounds;
        this.winRound = winRound;
    }

    protected MapStatus(android.os.Parcel parcel) {
        this.rotate = parcel.readFloat();
        this.target = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.overlook = parcel.readFloat();
        this.zoom = parcel.readFloat();
        this.targetScreen = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
        this.bound = (com.baidu.mapapi.model.LatLngBounds) parcel.readParcelable(com.baidu.mapapi.model.LatLngBounds.class.getClassLoader());
        this.b = parcel.readDouble();
        this.c = parcel.readDouble();
    }

    static com.baidu.mapapi.map.MapStatus a(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (adVar == null) {
            return null;
        }
        float f = adVar.b;
        double d = adVar.e;
        double d2 = adVar.d;
        com.baidu.mapapi.model.LatLng latLngMc2ll = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(d, d2));
        float f2 = adVar.c;
        float f3 = adVar.a;
        android.graphics.Point point = new android.graphics.Point(adVar.f, adVar.g);
        com.baidu.mapapi.model.LatLng latLngMc2ll2 = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(adVar.k.e.y, adVar.k.e.x));
        com.baidu.mapapi.model.LatLng latLngMc2ll3 = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(adVar.k.f.y, adVar.k.f.x));
        com.baidu.mapapi.model.LatLng latLngMc2ll4 = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(adVar.k.h.y, adVar.k.h.x));
        com.baidu.mapapi.model.LatLng latLngMc2ll5 = com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(adVar.k.g.y, adVar.k.g.x));
        com.baidu.mapapi.model.LatLngBounds.Builder builder = new com.baidu.mapapi.model.LatLngBounds.Builder();
        builder.include(latLngMc2ll2);
        builder.include(latLngMc2ll3);
        builder.include(latLngMc2ll4);
        builder.include(latLngMc2ll5);
        return new com.baidu.mapapi.map.MapStatus(f, latLngMc2ll, f2, f3, point, adVar, d2, d, builder.build(), adVar.j);
    }

    double a() {
        return this.b;
    }

    double b() {
        return this.c;
    }

    com.baidu.mapsdkplatform.comapi.map.ad b(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (adVar == null) {
            return null;
        }
        float f = this.rotate;
        if (f != -2.1474836E9f) {
            adVar.b = (int) f;
        }
        float f2 = this.zoom;
        if (f2 != -2.1474836E9f) {
            adVar.a = f2;
        }
        float f3 = this.overlook;
        if (f3 != -2.1474836E9f) {
            adVar.c = (int) f3;
        }
        if (this.target != null) {
            adVar.d = this.b;
            adVar.e = this.c;
        }
        android.graphics.Point point = this.targetScreen;
        if (point != null) {
            adVar.f = point.x;
            adVar.g = this.targetScreen.y;
        }
        return adVar;
    }

    com.baidu.mapsdkplatform.comapi.map.ad c() {
        return b(new com.baidu.mapsdkplatform.comapi.map.ad());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.target != null) {
            sb.append("target lat: " + this.target.latitude + "\n");
            sb.append("target lng: " + this.target.longitude + "\n");
        }
        if (this.targetScreen != null) {
            sb.append("target screen x: " + this.targetScreen.x + "\n");
            sb.append("target screen y: " + this.targetScreen.y + "\n");
        }
        sb.append("zoom: " + this.zoom + "\n");
        sb.append("rotate: " + this.rotate + "\n");
        sb.append("overlook: " + this.overlook + "\n");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.rotate);
        parcel.writeParcelable(this.target, i);
        parcel.writeFloat(this.overlook);
        parcel.writeFloat(this.zoom);
        parcel.writeParcelable(this.targetScreen, i);
        parcel.writeParcelable(this.bound, i);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
    }
}
