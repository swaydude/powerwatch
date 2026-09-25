package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {
    public ResolvableApiException(com.google.android.gms.common.api.Status status) {
        super(status);
    }

    public void startResolutionForResult(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        this.mStatus.startResolutionForResult(activity, i);
    }

    public android.app.PendingIntent getResolution() {
        return this.mStatus.getResolution();
    }
}
