package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public class StreetViewPanoramaOrientation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewPanoramaOrientation> CREATOR = new com.google.android.gms.maps.model.zzp();
    public final float bearing;
    public final float tilt;

    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation");
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final com.google.android.gms.maps.model.StreetViewPanoramaOrientation build() {
            return new com.google.android.gms.maps.model.StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        this.tilt = f + 0.0f;
        this.bearing = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 2, this.tilt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder builder() {
        return new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder();
    }

    public static com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder builder(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder(streetViewPanoramaOrientation);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.StreetViewPanoramaOrientation)) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.gms.maps.model.StreetViewPanoramaOrientation) obj;
        return java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("tilt", java.lang.Float.valueOf(this.tilt)).add("bearing", java.lang.Float.valueOf(this.bearing)).toString();
    }
}
