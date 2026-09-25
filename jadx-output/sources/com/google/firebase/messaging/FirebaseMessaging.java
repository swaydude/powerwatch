package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {
    public static final java.lang.String INSTANCE_ID_SCOPE = "FCM";
    static com.google.android.datatransport.TransportFactory zza;
    private final android.content.Context zzb;
    private final com.google.firebase.iid.FirebaseInstanceId zzc;
    private final com.google.android.gms.tasks.Task<com.google.firebase.messaging.zzab> zzd;

    public static synchronized com.google.firebase.messaging.FirebaseMessaging getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    static synchronized com.google.firebase.messaging.FirebaseMessaging getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        return (com.google.firebase.messaging.FirebaseMessaging) firebaseApp.get(com.google.firebase.messaging.FirebaseMessaging.class);
    }

    FirebaseMessaging(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.android.datatransport.TransportFactory transportFactory) {
        zza = transportFactory;
        this.zzc = firebaseInstanceId;
        android.content.Context applicationContext = firebaseApp.getApplicationContext();
        this.zzb = applicationContext;
        com.google.android.gms.tasks.Task<com.google.firebase.messaging.zzab> taskZza = com.google.firebase.messaging.zzab.zza(firebaseApp, firebaseInstanceId, new com.google.firebase.iid.zzao(applicationContext), userAgentPublisher, heartBeatInfo, firebaseInstallationsApi, applicationContext, com.google.firebase.messaging.zzi.zza(), new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Topics-Io")));
        this.zzd = taskZza;
        taskZza.addOnSuccessListener(com.google.firebase.messaging.zzi.zzb(), new com.google.android.gms.tasks.OnSuccessListener(this) { // from class: com.google.firebase.messaging.zzk
            private final com.google.firebase.messaging.FirebaseMessaging zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                com.google.firebase.messaging.zzab zzabVar = (com.google.firebase.messaging.zzab) obj;
                if (this.zza.isAutoInitEnabled()) {
                    zzabVar.zza();
                }
            }
        });
    }

    public boolean isAutoInitEnabled() {
        return this.zzc.zzh();
    }

    public void setAutoInitEnabled(boolean z) {
        this.zzc.zzb(z);
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return com.google.firebase.messaging.zzr.zza();
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        com.google.firebase.messaging.zzr.zza(z);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> subscribeToTopic(final java.lang.String str) {
        return this.zzd.onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation(str) { // from class: com.google.firebase.messaging.zzm
            private final java.lang.String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.firebase.messaging.zzab zzabVar = (com.google.firebase.messaging.zzab) obj;
                com.google.android.gms.tasks.Task<java.lang.Void> taskZza = zzabVar.zza(com.google.firebase.messaging.zzz.zza(this.zza));
                zzabVar.zza();
                return taskZza;
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribeFromTopic(final java.lang.String str) {
        return this.zzd.onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation(str) { // from class: com.google.firebase.messaging.zzl
            private final java.lang.String zza;

            {
                this.zza = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.firebase.messaging.zzab zzabVar = (com.google.firebase.messaging.zzab) obj;
                com.google.android.gms.tasks.Task<java.lang.Void> taskZza = zzabVar.zza(com.google.firebase.messaging.zzz.zzb(this.zza));
                zzabVar.zza();
                return taskZza;
            }
        });
    }

    public void send(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        if (android.text.TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new java.lang.IllegalArgumentException("Missing 'to'");
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gcm.intent.SEND");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, android.app.PendingIntent.getBroadcast(this.zzb, 0, intent2, 0));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(remoteMessage.zza);
        this.zzb.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }
}
