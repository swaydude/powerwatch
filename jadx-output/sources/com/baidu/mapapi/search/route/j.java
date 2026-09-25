package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class j implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep> {
    j() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep[] newArray(int i) {
        return new com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep[i];
    }
}
