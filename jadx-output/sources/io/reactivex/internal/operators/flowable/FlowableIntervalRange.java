package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableIntervalRange extends io.reactivex.Flowable<java.lang.Long> {
    final long end;
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final long start;
    final java.util.concurrent.TimeUnit unit;

    public FlowableIntervalRange(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
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
    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableIntervalRange.IntervalRangeSubscriber intervalRangeSubscriber = new io.reactivex.internal.operators.flowable.FlowableIntervalRange.IntervalRangeSubscriber(subscriber, this.start, this.end);
        subscriber.onSubscribe(intervalRangeSubscriber);
        io.reactivex.Scheduler scheduler = this.scheduler;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker workerCreateWorker = scheduler.createWorker();
            intervalRangeSubscriber.setResource(workerCreateWorker);
            workerCreateWorker.schedulePeriodically(intervalRangeSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalRangeSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeSubscriber, this.initialDelay, this.period, this.unit));
    }

    static final class IntervalRangeSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final org.reactivestreams.Subscriber<? super java.lang.Long> downstream;
        final long end;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource = new java.util.concurrent.atomic.AtomicReference<>();

        IntervalRangeSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber, long j, long j2) {
            this.downstream = subscriber;
            this.count = j;
            this.end = j2;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.resource);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.resource.get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                long j = get();
                if (j != 0) {
                    long j2 = this.count;
                    this.downstream.onNext(java.lang.Long.valueOf(j2));
                    if (j2 == this.end) {
                        if (this.resource.get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                            this.downstream.onComplete();
                        }
                        io.reactivex.internal.disposables.DisposableHelper.dispose(this.resource);
                        return;
                    } else {
                        this.count = j2 + 1;
                        if (j != kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                            decrementAndGet();
                            return;
                        }
                        return;
                    }
                }
                this.downstream.onError(new io.reactivex.exceptions.MissingBackpressureException("Can't deliver value " + this.count + " due to lack of requests"));
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.resource);
            }
        }

        public void setResource(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.resource, disposable);
        }
    }
}
