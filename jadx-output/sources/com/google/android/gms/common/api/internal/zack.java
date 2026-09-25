package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zack<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> implements com.google.android.gms.common.api.ResultCallback<R> {
    private final java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> zadr;
    private final com.google.android.gms.common.api.internal.zacm zakw;
    private com.google.android.gms.common.api.ResultTransform<? super R, ? extends com.google.android.gms.common.api.Result> zakr = null;
    private com.google.android.gms.common.api.internal.zack<? extends com.google.android.gms.common.api.Result> zaks = null;
    private volatile com.google.android.gms.common.api.ResultCallbacks<? super R> zakt = null;
    private com.google.android.gms.common.api.PendingResult<R> zaku = null;
    private final java.lang.Object zadp = new java.lang.Object();
    private com.google.android.gms.common.api.Status zakv = null;
    private boolean zakx = false;

    public zack(java.lang.ref.WeakReference<com.google.android.gms.common.api.GoogleApiClient> weakReference) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zadr = weakReference;
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = weakReference.get();
        this.zakw = new com.google.android.gms.common.api.internal.zacm(this, googleApiClient != null ? googleApiClient.getLooper() : android.os.Looper.getMainLooper());
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> resultTransform) {
        com.google.android.gms.common.api.internal.zack<? extends com.google.android.gms.common.api.Result> zackVar;
        synchronized (this.zadp) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zakr == null, "Cannot call then() twice.");
            if (this.zakt != null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakr = resultTransform;
            zackVar = new com.google.android.gms.common.api.internal.zack<>(this.zadr);
            this.zaks = zackVar;
            zabs();
        }
        return zackVar;
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zadp) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zakt == null, "Cannot call andFinally() twice.");
            if (this.zakr != null) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakt = resultCallbacks;
            zabs();
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        synchronized (this.zadp) {
            if (r.getStatus().isSuccess()) {
                if (this.zakr != null) {
                    com.google.android.gms.common.api.internal.zacb.zaaz().submit(new com.google.android.gms.common.api.internal.zacn(this, r));
                } else if (zabu()) {
                    this.zakt.onSuccess(r);
                }
            } else {
                zad(r.getStatus());
                zab(r);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(com.google.android.gms.common.api.PendingResult<?> pendingResult) {
        synchronized (this.zadp) {
            this.zaku = pendingResult;
            zabs();
        }
    }

    private final void zabs() {
        if (this.zakr == null && this.zakt == null) {
            return;
        }
        com.google.android.gms.common.api.GoogleApiClient googleApiClient = this.zadr.get();
        if (!this.zakx && this.zakr != null && googleApiClient != null) {
            googleApiClient.zaa(this);
            this.zakx = true;
        }
        com.google.android.gms.common.api.Status status = this.zakv;
        if (status != null) {
            zae(status);
            return;
        }
        com.google.android.gms.common.api.PendingResult<R> pendingResult = this.zaku;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad(com.google.android.gms.common.api.Status status) {
        synchronized (this.zadp) {
            this.zakv = status;
            zae(status);
        }
    }

    private final void zae(com.google.android.gms.common.api.Status status) {
        synchronized (this.zadp) {
            com.google.android.gms.common.api.ResultTransform<? super R, ? extends com.google.android.gms.common.api.Result> resultTransform = this.zakr;
            if (resultTransform != null) {
                com.google.android.gms.common.api.Status statusOnFailure = resultTransform.onFailure(status);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(statusOnFailure, "onFailure must not return null");
                this.zaks.zad(statusOnFailure);
            } else if (zabu()) {
                this.zakt.onFailure(status);
            }
        }
    }

    final void zabt() {
        this.zakt = null;
    }

    private final boolean zabu() {
        return (this.zakt == null || this.zadr.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zab(com.google.android.gms.common.api.Result result) {
        if (result instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) result).release();
            } catch (java.lang.RuntimeException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(result);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                android.util.Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }
}
