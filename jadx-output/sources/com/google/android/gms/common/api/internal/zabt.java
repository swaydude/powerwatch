package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class zabt extends com.google.android.gms.common.api.internal.zak {
    private com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zajs;

    public static com.google.android.gms.common.api.internal.zabt zac(android.app.Activity activity) {
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        com.google.android.gms.common.api.internal.zabt zabtVar = (com.google.android.gms.common.api.internal.zabt) fragment.getCallbackOrNull("GmsAvailabilityHelper", com.google.android.gms.common.api.internal.zabt.class);
        if (zabtVar == null) {
            return new com.google.android.gms.common.api.internal.zabt(fragment);
        }
        if (zabtVar.zajs.getTask().isComplete()) {
            zabtVar.zajs = new com.google.android.gms.tasks.TaskCompletionSource<>();
        }
        return zabtVar;
    }

    private zabt(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zajs = new com.google.android.gms.tasks.TaskCompletionSource<>();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.zak
    protected final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        this.zajs.setException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(new com.google.android.gms.common.api.Status(connectionResult.getErrorCode(), connectionResult.getErrorMessage(), connectionResult.getResolution())));
    }

    @Override // com.google.android.gms.common.api.internal.zak
    protected final void zam() {
        android.app.Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        if (lifecycleActivity == null) {
            this.zajs.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.zace.isGooglePlayServicesAvailable(lifecycleActivity);
        if (iIsGooglePlayServicesAvailable == 0) {
            this.zajs.trySetResult(null);
        } else {
            if (this.zajs.getTask().isComplete()) {
                return;
            }
            zab(new com.google.android.gms.common.ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onDestroy() {
        super.onDestroy();
        this.zajs.trySetException(new java.util.concurrent.CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final com.google.android.gms.tasks.Task<java.lang.Void> getTask() {
        return this.zajs.getTask();
    }
}
