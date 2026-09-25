package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends android.app.Service implements com.google.android.gms.measurement.internal.zzjz {
    private com.google.android.gms.measurement.internal.zzjv<com.google.android.gms.measurement.AppMeasurementService> zza;

    private final com.google.android.gms.measurement.internal.zzjv<com.google.android.gms.measurement.AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzjv<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        return zza().zza(intent, i, i2);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return zza().zza(intent);
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        return zza().zzb(intent);
    }

    @Override // android.app.Service
    public final void onRebind(android.content.Intent intent) {
        zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void zza(android.app.job.JobParameters jobParameters, boolean z) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void zza(android.content.Intent intent) {
        com.google.android.gms.measurement.AppMeasurementReceiver.completeWakefulIntent(intent);
    }
}
