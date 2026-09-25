package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonLayer extends com.google.maps.android.data.Layer {
    private com.google.android.gms.maps.model.LatLngBounds mBoundingBox;

    public interface GeoJsonOnFeatureClickListener extends com.google.maps.android.data.Layer.OnFeatureClickListener {
    }

    public GeoJsonLayer(com.google.android.gms.maps.GoogleMap googleMap, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new java.lang.IllegalArgumentException("GeoJSON file cannot be null");
        }
        this.mBoundingBox = null;
        com.google.maps.android.data.geojson.GeoJsonParser geoJsonParser = new com.google.maps.android.data.geojson.GeoJsonParser(jSONObject);
        this.mBoundingBox = geoJsonParser.getBoundingBox();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<com.google.maps.android.data.geojson.GeoJsonFeature> it = geoJsonParser.getFeatures().iterator();
        while (it.hasNext()) {
            map.put(it.next(), null);
        }
        storeRenderer(new com.google.maps.android.data.geojson.GeoJsonRenderer(googleMap, map));
    }

    public GeoJsonLayer(com.google.android.gms.maps.GoogleMap googleMap, int i, android.content.Context context) throws org.json.JSONException, java.io.IOException {
        this(googleMap, createJsonFileObject(context.getResources().openRawResource(i)));
    }

    private static org.json.JSONObject createJsonFileObject(java.io.InputStream inputStream) throws org.json.JSONException, java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            } else {
                bufferedReader.close();
                return new org.json.JSONObject(sb.toString());
            }
        }
    }

    public void addLayerToMap() {
        super.addGeoJsonToMap();
    }

    @Override // com.google.maps.android.data.Layer
    public java.lang.Iterable<com.google.maps.android.data.geojson.GeoJsonFeature> getFeatures() {
        return super.getFeatures();
    }

    public void addFeature(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new java.lang.IllegalArgumentException("Feature cannot be null");
        }
        super.addFeature((com.google.maps.android.data.Feature) geoJsonFeature);
    }

    public void removeFeature(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new java.lang.IllegalArgumentException("Feature cannot be null");
        }
        super.removeFeature((com.google.maps.android.data.Feature) geoJsonFeature);
    }

    public com.google.android.gms.maps.model.LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public java.lang.String toString() {
        return "Collection{\n Bounding box=" + this.mBoundingBox + "\n}\n";
    }
}
