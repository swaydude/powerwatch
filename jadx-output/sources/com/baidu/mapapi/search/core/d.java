package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class d implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PlaneInfo> {
    d() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PlaneInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.PlaneInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PlaneInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.PlaneInfo[i];
    }
}
