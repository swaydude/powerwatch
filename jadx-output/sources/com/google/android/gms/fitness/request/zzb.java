package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.gms.fitness.request.zzae {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.BleScanCallback> zzog;

    private zzb(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.fitness.request.BleScanCallback> listenerHolder) {
        this.zzog = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.fitness.request.zzaf
    public final void onDeviceFound(com.google.android.gms.fitness.data.BleDevice bleDevice) {
        this.zzog.notifyListener(new com.google.android.gms.fitness.request.zza(this, bleDevice));
    }

    @Override // com.google.android.gms.fitness.request.zzaf
    public final void onScanStopped() {
        this.zzog.notifyListener(new com.google.android.gms.fitness.request.zzd(this));
    }

    public final void release() {
        this.zzog.clear();
    }

    /* synthetic */ zzb(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.fitness.request.zza zzaVar) {
        this(listenerHolder);
    }
}
