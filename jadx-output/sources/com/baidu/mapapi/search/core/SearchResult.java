package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
public class SearchResult implements android.os.Parcelable {
    public com.baidu.mapapi.search.core.SearchResult.ERRORNO error;
    public int status;

    public enum ERRORNO {
        NO_ERROR,
        RESULT_NOT_FOUND,
        AMBIGUOUS_KEYWORD,
        AMBIGUOUS_ROURE_ADDR,
        NOT_SUPPORT_BUS,
        NOT_SUPPORT_BUS_2CITY,
        ST_EN_TOO_NEAR,
        KEY_ERROR,
        PERMISSION_UNFINISHED,
        NETWORK_TIME_OUT,
        NETWORK_ERROR,
        POIINDOOR_BID_ERROR,
        POIINDOOR_FLOOR_ERROR,
        POIINDOOR_SERVER_ERROR,
        INDOOR_ROUTE_NO_IN_BUILDING,
        INDOOR_ROUTE_NO_IN_SAME_BUILDING,
        MASS_TRANSIT_SERVER_ERROR,
        MASS_TRANSIT_OPTION_ERROR,
        MASS_TRANSIT_NO_POI_ERROR,
        SEARCH_SERVER_INTERNAL_ERROR,
        SEARCH_OPTION_ERROR,
        REQUEST_ERROR
    }

    public SearchResult() {
        this.status = 0;
        this.error = com.baidu.mapapi.search.core.SearchResult.ERRORNO.NO_ERROR;
    }

    protected SearchResult(android.os.Parcel parcel) {
        this.status = 0;
        int i = parcel.readInt();
        this.error = i == -1 ? null : com.baidu.mapapi.search.core.SearchResult.ERRORNO.values()[i];
    }

    public SearchResult(com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno) {
        this.status = 0;
        this.error = errorno;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno = this.error;
        parcel.writeInt(errorno == null ? -1 : errorno.ordinal());
    }
}
