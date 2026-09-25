package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.fitness.request.BleScanCallback> {
    private final /* synthetic */ com.google.android.gms.fitness.data.BleDevice zzof;

    zza(com.google.android.gms.fitness.request.zzb zzbVar, com.google.android.gms.fitness.data.BleDevice bleDevice) {
        this.zzof = bleDevice;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        bleScanCallback.onDeviceFound(this.zzof);
    }
}
