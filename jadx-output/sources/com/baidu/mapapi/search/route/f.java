package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class f implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.DrivingRouteResult> {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.DrivingRouteResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.DrivingRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.DrivingRouteResult[] newArray(int i) {
        return new com.baidu.mapapi.search.route.DrivingRouteResult[i];
    }
}
