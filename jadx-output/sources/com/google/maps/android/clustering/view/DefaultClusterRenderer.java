package com.google.maps.android.clustering.view;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultClusterRenderer<T extends com.google.maps.android.clustering.ClusterItem> implements com.google.maps.android.clustering.view.ClusterRenderer<T> {
    private static final android.animation.TimeInterpolator ANIMATION_INTERP;
    private static final int[] BUCKETS;
    private static final boolean SHOULD_ANIMATE;
    private com.google.maps.android.clustering.ClusterManager.OnClusterClickListener<T> mClickListener;
    private final com.google.maps.android.clustering.ClusterManager<T> mClusterManager;
    private java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> mClusters;
    private android.graphics.drawable.ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final com.google.maps.android.ui.IconGenerator mIconGenerator;
    private com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private final com.google.android.gms.maps.GoogleMap mMap;
    private com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerCache<T> mMarkerCache;
    private final com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.ViewModifier mViewModifier;
    private float mZoom;
    private java.util.Set<com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition> mMarkers = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    private android.util.SparseArray<com.google.android.gms.maps.model.BitmapDescriptor> mIcons = new android.util.SparseArray<>();
    private int mMinClusterSize = 4;
    private java.util.Map<com.google.android.gms.maps.model.Marker, com.google.maps.android.clustering.Cluster<T>> mMarkerToCluster = new java.util.HashMap();
    private java.util.Map<com.google.maps.android.clustering.Cluster<T>, com.google.android.gms.maps.model.Marker> mClusterToMarker = new java.util.HashMap();
    private boolean mAnimate = true;

    protected void onBeforeClusterItemRendered(T t, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    }

    protected void onClusterItemRendered(T t, com.google.android.gms.maps.model.Marker marker) {
    }

    protected void onClusterRendered(com.google.maps.android.clustering.Cluster<T> cluster, com.google.android.gms.maps.model.Marker marker) {
    }

    static {
        SHOULD_ANIMATE = android.os.Build.VERSION.SDK_INT >= 11;
        BUCKETS = new int[]{10, 20, 50, 100, 200, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL, 1000};
        ANIMATION_INTERP = new android.view.animation.DecelerateInterpolator();
    }

    public DefaultClusterRenderer(android.content.Context context, com.google.android.gms.maps.GoogleMap googleMap, com.google.maps.android.clustering.ClusterManager<T> clusterManager) {
        this.mMarkerCache = new com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerCache<>();
        this.mViewModifier = new com.google.maps.android.clustering.view.DefaultClusterRenderer.ViewModifier();
        this.mMap = googleMap;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        com.google.maps.android.ui.IconGenerator iconGenerator = new com.google.maps.android.ui.IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        iconGenerator.setTextAppearance(com.google.maps.android.R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
                return com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mItemClickListener != null && com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mItemClickListener.onClusterItemClick((com.google.maps.android.clustering.ClusterItem) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerCache.get(marker));
            }
        });
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
                if (com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mItemInfoWindowClickListener != null) {
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mItemInfoWindowClickListener.onClusterItemInfoWindowClick((com.google.maps.android.clustering.ClusterItem) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerCache.get(marker));
                }
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.3
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
                return com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClickListener != null && com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClickListener.onClusterClick((com.google.maps.android.clustering.Cluster) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.get(marker));
            }
        });
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.4
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
                if (com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mInfoWindowClickListener != null) {
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mInfoWindowClickListener.onClusterInfoWindowClick((com.google.maps.android.clustering.Cluster) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.get(marker));
                }
            }
        });
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
    }

    private android.graphics.drawable.LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    private com.google.maps.android.ui.SquareTextView makeSquareTextView(android.content.Context context) {
        com.google.maps.android.ui.SquareTextView squareTextView = new com.google.maps.android.ui.SquareTextView(context);
        squareTextView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(com.google.maps.android.R.id.amu_text);
        int i = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i, i, i, i);
        return squareTextView;
    }

    protected int getColor(int i) {
        float fMin = 300.0f - java.lang.Math.min(i, 300.0f);
        return android.graphics.Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    protected java.lang.String getClusterText(int i) {
        if (i < BUCKETS[0]) {
            return java.lang.String.valueOf(i);
        }
        return java.lang.String.valueOf(i) + "+";
    }

    protected int getBucket(com.google.maps.android.clustering.Cluster<T> cluster) {
        int size = cluster.getSize();
        int i = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i < iArr.length - 1) {
                int i2 = i + 1;
                if (size < iArr[i2]) {
                    return iArr[i];
                }
                i = i2;
            } else {
                return iArr[iArr.length - 1];
            }
        }
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    public void setMinClusterSize(int i) {
        this.mMinClusterSize = i;
    }

    private class ViewModifier extends android.os.Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        private ViewModifier() {
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            com.google.android.gms.maps.Projection projection = com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMap.getProjection();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new java.lang.Runnable() { // from class: com.google.maps.android.clustering.view.DefaultClusterRenderer.ViewModifier.1
                @Override // java.lang.Runnable
                public void run() {
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.ViewModifier.this.sendEmptyMessage(1);
                }
            });
            renderTask.setProjection(projection);
            renderTask.setMapZoom(com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMap.getCameraPosition().zoom);
            new java.lang.Thread(renderTask).start();
        }

        public void queue(java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new com.google.maps.android.clustering.view.DefaultClusterRenderer.RenderTask(set);
            }
            sendEmptyMessage(0);
        }
    }

    protected boolean shouldRenderAsCluster(com.google.maps.android.clustering.Cluster<T> cluster) {
        return cluster.getSize() > this.mMinClusterSize;
    }

    private class RenderTask implements java.lang.Runnable {
        final java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> clusters;
        private java.lang.Runnable mCallback;
        private float mMapZoom;
        private com.google.android.gms.maps.Projection mProjection;
        private com.google.maps.android.projection.SphericalMercatorProjection mSphericalMercatorProjection;

        private RenderTask(java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> set) {
            this.clusters = set;
        }

        public void setCallback(java.lang.Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setProjection(com.google.android.gms.maps.Projection projection) {
            this.mProjection = projection;
        }

        public void setMapZoom(float f) {
            this.mMapZoom = f;
            this.mSphericalMercatorProjection = new com.google.maps.android.projection.SphericalMercatorProjection(java.lang.Math.pow(2.0d, java.lang.Math.min(f, com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mZoom)) * 256.0d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            java.util.ArrayList arrayList;
            if (this.clusters.equals(com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusters)) {
                this.mCallback.run();
                return;
            }
            java.util.ArrayList arrayList2 = null;
            com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerModifier markerModifier = new com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerModifier();
            float f = this.mMapZoom;
            boolean z = f > com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mZoom;
            float f2 = f - com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mZoom;
            java.util.Set<com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition> set = com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkers;
            com.google.android.gms.maps.model.LatLngBounds latLngBounds = this.mProjection.getVisibleRegion().latLngBounds;
            if (com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusters == null || !com.google.maps.android.clustering.view.DefaultClusterRenderer.SHOULD_ANIMATE) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (com.google.maps.android.clustering.Cluster<T> cluster : com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusters) {
                    if (com.google.maps.android.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(cluster) && latLngBounds.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
            for (com.google.maps.android.clustering.Cluster<T> cluster2 : this.clusters) {
                boolean zContains = latLngBounds.contains(cluster2.getPosition());
                if (z && zContains && com.google.maps.android.clustering.view.DefaultClusterRenderer.SHOULD_ANIMATE) {
                    com.google.maps.android.geometry.Point pointFindClosestCluster = com.google.maps.android.clustering.view.DefaultClusterRenderer.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (pointFindClosestCluster != null && com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mAnimate) {
                        markerModifier.add(true, new com.google.maps.android.clustering.view.DefaultClusterRenderer.CreateMarkerTask(cluster2, setNewSetFromMap, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster)));
                    } else {
                        markerModifier.add(true, new com.google.maps.android.clustering.view.DefaultClusterRenderer.CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.add(zContains, new com.google.maps.android.clustering.view.DefaultClusterRenderer.CreateMarkerTask(cluster2, setNewSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            if (com.google.maps.android.clustering.view.DefaultClusterRenderer.SHOULD_ANIMATE) {
                arrayList2 = new java.util.ArrayList();
                for (com.google.maps.android.clustering.Cluster<T> cluster3 : this.clusters) {
                    if (com.google.maps.android.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(cluster3) && latLngBounds.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition : set) {
                boolean zContains2 = latLngBounds.contains(markerWithPosition.position);
                if (!z && f2 > -3.0f && zContains2 && com.google.maps.android.clustering.view.DefaultClusterRenderer.SHOULD_ANIMATE) {
                    com.google.maps.android.geometry.Point pointFindClosestCluster2 = com.google.maps.android.clustering.view.DefaultClusterRenderer.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (pointFindClosestCluster2 == null || !com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mAnimate) {
                        markerModifier.remove(true, markerWithPosition.marker);
                    } else {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster2));
                    }
                } else {
                    markerModifier.remove(zContains2, markerWithPosition.marker);
                }
            }
            markerModifier.waitUntilFree();
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkers = setNewSetFromMap;
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusters = this.clusters;
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mZoom = f;
            this.mCallback.run();
        }
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(java.util.Set<? extends com.google.maps.android.clustering.Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(com.google.maps.android.clustering.ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z) {
        this.mAnimate = z;
    }

    private static double distanceSquared(com.google.maps.android.geometry.Point point, com.google.maps.android.geometry.Point point2) {
        return ((point.x - point2.x) * (point.x - point2.x)) + ((point.y - point2.y) * (point.y - point2.y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.maps.android.geometry.Point findClosestCluster(java.util.List<com.google.maps.android.geometry.Point> list, com.google.maps.android.geometry.Point point) {
        com.google.maps.android.geometry.Point point2 = null;
        if (list != null && !list.isEmpty()) {
            double d = 10000.0d;
            for (com.google.maps.android.geometry.Point point3 : list) {
                double dDistanceSquared = distanceSquared(point3, point);
                if (dDistanceSquared < d) {
                    point2 = point3;
                    d = dDistanceSquared;
                }
            }
        }
        return point2;
    }

    private class MarkerModifier extends android.os.Handler implements android.os.MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final java.util.concurrent.locks.Condition busyCondition;
        private final java.util.concurrent.locks.Lock lock;
        private java.util.Queue<com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.AnimationTask> mAnimationTasks;
        private java.util.Queue<com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private java.util.Queue<com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private java.util.Queue<com.google.android.gms.maps.model.Marker> mOnScreenRemoveMarkerTasks;
        private java.util.Queue<com.google.android.gms.maps.model.Marker> mRemoveMarkerTasks;

        private MarkerModifier() {
            super(android.os.Looper.getMainLooper());
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new java.util.LinkedList();
            this.mOnScreenCreateMarkerTasks = new java.util.LinkedList();
            this.mRemoveMarkerTasks = new java.util.LinkedList();
            this.mOnScreenRemoveMarkerTasks = new java.util.LinkedList();
            this.mAnimationTasks = new java.util.LinkedList();
        }

        public void add(boolean z, com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void remove(boolean z, com.google.android.gms.maps.model.Marker marker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            this.lock.unlock();
        }

        public void animate(com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition, com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
            this.lock.lock();
            this.mAnimationTasks.add(new com.google.maps.android.clustering.view.DefaultClusterRenderer.AnimationTask(markerWithPosition, latLng, latLng2));
            this.lock.unlock();
        }

        public void animateThenRemove(com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition, com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
            this.lock.lock();
            com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.AnimationTask animationTask = new com.google.maps.android.clustering.view.DefaultClusterRenderer.AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (!this.mListenerAdded) {
                android.os.Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    performNextTask();
                } catch (java.lang.Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            if (!isBusy()) {
                this.mListenerAdded = false;
                android.os.Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
            this.lock.unlock();
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                this.mAnimationTasks.poll().perform();
                return;
            }
            if (this.mOnScreenCreateMarkerTasks.isEmpty()) {
                if (this.mCreateMarkerTasks.isEmpty()) {
                    if (this.mRemoveMarkerTasks.isEmpty()) {
                        return;
                    }
                    removeMarker(this.mRemoveMarkerTasks.poll());
                    return;
                }
                this.mCreateMarkerTasks.poll().perform(this);
                return;
            }
            this.mOnScreenCreateMarkerTasks.poll().perform(this);
        }

        private void removeMarker(com.google.android.gms.maps.model.Marker marker) {
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterToMarker.remove((com.google.maps.android.clustering.Cluster) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.get(marker));
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerCache.remove(marker);
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.remove(marker);
            com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterManager.getMarkerManager().remove(marker);
        }

        public boolean isBusy() {
            try {
                this.lock.lock();
                return (this.mCreateMarkerTasks.isEmpty() && this.mOnScreenCreateMarkerTasks.isEmpty() && this.mOnScreenRemoveMarkerTasks.isEmpty() && this.mRemoveMarkerTasks.isEmpty() && this.mAnimationTasks.isEmpty()) ? false : true;
            } finally {
                this.lock.unlock();
            }
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                        this.lock.unlock();
                    } catch (java.lang.InterruptedException e) {
                        throw new java.lang.RuntimeException(e);
                    }
                } catch (java.lang.Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    private static class MarkerCache<T> {
        private java.util.Map<T, com.google.android.gms.maps.model.Marker> mCache;
        private java.util.Map<com.google.android.gms.maps.model.Marker, T> mCacheReverse;

        private MarkerCache() {
            this.mCache = new java.util.HashMap();
            this.mCacheReverse = new java.util.HashMap();
        }

        public com.google.android.gms.maps.model.Marker get(T t) {
            return this.mCache.get(t);
        }

        public T get(com.google.android.gms.maps.model.Marker marker) {
            return this.mCacheReverse.get(marker);
        }

        public void put(T t, com.google.android.gms.maps.model.Marker marker) {
            this.mCache.put(t, marker);
            this.mCacheReverse.put(marker, t);
        }

        public void remove(com.google.android.gms.maps.model.Marker marker) {
            T t = this.mCacheReverse.get(marker);
            this.mCacheReverse.remove(marker);
            this.mCache.remove(t);
        }
    }

    protected void onBeforeClusterRendered(com.google.maps.android.clustering.Cluster<T> cluster, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
        int bucket = getBucket(cluster);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptorFromBitmap = this.mIcons.get(bucket);
        if (bitmapDescriptorFromBitmap == null) {
            this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
            bitmapDescriptorFromBitmap = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon(getClusterText(bucket)));
            this.mIcons.put(bucket, bitmapDescriptorFromBitmap);
        }
        markerOptions.icon(bitmapDescriptorFromBitmap);
    }

    public com.google.android.gms.maps.model.Marker getMarker(T t) {
        return this.mMarkerCache.get(t);
    }

    public T getClusterItem(com.google.android.gms.maps.model.Marker marker) {
        return this.mMarkerCache.get(marker);
    }

    public com.google.android.gms.maps.model.Marker getMarker(com.google.maps.android.clustering.Cluster<T> cluster) {
        return this.mClusterToMarker.get(cluster);
    }

    public com.google.maps.android.clustering.Cluster<T> getCluster(com.google.android.gms.maps.model.Marker marker) {
        return this.mMarkerToCluster.get(marker);
    }

    private class CreateMarkerTask {
        private final com.google.android.gms.maps.model.LatLng animateFrom;
        private final com.google.maps.android.clustering.Cluster<T> cluster;
        private final java.util.Set<com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition> newMarkers;

        public CreateMarkerTask(com.google.maps.android.clustering.Cluster<T> cluster, java.util.Set<com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition> set, com.google.android.gms.maps.model.LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(com.google.maps.android.clustering.view.DefaultClusterRenderer<T>.MarkerModifier markerModifier) {
            com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition;
            com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition2;
            if (com.google.maps.android.clustering.view.DefaultClusterRenderer.this.shouldRenderAsCluster(this.cluster)) {
                com.google.android.gms.maps.model.Marker markerAddMarker = (com.google.android.gms.maps.model.Marker) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterToMarker.get(this.cluster);
                if (markerAddMarker == null) {
                    com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
                    com.google.android.gms.maps.model.LatLng position = this.animateFrom;
                    if (position == null) {
                        position = this.cluster.getPosition();
                    }
                    com.google.android.gms.maps.model.MarkerOptions markerOptionsPosition = markerOptions.position(position);
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.onBeforeClusterRendered(this.cluster, markerOptionsPosition);
                    markerAddMarker = com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterManager.getClusterMarkerCollection().addMarker(markerOptionsPosition);
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.put(markerAddMarker, this.cluster);
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterToMarker.put(this.cluster, markerAddMarker);
                    markerWithPosition = new com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition(markerAddMarker);
                    com.google.android.gms.maps.model.LatLng latLng = this.animateFrom;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.cluster.getPosition());
                    }
                } else {
                    markerWithPosition = new com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition(markerAddMarker);
                }
                com.google.maps.android.clustering.view.DefaultClusterRenderer.this.onClusterRendered(this.cluster, markerAddMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            for (T t : this.cluster.getItems()) {
                com.google.android.gms.maps.model.Marker markerAddMarker2 = com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerCache.get(t);
                if (markerAddMarker2 == null) {
                    com.google.android.gms.maps.model.MarkerOptions markerOptions2 = new com.google.android.gms.maps.model.MarkerOptions();
                    com.google.android.gms.maps.model.LatLng latLng2 = this.animateFrom;
                    if (latLng2 != null) {
                        markerOptions2.position(latLng2);
                    } else {
                        markerOptions2.position(t.getPosition());
                    }
                    if (t.getTitle() != null && t.getSnippet() != null) {
                        markerOptions2.title(t.getTitle());
                        markerOptions2.snippet(t.getSnippet());
                    } else if (t.getSnippet() != null) {
                        markerOptions2.title(t.getSnippet());
                    } else if (t.getTitle() != null) {
                        markerOptions2.title(t.getTitle());
                    }
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.onBeforeClusterItemRendered(t, markerOptions2);
                    markerAddMarker2 = com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterManager.getMarkerCollection().addMarker(markerOptions2);
                    markerWithPosition2 = new com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition(markerAddMarker2);
                    com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerCache.put(t, markerAddMarker2);
                    com.google.android.gms.maps.model.LatLng latLng3 = this.animateFrom;
                    if (latLng3 != null) {
                        markerModifier.animate(markerWithPosition2, latLng3, t.getPosition());
                    }
                } else {
                    markerWithPosition2 = new com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition(markerAddMarker2);
                }
                com.google.maps.android.clustering.view.DefaultClusterRenderer.this.onClusterItemRendered(t, markerAddMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    private static class MarkerWithPosition {
        private final com.google.android.gms.maps.model.Marker marker;
        private com.google.android.gms.maps.model.LatLng position;

        private MarkerWithPosition(com.google.android.gms.maps.model.Marker marker) {
            this.marker = marker;
            this.position = marker.getPosition();
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition) {
                return this.marker.equals(((com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }
    }

    private class AnimationTask extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {
        private final com.google.android.gms.maps.model.LatLng from;
        private com.google.maps.android.MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final com.google.android.gms.maps.model.Marker marker;
        private final com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition;
        private final com.google.android.gms.maps.model.LatLng to;

        private AnimationTask(com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerWithPosition markerWithPosition, com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
        }

        public void perform() {
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(com.google.maps.android.clustering.view.DefaultClusterRenderer.ANIMATION_INTERP);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            if (this.mRemoveOnComplete) {
                com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mClusterToMarker.remove((com.google.maps.android.clustering.Cluster) com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.get(this.marker));
                com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerCache.remove(this.marker);
                com.google.maps.android.clustering.view.DefaultClusterRenderer.this.mMarkerToCluster.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.to;
        }

        public void removeOnAnimationComplete(com.google.maps.android.MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
            double animatedFraction = valueAnimator.getAnimatedFraction();
            double d = ((this.to.latitude - this.from.latitude) * animatedFraction) + this.from.latitude;
            double dSignum = this.to.longitude - this.from.longitude;
            if (java.lang.Math.abs(dSignum) > 180.0d) {
                dSignum -= java.lang.Math.signum(dSignum) * 360.0d;
            }
            this.marker.setPosition(new com.google.android.gms.maps.model.LatLng(d, (dSignum * animatedFraction) + this.from.longitude));
        }
    }
}
