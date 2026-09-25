package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class RouteStep implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.RouteStep> CREATOR = new com.baidu.mapapi.search.core.k();
    int a;
    int b;
    java.lang.String c;
    protected java.util.List<com.baidu.mapapi.model.LatLng> mWayPoints;

    protected RouteStep() {
    }

    protected RouteStep(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mWayPoints = arrayList;
        parcel.readList(arrayList, com.baidu.mapapi.model.LatLng.class.getClassLoader());
        if (this.mWayPoints.size() == 0) {
            this.mWayPoints = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.a;
    }

    public int getDuration() {
        return this.b;
    }

    public java.lang.String getName() {
        return this.c;
    }

    public java.util.List<com.baidu.mapapi.model.LatLng> getWayPoints() {
        return this.mWayPoints;
    }

    public void setDistance(int i) {
        this.a = i;
    }

    public void setDuration(int i) {
        this.b = i;
    }

    public void setName(java.lang.String str) {
        this.c = str;
    }

    public void setWayPoints(java.util.List<com.baidu.mapapi.model.LatLng> list) {
        this.mWayPoints = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeList(this.mWayPoints);
    }
}
