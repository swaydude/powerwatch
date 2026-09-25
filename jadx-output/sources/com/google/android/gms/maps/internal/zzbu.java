package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzbu extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate {
    zzbu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableZoom(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(1, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enablePanning(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(2, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableUserNavigation(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableStreetNames(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isZoomGesturesEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(5, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isPanningGesturesEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(6, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isUserNavigationEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(7, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isStreetNamesEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(8, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, streetViewPanoramaCamera);
        parcelZza.writeLong(j);
        zzb(9, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.maps.model.StreetViewPanoramaCamera getPanoramaCamera() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(10, zza());
        com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR);
        parcelZza.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithID(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(11, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        zzb(12, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadius(com.google.android.gms.maps.model.LatLng latLng, int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        parcelZza.writeInt(i);
        zzb(13, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.maps.model.StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(14, zza());
        com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.gms.maps.model.StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.StreetViewPanoramaLocation.CREATOR);
        parcelZza.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzbj zzbjVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbjVar);
        zzb(15, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzbh zzbhVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbhVar);
        zzb(16, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzbl zzblVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzblVar);
        zzb(17, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.maps.model.StreetViewPanoramaOrientation pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        android.os.Parcel parcelZza2 = zza(18, parcelZza);
        com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.gms.maps.model.StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(parcelZza2, com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR);
        parcelZza2.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, streetViewPanoramaOrientation);
        android.os.Parcel parcelZza2 = zza(19, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzbn zzbnVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbnVar);
        zzb(20, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithSource(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, streetViewSource);
        zzb(21, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadiusAndSource(com.google.android.gms.maps.model.LatLng latLng, int i, com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLng);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, streetViewSource);
        zzb(22, parcelZza);
    }
}
