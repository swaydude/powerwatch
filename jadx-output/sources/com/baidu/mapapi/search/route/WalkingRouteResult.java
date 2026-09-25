package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class WalkingRouteResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.WalkingRouteResult> CREATOR = new com.baidu.mapapi.search.route.t();
    private java.util.List<com.baidu.mapapi.search.route.WalkingRouteLine> a;
    private com.baidu.mapapi.search.core.TaxiInfo b;
    private com.baidu.mapapi.search.route.SuggestAddrInfo c;

    public WalkingRouteResult() {
    }

    protected WalkingRouteResult(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        parcel.readList(arrayList, com.baidu.mapapi.search.route.WalkingRouteLine.class.getClassLoader());
        this.b = (com.baidu.mapapi.search.core.TaxiInfo) parcel.readParcelable(com.baidu.mapapi.search.core.TaxiInfo.class.getClassLoader());
        this.c = (com.baidu.mapapi.search.route.SuggestAddrInfo) parcel.readParcelable(com.baidu.mapapi.search.route.SuggestAddrInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.route.WalkingRouteLine> getRouteLines() {
        return this.a;
    }

    public com.baidu.mapapi.search.route.SuggestAddrInfo getSuggestAddrInfo() {
        return this.c;
    }

    public com.baidu.mapapi.search.core.TaxiInfo getTaxiInfo() {
        return this.b;
    }

    public void setRouteLines(java.util.List<com.baidu.mapapi.search.route.WalkingRouteLine> list) {
        this.a = list;
    }

    public void setSuggestAddrInfo(com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo) {
        this.c = suggestAddrInfo;
    }

    public void setTaxiInfo(com.baidu.mapapi.search.core.TaxiInfo taxiInfo) {
        this.b = taxiInfo;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeParcelable(this.b, 1);
        parcel.writeParcelable(this.c, 1);
    }
}
