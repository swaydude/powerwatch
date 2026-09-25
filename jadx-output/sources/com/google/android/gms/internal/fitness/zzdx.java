package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdx extends com.google.android.gms.internal.fitness.zzce {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.ListSubscriptionsResult> zzmv;

    private zzdx(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.ListSubscriptionsResult> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzcf
    public final void zza(com.google.android.gms.fitness.result.ListSubscriptionsResult listSubscriptionsResult) {
        this.zzmv.setResult(listSubscriptionsResult);
    }

    /* synthetic */ zzdx(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.fitness.zzdq zzdqVar) {
        this(resultHolder);
    }
}
