package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class TransitResultNode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.TransitResultNode> CREATOR = new com.baidu.mapapi.search.core.q();
    private int a;
    private java.lang.String b;
    private com.baidu.mapapi.model.LatLng c;
    private java.lang.String d;

    public TransitResultNode(int i, java.lang.String str, com.baidu.mapapi.model.LatLng latLng, java.lang.String str2) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = i;
        this.b = str;
        this.c = latLng;
        this.d = str2;
    }

    protected TransitResultNode(android.os.Parcel parcel) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = (com.baidu.mapapi.model.LatLng) parcel.readValue(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCityId() {
        return this.a;
    }

    public java.lang.String getCityName() {
        return this.b;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.c;
    }

    public java.lang.String getSearchWord() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
    }
}
