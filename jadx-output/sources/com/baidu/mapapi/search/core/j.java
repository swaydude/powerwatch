package com.baidu.mapapi.search.core;

/* JADX INFO: loaded from: classes.dex */
final class j implements android.os.Parcelable.Creator<com.baidu.mapapi.search.core.RouteNode> {
    j() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.RouteNode createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.core.RouteNode(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.core.RouteNode[] newArray(int i) {
        return new com.baidu.mapapi.search.core.RouteNode[i];
    }
}
