package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public final class MassTransitRouteResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteResult> CREATOR = new com.baidu.mapapi.search.route.l();
    private com.baidu.mapapi.search.core.TransitResultNode a;
    private com.baidu.mapapi.search.core.TransitResultNode b;
    private com.baidu.mapapi.search.core.TaxiInfo c;
    private int d;
    private java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine> e;
    private com.baidu.mapapi.search.route.SuggestAddrInfo f;

    public MassTransitRouteResult() {
    }

    MassTransitRouteResult(android.os.Parcel parcel) {
        this.a = (com.baidu.mapapi.search.core.TransitResultNode) parcel.readParcelable(com.baidu.mapapi.search.core.TransitResultNode.class.getClassLoader());
        this.b = (com.baidu.mapapi.search.core.TransitResultNode) parcel.readParcelable(com.baidu.mapapi.search.core.TransitResultNode.class.getClassLoader());
        this.c = (com.baidu.mapapi.search.core.TaxiInfo) parcel.readParcelable(com.baidu.mapapi.search.core.TaxiInfo.class.getClassLoader());
        this.d = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.e = arrayList;
        parcel.readList(arrayList, com.baidu.mapapi.search.route.MassTransitRouteLine.class.getClassLoader());
        this.f = (com.baidu.mapapi.search.route.SuggestAddrInfo) parcel.readParcelable(com.baidu.mapapi.search.route.SuggestAddrInfo.class.getClassLoader());
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.baidu.mapapi.search.core.TransitResultNode getDestination() {
        return this.b;
    }

    public com.baidu.mapapi.search.core.TransitResultNode getOrigin() {
        return this.a;
    }

    public java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine> getRouteLines() {
        return this.e;
    }

    public com.baidu.mapapi.search.route.SuggestAddrInfo getSuggestAddrInfo() {
        return this.f;
    }

    public com.baidu.mapapi.search.core.TaxiInfo getTaxiInfo() {
        return this.c;
    }

    public int getTotal() {
        return this.d;
    }

    public void setDestination(com.baidu.mapapi.search.core.TransitResultNode transitResultNode) {
        this.b = transitResultNode;
    }

    public void setOrigin(com.baidu.mapapi.search.core.TransitResultNode transitResultNode) {
        this.a = transitResultNode;
    }

    public void setRoutelines(java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine> list) {
        this.e = list;
    }

    public void setSuggestAddrInfo(com.baidu.mapapi.search.route.SuggestAddrInfo suggestAddrInfo) {
        this.f = suggestAddrInfo;
    }

    public void setTaxiInfo(com.baidu.mapapi.search.core.TaxiInfo taxiInfo) {
        this.c = taxiInfo;
    }

    public void setTotal(int i) {
        this.d = i;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 1);
        parcel.writeParcelable(this.b, 1);
        parcel.writeParcelable(this.c, 1);
        parcel.writeInt(this.d);
        parcel.writeList(this.e);
        parcel.writeParcelable(this.f, 1);
    }
}
