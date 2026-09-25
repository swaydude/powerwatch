package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
public class GeoCodeResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.GeoCodeResult> CREATOR = new com.baidu.mapapi.search.geocode.a();
    private com.baidu.mapapi.model.LatLng a;
    private java.lang.String b;
    private int c;
    private int d;
    private java.lang.String e;

    public GeoCodeResult() {
    }

    protected GeoCodeResult(android.os.Parcel parcel) {
        this.a = (com.baidu.mapapi.model.LatLng) parcel.readValue(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @java.lang.Deprecated
    public java.lang.String getAddress() {
        return this.b;
    }

    public int getConfidence() {
        return this.d;
    }

    public java.lang.String getLevel() {
        return this.e;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.a;
    }

    public int getPrecise() {
        return this.c;
    }

    @java.lang.Deprecated
    public void setAddress(java.lang.String str) {
        this.b = str;
    }

    public void setConfidence(int i) {
        this.d = i;
    }

    public void setLevel(java.lang.String str) {
        this.e = str;
    }

    public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.a = latLng;
    }

    public void setPrecise(int i) {
        this.c = i;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("GeoCodeResult: \n");
        stringBuffer.append("location = ");
        stringBuffer.append(this.a);
        stringBuffer.append("; precise = ");
        stringBuffer.append(this.c);
        stringBuffer.append("; confidence = ");
        stringBuffer.append(this.d);
        stringBuffer.append("; level = ");
        stringBuffer.append(this.e);
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}
