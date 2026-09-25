package com.google.android.gms.fitness.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc implements com.google.android.gms.fitness.service.SensorEventDispatcher {
    private final com.google.android.gms.fitness.data.zzu zzpt;

    zzc(com.google.android.gms.fitness.data.zzu zzuVar) {
        this.zzpt = (com.google.android.gms.fitness.data.zzu) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzuVar);
    }

    @Override // com.google.android.gms.fitness.service.SensorEventDispatcher
    public final void publish(com.google.android.gms.fitness.data.DataPoint dataPoint) throws android.os.RemoteException {
        dataPoint.zzj();
        this.zzpt.zzc(dataPoint);
    }

    @Override // com.google.android.gms.fitness.service.SensorEventDispatcher
    public final void publish(java.util.List<com.google.android.gms.fitness.data.DataPoint> list) throws android.os.RemoteException {
        java.util.Iterator<com.google.android.gms.fitness.data.DataPoint> it = list.iterator();
        while (it.hasNext()) {
            publish(it.next());
        }
    }
}
