package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
final class m implements android.os.Parcelable.Creator<com.baidu.mapapi.search.route.PlanNode> {
    m() {
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.PlanNode createFromParcel(android.os.Parcel parcel) {
        return new com.baidu.mapapi.search.route.PlanNode(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.baidu.mapapi.search.route.PlanNode[] newArray(int i) {
        return new com.baidu.mapapi.search.route.PlanNode[i];
    }
}
