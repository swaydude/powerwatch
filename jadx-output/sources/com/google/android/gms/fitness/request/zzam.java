package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam {
    private static final com.google.android.gms.fitness.request.zzam zzpq = new com.google.android.gms.fitness.request.zzam();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.fitness.request.OnDataPointListener>, com.google.android.gms.fitness.request.zzak> zzpr = new java.util.HashMap();

    private zzam() {
    }

    public static com.google.android.gms.fitness.request.zzam zzaa() {
        return zzpq;
    }

    public final com.google.android.gms.fitness.request.zzak zzc(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.OnDataPointListener> listenerHolder) {
        com.google.android.gms.fitness.request.zzak zzakVar;
        synchronized (this.zzpr) {
            zzakVar = this.zzpr.get(listenerHolder.getListenerKey());
            if (zzakVar == null) {
                zzakVar = new com.google.android.gms.fitness.request.zzak(listenerHolder, null);
                this.zzpr.put(listenerHolder.getListenerKey(), zzakVar);
            }
        }
        return zzakVar;
    }

    public final com.google.android.gms.fitness.request.zzak zza(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener, android.os.Looper looper) {
        return zzc(zzc(onDataPointListener, looper));
    }

    public final com.google.android.gms.fitness.request.zzak zzd(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.OnDataPointListener> listenerHolder) {
        com.google.android.gms.fitness.request.zzak zzakVarRemove;
        synchronized (this.zzpr) {
            zzakVarRemove = this.zzpr.remove(listenerHolder.getListenerKey());
            if (zzakVarRemove != null) {
                zzakVarRemove.release();
            }
        }
        return zzakVarRemove;
    }

    public final com.google.android.gms.fitness.request.zzak zzb(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener, android.os.Looper looper) {
        return zzd(zzc(onDataPointListener, looper));
    }

    private static com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.OnDataPointListener> zzc(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener, android.os.Looper looper) {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(onDataPointListener, looper, com.google.android.gms.fitness.request.OnDataPointListener.class.getSimpleName());
    }
}
