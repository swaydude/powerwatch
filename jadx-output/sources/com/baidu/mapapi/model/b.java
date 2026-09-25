package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
final class b implements android.os.Parcelable.Creator<com.baidu.mapapi.model.LatLngBounds> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.model.LatLngBounds createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.model.LatLngBounds(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.model.LatLngBounds[] newArray(int i) {
        return new com.baidu.mapapi.model.LatLngBounds[i];
    }
}
