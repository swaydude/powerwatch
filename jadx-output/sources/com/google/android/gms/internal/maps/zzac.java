package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzac extends android.os.IInterface {
    void clearTileCache() throws android.os.RemoteException;

    boolean getFadeIn() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    float getTransparency() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setFadeIn(boolean z) throws android.os.RemoteException;

    void setTransparency(float f) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    boolean zza(com.google.android.gms.internal.maps.zzac zzacVar) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;
}
