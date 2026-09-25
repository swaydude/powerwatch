package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class q implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.TransitRouteResult> {
    q() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.TransitRouteResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.TransitRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.TransitRouteResult[] newArray(int i) {
        return new com.baidu.mapapi.search.route.TransitRouteResult[i];
    }
}
