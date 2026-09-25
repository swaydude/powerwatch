package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class RouteNode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.core.RouteNode> CREATOR = new com.baidu.mapapi.search.core.j();
    private java.lang.String a;
    private com.baidu.mapapi.model.LatLng b;
    private java.lang.String c;

    public RouteNode() {
    }

    protected RouteNode(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = (com.baidu.mapapi.model.LatLng) parcel.readValue(com.baidu.mapapi.model.LatLng.class.getClassLoader());
        this.c = parcel.readString();
    }

    public static com.baidu.mapapi.search.core.RouteNode location(com.baidu.mapapi.model.LatLng latLng) {
        com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
        routeNode.setLocation(latLng);
        return routeNode;
    }

    public static com.baidu.mapapi.search.core.RouteNode titleAndLocation(java.lang.String str, com.baidu.mapapi.model.LatLng latLng) {
        com.baidu.mapapi.search.core.RouteNode routeNode = new com.baidu.mapapi.search.core.RouteNode();
        routeNode.setTitle(str);
        routeNode.setLocation(latLng);
        return routeNode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.baidu.mapapi.model.LatLng getLocation() {
        return this.b;
    }

    public java.lang.String getTitle() {
        return this.a;
    }

    public java.lang.String getUid() {
        return this.c;
    }

    public void setLocation(com.baidu.mapapi.model.LatLng latLng) {
        this.b = latLng;
    }

    public void setTitle(java.lang.String str) {
        this.a = str;
    }

    public void setUid(java.lang.String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeValue(this.b);
        parcel.writeString(this.c);
    }
}
