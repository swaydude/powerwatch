package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableElementAtMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final long index;
    final io.reactivex.ObservableSource<T> source;

    public ObservableElementAtMaybe(io.reactivex.ObservableSource<T> observableSource, long j) {
        this.source = observableSource;
        this.index = j;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableElementAtMaybe.ElementAtObserver(maybeObserver, this.index));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<T> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableElementAt(this.source, this.index, null, false));
    }

    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        long count;
        boolean done;
        final io.reactivex.MaybeObserver<? super T> downstream;
        final long index;
        io.reactivex.disposables.Disposable upstream;

        ElementAtObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, long j) {
            this.downstream = maybeObserver;
            this.index = j;
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
                this.downstream.onSuccess(t);
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
            this.downstream.onComplete();
        }
    }
}
