package com.google.maps.android.clustering.algo;

/* JADX INFO: loaded from: classes2.dex */
public class PreCachingAlgorithmDecorator<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.maps.android.clustering.algo.Algorithm<T> {
    private final com.google.maps.android.clustering.algo.Algorithm<T> mAlgorithm;
    private final androidx.collection.LruCache<java.lang.Integer, java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>>> mCache = new androidx.collection.LruCache<>(5);
    private final java.util.concurrent.locks.ReadWriteLock mCacheLock = new java.util.concurrent.locks.ReentrantReadWriteLock();

    public PreCachingAlgorithmDecorator(com.google.maps.android.clustering.algo.Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItem(T t) {
        this.mAlgorithm.addItem(t);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void addItems(java.util.Collection<T> collection) {
        this.mAlgorithm.addItems(collection);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void removeItem(T t) {
        this.mAlgorithm.removeItem(t);
        clearCache();
    }

    private void clearCache() {
        this.mCache.evictAll();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> getClusters(double d) {
        int i = (int) d;
        java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> clustersInternal = getClustersInternal(i);
        int i2 = i + 1;
        if (this.mCache.get(java.lang.Integer.valueOf(i2)) == null) {
            new java.lang.Thread(new com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator.PrecacheRunnable(i2)).start();
        }
        int i3 = i - 1;
        if (this.mCache.get(java.lang.Integer.valueOf(i3)) == null) {
            new java.lang.Thread(new com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator.PrecacheRunnable(i3)).start();
        }
        return clustersInternal;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public java.util.Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> getClustersInternal(int i) {
        this.mCacheLock.readLock().lock();
        java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> clusters = this.mCache.get(java.lang.Integer.valueOf(i));
        this.mCacheLock.readLock().unlock();
        if (clusters == null) {
            this.mCacheLock.writeLock().lock();
            clusters = this.mCache.get(java.lang.Integer.valueOf(i));
            if (clusters == null) {
                clusters = this.mAlgorithm.getClusters(i);
                this.mCache.put(java.lang.Integer.valueOf(i), clusters);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return clusters;
    }

    private class PrecacheRunnable implements java.lang.Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i) {
            this.mZoom = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.lang.Thread.sleep((long) ((java.lang.Math.random() * 500.0d) + 500.0d));
            } catch (java.lang.InterruptedException unused) {
            }
            com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }
}
