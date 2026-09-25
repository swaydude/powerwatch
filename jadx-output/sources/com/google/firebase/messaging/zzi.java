package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzi {
    static java.util.concurrent.Executor zza() {
        return zza("Firebase-Messaging-Rpc-Task");
    }

    static java.util.concurrent.Executor zzb() {
        return zza("Firebase-Messaging-Trigger-Topics-Io");
    }

    private static java.util.concurrent.Executor zza(java.lang.String str) {
        return new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory(str));
    }
}
