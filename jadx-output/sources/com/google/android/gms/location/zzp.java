package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
final class zzp extends com.google.android.gms.internal.location.zzak {
    private final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzab;

    zzp(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzab = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzaj
    public final void zza(com.google.android.gms.internal.location.zzad zzadVar) throws android.os.RemoteException {
        com.google.android.gms.common.api.Status status = zzadVar.getStatus();
        if (status == null) {
            this.zzab.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, "Got null status from location service")));
        } else if (status.getStatusCode() == 0) {
            this.zzab.setResult(true);
        } else {
            this.zzab.trySetException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status));
        }
    }
}
