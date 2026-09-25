package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
abstract class zzai extends com.google.android.gms.location.LocationServices.zza<com.google.android.gms.common.api.Status> {
    public zzai(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
