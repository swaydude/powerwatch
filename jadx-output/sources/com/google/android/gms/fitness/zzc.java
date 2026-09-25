package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements com.google.android.gms.common.api.internal.RemoteCall<com.google.android.gms.internal.fitness.zzn, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzhq;

    zzc(com.google.android.gms.fitness.BleClient bleClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zzhq = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(com.google.android.gms.internal.fitness.zzn zznVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.fitness.zzn zznVar2 = zznVar;
        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource2 = taskCompletionSource;
        com.google.android.gms.fitness.request.zzb zzbVarZzb = com.google.android.gms.fitness.request.zzc.zzx().zzb(this.zzhq);
        if (zzbVarZzb == null) {
            taskCompletionSource2.setResult(false);
        } else {
            ((com.google.android.gms.internal.fitness.zzbr) zznVar2.getService()).zza(new com.google.android.gms.fitness.request.zzbi((com.google.android.gms.fitness.request.zzaf) zzbVarZzb, (com.google.android.gms.internal.fitness.zzcm) com.google.android.gms.internal.fitness.zzel.zzb(taskCompletionSource2)));
        }
    }
}
