package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbb implements java.lang.Runnable {
    private final long zza;
    private final android.os.PowerManager.WakeLock zzb;
    private final com.google.firebase.iid.FirebaseInstanceId zzc;

    zzbb(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, long j) {
        this.zzc = firebaseInstanceId;
        this.zza = j;
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) zza().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.zzb = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.google.firebase.iid.zzaw.zza().zza(zza())) {
            this.zzb.acquire();
        }
        try {
            this.zzc.zza(true);
            if (!this.zzc.zzf()) {
                this.zzc.zza(false);
            } else if (com.google.firebase.iid.zzaw.zza().zzb(zza()) && !zzb()) {
                new com.google.firebase.iid.zzba(this).zza();
            } else {
                if (zzc()) {
                    this.zzc.zza(false);
                } else {
                    this.zzc.zza(this.zza);
                }
            }
        } catch (java.io.IOException e) {
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            android.util.Log.e("FirebaseInstanceId", sb.toString());
            this.zzc.zza(false);
        } finally {
            if (com.google.firebase.iid.zzaw.zza().zza(zza())) {
                this.zzb.release();
            }
        }
    }

    private final boolean zzc() throws java.io.IOException {
        com.google.firebase.iid.zzay zzayVarZzb = this.zzc.zzb();
        boolean z = true;
        if (!this.zzc.zza(zzayVarZzb)) {
            return true;
        }
        try {
            java.lang.String strZzc = this.zzc.zzc();
            if (strZzc == null) {
                android.util.Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                android.util.Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((zzayVarZzb == null || (zzayVarZzb != null && !strZzc.equals(zzayVarZzb.zza))) && com.google.firebase.FirebaseApp.DEFAULT_APP_NAME.equals(this.zzc.zza().getName())) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    java.lang.String strValueOf = java.lang.String.valueOf(this.zzc.zza().getName());
                    android.util.Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(strValueOf) : new java.lang.String("Invoking onNewToken for app: "));
                }
                android.content.Intent intent = new android.content.Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", strZzc);
                android.content.Context contextZza = zza();
                android.content.Intent intent2 = new android.content.Intent(contextZza, (java.lang.Class<?>) com.google.firebase.iid.FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                contextZza.sendBroadcast(intent2);
            }
            return true;
        } catch (java.io.IOException e) {
            java.lang.String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                java.lang.String message2 = e.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                android.util.Log.w("FirebaseInstanceId", sb.toString());
                return false;
            }
            if (e.getMessage() == null) {
                android.util.Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            throw e;
        } catch (java.lang.SecurityException unused) {
            android.util.Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    final android.content.Context zza() {
        return this.zzc.zza().getApplicationContext();
    }

    final boolean zzb() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) zza().getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
