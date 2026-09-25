package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class h implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.IndoorRouteResult> {
    h() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.IndoorRouteResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.IndoorRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.IndoorRouteResult[] newArray(int i) {
        return new com.baidu.mapapi.search.route.IndoorRouteResult[i];
    }
}
