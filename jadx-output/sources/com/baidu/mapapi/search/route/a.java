package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.BikingRouteLine> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.BikingRouteLine createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.BikingRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.BikingRouteLine[] newArray(int i) {
        return new com.baidu.mapapi.search.route.BikingRouteLine[i];
    }
}
