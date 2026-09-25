package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbh implements android.content.ServiceConnection {
    private final android.content.Context zza;
    private final android.content.Intent zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private final java.util.Queue<com.google.firebase.iid.zzbg> zzd;
    private com.google.firebase.iid.zzbc zze;
    private boolean zzf;

    public zzbh(android.content.Context context, java.lang.String str) {
        this(context, str, new java.util.concurrent.ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private zzbh(android.content.Context context, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzd = new java.util.ArrayDeque();
        this.zzf = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = new android.content.Intent(str).setPackage(applicationContext.getPackageName());
        this.zzc = scheduledExecutorService;
    }

    public final synchronized com.google.android.gms.tasks.Task<java.lang.Void> zza(android.content.Intent intent) {
        final com.google.firebase.iid.zzbg zzbgVar;
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        zzbgVar = new com.google.firebase.iid.zzbg(intent);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.zzc;
        final java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new java.lang.Runnable(zzbgVar) { // from class: com.google.firebase.iid.zzbj
            private final com.google.firebase.iid.zzbg zza;

            {
                this.zza = zzbgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc();
            }
        }, 9000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        zzbgVar.zza().addOnCompleteListener(scheduledExecutorService, new com.google.android.gms.tasks.OnCompleteListener(scheduledFutureSchedule) { // from class: com.google.firebase.iid.zzbi
            private final java.util.concurrent.ScheduledFuture zza;

            {
                this.zza = scheduledFutureSchedule;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.cancel(false);
            }
        });
        this.zzd.add(zzbgVar);
        zza();
        return zzbgVar.zza();
    }

    private final synchronized void zza() {
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "flush queue called");
        }
        while (!this.zzd.isEmpty()) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                android.util.Log.d("FirebaseInstanceId", "found intent to be delivered");
            }
            com.google.firebase.iid.zzbc zzbcVar = this.zze;
            if (zzbcVar != null && zzbcVar.isBinderAlive()) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    android.util.Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                }
                this.zze.zza(this.zzd.poll());
            } else {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    boolean z = !this.zzf;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    android.util.Log.d("FirebaseInstanceId", sb.toString());
                }
                if (!this.zzf) {
                    this.zzf = true;
                    try {
                        if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.zza, this.zzb, this, 65)) {
                            return;
                        } else {
                            android.util.Log.e("FirebaseInstanceId", "binding to the service failed");
                        }
                    } catch (java.lang.SecurityException e) {
                        android.util.Log.e("FirebaseInstanceId", "Exception while binding the service", e);
                    }
                    this.zzf = false;
                    zzb();
                }
                return;
            }
        }
    }

    private final void zzb() {
        while (!this.zzd.isEmpty()) {
            this.zzd.poll().zzb();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(componentName);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(strValueOf);
            android.util.Log.d("FirebaseInstanceId", sb.toString());
        }
        this.zzf = false;
        if (!(iBinder instanceof com.google.firebase.iid.zzbc)) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(iBinder);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(strValueOf2);
            android.util.Log.e("FirebaseInstanceId", sb2.toString());
            zzb();
            return;
        }
        this.zze = (com.google.firebase.iid.zzbc) iBinder;
        zza();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(componentName);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            android.util.Log.d("FirebaseInstanceId", sb.toString());
        }
        zza();
    }
}
