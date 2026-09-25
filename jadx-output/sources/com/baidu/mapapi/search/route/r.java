package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class r implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.WalkingRouteLine> {
    r() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.WalkingRouteLine createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.WalkingRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.WalkingRouteLine[] newArray(int i) {
        return new com.baidu.mapapi.search.route.WalkingRouteLine[i];
    }
}
