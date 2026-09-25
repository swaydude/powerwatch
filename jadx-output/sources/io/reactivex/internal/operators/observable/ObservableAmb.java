package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableAmb<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<? extends T>[] sources;
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> sourcesIterable;

    public ObservableAmb(io.reactivex.ObservableSource<? extends T>[] observableSourceArr, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> iterable) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        int length;
        io.reactivex.ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new io.reactivex.Observable[8];
            try {
                length = 0;
                for (io.reactivex.ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                    if (observableSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == observableSourceArr.length) {
                        io.reactivex.ObservableSource<? extends T>[] observableSourceArr2 = new io.reactivex.ObservableSource[(length >> 2) + length];
                        java.lang.System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
        } else if (length == 1) {
            observableSourceArr[0].subscribe(observer);
        } else {
            new io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator(observer, length).subscribe(observableSourceArr);
        }
    }

    static final class AmbCoordinator<T> implements io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] observers;
        final java.util.concurrent.atomic.AtomicInteger winner = new java.util.concurrent.atomic.AtomicInteger();

        AmbCoordinator(io.reactivex.Observer<? super T> observer, int i) {
            this.downstream = observer;
            this.observers = new io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver[i];
        }

        public void subscribe(io.reactivex.ObservableSource<? extends T>[] observableSourceArr) {
            io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] ambInnerObserverArr = this.observers;
            int length = ambInnerObserverArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerObserverArr[i] = new io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<>(this, i2, this.downstream);
                i = i2;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.winner.get() == 0; i3++) {
                observableSourceArr[i3].subscribe(ambInnerObserverArr[i3]);
            }
        }

        public boolean win(int i) {
            int i2 = this.winner.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            }
            if (!this.winner.compareAndSet(0, i)) {
                return false;
            }
            io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] ambInnerObserverArr = this.observers;
            int length = ambInnerObserverArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    ambInnerObserverArr[i3].dispose();
                }
                i3 = i4;
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T> ambInnerObserver : this.observers) {
                    ambInnerObserver.dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.winner.get() == -1;
        }
    }

    static final class AmbInnerObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final io.reactivex.Observer<? super T> downstream;
        final int index;
        final io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator<T> parent;
        boolean won;

        AmbInnerObserver(io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator<T> ambCoordinator, int i, io.reactivex.Observer<? super T> observer) {
            this.parent = ambCoordinator;
            this.index = i;
            this.downstream = observer;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                get().dispose();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }
    }
}
