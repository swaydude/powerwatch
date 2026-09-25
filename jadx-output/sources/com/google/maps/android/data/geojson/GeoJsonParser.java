package com.google.maps.android.data.geojson;

/* JADX INFO: loaded from: classes2.dex */
class GeoJsonParser {
    private static final java.lang.String BOUNDING_BOX = "bbox";
    private static final java.lang.String FEATURE = "Feature";
    private static final java.lang.String FEATURE_COLLECTION = "FeatureCollection";
    private static final java.lang.String FEATURE_COLLECTION_ARRAY = "features";
    private static final java.lang.String FEATURE_GEOMETRY = "geometry";
    private static final java.lang.String FEATURE_ID = "id";
    private static final java.lang.String GEOMETRY_COLLECTION = "GeometryCollection";
    private static final java.lang.String GEOMETRY_COLLECTION_ARRAY = "geometries";
    private static final java.lang.String GEOMETRY_COORDINATES_ARRAY = "coordinates";
    private static final java.lang.String LINESTRING = "LineString";
    private static final java.lang.String LOG_TAG = "GeoJsonParser";
    private static final java.lang.String MULTILINESTRING = "MultiLineString";
    private static final java.lang.String MULTIPOINT = "MultiPoint";
    private static final java.lang.String MULTIPOLYGON = "MultiPolygon";
    private static final java.lang.String POINT = "Point";
    private static final java.lang.String POLYGON = "Polygon";
    private static final java.lang.String PROPERTIES = "properties";
    private final org.json.JSONObject mGeoJsonFile;
    private final java.util.ArrayList<com.google.maps.android.data.geojson.GeoJsonFeature> mGeoJsonFeatures = new java.util.ArrayList<>();
    private com.google.android.gms.maps.model.LatLngBounds mBoundingBox = null;

    GeoJsonParser(org.json.JSONObject jSONObject) {
        this.mGeoJsonFile = jSONObject;
        parseGeoJson();
    }

