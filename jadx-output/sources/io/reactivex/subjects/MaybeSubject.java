package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeSubject<T> extends io.reactivex.Maybe<T> implements io.reactivex.MaybeObserver<T> {
    static final io.reactivex.subjects.MaybeSubject.MaybeDisposable[] EMPTY = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[0];
    static final io.reactivex.subjects.MaybeSubject.MaybeDisposable[] TERMINATED = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[0];
    java.lang.Throwable error;
    T value;
    final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.MaybeSubject<T> create() {
        return new io.reactivex.subjects.MaybeSubject<>();
    }

    MaybeSubject() {
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.observers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.value = t;
            for (io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable : this.observers.getAndSet(TERMINATED)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.error = th;
            for (io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable : this.observers.getAndSet(TERMINATED)) {
                maybeDisposable.downstream.onError(th);
            }
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            for (io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable : this.observers.getAndSet(TERMINATED)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable = new io.reactivex.subjects.MaybeSubject.MaybeDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(maybeDisposable);
        if (add(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                remove(maybeDisposable);
                return;
            }
            return;
        }
        java.lang.Throwable th = this.error;
        if (th != null) {
            maybeObserver.onError(th);
            return;
        }
        T t = this.value;
        if (t == null) {
            maybeObserver.onComplete();
        } else {
            maybeObserver.onSuccess(t);
        }
    }

    boolean add(io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable) {
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr;
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.observers.get();
            if (maybeDisposableArr == TERMINATED) {
                return false;
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[length + 1];
            java.lang.System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!this.observers.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable) {
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr;
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.observers.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (maybeDisposableArr[i2] == maybeDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                maybeDisposableArr2 = EMPTY;
            } else {
                io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr3 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[length - 1];
                java.lang.System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                java.lang.System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!this.observers.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
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

    public boolean hasComplete() {
        return this.observers.get() == TERMINATED && this.value == null && this.error == null;
    }

    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    int observerCount() {
        return this.observers.get().length;
    }

    static final class MaybeDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.MaybeObserver<? super T> downstream;

        MaybeDisposable(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.subjects.MaybeSubject<T> maybeSubject) {
            this.downstream = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.subjects.MaybeSubject<T> andSet = getAndSet(null);
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
