package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
class KmlParser {
    private static final java.lang.String CONTAINER_REGEX = "Folder|Document";
    private static final java.lang.String GROUND_OVERLAY = "GroundOverlay";
    private static final java.lang.String PLACEMARK = "Placemark";
    private static final java.lang.String STYLE = "Style";
    private static final java.lang.String STYLE_MAP = "StyleMap";
    private static final java.lang.String UNSUPPORTED_REGEX = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";
    private final org.xmlpull.v1.XmlPullParser mParser;
    private final java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> mPlacemarks = new java.util.HashMap<>();
    private final java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> mContainers = new java.util.ArrayList<>();
    private final java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> mStyles = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> mStyleMaps = new java.util.HashMap<>();
    private final java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> mGroundOverlays = new java.util.HashMap<>();

    KmlParser(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.mParser = xmlPullParser;
    }

    void parseKml() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = this.mParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.mParser.getName().matches(UNSUPPORTED_REGEX)) {
                    skip(this.mParser);
                }
                if (this.mParser.getName().matches(CONTAINER_REGEX)) {
                    this.mContainers.add(com.google.maps.android.data.kml.KmlContainerParser.createContainer(this.mParser));
                }
                if (this.mParser.getName().equals(STYLE)) {
                    com.google.maps.android.data.kml.KmlStyle kmlStyleCreateStyle = com.google.maps.android.data.kml.KmlStyleParser.createStyle(this.mParser);
                    this.mStyles.put(kmlStyleCreateStyle.getStyleId(), kmlStyleCreateStyle);
                }
                if (this.mParser.getName().equals(STYLE_MAP)) {
                    this.mStyleMaps.putAll(com.google.maps.android.data.kml.KmlStyleParser.createStyleMap(this.mParser));
                }
                if (this.mParser.getName().equals(PLACEMARK)) {
                    this.mPlacemarks.put(com.google.maps.android.data.kml.KmlFeatureParser.createPlacemark(this.mParser), null);
                }
                if (this.mParser.getName().equals(GROUND_OVERLAY)) {
                    this.mGroundOverlays.put(com.google.maps.android.data.kml.KmlFeatureParser.createGroundOverlay(this.mParser), null);
                }
            }
            eventType = this.mParser.next();
        }
        this.mStyles.put(null, new com.google.maps.android.data.kml.KmlStyle());
    }

    java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> getStyles() {
        return this.mStyles;
    }

    java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> getPlacemarks() {
        return this.mPlacemarks;
    }

    java.util.HashMap<java.lang.String, java.lang.String> getStyleMaps() {
        return this.mStyleMaps;
    }

    java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> getContainers() {
        return this.mContainers;
    }

    java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> getGroundOverlays() {
        return this.mGroundOverlays;
    }

    static void skip(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new java.lang.IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
