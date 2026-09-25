package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzh extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.common.api.Status, com.google.android.gms.internal.clearcut.zzj> {
    private final com.google.android.gms.clearcut.zze zzao;

    zzh(com.google.android.gms.clearcut.zze zzeVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.clearcut.ClearcutLogger.API, googleApiClient);
        this.zzao = zzeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.clearcut.zzj zzjVar = (com.google.android.gms.internal.clearcut.zzj) anyClient;
        com.google.android.gms.internal.clearcut.zzi zziVar = new com.google.android.gms.internal.clearcut.zzi(this);
        try {
            com.google.android.gms.clearcut.zze zzeVar = this.zzao;
            if (zzeVar.zzt != null && zzeVar.zzaa.zzbjp.length == 0) {
                zzeVar.zzaa.zzbjp = zzeVar.zzt.zza();
            }
            if (zzeVar.zzan != null && zzeVar.zzaa.zzbjw.length == 0) {
                zzeVar.zzaa.zzbjw = zzeVar.zzan.zza();
            }
            com.google.android.gms.internal.clearcut.zzha zzhaVar = zzeVar.zzaa;
            int iZzas = zzhaVar.zzas();
            byte[] bArr = new byte[iZzas];
            com.google.android.gms.internal.clearcut.zzfz.zza(zzhaVar, bArr, 0, iZzas);
            zzeVar.zzah = bArr;
            ((com.google.android.gms.internal.clearcut.zzn) zzjVar.getService()).zza(zziVar, this.zzao);
        } catch (java.lang.RuntimeException e) {
            android.util.Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            setFailedResult(new com.google.android.gms.common.api.Status(10, "MessageProducer"));
        }
    }
}
