package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonLineStringStyle extends com.google.maps.android.data.Style implements com.google.maps.android.data.geojson.GeoJsonStyle {
    private static final java.lang.String[] GEOMETRY_TYPE = {"LineString", "MultiLineString", "GeometryCollection"};

    public GeoJsonLineStringStyle() {
        this.mPolylineOptions = new com.google.android.gms.maps.model.PolylineOptions();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public java.lang.String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getColor() {
        return this.mPolylineOptions.getColor();
    }

    public void setColor(int i) {
        this.mPolylineOptions.color(i);
        styleChanged();
    }

    public boolean isClickable() {
        return this.mPolylineOptions.isClickable();
    }

    public void setClickable(boolean z) {
        this.mPolylineOptions.clickable(z);
        styleChanged();
    }

    public boolean isGeodesic() {
        return this.mPolylineOptions.isGeodesic();
    }

    public void setGeodesic(boolean z) {
        this.mPolylineOptions.geodesic(z);
        styleChanged();
    }

    public float getWidth() {
        return this.mPolylineOptions.getWidth();
    }

    public void setWidth(float f) {
        setLineStringWidth(f);
        styleChanged();
    }

    public float getZIndex() {
        return this.mPolylineOptions.getZIndex();
    }

    public void setZIndex(float f) {
        this.mPolylineOptions.zIndex(f);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolylineOptions.isVisible();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z) {
        this.mPolylineOptions.visible(z);
        styleChanged();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public com.google.android.gms.maps.model.PolylineOptions toPolylineOptions() {
        com.google.android.gms.maps.model.PolylineOptions polylineOptions = new com.google.android.gms.maps.model.PolylineOptions();
        polylineOptions.color(this.mPolylineOptions.getColor());
        polylineOptions.clickable(this.mPolylineOptions.isClickable());
        polylineOptions.geodesic(this.mPolylineOptions.isGeodesic());
        polylineOptions.visible(this.mPolylineOptions.isVisible());
        polylineOptions.width(this.mPolylineOptions.getWidth());
        polylineOptions.zIndex(this.mPolylineOptions.getZIndex());
        return polylineOptions;
    }

    public java.lang.String toString() {
        return "LineStringStyle{\n geometry type=" + java.util.Arrays.toString(GEOMETRY_TYPE) + ",\n color=" + getColor() + ",\n clickable=" + isClickable() + ",\n geodesic=" + isGeodesic() + ",\n visible=" + isVisible() + ",\n width=" + getWidth() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
