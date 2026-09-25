package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableElementAt<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    public ObservableElementAt(io.reactivex.ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.index = j;
        this.defaultValue = t;
        this.errorOnFewer = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableElementAt.ElementAtObserver(observer, this.index, this.defaultValue, this.errorOnFewer));
    }

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        long count;
        final T defaultValue;
        boolean done;
        final io.reactivex.Observer<? super T> downstream;
        final boolean errorOnFewer;
        final long index;
        io.reactivex.disposables.Disposable upstream;

        ElementAtObserver(io.reactivex.Observer<? super T> observer, long j, T t, boolean z) {
            this.downstream = observer;
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.count;
            if (j == this.index) {
                this.done = true;
                this.upstream.dispose();
                this.downstream.onNext(t);
                this.downstream.onComplete();
                return;
            }
            this.count = j + 1;
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t = this.defaultValue;
            if (t == null && this.errorOnFewer) {
                this.downstream.onError(new java.util.NoSuchElementException());
                return;
            }
            if (t != null) {
                this.downstream.onNext(t);
            }
            this.downstream.onComplete();
        }
    }
}
