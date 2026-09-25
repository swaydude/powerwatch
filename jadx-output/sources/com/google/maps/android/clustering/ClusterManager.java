package com.google.maps.android.clustering;

/* JADX INFO: loaded from: classes2.dex */
public class ClusterManager<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.android.gms.maps.GoogleMap.OnCameraIdleListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener {
    private com.google.maps.android.clustering.algo.Algorithm<T> mAlgorithm;
    private final java.util.concurrent.locks.ReadWriteLock mAlgorithmLock;
    private final com.google.maps.android.MarkerManager.Collection mClusterMarkers;
    private com.google.maps.android.clustering.ClusterManager<T>.ClusterTask mClusterTask;
    private final java.util.concurrent.locks.ReadWriteLock mClusterTaskLock;
    private com.google.android.gms.maps.GoogleMap mMap;
    private final com.google.maps.android.MarkerManager mMarkerManager;
    private final com.google.maps.android.MarkerManager.Collection mMarkers;
    private com.google.maps.android.clustering.ClusterManager.OnClusterClickListener<T> mOnClusterClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> mOnClusterInfoWindowClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener<T> mOnClusterItemClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> mOnClusterItemInfoWindowClickListener;
    private com.google.android.gms.maps.model.CameraPosition mPreviousCameraPosition;
    private com.google.maps.android.clustering.view.ClusterRenderer<T> mRenderer;

    public interface OnClusterClickListener<T extends com.google.maps.android.clustering.ClusterItem> {
        boolean onClusterClick(com.google.maps.android.clustering.Cluster<T> cluster);
    }

    public interface OnClusterInfoWindowClickListener<T extends com.google.maps.android.clustering.ClusterItem> {
        void onClusterInfoWindowClick(com.google.maps.android.clustering.Cluster<T> cluster);
    }

    public interface OnClusterItemClickListener<T extends com.google.maps.android.clustering.ClusterItem> {
        boolean onClusterItemClick(T t);
    }

    public interface OnClusterItemInfoWindowClickListener<T extends com.google.maps.android.clustering.ClusterItem> {
        void onClusterItemInfoWindowClick(T t);
    }

    public ClusterManager(android.content.Context context, com.google.android.gms.maps.GoogleMap googleMap) {
        this(context, googleMap, new com.google.maps.android.MarkerManager(googleMap));
    }

    public ClusterManager(android.content.Context context, com.google.android.gms.maps.GoogleMap googleMap, com.google.maps.android.MarkerManager markerManager) {
        this.mAlgorithmLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mClusterTaskLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mMap = googleMap;
        this.mMarkerManager = markerManager;
        this.mClusterMarkers = markerManager.newCollection();
        this.mMarkers = markerManager.newCollection();
        this.mRenderer = new com.google.maps.android.clustering.view.DefaultClusterRenderer(context, googleMap, this);
        this.mAlgorithm = new com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator(new com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm());
        this.mClusterTask = new com.google.maps.android.clustering.ClusterManager.ClusterTask();
        this.mRenderer.onAdd();
    }

    public com.google.maps.android.MarkerManager.Collection getMarkerCollection() {
        return this.mMarkers;
    }

    public com.google.maps.android.MarkerManager.Collection getClusterMarkerCollection() {
        return this.mClusterMarkers;
    }

    public com.google.maps.android.MarkerManager getMarkerManager() {
        return this.mMarkerManager;
    }

    public void setRenderer(com.google.maps.android.clustering.view.ClusterRenderer<T> clusterRenderer) {
        this.mRenderer.setOnClusterClickListener(null);
        this.mRenderer.setOnClusterItemClickListener(null);
        this.mClusterMarkers.clear();
        this.mMarkers.clear();
        this.mRenderer.onRemove();
        this.mRenderer = clusterRenderer;
        clusterRenderer.onAdd();
        this.mRenderer.setOnClusterClickListener(this.mOnClusterClickListener);
        this.mRenderer.setOnClusterInfoWindowClickListener(this.mOnClusterInfoWindowClickListener);
        this.mRenderer.setOnClusterItemClickListener(this.mOnClusterItemClickListener);
        this.mRenderer.setOnClusterItemInfoWindowClickListener(this.mOnClusterItemInfoWindowClickListener);
        cluster();
    }

