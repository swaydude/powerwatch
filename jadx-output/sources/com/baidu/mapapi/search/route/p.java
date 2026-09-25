package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class p implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.TransitRouteLine.TransitStep> {
    p() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.TransitRouteLine.TransitStep createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.TransitRouteLine.TransitStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.TransitRouteLine.TransitStep[] newArray(int i) {
        return new com.baidu.mapapi.search.route.TransitRouteLine.TransitStep[i];
    }
}
