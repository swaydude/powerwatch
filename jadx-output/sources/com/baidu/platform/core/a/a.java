package com.baidu.platform.core.a;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.baidu.platform.base.e {
    a(com.baidu.mapapi.search.district.DistrictSearchOption districtSearchOption) {
        a(districtSearchOption);
    }

    private void a(com.baidu.mapapi.search.district.DistrictSearchOption districtSearchOption) {
        com.baidu.platform.util.a aVar;
        java.lang.String str;
        if (districtSearchOption == null) {
            return;
        }
        this.a.a("qt", "con");
        this.a.a("rp_format", "json");
        this.a.a("rp_filter", "mobile");
        this.a.a("area_res", "true");
        this.a.a("addr_identify", "1");
        this.a.a("ie", "utf-8");
        this.a.a("pn", "0");
        this.a.a("rn", "10");
        this.a.a("c", districtSearchOption.mCityName);
        if (districtSearchOption.mDistrictName == null || districtSearchOption.mDistrictName.equals("")) {
            aVar = this.a;
            str = districtSearchOption.mCityName;
        } else {
            aVar = this.a;
            str = districtSearchOption.mDistrictName;
        }
        aVar.a("wd", str);
    }

    @Override // com.baidu.platform.base.e
    public java.lang.String a(com.baidu.platform.domain.c cVar) {
        return cVar.n();
    }
}
