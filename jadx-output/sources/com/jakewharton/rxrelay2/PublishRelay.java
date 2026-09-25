package com.jakewharton.rxrelay2;

/* JADX INFO: loaded from: classes2.dex */
public final class PublishRelay<T> extends com.jakewharton.rxrelay2.Relay<T> {
    static final com.jakewharton.rxrelay2.PublishRelay.PublishDisposable[] EMPTY = new com.jakewharton.rxrelay2.PublishRelay.PublishDisposable[0];
    final java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T>[]> subscribers = new java.util.concurrent.atomic.AtomicReference<>(EMPTY);

    @io.reactivex.annotations.CheckReturnValue
    public static <T> com.jakewharton.rxrelay2.PublishRelay<T> create() {
        return new com.jakewharton.rxrelay2.PublishRelay<>();
    }

    PublishRelay() {
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> observer) {
        com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T> publishDisposable = new com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<>(observer, this);
        observer.onSubscribe(publishDisposable);
        add(publishDisposable);
        if (publishDisposable.isDisposed()) {
            remove(publishDisposable);
        }
    }

    void add(com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T> publishDisposable) {
        com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T>[] publishDisposableArr;
        com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.subscribers.get();
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new com.jakewharton.rxrelay2.PublishRelay.PublishDisposable[length + 1];
            java.lang.System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!this.subscribers.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    void remove(com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T> publishDisposable) {
        com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T>[] publishDisposableArr;
        com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T>[] publishDisposableArr2;
        do {
            publishDisposableArr = this.subscribers.get();
            if (publishDisposableArr == EMPTY) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = -1;
            for (int i2 = 0; i2 < length; i2++) {
                if (publishDisposableArr[i2] == publishDisposable) {
                    i = i2;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = EMPTY;
            } else {
                com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T>[] publishDisposableArr3 = new com.jakewharton.rxrelay2.PublishRelay.PublishDisposable[length - 1];
                java.lang.System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                java.lang.System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!this.subscribers.compareAndSet(publishDisposableArr, publishDisposableArr2));
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        java.util.Objects.requireNonNull(t, "value == null");
        for (com.jakewharton.rxrelay2.PublishRelay.PublishDisposable<T> publishDisposable : this.subscribers.get()) {
            publishDisposable.onNext(t);
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        return this.subscribers.get().length != 0;
    }

    static final class PublishDisposable<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final io.reactivex.Observer<? super T> downstream;
        final com.jakewharton.rxrelay2.PublishRelay<T> parent;

        PublishDisposable(io.reactivex.Observer<? super T> observer, com.jakewharton.rxrelay2.PublishRelay<T> publishRelay) {
            this.downstream = observer;
            this.parent = publishRelay;
        }

        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }
}
