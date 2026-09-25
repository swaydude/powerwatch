package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class PlaneInfo extends com.baidu.mapapi.search.core.TransitBaseInfo {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PlaneInfo> CREATOR = new com.baidu.mapapi.search.core.d();
    private double a;
    private java.lang.String b;
    private double c;
    private java.lang.String d;

    public PlaneInfo() {
    }

    protected PlaneInfo(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readDouble();
        this.b = parcel.readString();
        this.c = parcel.readDouble();
        this.d = parcel.readString();
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAirlines() {
        return this.b;
    }

    public java.lang.String getBooking() {
        return this.d;
    }

    public double getDiscount() {
        return this.a;
    }

    public double getPrice() {
        return this.c;
    }

    public void setAirlines(java.lang.String str) {
        this.b = str;
    }

    public void setBooking(java.lang.String str) {
        this.d = str;
    }

    public void setDiscount(double d) {
        this.a = d;
    }

    public void setPrice(double d) {
        this.c = d;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeString(this.d);
    }
}
