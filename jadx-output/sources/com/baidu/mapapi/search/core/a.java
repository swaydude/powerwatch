package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.BusInfo> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.BusInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.BusInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.BusInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.BusInfo[i];
    }
}
