package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzem implements com.google.android.gms.fitness.BleApi {
    public static final com.google.android.gms.common.api.Status zzoe = new com.google.android.gms.common.api.Status(com.google.android.gms.fitness.FitnessStatusCodes.UNSUPPORTED_PLATFORM);

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zzoe, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> stopBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zzoe, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zzoe, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zzoe, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zzoe, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.api.PendingResults.immediatePendingResult(zzoe, googleApiClient);
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.BleDevicesResult> listClaimedBleDevices(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return com.google.android.gms.common.api.PendingResults.immediateFailedResult(com.google.android.gms.fitness.result.BleDevicesResult.zzb(zzoe), googleApiClient);
    }
}
