package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class e implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep> {
    e() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep[] newArray(int i) {
        return new com.baidu.mapapi.search.route.DrivingRouteLine.DrivingStep[i];
    }
}
