package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
final class k implements android.os.Parcelable.Creator<com.baidu.mapapi.map.MapStatus> {
    k() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.map.MapStatus createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.map.MapStatus(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.map.MapStatus[] newArray(int i) {
        return new com.baidu.mapapi.map.MapStatus[i];
    }
}
