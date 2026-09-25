package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzei extends com.google.android.gms.internal.fitness.zzck {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.SessionStopResult> zzmv;

    private zzei(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.SessionStopResult> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzcl
    public final void zza(com.google.android.gms.fitness.result.SessionStopResult sessionStopResult) {
        this.zzmv.setResult(sessionStopResult);
    }

    /* synthetic */ zzei(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.fitness.zzed zzedVar) {
        this(resultHolder);
    }
}
