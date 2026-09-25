package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingObservableLatest<T> implements java.lang.Iterable<T> {
    final io.reactivex.ObservableSource<T> source;

    public BlockingObservableLatest(io.reactivex.ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.observable.BlockingObservableLatest.BlockingObservableLatestIterator blockingObservableLatestIterator = new io.reactivex.internal.operators.observable.BlockingObservableLatest.BlockingObservableLatestIterator();
        io.reactivex.Observable.wrap(this.source).materialize().subscribe(blockingObservableLatestIterator);
        return blockingObservableLatestIterator;
    }

    static final class BlockingObservableLatestIterator<T> extends io.reactivex.observers.DisposableObserver<io.reactivex.Notification<T>> implements java.util.Iterator<T> {
        io.reactivex.Notification<T> iteratorNotification;
        final java.util.concurrent.Semaphore notify = new java.util.concurrent.Semaphore(0);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> value = new java.util.concurrent.atomic.AtomicReference<>();

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        BlockingObservableLatestIterator() {
        }

        @Override // io.reactivex.Observer
        public void onNext(io.reactivex.Notification<T> notification) {
            if (this.value.getAndSet(notification) == null) {
                this.notify.release();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            io.reactivex.Notification<T> notification = this.iteratorNotification;
            if (notification != null && notification.isOnError()) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(this.iteratorNotification.getError());
            }
            if (this.iteratorNotification == null) {
                try {
                    io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                    this.notify.acquire();
                    io.reactivex.Notification<T> andSet = this.value.getAndSet(null);
                    this.iteratorNotification = andSet;
                    if (andSet.isOnError()) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (java.lang.InterruptedException e) {
                    dispose();
                    this.iteratorNotification = io.reactivex.Notification.createOnError(e);
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.iteratorNotification.isOnNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T value = this.iteratorNotification.getValue();
                this.iteratorNotification = null;
                return value;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Read-only iterator.");
        }
    }
}
