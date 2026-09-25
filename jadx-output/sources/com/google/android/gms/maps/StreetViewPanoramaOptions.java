package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class StreetViewPanoramaOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.StreetViewPanoramaOptions> CREATOR = new com.google.android.gms.maps.zzai();
    private java.lang.String panoId;
    private com.google.android.gms.maps.model.LatLng position;
    private java.lang.Boolean zzak;
    private java.lang.Boolean zzap;
    private com.google.android.gms.maps.model.StreetViewPanoramaCamera zzbx;
    private java.lang.Integer zzby;
    private java.lang.Boolean zzbz;
    private java.lang.Boolean zzca;
    private java.lang.Boolean zzcb;
    private com.google.android.gms.maps.model.StreetViewSource zzcc;

    StreetViewPanoramaOptions(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, java.lang.String str, com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num, byte b, byte b2, byte b3, byte b4, byte b5, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        this.zzbz = true;
        this.zzap = true;
        this.zzca = true;
        this.zzcb = true;
        this.zzcc = com.google.android.gms.maps.model.StreetViewSource.DEFAULT;
        this.zzbx = streetViewPanoramaCamera;
        this.position = latLng;
        this.zzby = num;
        this.panoId = str;
        this.zzbz = com.google.android.gms.maps.internal.zza.zza(b);
        this.zzap = com.google.android.gms.maps.internal.zza.zza(b2);
        this.zzca = com.google.android.gms.maps.internal.zza.zza(b3);
        this.zzcb = com.google.android.gms.maps.internal.zza.zza(b4);
        this.zzak = com.google.android.gms.maps.internal.zza.zza(b5);
        this.zzcc = streetViewSource;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzbz));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzap));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzca));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzcb));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzak));
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public StreetViewPanoramaOptions() {
        this.zzbz = true;
        this.zzap = true;
        this.zzca = true;
        this.zzcb = true;
        this.zzcc = com.google.android.gms.maps.model.StreetViewSource.DEFAULT;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions panoramaCamera(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zzbx = streetViewPanoramaCamera;
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions panoramaId(java.lang.String str) {
        this.panoId = str;
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng) {
        this.position = latLng;
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num) {
        this.position = latLng;
        this.zzby = num;
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng, java.lang.Integer num, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        this.position = latLng;
        this.zzby = num;
        this.zzcc = streetViewSource;
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions position(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.StreetViewSource streetViewSource) {
        this.position = latLng;
        this.zzcc = streetViewSource;
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.zzbz = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.zzap = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.zzca = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.zzcb = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.zzak = java.lang.Boolean.valueOf(z);
        return this;
    }

    public final com.google.android.gms.maps.model.StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zzbx;
    }

    public final com.google.android.gms.maps.model.LatLng getPosition() {
        return this.position;
    }

    public final java.lang.Integer getRadius() {
        return this.zzby;
    }

    public final com.google.android.gms.maps.model.StreetViewSource getSource() {
        return this.zzcc;
    }

    public final java.lang.String getPanoramaId() {
        return this.panoId;
    }

    public final java.lang.Boolean getUserNavigationEnabled() {
        return this.zzbz;
    }

    public final java.lang.Boolean getZoomGesturesEnabled() {
        return this.zzap;
    }

    public final java.lang.Boolean getPanningGesturesEnabled() {
        return this.zzca;
    }

    public final java.lang.Boolean getStreetNamesEnabled() {
        return this.zzcb;
    }

    public final java.lang.Boolean getUseViewLifecycleInFragment() {
        return this.zzak;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("PanoramaId", this.panoId).add("Position", this.position).add("Radius", this.zzby).add("Source", this.zzcc).add("StreetViewPanoramaCamera", this.zzbx).add("UserNavigationEnabled", this.zzbz).add("ZoomGesturesEnabled", this.zzap).add("PanningGesturesEnabled", this.zzca).add("StreetNamesEnabled", this.zzcb).add("UseViewLifecycleInFragment", this.zzak).toString();
    }
}
