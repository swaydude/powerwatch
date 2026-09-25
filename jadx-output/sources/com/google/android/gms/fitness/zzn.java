package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzn implements com.google.android.gms.common.api.internal.RemoteCall<com.google.android.gms.internal.fitness.zzao, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzhq;

    zzn(com.google.android.gms.fitness.SensorsClient sensorsClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zzhq = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(com.google.android.gms.internal.fitness.zzao zzaoVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.fitness.zzao zzaoVar2 = zzaoVar;
        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource2 = taskCompletionSource;
        com.google.android.gms.fitness.request.zzak zzakVarZzd = com.google.android.gms.fitness.request.zzam.zzaa().zzd(this.zzhq);
        if (zzakVarZzd == null) {
            taskCompletionSource2.setResult(false);
        } else {
            ((com.google.android.gms.internal.fitness.zzcb) zzaoVar2.getService()).zza(new com.google.android.gms.fitness.request.zzas((com.google.android.gms.fitness.data.zzu) zzakVarZzd, (android.app.PendingIntent) null, (com.google.android.gms.internal.fitness.zzcm) com.google.android.gms.internal.fitness.zzel.zzb(taskCompletionSource2)));
        }
    }
}
