package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class n implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.SuggestAddrInfo> {
    n() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.SuggestAddrInfo createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.SuggestAddrInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.SuggestAddrInfo[] newArray(int i) {
        return new com.baidu.mapapi.search.route.SuggestAddrInfo[i];
    }
}
