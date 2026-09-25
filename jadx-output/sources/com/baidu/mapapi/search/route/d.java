package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class d implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.DrivingRouteLine> {
    d() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.DrivingRouteLine createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.DrivingRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.DrivingRouteLine[] newArray(int i) {
        return new com.baidu.mapapi.search.route.DrivingRouteLine[i];
    }
}
