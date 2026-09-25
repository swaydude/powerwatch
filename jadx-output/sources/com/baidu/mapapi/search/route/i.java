package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class i implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteLine> {
    i() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteLine createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.MassTransitRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.MassTransitRouteLine[] newArray(int i) {
        return new com.baidu.mapapi.search.route.MassTransitRouteLine[i];
    }
}
