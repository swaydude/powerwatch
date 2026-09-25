package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends com.google.firebase.messaging.zzf {
    private static final java.util.Queue<java.lang.String> zza = new java.util.ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }

    public void onMessageSent(java.lang.String str) {
    }

    public void onNewToken(java.lang.String str) {
    }

    public void onSendError(java.lang.String str, java.lang.Exception exc) {
    }

    @Override // com.google.firebase.messaging.zzf
    protected final android.content.Intent zza(android.content.Intent intent) {
        return com.google.firebase.iid.zzaw.zza().zzb();
    }

    @Override // com.google.firebase.messaging.zzf
    public final boolean zzb(android.content.Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
                android.util.Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!com.google.firebase.messaging.zzr.zzd(intent)) {
            return true;
        }
        com.google.firebase.messaging.zzr.zza(intent);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    @Override // com.google.firebase.messaging.zzf
    public final void zzc(android.content.Intent intent) {
        com.google.android.gms.tasks.Task<java.lang.Void> taskZza;
        boolean z;
        java.lang.String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            java.lang.String stringExtra = intent.getStringExtra("google.message_id");
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                taskZza = com.google.android.gms.tasks.Tasks.forResult(null);
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("google.message_id", stringExtra);
                taskZza = com.google.firebase.iid.zzab.zza(this).zza(2, bundle);
            }
            if (android.text.TextUtils.isEmpty(stringExtra)) {
                z = false;
            } else {
                java.util.Queue<java.lang.String> queue = zza;
                if (queue.contains(stringExtra)) {
                    if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                        java.lang.String strValueOf = java.lang.String.valueOf(stringExtra);
                        android.util.Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Received duplicate message: ".concat(strValueOf) : new java.lang.String("Received duplicate message: "));
                    }
                    z = true;
                } else {
                    if (queue.size() >= 10) {
                        queue.remove();
                    }
                    queue.add(stringExtra);
                    z = false;
                }
            }
            if (!z) {
                java.lang.String stringExtra2 = intent.getStringExtra("message_type");
                if (stringExtra2 == null) {
                    stringExtra2 = "gcm";
                }
                stringExtra2.hashCode();
                switch (stringExtra2) {
                    case "deleted_messages":
                        onDeletedMessages();
                        break;
                    case "gcm":
                        if (com.google.firebase.messaging.zzr.zzd(intent)) {
                            com.google.firebase.messaging.zzr.zza(intent, (com.google.android.datatransport.Transport<java.lang.String>) null);
                        }
                        if (com.google.firebase.messaging.zzr.zze(intent)) {
                            com.google.android.datatransport.TransportFactory transportFactory = com.google.firebase.messaging.FirebaseMessaging.zza;
                            if (transportFactory != null) {
                                com.google.firebase.messaging.zzr.zza(intent, (com.google.android.datatransport.Transport<java.lang.String>) transportFactory.getTransport("FCM_CLIENT_EVENT_LOGGING", java.lang.String.class, com.google.android.datatransport.Encoding.of("json"), com.google.firebase.messaging.zzp.zza));
                            } else {
                                android.util.Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                            }
                        }
                        android.os.Bundle extras = intent.getExtras();
                        if (extras == null) {
                            extras = new android.os.Bundle();
                        }
                        extras.remove("androidx.contentpager.content.wakelockid");
                        if (com.google.firebase.messaging.zzt.zza(extras)) {
                            com.google.firebase.messaging.zzt zztVar = new com.google.firebase.messaging.zzt(extras);
                            java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Network-Io"));
                            try {
                                if (new com.google.firebase.messaging.zzc(this, zztVar, executorServiceNewSingleThreadExecutor).zza()) {
                                    executorServiceNewSingleThreadExecutor.shutdown();
                                } else {
                                    executorServiceNewSingleThreadExecutor.shutdown();
                                    if (com.google.firebase.messaging.zzr.zzd(intent)) {
                                        com.google.firebase.messaging.zzr.zzc(intent);
                                    }
                                    onMessageReceived(new com.google.firebase.messaging.RemoteMessage(extras));
                                }
                            } catch (java.lang.Throwable th) {
                                executorServiceNewSingleThreadExecutor.shutdown();
                                throw th;
                            }
                            break;
                        } else {
                            onMessageReceived(new com.google.firebase.messaging.RemoteMessage(extras));
                            break;
                        }
                        break;
                    case "send_error":
                        java.lang.String stringExtra3 = intent.getStringExtra("google.message_id");
                        if (stringExtra3 == null) {
                            stringExtra3 = intent.getStringExtra("message_id");
                        }
                        onSendError(stringExtra3, new com.google.firebase.messaging.SendException(intent.getStringExtra("error")));
                        break;
                    case "send_event":
                        onMessageSent(intent.getStringExtra("google.message_id"));
                        break;
                    default:
                        java.lang.String strValueOf2 = java.lang.String.valueOf(stringExtra2);
                        android.util.Log.w("FirebaseMessaging", strValueOf2.length() != 0 ? "Received message with unknown type: ".concat(strValueOf2) : new java.lang.String("Received message with unknown type: "));
                        break;
                }
            }
            try {
                com.google.android.gms.tasks.Tasks.await(taskZza, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), java.util.concurrent.TimeUnit.MILLISECONDS);
                return;
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
                java.lang.String strValueOf3 = java.lang.String.valueOf(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf3).length() + 20);
                sb.append("Message ack failed: ");
                sb.append(strValueOf3);
                android.util.Log.w("FirebaseMessaging", sb.toString());
                return;
            }
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (com.google.firebase.messaging.zzr.zzd(intent)) {
                com.google.firebase.messaging.zzr.zzb(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            java.lang.String strValueOf4 = java.lang.String.valueOf(intent.getAction());
            android.util.Log.d("FirebaseMessaging", strValueOf4.length() != 0 ? "Unknown intent action: ".concat(strValueOf4) : new java.lang.String("Unknown intent action: "));
        }
    }
}
