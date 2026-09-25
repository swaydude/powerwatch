package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class TransitBaseInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.TransitBaseInfo> CREATOR = new com.baidu.mapapi.search.core.p();
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private java.lang.String e;

    public TransitBaseInfo() {
    }

    protected TransitBaseInfo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getArriveStation() {
        return this.c;
    }

    public java.lang.String getArriveTime() {
        return this.e;
    }

    public java.lang.String getDepartureStation() {
        return this.b;
    }

    public java.lang.String getDepartureTime() {
        return this.d;
    }

    public java.lang.String getName() {
        return this.a;
    }

    public void setArriveStation(java.lang.String str) {
        this.c = str;
    }

    public void setArriveTime(java.lang.String str) {
        this.e = str;
    }

    public void setDepartureStation(java.lang.String str) {
        this.b = str;
    }

    public void setDepartureTime(java.lang.String str) {
        this.d = str;
    }

    public void setName(java.lang.String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
