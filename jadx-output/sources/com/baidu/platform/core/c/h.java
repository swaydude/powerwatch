package com.baidu.platform.core.c;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class h {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.baidu.platform.base.SearchType.values().length];
        a = iArr;
        try {
            iArr[com.baidu.platform.base.SearchType.POI_NEAR_BY_SEARCH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.baidu.platform.base.SearchType.POI_IN_CITY_SEARCH.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.baidu.platform.base.SearchType.POI_IN_BOUND_SEARCH.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
