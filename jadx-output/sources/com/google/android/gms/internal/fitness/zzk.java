package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk extends com.google.android.gms.internal.fitness.zzbj {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.DataSourcesResult> zzmv;

    public zzk(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.DataSourcesResult> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbg
    public final void zza(com.google.android.gms.fitness.result.DataSourcesResult dataSourcesResult) {
        this.zzmv.setResult(dataSourcesResult);
    }
}
