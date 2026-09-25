package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Layer {
    private com.google.maps.android.data.Renderer mRenderer;

    public interface OnFeatureClickListener {
        void onFeatureClick(com.google.maps.android.data.Feature feature);
    }

    protected void addKMLToMap() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.google.maps.android.data.Renderer renderer = this.mRenderer;
        if (renderer instanceof com.google.maps.android.data.kml.KmlRenderer) {
            ((com.google.maps.android.data.kml.KmlRenderer) renderer).addLayerToMap();
            return;
        }
        throw new java.lang.UnsupportedOperationException("Stored renderer is not a KmlRenderer");
    }

    protected void addGeoJsonToMap() {
        com.google.maps.android.data.Renderer renderer = this.mRenderer;
        if (renderer instanceof com.google.maps.android.data.geojson.GeoJsonRenderer) {
            ((com.google.maps.android.data.geojson.GeoJsonRenderer) renderer).addLayerToMap();
            return;
        }
        throw new java.lang.UnsupportedOperationException("Stored renderer is not a GeoJsonRenderer");
    }

    public void removeLayerFromMap() {
        com.google.maps.android.data.Renderer renderer = this.mRenderer;
        if (renderer instanceof com.google.maps.android.data.geojson.GeoJsonRenderer) {
            ((com.google.maps.android.data.geojson.GeoJsonRenderer) renderer).removeLayerFromMap();
        } else if (renderer instanceof com.google.maps.android.data.kml.KmlRenderer) {
            ((com.google.maps.android.data.kml.KmlRenderer) renderer).removeLayerFromMap();
        }
    }

    public void setOnFeatureClickListener(final com.google.maps.android.data.Layer.OnFeatureClickListener onFeatureClickListener) {
        com.google.android.gms.maps.GoogleMap map = getMap();
        map.setOnPolygonClickListener(new com.google.android.gms.maps.GoogleMap.OnPolygonClickListener() { // from class: com.google.maps.android.data.Layer.1
            @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
            public void onPolygonClick(com.google.android.gms.maps.model.Polygon polygon) {
                if (com.google.maps.android.data.Layer.this.getFeature(polygon) != null) {
                    onFeatureClickListener.onFeatureClick(com.google.maps.android.data.Layer.this.getFeature(polygon));
                } else {
                    if (com.google.maps.android.data.Layer.this.getContainerFeature(polygon) != null) {
                        onFeatureClickListener.onFeatureClick(com.google.maps.android.data.Layer.this.getContainerFeature(polygon));
                        return;
                    }
                    com.google.maps.android.data.Layer.OnFeatureClickListener onFeatureClickListener2 = onFeatureClickListener;
                    com.google.maps.android.data.Layer layer = com.google.maps.android.data.Layer.this;
                    onFeatureClickListener2.onFeatureClick(layer.getFeature(layer.multiObjectHandler(polygon)));
                }
            }
        });
        map.setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.data.Layer.2
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
                if (com.google.maps.android.data.Layer.this.getFeature(marker) != null) {
                    onFeatureClickListener.onFeatureClick(com.google.maps.android.data.Layer.this.getFeature(marker));
                    return false;
                }
                if (com.google.maps.android.data.Layer.this.getContainerFeature(marker) != null) {
                    onFeatureClickListener.onFeatureClick(com.google.maps.android.data.Layer.this.getContainerFeature(marker));
                    return false;
                }
                com.google.maps.android.data.Layer.OnFeatureClickListener onFeatureClickListener2 = onFeatureClickListener;
                com.google.maps.android.data.Layer layer = com.google.maps.android.data.Layer.this;
                onFeatureClickListener2.onFeatureClick(layer.getFeature(layer.multiObjectHandler(marker)));
                return false;
            }
        });
        map.setOnPolylineClickListener(new com.google.android.gms.maps.GoogleMap.OnPolylineClickListener() { // from class: com.google.maps.android.data.Layer.3
            @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
            public void onPolylineClick(com.google.android.gms.maps.model.Polyline polyline) {
                if (com.google.maps.android.data.Layer.this.getFeature(polyline) != null) {
                    onFeatureClickListener.onFeatureClick(com.google.maps.android.data.Layer.this.getFeature(polyline));
                } else {
                    if (com.google.maps.android.data.Layer.this.getContainerFeature(polyline) != null) {
                        onFeatureClickListener.onFeatureClick(com.google.maps.android.data.Layer.this.getContainerFeature(polyline));
                        return;
                    }
                    com.google.maps.android.data.Layer.OnFeatureClickListener onFeatureClickListener2 = onFeatureClickListener;
                    com.google.maps.android.data.Layer layer = com.google.maps.android.data.Layer.this;
                    onFeatureClickListener2.onFeatureClick(layer.getFeature(layer.multiObjectHandler(polyline)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.ArrayList<?> multiObjectHandler(java.lang.Object obj) {
        for (java.lang.Object obj2 : this.mRenderer.getValues()) {
            if (obj2.getClass().getSimpleName().equals("ArrayList")) {
                java.util.ArrayList<?> arrayList = (java.util.ArrayList) obj2;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    protected void storeRenderer(com.google.maps.android.data.Renderer renderer) {
        this.mRenderer = renderer;
    }

    public java.lang.Iterable<? extends com.google.maps.android.data.Feature> getFeatures() {
        return this.mRenderer.getFeatures();
    }

    public com.google.maps.android.data.Feature getFeature(java.lang.Object obj) {
        return this.mRenderer.getFeature(obj);
    }

    public com.google.maps.android.data.Feature getContainerFeature(java.lang.Object obj) {
        return this.mRenderer.getContainerFeature(obj);
    }

    protected boolean hasFeatures() {
        return this.mRenderer.hasFeatures();
    }

    protected boolean hasContainers() {
        com.google.maps.android.data.Renderer renderer = this.mRenderer;
        if (renderer instanceof com.google.maps.android.data.kml.KmlRenderer) {
            return ((com.google.maps.android.data.kml.KmlRenderer) renderer).hasNestedContainers();
        }
        return false;
    }

    protected java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> getContainers() {
        com.google.maps.android.data.Renderer renderer = this.mRenderer;
        if (renderer instanceof com.google.maps.android.data.kml.KmlRenderer) {
            return ((com.google.maps.android.data.kml.KmlRenderer) renderer).getNestedContainers();
        }
        return null;
    }

    protected java.lang.Iterable<com.google.maps.android.data.kml.KmlGroundOverlay> getGroundOverlays() {
        com.google.maps.android.data.Renderer renderer = this.mRenderer;
        if (renderer instanceof com.google.maps.android.data.kml.KmlRenderer) {
            return ((com.google.maps.android.data.kml.KmlRenderer) renderer).getGroundOverlays();
        }
        return null;
    }

    public com.google.android.gms.maps.GoogleMap getMap() {
        return this.mRenderer.getMap();
    }

    public void setMap(com.google.android.gms.maps.GoogleMap googleMap) {
        this.mRenderer.setMap(googleMap);
    }

    public boolean isLayerOnMap() {
        return this.mRenderer.isLayerOnMap();
    }

    protected void addFeature(com.google.maps.android.data.Feature feature) {
        this.mRenderer.addFeature(feature);
    }

    protected void removeFeature(com.google.maps.android.data.Feature feature) {
        this.mRenderer.removeFeature(feature);
    }

    public com.google.maps.android.data.geojson.GeoJsonPointStyle getDefaultPointStyle() {
        return this.mRenderer.getDefaultPointStyle();
    }

    public com.google.maps.android.data.geojson.GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mRenderer.getDefaultLineStringStyle();
    }

    public com.google.maps.android.data.geojson.GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mRenderer.getDefaultPolygonStyle();
    }
}
