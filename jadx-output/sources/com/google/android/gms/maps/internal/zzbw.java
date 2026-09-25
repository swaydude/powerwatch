package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate {
    zzbw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate getStreetViewPanorama() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate zzbuVar;
        android.os.Parcel parcelZza = zza(1, zza());
        android.os.IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            zzbuVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) {
                zzbuVar = (com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbuVar = new com.google.android.gms.maps.internal.zzbu(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzbuVar;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onCreate(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        zzb(2, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onResume() throws android.os.RemoteException {
        zzb(3, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onPause() throws android.os.RemoteException {
        zzb(4, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onDestroy() throws android.os.RemoteException {
        zzb(5, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onLowMemory() throws android.os.RemoteException {
        zzb(6, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        android.os.Parcel parcelZza2 = zza(7, parcelZza);
        if (parcelZza2.readInt() != 0) {
            bundle.readFromParcel(parcelZza2);
        }
        parcelZza2.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper getView() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(8, zza());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzbp zzbpVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbpVar);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStart() throws android.os.RemoteException {
        zzb(10, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStop() throws android.os.RemoteException {
        zzb(11, zza());
    }
}
