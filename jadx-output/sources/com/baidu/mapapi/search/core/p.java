package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class p implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.TransitBaseInfo> {
    p() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.TransitBaseInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.TransitBaseInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.TransitBaseInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.TransitBaseInfo[i];
    }
}
