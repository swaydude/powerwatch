package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class d {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.baidu.mapapi.search.poi.PoiFilter.IndustryType.values().length];
        a = iArr;
        try {
            iArr[com.baidu.mapapi.search.poi.PoiFilter.IndustryType.HOTEL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.baidu.mapapi.search.poi.PoiFilter.IndustryType.CATER.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.baidu.mapapi.search.poi.PoiFilter.IndustryType.LIFE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
