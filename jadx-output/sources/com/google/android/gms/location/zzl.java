package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.location.zzaz, android.location.Location> {
    zzl(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient) {
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<android.location.Location> taskCompletionSource) throws android.os.RemoteException {
        taskCompletionSource.setResult(((com.google.android.gms.internal.location.zzaz) anyClient).getLastLocation());
    }
}