    private static boolean isGeometry(java.lang.String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    private static com.google.maps.android.data.geojson.GeoJsonFeature parseFeature(org.json.JSONObject jSONObject) {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        try {
            java.lang.String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            com.google.android.gms.maps.model.LatLngBounds boundingBox = jSONObject.has(BOUNDING_BOX) ? parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX)) : null;
            com.google.maps.android.data.Geometry geometry = (!jSONObject.has(FEATURE_GEOMETRY) || jSONObject.isNull(FEATURE_GEOMETRY)) ? null : parseGeometry(jSONObject.getJSONObject(FEATURE_GEOMETRY));
            if (jSONObject.has(PROPERTIES) && !jSONObject.isNull(PROPERTIES)) {
                map = parseProperties(jSONObject.getJSONObject(PROPERTIES));
            }
            return new com.google.maps.android.data.geojson.GeoJsonFeature(geometry, string, map, boundingBox);
        } catch (org.json.JSONException unused) {
            android.util.Log.w(LOG_TAG, "Feature could not be successfully parsed " + jSONObject.toString());
            return null;
        }
    }

    private static com.google.android.gms.maps.model.LatLngBounds parseBoundingBox(org.json.JSONArray jSONArray) throws org.json.JSONException {
        return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new com.google.android.gms.maps.model.LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    private static com.google.maps.android.data.Geometry parseGeometry(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray;
        try {
            java.lang.String string = jSONObject.getString("type");
            if (string.equals(GEOMETRY_COLLECTION)) {
                jSONArray = jSONObject.getJSONArray(GEOMETRY_COLLECTION_ARRAY);
            } else {
                if (isGeometry(string)) {
                    jSONArray = jSONObject.getJSONArray(GEOMETRY_COORDINATES_ARRAY);
                }
                return null;
            }
            return createGeometry(string, jSONArray);
        } catch (org.json.JSONException unused) {
        }
    }

    private static com.google.maps.android.data.geojson.GeoJsonFeature parseGeometryToFeature(org.json.JSONObject jSONObject) {
        com.google.maps.android.data.Geometry geometry = parseGeometry(jSONObject);
        if (geometry != null) {
            return new com.google.maps.android.data.geojson.GeoJsonFeature(geometry, null, new java.util.HashMap(), null);
        }
        android.util.Log.w(LOG_TAG, "Geometry could not be parsed");
        return null;
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> parseProperties(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return map;
    }

    private static com.google.maps.android.data.Geometry createGeometry(java.lang.String str, org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (str.equals(POINT)) {
            return createPoint(jSONArray);
        }
        if (str.equals(MULTIPOINT)) {
            return createMultiPoint(jSONArray);
        }
        if (str.equals(LINESTRING)) {
            return createLineString(jSONArray);
        }
        if (str.equals(MULTILINESTRING)) {
            return createMultiLineString(jSONArray);
        }
        if (str.equals("Polygon")) {
            return createPolygon(jSONArray);
        }
        if (str.equals(MULTIPOLYGON)) {
            return createMultiPolygon(jSONArray);
        }
        if (str.equals(GEOMETRY_COLLECTION)) {
            return createGeometryCollection(jSONArray);
        }
        return null;
    }

    private static com.google.maps.android.data.geojson.GeoJsonPoint createPoint(org.json.JSONArray jSONArray) throws org.json.JSONException {
        return new com.google.maps.android.data.geojson.GeoJsonPoint(parseCoordinate(jSONArray));
    }

    private static com.google.maps.android.data.geojson.GeoJsonMultiPoint createMultiPoint(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(createPoint(jSONArray.getJSONArray(i)));
        }
        return new com.google.maps.android.data.geojson.GeoJsonMultiPoint(arrayList);
    }

    private static com.google.maps.android.data.geojson.GeoJsonLineString createLineString(org.json.JSONArray jSONArray) throws org.json.JSONException {
        return new com.google.maps.android.data.geojson.GeoJsonLineString(parseCoordinatesArray(jSONArray));
    }

    private static com.google.maps.android.data.geojson.GeoJsonMultiLineString createMultiLineString(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(createLineString(jSONArray.getJSONArray(i)));
        }
        return new com.google.maps.android.data.geojson.GeoJsonMultiLineString(arrayList);
    }

    private static com.google.maps.android.data.geojson.GeoJsonPolygon createPolygon(org.json.JSONArray jSONArray) throws org.json.JSONException {
        return new com.google.maps.android.data.geojson.GeoJsonPolygon(parseCoordinatesArrays(jSONArray));
    }

    private static com.google.maps.android.data.geojson.GeoJsonMultiPolygon createMultiPolygon(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(createPolygon(jSONArray.getJSONArray(i)));
        }
        return new com.google.maps.android.data.geojson.GeoJsonMultiPolygon(arrayList);
    }

    private static com.google.maps.android.data.geojson.GeoJsonGeometryCollection createGeometryCollection(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            com.google.maps.android.data.Geometry geometry = parseGeometry(jSONArray.getJSONObject(i));
            if (geometry != null) {
                arrayList.add(geometry);
            }
        }
        return new com.google.maps.android.data.geojson.GeoJsonGeometryCollection(arrayList);
    }

    private static com.google.android.gms.maps.model.LatLng parseCoordinate(org.json.JSONArray jSONArray) throws org.json.JSONException {
        return new com.google.android.gms.maps.model.LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0));
    }

    private static java.util.ArrayList<com.google.android.gms.maps.model.LatLng> parseCoordinatesArray(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList<com.google.android.gms.maps.model.LatLng> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(parseCoordinate(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }

    private static java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> parseCoordinatesArrays(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(parseCoordinatesArray(jSONArray.getJSONArray(i)));
        }
        return arrayList;
    }

    private void parseGeoJson() {
        try {
            java.lang.String string = this.mGeoJsonFile.getString("type");
            if (string.equals(FEATURE)) {
                com.google.maps.android.data.geojson.GeoJsonFeature feature = parseFeature(this.mGeoJsonFile);
                if (feature != null) {
                    this.mGeoJsonFeatures.add(feature);
                }
            } else if (string.equals(FEATURE_COLLECTION)) {
                this.mGeoJsonFeatures.addAll(parseFeatureCollection(this.mGeoJsonFile));
            } else if (isGeometry(string)) {
                com.google.maps.android.data.geojson.GeoJsonFeature geometryToFeature = parseGeometryToFeature(this.mGeoJsonFile);
                if (geometryToFeature != null) {
                    this.mGeoJsonFeatures.add(geometryToFeature);
                }
            } else {
                android.util.Log.w(LOG_TAG, "GeoJSON file could not be parsed.");
            }
        } catch (org.json.JSONException unused) {
            android.util.Log.w(LOG_TAG, "GeoJSON file could not be parsed.");
        }
    }

    private java.util.ArrayList<com.google.maps.android.data.geojson.GeoJsonFeature> parseFeatureCollection(org.json.JSONObject jSONObject) {
        java.util.ArrayList<com.google.maps.android.data.geojson.GeoJsonFeature> arrayList = new java.util.ArrayList<>();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("features");
            if (jSONObject.has(BOUNDING_BOX)) {
                this.mBoundingBox = parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX));
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.getString("type").equals(FEATURE)) {
                        com.google.maps.android.data.geojson.GeoJsonFeature feature = parseFeature(jSONObject2);
                        if (feature != null) {
                            arrayList.add(feature);
                        } else {
                            android.util.Log.w(LOG_TAG, "Index of Feature in Feature Collection that could not be created: " + i);
                        }
                    }
                } catch (org.json.JSONException unused) {
                    android.util.Log.w(LOG_TAG, "Index of Feature in Feature Collection that could not be created: " + i);
                }
            }
            return arrayList;
        } catch (org.json.JSONException unused2) {
            android.util.Log.w(LOG_TAG, "Feature Collection could not be created.");
            return arrayList;
        }
    }

    java.util.ArrayList<com.google.maps.android.data.geojson.GeoJsonFeature> getFeatures() {
        return this.mGeoJsonFeatures;
    }

    com.google.android.gms.maps.model.LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }
}
