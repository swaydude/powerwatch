package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class SuggestAddrInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.SuggestAddrInfo> CREATOR = new com.baidu.mapapi.search.route.n();
    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> a;
    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> b;
    private java.util.List<java.util.List<com.baidu.mapapi.search.core.PoiInfo>> c;
    private java.util.List<com.baidu.mapapi.search.core.CityInfo> d;
    private java.util.List<com.baidu.mapapi.search.core.CityInfo> e;
    private java.util.List<java.util.List<com.baidu.mapapi.search.core.CityInfo>> f;

    public SuggestAddrInfo() {
    }

    SuggestAddrInfo(android.os.Parcel parcel) {
        this.a = parcel.readArrayList(com.baidu.mapapi.search.core.PoiInfo.class.getClassLoader());
        this.b = parcel.readArrayList(com.baidu.mapapi.search.core.PoiInfo.class.getClassLoader());
        this.c = parcel.readArrayList(com.baidu.mapapi.search.core.PoiInfo.class.getClassLoader());
        this.d = parcel.readArrayList(com.baidu.mapapi.search.core.CityInfo.class.getClassLoader());
        this.e = parcel.readArrayList(com.baidu.mapapi.search.core.CityInfo.class.getClassLoader());
        this.f = parcel.readArrayList(com.baidu.mapapi.search.core.CityInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.core.CityInfo> getSuggestEndCity() {
        return this.e;
    }

    public java.util.List<com.baidu.mapapi.search.core.PoiInfo> getSuggestEndNode() {
        return this.b;
    }

    public java.util.List<com.baidu.mapapi.search.core.CityInfo> getSuggestStartCity() {
        return this.d;
    }

    public java.util.List<com.baidu.mapapi.search.core.PoiInfo> getSuggestStartNode() {
        return this.a;
    }

    public java.util.List<java.util.List<com.baidu.mapapi.search.core.CityInfo>> getSuggestWpCity() {
        return this.f;
    }

    public java.util.List<java.util.List<com.baidu.mapapi.search.core.PoiInfo>> getSuggestWpNode() {
        return this.c;
    }

    public void setSuggestEndCity(java.util.List<com.baidu.mapapi.search.core.CityInfo> list) {
        this.e = list;
    }

    public void setSuggestEndNode(java.util.List<com.baidu.mapapi.search.core.PoiInfo> list) {
        this.b = list;
    }

    public void setSuggestStartCity(java.util.List<com.baidu.mapapi.search.core.CityInfo> list) {
        this.d = list;
    }

    public void setSuggestStartNode(java.util.List<com.baidu.mapapi.search.core.PoiInfo> list) {
        this.a = list;
    }

    public void setSuggestWpCity(java.util.List<java.util.List<com.baidu.mapapi.search.core.CityInfo>> list) {
        this.f = list;
    }

    public void setSuggestWpNode(java.util.List<java.util.List<com.baidu.mapapi.search.core.PoiInfo>> list) {
        this.c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeList(this.b);
        parcel.writeList(this.c);
        parcel.writeList(this.d);
        parcel.writeList(this.e);
        parcel.writeList(this.f);
    }
}
