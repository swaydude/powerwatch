package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
final class zzo extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<com.google.android.gms.internal.location.zzaz, com.google.android.gms.location.LocationCallback> {
    private final /* synthetic */ com.google.android.gms.location.FusedLocationProviderClient zzaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzo(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zzaa = fusedLocationProviderClient;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final /* synthetic */ void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        try {
            ((com.google.android.gms.internal.location.zzaz) anyClient).zzb(getListenerKey(), this.zzaa.zza(taskCompletionSource));
        } catch (java.lang.RuntimeException e) {
            taskCompletionSource.trySetException(e);
        }
    }
}
