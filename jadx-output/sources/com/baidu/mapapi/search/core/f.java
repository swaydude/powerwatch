package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class f implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiDetailInfo> {
    f() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiDetailInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.PoiDetailInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiDetailInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.PoiDetailInfo[i];
    }
}
