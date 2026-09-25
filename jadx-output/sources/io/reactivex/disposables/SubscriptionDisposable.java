package io.reactivex.disposables;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriptionDisposable extends io.reactivex.disposables.ReferenceDisposable<org.reactivestreams.Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(org.reactivestreams.Subscription subscription) {
        super(subscription);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(org.reactivestreams.Subscription subscription) {
        subscription.cancel();
    }
}
