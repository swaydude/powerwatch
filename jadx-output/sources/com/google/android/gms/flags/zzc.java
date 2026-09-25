package com.google.android.gms.flags;

/* JADX INFO: loaded from: classes.dex */
public interface zzc extends android.os.IInterface {
    boolean getBooleanFlagValue(java.lang.String str, boolean z, int i) throws android.os.RemoteException;

    int getIntFlagValue(java.lang.String str, int i, int i2) throws android.os.RemoteException;

    long getLongFlagValue(java.lang.String str, long j, int i) throws android.os.RemoteException;

    java.lang.String getStringFlagValue(java.lang.String str, java.lang.String str2, int i) throws android.os.RemoteException;

    void init(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;
}
