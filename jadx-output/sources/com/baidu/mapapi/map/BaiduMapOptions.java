package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class BaiduMapOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.map.BaiduMapOptions> CREATOR = new com.baidu.mapapi.map.g();
    com.baidu.mapapi.map.MapStatus a;
    boolean b;
    int c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    com.baidu.mapapi.map.LogoPosition j;
    android.graphics.Point k;
    android.graphics.Point l;

    public BaiduMapOptions() {
        this.a = new com.baidu.mapapi.map.MapStatus(0.0f, new com.baidu.mapapi.model.LatLng(39.914935d, 116.403119d), 0.0f, 12.0f, null, null);
        this.b = true;
        this.c = 1;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
    }

    protected BaiduMapOptions(android.os.Parcel parcel) {
        this.a = new com.baidu.mapapi.map.MapStatus(0.0f, new com.baidu.mapapi.model.LatLng(39.914935d, 116.403119d), 0.0f, 12.0f, null, null);
        this.b = true;
        this.c = 1;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = true;
        this.i = true;
        this.a = (com.baidu.mapapi.map.MapStatus) parcel.readParcelable(com.baidu.mapapi.map.MapStatus.class.getClassLoader());
        this.b = parcel.readByte() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
        this.h = parcel.readByte() != 0;
        this.i = parcel.readByte() != 0;
        this.k = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
        this.l = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
    }

    com.baidu.mapsdkplatform.comapi.map.ab a() {
        return new com.baidu.mapsdkplatform.comapi.map.ab().a(this.a.c()).a(this.b).a(this.c).b(this.d).c(this.e).d(this.f).e(this.g);
    }

    public com.baidu.mapapi.map.BaiduMapOptions compassEnabled(boolean z) {
        this.b = z;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.baidu.mapapi.map.BaiduMapOptions logoPosition(com.baidu.mapapi.map.LogoPosition logoPosition) {
        this.j = logoPosition;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions mapStatus(com.baidu.mapapi.map.MapStatus mapStatus) {
        if (mapStatus != null) {
            this.a = mapStatus;
        }
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions mapType(int i) {
        this.c = i;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions overlookingGesturesEnabled(boolean z) {
        this.f = z;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions rotateGesturesEnabled(boolean z) {
        this.d = z;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions scaleControlEnabled(boolean z) {
        this.i = z;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions scaleControlPosition(android.graphics.Point point) {
        this.k = point;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions scrollGesturesEnabled(boolean z) {
        this.e = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
    }

    public com.baidu.mapapi.map.BaiduMapOptions zoomControlsEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions zoomControlsPosition(android.graphics.Point point) {
        this.l = point;
        return this;
    }

    public com.baidu.mapapi.map.BaiduMapOptions zoomGesturesEnabled(boolean z) {
        this.g = z;
        return this;
    }
}