    public void setAlgorithm(com.google.maps.android.clustering.algo.Algorithm<T> algorithm) {
        this.mAlgorithmLock.writeLock().lock();
        try {
            com.google.maps.android.clustering.algo.Algorithm<T> algorithm2 = this.mAlgorithm;
            if (algorithm2 != null) {
                algorithm.addItems(algorithm2.getItems());
            }
            this.mAlgorithm = new com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator(algorithm);
            this.mAlgorithmLock.writeLock().unlock();
            cluster();
        } catch (java.lang.Throwable th) {
            this.mAlgorithmLock.writeLock().unlock();
            throw th;
        }
    }

    public void setAnimation(boolean z) {
        this.mRenderer.setAnimation(z);
    }

    public com.google.maps.android.clustering.view.ClusterRenderer<T> getRenderer() {
        return this.mRenderer;
    }

    public com.google.maps.android.clustering.algo.Algorithm<T> getAlgorithm() {
        return this.mAlgorithm;
    }

    public void clearItems() {
        this.mAlgorithmLock.writeLock().lock();
        try {
            this.mAlgorithm.clearItems();
        } finally {
            this.mAlgorithmLock.writeLock().unlock();
        }
    }

    public void addItems(java.util.Collection<T> collection) {
        this.mAlgorithmLock.writeLock().lock();
        try {
            this.mAlgorithm.addItems(collection);
        } finally {
            this.mAlgorithmLock.writeLock().unlock();
        }
    }

    public void addItem(T t) {
        this.mAlgorithmLock.writeLock().lock();
        try {
            this.mAlgorithm.addItem(t);
        } finally {
            this.mAlgorithmLock.writeLock().unlock();
        }
    }

    public void removeItem(T t) {
        this.mAlgorithmLock.writeLock().lock();
        try {
            this.mAlgorithm.removeItem(t);
        } finally {
            this.mAlgorithmLock.writeLock().unlock();
        }
    }

    public void cluster() {
        this.mClusterTaskLock.writeLock().lock();
        try {
            this.mClusterTask.cancel(true);
            this.mClusterTask = new com.google.maps.android.clustering.ClusterManager.ClusterTask();
            if (android.os.Build.VERSION.SDK_INT < 11) {
                this.mClusterTask.execute(java.lang.Float.valueOf(this.mMap.getCameraPosition().zoom));
            } else {
                this.mClusterTask.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, java.lang.Float.valueOf(this.mMap.getCameraPosition().zoom));
            }
        } finally {
            this.mClusterTaskLock.writeLock().unlock();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public void onCameraIdle() {
        com.google.maps.android.clustering.view.ClusterRenderer<T> clusterRenderer = this.mRenderer;
        if (clusterRenderer instanceof com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) {
            ((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) clusterRenderer).onCameraIdle();
        }
        com.google.android.gms.maps.model.CameraPosition cameraPosition = this.mMap.getCameraPosition();
        com.google.android.gms.maps.model.CameraPosition cameraPosition2 = this.mPreviousCameraPosition;
        if (cameraPosition2 == null || cameraPosition2.zoom != cameraPosition.zoom) {
            this.mPreviousCameraPosition = this.mMap.getCameraPosition();
            cluster();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
        return getMarkerManager().onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
        getMarkerManager().onInfoWindowClick(marker);
    }

    private class ClusterTask extends android.os.AsyncTask<java.lang.Float, java.lang.Void, java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>>> {
        private ClusterTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> doInBackground(java.lang.Float... fArr) {
            com.google.maps.android.clustering.ClusterManager.this.mAlgorithmLock.readLock().lock();
            try {
                return com.google.maps.android.clustering.ClusterManager.this.mAlgorithm.getClusters(fArr[0].floatValue());
            } finally {
                com.google.maps.android.clustering.ClusterManager.this.mAlgorithmLock.readLock().unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> set) {
            com.google.maps.android.clustering.ClusterManager.this.mRenderer.onClustersChanged(set);
        }
    }

    public void setOnClusterClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mOnClusterClickListener = onClusterClickListener;
        this.mRenderer.setOnClusterClickListener(onClusterClickListener);
    }

    public void setOnClusterInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mOnClusterInfoWindowClickListener = onClusterInfoWindowClickListener;
        this.mRenderer.setOnClusterInfoWindowClickListener(onClusterInfoWindowClickListener);
    }

    public void setOnClusterItemClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mOnClusterItemClickListener = onClusterItemClickListener;
        this.mRenderer.setOnClusterItemClickListener(onClusterItemClickListener);
    }

    public void setOnClusterItemInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mOnClusterItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
        this.mRenderer.setOnClusterItemInfoWindowClickListener(onClusterItemInfoWindowClickListener);
    }
}
