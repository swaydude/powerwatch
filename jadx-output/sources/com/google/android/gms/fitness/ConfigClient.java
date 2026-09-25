package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class ConfigClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.ConfigApi zzht = new com.google.android.gms.internal.fitness.zzcz();

    protected ConfigClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzt.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    ConfigClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzt.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataType> createCustomDataType(com.google.android.gms.fitness.request.DataTypeCreateRequest dataTypeCreateRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzht.createCustomDataType(asGoogleApiClient(), dataTypeCreateRequest), com.google.android.gms.fitness.zze.zzho);
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.fitness.data.DataType> readDataType(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzht.readDataType(asGoogleApiClient(), str), com.google.android.gms.fitness.zzd.zzho);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> disableFit() {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzht.disableFit(asGoogleApiClient()));
    }
}
