package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes.dex */
public interface IGoogleMapDelegate extends android.os.IInterface {
    com.google.android.gms.internal.maps.zzh addCircle(com.google.android.gms.maps.model.CircleOptions circleOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzk addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzt addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzw addPolygon(com.google.android.gms.maps.model.PolygonOptions polygonOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzz addPolyline(com.google.android.gms.maps.model.PolylineOptions polylineOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzac addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) throws android.os.RemoteException;

    void animateCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void animateCameraWithCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.internal.zzc zzcVar) throws android.os.RemoteException;

    void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i, com.google.android.gms.maps.internal.zzc zzcVar) throws android.os.RemoteException;

    void clear() throws android.os.RemoteException;

    com.google.android.gms.maps.model.CameraPosition getCameraPosition() throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzn getFocusedBuilding() throws android.os.RemoteException;

    void getMapAsync(com.google.android.gms.maps.internal.zzap zzapVar) throws android.os.RemoteException;

    int getMapType() throws android.os.RemoteException;

    float getMaxZoomLevel() throws android.os.RemoteException;

    float getMinZoomLevel() throws android.os.RemoteException;

    android.location.Location getMyLocation() throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IProjectionDelegate getProjection() throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IUiSettingsDelegate getUiSettings() throws android.os.RemoteException;

    boolean isBuildingsEnabled() throws android.os.RemoteException;

    boolean isIndoorEnabled() throws android.os.RemoteException;

    boolean isMyLocationEnabled() throws android.os.RemoteException;

    boolean isTrafficEnabled() throws android.os.RemoteException;

    void moveCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void onCreate(android.os.Bundle bundle) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException;

    void onExitAmbient() throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;

    void resetMinMaxZoomPreference() throws android.os.RemoteException;

    void setBuildingsEnabled(boolean z) throws android.os.RemoteException;

    void setContentDescription(java.lang.String str) throws android.os.RemoteException;

    boolean setIndoorEnabled(boolean z) throws android.os.RemoteException;

    void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzh zzhVar) throws android.os.RemoteException;

    void setLatLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException;

    void setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate iLocationSourceDelegate) throws android.os.RemoteException;

    boolean setMapStyle(com.google.android.gms.maps.model.MapStyleOptions mapStyleOptions) throws android.os.RemoteException;

    void setMapType(int i) throws android.os.RemoteException;

    void setMaxZoomPreference(float f) throws android.os.RemoteException;

    void setMinZoomPreference(float f) throws android.os.RemoteException;

    void setMyLocationEnabled(boolean z) throws android.os.RemoteException;

    void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzl zzlVar) throws android.os.RemoteException;

    void setOnCameraIdleListener(com.google.android.gms.maps.internal.zzn zznVar) throws android.os.RemoteException;

    void setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzp zzpVar) throws android.os.RemoteException;

    void setOnCameraMoveListener(com.google.android.gms.maps.internal.zzr zzrVar) throws android.os.RemoteException;

    void setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzt zztVar) throws android.os.RemoteException;

    void setOnCircleClickListener(com.google.android.gms.maps.internal.zzv zzvVar) throws android.os.RemoteException;

    void setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzx zzxVar) throws android.os.RemoteException;

    void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzz zzzVar) throws android.os.RemoteException;

    void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzab zzabVar) throws android.os.RemoteException;

    void setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzad zzadVar) throws android.os.RemoteException;

    void setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzaf zzafVar) throws android.os.RemoteException;

    void setOnMapClickListener(com.google.android.gms.maps.internal.zzaj zzajVar) throws android.os.RemoteException;

    void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzal zzalVar) throws android.os.RemoteException;

    void setOnMapLongClickListener(com.google.android.gms.maps.internal.zzan zzanVar) throws android.os.RemoteException;

    void setOnMarkerClickListener(com.google.android.gms.maps.internal.zzar zzarVar) throws android.os.RemoteException;

    void setOnMarkerDragListener(com.google.android.gms.maps.internal.zzat zzatVar) throws android.os.RemoteException;

    void setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzav zzavVar) throws android.os.RemoteException;

    void setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzax zzaxVar) throws android.os.RemoteException;

    void setOnMyLocationClickListener(com.google.android.gms.maps.internal.zzaz zzazVar) throws android.os.RemoteException;

    void setOnPoiClickListener(com.google.android.gms.maps.internal.zzbb zzbbVar) throws android.os.RemoteException;

    void setOnPolygonClickListener(com.google.android.gms.maps.internal.zzbd zzbdVar) throws android.os.RemoteException;

    void setOnPolylineClickListener(com.google.android.gms.maps.internal.zzbf zzbfVar) throws android.os.RemoteException;

    void setPadding(int i, int i2, int i3, int i4) throws android.os.RemoteException;

    void setTrafficEnabled(boolean z) throws android.os.RemoteException;

    void setWatermarkEnabled(boolean z) throws android.os.RemoteException;

    void snapshot(com.google.android.gms.maps.internal.zzbs zzbsVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void snapshotForTest(com.google.android.gms.maps.internal.zzbs zzbsVar) throws android.os.RemoteException;

    void stopAnimation() throws android.os.RemoteException;

    boolean useViewLifecycleWhenInFragment() throws android.os.RemoteException;
}
