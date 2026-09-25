package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzc {
    private final java.util.concurrent.Executor zza;
    private final android.content.Context zzb;
    private final com.google.firebase.messaging.zzt zzc;

    public zzc(android.content.Context context, com.google.firebase.messaging.zzt zztVar, java.util.concurrent.Executor executor) {
        this.zza = executor;
        this.zzb = context;
        this.zzc = zztVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[EDGE_INSN: B:20:0x0058->B:21:0x0059 BREAK  A[LOOP:0: B:13:0x0040->B:43:?]] */
    final boolean zza() {
        boolean z;
        if (this.zzc.zzb("gcm.n.noui")) {
            return true;
        }
        if (!((android.app.KeyguardManager) this.zzb.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
                android.os.SystemClock.sleep(10L);
            }
            int iMyPid = android.os.Process.myPid();
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) this.zzb.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                z = false;
                break;
            }
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        if (z) {
            return false;
        }
        com.google.firebase.messaging.zzq zzqVarZza = com.google.firebase.messaging.zzq.zza(this.zzc.zza("gcm.n.image"));
        if (zzqVarZza != null) {
            zzqVarZza.zza(this.zza);
        }
        com.google.firebase.messaging.zza zzaVarZza = com.google.firebase.messaging.zzb.zza(this.zzb, this.zzc);
        androidx.core.app.NotificationCompat.Builder builder = zzaVarZza.zza;
        if (zzqVarZza != null) {
            try {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.google.android.gms.tasks.Tasks.await(zzqVarZza.zza(), 5L, java.util.concurrent.TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon(null));
            } catch (java.lang.InterruptedException unused) {
                android.util.Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                zzqVarZza.close();
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.ExecutionException e) {
                java.lang.String strValueOf = java.lang.String.valueOf(e.getCause());
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 26);
                sb.append("Failed to download image: ");
                sb.append(strValueOf);
                android.util.Log.w("FirebaseMessaging", sb.toString());
            } catch (java.util.concurrent.TimeoutException unused2) {
                android.util.Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                zzqVarZza.close();
            }
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "Showing notification");
        }
        ((android.app.NotificationManager) this.zzb.getSystemService("notification")).notify(zzaVarZza.zzb, 0, zzaVarZza.zza.build());
        return true;
    }
}
