package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class CoachInfo extends com.baidu.mapapi.search.core.TransitBaseInfo {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.CoachInfo> CREATOR = new com.baidu.mapapi.search.core.c();
    private double a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;

    public CoachInfo() {
    }

    protected CoachInfo(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.readDouble();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getBooking() {
        return this.b;
    }

    public double getPrice() {
        return this.a;
    }

    public java.lang.String getProviderName() {
        return this.c;
    }

    public java.lang.String getProviderUrl() {
        return this.d;
    }

    public void setBooking(java.lang.String str) {
        this.b = str;
    }

    public void setPrice(double d) {
        this.a = d;
    }

    public void setProviderName(java.lang.String str) {
        this.c = str;
    }

    public void setProviderUrl(java.lang.String str) {
        this.d = str;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
