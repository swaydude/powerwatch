package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzt extends android.os.IInterface {
    float getAlpha() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    com.google.android.gms.maps.model.LatLng getPosition() throws android.os.RemoteException;

    float getRotation() throws android.os.RemoteException;

    java.lang.String getSnippet() throws android.os.RemoteException;

    java.lang.String getTitle() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    void hideInfoWindow() throws android.os.RemoteException;

    boolean isDraggable() throws android.os.RemoteException;

    boolean isFlat() throws android.os.RemoteException;

    boolean isInfoWindowShown() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setAlpha(float f) throws android.os.RemoteException;

    void setAnchor(float f, float f2) throws android.os.RemoteException;

    void setDraggable(boolean z) throws android.os.RemoteException;

    void setFlat(boolean z) throws android.os.RemoteException;

    void setInfoWindowAnchor(float f, float f2) throws android.os.RemoteException;

    void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setRotation(float f) throws android.os.RemoteException;

    void setSnippet(java.lang.String str) throws android.os.RemoteException;

    void setTitle(java.lang.String str) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    void showInfoWindow() throws android.os.RemoteException;

    void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    boolean zzj(com.google.android.gms.internal.maps.zzt zztVar) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException;
}
