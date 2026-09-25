package com.baidu.mapapi.search.district;

/* JADX INFO: loaded from: classes.dex */
public class DistrictSearchOption {
    public java.lang.String mCityName;
    public java.lang.String mDistrictName;

    public com.baidu.mapapi.search.district.DistrictSearchOption cityName(java.lang.String str) {
        this.mCityName = str;
        return this;
    }

    public com.baidu.mapapi.search.district.DistrictSearchOption districtName(java.lang.String str) {
        this.mDistrictName = str;
        return this;
    }
}
