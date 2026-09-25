package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class k implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.RouteStep> {
    k() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.RouteStep createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.RouteStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.RouteStep[] newArray(int i) {
        return new com.baidu.mapapi.search.core.RouteStep[i];
    }
}
