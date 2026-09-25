package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class PolygonOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PolygonOptions> CREATOR = new com.google.android.gms.maps.model.zzk();
    private int fillColor;
    private int strokeColor;
    private float zzcr;
    private float zzcs;
    private boolean zzct;
    private boolean zzcu;
    private java.util.List<com.google.android.gms.maps.model.PatternItem> zzcv;
    private final java.util.List<com.google.android.gms.maps.model.LatLng> zzdx;
    private final java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> zzdy;
    private boolean zzdz;
    private int zzea;

    public PolygonOptions() {
        this.zzcr = 10.0f;
        this.strokeColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.fillColor = 0;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzdz = false;
        this.zzcu = false;
        this.zzea = 0;
        this.zzcv = null;
        this.zzdx = new java.util.ArrayList();
        this.zzdy = new java.util.ArrayList();
    }

    PolygonOptions(java.util.List<com.google.android.gms.maps.model.LatLng> list, java.util.List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, java.util.List<com.google.android.gms.maps.model.PatternItem> list3) {
        this.zzcr = 10.0f;
        this.strokeColor = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.fillColor = 0;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzdz = false;
        this.zzcu = false;
        this.zzea = 0;
        this.zzcv = null;
        this.zzdx = list;
        this.zzdy = list2;
        this.zzcr = f;
        this.strokeColor = i;
        this.fillColor = i2;
        this.zzcs = f2;
        this.zzct = z;
        this.zzdz = z2;
        this.zzcu = z3;
        this.zzea = i3;
        this.zzcv = list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, this.zzdy, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.maps.model.PolygonOptions add(com.google.android.gms.maps.model.LatLng latLng) {
        this.zzdx.add(latLng);
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions add(com.google.android.gms.maps.model.LatLng... latLngArr) {
        this.zzdx.addAll(java.util.Arrays.asList(latLngArr));
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions addAll(java.lang.Iterable<com.google.android.gms.maps.model.LatLng> iterable) {
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zzdx.add(it.next());
        }
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions addHole(java.lang.Iterable<com.google.android.gms.maps.model.LatLng> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzdy.add(arrayList);
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokeWidth(float f) {
        this.zzcr = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokeJointType(int i) {
        this.zzea = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        this.zzcv = list;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions zIndex(float f) {
        this.zzcs = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions visible(boolean z) {
        this.zzct = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions geodesic(boolean z) {
        this.zzdz = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions clickable(boolean z) {
        this.zzcu = z;
        return this;
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        return this.zzdx;
    }

    public final java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> getHoles() {
        return this.zzdy;
    }

    public final float getStrokeWidth() {
        return this.zzcr;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeJointType() {
        return this.zzea;
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

    public final boolean isGeodesic() {
        return this.zzdz;
    }

    public final boolean isClickable() {
        return this.zzcu;
    }
}
