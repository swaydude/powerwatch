package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonFeature extends com.google.maps.android.data.Feature implements java.util.Observer {
    private final com.google.android.gms.maps.model.LatLngBounds mBoundingBox;
    private final java.lang.String mId;
    private com.google.maps.android.data.geojson.GeoJsonLineStringStyle mLineStringStyle;
    private com.google.maps.android.data.geojson.GeoJsonPointStyle mPointStyle;
    private com.google.maps.android.data.geojson.GeoJsonPolygonStyle mPolygonStyle;

    public GeoJsonFeature(com.google.maps.android.data.Geometry geometry, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        super(geometry, str, map);
        this.mId = str;
        this.mBoundingBox = latLngBounds;
    }

    @Override // com.google.maps.android.data.Feature
    public java.lang.String setProperty(java.lang.String str, java.lang.String str2) {
        return super.setProperty(str, str2);
    }

    @Override // com.google.maps.android.data.Feature
    public java.lang.String removeProperty(java.lang.String str) {
        return super.removeProperty(str);
    }

    public com.google.maps.android.data.geojson.GeoJsonPointStyle getPointStyle() {
        return this.mPointStyle;
    }

    public void setPointStyle(com.google.maps.android.data.geojson.GeoJsonPointStyle geoJsonPointStyle) {
        if (geoJsonPointStyle == null) {
            throw new java.lang.IllegalArgumentException("Point style cannot be null");
        }
        com.google.maps.android.data.geojson.GeoJsonPointStyle geoJsonPointStyle2 = this.mPointStyle;
        if (geoJsonPointStyle2 != null) {
            geoJsonPointStyle2.deleteObserver(this);
        }
        this.mPointStyle = geoJsonPointStyle;
        geoJsonPointStyle.addObserver(this);
        checkRedrawFeature(this.mPointStyle);
    }

    public com.google.maps.android.data.geojson.GeoJsonLineStringStyle getLineStringStyle() {
        return this.mLineStringStyle;
    }

    public void setLineStringStyle(com.google.maps.android.data.geojson.GeoJsonLineStringStyle geoJsonLineStringStyle) {
        if (geoJsonLineStringStyle == null) {
            throw new java.lang.IllegalArgumentException("Line string style cannot be null");
        }
        com.google.maps.android.data.geojson.GeoJsonLineStringStyle geoJsonLineStringStyle2 = this.mLineStringStyle;
        if (geoJsonLineStringStyle2 != null) {
            geoJsonLineStringStyle2.deleteObserver(this);
        }
        this.mLineStringStyle = geoJsonLineStringStyle;
        geoJsonLineStringStyle.addObserver(this);
        checkRedrawFeature(this.mLineStringStyle);
    }

    public com.google.maps.android.data.geojson.GeoJsonPolygonStyle getPolygonStyle() {
        return this.mPolygonStyle;
    }

    public void setPolygonStyle(com.google.maps.android.data.geojson.GeoJsonPolygonStyle geoJsonPolygonStyle) {
        if (geoJsonPolygonStyle == null) {
            throw new java.lang.IllegalArgumentException("Polygon style cannot be null");
        }
        com.google.maps.android.data.geojson.GeoJsonPolygonStyle geoJsonPolygonStyle2 = this.mPolygonStyle;
        if (geoJsonPolygonStyle2 != null) {
            geoJsonPolygonStyle2.deleteObserver(this);
        }
        this.mPolygonStyle = geoJsonPolygonStyle;
        geoJsonPolygonStyle.addObserver(this);
        checkRedrawFeature(this.mPolygonStyle);
    }

    public com.google.android.gms.maps.model.PolygonOptions getPolygonOptions() {
        return this.mPolygonStyle.toPolygonOptions();
    }

    public com.google.android.gms.maps.model.MarkerOptions getMarkerOptions() {
        return this.mPointStyle.toMarkerOptions();
    }

    public com.google.android.gms.maps.model.PolylineOptions getPolylineOptions() {
        return this.mLineStringStyle.toPolylineOptions();
    }

    private void checkRedrawFeature(com.google.maps.android.data.geojson.GeoJsonStyle geoJsonStyle) {
        if (hasGeometry() && java.util.Arrays.asList(geoJsonStyle.getGeometryType()).contains(getGeometry().getGeometryType())) {
            setChanged();
            notifyObservers();
        }
    }

    @Override // com.google.maps.android.data.Feature
    public void setGeometry(com.google.maps.android.data.Geometry geometry) {
        super.setGeometry(geometry);
        setChanged();
        notifyObservers();
    }

    public com.google.android.gms.maps.model.LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public java.lang.String toString() {
        return "Feature{\n bounding box=" + this.mBoundingBox + ",\n geometry=" + getGeometry() + ",\n point style=" + this.mPointStyle + ",\n line string style=" + this.mLineStringStyle + ",\n polygon style=" + this.mPolygonStyle + ",\n id=" + this.mId + ",\n properties=" + getProperties() + "\n}\n";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        if (observable instanceof com.google.maps.android.data.geojson.GeoJsonStyle) {
            checkRedrawFeature((com.google.maps.android.data.geojson.GeoJsonStyle) observable);
        }
    }
}
