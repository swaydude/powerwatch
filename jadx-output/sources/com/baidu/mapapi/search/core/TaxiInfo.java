package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class TaxiInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.TaxiInfo> CREATOR = new com.baidu.mapapi.search.core.m();
    private float a;
    private java.lang.String b;
    private int c;
    private int d;
    private float e;
    private float f;

    public TaxiInfo() {
    }

    TaxiInfo(android.os.Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getDesc() {
        return this.b;
    }

    public int getDistance() {
        return this.c;
    }

    public int getDuration() {
        return this.d;
    }

    public float getPerKMPrice() {
        return this.e;
    }

    public float getStartPrice() {
        return this.f;
    }

    public float getTotalPrice() {
        return this.a;
    }

    public void setDesc(java.lang.String str) {
        this.b = str;
    }

    public void setDistance(int i) {
        this.c = i;
    }

    public void setDuration(int i) {
        this.d = i;
    }

    public void setPerKMPrice(float f) {
        this.e = f;
    }

    public void setStartPrice(float f) {
        this.f = f;
    }

    public void setTotalPrice(float f) {
        this.a = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }
}
