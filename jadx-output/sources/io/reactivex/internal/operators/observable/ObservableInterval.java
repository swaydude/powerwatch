package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableInterval extends io.reactivex.Observable<java.lang.Long> {
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public ObservableInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.initialDelay = j;
        this.period = j2;
        this.unit = timeUnit;
        this.scheduler = scheduler;
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
        io.reactivex.internal.operators.observable.ObservableInterval.IntervalObserver intervalObserver = new io.reactivex.internal.operators.observable.ObservableInterval.IntervalObserver(observer);
        observer.onSubscribe(intervalObserver);
        io.reactivex.Scheduler scheduler = this.scheduler;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker workerCreateWorker = scheduler.createWorker();
            intervalObserver.setResource(workerCreateWorker);
            workerCreateWorker.schedulePeriodically(intervalObserver, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalObserver.setResource(scheduler.schedulePeriodicallyDirect(intervalObserver, this.initialDelay, this.period, this.unit));
    }

    static final class IntervalObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final io.reactivex.Observer<? super java.lang.Long> downstream;

        IntervalObserver(io.reactivex.Observer<? super java.lang.Long> observer) {
            this.downstream = observer;
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
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.Observer<? super java.lang.Long> observer = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                observer.onNext(java.lang.Long.valueOf(j));
            }
        }

        public void setResource(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }
    }
}
