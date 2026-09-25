package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdw implements com.google.android.gms.fitness.SensorsApi {
    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.DataSourcesResult> findDataSources(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.DataSourcesRequest dataSourcesRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdz(this, googleApiClient, dataSourcesRequest));
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> add(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        return zza(googleApiClient, sensorRequest, com.google.android.gms.fitness.request.zzam.zzaa().zza(onDataPointListener, googleApiClient.getLooper()), null);
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> add(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, android.app.PendingIntent pendingIntent) {
        return zza(googleApiClient, sensorRequest, null, pendingIntent);
    }

    private final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SensorRequest sensorRequest, com.google.android.gms.fitness.data.zzu zzuVar, android.app.PendingIntent pendingIntent) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdy(this, googleApiClient, sensorRequest, zzuVar, pendingIntent));
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> remove(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        com.google.android.gms.fitness.request.zzak zzakVarZzb = com.google.android.gms.fitness.request.zzam.zzaa().zzb(onDataPointListener, googleApiClient.getLooper());
        if (zzakVarZzb == null) {
            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient);
        }
        return zza(googleApiClient, zzakVarZzb, null);
    }

    @Override // com.google.android.gms.fitness.SensorsApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> remove(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return zza(googleApiClient, null, pendingIntent);
    }

    private final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.zzu zzuVar, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzeb(this, googleApiClient, zzuVar, pendingIntent));
    }
}
