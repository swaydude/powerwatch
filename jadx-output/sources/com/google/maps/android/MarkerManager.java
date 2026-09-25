package com.google.maps.android;

/* JADX INFO: loaded from: classes2.dex */
public class MarkerManager implements com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener, com.google.android.gms.maps.GoogleMap.OnMarkerDragListener, com.google.android.gms.maps.GoogleMap.InfoWindowAdapter {
    private final com.google.android.gms.maps.GoogleMap mMap;
    private final java.util.Map<java.lang.String, com.google.maps.android.MarkerManager.Collection> mNamedCollections = new java.util.HashMap();
    private final java.util.Map<com.google.android.gms.maps.model.Marker, com.google.maps.android.MarkerManager.Collection> mAllMarkers = new java.util.HashMap();

    public MarkerManager(com.google.android.gms.maps.GoogleMap googleMap) {
        this.mMap = googleMap;
    }

    public com.google.maps.android.MarkerManager.Collection newCollection() {
        return new com.google.maps.android.MarkerManager.Collection();
    }

    public com.google.maps.android.MarkerManager.Collection newCollection(java.lang.String str) {
        if (this.mNamedCollections.get(str) != null) {
            throw new java.lang.IllegalArgumentException("collection id is not unique: " + str);
        }
        com.google.maps.android.MarkerManager.Collection collection = new com.google.maps.android.MarkerManager.Collection();
        this.mNamedCollections.put(str, collection);
        return collection;
    }

    public com.google.maps.android.MarkerManager.Collection getCollection(java.lang.String str) {
        return this.mNamedCollections.get(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public android.view.View getInfoWindow(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mInfoWindowAdapter == null) {
            return null;
        }
        return collection.mInfoWindowAdapter.getInfoWindow(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public android.view.View getInfoContents(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mInfoWindowAdapter == null) {
            return null;
        }
        return collection.mInfoWindowAdapter.getInfoContents(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mInfoWindowClickListener == null) {
            return;
        }
        collection.mInfoWindowClickListener.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mMarkerClickListener == null) {
            return false;
        }
        return collection.mMarkerClickListener.onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDragStart(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDrag(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        if (collection == null || collection.mMarkerDragListener == null) {
            return;
        }
        collection.mMarkerDragListener.onMarkerDragEnd(marker);
    }

    public boolean remove(com.google.android.gms.maps.model.Marker marker) {
        com.google.maps.android.MarkerManager.Collection collection = this.mAllMarkers.get(marker);
        return collection != null && collection.remove(marker);
    }

    public class Collection {
        private com.google.android.gms.maps.GoogleMap.InfoWindowAdapter mInfoWindowAdapter;
        private com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener mInfoWindowClickListener;
        private com.google.android.gms.maps.GoogleMap.OnMarkerClickListener mMarkerClickListener;
        private com.google.android.gms.maps.GoogleMap.OnMarkerDragListener mMarkerDragListener;
        private final java.util.Set<com.google.android.gms.maps.model.Marker> mMarkers = new java.util.HashSet();

        public Collection() {
        }

        public com.google.android.gms.maps.model.Marker addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) {
            com.google.android.gms.maps.model.Marker markerAddMarker = com.google.maps.android.MarkerManager.this.mMap.addMarker(markerOptions);
            this.mMarkers.add(markerAddMarker);
            com.google.maps.android.MarkerManager.this.mAllMarkers.put(markerAddMarker, this);
            return markerAddMarker;
        }

        public boolean remove(com.google.android.gms.maps.model.Marker marker) {
            if (!this.mMarkers.remove(marker)) {
                return false;
            }
            com.google.maps.android.MarkerManager.this.mAllMarkers.remove(marker);
            marker.remove();
            return true;
        }

        public void clear() {
            for (com.google.android.gms.maps.model.Marker marker : this.mMarkers) {
                marker.remove();
                com.google.maps.android.MarkerManager.this.mAllMarkers.remove(marker);
            }
            this.mMarkers.clear();
        }

        public java.util.Collection<com.google.android.gms.maps.model.Marker> getMarkers() {
            return java.util.Collections.unmodifiableCollection(this.mMarkers);
        }

        public void setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.mInfoWindowClickListener = onInfoWindowClickListener;
        }

        public void setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClickListener) {
            this.mMarkerClickListener = onMarkerClickListener;
        }

        public void setOnMarkerDragListener(com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onMarkerDragListener) {
            this.mMarkerDragListener = onMarkerDragListener;
        }

        public void setOnInfoWindowAdapter(com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infoWindowAdapter) {
            this.mInfoWindowAdapter = infoWindowAdapter;
        }
    }
}
