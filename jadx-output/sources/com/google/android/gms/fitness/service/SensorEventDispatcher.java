package com.google.android.gms.fitness.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public interface SensorEventDispatcher {
    void publish(com.google.android.gms.fitness.data.DataPoint dataPoint) throws android.os.RemoteException;

    void publish(java.util.List<com.google.android.gms.fitness.data.DataPoint> list) throws android.os.RemoteException;
}
