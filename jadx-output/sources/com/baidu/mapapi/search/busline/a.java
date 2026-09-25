package com.baidu.mapapi.search.busline;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.busline.BusLineResult> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.busline.BusLineResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.busline.BusLineResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.busline.BusLineResult[] newArray(int i) {
        return new com.baidu.mapapi.search.busline.BusLineResult[i];
    }
}
