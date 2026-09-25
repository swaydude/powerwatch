package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzft extends com.google.android.gms.measurement.internal.zzhi {
    static final android.util.Pair<java.lang.String, java.lang.Long> zza = new android.util.Pair<>("", 0L);
    private boolean zzaa;
    private long zzab;
    public com.google.android.gms.measurement.internal.zzfx zzb;
    public final com.google.android.gms.measurement.internal.zzfy zzc;
    public final com.google.android.gms.measurement.internal.zzfy zzd;
    public final com.google.android.gms.measurement.internal.zzfy zze;
    public final com.google.android.gms.measurement.internal.zzfy zzf;
    public final com.google.android.gms.measurement.internal.zzfy zzg;
    public final com.google.android.gms.measurement.internal.zzfy zzh;
    public final com.google.android.gms.measurement.internal.zzfy zzi;
    public final com.google.android.gms.measurement.internal.zzga zzj;
    public final com.google.android.gms.measurement.internal.zzfy zzk;
    public final com.google.android.gms.measurement.internal.zzfy zzl;
    public final com.google.android.gms.measurement.internal.zzfv zzm;
    public final com.google.android.gms.measurement.internal.zzga zzn;
    public final com.google.android.gms.measurement.internal.zzfv zzo;
    public final com.google.android.gms.measurement.internal.zzfv zzp;
    public final com.google.android.gms.measurement.internal.zzfy zzq;
    public final com.google.android.gms.measurement.internal.zzfy zzr;
    public boolean zzs;
    public com.google.android.gms.measurement.internal.zzfv zzt;
    public com.google.android.gms.measurement.internal.zzfv zzu;
    public com.google.android.gms.measurement.internal.zzfy zzv;
    public final com.google.android.gms.measurement.internal.zzga zzw;
    private android.content.SharedPreferences zzy;
    private java.lang.String zzz;

    final android.util.Pair<java.lang.String, java.lang.Boolean> zza(java.lang.String str) {
        zzd();
        long jElapsedRealtime = zzm().elapsedRealtime();
        if (this.zzz != null && jElapsedRealtime < this.zzab) {
            return new android.util.Pair<>(this.zzz, java.lang.Boolean.valueOf(this.zzaa));
        }
        this.zzab = jElapsedRealtime + zzt().zza(str, com.google.android.gms.measurement.internal.zzap.zza);
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(zzn());
            if (advertisingIdInfo != null) {
                this.zzz = advertisingIdInfo.getId();
                this.zzaa = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.zzz == null) {
                this.zzz = "";
            }
        } catch (java.lang.Exception e) {
            zzr().zzw().zza("Unable to get advertising id", e);
            this.zzz = "";
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new android.util.Pair<>(this.zzz, java.lang.Boolean.valueOf(this.zzaa));
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final boolean zze() {
        return true;
    }

    final java.lang.String zzb(java.lang.String str) {
        zzd();
        java.lang.String str2 = (java.lang.String) zza(str).first;
        java.security.MessageDigest messageDigestZzi = com.google.android.gms.measurement.internal.zzla.zzi();
        if (messageDigestZzi == null) {
            return null;
        }
        return java.lang.String.format(java.util.Locale.US, "%032X", new java.math.BigInteger(1, messageDigestZzi.digest(str2.getBytes())));
    }

    zzft(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzc = new com.google.android.gms.measurement.internal.zzfy(this, "last_upload", 0L);
        this.zzd = new com.google.android.gms.measurement.internal.zzfy(this, "last_upload_attempt", 0L);
        this.zze = new com.google.android.gms.measurement.internal.zzfy(this, "backoff", 0L);
        this.zzf = new com.google.android.gms.measurement.internal.zzfy(this, "last_delete_stale", 0L);
        this.zzk = new com.google.android.gms.measurement.internal.zzfy(this, "time_before_start", 10000L);
        this.zzl = new com.google.android.gms.measurement.internal.zzfy(this, "session_timeout", 1800000L);
        this.zzm = new com.google.android.gms.measurement.internal.zzfv(this, "start_new_session", true);
        this.zzq = new com.google.android.gms.measurement.internal.zzfy(this, "last_pause_time", 0L);
        this.zzr = new com.google.android.gms.measurement.internal.zzfy(this, "time_active", 0L);
        this.zzn = new com.google.android.gms.measurement.internal.zzga(this, "non_personalized_ads", null);
        this.zzo = new com.google.android.gms.measurement.internal.zzfv(this, "use_dynamite_api", false);
        this.zzp = new com.google.android.gms.measurement.internal.zzfv(this, "allow_remote_dynamite", false);
        this.zzg = new com.google.android.gms.measurement.internal.zzfy(this, "midnight_offset", 0L);
        this.zzh = new com.google.android.gms.measurement.internal.zzfy(this, "first_open_time", 0L);
        this.zzi = new com.google.android.gms.measurement.internal.zzfy(this, "app_install_time", 0L);
        this.zzj = new com.google.android.gms.measurement.internal.zzga(this, "app_instance_id", null);
        this.zzt = new com.google.android.gms.measurement.internal.zzfv(this, "app_backgrounded", false);
        this.zzu = new com.google.android.gms.measurement.internal.zzfv(this, "deep_link_retrieval_complete", false);
        this.zzv = new com.google.android.gms.measurement.internal.zzfy(this, "deep_link_retrieval_attempts", 0L);
        this.zzw = new com.google.android.gms.measurement.internal.zzga(this, "firebase_feature_rollouts", null);
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final void f_() {
        android.content.SharedPreferences sharedPreferences = zzn().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzy = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzs = z;
        if (!z) {
            android.content.SharedPreferences.Editor editorEdit = this.zzy.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.zzb = new com.google.android.gms.measurement.internal.zzfx(this, "health_monitor", java.lang.Math.max(0L, com.google.android.gms.measurement.internal.zzap.zzb.zza(null).longValue()));
    }

    protected final android.content.SharedPreferences zzg() {
        zzd();
        zzaa();
        return this.zzy;
    }

    final void zzc(java.lang.String str) {
        zzd();
        android.content.SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    final java.lang.String zzh() {
        zzd();
        return zzg().getString("gmp_app_id", null);
    }

    final void zzd(java.lang.String str) {
        zzd();
        android.content.SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final java.lang.String zzi() {
        zzd();
        return zzg().getString("admob_app_id", null);
    }

    final java.lang.Boolean zzj() {
        zzd();
        if (zzg().contains("use_service")) {
            return java.lang.Boolean.valueOf(zzg().getBoolean("use_service", false));
        }
        return null;
    }

    final void zza(boolean z) {
        zzd();
        android.content.SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    final void zzk() {
        zzd();
        java.lang.Boolean boolZzv = zzv();
        android.content.SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolZzv != null) {
            zzb(boolZzv.booleanValue());
        }
    }

    final void zzb(boolean z) {
        zzd();
        android.content.SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("measurement_enabled", z);
        editorEdit.apply();
    }

    final java.lang.Boolean zzv() {
        zzd();
        if (zzg().contains("measurement_enabled")) {
            return java.lang.Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final java.lang.String zzw() {
        zzd();
        java.lang.String string = zzg().getString("previous_os_version", null);
        zzl().zzaa();
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (!android.text.TextUtils.isEmpty(str) && !str.equals(string)) {
            android.content.SharedPreferences.Editor editorEdit = zzg().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final void zzc(boolean z) {
        zzd();
        zzr().zzx().zza("App measurement setting deferred collection", java.lang.Boolean.valueOf(z));
        android.content.SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final boolean zzx() {
        return this.zzy.contains("deferred_analytics_collection");
    }

    final boolean zza(long j) {
        return j - this.zzl.zza() > this.zzq.zza();
    }
}
