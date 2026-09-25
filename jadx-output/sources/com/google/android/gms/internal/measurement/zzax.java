package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzax extends com.google.android.gms.internal.measurement.zzx.zza {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzhn zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzax(com.google.android.gms.internal.measurement.zzx zzxVar, com.google.android.gms.measurement.internal.zzhn zzhnVar) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = zzhnVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws android.os.RemoteException {
        android.util.Pair pair;
        int i = 0;
        while (true) {
            if (i >= this.zzd.zzf.size()) {
                pair = null;
                break;
            } else {
                if (this.zzc.equals(((android.util.Pair) this.zzd.zzf.get(i)).first)) {
                    pair = (android.util.Pair) this.zzd.zzf.get(i);
                    break;
                }
                i++;
            }
        }
        if (pair == null) {
            android.util.Log.w(this.zzd.zzc, "OnEventListener had not been registered.");
        } else {
            this.zzd.zzr.unregisterOnMeasurementEventListener((com.google.android.gms.internal.measurement.zzs) pair.second);
            this.zzd.zzf.remove(pair);
        }
    }
}
