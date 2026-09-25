package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableGenerate<T, S> extends io.reactivex.Observable<T> {
    final io.reactivex.functions.Consumer<? super S> disposeState;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> generator;
    final java.util.concurrent.Callable<S> stateSupplier;

    public ObservableGenerate(java.util.concurrent.Callable<S> callable, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer) {
        this.stateSupplier = callable;
        this.generator = biFunction;
        this.disposeState = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            io.reactivex.internal.operators.observable.ObservableGenerate.GeneratorDisposable generatorDisposable = new io.reactivex.internal.operators.observable.ObservableGenerate.GeneratorDisposable(observer, this.generator, this.disposeState, this.stateSupplier.call());
            observer.onSubscribe(generatorDisposable);
            generatorDisposable.run();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    static final class GeneratorDisposable<T, S> implements io.reactivex.Emitter<T>, io.reactivex.disposables.Disposable {
        volatile boolean cancelled;
        final io.reactivex.functions.Consumer<? super S> disposeState;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        GeneratorDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer, S s) {
            this.downstream = observer;
            this.generator = biFunction;
            this.disposeState = consumer;
            this.state = s;
        }

        public void run() {
            S sApply = this.state;
            if (this.cancelled) {
                this.state = null;
                dispose(sApply);
                return;
            }
            io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction = this.generator;
            while (!this.cancelled) {
                this.hasNext = false;
                try {
                    sApply = biFunction.apply(sApply, this);
                    if (this.terminate) {
                        this.cancelled = true;
                        this.state = null;
                        dispose(sApply);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.state = null;
                    this.cancelled = true;
                    onError(th);
                    dispose(sApply);
                    return;
                }
            }
            this.state = null;
            dispose(sApply);
        }

        private void dispose(S s) {
            try {
                this.disposeState.accept(s);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Emitter
        public void onNext(T t) {
            if (this.terminate) {
                return;
            }
            if (this.hasNext) {
                onError(new java.lang.IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.hasNext = true;
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable th) {
            if (this.terminate) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.terminate = true;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            if (this.terminate) {
                return;
            }
            this.terminate = true;
            this.downstream.onComplete();
        }
    }
}
