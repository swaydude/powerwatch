package com.baidu.mapapi.model;

/* JADX INFO: loaded from: classes.dex */
public final class LatLng implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.model.LatLng> CREATOR = new com.baidu.mapapi.model.a();
    private static final java.lang.String a = "LatLng";
    public final double latitude;
    public final double latitudeE6;
    public final double longitude;
    public final double longitudeE6;

    public LatLng(double d, double d2) {
        if (java.lang.Double.isNaN(d) || java.lang.Double.isNaN(d2) || java.lang.Double.isInfinite(d) || java.lang.Double.isInfinite(d2)) {
            this.latitudeE6 = 0.0d;
            this.longitudeE6 = 0.0d;
            this.latitude = 0.0d;
            this.longitude = 0.0d;
            return;
        }
        double d3 = d * 1000000.0d;
        double d4 = d2 * 1000000.0d;
        this.latitudeE6 = d3;
        this.longitudeE6 = d4;
        this.latitude = d3 / 1000000.0d;
        this.longitude = d4 / 1000000.0d;
    }

    protected LatLng(android.os.Parcel parcel) {
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.latitudeE6 = parcel.readDouble();
        this.longitudeE6 = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return ((new java.lang.String("latitude: ") + this.latitude) + ", longitude: ") + this.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.latitudeE6);
        parcel.writeDouble(this.longitudeE6);
    }
}
