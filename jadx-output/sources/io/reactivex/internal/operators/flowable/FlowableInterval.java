package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableInterval extends io.reactivex.Flowable<java.lang.Long> {
    final long initialDelay;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    public FlowableInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
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
    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableInterval.IntervalSubscriber intervalSubscriber = new io.reactivex.internal.operators.flowable.FlowableInterval.IntervalSubscriber(subscriber);
        subscriber.onSubscribe(intervalSubscriber);
        io.reactivex.Scheduler scheduler = this.scheduler;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker workerCreateWorker = scheduler.createWorker();
            intervalSubscriber.setResource(workerCreateWorker);
            workerCreateWorker.schedulePeriodically(intervalSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalSubscriber, this.initialDelay, this.period, this.unit));
    }

    static final class IntervalSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final org.reactivestreams.Subscriber<? super java.lang.Long> downstream;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> resource = new java.util.concurrent.atomic.AtomicReference<>();

        IntervalSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
            this.downstream = subscriber;
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
                if (get() != 0) {
                    org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.downstream;
                    long j = this.count;
                    this.count = j + 1;
                    subscriber.onNext(java.lang.Long.valueOf(j));
                    io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                    return;
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
