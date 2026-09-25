package com.baidu.mapapi.search.sug;

/* JADX INFO: loaded from: classes.dex */
public class SuggestionSearchOption {
    public java.lang.String mCity = null;
    public java.lang.String mKeyword = null;
    public com.baidu.mapapi.model.LatLng mLocation = null;
    public java.lang.Boolean mCityLimit = false;

    public com.baidu.mapapi.search.sug.SuggestionSearchOption city(java.lang.String str) {
        this.mCity = str;
        return this;
    }

    public com.baidu.mapapi.search.sug.SuggestionSearchOption citylimit(java.lang.Boolean bool) {
        this.mCityLimit = bool;
        return this;
    }

    public com.baidu.mapapi.search.sug.SuggestionSearchOption keyword(java.lang.String str) {
        this.mKeyword = str;
        return this;
    }

    public com.baidu.mapapi.search.sug.SuggestionSearchOption location(com.baidu.mapapi.model.LatLng latLng) {
        this.mLocation = latLng;
        return this;
    }
}
