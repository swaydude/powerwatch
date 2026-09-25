package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
final class g implements android.os.Parcelable.Creator<com.baidu.mapapi.map.BaiduMapOptions> {
    g() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.map.BaiduMapOptions createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.map.BaiduMapOptions(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.map.BaiduMapOptions[] newArray(int i) {
        return new com.baidu.mapapi.map.BaiduMapOptions[i];
    }
}
