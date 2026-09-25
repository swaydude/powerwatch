package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public interface zzao extends android.os.IInterface {
    android.location.Location zza(java.lang.String str) throws android.os.RemoteException;

    void zza(long j, boolean z, android.app.PendingIntent pendingIntent) throws android.os.RemoteException;

    void zza(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zza(android.location.Location location) throws android.os.RemoteException;

    void zza(com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException;

    void zza(com.google.android.gms.internal.location.zzbf zzbfVar) throws android.os.RemoteException;

    void zza(com.google.android.gms.internal.location.zzo zzoVar) throws android.os.RemoteException;

    void zza(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.IStatusCallback iStatusCallback) throws android.os.RemoteException;

    void zza(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzam zzamVar) throws android.os.RemoteException;

    void zza(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.internal.location.zzaq zzaqVar, java.lang.String str) throws android.os.RemoteException;

    void zza(com.google.android.gms.location.zzal zzalVar, com.google.android.gms.internal.location.zzam zzamVar) throws android.os.RemoteException;

    void zza(boolean z) throws android.os.RemoteException;

    com.google.android.gms.location.LocationAvailability zzb(java.lang.String str) throws android.os.RemoteException;

    void zzb(android.app.PendingIntent pendingIntent) throws android.os.RemoteException;
}
