package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResultCallbacks<R extends com.google.android.gms.common.api.Result> implements com.google.android.gms.common.api.ResultCallback<R> {
    public abstract void onFailure(com.google.android.gms.common.api.Status status);

    public abstract void onSuccess(R r);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        com.google.android.gms.common.api.Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof com.google.android.gms.common.api.Releasable) {
            try {
                ((com.google.android.gms.common.api.Releasable) r).release();
            } catch (java.lang.RuntimeException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(r);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                android.util.Log.w("ResultCallbacks", sb.toString(), e);
            }
        }
    }
}
