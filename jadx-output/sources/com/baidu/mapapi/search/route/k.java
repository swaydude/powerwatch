package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class k implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition> {
    k() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition[] newArray(int i) {
        return new com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition[i];
    }
}
