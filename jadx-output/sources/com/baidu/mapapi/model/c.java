package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
final class c implements android.os.Parcelable.Creator<com.baidu.mapapi.model.ParcelItem> {
    c() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.model.ParcelItem createFromParcel(android.os.Parcel parcel) {
        com.baidu.mapapi.model.ParcelItem parcelItem = new com.baidu.mapapi.model.ParcelItem();
        parcelItem.setBundle(parcel.readBundle());
        return parcelItem;
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.model.ParcelItem[] newArray(int i) {
        return new com.baidu.mapapi.model.ParcelItem[i];
    }
}
