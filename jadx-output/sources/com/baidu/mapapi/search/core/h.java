package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class h implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo> {
    h() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.PoiInfo.ParentPoiInfo[i];
    }
}
