package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public interface zze extends android.os.IInterface {
    com.google.android.gms.maps.internal.IMapViewDelegate zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) throws android.os.RemoteException;

    void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IMapFragmentDelegate zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze() throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zze zzf() throws android.os.RemoteException;
}
