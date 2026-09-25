package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SensorsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.SensorsApi zzif = new com.google.android.gms.internal.fitness.zzdw();

    protected SensorsClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzao.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    SensorsClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzao.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.DataSource>> findDataSources(com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzif.findDataSources(asGoogleApiClient(), dataSourcesRequest), com.google.android.gms.fitness.zzo.zzho);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> add(com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(onDataPointListener, com.google.android.gms.fitness.request.OnDataPointListener.class.getSimpleName());
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new com.google.android.gms.fitness.zzp(this, listenerHolderRegisterListener, sensorRequest)).unregister(new com.google.android.gms.fitness.zzn(this, listenerHolderRegisterListener)).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> add(com.google.android.gms.fitness.request.SensorRequest sensorRequest, android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzif.add(asGoogleApiClient(), sensorRequest, pendingIntent));
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> remove(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(onDataPointListener, com.google.android.gms.fitness.request.OnDataPointListener.class.getSimpleName()));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> remove(android.app.PendingIntent pendingIntent) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzif.remove(asGoogleApiClient(), pendingIntent));
    }
}
