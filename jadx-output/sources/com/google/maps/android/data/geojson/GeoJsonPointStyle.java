package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPointStyle extends com.google.maps.android.data.Style implements com.google.maps.android.data.geojson.GeoJsonStyle {
    private static final java.lang.String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new com.google.android.gms.maps.model.MarkerOptions();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public java.lang.String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public float getAlpha() {
        return this.mMarkerOptions.getAlpha();
    }

    public void setAlpha(float f) {
        this.mMarkerOptions.alpha(f);
        styleChanged();
    }

    public float getAnchorU() {
        return this.mMarkerOptions.getAnchorU();
    }

    public float getAnchorV() {
        return this.mMarkerOptions.getAnchorV();
    }

    public void setAnchor(float f, float f2) {
        setMarkerHotSpot(f, f2, "fraction", "fraction");
        styleChanged();
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.isDraggable();
    }

    public void setDraggable(boolean z) {
        this.mMarkerOptions.draggable(z);
        styleChanged();
    }

    public boolean isFlat() {
        return this.mMarkerOptions.isFlat();
    }

    public void setFlat(boolean z) {
        this.mMarkerOptions.flat(z);
        styleChanged();
    }

    public com.google.android.gms.maps.model.BitmapDescriptor getIcon() {
        return this.mMarkerOptions.getIcon();
    }

    public void setIcon(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.mMarkerOptions.icon(bitmapDescriptor);
        styleChanged();
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.getInfoWindowAnchorU();
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.getInfoWindowAnchorV();
    }

    public void setInfoWindowAnchor(float f, float f2) {
        this.mMarkerOptions.infoWindowAnchor(f, f2);
        styleChanged();
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setRotation(float f) {
        setMarkerRotation(f);
        styleChanged();
    }

    public java.lang.String getSnippet() {
        return this.mMarkerOptions.getSnippet();
    }

    public void setSnippet(java.lang.String str) {
        this.mMarkerOptions.snippet(str);
        styleChanged();
    }

    public java.lang.String getTitle() {
        return this.mMarkerOptions.getTitle();
    }

    public void setTitle(java.lang.String str) {
        this.mMarkerOptions.title(str);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mMarkerOptions.isVisible();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z) {
        this.mMarkerOptions.visible(z);
        styleChanged();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public com.google.android.gms.maps.model.MarkerOptions toMarkerOptions() {
        com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
        markerOptions.alpha(this.mMarkerOptions.getAlpha());
        markerOptions.anchor(this.mMarkerOptions.getAnchorU(), this.mMarkerOptions.getAnchorV());
        markerOptions.draggable(this.mMarkerOptions.isDraggable());
        markerOptions.flat(this.mMarkerOptions.isFlat());
        markerOptions.icon(this.mMarkerOptions.getIcon());
        markerOptions.infoWindowAnchor(this.mMarkerOptions.getInfoWindowAnchorU(), this.mMarkerOptions.getInfoWindowAnchorV());
        markerOptions.rotation(this.mMarkerOptions.getRotation());
        markerOptions.snippet(this.mMarkerOptions.getSnippet());
        markerOptions.title(this.mMarkerOptions.getTitle());
        markerOptions.visible(this.mMarkerOptions.isVisible());
        return markerOptions;
    }

    public java.lang.String toString() {
        return "PointStyle{\n geometry type=" + java.util.Arrays.toString(GEOMETRY_TYPE) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + "\n}\n";
    }
}
