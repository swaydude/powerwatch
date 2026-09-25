package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.model.LatLng> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.model.LatLng createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.model.LatLng(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.model.LatLng[] newArray(int i) {
        return new com.baidu.mapapi.model.LatLng[i];
    }
}
