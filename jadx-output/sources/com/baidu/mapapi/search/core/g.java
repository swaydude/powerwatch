package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class g implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiInfo> {
    g() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.PoiInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.PoiInfo[i];
    }
}
