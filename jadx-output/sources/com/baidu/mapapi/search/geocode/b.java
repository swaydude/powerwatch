package com.baidu.mapapi.search.geocode;

/* JADX INFO: loaded from: classes.dex */
final class b implements android.os.Parcelable.Creator<com.baidu.mapapi.search.geocode.ReverseGeoCodeResult> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.geocode.ReverseGeoCodeResult[] newArray(int i) {
        return new com.baidu.mapapi.search.geocode.ReverseGeoCodeResult[i];
    }
}
