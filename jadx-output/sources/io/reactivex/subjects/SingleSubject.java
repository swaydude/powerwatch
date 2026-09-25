package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleSubject<T> extends io.reactivex.Single<T> implements io.reactivex.SingleObserver<T> {
    static final io.reactivex.subjects.SingleSubject.SingleDisposable[] EMPTY = new io.reactivex.subjects.SingleSubject.SingleDisposable[0];
    static final io.reactivex.subjects.SingleSubject.SingleDisposable[] TERMINATED = new io.reactivex.subjects.SingleSubject.SingleDisposable[0];
    java.lang.Throwable error;
    T value;
    final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.SingleSubject.SingleDisposable<T>[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.SingleSubject<T> create() {
        return new io.reactivex.subjects.SingleSubject<>();
    }

    SingleSubject() {
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.observers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.value = t;
            for (io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable : this.observers.getAndSet(TERMINATED)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.error = th;
            for (io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable : this.observers.getAndSet(TERMINATED)) {
                singleDisposable.downstream.onError(th);
            }
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable = new io.reactivex.subjects.SingleSubject.SingleDisposable<>(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        if (add(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                remove(singleDisposable);
            }
        } else {
            java.lang.Throwable th = this.error;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.value);
            }
        }
    }

    boolean add(io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable) {
        io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr;
        io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr2;
        do {
            singleDisposableArr = this.observers.get();
            if (singleDisposableArr == TERMINATED) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new io.reactivex.subjects.SingleSubject.SingleDisposable[length + 1];
            java.lang.System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!this.observers.compareAndSet(singleDisposableArr, singleDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable) {
        io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr;
        io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr2;
        do {
            singleDisposableArr = this.observers.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (singleDisposableArr[i2] == singleDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = EMPTY;
            } else {
                io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr3 = new io.reactivex.subjects.SingleSubject.SingleDisposable[length - 1];
                java.lang.System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                java.lang.System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!this.observers.compareAndSet(singleDisposableArr, singleDisposableArr2));
    }

    public T getValue() {
        if (this.observers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    public boolean hasValue() {
        return this.observers.get() == TERMINATED && this.value != null;
    }

    public java.lang.Throwable getThrowable() {
        if (this.observers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    public boolean hasThrowable() {
        return this.observers.get() == TERMINATED && this.error != null;
    }

    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    int observerCount() {
        return this.observers.get().length;
    }

    static final class SingleDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.SingleSubject<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.SingleObserver<? super T> downstream;

        SingleDisposable(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.subjects.SingleSubject<T> singleSubject) {
            this.downstream = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.subjects.SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
