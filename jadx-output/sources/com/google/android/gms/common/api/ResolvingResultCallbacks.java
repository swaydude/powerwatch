package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultCallbacks<R> {
    private final android.app.Activity mActivity;
    private final int zzao;

    protected ResolvingResultCallbacks(android.app.Activity activity, int i) {
        this.mActivity = (android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zzao = i;
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(R r);

    public abstract void onUnresolvableFailure(com.google.android.gms.common.api.Status status);

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public final void onFailure(com.google.android.gms.common.api.Status status) {
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(this.mActivity, this.zzao);
                return;
            } catch (android.content.IntentSender.SendIntentException e) {
                android.util.Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                onUnresolvableFailure(new com.google.android.gms.common.api.Status(8));
                return;
            }
        }
        onUnresolvableFailure(status);
    }
}
