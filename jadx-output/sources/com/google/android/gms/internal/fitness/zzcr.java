package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcr implements com.google.android.gms.fitness.BleApi {
    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.StartBleScanRequest startBleScanRequest) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzcq(this, googleApiClient, startBleScanRequest, com.google.android.gms.fitness.request.zzc.zzx().zza(startBleScanRequest.zzad(), googleApiClient.getLooper())));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> stopBleScan(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        com.google.android.gms.fitness.request.zzb zzbVarZzb = com.google.android.gms.fitness.request.zzc.zzx().zzb(bleScanCallback, googleApiClient.getLooper());
        if (zzbVarZzb == null) {
            return com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS, googleApiClient);
        }
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzct(this, googleApiClient, zzbVarZzb));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcs(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> claimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcv(this, googleApiClient, bleDevice));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.execute(new com.google.android.gms.internal.fitness.zzcu(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unclaimBleDevice(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return unclaimBleDevice(googleApiClient, bleDevice.getAddress());
    }

    @Override // com.google.android.gms.fitness.BleApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.BleDevicesResult> listClaimedBleDevices(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.fitness.zzcx(this, googleApiClient));
    }
}
