package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class CameraPosition extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.CameraPosition> CREATOR = new com.google.android.gms.maps.model.zza();
    public final float bearing;
    public final com.google.android.gms.maps.model.LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {
        private float bearing;
        private com.google.android.gms.maps.model.LatLng target;
        private float tilt;
        private float zoom;

        public Builder() {
        }

        public Builder(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
            this.target = cameraPosition.target;
            this.zoom = cameraPosition.zoom;
            this.tilt = cameraPosition.tilt;
            this.bearing = cameraPosition.bearing;
        }

        public final com.google.android.gms.maps.model.CameraPosition.Builder target(com.google.android.gms.maps.model.LatLng latLng) {
            this.target = latLng;
            return this;
        }

        public final com.google.android.gms.maps.model.CameraPosition.Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public final com.google.android.gms.maps.model.CameraPosition.Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public final com.google.android.gms.maps.model.CameraPosition.Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final com.google.android.gms.maps.model.CameraPosition build() {
            return new com.google.android.gms.maps.model.CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
        }
    }

    public CameraPosition(com.google.android.gms.maps.model.LatLng latLng, float f, float f2, float f3) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "null camera target");
        com.google.android.gms.common.internal.Preconditions.checkArgument(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", java.lang.Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.target, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, this.zoom);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, this.tilt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, this.bearing);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.target, java.lang.Float.valueOf(this.zoom), java.lang.Float.valueOf(this.tilt), java.lang.Float.valueOf(this.bearing));
    }

    public static final com.google.android.gms.maps.model.CameraPosition fromLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) {
        return new com.google.android.gms.maps.model.CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public static com.google.android.gms.maps.model.CameraPosition.Builder builder() {
        return new com.google.android.gms.maps.model.CameraPosition.Builder();
    }

    public static com.google.android.gms.maps.model.CameraPosition.Builder builder(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        return new com.google.android.gms.maps.model.CameraPosition.Builder(cameraPosition);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.CameraPosition)) {
            return false;
        }
        com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && java.lang.Float.floatToIntBits(this.zoom) == java.lang.Float.floatToIntBits(cameraPosition.zoom) && java.lang.Float.floatToIntBits(this.tilt) == java.lang.Float.floatToIntBits(cameraPosition.tilt) && java.lang.Float.floatToIntBits(this.bearing) == java.lang.Float.floatToIntBits(cameraPosition.bearing);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("target", this.target).add("zoom", java.lang.Float.valueOf(this.zoom)).add("tilt", java.lang.Float.valueOf(this.tilt)).add("bearing", java.lang.Float.valueOf(this.bearing)).toString();
    }

    public static com.google.android.gms.maps.model.CameraPosition createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return com.google.android.gms.maps.GoogleMapOptions.zzb(context, attributeSet);
    }
}
