package com.baidu.platform.core.d;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class l {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.baidu.platform.base.SearchType.values().length];
        a = iArr;
        try {
            iArr[com.baidu.platform.base.SearchType.TRANSIT_ROUTE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            a[com.baidu.platform.base.SearchType.DRIVE_ROUTE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            a[com.baidu.platform.base.SearchType.WALK_ROUTE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
    }
}
