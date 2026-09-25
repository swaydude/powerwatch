package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzej extends com.google.android.gms.internal.fitness.zzcj {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.SessionReadResult> zzmv;

    private zzej(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.SessionReadResult> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzcg
    public final void zza(com.google.android.gms.fitness.result.SessionReadResult sessionReadResult) {
        this.zzmv.setResult(sessionReadResult);
    }

    /* synthetic */ zzej(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.fitness.zzed zzedVar) {
        this(resultHolder);
    }
}
