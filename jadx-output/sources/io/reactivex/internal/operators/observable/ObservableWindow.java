package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableWindow<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int capacityHint;
    final long count;
    final long skip;

    public ObservableWindow(io.reactivex.ObservableSource<T> observableSource, long j, long j2, int i) {
        super(observableSource);
        this.count = j;
        this.skip = j2;
        this.capacityHint = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        if (this.count == this.skip) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindow.WindowExactObserver(observer, this.count, this.capacityHint));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindow.WindowSkipObserver(observer, this.count, this.skip, this.capacityHint));
        }
    }

    static final class WindowExactObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> downstream;
        long size;
        io.reactivex.disposables.Disposable upstream;
        io.reactivex.subjects.UnicastSubject<T> window;

        WindowExactObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, int i) {
            this.downstream = observer;
            this.count = j;
            this.capacityHint = i;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = this.window;
            if (unicastSubjectCreate == null && !this.cancelled) {
                unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.capacityHint, this);
                this.window = unicastSubjectCreate;
                this.downstream.onNext(unicastSubjectCreate);
            }
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t);
                long j = this.size + 1;
                this.size = j;
                if (j >= this.count) {
                    this.size = 0L;
                    this.window = null;
                    unicastSubjectCreate.onComplete();
                    if (this.cancelled) {
                        this.upstream.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.window;
            if (unicastSubject != null) {
                this.window = null;
                unicastSubject.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.upstream.dispose();
            }
        }
    }

    static final class WindowSkipObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> downstream;
        long firstEmission;
        long index;
        final long skip;
        io.reactivex.disposables.Disposable upstream;
        final java.util.concurrent.atomic.AtomicInteger wip = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> windows = new java.util.ArrayDeque<>();

        WindowSkipObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, long j2, int i) {
            this.downstream = observer;
            this.count = j;
            this.skip = j2;
            this.capacityHint = i;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> arrayDeque = this.windows;
            long j = this.index;
            long j2 = this.skip;
            if (j % j2 == 0 && !this.cancelled) {
                this.wip.getAndIncrement();
                io.reactivex.subjects.UnicastSubject<T> unicastSubjectCreate = io.reactivex.subjects.UnicastSubject.create(this.capacityHint, this);
                arrayDeque.offer(unicastSubjectCreate);
                this.downstream.onNext(unicastSubjectCreate);
            }
            long j3 = this.firstEmission + 1;
            java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j3 >= this.count) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.cancelled) {
                    this.upstream.dispose();
                    return;
                }
                this.firstEmission = j3 - j2;
            } else {
                this.firstEmission = j3;
            }
            this.index = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> arrayDeque = this.windows;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.decrementAndGet() == 0 && this.cancelled) {
                this.upstream.dispose();
            }
        }
    }
}
