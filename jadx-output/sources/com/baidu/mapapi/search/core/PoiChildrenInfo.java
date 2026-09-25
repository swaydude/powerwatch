package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class PoiChildrenInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiChildrenInfo> CREATOR = new com.baidu.mapapi.search.core.e();
    private java.lang.String a;
    private java.lang.String b;
    private java.lang.String c;
    private java.lang.String d;
    private com.baidu.mapapi.model.LatLng e;
    private java.lang.String f;

    public PoiChildrenInfo() {
    }

    protected PoiChildrenInfo(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getAddress() {
        return this.f;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.e;
    }

    public java.lang.String getName() {
        return this.b;
    }

    public java.lang.String getShowName() {
        return this.c;
    }

    public java.lang.String getTag() {
        return this.d;
    }

    public java.lang.String getUid() {
        return this.a;
    }

    public void setAddress(java.lang.String str) {
        this.f = str;
    }

    public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.e = latLng;
    }

    public void setName(java.lang.String str) {
        this.b = str;
    }

    public void setShowName(java.lang.String str) {
        this.c = str;
    }

    public void setTag(java.lang.String str) {
        this.d = str;
    }

    public void setUid(java.lang.String str) {
        this.a = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiChildrenInfo: ");
        stringBuffer.append("uid = ");
        stringBuffer.append(this.a);
        stringBuffer.append("; name = ");
        stringBuffer.append(this.b);
        stringBuffer.append("; showName = ");
        stringBuffer.append(this.c);
        stringBuffer.append("; tag = ");
        stringBuffer.append(this.d);
        stringBuffer.append("; location = ");
        com.baidu.mapapi.model.LatLng latLng = this.e;
        stringBuffer.append(latLng != null ? latLng.toString() : "null");
        stringBuffer.append("; address = ");
        stringBuffer.append(this.f);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeString(this.f);
    }
}
