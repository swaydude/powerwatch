package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableCreate<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.BackpressureStrategy backpressure;
    final io.reactivex.FlowableOnSubscribe<T> source;

    public FlowableCreate(io.reactivex.FlowableOnSubscribe<T> flowableOnSubscribe, io.reactivex.BackpressureStrategy backpressureStrategy) {
        this.source = flowableOnSubscribe;
        this.backpressure = backpressureStrategy;
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureStrategy;

        static {
            int[] iArr = new int[io.reactivex.BackpressureStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureStrategy = iArr;
            try {
                iArr[io.reactivex.BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[io.reactivex.BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[io.reactivex.BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureStrategy[io.reactivex.BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
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
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter missingEmitter;
        int i = io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.$SwitchMap$io$reactivex$BackpressureStrategy[this.backpressure.ordinal()];
        if (i == 1) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.MissingEmitter(subscriber);
        } else if (i == 2) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.ErrorAsyncEmitter(subscriber);
        } else if (i == 3) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.DropAsyncEmitter(subscriber);
        } else if (i == 4) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.LatestAsyncEmitter(subscriber);
        } else {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.BufferAsyncEmitter(subscriber, bufferSize());
        }
        subscriber.onSubscribe(missingEmitter);
        try {
            this.source.subscribe(missingEmitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            missingEmitter.onError(th);
        }
    }

    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> emitter;
        final io.reactivex.internal.util.AtomicThrowable error = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue(16);

        @Override // io.reactivex.FlowableEmitter
        public io.reactivex.FlowableEmitter<T> serialize() {
            return this;
        }

        SerializedEmitter(io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> baseEmitter) {
            this.emitter = baseEmitter;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.emitter.isCancelled() || this.done) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.emitter.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
                synchronized (simplePlainQueue) {
                    simplePlainQueue.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            if (!this.emitter.isCancelled() && !this.done) {
                if (th == null) {
                    th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.error.addThrowable(th)) {
                    this.done = true;
                    drain();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.emitter.isCancelled() || this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> baseEmitter = this.emitter;
            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.queue;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.error;
            int iAddAndGet = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    simplePlainQueue.clear();
                    baseEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.done;
                T tPoll = simplePlainQueue.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    baseEmitter.onComplete();
                    return;
                } else if (!z2) {
                    baseEmitter.onNext(tPoll);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            simplePlainQueue.clear();
        }

        @Override // io.reactivex.FlowableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable disposable) {
            this.emitter.setDisposable(disposable);
        }

        @Override // io.reactivex.FlowableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            this.emitter.setCancellable(cancellable);
        }

        @Override // io.reactivex.FlowableEmitter
        public long requested() {
            return this.emitter.requested();
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean isCancelled() {
            return this.emitter.isCancelled();
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public java.lang.String toString() {
            return this.emitter.toString();
        }
    }

    static abstract class BaseEmitter<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableEmitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final org.reactivestreams.Subscriber<? super T> downstream;
        final io.reactivex.internal.disposables.SequentialDisposable serial = new io.reactivex.internal.disposables.SequentialDisposable();

        void onRequested() {
        }

        void onUnsubscribed() {
        }

        BaseEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            complete();
        }

        protected void complete() {
            if (isCancelled()) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                this.serial.dispose();
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            return error(th);
        }

        protected boolean error(java.lang.Throwable th) {
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                return true;
            } finally {
                this.serial.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.serial.dispose();
            onUnsubscribed();
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.serial.isDisposed();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
                onRequested();
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            this.serial.update(disposable);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.FlowableEmitter
        public final io.reactivex.FlowableEmitter<T> serialize() {
            return new io.reactivex.internal.operators.flowable.FlowableCreate.SerializedEmitter(this);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    static final class MissingEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t != null) {
                this.downstream.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    static abstract class NoOverflowBaseAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        abstract void onOverflow();

        NoOverflowBaseAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.downstream.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
            } else {
                onOverflow();
            }
        }
    }

    static final class DropAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void onOverflow() {
        }

        DropAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }
    }

    static final class ErrorAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        void onOverflow() {
            onError(new io.reactivex.exceptions.MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    static final class BufferAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
        final java.util.concurrent.atomic.AtomicInteger wip;

        BufferAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.queue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.done || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.offer(t);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onRequested() {
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.done;
                    T tPoll = spscLinkedArrayQueue.poll();
                    boolean z2 = tPoll == null;
                    if (z && z2) {
                        java.lang.Throwable th = this.error;
                        if (th != null) {
                            error(th);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (isCancelled()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z3 = this.done;
                    boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                    if (z3 && zIsEmpty) {
                        java.lang.Throwable th2 = this.error;
                        if (th2 != null) {
                            error(th2);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    io.reactivex.internal.util.BackpressureHelper.produced(this, j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    static final class LatestAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        java.lang.Throwable error;
        final java.util.concurrent.atomic.AtomicReference<T> queue;
        final java.util.concurrent.atomic.AtomicInteger wip;

        LatestAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
            this.queue = new java.util.concurrent.atomic.AtomicReference<>();
            this.wip = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.done || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.set(t);
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            if (this.done || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.error = th;
            this.done = true;
            drain();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onRequested() {
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = this.downstream;
            java.util.concurrent.atomic.AtomicReference<T> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        java.lang.Throwable th = this.error;
                        if (th != null) {
                            error(th);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(andSet);
                    j2++;
                }
                if (j2 == j) {
                    if (isCancelled()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.done;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        java.lang.Throwable th2 = this.error;
                        if (th2 != null) {
                            error(th2);
                            return;
                        } else {
                            complete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    io.reactivex.internal.util.BackpressureHelper.produced(this, j2);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }
}
