package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface BleApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.BleDevicesResult> listClaimedBleDevices(com.google.android.gms.common.api.GoogleApiClient googleApiClient);

    @java.lang.Deprecated
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> stopBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);
}
