package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends com.google.android.gms.common.api.internal.RegisterListenerMethod<com.google.android.gms.internal.location.zzaz, com.google.android.gms.location.LocationCallback> {
    private final /* synthetic */ com.google.android.gms.internal.location.zzbd zzy;
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzn(com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.internal.location.zzbd zzbdVar, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.zzy = zzbdVar;
        this.zzz = listenerHolder2;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final /* synthetic */ void registerListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.location.zzaz) anyClient).zza(this.zzy, this.zzz, new com.google.android.gms.location.FusedLocationProviderClient.zza(taskCompletionSource));
    }
}
