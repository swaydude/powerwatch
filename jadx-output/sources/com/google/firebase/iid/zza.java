package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zza implements com.google.firebase.iid.zzb {
    private static final java.lang.Object zza = new java.lang.Object();
    private static com.google.firebase.iid.zzbh zzb;
    private final android.content.Context zzc;
    private final java.util.concurrent.ExecutorService zzd;

    public zza(android.content.Context context, java.util.concurrent.ExecutorService executorService) {
        this.zzc = context;
        this.zzd = executorService;
    }

    @Override // com.google.firebase.iid.zzb
    public final com.google.android.gms.tasks.Task<java.lang.Integer> zza(final android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", android.util.Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final android.content.Context context = this.zzc;
        boolean z = com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
        if (z && !z2) {
            return zzb(context, intent);
        }
        return com.google.android.gms.tasks.Tasks.call(this.zzd, new java.util.concurrent.Callable(context, intent) { // from class: com.google.firebase.iid.zzd
            private final android.content.Context zza;
            private final android.content.Intent zzb;

            {
                this.zza = context;
                this.zzb = intent;
            }

            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return java.lang.Integer.valueOf(com.google.firebase.iid.zzaw.zza().zza(this.zza, this.zzb));
            }
        }).continueWithTask(this.zzd, new com.google.android.gms.tasks.Continuation(context, intent) { // from class: com.google.firebase.iid.zzc
            private final android.content.Context zza;
            private final android.content.Intent zzb;

            {
                this.zza = context;
                this.zzb = intent;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.firebase.iid.zza.zza(this.zza, this.zzb, task);
            }
        });
    }

    private static com.google.android.gms.tasks.Task<java.lang.Integer> zzb(android.content.Context context, android.content.Intent intent) {
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            android.util.Log.d("FirebaseInstanceId", "Binding to service");
        }
        return zza(context, "com.google.firebase.MESSAGING_EVENT").zza(intent).continueWith(com.google.firebase.iid.zzh.zza(), com.google.firebase.iid.zzf.zza);
    }

    private static com.google.firebase.iid.zzbh zza(android.content.Context context, java.lang.String str) {
        com.google.firebase.iid.zzbh zzbhVar;
        synchronized (zza) {
            if (zzb == null) {
                zzb = new com.google.firebase.iid.zzbh(context, str);
            }
            zzbhVar = zzb;
        }
        return zzbhVar;
    }

    static final /* synthetic */ java.lang.Integer zza(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return -1;
    }

    static final /* synthetic */ com.google.android.gms.tasks.Task zza(android.content.Context context, android.content.Intent intent, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return (com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && ((java.lang.Integer) task.getResult()).intValue() == 402) ? zzb(context, intent).continueWith(com.google.firebase.iid.zzh.zza(), com.google.firebase.iid.zze.zza) : task;
    }

    static final /* synthetic */ java.lang.Integer zzb(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return 403;
    }
}
