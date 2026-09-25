package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiResult> CREATOR = new com.baidu.mapapi.search.poi.f();
    private int a;
    private int b;
    private int c;
    private int d;
    private java.util.List<com.baidu.mapapi.search.core.PoiInfo> e;
    private boolean f;
    private java.util.List<com.baidu.mapapi.search.poi.PoiAddrInfo> g;
    private java.util.List<com.baidu.mapapi.search.core.CityInfo> h;

    public PoiResult() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = false;
    }

    protected PoiResult(android.os.Parcel parcel) {
        super(parcel);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = false;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.createTypedArrayList(com.baidu.mapapi.search.core.PoiInfo.CREATOR);
        this.f = parcel.readByte() != 0;
        this.h = parcel.createTypedArrayList(com.baidu.mapapi.search.core.CityInfo.CREATOR);
    }

    public PoiResult(com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno) {
        super(errorno);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = false;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.poi.PoiAddrInfo> getAllAddr() {
        return this.g;
    }

    public java.util.List<com.baidu.mapapi.search.core.PoiInfo> getAllPoi() {
        return this.e;
    }

    public int getCurrentPageCapacity() {
        return this.c;
    }

    public int getCurrentPageNum() {
        return this.a;
    }

    public java.util.List<com.baidu.mapapi.search.core.CityInfo> getSuggestCityList() {
        return this.h;
    }

    public int getTotalPageNum() {
        return this.b;
    }

    public int getTotalPoiNum() {
        return this.d;
    }

    public boolean isHasAddrInfo() {
        return this.f;
    }

    public void setAddrInfo(java.util.List<com.baidu.mapapi.search.poi.PoiAddrInfo> list) {
        this.g = list;
    }

    public void setCurrentPageCapacity(int i) {
        this.c = i;
    }

    public void setCurrentPageNum(int i) {
        this.a = i;
    }

    public void setHasAddrInfo(boolean z) {
        this.f = z;
    }

    public void setPoiInfo(java.util.List<com.baidu.mapapi.search.core.PoiInfo> list) {
        this.e = list;
    }

    public void setSuggestCityList(java.util.List<com.baidu.mapapi.search.core.CityInfo> list) {
        this.h = list;
    }

    public void setTotalPageNum(int i) {
        this.b = i;
    }

    public void setTotalPoiNum(int i) {
        this.d = i;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.h);
    }
}
