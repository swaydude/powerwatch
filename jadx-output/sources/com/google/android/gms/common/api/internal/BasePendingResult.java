package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.PendingResult<R> {
    static final java.lang.ThreadLocal<java.lang.Boolean> zado = new com.google.android.gms.common.api.internal.zao();
    private com.google.android.gms.common.api.internal.BasePendingResult.zaa mResultGuardian;
    private com.google.android.gms.common.api.Status mStatus;
    private R zacl;
    private final java.lang.Object zadp;
    private final com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> zadq;
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> zadr;
    private final java.util.concurrent.CountDownLatch zads;
    private final java.util.ArrayList<com.google.android.gms.common.api.PendingResult.StatusListener> zadt;
    private com.google.android.gms.common.api.ResultCallback<? super R> zadu;
    private final java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zacq> zadv;
    private volatile boolean zadw;
    private boolean zadx;
    private boolean zady;
    private com.google.android.gms.common.internal.ICancelToken zadz;
    private volatile com.google.android.gms.common.api.internal.zack<R> zaea;
    private boolean zaeb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class zaa {
        private zaa() {
        }

        protected final void finalize() throws java.lang.Throwable {
            com.google.android.gms.common.api.internal.BasePendingResult.zab(com.google.android.gms.common.api.internal.BasePendingResult.this.zacl);
            super.finalize();
        }

        /* synthetic */ zaa(com.google.android.gms.common.api.internal.BasePendingResult basePendingResult, com.google.android.gms.common.api.internal.zao zaoVar) {
            this();
        }
    }

    @java.lang.Deprecated
    BasePendingResult() {
        this.zadp = new java.lang.Object();
        this.zads = new java.util.concurrent.CountDownLatch(1);
        this.zadt = new java.util.ArrayList<>();
        this.zadv = new java.util.concurrent.atomic.AtomicReference<>();
        this.zaeb = false;
        this.zadq = new com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<>(android.os.Looper.getMainLooper());
        this.zadr = new java.lang.ref.WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.ResultCallback<R> zaa(com.google.android.gms.common.api.ResultCallback<R> resultCallback) {
        return resultCallback;
    }

    protected abstract R createFailedResult(com.google.android.gms.common.api.Status status);

    @Override // com.google.android.gms.common.api.PendingResult
    public final java.lang.Integer zal() {
        return null;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class CallbackHandler<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.internal.base.zar {
        public CallbackHandler() {
            this(android.os.Looper.getMainLooper());
        }

        public CallbackHandler(android.os.Looper looper) {
            super(looper);
        }

        public final void zaa(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new android.util.Pair(com.google.android.gms.common.api.internal.BasePendingResult.zaa(resultCallback), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 1) {
                android.util.Pair pair = (android.util.Pair) message.obj;
                com.google.android.gms.common.api.ResultCallback resultCallback = (com.google.android.gms.common.api.ResultCallback) pair.first;
                com.google.android.gms.common.api.Result result = (com.google.android.gms.common.api.Result) pair.second;
                try {
                    resultCallback.onResult(result);
                    return;
                } catch (java.lang.RuntimeException e) {
                    com.google.android.gms.common.api.internal.BasePendingResult.zab(result);
                    throw e;
                }
            }
            if (i == 2) {
                ((com.google.android.gms.common.api.internal.BasePendingResult) message.obj).zab(com.google.android.gms.common.api.Status.RESULT_TIMEOUT);
                return;
            }
            int i2 = message.what;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            android.util.Log.wtf("BasePendingResult", sb.toString(), new java.lang.Exception());
        }
    }

    protected BasePendingResult(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        this.zadp = new java.lang.Object();
        this.zads = new java.util.concurrent.CountDownLatch(1);
        this.zadt = new java.util.ArrayList<>();
        this.zadv = new java.util.concurrent.atomic.AtomicReference<>();
        this.zaeb = false;
        this.zadq = new com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : android.os.Looper.getMainLooper());
        this.zadr = new java.lang.ref.WeakReference<>(googleApiClient);
    }

    @java.lang.Deprecated
    protected BasePendingResult(android.os.Looper looper) {
        this.zadp = new java.lang.Object();
        this.zads = new java.util.concurrent.CountDownLatch(1);
        this.zadt = new java.util.ArrayList<>();
        this.zadv = new java.util.concurrent.atomic.AtomicReference<>();
        this.zaeb = false;
        this.zadq = new com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<>(looper);
        this.zadr = new java.lang.ref.WeakReference<>(null);
    }

    protected BasePendingResult(com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> callbackHandler) {
        this.zadp = new java.lang.Object();
        this.zads = new java.util.concurrent.CountDownLatch(1);
        this.zadt = new java.util.ArrayList<>();
        this.zadv = new java.util.concurrent.atomic.AtomicReference<>();
        this.zaeb = false;
        this.zadq = (com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler) com.google.android.gms.common.internal.Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadr = new java.lang.ref.WeakReference<>(null);
    }

    public final boolean isReady() {
        return this.zads.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await() {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("await must not be called on the UI thread");
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zadw, "Result has already been consumed");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zaea == null, "Cannot await if then() has been called.");
        try {
            this.zads.await();
        } catch (java.lang.InterruptedException unused) {
            zab(com.google.android.gms.common.api.Status.RESULT_INTERRUPTED);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) get();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final R await(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zadw, "Result has already been consumed.");
        com.google.android.gms.common.internal.Preconditions.checkState(this.zaea == null, "Cannot await if then() has been called.");
        try {
            if (!this.zads.await(j, timeUnit)) {
                zab(com.google.android.gms.common.api.Status.RESULT_TIMEOUT);
            }
        } catch (java.lang.InterruptedException unused) {
            zab(com.google.android.gms.common.api.Status.RESULT_INTERRUPTED);
        }
        com.google.android.gms.common.internal.Preconditions.checkState(isReady(), "Result is not ready.");
        return (R) get();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback) {
        synchronized (this.zadp) {
            try {
                if (resultCallback == null) {
                    this.zadu = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.Preconditions.checkState(!this.zadw, "Result has already been consumed.");
                if (this.zaea != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zadq.zaa(resultCallback, get());
                } else {
                    this.zadu = resultCallback;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> resultCallback, long j, java.util.concurrent.TimeUnit timeUnit) {
        synchronized (this.zadp) {
            try {
                if (resultCallback == null) {
                    this.zadu = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.Preconditions.checkState(!this.zadw, "Result has already been consumed.");
                if (this.zaea != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zadq.zaa(resultCallback, get());
                } else {
                    this.zadu = resultCallback;
                    com.google.android.gms.common.api.internal.BasePendingResult.CallbackHandler<R> callbackHandler = this.zadq;
                    callbackHandler.sendMessageDelayed(callbackHandler.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statusListener) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zadp) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zadt.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public void cancel() {
        synchronized (this.zadp) {
            if (!this.zadx && !this.zadw) {
                com.google.android.gms.common.internal.ICancelToken iCancelToken = this.zadz;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (android.os.RemoteException unused) {
                    }
                }
                zab(this.zacl);
                this.zadx = true;
                zaa(createFailedResult(com.google.android.gms.common.api.Status.RESULT_CANCELED));
            }
        }
    }

    public final boolean zaq() {
        boolean zIsCanceled;
        synchronized (this.zadp) {
            if (this.zadr.get() == null || !this.zaeb) {
                cancel();
            }
            zIsCanceled = isCanceled();
        }
        return zIsCanceled;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public boolean isCanceled() {
        boolean z;
        synchronized (this.zadp) {
            z = this.zadx;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        com.google.android.gms.common.api.TransformedResult<S> transformedResultThen;
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zadw, "Result has already been consumed.");
        synchronized (this.zadp) {
            com.google.android.gms.common.internal.Preconditions.checkState(this.zaea == null, "Cannot call then() twice.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zadu == null, "Cannot call then() if callbacks are set.");
            com.google.android.gms.common.internal.Preconditions.checkState(this.zadx ? false : true, "Cannot call then() if result was canceled.");
            this.zaeb = true;
            this.zaea = new com.google.android.gms.common.api.internal.zack<>(this.zadr);
            transformedResultThen = this.zaea.then(resultTransform);
            if (isReady()) {
                this.zadq.zaa(this.zaea, get());
            } else {
                this.zadu = this.zaea;
            }
        }
        return transformedResultThen;
    }

    public final void setResult(R r) {
        synchronized (this.zadp) {
            if (this.zady || this.zadx) {
                zab(r);
                return;
            }
            isReady();
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.zadw) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Result has already been consumed");
            zaa(r);
        }
    }

    public final void zab(com.google.android.gms.common.api.Status status) {
        synchronized (this.zadp) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zady = true;
            }
        }
    }

    public final void zaa(com.google.android.gms.common.api.internal.zacq zacqVar) {
        this.zadv.set(zacqVar);
    }

    protected final void setCancelToken(com.google.android.gms.common.internal.ICancelToken iCancelToken) {
        synchronized (this.zadp) {
            this.zadz = iCancelToken;
        }
    }

    public final void zar() {
        this.zaeb = this.zaeb || zado.get().booleanValue();
    }

    private final R get() {
        R r;
        synchronized (this.zadp) {
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zadw, "Result has already been consumed.");
            com.google.android.gms.common.internal.Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zacl;
            this.zacl = null;
            this.zadu = null;
            this.zadw = true;
        }
        com.google.android.gms.common.api.internal.zacq andSet = this.zadv.getAndSet(null);
        if (andSet != null) {
            andSet.zab(this);
        }
        return r;
    }

    private final void zaa(R r) {
        this.zacl = r;
        com.google.android.gms.common.api.internal.zao zaoVar = null;
        this.zadz = null;
        this.zads.countDown();
        this.mStatus = this.zacl.getStatus();
        if (this.zadx) {
            this.zadu = null;
        } else if (this.zadu == null) {
            if (this.zacl instanceof com.google.android.gms.common.api.Releasable) {
                this.mResultGuardian = new com.google.android.gms.common.api.internal.BasePendingResult.zaa(this, zaoVar);
            }
        } else {
            this.zadq.removeMessages(2);
            this.zadq.zaa(this.zadu, get());
        }
        java.util.ArrayList<com.google.android.gms.common.api.PendingResult.StatusListener> arrayList = this.zadt;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            com.google.android.gms.common.api.PendingResult.StatusListener statusListener = arrayList.get(i);
            i++;
            statusListener.onComplete(this.mStatus);
        }
        this.zadt.clear();
    }

    public static void zab(com.google.android.gms.common.api.Result result) {
        if (result instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) result).release();
            } catch (java.lang.RuntimeException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(result);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                android.util.Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}
