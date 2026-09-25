package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlPlacemark extends com.google.maps.android.data.Feature {
    private final com.google.maps.android.data.kml.KmlStyle mInlineStyle;
    private final java.lang.String mStyle;

    public KmlPlacemark(com.google.maps.android.data.Geometry geometry, java.lang.String str, com.google.maps.android.data.kml.KmlStyle kmlStyle, java.util.HashMap<java.lang.String, java.lang.String> map) {
        super(geometry, str, map);
        this.mStyle = str;
        this.mInlineStyle = kmlStyle;
    }

    public java.lang.String getStyleId() {
        return super.getId();
    }

    public com.google.maps.android.data.kml.KmlStyle getInlineStyle() {
        return this.mInlineStyle;
    }

    public com.google.android.gms.maps.model.PolygonOptions getPolygonOptions() {
        return this.mInlineStyle.getPolygonOptions();
    }

    public com.google.android.gms.maps.model.MarkerOptions getMarkerOptions() {
        return this.mInlineStyle.getMarkerOptions();
    }

    public com.google.android.gms.maps.model.PolylineOptions getPolylineOptions() {
        return this.mInlineStyle.getPolylineOptions();
    }

    public java.lang.String toString() {
        return "Placemark{\n style id=" + this.mStyle + ",\n inline style=" + this.mInlineStyle + "\n}\n";
    }
}
