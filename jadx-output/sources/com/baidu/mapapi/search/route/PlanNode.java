package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class PlanNode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.PlanNode> CREATOR = new com.baidu.mapapi.search.route.m();
    private com.baidu.mapapi.model.LatLng a;
    private java.lang.String b;
    private java.lang.String c;

    protected PlanNode(android.os.Parcel parcel) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = (com.baidu.mapapi.model.LatLng) parcel.readValue(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    PlanNode(com.baidu.mapapi.model.LatLng latLng, java.lang.String str, java.lang.String str2) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = latLng;
        this.b = str;
        this.c = str2;
    }

    public static com.baidu.mapapi.search.route.PlanNode withCityCodeAndPlaceName(int i, java.lang.String str) {
        return new com.baidu.mapapi.search.route.PlanNode(null, java.lang.String.valueOf(i), str);
    }

    public static com.baidu.mapapi.search.route.PlanNode withCityNameAndPlaceName(java.lang.String str, java.lang.String str2) {
        return new com.baidu.mapapi.search.route.PlanNode(null, str, str2);
    }

    public static com.baidu.mapapi.search.route.PlanNode withLocation(com.baidu.mapapi.model.LatLng latLng) {
        return new com.baidu.mapapi.search.route.PlanNode(latLng, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getCity() {
        return this.b;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.a;
    }

    public java.lang.String getName() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
