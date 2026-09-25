package com.google.maps.android.data;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Style extends java.util.Observable {
    protected com.google.android.gms.maps.model.MarkerOptions mMarkerOptions = new com.google.android.gms.maps.model.MarkerOptions();
    protected com.google.android.gms.maps.model.PolylineOptions mPolylineOptions = new com.google.android.gms.maps.model.PolylineOptions();
    protected com.google.android.gms.maps.model.PolygonOptions mPolygonOptions = new com.google.android.gms.maps.model.PolygonOptions();

    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setMarkerRotation(float f) {
        this.mMarkerOptions.rotation(f);
    }

    public void setMarkerHotSpot(float f, float f2, java.lang.String str, java.lang.String str2) {
        if (!str.equals("fraction")) {
            f = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f2 = 1.0f;
        }
        this.mMarkerOptions.anchor(f, f2);
    }

    public void setLineStringWidth(float f) {
        this.mPolylineOptions.width(f);
    }

    public void setPolygonStrokeWidth(float f) {
        this.mPolygonOptions.strokeWidth(f);
    }

    public void setPolygonFillColor(int i) {
        this.mPolygonOptions.fillColor(i);
    }
}
