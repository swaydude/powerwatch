package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public class IndoorRouteResult extends com.baidu.mapapi.search.core.SearchResult {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.IndoorRouteResult> CREATOR = new com.baidu.mapapi.search.route.h();
    private java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine> a;

    public IndoorRouteResult() {
    }

    protected IndoorRouteResult(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.createTypedArrayList(com.baidu.mapapi.search.route.IndoorRouteLine.CREATOR);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine> getRouteLines() {
        return this.a;
    }

    public void setRouteLines(java.util.List<com.baidu.mapapi.search.route.IndoorRouteLine> list) {
        this.a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
    }
}
