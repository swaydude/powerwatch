package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzab {
    private static com.google.firebase.iid.zzab zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private com.google.firebase.iid.zzac zzd = new com.google.firebase.iid.zzac(this);
    private int zze = 1;

    public static synchronized com.google.firebase.iid.zzab zza(android.content.Context context) {
        if (zza == null) {
            zza = new com.google.firebase.iid.zzab(context, com.google.android.gms.internal.firebase_messaging.zza.zza().zza(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("MessengerIpcClient"), com.google.android.gms.internal.firebase_messaging.zzf.zzb));
        }
        return zza;
    }

    private zzab(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public final com.google.android.gms.tasks.Task<java.lang.Void> zza(int i, android.os.Bundle bundle) {
        return zza(new com.google.firebase.iid.zzak(zza(), 2, bundle));
    }

    public final com.google.android.gms.tasks.Task<android.os.Bundle> zzb(int i, android.os.Bundle bundle) {
        return zza(new com.google.firebase.iid.zzap(zza(), 1, bundle));
    }

    private final synchronized <T> com.google.android.gms.tasks.Task<T> zza(com.google.firebase.iid.zzan<T> zzanVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(zzanVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            android.util.Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.zzd.zza((com.google.firebase.iid.zzan<?>) zzanVar)) {
            com.google.firebase.iid.zzac zzacVar = new com.google.firebase.iid.zzac(this);
            this.zzd = zzacVar;
            zzacVar.zza((com.google.firebase.iid.zzan<?>) zzanVar);
        }
        return zzanVar.zzb.getTask();
    }

    private final synchronized int zza() {
        int i;
        i = this.zze;
        this.zze = i + 1;
        return i;
    }
}
