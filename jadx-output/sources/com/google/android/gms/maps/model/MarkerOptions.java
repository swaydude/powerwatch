package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class MarkerOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.MarkerOptions> CREATOR = new com.google.android.gms.maps.model.zzh();
    private float alpha;
    private com.google.android.gms.maps.model.LatLng position;
    private float zzcs;
    private boolean zzct;
    private float zzdb;
    private float zzdc;
    private java.lang.String zzdn;
    private java.lang.String zzdo;
    private com.google.android.gms.maps.model.BitmapDescriptor zzdp;
    private boolean zzdq;
    private boolean zzdr;
    private float zzds;
    private float zzdt;
    private float zzdu;

    public MarkerOptions() {
        this.zzdb = 0.5f;
        this.zzdc = 1.0f;
        this.zzct = true;
        this.zzdr = false;
        this.zzds = 0.0f;
        this.zzdt = 0.5f;
        this.zzdu = 0.0f;
        this.alpha = 1.0f;
    }

    MarkerOptions(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.zzdb = 0.5f;
        this.zzdc = 1.0f;
        this.zzct = true;
        this.zzdr = false;
        this.zzds = 0.0f;
        this.zzdt = 0.5f;
        this.zzdu = 0.0f;
        this.alpha = 1.0f;
        this.position = latLng;
        this.zzdn = str;
        this.zzdo = str2;
        if (iBinder == null) {
            this.zzdp = null;
        } else {
            this.zzdp = new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zzdb = f;
        this.zzdc = f2;
        this.zzdq = z;
        this.zzct = z2;
        this.zzdr = z3;
        this.zzds = f3;
        this.zzdt = f4;
        this.zzdu = f5;
        this.alpha = f6;
        this.zzcs = f7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zzdp;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zzb().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.maps.model.MarkerOptions position(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.position = latLng;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions icon(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.zzdp = bitmapDescriptor;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions anchor(float f, float f2) {
        this.zzdb = f;
        this.zzdc = f2;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzdt = f;
        this.zzdu = f2;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions title(java.lang.String str) {
        this.zzdn = str;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions snippet(java.lang.String str) {
        this.zzdo = str;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions draggable(boolean z) {
        this.zzdq = z;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions flat(boolean z) {
        this.zzdr = z;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions rotation(float f) {
        this.zzds = f;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions alpha(float f) {
        this.alpha = f;
        return this;
    }

    public final com.google.android.gms.maps.model.LatLng getPosition() {
        return this.position;
    }

    public final java.lang.String getTitle() {
        return this.zzdn;
    }

    public final java.lang.String getSnippet() {
        return this.zzdo;
    }

    public final com.google.android.gms.maps.model.BitmapDescriptor getIcon() {
        return this.zzdp;
    }

    public final float getAnchorU() {
        return this.zzdb;
    }

    public final float getAnchorV() {
        return this.zzdc;
    }

    public final boolean isDraggable() {
        return this.zzdq;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final boolean isFlat() {
        return this.zzdr;
    }

    public final float getRotation() {
        return this.zzds;
    }

    public final float getInfoWindowAnchorU() {
        return this.zzdt;
    }

    public final float getInfoWindowAnchorV() {
        return this.zzdu;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getZIndex() {
        return this.zzcs;
    }
}
