package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzan implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.fitness.request.OnDataPointListener> {
    private final /* synthetic */ com.google.android.gms.fitness.data.DataPoint zzps;

    zzan(com.google.android.gms.fitness.request.zzak zzakVar, com.google.android.gms.fitness.data.DataPoint dataPoint) {
        this.zzps = dataPoint;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(com.google.android.gms.fitness.request.OnDataPointListener onDataPointListener) {
        onDataPointListener.onDataPoint(this.zzps);
    }
}
