package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class RecordingClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.RecordingApi zzie = new com.google.android.gms.internal.fitness.zzdr();

    protected RecordingClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzai.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    RecordingClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzai.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzie.subscribe(asGoogleApiClient(), dataType));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> subscribe(com.google.android.gms.fitness.data.DataSource dataSource) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzie.subscribe(asGoogleApiClient(), dataSource));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzie.unsubscribe(asGoogleApiClient(), dataType));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.fitness.data.DataSource dataSource) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzie.unsubscribe(asGoogleApiClient(), dataSource));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribe(com.google.android.gms.fitness.data.Subscription subscription) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzie.unsubscribe(asGoogleApiClient(), subscription));
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Subscription>> listSubscriptions() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzie.listSubscriptions(asGoogleApiClient()), com.google.android.gms.fitness.zzm.zzho);
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Subscription>> listSubscriptions(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzie.listSubscriptions(asGoogleApiClient(), dataType), com.google.android.gms.fitness.zzl.zzho);
    }
}
