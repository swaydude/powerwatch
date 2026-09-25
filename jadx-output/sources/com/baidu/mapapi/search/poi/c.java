package com.baidu.mapapi.search.poi;

/* JADX INFO: loaded from: classes.dex */
final class c implements android.os.Parcelable.Creator<com.baidu.mapapi.search.poi.PoiFilter> {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.poi.PoiFilter createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.poi.PoiFilter(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.poi.PoiFilter[] newArray(int i) {
        return new com.baidu.mapapi.search.poi.PoiFilter[i];
    }
}
