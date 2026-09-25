package androidx.room;

/* JADX INFO: loaded from: classes.dex */
public class RxRoom {
    public static final java.lang.Object NOTHING = new java.lang.Object();

    public static io.reactivex.Flowable<java.lang.Object> createFlowable(final androidx.room.RoomDatabase roomDatabase, final java.lang.String... strArr) {
        return io.reactivex.Flowable.create(new io.reactivex.FlowableOnSubscribe<java.lang.Object>() { // from class: androidx.room.RxRoom.1
            @Override // io.reactivex.FlowableOnSubscribe
            public void subscribe(final io.reactivex.FlowableEmitter<java.lang.Object> flowableEmitter) throws java.lang.Exception {
                final androidx.room.InvalidationTracker.Observer observer = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.1.1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(java.util.Set<java.lang.String> set) {
                        if (flowableEmitter.isCancelled()) {
                            return;
                        }
                        flowableEmitter.onNext(androidx.room.RxRoom.NOTHING);
                    }
                };
                if (!flowableEmitter.isCancelled()) {
                    roomDatabase.getInvalidationTracker().addObserver(observer);
                    flowableEmitter.setDisposable(io.reactivex.disposables.Disposables.fromAction(new io.reactivex.functions.Action() { // from class: androidx.room.RxRoom.1.2
                        @Override // io.reactivex.functions.Action
                        public void run() throws java.lang.Exception {
                            roomDatabase.getInvalidationTracker().removeObserver(observer);
                        }
                    }));
                }
                if (flowableEmitter.isCancelled()) {
                    return;
                }
                flowableEmitter.onNext(androidx.room.RxRoom.NOTHING);
            }
        }, io.reactivex.BackpressureStrategy.LATEST);
    }

    @java.lang.Deprecated
    public static <T> io.reactivex.Flowable<T> createFlowable(androidx.room.RoomDatabase roomDatabase, java.lang.String[] strArr, java.util.concurrent.Callable<T> callable) {
        return createFlowable(roomDatabase, false, strArr, callable);
    }

    public static <T> io.reactivex.Flowable<T> createFlowable(androidx.room.RoomDatabase roomDatabase, boolean z, java.lang.String[] strArr, java.util.concurrent.Callable<T> callable) {
        io.reactivex.Scheduler schedulerFrom = io.reactivex.schedulers.Schedulers.from(getExecutor(roomDatabase, z));
        final io.reactivex.Maybe maybeFromCallable = io.reactivex.Maybe.fromCallable(callable);
        return (io.reactivex.Flowable<T>) createFlowable(roomDatabase, strArr).subscribeOn(schedulerFrom).unsubscribeOn(schedulerFrom).observeOn(schedulerFrom).flatMapMaybe(new io.reactivex.functions.Function<java.lang.Object, io.reactivex.MaybeSource<T>>() { // from class: androidx.room.RxRoom.2
            @Override // io.reactivex.functions.Function
            public io.reactivex.MaybeSource<T> apply(java.lang.Object obj) throws java.lang.Exception {
                return maybeFromCallable;
            }
        });
    }

    public static io.reactivex.Observable<java.lang.Object> createObservable(final androidx.room.RoomDatabase roomDatabase, final java.lang.String... strArr) {
        return io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<java.lang.Object>() { // from class: androidx.room.RxRoom.3
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(final io.reactivex.ObservableEmitter<java.lang.Object> observableEmitter) throws java.lang.Exception {
                final androidx.room.InvalidationTracker.Observer observer = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom.3.1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(java.util.Set<java.lang.String> set) {
                        observableEmitter.onNext(androidx.room.RxRoom.NOTHING);
                    }
                };
                roomDatabase.getInvalidationTracker().addObserver(observer);
                observableEmitter.setDisposable(io.reactivex.disposables.Disposables.fromAction(new io.reactivex.functions.Action() { // from class: androidx.room.RxRoom.3.2
                    @Override // io.reactivex.functions.Action
                    public void run() throws java.lang.Exception {
                        roomDatabase.getInvalidationTracker().removeObserver(observer);
                    }
                }));
                observableEmitter.onNext(androidx.room.RxRoom.NOTHING);
            }
        });
    }

    @java.lang.Deprecated
    public static <T> io.reactivex.Observable<T> createObservable(androidx.room.RoomDatabase roomDatabase, java.lang.String[] strArr, java.util.concurrent.Callable<T> callable) {
        return createObservable(roomDatabase, false, strArr, callable);
    }

    public static <T> io.reactivex.Observable<T> createObservable(androidx.room.RoomDatabase roomDatabase, boolean z, java.lang.String[] strArr, java.util.concurrent.Callable<T> callable) {
        io.reactivex.Scheduler schedulerFrom = io.reactivex.schedulers.Schedulers.from(getExecutor(roomDatabase, z));
        final io.reactivex.Maybe maybeFromCallable = io.reactivex.Maybe.fromCallable(callable);
        return (io.reactivex.Observable<T>) createObservable(roomDatabase, strArr).subscribeOn(schedulerFrom).unsubscribeOn(schedulerFrom).observeOn(schedulerFrom).flatMapMaybe(new io.reactivex.functions.Function<java.lang.Object, io.reactivex.MaybeSource<T>>() { // from class: androidx.room.RxRoom.4
            @Override // io.reactivex.functions.Function
            public io.reactivex.MaybeSource<T> apply(java.lang.Object obj) throws java.lang.Exception {
                return maybeFromCallable;
            }
        });
    }

    public static <T> io.reactivex.Single<T> createSingle(final java.util.concurrent.Callable<T> callable) {
        return io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe<T>() { // from class: androidx.room.RxRoom.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.SingleOnSubscribe
            public void subscribe(io.reactivex.SingleEmitter<T> singleEmitter) throws java.lang.Exception {
                try {
                    singleEmitter.onSuccess(callable.call());
                } catch (androidx.room.EmptyResultSetException e) {
                    singleEmitter.tryOnError(e);
                }
            }
        });
    }

    private static java.util.concurrent.Executor getExecutor(androidx.room.RoomDatabase roomDatabase, boolean z) {
        if (z) {
            return roomDatabase.getTransactionExecutor();
        }
        return roomDatabase.getQueryExecutor();
    }

    @java.lang.Deprecated
    public RxRoom() {
    }
}
