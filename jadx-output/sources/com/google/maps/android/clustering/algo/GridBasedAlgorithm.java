package com.google.maps.android.clustering.algo;

/* JADX INFO: loaded from: classes2.dex */
public class GridBasedAlgorithm<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.maps.android.clustering.algo.Algorithm<T> {
    private static final int GRID_SIZE = 100;
    private final java.util.Set<T> mItems = java.util.Collections.synchronizedSet(new java.util.HashSet());

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItem(T t) {
        this.mItems.add(t);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItems(java.util.Collection<T> collection) {
        this.mItems.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mItems.clear();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void removeItem(T t) {
        this.mItems.remove(t);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> getClusters(double d) {
        long jCeil = (long) java.lang.Math.ceil((java.lang.Math.pow(2.0d, d) * 256.0d) / 100.0d);
        com.google.maps.android.projection.SphericalMercatorProjection sphericalMercatorProjection = new com.google.maps.android.projection.SphericalMercatorProjection(jCeil);
        java.util.HashSet hashSet = new java.util.HashSet();
        androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray();
        synchronized (this.mItems) {
            for (T t : this.mItems) {
                com.google.maps.android.projection.Point point = sphericalMercatorProjection.toPoint(t.getPosition());
                long coord = getCoord(jCeil, point.x, point.y);
                com.google.maps.android.clustering.algo.StaticCluster staticCluster = (com.google.maps.android.clustering.algo.StaticCluster) longSparseArray.get(coord);
                if (staticCluster == null) {
                    staticCluster = new com.google.maps.android.clustering.algo.StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(java.lang.Math.floor(point.x) + 0.5d, java.lang.Math.floor(point.y) + 0.5d)));
                    longSparseArray.put(coord, staticCluster);
                    hashSet.add(staticCluster);
                }
                staticCluster.add(t);
                jCeil = jCeil;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public java.util.Collection<T> getItems() {
        return this.mItems;
    }

    private static long getCoord(long j, double d, double d2) {
        return (long) ((j * java.lang.Math.floor(d)) + java.lang.Math.floor(d2));
    }
}
