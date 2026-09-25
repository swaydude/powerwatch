package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzf extends android.app.Service {
    private android.os.Binder zzb;
    private int zzd;
    private final java.util.concurrent.ExecutorService zza = com.google.android.gms.internal.firebase_messaging.zza.zza().zza(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Intent-Handle"), com.google.android.gms.internal.firebase_messaging.zzf.zzb);
    private final java.lang.Object zzc = new java.lang.Object();
    private int zze = 0;

    protected android.content.Intent zza(android.content.Intent intent) {
        return intent;
    }

    public boolean zzb(android.content.Intent intent) {
        return false;
    }

    public abstract void zzc(android.content.Intent intent);

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        if (android.util.Log.isLoggable("EnhancedIntentService", 3)) {
            android.util.Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.zzb == null) {
            this.zzb = new com.google.firebase.iid.zzbc(new com.google.firebase.iid.zzbe(this) { // from class: com.google.firebase.messaging.zze
                private final com.google.firebase.messaging.zzf zza;

                {
                    this.zza = this;
                }

                @Override // com.google.firebase.iid.zzbe
                public final com.google.android.gms.tasks.Task zza(android.content.Intent intent2) {
                    return this.zza.zzd(intent2);
                }
            });
        }
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.tasks.Task<java.lang.Void> zzd(final android.content.Intent intent) {
        if (zzb(intent)) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zza.execute(new java.lang.Runnable(this, intent, taskCompletionSource) { // from class: com.google.firebase.messaging.zzh
            private final com.google.firebase.messaging.zzf zza;
            private final android.content.Intent zzb;
            private final com.google.android.gms.tasks.TaskCompletionSource zzc;

            {
                this.zza = this;
                this.zzb = intent;
                this.zzc = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.zzf zzfVar = this.zza;
                android.content.Intent intent2 = this.zzb;
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = this.zzc;
                try {
                    zzfVar.zzc(intent2);
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // android.app.Service
    public final int onStartCommand(final android.content.Intent intent, int i, int i2) {
        synchronized (this.zzc) {
            this.zzd = i2;
            this.zze++;
        }
        android.content.Intent intentZza = zza(intent);
        if (intentZza == null) {
            zzf(intent);
            return 2;
        }
        com.google.android.gms.tasks.Task<java.lang.Void> taskZzd = zzd(intentZza);
        if (taskZzd.isComplete()) {
            zzf(intent);
            return 2;
        }
        taskZzd.addOnCompleteListener(com.google.firebase.messaging.zzg.zza, new com.google.android.gms.tasks.OnCompleteListener(this, intent) { // from class: com.google.firebase.messaging.zzj
            private final com.google.firebase.messaging.zzf zza;
            private final android.content.Intent zzb;

            {
                this.zza = this;
                this.zzb = intent;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.zza(this.zzb, task);
            }
        });
        return 3;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.zza.shutdown();
        super.onDestroy();
    }

    private final void zzf(android.content.Intent intent) {
        if (intent != null) {
            com.google.firebase.iid.zzbd.zza(intent);
        }
        synchronized (this.zzc) {
            int i = this.zze - 1;
            this.zze = i;
            if (i == 0) {
                stopSelfResult(this.zzd);
            }
        }
    }

    final /* synthetic */ void zza(android.content.Intent intent, com.google.android.gms.tasks.Task task) {
        zzf(intent);
    }
}
