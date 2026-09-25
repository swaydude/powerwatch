package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    private static final com.google.android.gms.fitness.request.zzc zzoh = new com.google.android.gms.fitness.request.zzc();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.fitness.request.BleScanCallback>, com.google.android.gms.fitness.request.zzb> zzoi = new java.util.HashMap();

    private zzc() {
    }

    public static com.google.android.gms.fitness.request.zzc zzx() {
        return zzoh;
    }

    public final com.google.android.gms.fitness.request.zzb zza(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, android.os.Looper looper) {
        return zza(zzc(bleScanCallback, looper));
    }

    public final com.google.android.gms.fitness.request.zzb zza(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.BleScanCallback> listenerHolder) {
        com.google.android.gms.fitness.request.zzb zzbVar;
        synchronized (this.zzoi) {
            zzbVar = this.zzoi.get(listenerHolder.getListenerKey());
            if (zzbVar == null) {
                zzbVar = new com.google.android.gms.fitness.request.zzb(listenerHolder, null);
                this.zzoi.put(listenerHolder.getListenerKey(), zzbVar);
            }
        }
        return zzbVar;
    }

    public final com.google.android.gms.fitness.request.zzb zzb(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, android.os.Looper looper) {
        return zzb(zzc(bleScanCallback, looper));
    }

    public final com.google.android.gms.fitness.request.zzb zzb(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.BleScanCallback> listenerHolder) {
        com.google.android.gms.fitness.request.zzb zzbVar;
        synchronized (this.zzoi) {
            zzbVar = this.zzoi.get(listenerHolder.getListenerKey());
            if (zzbVar != null) {
                zzbVar.release();
            }
        }
        return zzbVar;
    }

    private static com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.BleScanCallback> zzc(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback, android.os.Looper looper) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(bleScanCallback, looper, com.google.android.gms.fitness.request.BleScanCallback.class.getSimpleName());
    }
}
