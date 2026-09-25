package com.baidu.platform.core.e;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class g {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.baidu.platform.base.SearchType.values().length];
        a = iArr;
        try {
            iArr[com.baidu.platform.base.SearchType.POI_DETAIL_SHARE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.baidu.platform.base.SearchType.LOCATION_SEARCH_SHARE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
