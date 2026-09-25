package androidx.room;

/* JADX INFO: loaded from: classes.dex */
class RoomTrackingLiveData<T> extends androidx.lifecycle.LiveData<T> {
    final java.util.concurrent.Callable<T> mComputeFunction;
    private final androidx.room.InvalidationLiveDataContainer mContainer;
    final androidx.room.RoomDatabase mDatabase;
    final boolean mInTransaction;
    final androidx.room.InvalidationTracker.Observer mObserver;
    final java.util.concurrent.atomic.AtomicBoolean mInvalid = new java.util.concurrent.atomic.AtomicBoolean(true);
    final java.util.concurrent.atomic.AtomicBoolean mComputing = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean mRegisteredObserver = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.lang.Runnable mRefreshRunnable = new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData.1
        /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r5 = this;
                androidx.room.RoomTrackingLiveData r0 = androidx.room.RoomTrackingLiveData.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.mRegisteredObserver
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L1b
                androidx.room.RoomTrackingLiveData r0 = androidx.room.RoomTrackingLiveData.this
                androidx.room.RoomDatabase r0 = r0.mDatabase
                androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                androidx.room.RoomTrackingLiveData r3 = androidx.room.RoomTrackingLiveData.this
                androidx.room.InvalidationTracker$Observer r3 = r3.mObserver
                r0.addWeakObserver(r3)
            L1b:
                androidx.room.RoomTrackingLiveData r0 = androidx.room.RoomTrackingLiveData.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.mComputing
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L5c
                r0 = 0
                r3 = 0
            L27:
                androidx.room.RoomTrackingLiveData r4 = androidx.room.RoomTrackingLiveData.this     // Catch: java.lang.Throwable -> L53
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.mInvalid     // Catch: java.lang.Throwable -> L53
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L53
                if (r4 == 0) goto L44
                androidx.room.RoomTrackingLiveData r0 = androidx.room.RoomTrackingLiveData.this     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L53
                java.util.concurrent.Callable<T> r0 = r0.mComputeFunction     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L53
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L53
                r3 = 1
                goto L27
            L3b:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L53
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L53
                throw r2     // Catch: java.lang.Throwable -> L53
            L44:
                if (r3 == 0) goto L4b
                androidx.room.RoomTrackingLiveData r4 = androidx.room.RoomTrackingLiveData.this     // Catch: java.lang.Throwable -> L53
                androidx.room.RoomTrackingLiveData.access$000(r4, r0)     // Catch: java.lang.Throwable -> L53
            L4b:
                androidx.room.RoomTrackingLiveData r0 = androidx.room.RoomTrackingLiveData.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.mComputing
                r0.set(r1)
                goto L5d
            L53:
                r0 = move-exception
                androidx.room.RoomTrackingLiveData r2 = androidx.room.RoomTrackingLiveData.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.mComputing
                r2.set(r1)
                throw r0
            L5c:
                r3 = 0
            L5d:
                if (r3 == 0) goto L69
                androidx.room.RoomTrackingLiveData r0 = androidx.room.RoomTrackingLiveData.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.mInvalid
                boolean r0 = r0.get()
                if (r0 != 0) goto L1b
            L69:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomTrackingLiveData.AnonymousClass1.run():void");
        }
    };
    final java.lang.Runnable mInvalidationRunnable = new java.lang.Runnable() { // from class: androidx.room.RoomTrackingLiveData.2
        @Override // java.lang.Runnable
        public void run() {
            boolean zHasActiveObservers = androidx.room.RoomTrackingLiveData.this.hasActiveObservers();
            if (androidx.room.RoomTrackingLiveData.this.mInvalid.compareAndSet(false, true) && zHasActiveObservers) {
                androidx.room.RoomTrackingLiveData.this.getQueryExecutor().execute(androidx.room.RoomTrackingLiveData.this.mRefreshRunnable);
            }
        }
    };

    RoomTrackingLiveData(androidx.room.RoomDatabase roomDatabase, androidx.room.InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, java.util.concurrent.Callable<T> callable, java.lang.String[] strArr) {
        this.mDatabase = roomDatabase;
        this.mInTransaction = z;
        this.mComputeFunction = callable;
        this.mContainer = invalidationLiveDataContainer;
        this.mObserver = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomTrackingLiveData.3
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(java.util.Set<java.lang.String> set) {
                androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnMainThread(androidx.room.RoomTrackingLiveData.this.mInvalidationRunnable);
            }
        };
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        this.mContainer.onActive(this);
        getQueryExecutor().execute(this.mRefreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        this.mContainer.onInactive(this);
    }

    java.util.concurrent.Executor getQueryExecutor() {
        if (this.mInTransaction) {
            return this.mDatabase.getTransactionExecutor();
        }
        return this.mDatabase.getQueryExecutor();
    }
}
