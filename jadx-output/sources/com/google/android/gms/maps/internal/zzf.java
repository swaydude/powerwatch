package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.zze {
    zzf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final com.google.android.gms.maps.internal.IMapFragmentDelegate zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IMapFragmentDelegate zzjVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZza2 = zza(2, parcelZza);
        android.os.IBinder strongBinder = parcelZza2.readStrongBinder();
        if (strongBinder == null) {
            zzjVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IMapFragmentDelegate) {
                zzjVar = (com.google.android.gms.maps.internal.IMapFragmentDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzjVar = new com.google.android.gms.maps.internal.zzj(strongBinder);
            }
        }
        parcelZza2.recycle();
        return zzjVar;
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final com.google.android.gms.maps.internal.IMapViewDelegate zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IMapViewDelegate zzkVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, googleMapOptions);
        android.os.Parcel parcelZza2 = zza(3, parcelZza);
        android.os.IBinder strongBinder = parcelZza2.readStrongBinder();
        if (strongBinder == null) {
            zzkVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IMapViewDelegate) {
                zzkVar = (com.google.android.gms.maps.internal.IMapViewDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzkVar = new com.google.android.gms.maps.internal.zzk(strongBinder);
            }
        }
        parcelZza2.recycle();
        return zzkVar;
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzbVar;
        android.os.Parcel parcelZza = zza(4, zza());
        android.os.IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            zzbVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) {
                zzbVar = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbVar = new com.google.android.gms.maps.internal.zzb(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzbVar;
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final com.google.android.gms.internal.maps.zze zzf() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(5, zza());
        com.google.android.gms.internal.maps.zze zzeVarZzb = com.google.android.gms.internal.maps.zzf.zzb(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return zzeVarZzb;
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzb(6, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzbwVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, streetViewPanoramaOptions);
        android.os.Parcel parcelZza2 = zza(7, parcelZza);
        android.os.IBinder strongBinder = parcelZza2.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) {
                zzbwVar = (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbwVar = new com.google.android.gms.maps.internal.zzbw(strongBinder);
            }
        }
        parcelZza2.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.maps.internal.zze
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzbvVar;
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZza2 = zza(8, parcelZza);
        android.os.IBinder strongBinder = parcelZza2.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) {
                zzbvVar = (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbvVar = new com.google.android.gms.maps.internal.zzbv(strongBinder);
            }
        }
        parcelZza2.recycle();
        return zzbvVar;
    }
}
