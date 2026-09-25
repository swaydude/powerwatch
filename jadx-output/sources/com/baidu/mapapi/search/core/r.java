package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class r implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.VehicleInfo> {
    r() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.VehicleInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.VehicleInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.VehicleInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.VehicleInfo[i];
    }
}
