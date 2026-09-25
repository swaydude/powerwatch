package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
final class d implements android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo> {
    d() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult.PoiRegionsInfo[i];
    }
}
