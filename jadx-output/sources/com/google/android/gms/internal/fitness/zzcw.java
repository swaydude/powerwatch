package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcw extends com.google.android.gms.internal.fitness.zzeo {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.BleDevicesResult> zzmv;

    private zzcw(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.fitness.result.BleDevicesResult> resultHolder) {
        this.zzmv = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzep
    public final void zza(com.google.android.gms.fitness.result.BleDevicesResult bleDevicesResult) {
        this.zzmv.setResult(bleDevicesResult);
    }

    /* synthetic */ zzcw(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.internal.fitness.zzcq zzcqVar) {
        this(resultHolder);
    }
}
