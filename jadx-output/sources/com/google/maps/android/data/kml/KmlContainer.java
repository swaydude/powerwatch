package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlContainer {
    private java.lang.String mContainerId;
    private final java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> mContainers;
    private final java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> mGroundOverlays;
    private final java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> mPlacemarks;
    private final java.util.HashMap<java.lang.String, java.lang.String> mProperties;
    private final java.util.HashMap<java.lang.String, java.lang.String> mStyleMap;
    private java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> mStyles;

    KmlContainer(java.util.HashMap<java.lang.String, java.lang.String> map, java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> map2, java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> map3, java.util.HashMap<java.lang.String, java.lang.String> map4, java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> arrayList, java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map5, java.lang.String str) {
        this.mProperties = map;
        this.mPlacemarks = map3;
        this.mStyles = map2;
        this.mStyleMap = map4;
        this.mContainers = arrayList;
        this.mGroundOverlays = map5;
        this.mContainerId = str;
    }

    java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> getStyles() {
        return this.mStyles;
    }

    void setPlacemark(com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark, java.lang.Object obj) {
        this.mPlacemarks.put(kmlPlacemark, obj);
    }

    java.util.HashMap<java.lang.String, java.lang.String> getStyleMap() {
        return this.mStyleMap;
    }

    java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> getGroundOverlayHashMap() {
        return this.mGroundOverlays;
    }

    public java.lang.String getContainerId() {
        return this.mContainerId;
    }

    public com.google.maps.android.data.kml.KmlStyle getStyle(java.lang.String str) {
        return this.mStyles.get(str);
    }

    java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> getPlacemarksHashMap() {
        return this.mPlacemarks;
    }

    public java.lang.String getProperty(java.lang.String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperties() {
        return this.mProperties.size() > 0;
    }

    public boolean hasProperty(java.lang.String str) {
        return this.mProperties.containsKey(str);
    }

    public boolean hasContainers() {
        return this.mContainers.size() > 0;
    }

    public java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> getContainers() {
        return this.mContainers;
    }

    public java.lang.Iterable<java.lang.String> getProperties() {
        return this.mProperties.keySet();
    }

    public java.lang.Iterable<com.google.maps.android.data.kml.KmlPlacemark> getPlacemarks() {
        return this.mPlacemarks.keySet();
    }

    public boolean hasPlacemarks() {
        return this.mPlacemarks.size() > 0;
    }

    public java.lang.Iterable<com.google.maps.android.data.kml.KmlGroundOverlay> getGroundOverlays() {
        return this.mGroundOverlays.keySet();
    }

    public java.lang.String toString() {
        return "Container{\n properties=" + this.mProperties + ",\n placemarks=" + this.mPlacemarks + ",\n containers=" + this.mContainers + ",\n ground overlays=" + this.mGroundOverlays + ",\n style maps=" + this.mStyleMap + ",\n styles=" + this.mStyles + "\n}\n";
    }
}
