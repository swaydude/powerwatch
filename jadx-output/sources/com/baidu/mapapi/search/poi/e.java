package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
final class e implements android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiIndoorResult> {
    e() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.poi.PoiIndoorResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.poi.PoiIndoorResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.poi.PoiIndoorResult[] newArray(int i) {
        return new com.baidu.mapapi.search.poi.PoiIndoorResult[i];
    }
}
