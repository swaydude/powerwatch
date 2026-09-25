package com.google.android.gms.internal.maps;

/* JADX INFO: loaded from: classes.dex */
public interface zzw extends android.os.IInterface {
    int getFillColor() throws android.os.RemoteException;

    java.util.List getHoles() throws android.os.RemoteException;

    java.lang.String getId() throws android.os.RemoteException;

    java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() throws android.os.RemoteException;

    int getStrokeColor() throws android.os.RemoteException;

    int getStrokeJointType() throws android.os.RemoteException;

    java.util.List<com.google.android.gms.maps.model.PatternItem> getStrokePattern() throws android.os.RemoteException;

    float getStrokeWidth() throws android.os.RemoteException;

    float getZIndex() throws android.os.RemoteException;

    boolean isClickable() throws android.os.RemoteException;

    boolean isGeodesic() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void remove() throws android.os.RemoteException;

    void setClickable(boolean z) throws android.os.RemoteException;

    void setFillColor(int i) throws android.os.RemoteException;

    void setGeodesic(boolean z) throws android.os.RemoteException;

    void setHoles(java.util.List list) throws android.os.RemoteException;

    void setPoints(java.util.List<com.google.android.gms.maps.model.LatLng> list) throws android.os.RemoteException;

    void setStrokeColor(int i) throws android.os.RemoteException;

    void setStrokeJointType(int i) throws android.os.RemoteException;

    void setStrokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) throws android.os.RemoteException;

    void setStrokeWidth(float f) throws android.os.RemoteException;

    void setVisible(boolean z) throws android.os.RemoteException;

    void setZIndex(float f) throws android.os.RemoteException;

    boolean zzb(com.google.android.gms.internal.maps.zzw zzwVar) throws android.os.RemoteException;

    void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    int zzj() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzk() throws android.os.RemoteException;
}
