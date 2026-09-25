package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class VehicleInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.VehicleInfo> CREATOR = new com.baidu.mapapi.search.core.r();
    private java.lang.String a;
    private int b;
    private java.lang.String c;
    private int d;
    private int e;

    public VehicleInfo() {
    }

    protected VehicleInfo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getPassStationNum() {
        return this.b;
    }

    public java.lang.String getTitle() {
        return this.c;
    }

    public int getTotalPrice() {
        return this.e;
    }

    public java.lang.String getUid() {
        return this.a;
    }

    public int getZonePrice() {
        return this.d;
    }

    public void setPassStationNum(int i) {
        this.b = i;
    }

    public void setTitle(java.lang.String str) {
        this.c = str;
    }

    public void setTotalPrice(int i) {
        this.e = i;
    }

    public void setUid(java.lang.String str) {
        this.a = str;
    }

    public void setZonePrice(int i) {
        this.d = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
