package io.reactivex.internal.schedulers;

/* JADX INFO: loaded from: classes2.dex */
final class DisposeOnCancel implements java.util.concurrent.Future<java.lang.Object> {
    final io.reactivex.disposables.Disposable upstream;

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    DisposeOnCancel(io.reactivex.disposables.Disposable disposable) {
        this.upstream = disposable;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.upstream.dispose();
        return false;
    }
}
