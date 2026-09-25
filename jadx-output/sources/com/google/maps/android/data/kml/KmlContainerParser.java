package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
class KmlContainerParser {
    private static final java.lang.String CONTAINER_REGEX = "Folder|Document";
    private static final java.lang.String EXTENDED_DATA = "ExtendedData";
    private static final java.lang.String GROUND_OVERLAY = "GroundOverlay";
    private static final java.lang.String PLACEMARK = "Placemark";
    private static final java.lang.String PROPERTY_REGEX = "name|description|visibility|open|address|phoneNumber";
    private static final java.lang.String STYLE = "Style";
    private static final java.lang.String STYLE_MAP = "StyleMap";
    private static final java.lang.String UNSUPPORTED_REGEX = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    KmlContainerParser() {
    }

    static com.google.maps.android.data.kml.KmlContainer createContainer(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return assignPropertiesToContainer(xmlPullParser);
    }

    private static com.google.maps.android.data.kml.KmlContainer assignPropertiesToContainer(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String name = xmlPullParser.getName();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map4 = new java.util.HashMap();
        java.util.HashMap map5 = new java.util.HashMap();
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "id") != null ? xmlPullParser.getAttributeValue(null, "id") : null;
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(name)) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().matches(UNSUPPORTED_REGEX)) {
                        com.google.maps.android.data.kml.KmlParser.skip(xmlPullParser);
                    } else if (xmlPullParser.getName().matches(CONTAINER_REGEX)) {
                        arrayList.add(assignPropertiesToContainer(xmlPullParser));
                    } else if (xmlPullParser.getName().matches(PROPERTY_REGEX)) {
                        map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(STYLE_MAP)) {
                        setContainerStyleMap(xmlPullParser, map4);
                    } else if (xmlPullParser.getName().equals(STYLE)) {
                        setContainerStyle(xmlPullParser, map2);
                    } else if (xmlPullParser.getName().equals(PLACEMARK)) {
                        setContainerPlacemark(xmlPullParser, map3);
                    } else if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                        setExtendedDataProperties(xmlPullParser, map);
                    } else if (xmlPullParser.getName().equals(GROUND_OVERLAY)) {
                        map5.put(com.google.maps.android.data.kml.KmlFeatureParser.createGroundOverlay(xmlPullParser), null);
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlContainer(map, map2, map3, map4, arrayList, map5, attributeValue);
            }
        }
    }

    private static void setContainerStyleMap(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.HashMap<java.lang.String, java.lang.String> map) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        map.putAll(com.google.maps.android.data.kml.KmlStyleParser.createStyleMap(xmlPullParser));
    }

    private static void setExtendedDataProperties(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.HashMap<java.lang.String, java.lang.String> map) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        java.lang.String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(EXTENDED_DATA)) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    attributeValue = xmlPullParser.getAttributeValue(null, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                } else if (xmlPullParser.getName().equals("value") && attributeValue != null) {
                    map.put(attributeValue, xmlPullParser.nextText());
                    attributeValue = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void setContainerStyle(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> map) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (xmlPullParser.getAttributeValue(null, "id") != null) {
            com.google.maps.android.data.kml.KmlStyle kmlStyleCreateStyle = com.google.maps.android.data.kml.KmlStyleParser.createStyle(xmlPullParser);
            map.put(kmlStyleCreateStyle.getStyleId(), kmlStyleCreateStyle);
        }
    }

    private static void setContainerPlacemark(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> map) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        map.put(com.google.maps.android.data.kml.KmlFeatureParser.createPlacemark(xmlPullParser), null);
    }
}
