package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class HistoryClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.HistoryApi zzhx = new com.google.android.gms.internal.fitness.zzdh();

    protected HistoryClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzac.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    HistoryClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzac.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.result.DataReadResponse> readData(com.google.android.gms.fitness.request.DataReadRequest dataReadRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(zzhx.readData(asGoogleApiClient(), dataReadRequest), new com.google.android.gms.fitness.result.DataReadResponse());
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataSet> readDailyTotal(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzhx.readDailyTotal(asGoogleApiClient(), dataType), com.google.android.gms.fitness.zzk.zzho);
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataSet> readDailyTotalFromLocalDevice(com.google.android.gms.fitness.data.DataType dataType) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzhx.readDailyTotalFromLocalDevice(asGoogleApiClient(), dataType), com.google.android.gms.fitness.zzj.zzho);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> insertData(com.google.android.gms.fitness.data.DataSet dataSet) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhx.insertData(asGoogleApiClient(), dataSet));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> deleteData(com.google.android.gms.fitness.request.DataDeleteRequest dataDeleteRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhx.deleteData(asGoogleApiClient(), dataDeleteRequest));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> updateData(com.google.android.gms.fitness.request.DataUpdateRequest dataUpdateRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhx.updateData(asGoogleApiClient(), dataUpdateRequest));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> registerDataUpdateListener(com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhx.registerDataUpdateListener(asGoogleApiClient(), dataUpdateListenerRegistrationRequest));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unregisterDataUpdateListener(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhx.unregisterDataUpdateListener(asGoogleApiClient(), pendingIntent));
    }
}
