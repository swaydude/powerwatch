package com.baidu.mapsdkplatform.comjni.tools;

/* JADX INFO: loaded from: classes.dex */
final class b implements android.os.Parcelable.Creator<com.baidu.mapsdkplatform.comjni.tools.ParcelItem> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapsdkplatform.comjni.tools.ParcelItem createFromParcel(android.os.Parcel parcel) {
        com.baidu.mapsdkplatform.comjni.tools.ParcelItem parcelItem = new com.baidu.mapsdkplatform.comjni.tools.ParcelItem();
        parcelItem.setBundle(parcel.readBundle());
        return parcelItem;
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapsdkplatform.comjni.tools.ParcelItem[] newArray(int i) {
        return new com.baidu.mapsdkplatform.comjni.tools.ParcelItem[i];
    }
}
