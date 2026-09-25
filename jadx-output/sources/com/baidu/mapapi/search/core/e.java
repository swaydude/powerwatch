package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class e implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.PoiChildrenInfo> {
    e() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiChildrenInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.PoiChildrenInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.PoiChildrenInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.PoiChildrenInfo[i];
    }
}
