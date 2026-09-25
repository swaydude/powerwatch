package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public interface IMapFragmentDelegate extends android.os.IInterface {
    com.google.android.gms.maps.internal.IGoogleMapDelegate getMap() throws android.os.RemoteException;

    void getMapAsync(com.google.android.gms.maps.internal.zzap zzapVar) throws android.os.RemoteException;

    boolean isReady() throws android.os.RemoteException;

    void onCreate(android.os.Bundle bundle) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper onCreateView(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, android.os.Bundle bundle) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onDestroyView() throws android.os.RemoteException;

    void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException;

    void onExitAmbient() throws android.os.RemoteException;

    void onInflate(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions, android.os.Bundle bundle) throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;
}
