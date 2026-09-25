package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdp extends com.google.android.gms.internal.fitness.zzbd {
    private final /* synthetic */ com.google.android.gms.internal.fitness.zzdm zznr;

    zzdp(com.google.android.gms.internal.fitness.zzdm zzdmVar) {
        this.zznr = zzdmVar;
    }

    @Override // com.google.android.gms.internal.fitness.zzba
    public final void zza(com.google.android.gms.fitness.result.DailyTotalResult dailyTotalResult) {
        this.zznr.setResult(dailyTotalResult);
    }
}
