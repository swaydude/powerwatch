package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableIntervalRange extends io.reactivex.Observable<java.lang.Long> {
    final long end;
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final long start;
    final java.util.concurrent.TimeUnit unit;

    public ObservableIntervalRange(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.initialDelay = j3;
        this.period = j4;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.start = j;
        this.end = j2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        io.reactivex.internal.operators.observable.ObservableIntervalRange.IntervalRangeObserver intervalRangeObserver = new io.reactivex.internal.operators.observable.ObservableIntervalRange.IntervalRangeObserver(observer, this.start, this.end);
        observer.onSubscribe(intervalRangeObserver);
        io.reactivex.Scheduler scheduler = this.scheduler;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker workerCreateWorker = scheduler.createWorker();
            intervalRangeObserver.setResource(workerCreateWorker);
            workerCreateWorker.schedulePeriodically(intervalRangeObserver, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalRangeObserver.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeObserver, this.initialDelay, this.period, this.unit));
    }

    static final class IntervalRangeObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final io.reactivex.Observer<? super java.lang.Long> downstream;
        final long end;

        IntervalRangeObserver(io.reactivex.Observer<? super java.lang.Long> observer, long j, long j2) {
            this.downstream = observer;
            this.count = j;
            this.end = j2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            long j = this.count;
            this.downstream.onNext(java.lang.Long.valueOf(j));
            if (j == this.end) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                this.downstream.onComplete();
            } else {
                this.count = j + 1;
            }
        }

        public void setResource(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }
    }
}
