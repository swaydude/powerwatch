package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzel extends com.google.android.gms.internal.fitness.zzcp {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> zzmv;

    public zzel(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzcm
    public final void onResult(com.google.android.gms.common.api.Status status) {
        this.zzmv.setResult(status);
    }

    public static com.google.android.gms.internal.fitness.zzel zza(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) {
        return new com.google.android.gms.internal.fitness.zzel(new com.google.android.gms.internal.fitness.zzek(taskCompletionSource));
    }

    public static com.google.android.gms.internal.fitness.zzel zzb(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) {
        return new com.google.android.gms.internal.fitness.zzel(new com.google.android.gms.internal.fitness.zzen(taskCompletionSource));
    }
}
