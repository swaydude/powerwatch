package com.google.maps.android.clustering.algo;

/* JADX INFO: loaded from: classes2.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.maps.android.clustering.algo.Algorithm<T> {
    public static final int MAX_DISTANCE_AT_ZOOM = 100;
    private static final com.google.maps.android.projection.SphericalMercatorProjection PROJECTION = new com.google.maps.android.projection.SphericalMercatorProjection(1.0d);
    private final java.util.Collection<com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> mItems = new java.util.ArrayList();
    private final com.google.maps.android.quadtree.PointQuadTree<com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> mQuadTree = new com.google.maps.android.quadtree.PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItem(T t) {
        com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T> quadItem = new com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<>(t);
        synchronized (this.mQuadTree) {
            this.mItems.add(quadItem);
            this.mQuadTree.add(quadItem);
        }
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItems(java.util.Collection<T> collection) {
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            addItem(it.next());
        }
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void removeItem(T t) {
        com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem quadItem = new com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem(t);
        synchronized (this.mQuadTree) {
            this.mItems.remove(quadItem);
            this.mQuadTree.remove(quadItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> getClusters(double d) {
        double dPow = (100.0d / java.lang.Math.pow(2.0d, (int) d)) / 256.0d;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        synchronized (this.mQuadTree) {
            for (com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T> quadItem : this.mItems) {
                if (!hashSet.contains(quadItem)) {
                    java.util.Collection<T> collectionSearch = this.mQuadTree.search(createBoundsFromSpan(quadItem.getPoint(), dPow));
                    if (collectionSearch.size() == 1) {
                        hashSet2.add(quadItem);
                        hashSet.add(quadItem);
                        map.put(quadItem, java.lang.Double.valueOf(0.0d));
                    } else {
                        com.google.maps.android.clustering.algo.StaticCluster staticCluster = new com.google.maps.android.clustering.algo.StaticCluster(((com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem) quadItem).mClusterItem.getPosition());
                        hashSet2.add(staticCluster);
                        for (T t : collectionSearch) {
                            java.lang.Double d2 = (java.lang.Double) map.get(t);
                            double d3 = dPow;
                            double dDistanceSquared = distanceSquared(t.getPoint(), quadItem.getPoint());
                            if (d2 == null) {
                                map.put(t, java.lang.Double.valueOf(dDistanceSquared));
                                staticCluster.add(t.mClusterItem);
                                map2.put(t, staticCluster);
                            } else if (d2.doubleValue() >= dDistanceSquared) {
                                ((com.google.maps.android.clustering.algo.StaticCluster) map2.get(t)).remove(t.mClusterItem);
                                map.put(t, java.lang.Double.valueOf(dDistanceSquared));
                                staticCluster.add(t.mClusterItem);
                                map2.put(t, staticCluster);
                            }
                            dPow = d3;
                        }
                        hashSet.addAll(collectionSearch);
                        dPow = dPow;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public java.util.Collection<T> getItems() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.mQuadTree) {
            java.util.Iterator<com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> it = this.mItems.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem) it.next()).mClusterItem);
            }
        }
        return arrayList;
    }

    private double distanceSquared(com.google.maps.android.geometry.Point point, com.google.maps.android.geometry.Point point2) {
        return ((point.x - point2.x) * (point.x - point2.x)) + ((point.y - point2.y) * (point.y - point2.y));
    }

    private com.google.maps.android.geometry.Bounds createBoundsFromSpan(com.google.maps.android.geometry.Point point, double d) {
        double d2 = d / 2.0d;
        return new com.google.maps.android.geometry.Bounds(point.x - d2, point.x + d2, point.y - d2, point.y + d2);
    }

    private static class QuadItem<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.maps.android.quadtree.PointQuadTree.Item, com.google.maps.android.clustering.Cluster<T> {
        private final T mClusterItem;
        private final com.google.maps.android.geometry.Point mPoint;
        private final com.google.android.gms.maps.model.LatLng mPosition;
        private java.util.Set<T> singletonSet;

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        private QuadItem(T t) {
            this.mClusterItem = t;
            com.google.android.gms.maps.model.LatLng position = t.getPosition();
            this.mPosition = position;
            this.mPoint = com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(position);
            this.singletonSet = java.util.Collections.singleton(t);
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public com.google.maps.android.geometry.Point getPoint() {
            return this.mPoint;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public com.google.android.gms.maps.model.LatLng getPosition() {
            return this.mPosition;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public java.util.Set<T> getItems() {
            return this.singletonSet;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem) {
                return ((com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm.QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }
    }
}
