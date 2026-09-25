package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IGoogleMapDelegate {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.maps.model.CameraPosition getCameraPosition() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(1, zza());
        com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.internal.maps.zzc.zza(parcelZza, com.google.android.gms.maps.model.CameraPosition.CREATOR);
        parcelZza.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMaxZoomLevel() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(2, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMinZoomLevel() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(3, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        return f;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void moveCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(4, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(5, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.internal.zzc zzcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzcVar);
        zzb(6, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i, com.google.android.gms.maps.internal.zzc zzcVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzcVar);
        zzb(7, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void stopAnimation() throws android.os.RemoteException {
        zzb(8, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzz addPolyline(com.google.android.gms.maps.model.PolylineOptions polylineOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, polylineOptions);
        android.os.Parcel parcelZza2 = zza(9, parcelZza);
        com.google.android.gms.internal.maps.zzz zzzVarZzi = com.google.android.gms.internal.maps.zzaa.zzi(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zzzVarZzi;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzw addPolygon(com.google.android.gms.maps.model.PolygonOptions polygonOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, polygonOptions);
        android.os.Parcel parcelZza2 = zza(10, parcelZza);
        com.google.android.gms.internal.maps.zzw zzwVarZzh = com.google.android.gms.internal.maps.zzx.zzh(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zzwVarZzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzt addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, markerOptions);
        android.os.Parcel parcelZza2 = zza(11, parcelZza);
        com.google.android.gms.internal.maps.zzt zztVarZzg = com.google.android.gms.internal.maps.zzu.zzg(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zztVarZzg;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzk addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, groundOverlayOptions);
        android.os.Parcel parcelZza2 = zza(12, parcelZza);
        com.google.android.gms.internal.maps.zzk zzkVarZzd = com.google.android.gms.internal.maps.zzl.zzd(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zzkVarZzd;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzac addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, tileOverlayOptions);
        android.os.Parcel parcelZza2 = zza(13, parcelZza);
        com.google.android.gms.internal.maps.zzac zzacVarZzj = com.google.android.gms.internal.maps.zzad.zzj(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zzacVarZzj;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() throws android.os.RemoteException {
        zzb(14, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapType() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(15, zza());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapType(int i) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzb(16, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTrafficEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(17, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTrafficEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(18, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isIndoorEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(19, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setIndoorEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        android.os.Parcel parcelZza2 = zza(20, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isMyLocationEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(21, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMyLocationEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(22, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final android.location.Location getMyLocation() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(23, zza());
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.maps.zzc.zza(parcelZza, android.location.Location.CREATOR);
        parcelZza.recycle();
        return location;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate iLocationSourceDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iLocationSourceDelegate);
        zzb(24, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.maps.internal.IUiSettingsDelegate getUiSettings() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IUiSettingsDelegate zzbxVar;
        android.os.Parcel parcelZza = zza(25, zza());
        android.os.IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            zzbxVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IUiSettingsDelegate) {
                zzbxVar = (com.google.android.gms.maps.internal.IUiSettingsDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbxVar = new com.google.android.gms.maps.internal.zzbx(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzbxVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.maps.internal.IProjectionDelegate getProjection() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IProjectionDelegate zzbrVar;
        android.os.Parcel parcelZza = zza(26, zza());
        android.os.IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            zzbrVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.maps.internal.IProjectionDelegate) {
                zzbrVar = (com.google.android.gms.maps.internal.IProjectionDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbrVar = new com.google.android.gms.maps.internal.zzbr(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzl zzlVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzlVar);
        zzb(27, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapClickListener(com.google.android.gms.maps.internal.zzaj zzajVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzajVar);
        zzb(28, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLongClickListener(com.google.android.gms.maps.internal.zzan zzanVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzanVar);
        zzb(29, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerClickListener(com.google.android.gms.maps.internal.zzar zzarVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzarVar);
        zzb(30, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerDragListener(com.google.android.gms.maps.internal.zzat zzatVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzatVar);
        zzb(31, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzab zzabVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzabVar);
        zzb(32, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzh zzhVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzhVar);
        zzb(33, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzh addCircle(com.google.android.gms.maps.model.CircleOptions circleOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, circleOptions);
        android.os.Parcel parcelZza2 = zza(35, parcelZza);
        com.google.android.gms.internal.maps.zzh zzhVarZzc = com.google.android.gms.internal.maps.zzi.zzc(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zzhVarZzc;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzax zzaxVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzaxVar);
        zzb(36, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzav zzavVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzavVar);
        zzb(37, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshot(com.google.android.gms.maps.internal.zzbs zzbsVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbsVar);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(38, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setPadding(int i, int i2, int i3, int i4) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        parcelZza.writeInt(i4);
        zzb(39, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isBuildingsEnabled() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(40, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setBuildingsEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(41, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzalVar);
        zzb(42, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzn getFocusedBuilding() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(44, zza());
        com.google.android.gms.internal.maps.zzn zznVarZze = com.google.android.gms.internal.maps.zzo.zze(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return zznVarZze;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzz zzzVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzzVar);
        zzb(45, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setWatermarkEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
        zzb(51, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void getMapAsync(com.google.android.gms.maps.internal.zzap zzapVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzapVar);
        zzb(53, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onCreate(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        zzb(54, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onResume() throws android.os.RemoteException {
        zzb(55, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onPause() throws android.os.RemoteException {
        zzb(56, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onDestroy() throws android.os.RemoteException {
        zzb(57, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onLowMemory() throws android.os.RemoteException {
        zzb(58, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean useViewLifecycleWhenInFragment() throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza(59, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        android.os.Parcel parcelZza2 = zza(60, parcelZza);
        if (parcelZza2.readInt() != 0) {
            bundle.readFromParcel(parcelZza2);
        }
        parcelZza2.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setContentDescription(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(61, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshotForTest(com.google.android.gms.maps.internal.zzbs zzbsVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbsVar);
        zzb(71, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPoiClickListener(com.google.android.gms.maps.internal.zzbb zzbbVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbbVar);
        zzb(80, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        zzb(81, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onExitAmbient() throws android.os.RemoteException {
        zzb(82, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzx zzxVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzxVar);
        zzb(83, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzaf zzafVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzafVar);
        zzb(84, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolygonClickListener(com.google.android.gms.maps.internal.zzbd zzbdVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbdVar);
        zzb(85, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzadVar);
        zzb(86, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolylineClickListener(com.google.android.gms.maps.internal.zzbf zzbfVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbfVar);
        zzb(87, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCircleClickListener(com.google.android.gms.maps.internal.zzv zzvVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzvVar);
        zzb(89, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMinZoomPreference(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(92, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMaxZoomPreference(float f) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(93, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void resetMinMaxZoomPreference() throws android.os.RemoteException {
        zzb(94, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLatLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLngBounds);
        zzb(95, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zztVar);
        zzb(96, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveListener(com.google.android.gms.maps.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzrVar);
        zzb(97, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzpVar);
        zzb(98, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraIdleListener(com.google.android.gms.maps.internal.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zznVar);
        zzb(99, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setMapStyle(com.google.android.gms.maps.model.MapStyleOptions mapStyleOptions) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, mapStyleOptions);
        android.os.Parcel parcelZza2 = zza(91, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStart() throws android.os.RemoteException {
        zzb(101, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStop() throws android.os.RemoteException {
        zzb(102, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationClickListener(com.google.android.gms.maps.internal.zzaz zzazVar) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzazVar);
        zzb(107, parcelZza);
    }
}
