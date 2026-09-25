package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public interface IStreetViewPanoramaViewDelegate extends android.os.IInterface {
    com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate getStreetViewPanorama() throws android.os.RemoteException;

    void getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzbp zzbpVar) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper getView() throws android.os.RemoteException;

    void onCreate(android.os.Bundle bundle) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;
}
