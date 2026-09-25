package com.baidu.mapapi.search.share;

/* JADX INFO: loaded from: classes.dex */
final class a implements android.os.Parcelable.Creator<com.baidu.mapapi.search.share.ShareUrlResult> {
    a() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.share.ShareUrlResult createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.share.ShareUrlResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.share.ShareUrlResult[] newArray(int i) {
        return new com.baidu.mapapi.search.share.ShareUrlResult[i];
    }
}
