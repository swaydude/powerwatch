package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPolygonStyle extends com.google.maps.android.data.Style implements com.google.maps.android.data.geojson.GeoJsonStyle {
    private static final java.lang.String[] GEOMETRY_TYPE = {com.google.maps.android.data.kml.KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public GeoJsonPolygonStyle() {
        this.mPolygonOptions = new com.google.android.gms.maps.model.PolygonOptions();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public java.lang.String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getFillColor() {
        return this.mPolygonOptions.getFillColor();
    }

    public void setFillColor(int i) {
        setPolygonFillColor(i);
        styleChanged();
    }

    public boolean isGeodesic() {
        return this.mPolygonOptions.isGeodesic();
    }

    public void setGeodesic(boolean z) {
        this.mPolygonOptions.geodesic(z);
        styleChanged();
    }

    public int getStrokeColor() {
        return this.mPolygonOptions.getStrokeColor();
    }

    public void setStrokeColor(int i) {
        this.mPolygonOptions.strokeColor(i);
        styleChanged();
    }

    public float getStrokeWidth() {
        return this.mPolygonOptions.getStrokeWidth();
    }

    public void setStrokeWidth(float f) {
        setPolygonStrokeWidth(f);
        styleChanged();
    }

    public float getZIndex() {
        return this.mPolygonOptions.getZIndex();
    }

    public void setZIndex(float f) {
        this.mPolygonOptions.zIndex(f);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolygonOptions.isVisible();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z) {
        this.mPolygonOptions.visible(z);
        styleChanged();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public com.google.android.gms.maps.model.PolygonOptions toPolygonOptions() {
        com.google.android.gms.maps.model.PolygonOptions polygonOptions = new com.google.android.gms.maps.model.PolygonOptions();
        polygonOptions.fillColor(this.mPolygonOptions.getFillColor());
        polygonOptions.geodesic(this.mPolygonOptions.isGeodesic());
        polygonOptions.strokeColor(this.mPolygonOptions.getStrokeColor());
        polygonOptions.strokeWidth(this.mPolygonOptions.getStrokeWidth());
        polygonOptions.visible(this.mPolygonOptions.isVisible());
        polygonOptions.zIndex(this.mPolygonOptions.getZIndex());
        return polygonOptions;
    }

    public java.lang.String toString() {
        return "PolygonStyle{\n geometry type=" + java.util.Arrays.toString(GEOMETRY_TYPE) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
