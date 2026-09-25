package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlRenderer extends com.google.maps.android.data.Renderer {
    private static final java.lang.String LOG_TAG = "KmlRenderer";
    private java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> mContainers;
    private boolean mGroundOverlayImagesDownloaded;
    private final java.util.ArrayList<java.lang.String> mGroundOverlayUrls;
    private java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> mGroundOverlays;
    private boolean mMarkerIconsDownloaded;

    KmlRenderer(com.google.android.gms.maps.GoogleMap googleMap, android.content.Context context) {
        super(googleMap, context);
        this.mGroundOverlayUrls = new java.util.ArrayList<>();
        this.mMarkerIconsDownloaded = false;
        this.mGroundOverlayImagesDownloaded = false;
    }

    private static com.google.android.gms.maps.model.BitmapDescriptor scaleIcon(android.graphics.Bitmap bitmap, java.lang.Double d) {
        return com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) * d.doubleValue()), (int) (((double) bitmap.getHeight()) * d.doubleValue()), false));
    }

    private void removePlacemarks(java.util.HashMap<? extends com.google.maps.android.data.Feature, java.lang.Object> map) {
        removeFeatures(map);
    }

    static boolean getContainerVisibility(com.google.maps.android.data.kml.KmlContainer kmlContainer, boolean z) {
        return z && (!kmlContainer.hasProperty("visibility") || java.lang.Integer.parseInt(kmlContainer.getProperty("visibility")) != 0);
    }

    private void removeGroundOverlays(java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map) {
        java.util.Iterator<com.google.android.gms.maps.model.GroundOverlay> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
    }

    private void removeContainers(java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> iterable) {
        for (com.google.maps.android.data.kml.KmlContainer kmlContainer : iterable) {
            removePlacemarks(kmlContainer.getPlacemarksHashMap());
            removeGroundOverlays(kmlContainer.getGroundOverlayHashMap());
            removeContainers(kmlContainer.getContainers());
        }
    }

    public void addLayerToMap() {
        setLayerVisibility(true);
        this.mGroundOverlays = getGroundOverlayMap();
        this.mContainers = getContainerList();
        putStyles();
        assignStyleMap(getStyleMaps(), getStylesRenderer());
        addGroundOverlays(this.mGroundOverlays, this.mContainers);
        addContainerGroupToMap(this.mContainers, true);
        addPlacemarksToMap(getAllFeatures());
        if (!this.mGroundOverlayImagesDownloaded) {
            downloadGroundOverlays();
        }
        if (this.mMarkerIconsDownloaded) {
            return;
        }
        downloadMarkerIcons();
    }

    void storeKmlData(java.util.HashMap<java.lang.String, com.google.maps.android.data.kml.KmlStyle> map, java.util.HashMap<java.lang.String, java.lang.String> map2, java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> map3, java.util.ArrayList<com.google.maps.android.data.kml.KmlContainer> arrayList, java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map4) {
        storeData(map, map2, map3, arrayList, map4);
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(com.google.android.gms.maps.GoogleMap googleMap) {
        removeLayerFromMap();
        super.setMap(googleMap);
        addLayerToMap();
    }

    boolean hasKmlPlacemarks() {
        return hasFeatures();
    }

    java.lang.Iterable<? extends com.google.maps.android.data.Feature> getKmlPlacemarks() {
        return getFeatures();
    }

    public boolean hasNestedContainers() {
        return this.mContainers.size() > 0;
    }

    public java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> getNestedContainers() {
        return this.mContainers;
    }

    public java.lang.Iterable<com.google.maps.android.data.kml.KmlGroundOverlay> getGroundOverlays() {
        return this.mGroundOverlays.keySet();
    }

    public void removeLayerFromMap() {
        removePlacemarks(getAllFeatures());
        removeGroundOverlays(this.mGroundOverlays);
        if (hasNestedContainers()) {
            removeContainers(getNestedContainers());
        }
        setLayerVisibility(false);
        clearStylesRenderer();
    }

    private void addPlacemarksToMap(java.util.HashMap<? extends com.google.maps.android.data.Feature, java.lang.Object> map) {
        java.util.Iterator<? extends com.google.maps.android.data.Feature> it = map.keySet().iterator();
        while (it.hasNext()) {
            addFeature(it.next());
        }
    }

    private void addContainerGroupToMap(java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> iterable, boolean z) {
        for (com.google.maps.android.data.kml.KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z);
            if (kmlContainer.getStyles() != null) {
                putStyles(kmlContainer.getStyles());
            }
            if (kmlContainer.getStyleMap() != null) {
                super.assignStyleMap(kmlContainer.getStyleMap(), getStylesRenderer());
            }
            addContainerObjectToMap(kmlContainer, containerVisibility);
            if (kmlContainer.hasContainers()) {
                addContainerGroupToMap(kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    private void addContainerObjectToMap(com.google.maps.android.data.kml.KmlContainer kmlContainer, boolean z) {
        for (com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark : kmlContainer.getPlacemarks()) {
            boolean z2 = z && getPlacemarkVisibility(kmlPlacemark);
            if (kmlPlacemark.getGeometry() != null) {
                java.lang.String id = kmlPlacemark.getId();
                com.google.maps.android.data.Geometry geometry = kmlPlacemark.getGeometry();
                com.google.maps.android.data.kml.KmlStyle placemarkStyle = getPlacemarkStyle(id);
                com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark2 = kmlPlacemark;
                java.lang.Object objAddKmlPlacemarkToMap = addKmlPlacemarkToMap(kmlPlacemark2, geometry, placemarkStyle, kmlPlacemark2.getInlineStyle(), z2);
                kmlContainer.setPlacemark(kmlPlacemark2, objAddKmlPlacemarkToMap);
                putContainerFeature(objAddKmlPlacemarkToMap, kmlPlacemark);
            }
        }
    }

    private void downloadMarkerIcons() {
        this.mMarkerIconsDownloaded = true;
        java.util.Iterator<java.lang.String> it = getMarkerIconUrls().iterator();
        while (it.hasNext()) {
            new com.google.maps.android.data.kml.KmlRenderer.MarkerIconImageDownload(it.next()).execute(new java.lang.String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIconToMarkers(java.lang.String str, java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> map) {
        for (com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark : map.keySet()) {
            com.google.maps.android.data.kml.KmlStyle kmlStyle = getStylesRenderer().get(kmlPlacemark.getId());
            com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark2 = kmlPlacemark;
            com.google.maps.android.data.kml.KmlStyle inlineStyle = kmlPlacemark2.getInlineStyle();
            if ("Point".equals(kmlPlacemark.getGeometry().getGeometryType())) {
                boolean z = inlineStyle != null && str.equals(inlineStyle.getIconUrl());
                boolean z2 = kmlStyle != null && str.equals(kmlStyle.getIconUrl());
                if (z) {
                    scaleBitmap(inlineStyle, map, kmlPlacemark2);
                } else if (z2) {
                    scaleBitmap(kmlStyle, map, kmlPlacemark2);
                }
            }
        }
    }

    private void scaleBitmap(com.google.maps.android.data.kml.KmlStyle kmlStyle, java.util.HashMap<com.google.maps.android.data.kml.KmlPlacemark, java.lang.Object> map, com.google.maps.android.data.kml.KmlPlacemark kmlPlacemark) {
        double iconScale = kmlStyle.getIconScale();
        ((com.google.android.gms.maps.model.Marker) map.get(kmlPlacemark)).setIcon(scaleIcon(getImagesCache().get(kmlStyle.getIconUrl()), java.lang.Double.valueOf(iconScale)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContainerGroupIconsToMarkers(java.lang.String str, java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> iterable) {
        for (com.google.maps.android.data.kml.KmlContainer kmlContainer : iterable) {
            addIconToMarkers(str, kmlContainer.getPlacemarksHashMap());
            if (kmlContainer.hasContainers()) {
                addContainerGroupIconsToMarkers(str, kmlContainer.getContainers());
            }
        }
    }

    private void addGroundOverlays(java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map, java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> iterable) {
        addGroundOverlays(map);
        for (com.google.maps.android.data.kml.KmlContainer kmlContainer : iterable) {
            addGroundOverlays(kmlContainer.getGroundOverlayHashMap(), kmlContainer.getContainers());
        }
    }

    private void addGroundOverlays(java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map) {
        for (com.google.maps.android.data.kml.KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            java.lang.String imageUrl = kmlGroundOverlay.getImageUrl();
            if (imageUrl != null && kmlGroundOverlay.getLatLngBox() != null) {
                if (getImagesCache().get(imageUrl) != null) {
                    addGroundOverlayToMap(imageUrl, this.mGroundOverlays, true);
                } else if (!this.mGroundOverlayUrls.contains(imageUrl)) {
                    this.mGroundOverlayUrls.add(imageUrl);
                }
            }
        }
    }

    private void downloadGroundOverlays() {
        this.mGroundOverlayImagesDownloaded = true;
        java.util.Iterator<java.lang.String> it = this.mGroundOverlayUrls.iterator();
        while (it.hasNext()) {
            new com.google.maps.android.data.kml.KmlRenderer.GroundOverlayImageDownload(it.next()).execute(new java.lang.String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayToMap(java.lang.String str, java.util.HashMap<com.google.maps.android.data.kml.KmlGroundOverlay, com.google.android.gms.maps.model.GroundOverlay> map, boolean z) {
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptorFromBitmap = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(getImagesCache().get(str));
        for (com.google.maps.android.data.kml.KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            if (kmlGroundOverlay.getImageUrl().equals(str)) {
                com.google.android.gms.maps.model.GroundOverlay groundOverlayAttachGroundOverlay = attachGroundOverlay(kmlGroundOverlay.getGroundOverlayOptions().image(bitmapDescriptorFromBitmap));
                if (!z) {
                    groundOverlayAttachGroundOverlay.setVisible(false);
                }
                map.put(kmlGroundOverlay, groundOverlayAttachGroundOverlay);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayInContainerGroups(java.lang.String str, java.lang.Iterable<com.google.maps.android.data.kml.KmlContainer> iterable, boolean z) {
        for (com.google.maps.android.data.kml.KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z);
            addGroundOverlayToMap(str, kmlContainer.getGroundOverlayHashMap(), containerVisibility);
            if (kmlContainer.hasContainers()) {
                addGroundOverlayInContainerGroups(str, kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    private class MarkerIconImageDownload extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
        private final java.lang.String mIconUrl;

        public MarkerIconImageDownload(java.lang.String str) {
            this.mIconUrl = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public android.graphics.Bitmap doInBackground(java.lang.String... strArr) {
            try {
                return android.graphics.BitmapFactory.decodeStream((java.io.InputStream) new java.net.URL(this.mIconUrl).getContent());
            } catch (java.net.MalformedURLException unused) {
                return android.graphics.BitmapFactory.decodeFile(this.mIconUrl);
            } catch (java.io.IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                android.util.Log.e(com.google.maps.android.data.kml.KmlRenderer.LOG_TAG, "Image at this URL could not be found " + this.mIconUrl);
                return;
            }
            com.google.maps.android.data.kml.KmlRenderer.this.putImagesCache(this.mIconUrl, bitmap);
            if (com.google.maps.android.data.kml.KmlRenderer.this.isLayerOnMap()) {
                com.google.maps.android.data.kml.KmlRenderer kmlRenderer = com.google.maps.android.data.kml.KmlRenderer.this;
                kmlRenderer.addIconToMarkers(this.mIconUrl, kmlRenderer.getAllFeatures());
                com.google.maps.android.data.kml.KmlRenderer kmlRenderer2 = com.google.maps.android.data.kml.KmlRenderer.this;
                kmlRenderer2.addContainerGroupIconsToMarkers(this.mIconUrl, kmlRenderer2.mContainers);
            }
        }
    }

    private class GroundOverlayImageDownload extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
        private final java.lang.String mGroundOverlayUrl;

        public GroundOverlayImageDownload(java.lang.String str) {
            this.mGroundOverlayUrl = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public android.graphics.Bitmap doInBackground(java.lang.String... strArr) {
            try {
                return android.graphics.BitmapFactory.decodeStream((java.io.InputStream) new java.net.URL(this.mGroundOverlayUrl).getContent());
            } catch (java.net.MalformedURLException unused) {
                return android.graphics.BitmapFactory.decodeFile(this.mGroundOverlayUrl);
            } catch (java.io.IOException e) {
                android.util.Log.e(com.google.maps.android.data.kml.KmlRenderer.LOG_TAG, "Image [" + this.mGroundOverlayUrl + "] download issue", e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(android.graphics.Bitmap bitmap) {
            if (bitmap == null) {
                android.util.Log.e(com.google.maps.android.data.kml.KmlRenderer.LOG_TAG, "Image at this URL could not be found " + this.mGroundOverlayUrl);
                return;
            }
            com.google.maps.android.data.kml.KmlRenderer.this.putImagesCache(this.mGroundOverlayUrl, bitmap);
            if (com.google.maps.android.data.kml.KmlRenderer.this.isLayerOnMap()) {
                com.google.maps.android.data.kml.KmlRenderer kmlRenderer = com.google.maps.android.data.kml.KmlRenderer.this;
                kmlRenderer.addGroundOverlayToMap(this.mGroundOverlayUrl, kmlRenderer.mGroundOverlays, true);
                com.google.maps.android.data.kml.KmlRenderer kmlRenderer2 = com.google.maps.android.data.kml.KmlRenderer.this;
                kmlRenderer2.addGroundOverlayInContainerGroups(this.mGroundOverlayUrl, kmlRenderer2.mContainers, true);
            }
        }
    }
}
