package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class CircleOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.CircleOptions> CREATOR = new com.google.android.gms.maps.model.zzc();
    private int fillColor;
    private int strokeColor;
    private com.google.android.gms.maps.model.LatLng zzcp;
    private double zzcq;
    private float zzcr;
    private float zzcs;
    private boolean zzct;
    private boolean zzcu;
    private java.util.List<com.google.android.gms.maps.model.PatternItem> zzcv;

    public CircleOptions() {
        this.zzcp = null;
        this.zzcq = 0.0d;
        this.zzcr = 10.0f;
        this.strokeColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.fillColor = 0;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzcu = false;
        this.zzcv = null;
    }

    CircleOptions(com.google.android.gms.maps.model.LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        this.zzcp = null;
        this.zzcq = 0.0d;
        this.zzcr = 10.0f;
        this.strokeColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.fillColor = 0;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzcu = false;
        this.zzcv = null;
        this.zzcp = latLng;
        this.zzcq = d;
        this.zzcr = f;
        this.strokeColor = i;
        this.fillColor = i2;
        this.zzcs = f2;
        this.zzct = z;
        this.zzcu = z2;
        this.zzcv = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.maps.model.CircleOptions center(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzcp = latLng;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions radius(double d) {
        this.zzcq = d;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions strokeWidth(float f) {
        this.zzcr = f;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions strokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        this.zzcv = list;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final com.google.android.gms.maps.model.CircleOptions clickable(boolean z) {
        this.zzcu = z;
        return this;
    }

    public final com.google.android.gms.maps.model.LatLng getCenter() {
        return this.zzcp;
    }

    public final double getRadius() {
        return this.zzcq;
    }

    public final float getStrokeWidth() {
        return this.zzcr;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getStrokePattern() {
        return this.zzcv;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final boolean isClickable() {
        return this.zzcu;
    }
}
