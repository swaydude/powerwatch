package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiDetailSearchResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiDetailSearchResult> CREATOR = new com.baidu.mapapi.search.poi.b();
    private java.util.List<com.baidu.mapapi.search.core.PoiDetailInfo> a;

    public PoiDetailSearchResult() {
    }

    protected PoiDetailSearchResult(android.os.Parcel parcel) {
        super(parcel);
        this.a = parcel.createTypedArrayList(com.baidu.mapapi.search.core.PoiDetailInfo.CREATOR);
    }

    public PoiDetailSearchResult(com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.core.PoiDetailInfo> getPoiDetailInfoList() {
        return this.a;
    }

    public void setPoiDetailInfoList(java.util.List<com.baidu.mapapi.search.core.PoiDetailInfo> list) {
        this.a = list;
    }

    public java.lang.String toString() {
        java.util.List<com.baidu.mapapi.search.core.PoiDetailInfo> list = this.a;
        if (list == null || list.isEmpty()) {
            return "PoiDetailSearchResult is null";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PoiDetailSearchResult:");
        for (int i = 0; i < this.a.size(); i++) {
            stringBuffer.append(" ");
            stringBuffer.append(i);
            stringBuffer.append(" ");
            com.baidu.mapapi.search.core.PoiDetailInfo poiDetailInfo = this.a.get(i);
            stringBuffer.append(poiDetailInfo != null ? poiDetailInfo.toString() : "null");
        }
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
    }
}
