package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjv<T extends android.content.Context & com.google.android.gms.measurement.internal.zzjz> {
    private final T zza;

    public zzjv(T t) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(t);
        this.zza = t;
    }

    public final void zza() {
        com.google.android.gms.measurement.internal.zzgo zzgoVarZza = com.google.android.gms.measurement.internal.zzgo.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        com.google.android.gms.measurement.internal.zzfk zzfkVarZzr = zzgoVarZza.zzr();
        zzgoVarZza.zzu();
        zzfkVarZzr.zzx().zza("Local AppMeasurementService is starting up");
    }

    public final void zzb() {
        com.google.android.gms.measurement.internal.zzgo zzgoVarZza = com.google.android.gms.measurement.internal.zzgo.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        com.google.android.gms.measurement.internal.zzfk zzfkVarZzr = zzgoVarZza.zzr();
        zzgoVarZza.zzu();
        zzfkVarZzr.zzx().zza("Local AppMeasurementService is shutting down");
    }

    public final int zza(final android.content.Intent intent, int i, final int i2) {
        com.google.android.gms.measurement.internal.zzgo zzgoVarZza = com.google.android.gms.measurement.internal.zzgo.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        final com.google.android.gms.measurement.internal.zzfk zzfkVarZzr = zzgoVarZza.zzr();
        if (intent == null) {
            zzfkVarZzr.zzi().zza("AppMeasurementService started with null intent");
            return 2;
        }
        java.lang.String action = intent.getAction();
        zzgoVarZza.zzu();
        zzfkVarZzr.zzx().zza("Local AppMeasurementService called. startId, action", java.lang.Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new java.lang.Runnable(this, i2, zzfkVarZzr, intent) { // from class: com.google.android.gms.measurement.internal.zzjy
                private final com.google.android.gms.measurement.internal.zzjv zza;
                private final int zzb;
                private final com.google.android.gms.measurement.internal.zzfk zzc;
                private final android.content.Intent zzd;

                {
                    this.zza = this;
                    this.zzb = i2;
                    this.zzc = zzfkVarZzr;
                    this.zzd = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(this.zzb, this.zzc, this.zzd);
                }
            });
        }
        return 2;
    }

    private final void zza(java.lang.Runnable runnable) {
        com.google.android.gms.measurement.internal.zzks zzksVarZza = com.google.android.gms.measurement.internal.zzks.zza(this.zza);
        zzksVarZza.zzq().zza(new com.google.android.gms.measurement.internal.zzka(this, zzksVarZza, runnable));
    }

    public final android.os.IBinder zza(android.content.Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onBind called with null intent");
            return null;
        }
        java.lang.String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new com.google.android.gms.measurement.internal.zzgp(com.google.android.gms.measurement.internal.zzks.zza(this.zza));
        }
        zzc().zzi().zza("onBind received unknown action", action);
        return null;
    }

    public final boolean zzb(android.content.Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzx().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final boolean zza(final android.app.job.JobParameters jobParameters) {
        com.google.android.gms.measurement.internal.zzgo zzgoVarZza = com.google.android.gms.measurement.internal.zzgo.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        final com.google.android.gms.measurement.internal.zzfk zzfkVarZzr = zzgoVarZza.zzr();
        java.lang.String string = jobParameters.getExtras().getString("action");
        zzgoVarZza.zzu();
        zzfkVarZzr.zzx().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza(new java.lang.Runnable(this, zzfkVarZzr, jobParameters) { // from class: com.google.android.gms.measurement.internal.zzjx
            private final com.google.android.gms.measurement.internal.zzjv zza;
            private final com.google.android.gms.measurement.internal.zzfk zzb;
            private final android.app.job.JobParameters zzc;

            {
                this.zza = this;
                this.zzb = zzfkVarZzr;
                this.zzc = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(this.zzb, this.zzc);
            }
        });
        return true;
    }

    public final void zzc(android.content.Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onRebind called with null intent");
        } else {
            zzc().zzx().zza("onRebind called. action", intent.getAction());
        }
    }

    private final com.google.android.gms.measurement.internal.zzfk zzc() {
        return com.google.android.gms.measurement.internal.zzgo.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null).zzr();
    }

    final /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzfk zzfkVar, android.app.job.JobParameters jobParameters) {
        zzfkVar.zzx().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    final /* synthetic */ void zza(int i, com.google.android.gms.measurement.internal.zzfk zzfkVar, android.content.Intent intent) {
        if (this.zza.zza(i)) {
            zzfkVar.zzx().zza("Local AppMeasurementService processed last upload request. StartId", java.lang.Integer.valueOf(i));
            zzc().zzx().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }
}
