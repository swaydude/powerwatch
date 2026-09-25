package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzk extends android.os.IInterface {
    float getBearing() throws android.os.RemoteException;

    com.google.android.gms.maps.model.LatLngBounds getBounds() throws android.os.RemoteException;

    float getHeight() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    com.google.android.gms.maps.model.LatLng getPosition() throws android.os.RemoteException;

    float getTransparency() throws android.os.RemoteException;

    float getWidth() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setBearing(float f) throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setDimensions(float f) throws android.os.RemoteException;

    void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setPositionFromBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException;

    void setTransparency(float f) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    void zza(float f, float f2) throws android.os.RemoteException;

    boolean zzb(com.google.android.gms.internal.maps.zzk zzkVar) throws android.os.RemoteException;

    void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException;
}
