package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzo implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    static final com.google.android.gms.common.internal.PendingResultUtil.ResultConverter zzho = new com.google.android.gms.fitness.zzo();

    private zzo() {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.fitness.result.DataSourcesResult) result).getDataSources();
    }
}
