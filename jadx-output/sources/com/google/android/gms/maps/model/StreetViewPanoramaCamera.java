package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public class StreetViewPanoramaCamera extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewPanoramaCamera> CREATOR = new com.google.android.gms.maps.model.zzm();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final com.google.android.gms.maps.model.StreetViewPanoramaOrientation zzeg;

    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder orientation(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation");
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaCamera build() {
            return new com.google.android.gms.maps.model.StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        this.zoom = ((double) f) <= 0.0d ? 0.0f : f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.zzeg = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder().tilt(f2).bearing(f3).build();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, this.zoom);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder builder() {
        return new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder();
    }

    public static com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder(streetViewPanoramaCamera);
    }

    public com.google.android.gms.maps.model.StreetViewPanoramaOrientation getOrientation() {
        return this.zzeg;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(this.zoom), java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.StreetViewPanoramaCamera)) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) obj;
        return java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("zoom", java.lang.Float.valueOf(this.zoom)).add("tilt", java.lang.Float.valueOf(this.tilt)).add("bearing", java.lang.Float.valueOf(this.bearing)).toString();
    }
}
