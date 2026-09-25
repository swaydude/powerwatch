package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class q implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.TransitResultNode> {
    q() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.TransitResultNode createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.TransitResultNode(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.TransitResultNode[] newArray(int i) {
        return new com.baidu.mapapi.search.core.TransitResultNode[i];
    }
}
