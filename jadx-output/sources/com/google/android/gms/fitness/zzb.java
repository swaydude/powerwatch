package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzb implements com.google.android.gms.common.api.internal.RemoteCall<com.google.android.gms.internal.fitness.zzn, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzhq;
    private final /* synthetic */ java.util.List zzhr;
    private final /* synthetic */ int zzhs;

    zzb(com.google.android.gms.fitness.BleClient bleClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, java.util.List list, int i) {
        this.zzhq = listenerHolder;
        this.zzhr = list;
        this.zzhs = i;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(com.google.android.gms.internal.fitness.zzn zznVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzbr) zznVar.getService()).zza(new com.google.android.gms.fitness.request.StartBleScanRequest((java.util.List<com.google.android.gms.fitness.data.DataType>) this.zzhr, (com.google.android.gms.fitness.request.zzaf) com.google.android.gms.fitness.request.zzc.zzx().zza(this.zzhq), this.zzhs, (com.google.android.gms.internal.fitness.zzcm) com.google.android.gms.internal.fitness.zzel.zza(taskCompletionSource)));
    }
}
