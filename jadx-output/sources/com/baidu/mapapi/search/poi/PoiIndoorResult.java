package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiIndoorResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiIndoorResult> CREATOR = new com.baidu.mapapi.search.poi.e();
    private java.util.List<com.baidu.mapapi.search.poi.PoiIndoorInfo> a;
    public int pageNum;
    public int poiNum;

    public PoiIndoorResult() {
    }

    protected PoiIndoorResult(android.os.Parcel parcel) {
        super(parcel);
        this.poiNum = parcel.readInt();
        this.pageNum = parcel.readInt();
    }

    public PoiIndoorResult(com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPoiNum() {
        return this.poiNum;
    }

    public java.util.List<com.baidu.mapapi.search.poi.PoiIndoorInfo> getmArrayPoiInfo() {
        return this.a;
    }

    public void setPageNum(int i) {
        this.pageNum = i;
    }

    public void setPoiNum(int i) {
        this.poiNum = i;
    }

    public void setmArrayPoiInfo(java.util.List<com.baidu.mapapi.search.poi.PoiIndoorInfo> list) {
        this.a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.poiNum);
        parcel.writeInt(this.pageNum);
    }
}
