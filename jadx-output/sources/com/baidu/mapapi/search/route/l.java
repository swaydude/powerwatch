package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class l implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteResult> {
    l() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.MassTransitRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteResult[] newArray(int i) {
        return new com.baidu.mapapi.search.route.MassTransitRouteResult[i];
    }
}
