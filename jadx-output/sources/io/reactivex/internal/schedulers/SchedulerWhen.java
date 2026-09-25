package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
public class SchedulerWhen extends io.reactivex.Scheduler implements io.reactivex.disposables.Disposable {
    private final io.reactivex.Scheduler actualScheduler;
    private io.reactivex.disposables.Disposable disposable;
    private final io.reactivex.processors.FlowableProcessor<io.reactivex.Flowable<io.reactivex.Completable>> workerProcessor;
    static final io.reactivex.disposables.Disposable SUBSCRIBED = new io.reactivex.internal.schedulers.SchedulerWhen.SubscribedDisposable();
    static final io.reactivex.disposables.Disposable DISPOSED = io.reactivex.disposables.Disposables.disposed();

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulerWhen(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> function, io.reactivex.Scheduler scheduler) {
        this.actualScheduler = scheduler;
        io.reactivex.processors.FlowableProcessor serialized = io.reactivex.processors.UnicastProcessor.create().toSerialized();
        this.workerProcessor = serialized;
        try {
            this.disposable = ((io.reactivex.Completable) function.apply(serialized)).subscribe();
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.disposable.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposable.isDisposed();
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        io.reactivex.Scheduler.Worker workerCreateWorker = this.actualScheduler.createWorker();
        io.reactivex.processors.FlowableProcessor<T> serialized = io.reactivex.processors.UnicastProcessor.create().toSerialized();
        io.reactivex.Flowable<io.reactivex.Completable> map = serialized.map(new io.reactivex.internal.schedulers.SchedulerWhen.CreateWorkerFunction(workerCreateWorker));
        io.reactivex.internal.schedulers.SchedulerWhen.QueueWorker queueWorker = new io.reactivex.internal.schedulers.SchedulerWhen.QueueWorker(serialized, workerCreateWorker);
        this.workerProcessor.onNext(map);
        return queueWorker;
    }

    static abstract class ScheduledAction extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable {
        protected abstract io.reactivex.disposables.Disposable callActual(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver);

        ScheduledAction() {
            super(io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED);
        }

        void call(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable != io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED && disposable == io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED) {
                io.reactivex.disposables.Disposable disposableCallActual = callActual(worker, completableObserver);
                if (compareAndSet(io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED, disposableCallActual)) {
                    return;
                }
                disposableCallActual.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get().isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.disposables.Disposable disposable;
            io.reactivex.disposables.Disposable disposable2 = io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED;
            do {
                disposable = get();
                if (disposable == io.reactivex.internal.schedulers.SchedulerWhen.DISPOSED) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != io.reactivex.internal.schedulers.SchedulerWhen.SUBSCRIBED) {
                disposable.dispose();
            }
        }
    }

    static class ImmediateAction extends io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.lang.Runnable action;

        ImmediateAction(java.lang.Runnable runnable) {
            this.action = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected io.reactivex.disposables.Disposable callActual(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver) {
            return worker.schedule(new io.reactivex.internal.schedulers.SchedulerWhen.OnCompletedAction(this.action, completableObserver));
        }
    }

    static class DelayedAction extends io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.lang.Runnable action;
        private final long delayTime;
        private final java.util.concurrent.TimeUnit unit;

        DelayedAction(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            this.action = runnable;
            this.delayTime = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected io.reactivex.disposables.Disposable callActual(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver) {
            return worker.schedule(new io.reactivex.internal.schedulers.SchedulerWhen.OnCompletedAction(this.action, completableObserver), this.delayTime, this.unit);
        }
    }

    static class OnCompletedAction implements java.lang.Runnable {
        final java.lang.Runnable action;
        final io.reactivex.CompletableObserver actionCompletable;

        OnCompletedAction(java.lang.Runnable runnable, io.reactivex.CompletableObserver completableObserver) {
            this.action = runnable;
            this.actionCompletable = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.action.run();
            } finally {
                this.actionCompletable.onComplete();
            }
        }
    }

    static final class CreateWorkerFunction implements io.reactivex.functions.Function<io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction, io.reactivex.Completable> {
        final io.reactivex.Scheduler.Worker actualWorker;

        CreateWorkerFunction(io.reactivex.Scheduler.Worker worker) {
            this.actualWorker = worker;
        }

        @Override // io.reactivex.functions.Function
        public io.reactivex.Completable apply(io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction) {
            return new io.reactivex.internal.schedulers.SchedulerWhen.CreateWorkerFunction.WorkerCompletable(scheduledAction);
        }

        final class WorkerCompletable extends io.reactivex.Completable {
            final io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction action;

            WorkerCompletable(io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction) {
                this.action = scheduledAction;
            }

            @Override // io.reactivex.Completable
            protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
                completableObserver.onSubscribe(this.action);
                this.action.call(io.reactivex.internal.schedulers.SchedulerWhen.CreateWorkerFunction.this.actualWorker, completableObserver);
            }
        }
    }

    static final class QueueWorker extends io.reactivex.Scheduler.Worker {
        private final io.reactivex.processors.FlowableProcessor<io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction> actionProcessor;
        private final io.reactivex.Scheduler.Worker actualWorker;
        private final java.util.concurrent.atomic.AtomicBoolean unsubscribed = new java.util.concurrent.atomic.AtomicBoolean();

        QueueWorker(io.reactivex.processors.FlowableProcessor<io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction> flowableProcessor, io.reactivex.Scheduler.Worker worker) {
            this.actionProcessor = flowableProcessor;
            this.actualWorker = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.unsubscribed.compareAndSet(false, true)) {
                this.actionProcessor.onComplete();
                this.actualWorker.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.unsubscribed.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            io.reactivex.internal.schedulers.SchedulerWhen.DelayedAction delayedAction = new io.reactivex.internal.schedulers.SchedulerWhen.DelayedAction(runnable, j, timeUnit);
            this.actionProcessor.onNext(delayedAction);
            return delayedAction;
        }

        @Override // io.reactivex.Scheduler.Worker
        public io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            io.reactivex.internal.schedulers.SchedulerWhen.ImmediateAction immediateAction = new io.reactivex.internal.schedulers.SchedulerWhen.ImmediateAction(runnable);
            this.actionProcessor.onNext(immediateAction);
            return immediateAction;
        }
    }

    static final class SubscribedDisposable implements io.reactivex.disposables.Disposable {
        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return false;
        }

        SubscribedDisposable() {
        }
    }
}
