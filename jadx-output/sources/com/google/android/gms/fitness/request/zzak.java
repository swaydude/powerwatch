package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzak extends com.google.android.gms.fitness.data.zzt {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.OnDataPointListener> zzpp;

    private zzak(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.OnDataPointListener> listenerHolder) {
        this.zzpp = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.fitness.data.zzu
    public final void zzc(com.google.android.gms.fitness.data.DataPoint dataPoint) {
        this.zzpp.notifyListener(new com.google.android.gms.fitness.request.zzan(this, dataPoint));
    }

    public final void release() {
        this.zzpp.clear();
    }

    /* synthetic */ zzak(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.fitness.request.zzan zzanVar) {
        this(listenerHolder);
    }
}
