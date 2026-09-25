package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonRenderer extends com.google.maps.android.data.Renderer implements java.util.Observer {
    private static final java.lang.Object FEATURE_NOT_ON_MAP = null;

    public GeoJsonRenderer(com.google.android.gms.maps.GoogleMap googleMap, java.util.HashMap<com.google.maps.android.data.geojson.GeoJsonFeature, java.lang.Object> map) {
        super(googleMap, map);
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(com.google.android.gms.maps.GoogleMap googleMap) {
        super.setMap(googleMap);
        java.util.Iterator<com.google.maps.android.data.Feature> it = super.getFeatures().iterator();
        while (it.hasNext()) {
            redrawFeatureToMap((com.google.maps.android.data.geojson.GeoJsonFeature) it.next(), googleMap);
        }
    }

    public void addLayerToMap() {
        if (isLayerOnMap()) {
            return;
        }
        setLayerVisibility(true);
        java.util.Iterator<com.google.maps.android.data.Feature> it = super.getFeatures().iterator();
        while (it.hasNext()) {
            addFeature((com.google.maps.android.data.geojson.GeoJsonFeature) it.next());
        }
    }

    public void addFeature(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature) {
        super.addFeature((com.google.maps.android.data.Feature) geoJsonFeature);
        if (isLayerOnMap()) {
            geoJsonFeature.addObserver(this);
        }
    }

    public void removeLayerFromMap() {
        if (isLayerOnMap()) {
            for (com.google.maps.android.data.Feature feature : super.getFeatures()) {
                removeFromMap(super.getAllFeatures().get(feature));
                feature.deleteObserver(this);
            }
            setLayerVisibility(false);
        }
    }

    public void removeFeature(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature) {
        super.removeFeature((com.google.maps.android.data.Feature) geoJsonFeature);
        if (super.getFeatures().contains(geoJsonFeature)) {
            geoJsonFeature.deleteObserver(this);
        }
    }

    private void redrawFeatureToMap(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature) {
        redrawFeatureToMap(geoJsonFeature, getMap());
    }

    private void redrawFeatureToMap(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature, com.google.android.gms.maps.GoogleMap googleMap) {
        removeFromMap(getAllFeatures().get(geoJsonFeature));
        putFeatures(geoJsonFeature, FEATURE_NOT_ON_MAP);
        if (googleMap == null || !geoJsonFeature.hasGeometry()) {
            return;
        }
        putFeatures(geoJsonFeature, addGeoJsonFeatureToMap(geoJsonFeature, geoJsonFeature.getGeometry()));
    }

    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        if (observable instanceof com.google.maps.android.data.geojson.GeoJsonFeature) {
            com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature = (com.google.maps.android.data.geojson.GeoJsonFeature) observable;
            java.lang.Object obj2 = getAllFeatures().get(geoJsonFeature);
            java.lang.Object obj3 = FEATURE_NOT_ON_MAP;
            boolean z = obj2 != obj3;
            if (z && geoJsonFeature.hasGeometry()) {
                redrawFeatureToMap(geoJsonFeature);
                return;
            }
            if (z && !geoJsonFeature.hasGeometry()) {
                removeFromMap(getAllFeatures().get(geoJsonFeature));
                putFeatures(geoJsonFeature, obj3);
            } else {
                if (z || !geoJsonFeature.hasGeometry()) {
                    return;
                }
                addFeature(geoJsonFeature);
            }
        }
    }
}
