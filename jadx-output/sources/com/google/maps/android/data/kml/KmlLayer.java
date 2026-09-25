package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlLayer extends com.google.maps.android.data.Layer {
    public KmlLayer(com.google.android.gms.maps.GoogleMap googleMap, int i, android.content.Context context) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        this(googleMap, context.getResources().openRawResource(i), context);
    }

    public KmlLayer(com.google.android.gms.maps.GoogleMap googleMap, java.io.InputStream inputStream, android.content.Context context) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (inputStream == null) {
            throw new java.lang.IllegalArgumentException("KML InputStream cannot be null");
        }
        com.google.maps.android.data.kml.KmlRenderer kmlRenderer = new com.google.maps.android.data.kml.KmlRenderer(googleMap, context);
        com.google.maps.android.data.kml.KmlParser kmlParser = new com.google.maps.android.data.kml.KmlParser(createXmlParser(inputStream));
        kmlParser.parseKml();
        inputStream.close();
        kmlRenderer.storeKmlData(kmlParser.getStyles(), kmlParser.getStyleMaps(), kmlParser.getPlacemarks(), kmlParser.getContainers(), kmlParser.getGroundOverlays());
        storeRenderer(kmlRenderer);
    }

    private static org.xmlpull.v1.XmlPullParser createXmlParser(java.io.InputStream inputStream) throws org.xmlpull.v1.XmlPullParserException {
        org.xmlpull.v1.XmlPullParserFactory xmlPullParserFactoryNewInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    public void addLayerToMap() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        super.addKMLToMap();
    }

    public boolean hasPlacemarks() {
        return hasFeatures();
    }

    public java.lang.Iterable<com.google.maps.android.data.kml.KmlPlacemark> getPlacemarks() {
        return getFeatures();
    }

    @Override // com.google.maps.android.data.Layer
    public boolean hasContainers() {
        return super.hasContainers();
    }

    @Override // com.google.maps.android.data.Layer
    public java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> getContainers() {
        return super.getContainers();
    }

    @Override // com.google.maps.android.data.Layer
    public java.lang.Iterable<com.google.maps.android.data.kml.KmlGroundOverlay> getGroundOverlays() {
        return super.getGroundOverlays();
    }
}
