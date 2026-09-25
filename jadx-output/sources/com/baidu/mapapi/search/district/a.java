package com.baidu.mapapi.search.district;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.district.DistrictResult> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.district.DistrictResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.district.DistrictResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.district.DistrictResult[] newArray(int i) {
        return new com.baidu.mapapi.search.district.DistrictResult[i];
    }
}
