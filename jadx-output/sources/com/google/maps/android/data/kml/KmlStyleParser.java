package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
class KmlStyleParser {
    private static final java.lang.String COLOR_STYLE_COLOR = "color";
    private static final java.lang.String COLOR_STYLE_MODE = "colorMode";
    private static final java.lang.String ICON_STYLE_HEADING = "heading";
    private static final java.lang.String ICON_STYLE_HOTSPOT = "hotSpot";
    private static final java.lang.String ICON_STYLE_SCALE = "scale";
    private static final java.lang.String ICON_STYLE_URL = "Icon";
    private static final java.lang.String LINE_STYLE_WIDTH = "width";
    private static final java.lang.String POLY_STYLE_FILL = "fill";
    private static final java.lang.String POLY_STYLE_OUTLINE = "outline";
    private static final java.lang.String STYLE_MAP_KEY = "key";
    private static final java.lang.String STYLE_MAP_NORMAL_STYLE = "normal";
    private static final java.lang.String STYLE_TAG = "styleUrl";

    KmlStyleParser() {
    }

    static com.google.maps.android.data.kml.KmlStyle createStyle(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.google.maps.android.data.kml.KmlStyle kmlStyle = new com.google.maps.android.data.kml.KmlStyle();
        setStyleId(xmlPullParser.getAttributeValue(null, "id"), kmlStyle);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return kmlStyle;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    createIconStyle(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    createLineStyle(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    createPolyStyle(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    createBalloonStyle(xmlPullParser, kmlStyle);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void setStyleId(java.lang.String str, com.google.maps.android.data.kml.KmlStyle kmlStyle) {
        if (str != null) {
            kmlStyle.setStyleId("#" + str);
        }
    }

    private static void createIconStyle(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.maps.android.data.kml.KmlStyle kmlStyle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(ICON_STYLE_HEADING)) {
                    kmlStyle.setHeading(java.lang.Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(ICON_STYLE_URL)) {
                    setIconUrl(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals(ICON_STYLE_HOTSPOT)) {
                    setIconHotSpot(xmlPullParser, kmlStyle);
                } else if (xmlPullParser.getName().equals(ICON_STYLE_SCALE)) {
                    kmlStyle.setIconScale(java.lang.Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_COLOR)) {
                    kmlStyle.setMarkerColor(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_MODE)) {
                    kmlStyle.setIconColorMode(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static java.util.HashMap<java.lang.String, java.lang.String> createStyleMap(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        java.lang.String str = "#" + xmlPullParser.getAttributeValue(null, "id");
        int eventType = xmlPullParser.getEventType();
        java.lang.Boolean bool = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(STYLE_MAP_KEY) && xmlPullParser.nextText().equals(STYLE_MAP_NORMAL_STYLE)) {
                    bool = true;
                } else if (xmlPullParser.getName().equals(STYLE_TAG) && bool.booleanValue()) {
                    map.put(str, xmlPullParser.nextText());
                    bool = false;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void createBalloonStyle(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.maps.android.data.kml.KmlStyle kmlStyle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                kmlStyle.setInfoWindowText(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void setIconUrl(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.maps.android.data.kml.KmlStyle kmlStyle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(ICON_STYLE_URL)) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                kmlStyle.setIconUrl(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void setIconHotSpot(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.maps.android.data.kml.KmlStyle kmlStyle) {
        java.lang.Float fValueOf = java.lang.Float.valueOf(java.lang.Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")));
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(java.lang.Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")));
        kmlStyle.setHotSpot(fValueOf.floatValue(), fValueOf2.floatValue(), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
    }

    private static void createLineStyle(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.maps.android.data.kml.KmlStyle kmlStyle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(COLOR_STYLE_COLOR)) {
                    kmlStyle.setOutlineColor(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("width")) {
                    kmlStyle.setWidth(java.lang.Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_MODE)) {
                    kmlStyle.setLineColorMode(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void createPolyStyle(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.maps.android.data.kml.KmlStyle kmlStyle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(COLOR_STYLE_COLOR)) {
                    kmlStyle.setFillColor(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(POLY_STYLE_OUTLINE)) {
                    kmlStyle.setOutline(com.google.maps.android.data.kml.KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(POLY_STYLE_FILL)) {
                    kmlStyle.setFill(com.google.maps.android.data.kml.KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(COLOR_STYLE_MODE)) {
                    kmlStyle.setPolyColorMode(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
