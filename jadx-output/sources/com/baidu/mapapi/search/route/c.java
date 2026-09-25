package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class c implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.BikingRouteResult> {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.BikingRouteResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.BikingRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.BikingRouteResult[] newArray(int i) {
        return new com.baidu.mapapi.search.route.BikingRouteResult[i];
    }
}
