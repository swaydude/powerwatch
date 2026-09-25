package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class PolylineOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PolylineOptions> CREATOR = new com.google.android.gms.maps.model.zzl();
    private int color;
    private float width;
    private float zzcs;
    private boolean zzct;
    private boolean zzcu;
    private final java.util.List<com.google.android.gms.maps.model.LatLng> zzdx;
    private boolean zzdz;
    private com.google.android.gms.maps.model.Cap zzec;
    private com.google.android.gms.maps.model.Cap zzed;
    private int zzee;
    private java.util.List<com.google.android.gms.maps.model.PatternItem> zzef;

    public PolylineOptions() {
        this.width = 10.0f;
        this.color = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzdz = false;
        this.zzcu = false;
        this.zzec = new com.google.android.gms.maps.model.ButtCap();
        this.zzed = new com.google.android.gms.maps.model.ButtCap();
        this.zzee = 0;
        this.zzef = null;
        this.zzdx = new java.util.ArrayList();
    }

    PolylineOptions(java.util.List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, com.google.android.gms.maps.model.Cap cap, com.google.android.gms.maps.model.Cap cap2, int i2, java.util.List<com.google.android.gms.maps.model.PatternItem> list2) {
        this.width = 10.0f;
        this.color = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzdz = false;
        this.zzcu = false;
        this.zzec = new com.google.android.gms.maps.model.ButtCap();
        this.zzed = new com.google.android.gms.maps.model.ButtCap();
        this.zzee = 0;
        this.zzef = null;
        this.zzdx = list;
        this.width = f;
        this.color = i;
        this.zzcs = f2;
        this.zzct = z;
        this.zzdz = z2;
        this.zzcu = z3;
        if (cap != null) {
            this.zzec = cap;
        }
        if (cap2 != null) {
            this.zzed = cap2;
        }
        this.zzee = i2;
        this.zzef = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, getJointType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.maps.model.PolylineOptions add(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzdx.add(latLng);
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions add(com.google.android.gms.maps.model.LatLng... latLngArr) {
        this.zzdx.addAll(java.util.Arrays.asList(latLngArr));
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions addAll(java.lang.Iterable<com.google.android.gms.maps.model.LatLng> iterable) {
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zzdx.add(it.next());
        }
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions width(float f) {
        this.width = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions color(int i) {
        this.color = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions startCap(com.google.android.gms.maps.model.Cap cap) {
        this.zzec = (com.google.android.gms.maps.model.Cap) com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions endCap(com.google.android.gms.maps.model.Cap cap) {
        this.zzed = (com.google.android.gms.maps.model.Cap) com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions jointType(int i) {
        this.zzee = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions pattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        this.zzef = list;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions geodesic(boolean z) {
        this.zzdz = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions clickable(boolean z) {
        this.zzcu = z;
        return this;
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        return this.zzdx;
    }

    public final float getWidth() {
        return this.width;
    }

    public final int getColor() {
        return this.color;
    }

    public final com.google.android.gms.maps.model.Cap getStartCap() {
        return this.zzec;
    }

    public final com.google.android.gms.maps.model.Cap getEndCap() {
        return this.zzed;
    }

    public final int getJointType() {
        return this.zzee;
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() {
        return this.zzef;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final boolean isGeodesic() {
        return this.zzdz;
    }

    public final boolean isClickable() {
        return this.zzcu;
    }
}
