package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class g implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.IndoorRouteLine> {
    g() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.IndoorRouteLine createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.IndoorRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.IndoorRouteLine[] newArray(int i) {
        return new com.baidu.mapapi.search.route.IndoorRouteLine[i];
    }
}
