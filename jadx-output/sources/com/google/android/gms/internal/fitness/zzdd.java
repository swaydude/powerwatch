package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdd extends com.google.android.gms.internal.fitness.zzbk {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.DataTypeResult> zzmv;

    private zzdd(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.DataTypeResult> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbl
    public final void zza(com.google.android.gms.fitness.result.DataTypeResult dataTypeResult) {
        this.zzmv.setResult(dataTypeResult);
    }

    /* synthetic */ zzdd(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.fitness.zzcy zzcyVar) {
        this(resultHolder);
    }
}
