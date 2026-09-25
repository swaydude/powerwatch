package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class BlockingObservableNext<T> implements java.lang.Iterable<T> {
    final io.reactivex.ObservableSource<T> source;

    public BlockingObservableNext(io.reactivex.ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new io.reactivex.internal.operators.observable.BlockingObservableNext.NextIterator(this.source, new io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver());
    }

    static final class NextIterator<T> implements java.util.Iterator<T> {
        private java.lang.Throwable error;
        private boolean hasNext = true;
        private boolean isNextConsumed = true;
        private final io.reactivex.ObservableSource<T> items;
        private T next;
        private final io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> observer;
        private boolean started;

        NextIterator(io.reactivex.ObservableSource<T> observableSource, io.reactivex.internal.operators.observable.BlockingObservableNext.NextObserver<T> nextObserver) {
            this.items = observableSource;
            this.observer = nextObserver;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            java.lang.Throwable th = this.error;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (this.hasNext) {
                return !this.isNextConsumed || moveToNext();
            }
            return false;
        }

        private boolean moveToNext() {
            if (!this.started) {
                this.started = true;
                this.observer.setWaiting();
                new io.reactivex.internal.operators.observable.ObservableMaterialize(this.items).subscribe(this.observer);
            }
            try {
                io.reactivex.Notification<T> notificationTakeNext = this.observer.takeNext();
                if (notificationTakeNext.isOnNext()) {
                    this.isNextConsumed = false;
                    this.next = notificationTakeNext.getValue();
                    return true;
                }
                this.hasNext = false;
                if (notificationTakeNext.isOnComplete()) {
                    return false;
                }
                java.lang.Throwable error = notificationTakeNext.getError();
                this.error = error;
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(error);
            } catch (java.lang.InterruptedException e) {
                this.observer.dispose();
                this.error = e;
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public T next() {
            java.lang.Throwable th = this.error;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (hasNext()) {
                this.isNextConsumed = true;
                return this.next;
            }
            throw new java.util.NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Read only iterator");
        }
    }

    static final class NextObserver<T> extends io.reactivex.observers.DisposableObserver<io.reactivex.Notification<T>> {
        private final java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> buf = new java.util.concurrent.ArrayBlockingQueue(1);
        final java.util.concurrent.atomic.AtomicInteger waiting = new java.util.concurrent.atomic.AtomicInteger();

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        NextObserver() {
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(io.reactivex.Notification<T> notification) {
            if (this.waiting.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.buf.offer(notification)) {
                    io.reactivex.Notification<T> notificationPoll = this.buf.poll();
                    if (notificationPoll != null && !notificationPoll.isOnNext()) {
                        notification = notificationPoll;
                    }
                }
            }
        }

        public io.reactivex.Notification<T> takeNext() throws java.lang.InterruptedException {
            setWaiting();
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            return this.buf.take();
        }

        void setWaiting() {
            this.waiting.set(1);
        }
    }
}
