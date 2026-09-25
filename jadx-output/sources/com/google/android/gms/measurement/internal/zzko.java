package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzko extends com.google.android.gms.measurement.internal.zzkp {
    private final android.app.AlarmManager zzb;
    private final com.google.android.gms.measurement.internal.zzaf zzc;
    private java.lang.Integer zzd;

    protected zzko(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar);
        this.zzb = (android.app.AlarmManager) zzn().getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        this.zzc = new com.google.android.gms.measurement.internal.zzkn(this, zzksVar.zzs(), zzksVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        this.zzb.cancel(zzw());
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzk();
        return false;
    }

    private final void zzk() {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) zzn().getSystemService("jobscheduler");
        int iZzv = zzv();
        if (!zzx()) {
            zzr().zzx().zza("Cancelling job. JobID", java.lang.Integer.valueOf(iZzv));
        }
        jobScheduler.cancel(iZzv);
    }

    public final void zza(long j) {
        zzak();
        zzu();
        android.content.Context contextZzn = zzn();
        if (!com.google.android.gms.measurement.internal.zzge.zza(contextZzn)) {
            zzr().zzw().zza("Receiver not registered/enabled");
        }
        if (!com.google.android.gms.measurement.internal.zzla.zza(contextZzn, false)) {
            zzr().zzw().zza("Service not registered/enabled");
        }
        zzf();
        if (zzx()) {
            zzr().zzx().zza("Scheduling upload, millis", java.lang.Long.valueOf(j));
        }
        long jElapsedRealtime = zzm().elapsedRealtime() + j;
        if (j < java.lang.Math.max(0L, com.google.android.gms.measurement.internal.zzap.zzw.zza(null).longValue()) && !this.zzc.zzb()) {
            if (!zzx()) {
                zzr().zzx().zza("Scheduling upload with DelayedRunnable");
            }
            this.zzc.zza(j);
        }
        zzu();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            if (!zzx()) {
                zzr().zzx().zza("Scheduling upload with JobScheduler");
            }
            android.content.Context contextZzn2 = zzn();
            android.content.ComponentName componentName = new android.content.ComponentName(contextZzn2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iZzv = zzv();
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            android.app.job.JobInfo jobInfoBuild = new android.app.job.JobInfo.Builder(iZzv, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            if (!zzx()) {
                zzr().zzx().zza("Scheduling job. JobID", java.lang.Integer.valueOf(iZzv));
            }
            com.google.android.gms.internal.measurement.zzh.zza(contextZzn2, jobInfoBuild, "com.google.android.gms", "UploadAlarm");
            return;
        }
        if (!zzx()) {
            zzr().zzx().zza("Scheduling upload with AlarmManager");
        }
        this.zzb.setInexactRepeating(2, jElapsedRealtime, java.lang.Math.max(com.google.android.gms.measurement.internal.zzap.zzr.zza(null).longValue(), j), zzw());
    }

    private final int zzv() {
        if (this.zzd == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(zzn().getPackageName());
            this.zzd = java.lang.Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new java.lang.String("measurement")).hashCode());
        }
        return this.zzd.intValue();
    }

    public final void zzf() {
        zzak();
        if (zzx()) {
            zzr().zzx().zza("Unscheduling upload");
        }
        this.zzb.cancel(zzw());
        this.zzc.zzc();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            zzk();
        }
    }

    private final android.app.PendingIntent zzw() {
        android.content.Context contextZzn = zzn();
        return android.app.PendingIntent.getBroadcast(contextZzn, 0, new android.content.Intent().setClassName(contextZzn, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    private final boolean zzx() {
        return com.google.android.gms.internal.measurement.zzky.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzkw zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzn e_() {
        return super.e_();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzac zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgi zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ android.content.Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfi zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzft zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzw zzu() {
        return super.zzu();
    }
}
