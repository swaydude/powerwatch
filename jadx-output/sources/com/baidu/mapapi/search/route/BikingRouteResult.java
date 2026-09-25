package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class BikingRouteResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.BikingRouteResult> CREATOR = new com.baidu.mapapi.search.route.c();
    private java.util.List<com.baidu.mapapi.search.route.BikingRouteLine> a;
    private com.baidu.mapapi.search.route.SuggestAddrInfo b;

    public BikingRouteResult() {
    }

    protected BikingRouteResult(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, com.baidu.mapapi.search.route.BikingRouteLine.class.getClassLoader());
        this.b = (com.baidu.mapapi.search.route.SuggestAddrInfo) parcel.readParcelable(com.baidu.mapapi.search.route.SuggestAddrInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.route.BikingRouteLine> getRouteLines() {
        return this.a;
    }

    public com.baidu.mapapi.search.route.SuggestAddrInfo getSuggestAddrInfo() {
        return this.b;
    }

    public void setRouteLines(java.util.List<com.baidu.mapapi.search.route.BikingRouteLine> list) {
        this.a = list;
    }

    public void setSuggestAddrInfo(com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo) {
        this.b = suggestAddrInfo;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeParcelable(this.b, 1);
    }
}
