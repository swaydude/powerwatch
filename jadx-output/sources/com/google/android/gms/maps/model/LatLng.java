package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class LatLng extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.LatLng> CREATOR = new com.google.android.gms.maps.model.zzf();
    public final double latitude;
    public final double longitude;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.longitude = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.longitude = d2;
        }
        this.latitude = java.lang.Math.max(-90.0d, java.lang.Math.min(90.0d, d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 2, this.latitude);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.longitude);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.latitude);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.longitude);
        return (i * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.LatLng)) {
            return false;
        }
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) obj;
        return java.lang.Double.doubleToLongBits(this.latitude) == java.lang.Double.doubleToLongBits(latLng.latitude) && java.lang.Double.doubleToLongBits(this.longitude) == java.lang.Double.doubleToLongBits(latLng.longitude);
    }

    public final java.lang.String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }
}
