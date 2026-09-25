package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzz extends android.os.IInterface {
    int getColor() throws android.os.RemoteException;

    com.google.android.gms.maps.model.Cap getEndCap() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    int getJointType() throws android.os.RemoteException;

    java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() throws android.os.RemoteException;

    java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() throws android.os.RemoteException;

    com.google.android.gms.maps.model.Cap getStartCap() throws android.os.RemoteException;

    float getWidth() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isGeodesic() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setColor(int i) throws android.os.RemoteException;

    void setEndCap(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException;

    void setGeodesic(boolean z) throws android.os.RemoteException;

    void setJointType(int i) throws android.os.RemoteException;

    void setPattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) throws android.os.RemoteException;

    void setPoints(java.util.List<com.google.android.gms.maps.model.LatLng> list) throws android.os.RemoteException;

    void setStartCap(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setWidth(float f) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    boolean zzb(com.google.android.gms.internal.maps.zzz zzzVar) throws android.os.RemoteException;

    void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException;
}
