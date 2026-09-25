package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzah extends com.google.android.gms.measurement.internal.zzhi {
    private long zza;
    private java.lang.String zzb;
    private java.lang.Boolean zzc;
    private android.accounts.AccountManager zzd;
    private java.lang.Boolean zze;
    private long zzf;

    zzah(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final boolean zze() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.zza = java.util.concurrent.TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), java.util.concurrent.TimeUnit.MILLISECONDS);
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String lowerCase = locale.getLanguage().toLowerCase(java.util.Locale.ENGLISH);
        java.lang.String lowerCase2 = locale.getCountry().toLowerCase(java.util.Locale.ENGLISH);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(lowerCase).length() + 1 + java.lang.String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.zzb = sb.toString();
        return false;
    }

    public final long zzf() {
        zzaa();
        return this.zza;
    }

    public final java.lang.String zzg() {
        zzaa();
        return this.zzb;
    }

    public final boolean zza(android.content.Context context) {
        if (this.zzc == null) {
            zzu();
            this.zzc = false;
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.zzc = true;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        return this.zzc.booleanValue();
    }

    final long zzh() {
        zzd();
        return this.zzf;
    }

    final void zzi() {
        zzd();
        this.zze = null;
        this.zzf = 0L;
    }

    final boolean zzj() {
        zzd();
        long jCurrentTimeMillis = zzm().currentTimeMillis();
        if (jCurrentTimeMillis - this.zzf > 86400000) {
            this.zze = null;
        }
        java.lang.Boolean bool = this.zze;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(zzn(), "android.permission.GET_ACCOUNTS") != 0) {
            zzr().zzj().zza("Permission error checking for dasher/unicorn accounts");
            this.zzf = jCurrentTimeMillis;
            this.zze = false;
            return false;
        }
        if (this.zzd == null) {
            this.zzd = android.accounts.AccountManager.get(zzn());
        }
        try {
            android.accounts.Account[] result = this.zzd.getAccountsByTypeAndFeatures("com.google", new java.lang.String[]{"service_HOSTED"}, null, null).getResult();
            if (result != null && result.length > 0) {
                this.zze = true;
                this.zzf = jCurrentTimeMillis;
                return true;
            }
            android.accounts.Account[] result2 = this.zzd.getAccountsByTypeAndFeatures("com.google", new java.lang.String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.zze = true;
                this.zzf = jCurrentTimeMillis;
                return true;
            }
            this.zzf = jCurrentTimeMillis;
            this.zze = false;
            return false;
        } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e) {
            zzr().zzg().zza("Exception checking account types", e);
        }
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
