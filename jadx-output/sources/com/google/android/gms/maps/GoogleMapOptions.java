package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleMapOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.GoogleMapOptions> CREATOR = new com.google.android.gms.maps.zzaa();
    private int mapType;
    private java.lang.Boolean zzaj;
    private java.lang.Boolean zzak;
    private com.google.android.gms.maps.model.CameraPosition zzal;
    private java.lang.Boolean zzam;
    private java.lang.Boolean zzan;
    private java.lang.Boolean zzao;
    private java.lang.Boolean zzap;
    private java.lang.Boolean zzaq;
    private java.lang.Boolean zzar;
    private java.lang.Boolean zzas;
    private java.lang.Boolean zzat;
    private java.lang.Boolean zzau;
    private java.lang.Float zzav;
    private java.lang.Float zzaw;
    private com.google.android.gms.maps.model.LatLngBounds zzax;
    private java.lang.Boolean zzay;

    GoogleMapOptions(byte b, byte b2, int i, com.google.android.gms.maps.model.CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, java.lang.Float f, java.lang.Float f2, com.google.android.gms.maps.model.LatLngBounds latLngBounds, byte b12) {
        this.mapType = -1;
        this.zzav = null;
        this.zzaw = null;
        this.zzax = null;
        this.zzaj = com.google.android.gms.maps.internal.zza.zza(b);
        this.zzak = com.google.android.gms.maps.internal.zza.zza(b2);
        this.mapType = i;
        this.zzal = cameraPosition;
        this.zzam = com.google.android.gms.maps.internal.zza.zza(b3);
        this.zzan = com.google.android.gms.maps.internal.zza.zza(b4);
        this.zzao = com.google.android.gms.maps.internal.zza.zza(b5);
        this.zzap = com.google.android.gms.maps.internal.zza.zza(b6);
        this.zzaq = com.google.android.gms.maps.internal.zza.zza(b7);
        this.zzar = com.google.android.gms.maps.internal.zza.zza(b8);
        this.zzas = com.google.android.gms.maps.internal.zza.zza(b9);
        this.zzat = com.google.android.gms.maps.internal.zza.zza(b10);
        this.zzau = com.google.android.gms.maps.internal.zza.zza(b11);
        this.zzav = f;
        this.zzaw = f2;
        this.zzax = latLngBounds;
        this.zzay = com.google.android.gms.maps.internal.zza.zza(b12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzaj));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzak));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getMapType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzam));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzan));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzao));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzap));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzaq));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzar));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzas));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzat));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzau));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzay));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public GoogleMapOptions() {
        this.mapType = -1;
        this.zzav = null;
        this.zzaw = null;
        this.zzax = null;
    }

    public final com.google.android.gms.maps.GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzaj = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzak = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions mapType(int i) {
        this.mapType = i;
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions camera(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        this.zzal = cameraPosition;
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzam = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions compassEnabled(boolean z) {
        this.zzan = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzao = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzap = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzaq = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzar = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzay = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions liteMode(boolean z) {
        this.zzas = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzat = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions ambientEnabled(boolean z) {
        this.zzau = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions minZoomPreference(float f) {
        this.zzav = java.lang.Float.valueOf(f);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions maxZoomPreference(float f) {
        this.zzaw = java.lang.Float.valueOf(f);
        return this;
    }

    public final com.google.android.gms.maps.GoogleMapOptions latLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        this.zzax = latLngBounds;
        return this;
    }

    public final java.lang.Boolean getZOrderOnTop() {
        return this.zzaj;
    }

    public final java.lang.Boolean getUseViewLifecycleInFragment() {
        return this.zzak;
    }

    public final int getMapType() {
        return this.mapType;
    }

    public final com.google.android.gms.maps.model.CameraPosition getCamera() {
        return this.zzal;
    }

    public final java.lang.Boolean getZoomControlsEnabled() {
        return this.zzam;
    }

    public final java.lang.Boolean getCompassEnabled() {
        return this.zzan;
    }

    public final java.lang.Boolean getScrollGesturesEnabled() {
        return this.zzao;
    }

    public final java.lang.Boolean getZoomGesturesEnabled() {
        return this.zzap;
    }

    public final java.lang.Boolean getTiltGesturesEnabled() {
        return this.zzaq;
    }

    public final java.lang.Boolean getRotateGesturesEnabled() {
        return this.zzar;
    }

    public final java.lang.Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzay;
    }

    public final java.lang.Boolean getLiteMode() {
        return this.zzas;
    }

    public final java.lang.Boolean getMapToolbarEnabled() {
        return this.zzat;
    }

    public final java.lang.Boolean getAmbientEnabled() {
        return this.zzau;
    }

    public final java.lang.Float getMinZoomPreference() {
        return this.zzav;
    }

    public final java.lang.Float getMaxZoomPreference() {
        return this.zzaw;
    }

    public final com.google.android.gms.maps.model.LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzax;
    }

    public static com.google.android.gms.maps.GoogleMapOptions createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.R.styleable.MapAttrs);
        com.google.android.gms.maps.GoogleMapOptions googleMapOptions = new com.google.android.gms.maps.GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(com.google.android.gms.maps.R.styleable.MapAttrs_mapType, -1));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiCompass, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_liteMode, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(com.google.android.gms.maps.R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zza(context, attributeSet));
        googleMapOptions.camera(zzb(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static com.google.android.gms.maps.model.LatLngBounds zza(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.R.styleable.MapAttrs);
        java.lang.Float fValueOf = typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? java.lang.Float.valueOf(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        java.lang.Float fValueOf2 = typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? java.lang.Float.valueOf(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        java.lang.Float fValueOf3 = typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? java.lang.Float.valueOf(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        java.lang.Float fValueOf4 = typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? java.lang.Float.valueOf(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new com.google.android.gms.maps.model.LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public static com.google.android.gms.maps.model.CameraPosition zzb(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.maps.R.styleable.MapAttrs);
        com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        com.google.android.gms.maps.model.CameraPosition.Builder builder = com.google.android.gms.maps.model.CameraPosition.builder();
        builder.target(latLng);
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(com.google.android.gms.maps.R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("MapType", java.lang.Integer.valueOf(this.mapType)).add("LiteMode", this.zzas).add("Camera", this.zzal).add("CompassEnabled", this.zzan).add("ZoomControlsEnabled", this.zzam).add("ScrollGesturesEnabled", this.zzao).add("ZoomGesturesEnabled", this.zzap).add("TiltGesturesEnabled", this.zzaq).add("RotateGesturesEnabled", this.zzar).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzay).add("MapToolbarEnabled", this.zzat).add("AmbientEnabled", this.zzau).add("MinZoomPreference", this.zzav).add("MaxZoomPreference", this.zzaw).add("LatLngBoundsForCameraTarget", this.zzax).add("ZOrderOnTop", this.zzaj).add("UseViewLifecycleInFragment", this.zzak).toString();
    }
}
