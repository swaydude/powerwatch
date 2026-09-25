package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableFromArray<T> extends io.reactivex.Observable<T> {
    final T[] array;

    public ObservableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableFromArray.FromArrayDisposable fromArrayDisposable = new io.reactivex.internal.operators.observable.ObservableFromArray.FromArrayDisposable(observer, this.array);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.fusionMode) {
            return;
        }
        fromArrayDisposable.run();
    }

    static final class FromArrayDisposable<T> extends io.reactivex.internal.observers.BasicQueueDisposable<T> {
        final T[] array;
        volatile boolean disposed;
        final io.reactivex.Observer<? super T> downstream;
        boolean fusionMode;
        int index;

        FromArrayDisposable(io.reactivex.Observer<? super T> observer, T[] tArr) {
            this.downstream = observer;
            this.array = tArr;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
            int i = this.index;
            T[] tArr = this.array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(tArr[i], "The array element is null");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.array.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        void run() {
            T[] tArr = this.array;
            int length = tArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    this.downstream.onError(new java.lang.NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.downstream.onNext(t);
            }
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }
    }
}
