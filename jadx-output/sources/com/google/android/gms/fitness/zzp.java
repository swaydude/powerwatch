package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzp implements com.google.android.gms.common.api.internal.RemoteCall<com.google.android.gms.internal.fitness.zzao, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder zzhq;
    private final /* synthetic */ com.google.android.gms.fitness.request.SensorRequest zzig;

    zzp(com.google.android.gms.fitness.SensorsClient sensorsClient, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.fitness.request.SensorRequest sensorRequest) {
        this.zzhq = listenerHolder;
        this.zzig = sensorRequest;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(com.google.android.gms.internal.fitness.zzao zzaoVar, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.fitness.zzcb) zzaoVar.getService()).zza(new com.google.android.gms.fitness.request.zzao(this.zzig, com.google.android.gms.fitness.request.zzam.zzaa().zzc(this.zzhq), null, com.google.android.gms.internal.fitness.zzel.zza(taskCompletionSource)));
    }
}
