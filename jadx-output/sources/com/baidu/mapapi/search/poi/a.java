package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiDetailResult> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.poi.PoiDetailResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.poi.PoiDetailResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.poi.PoiDetailResult[] newArray(int i) {
        return new com.baidu.mapapi.search.poi.PoiDetailResult[i];
    }
}
