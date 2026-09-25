package com.google.maps.android.clustering.algo;

/* JADX INFO: loaded from: classes2.dex */
public class StaticCluster<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.maps.android.clustering.Cluster<T> {
    private final com.google.android.gms.maps.model.LatLng mCenter;
    private final java.util.List<T> mItems = new java.util.ArrayList();

    public StaticCluster(com.google.android.gms.maps.model.LatLng latLng) {
        this.mCenter = latLng;
    }

    public boolean add(T t) {
        return this.mItems.add(t);
    }

    @Override // com.google.maps.android.clustering.Cluster
    public com.google.android.gms.maps.model.LatLng getPosition() {
        return this.mCenter;
    }

    public boolean remove(T t) {
        return this.mItems.remove(t);
    }

    @Override // com.google.maps.android.clustering.Cluster
    public java.util.Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.Cluster
    public int getSize() {
        return this.mItems.size();
    }

    public java.lang.String toString() {
        return "StaticCluster{mCenter=" + this.mCenter + ", mItems.size=" + this.mItems.size() + '}';
    }

    public int hashCode() {
        return this.mCenter.hashCode() + this.mItems.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.maps.android.clustering.algo.StaticCluster)) {
            return false;
        }
        com.google.maps.android.clustering.algo.StaticCluster staticCluster = (com.google.maps.android.clustering.algo.StaticCluster) obj;
        return staticCluster.mCenter.equals(this.mCenter) && staticCluster.mItems.equals(this.mItems);
    }
}
