package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableLift<R, T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.FlowableOperator<? extends R, ? super T> operator;

    public FlowableLift(io.reactivex.Flowable<T> flowable, io.reactivex.FlowableOperator<? extends R, ? super T> flowableOperator) {
        super(flowable);
        this.operator = flowableOperator;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        try {
            org.reactivestreams.Subscriber<? super java.lang.Object> subscriberApply = this.operator.apply(subscriber);
            if (subscriberApply == null) {
                throw new java.lang.NullPointerException("Operator " + this.operator + " returned a null Subscriber");
            }
            this.source.subscribe(subscriberApply);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
