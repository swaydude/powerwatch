package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzh extends android.os.IInterface {
    com.google.android.gms.maps.model.LatLng getCenter() throws android.os.RemoteException;

    int getFillColor() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    double getRadius() throws android.os.RemoteException;

    int getStrokeColor() throws android.os.RemoteException;

    java.util.List<com.google.android.gms.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException;

    float getStrokeWidth() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setCenter(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setFillColor(int i) throws android.os.RemoteException;

    void setRadius(double d) throws android.os.RemoteException;

    void setStrokeColor(int i) throws android.os.RemoteException;

    void setStrokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) throws android.os.RemoteException;

    void setStrokeWidth(float f) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    boolean zzb(com.google.android.gms.internal.maps.zzh zzhVar) throws android.os.RemoteException;

    void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException;
}
