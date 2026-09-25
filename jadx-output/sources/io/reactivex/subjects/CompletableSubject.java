package io.reactivex.subjects;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableSubject extends io.reactivex.Completable implements io.reactivex.CompletableObserver {
    static final io.reactivex.subjects.CompletableSubject.CompletableDisposable[] EMPTY = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[0];
    static final io.reactivex.subjects.CompletableSubject.CompletableDisposable[] TERMINATED = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[0];
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.CompletableSubject.CompletableDisposable[]> observers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);

    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.subjects.CompletableSubject create() {
        return new io.reactivex.subjects.CompletableSubject();
    }

    CompletableSubject() {
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.observers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.error = th;
            for (io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable : this.observers.getAndSet(TERMINATED)) {
                completableDisposable.downstream.onError(th);
            }
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            for (io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable : this.observers.getAndSet(TERMINATED)) {
                completableDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable = new io.reactivex.subjects.CompletableSubject.CompletableDisposable(completableObserver, this);
        completableObserver.onSubscribe(completableDisposable);
        if (add(completableDisposable)) {
            if (completableDisposable.isDisposed()) {
                remove(completableDisposable);
            }
        } else {
            java.lang.Throwable th = this.error;
            if (th != null) {
                completableObserver.onError(th);
            } else {
                completableObserver.onComplete();
            }
        }
    }

    boolean add(io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable) {
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr;
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.observers.get();
            if (completableDisposableArr == TERMINATED) {
                return false;
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[length + 1];
            java.lang.System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!this.observers.compareAndSet(completableDisposableArr, completableDisposableArr2));
        return true;
    }

    void remove(io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable) {
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr;
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.observers.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (completableDisposableArr[i2] == completableDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr2 = EMPTY;
            } else {
                io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr3 = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[length - 1];
                java.lang.System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                java.lang.System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!this.observers.compareAndSet(completableDisposableArr, completableDisposableArr2));
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
        return this.observers.get() == TERMINATED && this.error == null;
    }

    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    int observerCount() {
        return this.observers.get().length;
    }

    static final class CompletableDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.CompletableSubject> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.CompletableObserver downstream;

        CompletableDisposable(io.reactivex.CompletableObserver completableObserver, io.reactivex.subjects.CompletableSubject completableSubject) {
            this.downstream = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.subjects.CompletableSubject andSet = getAndSet(null);
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
