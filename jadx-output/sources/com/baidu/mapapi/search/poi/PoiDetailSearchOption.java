package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
public class PoiDetailSearchOption {
    private java.lang.String a = "";
    private java.lang.String b = "";
    private boolean c = false;

    public java.lang.String getUid() {
        return this.a;
    }

    public java.lang.String getUids() {
        return this.b;
    }

    public boolean isSearchByUids() {
        return this.c;
    }

    public com.baidu.mapapi.search.poi.PoiDetailSearchOption poiUid(java.lang.String str) {
        this.c = false;
        this.a = str;
        return this;
    }

    public com.baidu.mapapi.search.poi.PoiDetailSearchOption poiUids(java.lang.String str) {
        this.c = true;
        this.b = str;
        return this;
    }
}
