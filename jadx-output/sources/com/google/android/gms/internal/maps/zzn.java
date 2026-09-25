package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzn extends android.os.IInterface {
    int getActiveLevelIndex() throws android.os.RemoteException;

    int getDefaultLevelIndex() throws android.os.RemoteException;

    java.util.List<android.os.IBinder> getLevels() throws android.os.RemoteException;

    boolean isUnderground() throws android.os.RemoteException;

    boolean zzb(com.google.android.gms.internal.maps.zzn zznVar) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;
}
