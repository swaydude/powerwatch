package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzad implements java.lang.Runnable {
    private static final java.lang.Object zzf = new java.lang.Object();
    private static java.lang.Boolean zzg;
    private static java.lang.Boolean zzh;
    private final android.content.Context zza;
    private final com.google.firebase.iid.zzao zzb;
    private final android.os.PowerManager.WakeLock zzc;
    private final com.google.firebase.messaging.zzab zzd;
    private final long zze;

    zzad(com.google.firebase.messaging.zzab zzabVar, android.content.Context context, com.google.firebase.iid.zzao zzaoVar, long j) {
        this.zzd = zzabVar;
        this.zza = context;
        this.zze = j;
        this.zzb = zzaoVar;
        this.zzc = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZza;
        if (zza(this.zza)) {
            this.zzc.acquire(com.google.firebase.messaging.zzd.zza);
        }
        try {
            boolean z = true;
            this.zzd.zza(true);
            if (!this.zzb.zza()) {
                this.zzd.zza(false);
                if (zZza) {
                    try {
                        return;
                    } catch (java.lang.RuntimeException unused) {
                        return;
                    }
                }
                return;
            }
            if (zzb(this.zza) && !zzb()) {
                com.google.firebase.messaging.zzac zzacVar = new com.google.firebase.messaging.zzac(this, this);
                if (!android.util.Log.isLoggable("FirebaseMessaging", 3) && (android.os.Build.VERSION.SDK_INT != 23 || !android.util.Log.isLoggable("FirebaseMessaging", 3))) {
                    z = false;
                }
                if (z) {
                    android.util.Log.d("FirebaseMessaging", "Connectivity change received registered");
                }
                zzacVar.zza.zza.registerReceiver(zzacVar, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (zZza) {
                    try {
                        return;
                    } catch (java.lang.RuntimeException unused2) {
                        return;
                    }
                }
                return;
            }
            if (this.zzd.zzb()) {
                this.zzd.zza(false);
            } else {
                this.zzd.zza(this.zze);
            }
        } catch (java.io.IOException e) {
            java.lang.String strValueOf = java.lang.String.valueOf(e.getMessage());
            android.util.Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new java.lang.String("Failed to sync topics. Won't retry sync. "));
            this.zzd.zza(false);
        } finally {
            if (zza(this.zza)) {
                try {
                    this.zzc.release();
                } catch (java.lang.RuntimeException unused3) {
                    android.util.Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzb() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.zza.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzc() {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT == 23 && android.util.Log.isLoggable("FirebaseMessaging", 3);
    }

    private static boolean zza(android.content.Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (zzf) {
            java.lang.Boolean bool = zzg;
            if (bool == null) {
                zBooleanValue = zza(context, "android.permission.WAKE_LOCK", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zBooleanValue);
            zzg = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean zzb(android.content.Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (zzf) {
            java.lang.Boolean bool = zzh;
            if (bool == null) {
                zBooleanValue = zza(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                zBooleanValue = bool.booleanValue();
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zBooleanValue);
            zzh = boolValueOf;
            zBooleanValue2 = boolValueOf.booleanValue();
        }
        return zBooleanValue2;
    }

    private static boolean zza(android.content.Context context, java.lang.String str, java.lang.Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 142);
            sb.append("Missing Permission: ");
            sb.append(str);
            sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            android.util.Log.d("FirebaseMessaging", sb.toString());
        }
        return z;
    }
}
