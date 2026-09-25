package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface RecordingApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.ListSubscriptionsResult> listSubscriptions(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.ListSubscriptionsResult> listSubscriptions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> subscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataSource dataSource);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.DataType dataType);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unsubscribe(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Subscription subscription);
}
