package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdr implements com.google.android.gms.fitness.RecordingApi {
    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.ListSubscriptionsResult> listSubscriptions(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdq(this, googleApiClient));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.ListSubscriptionsResult> listSubscriptions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzdt(this, googleApiClient, dataType));
    }

    private final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zza(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Subscription subscription) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzds(this, googleApiClient, subscription));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return zza(googleApiClient, new com.google.android.gms.fitness.data.Subscription.zza().zza(dataType).zzv());
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource) {
        return zza(googleApiClient, new com.google.android.gms.fitness.data.Subscription.zza().zza(dataSource).zzv());
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzdv(this, googleApiClient, dataType));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzdu(this, googleApiClient, dataSource));
    }

    @Override // com.google.android.gms.fitness.RecordingApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Subscription subscription) {
        if (subscription.getDataType() == null) {
            return unsubscribe(googleApiClient, subscription.getDataSource());
        }
        return unsubscribe(googleApiClient, subscription.getDataType());
    }
}
