package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzab {
    private static final long zza = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
    private final com.google.firebase.iid.FirebaseInstanceId zzb;
    private final android.content.Context zzc;
    private final com.google.firebase.iid.zzao zzd;
    private final com.google.firebase.iid.zzt zze;
    private final java.util.concurrent.ScheduledExecutorService zzg;
    private final com.google.firebase.messaging.zzy zzi;
    private final java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> zzf = new androidx.collection.ArrayMap();
    private boolean zzh = false;

    static com.google.android.gms.tasks.Task<com.google.firebase.messaging.zzab> zza(com.google.firebase.FirebaseApp firebaseApp, final com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, final com.google.firebase.iid.zzao zzaoVar, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, final android.content.Context context, java.util.concurrent.Executor executor, final java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        final com.google.firebase.iid.zzt zztVar = new com.google.firebase.iid.zzt(firebaseApp, zzaoVar, executor, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
        return com.google.android.gms.tasks.Tasks.call(scheduledExecutorService, new java.util.concurrent.Callable(context, scheduledExecutorService, firebaseInstanceId, zzaoVar, zztVar) { // from class: com.google.firebase.messaging.zzaa
            private final android.content.Context zza;
            private final java.util.concurrent.ScheduledExecutorService zzb;
            private final com.google.firebase.iid.FirebaseInstanceId zzc;
            private final com.google.firebase.iid.zzao zzd;
            private final com.google.firebase.iid.zzt zze;

            {
                this.zza = context;
                this.zzb = scheduledExecutorService;
                this.zzc = firebaseInstanceId;
                this.zzd = zzaoVar;
                this.zze = zztVar;
            }

            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.messaging.zzab.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
    }

    private zzab(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, com.google.firebase.iid.zzao zzaoVar, com.google.firebase.messaging.zzy zzyVar, com.google.firebase.iid.zzt zztVar, android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzb = firebaseInstanceId;
        this.zzd = zzaoVar;
        this.zzi = zzyVar;
        this.zze = zztVar;
        this.zzc = context;
        this.zzg = scheduledExecutorService;
    }

    final com.google.android.gms.tasks.Task<java.lang.Void> zza(com.google.firebase.messaging.zzz zzzVar) {
        java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> arrayDeque;
        this.zzi.zza(zzzVar);
        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource<>();
        synchronized (this.zzf) {
            java.lang.String strZzc = zzzVar.zzc();
            if (this.zzf.containsKey(strZzc)) {
                arrayDeque = this.zzf.get(strZzc);
            } else {
                java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> arrayDeque2 = new java.util.ArrayDeque<>();
                this.zzf.put(strZzc, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
        return taskCompletionSource.getTask();
    }

    final void zza() {
        if (!(this.zzi.zza() != null) || zzc()) {
            return;
        }
        zza(0L);
    }

    final void zza(long j) {
        zza(new com.google.firebase.messaging.zzad(this, this.zzc, this.zzd, java.lang.Math.min(java.lang.Math.max(30L, j << 1), zza)), j);
        zza(true);
    }

    final void zza(java.lang.Runnable runnable, long j) {
        this.zzg.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
    }

    final boolean zzb() throws java.io.IOException {
        while (true) {
            synchronized (this) {
                com.google.firebase.messaging.zzz zzzVarZza = this.zzi.zza();
                if (zzzVarZza == null) {
                    if (zzd()) {
                        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                if (!zzb(zzzVarZza)) {
                    return false;
                }
                this.zzi.zzb(zzzVarZza);
                synchronized (this.zzf) {
                    java.lang.String strZzc = zzzVarZza.zzc();
                    if (this.zzf.containsKey(strZzc)) {
                        java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> arrayDeque = this.zzf.get(strZzc);
                        com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSourcePoll = arrayDeque.poll();
                        if (taskCompletionSourcePoll != null) {
                            taskCompletionSourcePoll.setResult(null);
                        }
                        if (arrayDeque.isEmpty()) {
                            this.zzf.remove(strZzc);
                        }
                    }
                }
            }
        }
    }

    private final boolean zzb(com.google.firebase.messaging.zzz zzzVar) throws java.io.IOException {
        try {
            java.lang.String strZzb = zzzVar.zzb();
            byte b = -1;
            int iHashCode = strZzb.hashCode();
            if (iHashCode != 83) {
                if (iHashCode == 85 && strZzb.equals("U")) {
                    b = 1;
                }
            } else if (strZzb.equals("S")) {
                b = 0;
            }
            if (b == 0) {
                java.lang.String strZza = zzzVar.zza();
                com.google.firebase.iid.InstanceIdResult instanceIdResult = (com.google.firebase.iid.InstanceIdResult) zza(this.zzb.getInstanceId());
                zza(this.zze.zzc(instanceIdResult.getId(), instanceIdResult.getToken(), strZza));
                if (zzd()) {
                    java.lang.String strZza2 = zzzVar.zza();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZza2).length() + 31);
                    sb.append("Subscribe to topic: ");
                    sb.append(strZza2);
                    sb.append(" succeeded.");
                    android.util.Log.d("FirebaseMessaging", sb.toString());
                }
            } else if (b == 1) {
                java.lang.String strZza3 = zzzVar.zza();
                com.google.firebase.iid.InstanceIdResult instanceIdResult2 = (com.google.firebase.iid.InstanceIdResult) zza(this.zzb.getInstanceId());
                zza(this.zze.zzd(instanceIdResult2.getId(), instanceIdResult2.getToken(), strZza3));
                if (zzd()) {
                    java.lang.String strZza4 = zzzVar.zza();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strZza4).length() + 35);
                    sb2.append("Unsubscribe from topic: ");
                    sb2.append(strZza4);
                    sb2.append(" succeeded.");
                    android.util.Log.d("FirebaseMessaging", sb2.toString());
                }
            } else if (zzd()) {
                java.lang.String strValueOf = java.lang.String.valueOf(zzzVar);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 24);
                sb3.append("Unknown topic operation");
                sb3.append(strValueOf);
                sb3.append(".");
                android.util.Log.d("FirebaseMessaging", sb3.toString());
            }
            return true;
        } catch (java.io.IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 53);
                sb4.append("Topic operation failed: ");
                sb4.append(message);
                sb4.append(". Will retry Topic operation.");
                android.util.Log.e("FirebaseMessaging", sb4.toString());
                return false;
            }
            if (e.getMessage() == null) {
                android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            throw e;
        }
    }

    private static <T> T zza(com.google.android.gms.tasks.Task<T> task) throws java.io.IOException {
        try {
            return (T) com.google.android.gms.tasks.Tasks.await(task, 30L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            e = e;
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause instanceof java.io.IOException) {
                throw ((java.io.IOException) cause);
            }
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.io.IOException(e2);
        } catch (java.util.concurrent.TimeoutException e3) {
            e = e3;
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private final synchronized boolean zzc() {
        return this.zzh;
    }

    final synchronized void zza(boolean z) {
        this.zzh = z;
    }

    private static boolean zzd() {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT == 23 && android.util.Log.isLoggable("FirebaseMessaging", 3);
    }

    static final /* synthetic */ com.google.firebase.messaging.zzab zza(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, com.google.firebase.iid.zzao zzaoVar, com.google.firebase.iid.zzt zztVar) throws java.lang.Exception {
        return new com.google.firebase.messaging.zzab(firebaseInstanceId, zzaoVar, com.google.firebase.messaging.zzy.zza(context, scheduledExecutorService), zztVar, context, scheduledExecutorService);
    }
}
