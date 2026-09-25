package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes2.dex */
public final class CompletableLift extends io.reactivex.Completable {
    final io.reactivex.CompletableOperator onLift;
    final io.reactivex.CompletableSource source;

    public CompletableLift(io.reactivex.CompletableSource completableSource, io.reactivex.CompletableOperator completableOperator) {
        this.source = completableSource;
        this.onLift = completableOperator;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            this.source.subscribe(this.onLift.apply(completableObserver));
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
