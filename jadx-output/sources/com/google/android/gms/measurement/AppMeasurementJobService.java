package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends android.app.job.JobService implements com.google.android.gms.measurement.internal.zzjz {
    private com.google.android.gms.measurement.internal.zzjv<com.google.android.gms.measurement.AppMeasurementJobService> zza;

    private final com.google.android.gms.measurement.internal.zzjv<com.google.android.gms.measurement.AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzjv<>(this);
        }
        return this.zza;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void zza(android.content.Intent intent) {
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        return zza().zza(jobParameters);
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
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjz
    public final void zza(android.app.job.JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
