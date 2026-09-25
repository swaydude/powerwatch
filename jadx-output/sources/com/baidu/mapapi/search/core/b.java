package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class b implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.CityInfo> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.CityInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.CityInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.CityInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.core.CityInfo[i];
    }
}
