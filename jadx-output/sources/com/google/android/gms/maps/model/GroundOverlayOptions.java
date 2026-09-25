package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class GroundOverlayOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.GroundOverlayOptions> CREATOR = new com.google.android.gms.maps.model.zzd();
    public static final float NO_DIMENSION = -1.0f;
    private float bearing;
    private float height;
    private float width;
    private float zzcs;
    private boolean zzct;
    private boolean zzcu;
    private com.google.android.gms.maps.model.BitmapDescriptor zzcx;
    private com.google.android.gms.maps.model.LatLng zzcy;
    private com.google.android.gms.maps.model.LatLngBounds zzcz;
    private float zzda;
    private float zzdb;
    private float zzdc;

    GroundOverlayOptions(android.os.IBinder iBinder, com.google.android.gms.maps.model.LatLng latLng, float f, float f2, com.google.android.gms.maps.model.LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzct = true;
        this.zzda = 0.0f;
        this.zzdb = 0.5f;
        this.zzdc = 0.5f;
        this.zzcu = false;
        this.zzcx = new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        this.zzcy = latLng;
        this.width = f;
        this.height = f2;
        this.zzcz = latLngBounds;
        this.bearing = f3;
        this.zzcs = f4;
        this.zzct = z;
        this.zzda = f5;
        this.zzdb = f6;
        this.zzdc = f7;
        this.zzcu = z2;
    }

    public GroundOverlayOptions() {
        this.zzct = true;
        this.zzda = 0.0f;
        this.zzdb = 0.5f;
        this.zzdc = 0.5f;
        this.zzcu = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zzcx.zzb().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions image(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.zzcx = bitmapDescriptor;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions anchor(float f, float f2) {
        this.zzdb = f;
        this.zzdc = f2;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions position(com.google.android.gms.maps.model.LatLng latLng, float f) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzcz == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.Preconditions.checkArgument(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        return zza(latLng, f, -1.0f);
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions position(com.google.android.gms.maps.model.LatLng latLng, float f, float f2) {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zzcz == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.Preconditions.checkArgument(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        com.google.android.gms.common.internal.Preconditions.checkArgument(f2 >= 0.0f, "Height must be non-negative");
        return zza(latLng, f, f2);
    }

    private final com.google.android.gms.maps.model.GroundOverlayOptions zza(com.google.android.gms.maps.model.LatLng latLng, float f, float f2) {
        this.zzcy = latLng;
        this.width = f;
        this.height = f2;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions positionFromBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        com.google.android.gms.maps.model.LatLng latLng = this.zzcy;
        boolean z = latLng == null;
        java.lang.String strValueOf = java.lang.String.valueOf(latLng);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 46);
        sb.append("Position has already been set using position: ");
        sb.append(strValueOf);
        com.google.android.gms.common.internal.Preconditions.checkState(z, sb.toString());
        this.zzcz = latLngBounds;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions bearing(float f) {
        this.bearing = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions transparency(float f) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.zzda = f;
        return this;
    }

    public final com.google.android.gms.maps.model.GroundOverlayOptions clickable(boolean z) {
        this.zzcu = z;
        return this;
    }

    public final com.google.android.gms.maps.model.BitmapDescriptor getImage() {
        return this.zzcx;
    }

    public final com.google.android.gms.maps.model.LatLng getLocation() {
        return this.zzcy;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final com.google.android.gms.maps.model.LatLngBounds getBounds() {
        return this.zzcz;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final float getTransparency() {
        return this.zzda;
    }

    public final float getAnchorU() {
        return this.zzdb;
    }

    public final float getAnchorV() {
        return this.zzdc;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final boolean isClickable() {
        return this.zzcu;
    }
}
