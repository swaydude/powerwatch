package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstanceId {
    private static com.google.firebase.iid.zzaz zzb;
    private static java.util.concurrent.ScheduledExecutorService zzd;
    private final java.util.concurrent.Executor zze;
    private final com.google.firebase.FirebaseApp zzf;
    private final com.google.firebase.iid.zzao zzg;
    private final com.google.firebase.iid.zzt zzh;
    private final com.google.firebase.iid.zzat zzi;
    private final com.google.firebase.installations.FirebaseInstallationsApi zzj;
    private boolean zzk;
    private final com.google.firebase.iid.FirebaseInstanceId.zza zzl;
    private static final long zza = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");

    public static com.google.firebase.iid.FirebaseInstanceId getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    public static com.google.firebase.iid.FirebaseInstanceId getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        zza(firebaseApp);
        return (com.google.firebase.iid.FirebaseInstanceId) firebaseApp.get(com.google.firebase.iid.FirebaseInstanceId.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
    class zza {
        private boolean zzb;
        private final com.google.firebase.events.Subscriber zzc;
        private boolean zzd;
        private com.google.firebase.events.EventHandler<com.google.firebase.DataCollectionDefaultChange> zze;
        private java.lang.Boolean zzf;

        zza(com.google.firebase.events.Subscriber subscriber) {
            this.zzc = subscriber;
        }

        private final synchronized void zzb() {
            if (this.zzd) {
                return;
            }
            this.zzb = zzd();
            java.lang.Boolean boolZzc = zzc();
            this.zzf = boolZzc;
            if (boolZzc == null && this.zzb) {
                com.google.firebase.events.EventHandler<com.google.firebase.DataCollectionDefaultChange> eventHandler = new com.google.firebase.events.EventHandler(this) { // from class: com.google.firebase.iid.zzq
                    private final com.google.firebase.iid.FirebaseInstanceId.zza zza;

                    {
                        this.zza = this;
                    }

                    @Override // com.google.firebase.events.EventHandler
                    public final void handle(com.google.firebase.events.Event event) {
                        com.google.firebase.iid.FirebaseInstanceId.zza zzaVar = this.zza;
                        synchronized (zzaVar) {
                            if (zzaVar.zza()) {
                                com.google.firebase.iid.FirebaseInstanceId.this.zzj();
                            }
                        }
                    }
                };
                this.zze = eventHandler;
                this.zzc.subscribe(com.google.firebase.DataCollectionDefaultChange.class, eventHandler);
            }
            this.zzd = true;
        }

        final synchronized boolean zza() {
            zzb();
            java.lang.Boolean bool = this.zzf;
            if (bool != null) {
                return bool.booleanValue();
            }
            return this.zzb && com.google.firebase.iid.FirebaseInstanceId.this.zzf.isDataCollectionDefaultEnabled();
        }

        final synchronized void zza(boolean z) {
            zzb();
            com.google.firebase.events.EventHandler<com.google.firebase.DataCollectionDefaultChange> eventHandler = this.zze;
            if (eventHandler != null) {
                this.zzc.unsubscribe(com.google.firebase.DataCollectionDefaultChange.class, eventHandler);
                this.zze = null;
            }
            android.content.SharedPreferences.Editor editorEdit = com.google.firebase.iid.FirebaseInstanceId.this.zzf.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            editorEdit.putBoolean("auto_init", z);
            editorEdit.apply();
            if (z) {
                com.google.firebase.iid.FirebaseInstanceId.this.zzj();
            }
            this.zzf = java.lang.Boolean.valueOf(z);
        }

        private final java.lang.Boolean zzc() {
            android.content.pm.ApplicationInfo applicationInfo;
            android.content.Context applicationContext = com.google.firebase.iid.FirebaseInstanceId.this.zzf.getApplicationContext();
            android.content.SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return java.lang.Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean zzd() {
            try {
                java.lang.Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (java.lang.ClassNotFoundException unused) {
                android.content.Context applicationContext = com.google.firebase.iid.FirebaseInstanceId.this.zzf.getApplicationContext();
                android.content.Intent intent = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                android.content.pm.ResolveInfo resolveInfoResolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                return (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) ? false : true;
            }
        }
    }

    FirebaseInstanceId(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.events.Subscriber subscriber, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, new com.google.firebase.iid.zzao(firebaseApp.getApplicationContext()), com.google.firebase.iid.zzh.zzb(), com.google.firebase.iid.zzh.zzb(), subscriber, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
    }

    private FirebaseInstanceId(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.zzao zzaoVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, com.google.firebase.events.Subscriber subscriber, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        this.zzk = false;
        if (com.google.firebase.iid.zzao.zza(firebaseApp) == null) {
            throw new java.lang.IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            if (zzb == null) {
                zzb = new com.google.firebase.iid.zzaz(firebaseApp.getApplicationContext());
            }
        }
        this.zzf = firebaseApp;
        this.zzg = zzaoVar;
        this.zzh = new com.google.firebase.iid.zzt(firebaseApp, zzaoVar, executor, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
        this.zze = executor2;
        this.zzl = new com.google.firebase.iid.FirebaseInstanceId.zza(subscriber);
        this.zzi = new com.google.firebase.iid.zzat(executor);
        this.zzj = firebaseInstallationsApi;
        executor2.execute(new java.lang.Runnable(this) { // from class: com.google.firebase.iid.zzl
            private final com.google.firebase.iid.FirebaseInstanceId zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj() {
        if (zza(zzb())) {
            zzk();
        }
    }

    final com.google.firebase.FirebaseApp zza() {
        return this.zzf;
    }

    final synchronized void zza(boolean z) {
        this.zzk = z;
    }

    private final synchronized void zzk() {
        if (!this.zzk) {
            zza(0L);
        }
    }

    final synchronized void zza(long j) {
        zza(new com.google.firebase.iid.zzbb(this, java.lang.Math.min(java.lang.Math.max(30L, j << 1), zza)), j);
        this.zzk = true;
    }

    static void zza(java.lang.Runnable runnable, long j) {
        synchronized (com.google.firebase.iid.FirebaseInstanceId.class) {
            if (zzd == null) {
                zzd = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("FirebaseInstanceId"));
            }
            zzd.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    public java.lang.String getId() {
        zza(this.zzf);
        zzj();
        return zzl();
    }

    private static void zza(com.google.firebase.FirebaseApp firebaseApp) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(firebaseApp.getOptions().getApplicationId().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(zzc.matcher(firebaseApp.getOptions().getApiKey()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private final java.lang.String zzl() {
        try {
            zzb.zzb(this.zzf.getPersistenceKey());
            com.google.android.gms.tasks.Task<java.lang.String> id = this.zzj.getId();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(id, "Task must not be null");
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            id.addOnCompleteListener(com.google.firebase.iid.zzn.zza, new com.google.android.gms.tasks.OnCompleteListener(countDownLatch) { // from class: com.google.firebase.iid.zzm
                private final java.util.concurrent.CountDownLatch zza;

                {
                    this.zza = countDownLatch;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    this.zza.countDown();
                }
            });
            countDownLatch.await(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (id.isSuccessful()) {
                return id.getResult();
            }
            if (id.isCanceled()) {
                throw new java.util.concurrent.CancellationException("Task is already canceled");
            }
            if (id.isComplete()) {
                throw new java.lang.IllegalStateException(id.getException());
            }
            throw new java.lang.IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public long getCreationTime() {
        return zzb.zza(this.zzf.getPersistenceKey());
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> getInstanceId() {
        zza(this.zzf);
        return zza(com.google.firebase.iid.zzao.zza(this.zzf), "*");
    }

    private final com.google.android.gms.tasks.Task<com.google.firebase.iid.InstanceIdResult> zza(final java.lang.String str, java.lang.String str2) {
        final java.lang.String strZza = zza(str2);
        return com.google.android.gms.tasks.Tasks.forResult(null).continueWithTask(this.zze, new com.google.android.gms.tasks.Continuation(this, str, strZza) { // from class: com.google.firebase.iid.zzk
            private final com.google.firebase.iid.FirebaseInstanceId zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;

            {
                this.zza = this;
                this.zzb = str;
                this.zzc = strZza;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return this.zza.zza(this.zzb, this.zzc, task);
            }
        });
    }

    public void deleteInstanceId() throws java.io.IOException {
        zza(this.zzf);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        zza(this.zzj.delete());
        zze();
    }

    @java.lang.Deprecated
    public java.lang.String getToken() {
        zza(this.zzf);
        com.google.firebase.iid.zzay zzayVarZzb = zzb();
        if (zza(zzayVarZzb)) {
            zzk();
        }
        return com.google.firebase.iid.zzay.zza(zzayVarZzb);
    }

    public java.lang.String getToken(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        zza(this.zzf);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        return ((com.google.firebase.iid.InstanceIdResult) zza(zza(str, str2))).getToken();
    }

    final com.google.firebase.iid.zzay zzb() {
        return zzb(com.google.firebase.iid.zzao.zza(this.zzf), "*");
    }

    private final com.google.firebase.iid.zzay zzb(java.lang.String str, java.lang.String str2) {
        return zzb.zza(zzm(), str, str2);
    }

    final java.lang.String zzc() throws java.io.IOException {
        return getToken(com.google.firebase.iid.zzao.zza(this.zzf), "*");
    }

    private final <T> T zza(com.google.android.gms.tasks.Task<T> task) throws java.io.IOException {
        try {
            return (T) com.google.android.gms.tasks.Tasks.await(task, 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException unused) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.io.IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zze();
                }
                throw ((java.io.IOException) cause);
            }
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            throw new java.io.IOException(e);
        }
    }

    public void deleteToken(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        zza(this.zzf);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        java.lang.String strZza = zza(str2);
        zza(this.zzh.zzb(zzl(), str, strZza));
        zzb.zzb(zzm(), str, strZza);
    }

    static boolean zzd() {
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return android.os.Build.VERSION.SDK_INT == 23 && android.util.Log.isLoggable("FirebaseInstanceId", 3);
    }

    final synchronized void zze() {
        zzb.zza();
        if (this.zzl.zza()) {
            zzk();
        }
    }

    public final boolean zzf() {
        return this.zzg.zza();
    }

    final void zzg() {
        zzb.zzc(zzm());
        zzk();
    }

    public final boolean zzh() {
        return this.zzl.zza();
    }

    public final void zzb(boolean z) {
        this.zzl.zza(z);
    }

    private static java.lang.String zza(java.lang.String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private final java.lang.String zzm() {
        return com.google.firebase.FirebaseApp.DEFAULT_APP_NAME.equals(this.zzf.getName()) ? "" : this.zzf.getPersistenceKey();
    }

    final boolean zza(com.google.firebase.iid.zzay zzayVar) {
        return zzayVar == null || zzayVar.zzb(this.zzg.zzc());
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zza(final java.lang.String str, final java.lang.String str2, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        final java.lang.String strZzl = zzl();
        com.google.firebase.iid.zzay zzayVarZzb = zzb(str, str2);
        if (!zza(zzayVarZzb)) {
            return com.google.android.gms.tasks.Tasks.forResult(new com.google.firebase.iid.zzaa(strZzl, zzayVarZzb.zza));
        }
        return this.zzi.zza(str, str2, new com.google.firebase.iid.zzav(this, strZzl, str, str2) { // from class: com.google.firebase.iid.zzp
            private final com.google.firebase.iid.FirebaseInstanceId zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;
            private final java.lang.String zzd;

            {
                this.zza = this;
                this.zzb = strZzl;
                this.zzc = str;
                this.zzd = str2;
            }

            @Override // com.google.firebase.iid.zzav
            public final com.google.android.gms.tasks.Task zza() {
                return this.zza.zza(this.zzb, this.zzc, this.zzd);
            }
        });
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zza(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        return this.zzh.zza(str, str2, str3).onSuccessTask(this.zze, new com.google.android.gms.tasks.SuccessContinuation(this, str2, str3, str) { // from class: com.google.firebase.iid.zzo
            private final com.google.firebase.iid.FirebaseInstanceId zza;
            private final java.lang.String zzb;
            private final java.lang.String zzc;
            private final java.lang.String zzd;

            {
                this.zza = this;
                this.zzb = str2;
                this.zzc = str3;
                this.zzd = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return this.zza.zza(this.zzb, this.zzc, this.zzd, (java.lang.String) obj);
            }
        });
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zza(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws java.lang.Exception {
        zzb.zza(zzm(), str, str2, str4, this.zzg.zzc());
        return com.google.android.gms.tasks.Tasks.forResult(new com.google.firebase.iid.zzaa(str3, str4));
    }

    final /* synthetic */ void zzi() {
        if (this.zzl.zza()) {
            zzj();
        }
    }
}
