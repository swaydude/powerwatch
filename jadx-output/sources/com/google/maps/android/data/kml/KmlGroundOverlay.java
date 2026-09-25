package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlGroundOverlay {
    private final com.google.android.gms.maps.model.GroundOverlayOptions mGroundOverlayOptions;
    private java.lang.String mImageUrl;
    private com.google.android.gms.maps.model.LatLngBounds mLatLngBox;
    private final java.util.Map<java.lang.String, java.lang.String> mProperties;

    KmlGroundOverlay(java.lang.String str, com.google.android.gms.maps.model.LatLngBounds latLngBounds, float f, int i, java.util.HashMap<java.lang.String, java.lang.String> map, float f2) {
        com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions = new com.google.android.gms.maps.model.GroundOverlayOptions();
        this.mGroundOverlayOptions = groundOverlayOptions;
        this.mImageUrl = str;
        this.mProperties = map;
        if (latLngBounds == null) {
            throw new java.lang.IllegalArgumentException("No LatLonBox given");
        }
        this.mLatLngBox = latLngBounds;
        groundOverlayOptions.positionFromBounds(latLngBounds);
        groundOverlayOptions.bearing(f2);
        groundOverlayOptions.zIndex(f);
        groundOverlayOptions.visible(i != 0);
    }

    public java.lang.String getImageUrl() {
        return this.mImageUrl;
    }

    public com.google.android.gms.maps.model.LatLngBounds getLatLngBox() {
        return this.mLatLngBox;
    }

    public java.lang.Iterable<java.lang.String> getProperties() {
        return this.mProperties.keySet();
    }

    public java.lang.String getProperty(java.lang.String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperty(java.lang.String str) {
        return this.mProperties.get(str) != null;
    }

    com.google.android.gms.maps.model.GroundOverlayOptions getGroundOverlayOptions() {
        return this.mGroundOverlayOptions;
    }

    public java.lang.String toString() {
        return "GroundOverlay{\n properties=" + this.mProperties + ",\n image url=" + this.mImageUrl + ",\n LatLngBox=" + this.mLatLngBox + "\n}\n";
    }
}
