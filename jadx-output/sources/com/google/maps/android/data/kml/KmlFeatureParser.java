package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
class KmlFeatureParser {
    private static final java.lang.String BOUNDARY_REGEX = "outerBoundaryIs|innerBoundaryIs";
    private static final java.lang.String COMPASS_REGEX = "north|south|east|west";
    private static final java.lang.String EXTENDED_DATA = "ExtendedData";
    private static final java.lang.String GEOMETRY_REGEX = "Point|LineString|Polygon|MultiGeometry";
    private static final int LATITUDE_INDEX = 1;
    private static final int LONGITUDE_INDEX = 0;
    private static final java.lang.String PROPERTY_REGEX = "name|description|drawOrder|visibility|open|address|phoneNumber";
    private static final java.lang.String STYLE_TAG = "Style";
    private static final java.lang.String STYLE_URL_TAG = "styleUrl";

    KmlFeatureParser() {
    }

    static com.google.maps.android.data.kml.KmlPlacemark createPlacemark(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.HashMap map = new java.util.HashMap();
        int eventType = xmlPullParser.getEventType();
        com.google.maps.android.data.Geometry geometryCreateGeometry = null;
        java.lang.String strNextText = null;
        com.google.maps.android.data.kml.KmlStyle kmlStyleCreateStyle = null;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("Placemark")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(STYLE_URL_TAG)) {
                        strNextText = xmlPullParser.nextText();
                    } else if (xmlPullParser.getName().matches(GEOMETRY_REGEX)) {
                        geometryCreateGeometry = createGeometry(xmlPullParser, xmlPullParser.getName());
                    } else if (xmlPullParser.getName().matches(PROPERTY_REGEX)) {
                        map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                        map.putAll(setExtendedDataProperties(xmlPullParser));
                    } else if (xmlPullParser.getName().equals(STYLE_TAG)) {
                        kmlStyleCreateStyle = com.google.maps.android.data.kml.KmlStyleParser.createStyle(xmlPullParser);
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlPlacemark(geometryCreateGeometry, strNextText, kmlStyleCreateStyle, map);
            }
        }
    }

    static com.google.maps.android.data.kml.KmlGroundOverlay createGroundOverlay(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        int eventType = xmlPullParser.getEventType();
        java.lang.String imageUrl = null;
        float f = 0.0f;
        int i = 1;
        float rotation = 0.0f;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("GroundOverlay")) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("Icon")) {
                        imageUrl = getImageUrl(xmlPullParser);
                    } else if (xmlPullParser.getName().equals("drawOrder")) {
                        f = java.lang.Float.parseFloat(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals("visibility")) {
                        i = java.lang.Integer.parseInt(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(EXTENDED_DATA)) {
                        map.putAll(setExtendedDataProperties(xmlPullParser));
                    } else if (xmlPullParser.getName().equals("rotation")) {
                        rotation = getRotation(xmlPullParser);
                    } else if (xmlPullParser.getName().matches(PROPERTY_REGEX) || xmlPullParser.getName().equals("color")) {
                        map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().matches(COMPASS_REGEX)) {
                        map2.put(xmlPullParser.getName(), java.lang.Double.valueOf(java.lang.Double.parseDouble(xmlPullParser.nextText())));
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlGroundOverlay(imageUrl, createLatLngBounds((java.lang.Double) map2.get("north"), (java.lang.Double) map2.get("south"), (java.lang.Double) map2.get("east"), (java.lang.Double) map2.get("west")), f, i, map, rotation);
            }
        }
    }

    private static float getRotation(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return -java.lang.Float.parseFloat(xmlPullParser.nextText());
    }

    private static java.lang.String getImageUrl(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static com.google.maps.android.data.Geometry createGeometry(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Point")) {
                    return createPoint(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("LineString")) {
                    return createLineString(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(com.google.maps.android.data.kml.KmlPolygon.GEOMETRY_TYPE)) {
                    return createPolygon(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return createMultiGeometry(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static java.util.HashMap<java.lang.String, java.lang.String> setExtendedDataProperties(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        int eventType = xmlPullParser.getEventType();
        java.lang.String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(EXTENDED_DATA)) {
                return map;
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

    private static com.google.maps.android.data.kml.KmlPoint createPoint(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        com.google.android.gms.maps.model.LatLng latLngConvertToLatLng = null;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("Point")) {
                if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                    latLngConvertToLatLng = convertToLatLng(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlPoint(latLngConvertToLatLng);
            }
        }
    }

    private static com.google.maps.android.data.kml.KmlLineString createLineString(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.ArrayList<com.google.android.gms.maps.model.LatLng> arrayList = new java.util.ArrayList<>();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals("LineString")) {
                if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                    arrayList = convertToLatLngArray(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlLineString(arrayList);
            }
        }
    }

    private static com.google.maps.android.data.kml.KmlPolygon createPolygon(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.Boolean boolValueOf = false;
        java.util.ArrayList<com.google.android.gms.maps.model.LatLng> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(com.google.maps.android.data.kml.KmlPolygon.GEOMETRY_TYPE)) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().matches(BOUNDARY_REGEX)) {
                        boolValueOf = java.lang.Boolean.valueOf(xmlPullParser.getName().equals("outerBoundaryIs"));
                    } else if (xmlPullParser.getName().equals("coordinates")) {
                        if (boolValueOf.booleanValue()) {
                            arrayList = convertToLatLngArray(xmlPullParser.nextText());
                        } else {
                            arrayList2.add(convertToLatLngArray(xmlPullParser.nextText()));
                        }
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlPolygon(arrayList, arrayList2);
            }
        }
    }

    private static com.google.maps.android.data.kml.KmlMultiGeometry createMultiGeometry(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next != 3 || !xmlPullParser.getName().equals("MultiGeometry")) {
                if (next == 2 && xmlPullParser.getName().matches(GEOMETRY_REGEX)) {
                    arrayList.add(createGeometry(xmlPullParser, xmlPullParser.getName()));
                }
                next = xmlPullParser.next();
            } else {
                return new com.google.maps.android.data.kml.KmlMultiGeometry(arrayList);
            }
        }
    }

    private static java.util.ArrayList<com.google.android.gms.maps.model.LatLng> convertToLatLngArray(java.lang.String str) {
        java.util.ArrayList<com.google.android.gms.maps.model.LatLng> arrayList = new java.util.ArrayList<>();
        for (java.lang.String str2 : str.trim().split("(\\s+)")) {
            arrayList.add(convertToLatLng(str2));
        }
        return arrayList;
    }

    private static com.google.android.gms.maps.model.LatLng convertToLatLng(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split(",");
        return new com.google.android.gms.maps.model.LatLng(java.lang.Double.valueOf(java.lang.Double.parseDouble(strArrSplit[1])).doubleValue(), java.lang.Double.valueOf(java.lang.Double.parseDouble(strArrSplit[0])).doubleValue());
    }

    private static com.google.android.gms.maps.model.LatLngBounds createLatLngBounds(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4) {
        return new com.google.android.gms.maps.model.LatLngBounds(new com.google.android.gms.maps.model.LatLng(d2.doubleValue(), d4.doubleValue()), new com.google.android.gms.maps.model.LatLng(d.doubleValue(), d3.doubleValue()));
    }
}
