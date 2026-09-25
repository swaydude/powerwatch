package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public final class DrivingRouteResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.DrivingRouteResult> CREATOR = new com.baidu.mapapi.search.route.f();
    private java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine> a;
    private java.util.List<com.baidu.mapapi.search.core.TaxiInfo> b;
    private com.baidu.mapapi.search.core.TaxiInfo c;
    private com.baidu.mapapi.search.route.SuggestAddrInfo d;

    public DrivingRouteResult() {
    }

    protected DrivingRouteResult(android.os.Parcel parcel) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        parcel.readTypedList(arrayList, com.baidu.mapapi.search.route.DrivingRouteLine.CREATOR);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.b = arrayList2;
        parcel.readTypedList(arrayList2, com.baidu.mapapi.search.core.TaxiInfo.CREATOR);
        this.d = (com.baidu.mapapi.search.route.SuggestAddrInfo) parcel.readParcelable(com.baidu.mapapi.search.route.SuggestAddrInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine> getRouteLines() {
        return this.a;
    }

    public com.baidu.mapapi.search.route.SuggestAddrInfo getSuggestAddrInfo() {
        return this.d;
    }

    @java.lang.Deprecated
    public com.baidu.mapapi.search.core.TaxiInfo getTaxiInfo() {
        return this.c;
    }

    public java.util.List<com.baidu.mapapi.search.core.TaxiInfo> getTaxiInfos() {
        return this.b;
    }

    public void setRouteLines(java.util.List<com.baidu.mapapi.search.route.DrivingRouteLine> list) {
        this.a = list;
    }

    public void setSuggestAddrInfo(com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo) {
        this.d = suggestAddrInfo;
    }

    public void setTaxiInfos(java.util.List<com.baidu.mapapi.search.core.TaxiInfo> list) {
        this.b = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.d, 1);
    }
}
