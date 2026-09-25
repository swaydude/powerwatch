package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public final class TransitRouteResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.TransitRouteResult> CREATOR = new com.baidu.mapapi.search.route.q();
    private com.baidu.mapapi.search.core.TaxiInfo a;
    private java.util.List<com.baidu.mapapi.search.route.TransitRouteLine> b;
    private com.baidu.mapapi.search.route.SuggestAddrInfo c;

    public TransitRouteResult() {
    }

    protected TransitRouteResult(android.os.Parcel parcel) {
        this.a = (com.baidu.mapapi.search.core.TaxiInfo) parcel.readParcelable(com.baidu.mapapi.search.core.TaxiInfo.class.getClassLoader());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        parcel.readList(arrayList, com.baidu.mapapi.search.route.TransitRouteLine.class.getClassLoader());
        this.c = (com.baidu.mapapi.search.route.SuggestAddrInfo) parcel.readParcelable(com.baidu.mapapi.search.route.SuggestAddrInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.route.TransitRouteLine> getRouteLines() {
        return this.b;
    }

    public com.baidu.mapapi.search.route.SuggestAddrInfo getSuggestAddrInfo() {
        return this.c;
    }

    public com.baidu.mapapi.search.core.TaxiInfo getTaxiInfo() {
        return this.a;
    }

    public void setRoutelines(java.util.List<com.baidu.mapapi.search.route.TransitRouteLine> list) {
        this.b = list;
    }

    public void setSuggestAddrInfo(com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo) {
        this.c = suggestAddrInfo;
    }

    public void setTaxiInfo(com.baidu.mapapi.search.core.TaxiInfo taxiInfo) {
        this.a = taxiInfo;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 1);
        parcel.writeList(this.b);
        parcel.writeParcelable(this.c, 1);
    }
}
