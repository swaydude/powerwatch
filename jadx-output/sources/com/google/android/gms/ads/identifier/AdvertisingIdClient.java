package com.google.android.gms.ads.identifier;

/* JADX INFO: loaded from: classes.dex */
@javax.annotation.ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    private final android.content.Context mContext;
    private com.google.android.gms.common.BlockingServiceConnection zze;
    private com.google.android.gms.internal.ads_identifier.zze zzf;
    private boolean zzg;
    private final java.lang.Object zzh;
    private com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzi;
    private final boolean zzj;
    private final long zzk;

    public static final class Info {
        private final java.lang.String zzq;
        private final boolean zzr;

        public Info(java.lang.String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final java.lang.String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.zzq;
            boolean z = this.zzr;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class zza extends java.lang.Thread {
        private java.lang.ref.WeakReference<com.google.android.gms.ads.identifier.AdvertisingIdClient> zzm;
        private long zzn;
        java.util.concurrent.CountDownLatch zzo = new java.util.concurrent.CountDownLatch(1);
        boolean zzp = false;

        public zza(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, long j) {
            this.zzm = new java.lang.ref.WeakReference<>(advertisingIdClient);
            this.zzn = j;
            start();
        }

        private final void disconnect() {
            com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = this.zzm.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzp = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.zzo.await(this.zzn, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    return;
                }
                disconnect();
            } catch (java.lang.InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(android.content.Context context) {
        this(context, 30000L, false, false);
    }

    private AdvertisingIdClient(android.content.Context context, long j, boolean z, boolean z2) {
        android.content.Context applicationContext;
        this.zzh = new java.lang.Object();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        com.google.android.gms.ads.identifier.zzb zzbVar = new com.google.android.gms.ads.identifier.zzb(context);
        boolean z = zzbVar.getBoolean("gads:ad_id_app_context:enabled", false);
        float f = zzbVar.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
        java.lang.String string = zzbVar.getString("gads:ad_id_use_shared_preference:experiment_id", "");
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, z, zzbVar.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info, z, f, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, string, null);
            advertisingIdClient.finish();
            return info;
        } catch (java.lang.Throwable th) {
            try {
                advertisingIdClient.zza(null, z, f, -1L, string, th);
                throw th;
            } catch (java.lang.Throwable th2) {
                advertisingIdClient.finish();
                throw th2;
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context context) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        com.google.android.gms.ads.identifier.zzb zzbVar = new com.google.android.gms.ads.identifier.zzb(context);
        com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient = new com.google.android.gms.ads.identifier.AdvertisingIdClient(context, -1L, zzbVar.getBoolean("gads:ad_id_app_context:enabled", false), zzbVar.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static com.google.android.gms.common.BlockingServiceConnection zza(android.content.Context context, boolean z) throws com.google.android.gms.common.GooglePlayServicesRepairableException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
            if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                throw new java.io.IOException("Google Play services not available");
            }
            java.lang.String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.GOOGLE_PLAY_SERVICES_INTENT;
            com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection = new com.google.android.gms.common.BlockingServiceConnection();
            android.content.Intent intent = new android.content.Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                    return blockingServiceConnection;
                }
                throw new java.io.IOException("Connection failure");
            } catch (java.lang.Throwable th) {
                throw new java.io.IOException(th);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(9);
        }
    }

    private static com.google.android.gms.internal.ads_identifier.zze zza(android.content.Context context, com.google.android.gms.common.BlockingServiceConnection blockingServiceConnection) throws java.io.IOException {
        try {
            return com.google.android.gms.internal.ads_identifier.zzf.zza(blockingServiceConnection.getServiceWithTimeout(10000L, java.util.concurrent.TimeUnit.MILLISECONDS));
        } catch (java.lang.InterruptedException unused) {
            throw new java.io.IOException("Interrupted exception");
        } catch (java.lang.Throwable th) {
            throw new java.io.IOException(th);
        }
    }

    private final void zza() {
        synchronized (this.zzh) {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzaVar = this.zzi;
            if (zzaVar != null) {
                zzaVar.zzo.countDown();
                try {
                    this.zzi.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            if (this.zzk > 0) {
                this.zzi = new com.google.android.gms.ads.identifier.AdvertisingIdClient.zza(this, this.zzk);
            }
        }
    }

    private final void zza(boolean z) throws com.google.android.gms.common.GooglePlayServicesRepairableException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            com.google.android.gms.common.BlockingServiceConnection blockingServiceConnectionZza = zza(this.mContext, this.zzj);
            this.zze = blockingServiceConnectionZza;
            this.zzf = zza(this.mContext, blockingServiceConnectionZza);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info, boolean z, float f, long j, java.lang.String str, java.lang.Throwable th) {
        if (java.lang.Math.random() > f) {
            return false;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("app_context", z ? "1" : "0");
        if (info != null) {
            map.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (info != null && info.getId() != null) {
            map.put("ad_id_size", java.lang.Integer.toString(info.getId().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", java.lang.Long.toString(j));
        new com.google.android.gms.ads.identifier.zza(this, map).start();
        return true;
    }

    private final boolean zzb() throws java.io.IOException {
        boolean zZzc;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf);
                zZzc = this.zzf.zzc();
            } else {
                synchronized (this.zzh) {
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzaVar = this.zzi;
                    if (zzaVar == null || !zzaVar.zzp) {
                        throw new java.io.IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf);
                    try {
                        zZzc = this.zzf.zzc();
                    } catch (android.os.RemoteException e) {
                        android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new java.io.IOException("Remote exception");
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        zza();
        return zZzc;
    }

    protected void finalize() throws java.lang.Throwable {
        finish();
        super.finalize();
    }

    public final void finish() {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.mContext == null || this.zze == null) {
                return;
            }
            try {
                if (this.zzg) {
                    com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.mContext, this.zze);
                }
            } catch (java.lang.Throwable th) {
                android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.zzg = false;
            this.zzf = null;
            this.zze = null;
        }
    }

    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() throws java.io.IOException {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf);
                info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(this.zzf.getId(), this.zzf.zzb(true));
            } else {
                synchronized (this.zzh) {
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.zza zzaVar = this.zzi;
                    if (zzaVar == null || !zzaVar.zzp) {
                        throw new java.io.IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze);
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzf);
                    try {
                        info = new com.google.android.gms.ads.identifier.AdvertisingIdClient.Info(this.zzf.getId(), this.zzf.zzb(true));
                    } catch (android.os.RemoteException e) {
                        android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new java.io.IOException("Remote exception");
                    }
                } catch (java.lang.Exception e2) {
                    throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        zza();
        return info;
    }

    public void start() throws com.google.android.gms.common.GooglePlayServicesRepairableException, java.lang.IllegalStateException, com.google.android.gms.common.GooglePlayServicesNotAvailableException, java.io.IOException {
        zza(true);
    }
}
