package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleMap {
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final com.google.android.gms.maps.internal.IGoogleMapDelegate zzg;
    private com.google.android.gms.maps.UiSettings zzh;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        android.view.View getInfoContents(com.google.android.gms.maps.model.Marker marker);

        android.view.View getInfoWindow(com.google.android.gms.maps.model.Marker marker);
    }

    @java.lang.Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i);
    }

    public interface OnCircleClickListener {
        void onCircleClick(com.google.android.gms.maps.model.Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(com.google.android.gms.maps.model.Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(com.google.android.gms.maps.model.Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(com.google.android.gms.maps.model.LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(com.google.android.gms.maps.model.LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(com.google.android.gms.maps.model.Marker marker);

        void onMarkerDragEnd(com.google.android.gms.maps.model.Marker marker);

        void onMarkerDragStart(com.google.android.gms.maps.model.Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @java.lang.Deprecated
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(android.location.Location location);
    }

    public interface OnMyLocationClickListener {
        void onMyLocationClick(android.location.Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(com.google.android.gms.maps.model.PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(com.google.android.gms.maps.model.Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(com.google.android.gms.maps.model.Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(android.graphics.Bitmap bitmap);
    }

    public GoogleMap(com.google.android.gms.maps.internal.IGoogleMapDelegate iGoogleMapDelegate) {
        this.zzg = (com.google.android.gms.maps.internal.IGoogleMapDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iGoogleMapDelegate);
    }

    private static final class zza extends com.google.android.gms.maps.internal.zzd {
        private final com.google.android.gms.maps.GoogleMap.CancelableCallback zzai;

        zza(com.google.android.gms.maps.GoogleMap.CancelableCallback cancelableCallback) {
            this.zzai = cancelableCallback;
        }

        @Override // com.google.android.gms.maps.internal.zzc
        public final void onFinish() {
            this.zzai.onFinish();
        }

        @Override // com.google.android.gms.maps.internal.zzc
        public final void onCancel() {
            this.zzai.onCancel();
        }
    }

    public final com.google.android.gms.maps.model.CameraPosition getCameraPosition() {
        try {
            return this.zzg.getCameraPosition();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.zzg.getMaxZoomLevel();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.zzg.getMinZoomLevel();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate) {
        try {
            this.zzg.moveCamera(cameraUpdate.zzb());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate) {
        try {
            this.zzg.animateCamera(cameraUpdate.zzb());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate, com.google.android.gms.maps.GoogleMap.CancelableCallback cancelableCallback) {
        try {
            this.zzg.animateCameraWithCallback(cameraUpdate.zzb(), cancelableCallback == null ? null : new com.google.android.gms.maps.GoogleMap.zza(cancelableCallback));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate, int i, com.google.android.gms.maps.GoogleMap.CancelableCallback cancelableCallback) {
        try {
            this.zzg.animateCameraWithDurationAndCallback(cameraUpdate.zzb(), i, cancelableCallback == null ? null : new com.google.android.gms.maps.GoogleMap.zza(cancelableCallback));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.zzg.stopAnimation();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Polyline addPolyline(com.google.android.gms.maps.model.PolylineOptions polylineOptions) {
        try {
            return new com.google.android.gms.maps.model.Polyline(this.zzg.addPolyline(polylineOptions));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Polygon addPolygon(com.google.android.gms.maps.model.PolygonOptions polygonOptions) {
        try {
            return new com.google.android.gms.maps.model.Polygon(this.zzg.addPolygon(polygonOptions));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Circle addCircle(com.google.android.gms.maps.model.CircleOptions circleOptions) {
        try {
            return new com.google.android.gms.maps.model.Circle(this.zzg.addCircle(circleOptions));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Marker addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) {
        try {
            com.google.android.gms.internal.maps.zzt zztVarAddMarker = this.zzg.addMarker(markerOptions);
            if (zztVarAddMarker != null) {
                return new com.google.android.gms.maps.model.Marker(zztVarAddMarker);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.GroundOverlay addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) {
        try {
            com.google.android.gms.internal.maps.zzk zzkVarAddGroundOverlay = this.zzg.addGroundOverlay(groundOverlayOptions);
            if (zzkVarAddGroundOverlay != null) {
                return new com.google.android.gms.maps.model.GroundOverlay(zzkVarAddGroundOverlay);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.TileOverlay addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) {
        try {
            com.google.android.gms.internal.maps.zzac zzacVarAddTileOverlay = this.zzg.addTileOverlay(tileOverlayOptions);
            if (zzacVarAddTileOverlay != null) {
                return new com.google.android.gms.maps.model.TileOverlay(zzacVarAddTileOverlay);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.zzg.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.IndoorBuilding getFocusedBuilding() {
        try {
            com.google.android.gms.internal.maps.zzn focusedBuilding = this.zzg.getFocusedBuilding();
            if (focusedBuilding != null) {
                return new com.google.android.gms.maps.model.IndoorBuilding(focusedBuilding);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnIndoorStateChangeListener(com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        try {
            if (onIndoorStateChangeListener == null) {
                this.zzg.setOnIndoorStateChangeListener(null);
            } else {
                this.zzg.setOnIndoorStateChangeListener(new com.google.android.gms.maps.zza(this, onIndoorStateChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.zzg.getMapType();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMapType(int i) {
        try {
            this.zzg.setMapType(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zzg.isTrafficEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.zzg.setTrafficEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.zzg.isIndoorEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.zzg.setIndoorEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.zzg.isBuildingsEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setBuildingsEnabled(boolean z) {
        try {
            this.zzg.setBuildingsEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zzg.isMyLocationEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.zzg.setMyLocationEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @java.lang.Deprecated
    public final android.location.Location getMyLocation() {
        try {
            return this.zzg.getMyLocation();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setLocationSource(com.google.android.gms.maps.LocationSource locationSource) {
        try {
            if (locationSource == null) {
                this.zzg.setLocationSource(null);
            } else {
                this.zzg.setLocationSource(new com.google.android.gms.maps.zzl(this, locationSource));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.UiSettings getUiSettings() {
        try {
            if (this.zzh == null) {
                this.zzh = new com.google.android.gms.maps.UiSettings(this.zzg.getUiSettings());
            }
            return this.zzh;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.Projection getProjection() {
        try {
            return new com.google.android.gms.maps.Projection(this.zzg.getProjection());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @java.lang.Deprecated
    public final void setOnCameraChangeListener(com.google.android.gms.maps.GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        try {
            if (onCameraChangeListener == null) {
                this.zzg.setOnCameraChangeListener(null);
            } else {
                this.zzg.setOnCameraChangeListener(new com.google.android.gms.maps.zzt(this, onCameraChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveStartedListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        try {
            if (onCameraMoveStartedListener == null) {
                this.zzg.setOnCameraMoveStartedListener(null);
            } else {
                this.zzg.setOnCameraMoveStartedListener(new com.google.android.gms.maps.zzu(this, onCameraMoveStartedListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        try {
            if (onCameraMoveListener == null) {
                this.zzg.setOnCameraMoveListener(null);
            } else {
                this.zzg.setOnCameraMoveListener(new com.google.android.gms.maps.zzv(this, onCameraMoveListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveCanceledListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        try {
            if (onCameraMoveCanceledListener == null) {
                this.zzg.setOnCameraMoveCanceledListener(null);
            } else {
                this.zzg.setOnCameraMoveCanceledListener(new com.google.android.gms.maps.zzw(this, onCameraMoveCanceledListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraIdleListener(com.google.android.gms.maps.GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        try {
            if (onCameraIdleListener == null) {
                this.zzg.setOnCameraIdleListener(null);
            } else {
                this.zzg.setOnCameraIdleListener(new com.google.android.gms.maps.zzx(this, onCameraIdleListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMapClickListener(com.google.android.gms.maps.GoogleMap.OnMapClickListener onMapClickListener) {
        try {
            if (onMapClickListener == null) {
                this.zzg.setOnMapClickListener(null);
            } else {
                this.zzg.setOnMapClickListener(new com.google.android.gms.maps.zzy(this, onMapClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMapLongClickListener(com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        try {
            if (onMapLongClickListener == null) {
                this.zzg.setOnMapLongClickListener(null);
            } else {
                this.zzg.setOnMapLongClickListener(new com.google.android.gms.maps.zzz(this, onMapLongClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        try {
            if (onMarkerClickListener == null) {
                this.zzg.setOnMarkerClickListener(null);
            } else {
                this.zzg.setOnMarkerClickListener(new com.google.android.gms.maps.zzb(this, onMarkerClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMarkerDragListener(com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        try {
            if (onMarkerDragListener == null) {
                this.zzg.setOnMarkerDragListener(null);
            } else {
                this.zzg.setOnMarkerDragListener(new com.google.android.gms.maps.zzc(this, onMarkerDragListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        try {
            if (onInfoWindowClickListener == null) {
                this.zzg.setOnInfoWindowClickListener(null);
            } else {
                this.zzg.setOnInfoWindowClickListener(new com.google.android.gms.maps.zzd(this, onInfoWindowClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnInfoWindowLongClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        try {
            if (onInfoWindowLongClickListener == null) {
                this.zzg.setOnInfoWindowLongClickListener(null);
            } else {
                this.zzg.setOnInfoWindowLongClickListener(new com.google.android.gms.maps.zze(this, onInfoWindowLongClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnInfoWindowCloseListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        try {
            if (onInfoWindowCloseListener == null) {
                this.zzg.setOnInfoWindowCloseListener(null);
            } else {
                this.zzg.setOnInfoWindowCloseListener(new com.google.android.gms.maps.zzf(this, onInfoWindowCloseListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        try {
            if (infoWindowAdapter == null) {
                this.zzg.setInfoWindowAdapter(null);
            } else {
                this.zzg.setInfoWindowAdapter(new com.google.android.gms.maps.zzg(this, infoWindowAdapter));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @java.lang.Deprecated
    public final void setOnMyLocationChangeListener(com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        try {
            if (onMyLocationChangeListener == null) {
                this.zzg.setOnMyLocationChangeListener(null);
            } else {
                this.zzg.setOnMyLocationChangeListener(new com.google.android.gms.maps.zzh(this, onMyLocationChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMyLocationButtonClickListener(com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        try {
            if (onMyLocationButtonClickListener == null) {
                this.zzg.setOnMyLocationButtonClickListener(null);
            } else {
                this.zzg.setOnMyLocationButtonClickListener(new com.google.android.gms.maps.zzi(this, onMyLocationButtonClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMyLocationClickListener(com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        try {
            if (onMyLocationClickListener == null) {
                this.zzg.setOnMyLocationClickListener(null);
            } else {
                this.zzg.setOnMyLocationClickListener(new com.google.android.gms.maps.zzj(this, onMyLocationClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMapLoadedCallback(com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        try {
            if (onMapLoadedCallback == null) {
                this.zzg.setOnMapLoadedCallback(null);
            } else {
                this.zzg.setOnMapLoadedCallback(new com.google.android.gms.maps.zzk(this, onMapLoadedCallback));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnGroundOverlayClickListener(com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        try {
            if (onGroundOverlayClickListener == null) {
                this.zzg.setOnGroundOverlayClickListener(null);
            } else {
                this.zzg.setOnGroundOverlayClickListener(new com.google.android.gms.maps.zzn(this, onGroundOverlayClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCircleClickListener(com.google.android.gms.maps.GoogleMap.OnCircleClickListener onCircleClickListener) {
        try {
            if (onCircleClickListener == null) {
                this.zzg.setOnCircleClickListener(null);
            } else {
                this.zzg.setOnCircleClickListener(new com.google.android.gms.maps.zzo(this, onCircleClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnPolygonClickListener(com.google.android.gms.maps.GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        try {
            if (onPolygonClickListener == null) {
                this.zzg.setOnPolygonClickListener(null);
            } else {
                this.zzg.setOnPolygonClickListener(new com.google.android.gms.maps.zzp(this, onPolygonClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnPolylineClickListener(com.google.android.gms.maps.GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        try {
            if (onPolylineClickListener == null) {
                this.zzg.setOnPolylineClickListener(null);
            } else {
                this.zzg.setOnPolylineClickListener(new com.google.android.gms.maps.zzq(this, onPolylineClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void snapshot(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        snapshot(snapshotReadyCallback, null);
    }

    public final void snapshot(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap bitmap) {
        try {
            this.zzg.snapshot(new com.google.android.gms.maps.zzr(this, snapshotReadyCallback), (com.google.android.gms.dynamic.ObjectWrapper) (bitmap != null ? com.google.android.gms.dynamic.ObjectWrapper.wrap(bitmap) : null));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.zzg.setPadding(i, i2, i3, i4);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setContentDescription(java.lang.String str) {
        try {
            this.zzg.setContentDescription(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnPoiClickListener(com.google.android.gms.maps.GoogleMap.OnPoiClickListener onPoiClickListener) {
        try {
            if (onPoiClickListener == null) {
                this.zzg.setOnPoiClickListener(null);
            } else {
                this.zzg.setOnPoiClickListener(new com.google.android.gms.maps.zzs(this, onPoiClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean setMapStyle(com.google.android.gms.maps.model.MapStyleOptions mapStyleOptions) {
        try {
            return this.zzg.setMapStyle(mapStyleOptions);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMinZoomPreference(float f) {
        try {
            this.zzg.setMinZoomPreference(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMaxZoomPreference(float f) {
        try {
            this.zzg.setMaxZoomPreference(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void resetMinMaxZoomPreference() {
        try {
            this.zzg.resetMinMaxZoomPreference();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setLatLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        try {
            this.zzg.setLatLngBoundsForCameraTarget(latLngBounds);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
