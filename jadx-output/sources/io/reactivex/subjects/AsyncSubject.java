package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncSubject<T> extends io.reactivex.subjects.Subject<T> {
    static final io.reactivex.subjects.AsyncSubject.AsyncDisposable[] EMPTY = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[0];
    static final io.reactivex.subjects.AsyncSubject.AsyncDisposable[] TERMINATED = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[0];
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);
    T value;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.AsyncSubject<T> create() {
        return new io.reactivex.subjects.AsyncSubject<>();
    }

    AsyncSubject() {
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.subscribers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.subscribers.get() == TERMINATED) {
            return;
        }
        this.value = t;
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr = this.subscribers.get();
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr2 = TERMINATED;
        if (asyncDisposableArr == asyncDisposableArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.value = null;
        this.error = th;
        for (io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable : this.subscribers.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr = this.subscribers.get();
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr2 = TERMINATED;
        if (asyncDisposableArr == asyncDisposableArr2) {
            return;
        }
        T t = this.value;
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] andSet = this.subscribers.getAndSet(asyncDisposableArr2);
        int i = 0;
        if (t == null) {
            int length = andSet.length;
            while (i < length) {
                andSet[i].onComplete();
                i++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i < length2) {
            andSet[i].complete(t);
            i++;
        }
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.subscribers.get() == TERMINATED && this.error != null;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.subscribers.get() == TERMINATED && this.error == null;
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
        if (this.subscribers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable = new io.reactivex.subjects.AsyncSubject.AsyncDisposable<>(observer, this);
        observer.onSubscribe(asyncDisposable);
        if (add(asyncDisposable)) {
            if (asyncDisposable.isDisposed()) {
                remove(asyncDisposable);
                return;
            }
            return;
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            observer.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            asyncDisposable.complete(t);
        } else {
            asyncDisposable.onComplete();
        }
    }

    boolean add(io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable) {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr;
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.subscribers.get();
            if (asyncDisposableArr == TERMINATED) {
                return false;
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[length + 1];
            java.lang.System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!this.subscribers.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable) {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr;
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.subscribers.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (asyncDisposableArr[i2] == asyncDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                asyncDisposableArr2 = EMPTY;
            } else {
                io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr3 = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[length - 1];
                java.lang.System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                java.lang.System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!this.subscribers.compareAndSet(asyncDisposableArr, asyncDisposableArr2));
    }

    public boolean hasValue() {
        return this.subscribers.get() == TERMINATED && this.value != null;
    }

    public T getValue() {
        if (this.subscribers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    @java.lang.Deprecated
    public java.lang.Object[] getValues() {
        T value = getValue();
        return value != null ? new java.lang.Object[]{value} : new java.lang.Object[0];
    }

    @java.lang.Deprecated
    public T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    static final class AsyncDisposable<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final io.reactivex.subjects.AsyncSubject<T> parent;

        AsyncDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.AsyncSubject<T> asyncSubject) {
            super(observer);
            this.parent = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public void dispose() {
            if (super.tryDispose()) {
                this.parent.remove(this);
            }
        }

        void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }

        void onError(java.lang.Throwable th) {
            if (isDisposed()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
