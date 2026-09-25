package retrofit2.adapter.rxjava2;

/* JADX INFO: loaded from: classes3.dex */
final class RxJava2CallAdapter<R> implements retrofit2.CallAdapter<R, java.lang.Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final java.lang.reflect.Type responseType;

    @javax.annotation.Nullable
    private final io.reactivex.Scheduler scheduler;

    RxJava2CallAdapter(java.lang.reflect.Type type, @javax.annotation.Nullable io.reactivex.Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.responseType = type;
        this.scheduler = scheduler;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isFlowable = z4;
        this.isSingle = z5;
        this.isMaybe = z6;
        this.isCompletable = z7;
    }

    @Override // retrofit2.CallAdapter
    public java.lang.reflect.Type responseType() {
        return this.responseType;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // retrofit2.CallAdapter
    public java.lang.Object adapt(retrofit2.Call<R> call) {
        io.reactivex.Observable callExecuteObservable;
        io.reactivex.Observable bodyObservable;
        io.reactivex.Scheduler scheduler;
        if (this.isAsync) {
            callExecuteObservable = new retrofit2.adapter.rxjava2.CallEnqueueObservable(call);
        } else {
            callExecuteObservable = new retrofit2.adapter.rxjava2.CallExecuteObservable(call);
        }
        if (this.isResult) {
            bodyObservable = new retrofit2.adapter.rxjava2.ResultObservable(callExecuteObservable);
        } else {
            if (this.isBody) {
                bodyObservable = new retrofit2.adapter.rxjava2.BodyObservable(callExecuteObservable);
            }
            scheduler = this.scheduler;
            if (scheduler != null) {
                callExecuteObservable = callExecuteObservable.subscribeOn(scheduler);
            }
            if (this.isFlowable) {
                return callExecuteObservable.toFlowable(io.reactivex.BackpressureStrategy.LATEST);
            }
            if (this.isSingle) {
                return callExecuteObservable.singleOrError();
            }
            if (this.isMaybe) {
                return callExecuteObservable.singleElement();
            }
            if (this.isCompletable) {
                return callExecuteObservable.ignoreElements();
            }
            return io.reactivex.plugins.RxJavaPlugins.onAssembly(callExecuteObservable);
        }
        callExecuteObservable = bodyObservable;
        scheduler = this.scheduler;
        if (scheduler != null) {
            callExecuteObservable = callExecuteObservable.subscribeOn(scheduler);
        }
        if (this.isFlowable) {
            return callExecuteObservable.toFlowable(io.reactivex.BackpressureStrategy.LATEST);
        }
        if (this.isSingle) {
            return callExecuteObservable.singleOrError();
        }
        if (this.isMaybe) {
            return callExecuteObservable.singleElement();
        }
        if (this.isCompletable) {
            return callExecuteObservable.ignoreElements();
        }
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(callExecuteObservable);
    }
}
