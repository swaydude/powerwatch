package com.baidu.mapapi.search.district;

/* JADX INFO: loaded from: classes.dex */
public class DistrictSearch extends com.baidu.mapapi.search.core.l {
    private com.baidu.platform.core.a.e a;
    private boolean b = false;

    DistrictSearch() {
        this.a = null;
        this.a = new com.baidu.platform.core.a.d();
    }

    public static com.baidu.mapapi.search.district.DistrictSearch newInstance() {
        com.baidu.mapapi.BMapManager.init();
        return new com.baidu.mapapi.search.district.DistrictSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
        com.baidu.mapapi.BMapManager.destroy();
    }

    public boolean searchDistrict(com.baidu.mapapi.search.district.DistrictSearchOption districtSearchOption) {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (districtSearchOption == null || districtSearchOption.mCityName == null || districtSearchOption.mCityName.equals("")) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: option or city name can not be null or empty.");
        }
        return this.a.a(districtSearchOption);
    }

    public void setOnDistrictSearchListener(com.baidu.mapapi.search.district.OnGetDistricSearchResultListener onGetDistricSearchResultListener) {
        com.baidu.platform.core.a.e eVar = this.a;
        if (eVar == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetDistricSearchResultListener == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        eVar.a(onGetDistricSearchResultListener);
    }
}
