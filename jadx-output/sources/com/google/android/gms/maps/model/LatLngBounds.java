package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class LatLngBounds extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.LatLngBounds> CREATOR = new com.google.android.gms.maps.model.zze();
    public final com.google.android.gms.maps.model.LatLng northeast;
    public final com.google.android.gms.maps.model.LatLng southwest;

    public LatLngBounds(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.LatLng latLng2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "null southwest");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng2, "null northeast");
        com.google.android.gms.common.internal.Preconditions.checkArgument(latLng2.latitude >= latLng.latitude, "southern latitude exceeds northern latitude (%s > %s)", java.lang.Double.valueOf(latLng.latitude), java.lang.Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double zza(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double zzb(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public static final class Builder {
        private double zzdh = Double.POSITIVE_INFINITY;
        private double zzdi = Double.NEGATIVE_INFINITY;
        private double zzdj = Double.NaN;
        private double zzdk = Double.NaN;

        public final com.google.android.gms.maps.model.LatLngBounds.Builder include(com.google.android.gms.maps.model.LatLng latLng) {
            this.zzdh = java.lang.Math.min(this.zzdh, latLng.latitude);
            this.zzdi = java.lang.Math.max(this.zzdi, latLng.latitude);
            double d = latLng.longitude;
            if (java.lang.Double.isNaN(this.zzdj)) {
                this.zzdj = d;
            } else {
                double d2 = this.zzdj;
                double d3 = this.zzdk;
                boolean z = false;
                if (d2 > d3 ? d2 <= d || d <= d3 : d2 <= d && d <= d3) {
                    z = true;
                }
                if (!z) {
                    if (com.google.android.gms.maps.model.LatLngBounds.zza(d2, d) < com.google.android.gms.maps.model.LatLngBounds.zzb(this.zzdk, d)) {
                        this.zzdj = d;
                    }
                }
                return this;
            }
            this.zzdk = d;
            return this;
        }

        public final com.google.android.gms.maps.model.LatLngBounds build() {
            com.google.android.gms.common.internal.Preconditions.checkState(!java.lang.Double.isNaN(this.zzdj), "no included points");
            return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(this.zzdh, this.zzdj), new com.google.android.gms.maps.model.LatLng(this.zzdi, this.zzdk));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.southwest, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static com.google.android.gms.maps.model.LatLngBounds.Builder builder() {
        return new com.google.android.gms.maps.model.LatLngBounds.Builder();
    }

    public final boolean contains(com.google.android.gms.maps.model.LatLng latLng) {
        double d = latLng.latitude;
        return ((this.southwest.latitude > d ? 1 : (this.southwest.latitude == d ? 0 : -1)) <= 0 && (d > this.northeast.latitude ? 1 : (d == this.northeast.latitude ? 0 : -1)) <= 0) && zza(latLng.longitude);
    }

    public final com.google.android.gms.maps.model.LatLngBounds including(com.google.android.gms.maps.model.LatLng latLng) {
        double dMin = java.lang.Math.min(this.southwest.latitude, latLng.latitude);
        double dMax = java.lang.Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (!zza(d3)) {
            if (zza(d2, d3) < zzb(d, d3)) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(dMin, d2), new com.google.android.gms.maps.model.LatLng(dMax, d));
    }

    public final com.google.android.gms.maps.model.LatLng getCenter() {
        double d = (this.southwest.latitude + this.northeast.latitude) / 2.0d;
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        if (d3 > d2) {
            d2 += 360.0d;
        }
        return new com.google.android.gms.maps.model.LatLng(d, (d2 + d3) / 2.0d);
    }

    private final boolean zza(double d) {
        if (this.southwest.longitude <= this.northeast.longitude) {
            return this.southwest.longitude <= d && d <= this.northeast.longitude;
        }
        return this.southwest.longitude <= d || d <= this.northeast.longitude;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.southwest, this.northeast);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.LatLngBounds)) {
            return false;
        }
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    public static com.google.android.gms.maps.model.LatLngBounds createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return com.google.android.gms.maps.GoogleMapOptions.zza(context, attributeSet);
    }
}
