package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public class Renderer {
    private static final java.lang.Object FEATURE_NOT_ON_MAP = null;
    private static final int LRU_CACHE_SIZE = 50;
    private com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> mContainerFeatures;
    private java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> mContainers;
    private android.content.Context mContext;
    private final com.google.maps.android.data.geojson.GeoJsonLineStringStyle mDefaultLineStringStyle;
    private final com.google.maps.android.data.geojson.GeoJsonPointStyle mDefaultPointStyle;
    private final com.google.maps.android.data.geojson.GeoJsonPolygonStyle mDefaultPolygonStyle;
    private final com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> mFeatures;
    private java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> mGroundOverlays;
    private final androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> mImagesCache;
    private boolean mLayerOnMap;
    private com.google.android.gms.maps.GoogleMap mMap;
    private final java.util.ArrayList<java.lang.String> mMarkerIconUrls;
    private java.util.HashMap<java.lang.String, java.lang.String> mStyleMaps;
    private java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> mStyles;
    private java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> mStylesRenderer;

    public Renderer(com.google.android.gms.maps.GoogleMap googleMap, android.content.Context context) {
        this.mFeatures = new com.google.maps.android.data.geojson.BiMultiMap<>();
        this.mMap = googleMap;
        this.mContext = context;
        this.mLayerOnMap = false;
        this.mImagesCache = new androidx.collection.LruCache<>(50);
        this.mMarkerIconUrls = new java.util.ArrayList<>();
        this.mStylesRenderer = new java.util.HashMap<>();
        this.mDefaultPointStyle = null;
        this.mDefaultLineStringStyle = null;
        this.mDefaultPolygonStyle = null;
        this.mContainerFeatures = new com.google.maps.android.data.geojson.BiMultiMap<>();
    }

    public Renderer(com.google.android.gms.maps.GoogleMap googleMap, java.util.HashMap<? extends com.google.maps.android.data.Feature, java.lang.Object> map) {
        com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> biMultiMap = new com.google.maps.android.data.geojson.BiMultiMap<>();
        this.mFeatures = biMultiMap;
        this.mMap = googleMap;
        biMultiMap.putAll(map);
        this.mLayerOnMap = false;
        this.mMarkerIconUrls = null;
        this.mDefaultPointStyle = new com.google.maps.android.data.geojson.GeoJsonPointStyle();
        this.mDefaultLineStringStyle = new com.google.maps.android.data.geojson.GeoJsonLineStringStyle();
        this.mDefaultPolygonStyle = new com.google.maps.android.data.geojson.GeoJsonPolygonStyle();
        this.mImagesCache = null;
        this.mContainerFeatures = null;
    }

    public boolean isLayerOnMap() {
        return this.mLayerOnMap;
    }

    protected void setLayerVisibility(boolean z) {
        this.mLayerOnMap = z;
    }

    public com.google.android.gms.maps.GoogleMap getMap() {
        return this.mMap;
    }

    public void setMap(com.google.android.gms.maps.GoogleMap googleMap) {
        this.mMap = googleMap;
    }

    protected void putContainerFeature(java.lang.Object obj, com.google.maps.android.data.Feature feature) {
        this.mContainerFeatures.put(feature, obj);
    }

    public java.util.Set<com.google.maps.android.data.Feature> getFeatures() {
        return this.mFeatures.keySet();
    }

    public com.google.maps.android.data.Feature getFeature(java.lang.Object obj) {
        return this.mFeatures.getKey(obj);
    }

    public com.google.maps.android.data.Feature getContainerFeature(java.lang.Object obj) {
        com.google.maps.android.data.geojson.BiMultiMap<com.google.maps.android.data.Feature> biMultiMap = this.mContainerFeatures;
        if (biMultiMap != null) {
            return biMultiMap.getKey(obj);
        }
        return null;
    }

    public java.util.Collection<java.lang.Object> getValues() {
        return this.mFeatures.values();
    }

    protected java.util.HashMap<? extends com.google.maps.android.data.Feature, java.lang.Object> getAllFeatures() {
        return this.mFeatures;
    }

    public java.util.ArrayList<java.lang.String> getMarkerIconUrls() {
        return this.mMarkerIconUrls;
    }

    public java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> getStylesRenderer() {
        return this.mStylesRenderer;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getStyleMaps() {
        return this.mStyleMaps;
    }

    public androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> getImagesCache() {
        return this.mImagesCache;
    }

    public java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> getGroundOverlayMap() {
        return this.mGroundOverlays;
    }

    public java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> getContainerList() {
        return this.mContainers;
    }

    protected com.google.maps.android.data.kml.KmlStyle getPlacemarkStyle(java.lang.String str) {
        return this.mStylesRenderer.get(str) != null ? this.mStylesRenderer.get(str) : this.mStylesRenderer.get(null);
    }

    public com.google.maps.android.data.geojson.GeoJsonPointStyle getDefaultPointStyle() {
        return this.mDefaultPointStyle;
    }

    public com.google.maps.android.data.geojson.GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mDefaultLineStringStyle;
    }

    public com.google.maps.android.data.geojson.GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mDefaultPolygonStyle;
    }

    public void putFeatures(com.google.maps.android.data.Feature feature, java.lang.Object obj) {
        this.mFeatures.put(feature, obj);
    }

    public void putStyles() {
        this.mStylesRenderer.putAll(this.mStyles);
    }

    public void putStyles(java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> map) {
        this.mStylesRenderer.putAll(map);
    }

    public void putImagesCache(java.lang.String str, android.graphics.Bitmap bitmap) {
        this.mImagesCache.put(str, bitmap);
    }

    public boolean hasFeatures() {
        return this.mFeatures.size() > 0;
    }

    protected static void removeFeatures(java.util.HashMap<com.google.maps.android.data.Feature, java.lang.Object> map) {
        for (java.lang.Object obj : map.values()) {
            if (obj instanceof com.google.android.gms.maps.model.Marker) {
                ((com.google.android.gms.maps.model.Marker) obj).remove();
            } else if (obj instanceof com.google.android.gms.maps.model.Polyline) {
                ((com.google.android.gms.maps.model.Polyline) obj).remove();
            } else if (obj instanceof com.google.android.gms.maps.model.Polygon) {
                ((com.google.android.gms.maps.model.Polygon) obj).remove();
            }
        }
    }

    protected void removeFeature(com.google.maps.android.data.Feature feature) {
        if (this.mFeatures.containsKey(feature)) {
            removeFromMap(this.mFeatures.remove(feature));
        }
    }

    private void setFeatureDefaultStyles(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.mDefaultPointStyle);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.mDefaultLineStringStyle);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.mDefaultPolygonStyle);
        }
    }

    public void clearStylesRenderer() {
        this.mStylesRenderer.clear();
    }

    protected void storeData(java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> map, java.util.HashMap<java.lang.String, java.lang.String> map2, java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> map3, java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> arrayList, java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map4) {
        this.mStyles = map;
        this.mStyleMaps = map2;
        this.mFeatures.putAll(map3);
        this.mContainers = arrayList;
        this.mGroundOverlays = map4;
    }

    public void addFeature(com.google.maps.android.data.Feature feature) {
        java.lang.Object objAddGeoJsonFeatureToMap = FEATURE_NOT_ON_MAP;
        if (feature instanceof com.google.maps.android.data.geojson.GeoJsonFeature) {
            setFeatureDefaultStyles((com.google.maps.android.data.geojson.GeoJsonFeature) feature);
        }
        if (this.mLayerOnMap) {
            if (this.mFeatures.containsKey(feature)) {
                removeFromMap(this.mFeatures.get(feature));
            }
            if (feature.hasGeometry()) {
                if (feature instanceof com.google.maps.android.data.kml.KmlPlacemark) {
                    com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark = (com.google.maps.android.data.kml.KmlPlacemark) feature;
                    objAddGeoJsonFeatureToMap = addKmlPlacemarkToMap(kmlPlacemark, feature.getGeometry(), getPlacemarkStyle(feature.getId()), kmlPlacemark.getInlineStyle(), getPlacemarkVisibility(feature));
                } else {
                    objAddGeoJsonFeatureToMap = addGeoJsonFeatureToMap(feature, feature.getGeometry());
                }
            }
        }
        this.mFeatures.put(feature, objAddGeoJsonFeatureToMap);
    }

    public static void removeFromMap(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.maps.model.Marker) {
            ((com.google.android.gms.maps.model.Marker) obj).remove();
            return;
        }
        if (obj instanceof com.google.android.gms.maps.model.Polyline) {
            ((com.google.android.gms.maps.model.Polyline) obj).remove();
            return;
        }
        if (obj instanceof com.google.android.gms.maps.model.Polygon) {
            ((com.google.android.gms.maps.model.Polygon) obj).remove();
        } else if (obj instanceof java.util.ArrayList) {
            java.util.Iterator it = ((java.util.ArrayList) obj).iterator();
            while (it.hasNext()) {
                removeFromMap(it.next());
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected java.lang.Object addGeoJsonFeatureToMap(com.google.maps.android.data.Feature feature, com.google.maps.android.data.Geometry geometry) {
        java.lang.String geometryType = geometry.getGeometryType();
        geometryType.hashCode();
        byte b = -1;
        switch (geometryType.hashCode()) {
            case -2116761119:
                if (geometryType.equals("MultiPolygon")) {
                    b = 0;
                }
                break;
            case -1065891849:
                if (geometryType.equals("MultiPoint")) {
                    b = 1;
                }
                break;
            case -627102946:
                if (geometryType.equals("MultiLineString")) {
                    b = 2;
                }
                break;
            case 77292912:
                if (geometryType.equals("Point")) {
                    b = 3;
                }
                break;
            case 1267133722:
                if (geometryType.equals(com.google.maps.android.data.kml.KmlPolygon.GEOMETRY_TYPE)) {
                    b = 4;
                }
                break;
            case 1806700869:
                if (geometryType.equals("LineString")) {
                    b = 5;
                }
                break;
            case 1950410960:
                if (geometryType.equals("GeometryCollection")) {
                    b = 6;
                }
                break;
        }
        com.google.android.gms.maps.model.MarkerOptions markerOptions = null;
        com.google.android.gms.maps.model.PolylineOptions polylineOptions = null;
        com.google.android.gms.maps.model.PolygonOptions polygonOptions = null;
        switch (b) {
            case 0:
                return addMultiPolygonToMap(((com.google.maps.android.data.geojson.GeoJsonFeature) feature).getPolygonStyle(), (com.google.maps.android.data.geojson.GeoJsonMultiPolygon) geometry);
            case 1:
                return addMultiPointToMap(((com.google.maps.android.data.geojson.GeoJsonFeature) feature).getPointStyle(), (com.google.maps.android.data.geojson.GeoJsonMultiPoint) geometry);
            case 2:
                return addMultiLineStringToMap(((com.google.maps.android.data.geojson.GeoJsonFeature) feature).getLineStringStyle(), (com.google.maps.android.data.geojson.GeoJsonMultiLineString) geometry);
            case 3:
                if (feature instanceof com.google.maps.android.data.geojson.GeoJsonFeature) {
                    markerOptions = ((com.google.maps.android.data.geojson.GeoJsonFeature) feature).getMarkerOptions();
                } else if (feature instanceof com.google.maps.android.data.kml.KmlPlacemark) {
                    markerOptions = ((com.google.maps.android.data.kml.KmlPlacemark) feature).getMarkerOptions();
                }
                return addPointToMap(markerOptions, (com.google.maps.android.data.geojson.GeoJsonPoint) geometry);
            case 4:
                if (feature instanceof com.google.maps.android.data.geojson.GeoJsonFeature) {
                    polygonOptions = ((com.google.maps.android.data.geojson.GeoJsonFeature) feature).getPolygonOptions();
                } else if (feature instanceof com.google.maps.android.data.kml.KmlPlacemark) {
                    polygonOptions = ((com.google.maps.android.data.kml.KmlPlacemark) feature).getPolygonOptions();
                }
                return addPolygonToMap(polygonOptions, (com.google.maps.android.data.DataPolygon) geometry);
            case 5:
                if (feature instanceof com.google.maps.android.data.geojson.GeoJsonFeature) {
                    polylineOptions = ((com.google.maps.android.data.geojson.GeoJsonFeature) feature).getPolylineOptions();
                } else if (feature instanceof com.google.maps.android.data.kml.KmlPlacemark) {
                    polylineOptions = ((com.google.maps.android.data.kml.KmlPlacemark) feature).getPolylineOptions();
                }
                return addLineStringToMap(polylineOptions, (com.google.maps.android.data.geojson.GeoJsonLineString) geometry);
            case 6:
                return addGeometryCollectionToMap((com.google.maps.android.data.geojson.GeoJsonFeature) feature, ((com.google.maps.android.data.geojson.GeoJsonGeometryCollection) geometry).getGeometries());
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    protected java.lang.Object addKmlPlacemarkToMap(com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark, com.google.maps.android.data.Geometry geometry, com.google.maps.android.data.kml.KmlStyle kmlStyle, com.google.maps.android.data.kml.KmlStyle kmlStyle2, boolean z) {
        java.lang.String geometryType = geometry.getGeometryType();
        boolean zHasProperty = kmlPlacemark.hasProperty("drawOrder");
        byte b = 0;
        float f = 0.0f;
        if (zHasProperty) {
            try {
                f = java.lang.Float.parseFloat(kmlPlacemark.getProperty("drawOrder"));
            } catch (java.lang.NumberFormatException unused) {
                zHasProperty = false;
            }
        }
        geometryType.hashCode();
        switch (geometryType.hashCode()) {
            case 77292912:
                if (!geometryType.equals("Point")) {
                    b = -1;
                }
                break;
            case 89139371:
                if (!geometryType.equals("MultiGeometry")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1267133722:
                if (!geometryType.equals(com.google.maps.android.data.kml.KmlPolygon.GEOMETRY_TYPE)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1806700869:
                if (!geometryType.equals("LineString")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                com.google.android.gms.maps.model.MarkerOptions markerOptions = kmlStyle.getMarkerOptions();
                if (kmlStyle2 != null) {
                    setInlinePointStyle(markerOptions, kmlStyle2, kmlStyle.getIconUrl());
                } else if (kmlStyle.getIconUrl() != null) {
                    addMarkerIcons(kmlStyle.getIconUrl(), markerOptions);
                }
                com.google.android.gms.maps.model.Marker markerAddPointToMap = addPointToMap(markerOptions, (com.google.maps.android.data.kml.KmlPoint) geometry);
                markerAddPointToMap.setVisible(z);
                setMarkerInfoWindow(kmlStyle, markerAddPointToMap, kmlPlacemark);
                if (zHasProperty) {
                    markerAddPointToMap.setZIndex(f);
                }
                return markerAddPointToMap;
            case 1:
                return addMultiGeometryToMap(kmlPlacemark, (com.google.maps.android.data.kml.KmlMultiGeometry) geometry, kmlStyle, kmlStyle2, z);
            case 2:
                com.google.android.gms.maps.model.PolygonOptions polygonOptions = kmlStyle.getPolygonOptions();
                if (kmlStyle2 != null) {
                    setInlinePolygonStyle(polygonOptions, kmlStyle2);
                } else if (kmlStyle.isPolyRandomColorMode()) {
                    polygonOptions.fillColor(com.google.maps.android.data.kml.KmlStyle.computeRandomColor(polygonOptions.getFillColor()));
                }
                com.google.android.gms.maps.model.Polygon polygonAddPolygonToMap = addPolygonToMap(polygonOptions, (com.google.maps.android.data.DataPolygon) geometry);
                polygonAddPolygonToMap.setVisible(z);
                if (zHasProperty) {
                    polygonAddPolygonToMap.setZIndex(f);
                }
                return polygonAddPolygonToMap;
            case 3:
                com.google.android.gms.maps.model.PolylineOptions polylineOptions = kmlStyle.getPolylineOptions();
                if (kmlStyle2 != null) {
                    setInlineLineStringStyle(polylineOptions, kmlStyle2);
                } else if (kmlStyle.isLineRandomColorMode()) {
                    polylineOptions.color(com.google.maps.android.data.kml.KmlStyle.computeRandomColor(polylineOptions.getColor()));
                }
                com.google.android.gms.maps.model.Polyline polylineAddLineStringToMap = addLineStringToMap(polylineOptions, (com.google.maps.android.data.LineString) geometry);
                polylineAddLineStringToMap.setVisible(z);
                if (zHasProperty) {
                    polylineAddLineStringToMap.setZIndex(f);
                }
                return polylineAddLineStringToMap;
            default:
                return null;
        }
    }

    protected com.google.android.gms.maps.model.Marker addPointToMap(com.google.android.gms.maps.model.MarkerOptions markerOptions, com.google.maps.android.data.Point point) {
        markerOptions.position(point.getGeometryObject());
        return this.mMap.addMarker(markerOptions);
    }

    private void setInlinePointStyle(com.google.android.gms.maps.model.MarkerOptions markerOptions, com.google.maps.android.data.kml.KmlStyle kmlStyle, java.lang.String str) {
        com.google.android.gms.maps.model.MarkerOptions markerOptions2 = kmlStyle.getMarkerOptions();
        if (kmlStyle.isStyleSet("heading")) {
            markerOptions.rotation(markerOptions2.getRotation());
        }
        if (kmlStyle.isStyleSet("hotSpot")) {
            markerOptions.anchor(markerOptions2.getAnchorU(), markerOptions2.getAnchorV());
        }
        if (kmlStyle.isStyleSet("markerColor")) {
            markerOptions.icon(markerOptions2.getIcon());
        }
        if (kmlStyle.isStyleSet("iconUrl")) {
            addMarkerIcons(kmlStyle.getIconUrl(), markerOptions);
        } else if (str != null) {
            addMarkerIcons(str, markerOptions);
        }
    }

    protected com.google.android.gms.maps.model.Polyline addLineStringToMap(com.google.android.gms.maps.model.PolylineOptions polylineOptions, com.google.maps.android.data.LineString lineString) {
        polylineOptions.addAll(lineString.getGeometryObject());
        com.google.android.gms.maps.model.Polyline polylineAddPolyline = this.mMap.addPolyline(polylineOptions);
        polylineAddPolyline.setClickable(true);
        return polylineAddPolyline;
    }

    private void setInlineLineStringStyle(com.google.android.gms.maps.model.PolylineOptions polylineOptions, com.google.maps.android.data.kml.KmlStyle kmlStyle) {
        com.google.android.gms.maps.model.PolylineOptions polylineOptions2 = kmlStyle.getPolylineOptions();
        if (kmlStyle.isStyleSet("outlineColor")) {
            polylineOptions.color(polylineOptions2.getColor());
        }
        if (kmlStyle.isStyleSet(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY)) {
            polylineOptions.width(polylineOptions2.getWidth());
        }
        if (kmlStyle.isLineRandomColorMode()) {
            polylineOptions.color(com.google.maps.android.data.kml.KmlStyle.computeRandomColor(polylineOptions2.getColor()));
        }
    }

    protected com.google.android.gms.maps.model.Polygon addPolygonToMap(com.google.android.gms.maps.model.PolygonOptions polygonOptions, com.google.maps.android.data.DataPolygon dataPolygon) {
        polygonOptions.addAll(dataPolygon.getOuterBoundaryCoordinates());
        java.util.Iterator<java.util.List<com.google.android.gms.maps.model.LatLng>> it = dataPolygon.getInnerBoundaryCoordinates().iterator();
        while (it.hasNext()) {
            polygonOptions.addHole(it.next());
        }
        com.google.android.gms.maps.model.Polygon polygonAddPolygon = this.mMap.addPolygon(polygonOptions);
        polygonAddPolygon.setClickable(true);
        return polygonAddPolygon;
    }

    private void setInlinePolygonStyle(com.google.android.gms.maps.model.PolygonOptions polygonOptions, com.google.maps.android.data.kml.KmlStyle kmlStyle) {
        com.google.android.gms.maps.model.PolygonOptions polygonOptions2 = kmlStyle.getPolygonOptions();
        if (kmlStyle.hasFill() && kmlStyle.isStyleSet("fillColor")) {
            polygonOptions.fillColor(polygonOptions2.getFillColor());
        }
        if (kmlStyle.hasOutline()) {
            if (kmlStyle.isStyleSet("outlineColor")) {
                polygonOptions.strokeColor(polygonOptions2.getStrokeColor());
            }
            if (kmlStyle.isStyleSet(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY)) {
                polygonOptions.strokeWidth(polygonOptions2.getStrokeWidth());
            }
        }
        if (kmlStyle.isPolyRandomColorMode()) {
            polygonOptions.fillColor(com.google.maps.android.data.kml.KmlStyle.computeRandomColor(polygonOptions2.getFillColor()));
        }
    }

    private java.util.ArrayList<java.lang.Object> addGeometryCollectionToMap(com.google.maps.android.data.geojson.GeoJsonFeature geoJsonFeature, java.util.List<com.google.maps.android.data.Geometry> list) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.google.maps.android.data.Geometry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(addGeoJsonFeatureToMap(geoJsonFeature, it.next()));
        }
        return arrayList;
    }

    protected static boolean getPlacemarkVisibility(com.google.maps.android.data.Feature feature) {
        return (feature.hasProperty("visibility") && java.lang.Integer.parseInt(feature.getProperty("visibility")) == 0) ? false : true;
    }

    public void assignStyleMap(java.util.HashMap<java.lang.String, java.lang.String> map, java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> map2) {
        for (java.lang.String str : map.keySet()) {
            java.lang.String str2 = map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, map2.get(str2));
            }
        }
    }

    private java.util.ArrayList<java.lang.Object> addMultiGeometryToMap(com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark, com.google.maps.android.data.kml.KmlMultiGeometry kmlMultiGeometry, com.google.maps.android.data.kml.KmlStyle kmlStyle, com.google.maps.android.data.kml.KmlStyle kmlStyle2, boolean z) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.google.maps.android.data.Geometry> it = kmlMultiGeometry.getGeometryObject().iterator();
        while (it.hasNext()) {
            arrayList.add(addKmlPlacemarkToMap(kmlPlacemark, it.next(), kmlStyle, kmlStyle2, z));
        }
        return arrayList;
    }

    private java.util.ArrayList<com.google.android.gms.maps.model.Marker> addMultiPointToMap(com.google.maps.android.data.geojson.GeoJsonPointStyle geoJsonPointStyle, com.google.maps.android.data.geojson.GeoJsonMultiPoint geoJsonMultiPoint) {
        java.util.ArrayList<com.google.android.gms.maps.model.Marker> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.google.maps.android.data.geojson.GeoJsonPoint> it = geoJsonMultiPoint.getPoints().iterator();
        while (it.hasNext()) {
            arrayList.add(addPointToMap(geoJsonPointStyle.toMarkerOptions(), it.next()));
        }
        return arrayList;
    }

    private java.util.ArrayList<com.google.android.gms.maps.model.Polyline> addMultiLineStringToMap(com.google.maps.android.data.geojson.GeoJsonLineStringStyle geoJsonLineStringStyle, com.google.maps.android.data.geojson.GeoJsonMultiLineString geoJsonMultiLineString) {
        java.util.ArrayList<com.google.android.gms.maps.model.Polyline> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.google.maps.android.data.geojson.GeoJsonLineString> it = geoJsonMultiLineString.getLineStrings().iterator();
        while (it.hasNext()) {
            arrayList.add(addLineStringToMap(geoJsonLineStringStyle.toPolylineOptions(), it.next()));
        }
        return arrayList;
    }

    private java.util.ArrayList<com.google.android.gms.maps.model.Polygon> addMultiPolygonToMap(com.google.maps.android.data.geojson.GeoJsonPolygonStyle geoJsonPolygonStyle, com.google.maps.android.data.geojson.GeoJsonMultiPolygon geoJsonMultiPolygon) {
        java.util.ArrayList<com.google.android.gms.maps.model.Polygon> arrayList = new java.util.ArrayList<>();
        java.util.Iterator<com.google.maps.android.data.geojson.GeoJsonPolygon> it = geoJsonMultiPolygon.getPolygons().iterator();
        while (it.hasNext()) {
            arrayList.add(addPolygonToMap(geoJsonPolygonStyle.toPolygonOptions(), it.next()));
        }
        return arrayList;
    }

    private void addMarkerIcons(java.lang.String str, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
        if (this.mImagesCache.get(str) != null) {
            markerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(this.mImagesCache.get(str)));
        } else {
            if (this.mMarkerIconUrls.contains(str)) {
                return;
            }
            this.mMarkerIconUrls.add(str);
        }
    }

    public com.google.android.gms.maps.model.GroundOverlay attachGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) {
        return this.mMap.addGroundOverlay(groundOverlayOptions);
    }

    private void setMarkerInfoWindow(com.google.maps.android.data.kml.KmlStyle kmlStyle, com.google.android.gms.maps.model.Marker marker, com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark) {
        boolean zHasProperty = kmlPlacemark.hasProperty(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
        boolean zHasProperty2 = kmlPlacemark.hasProperty("description");
        boolean zHasBalloonStyle = kmlStyle.hasBalloonStyle();
        boolean zContainsKey = kmlStyle.getBalloonOptions().containsKey("text");
        if (zHasBalloonStyle && zContainsKey) {
            marker.setTitle(kmlStyle.getBalloonOptions().get("text"));
            createInfoWindow();
            return;
        }
        if (zHasBalloonStyle && zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
            createInfoWindow();
            return;
        }
        if (zHasProperty && zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
            marker.setSnippet(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME));
            createInfoWindow();
        }
    }

    private void createInfoWindow() {
        this.mMap.setInfoWindowAdapter(new com.google.android.gms.maps.GoogleMap.InfoWindowAdapter() { // from class: com.google.maps.android.data.Renderer.1
            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public android.view.View getInfoWindow(com.google.android.gms.maps.model.Marker marker) {
                return null;
            }

            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public android.view.View getInfoContents(com.google.android.gms.maps.model.Marker marker) {
                android.view.View viewInflate = android.view.LayoutInflater.from(com.google.maps.android.data.Renderer.this.mContext).inflate(com.google.maps.android.R.layout.amu_info_window, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(com.google.maps.android.R.id.window);
                if (marker.getSnippet() != null) {
                    textView.setText(android.text.Html.fromHtml(marker.getTitle() + "<br>" + marker.getSnippet()));
                } else {
                    textView.setText(android.text.Html.fromHtml(marker.getTitle()));
                }
                return viewInflate;
            }
        });
    }
}
