package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class s implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep> {
    s() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep[] newArray(int i) {
        return new com.baidu.mapapi.search.route.WalkingRouteLine.WalkingStep[i];
    }
}
