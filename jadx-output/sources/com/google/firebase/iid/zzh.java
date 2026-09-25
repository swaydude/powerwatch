package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzh {
    private static final java.util.concurrent.Executor zza = com.google.firebase.iid.zzg.zza;

    static java.util.concurrent.Executor zza() {
        return zza;
    }

    static java.util.concurrent.ExecutorService zzb() {
        return new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor"));
    }
}
