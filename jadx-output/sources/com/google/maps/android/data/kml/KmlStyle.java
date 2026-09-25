package com.google.maps.android.data.kml;

/* JADX INFO: loaded from: classes2.dex */
public class KmlStyle extends com.google.maps.android.data.Style {
    private static final int HSV_VALUES = 3;
    private static final int HUE_VALUE = 0;
    private static final int INITIAL_SCALE = 1;
    private java.lang.String mIconUrl;
    private boolean mFill = true;
    private boolean mOutline = true;
    private java.lang.String mStyleId = null;
    private final java.util.HashMap<java.lang.String, java.lang.String> mBalloonOptions = new java.util.HashMap<>();
    private final java.util.HashSet<java.lang.String> mStylesSet = new java.util.HashSet<>();
    private double mScale = 1.0d;
    private float mMarkerColor = 0.0f;
    private boolean mIconRandomColorMode = false;
    private boolean mLineRandomColorMode = false;
    private boolean mPolyRandomColorMode = false;

    KmlStyle() {
    }

    void setInfoWindowText(java.lang.String str) {
        this.mBalloonOptions.put("text", str);
    }

    java.lang.String getStyleId() {
        return this.mStyleId;
    }

    void setStyleId(java.lang.String str) {
        this.mStyleId = str;
    }

    public boolean isStyleSet(java.lang.String str) {
        return this.mStylesSet.contains(str);
    }

    public boolean hasFill() {
        return this.mFill;
    }

    public void setFill(boolean z) {
        this.mFill = z;
    }

    double getIconScale() {
        return this.mScale;
    }

    void setIconScale(double d) {
        this.mScale = d;
        this.mStylesSet.add("iconScale");
    }

    public boolean hasOutline() {
        return this.mOutline;
    }

    public boolean hasBalloonStyle() {
        return this.mBalloonOptions.size() > 0;
    }

    void setOutline(boolean z) {
        this.mOutline = z;
        this.mStylesSet.add("outline");
    }

    public java.lang.String getIconUrl() {
        return this.mIconUrl;
    }

    void setIconUrl(java.lang.String str) {
        this.mIconUrl = str;
        this.mStylesSet.add("iconUrl");
    }

    void setFillColor(java.lang.String str) {
        setPolygonFillColor(android.graphics.Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("fillColor");
    }

    void setMarkerColor(java.lang.String str) {
        this.mMarkerColor = getHueValue(android.graphics.Color.parseColor("#" + convertColor(str)));
        this.mMarkerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(this.mMarkerColor));
        this.mStylesSet.add("markerColor");
    }

    private static float getHueValue(int i) {
        float[] fArr = new float[3];
        android.graphics.Color.colorToHSV(i, fArr);
        return fArr[0];
    }

    private static java.lang.String convertColor(java.lang.String str) {
        java.lang.String str2;
        if (str.length() > 6) {
            str2 = str.substring(0, 2) + str.substring(6, 8) + str.substring(4, 6) + str.substring(2, 4);
        } else {
            str2 = str.substring(4, 6) + str.substring(2, 4) + str.substring(0, 2);
        }
        if (!str2.substring(0, 1).equals(" ")) {
            return str2;
        }
        return "0" + str2.substring(1, str2.length());
    }

    void setHeading(float f) {
        setMarkerRotation(f);
        this.mStylesSet.add("heading");
    }

    void setHotSpot(float f, float f2, java.lang.String str, java.lang.String str2) {
        setMarkerHotSpot(f, f2, str, str2);
        this.mStylesSet.add("hotSpot");
    }

    void setIconColorMode(java.lang.String str) {
        this.mIconRandomColorMode = str.equals("random");
        this.mStylesSet.add("iconColorMode");
    }

    boolean isIconRandomColorMode() {
        return this.mIconRandomColorMode;
    }

    void setLineColorMode(java.lang.String str) {
        this.mLineRandomColorMode = str.equals("random");
        this.mStylesSet.add("lineColorMode");
    }

    public boolean isLineRandomColorMode() {
        return this.mLineRandomColorMode;
    }

    void setPolyColorMode(java.lang.String str) {
        this.mPolyRandomColorMode = str.equals("random");
        this.mStylesSet.add("polyColorMode");
    }

    public boolean isPolyRandomColorMode() {
        return this.mPolyRandomColorMode;
    }

    void setOutlineColor(java.lang.String str) {
        this.mPolylineOptions.color(android.graphics.Color.parseColor("#" + convertColor(str)));
        this.mPolygonOptions.strokeColor(android.graphics.Color.parseColor("#" + str));
        this.mStylesSet.add("outlineColor");
    }

    void setWidth(java.lang.Float f) {
        setLineStringWidth(f.floatValue());
        setPolygonStrokeWidth(f.floatValue());
        this.mStylesSet.add(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY);
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getBalloonOptions() {
        return this.mBalloonOptions;
    }

    private static com.google.android.gms.maps.model.MarkerOptions createMarkerOptions(com.google.android.gms.maps.model.MarkerOptions markerOptions, boolean z, float f) {
        com.google.android.gms.maps.model.MarkerOptions markerOptions2 = new com.google.android.gms.maps.model.MarkerOptions();
        markerOptions2.rotation(markerOptions.getRotation());
        markerOptions2.anchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        if (z) {
            markerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(getHueValue(computeRandomColor((int) f))));
        }
        markerOptions2.icon(markerOptions.getIcon());
        return markerOptions2;
    }

    private static com.google.android.gms.maps.model.PolylineOptions createPolylineOptions(com.google.android.gms.maps.model.PolylineOptions polylineOptions) {
        com.google.android.gms.maps.model.PolylineOptions polylineOptions2 = new com.google.android.gms.maps.model.PolylineOptions();
        polylineOptions2.color(polylineOptions.getColor());
        polylineOptions2.width(polylineOptions.getWidth());
        return polylineOptions2;
    }

    private static com.google.android.gms.maps.model.PolygonOptions createPolygonOptions(com.google.android.gms.maps.model.PolygonOptions polygonOptions, boolean z, boolean z2) {
        com.google.android.gms.maps.model.PolygonOptions polygonOptions2 = new com.google.android.gms.maps.model.PolygonOptions();
        if (z) {
            polygonOptions2.fillColor(polygonOptions.getFillColor());
        }
        if (z2) {
            polygonOptions2.strokeColor(polygonOptions.getStrokeColor());
            polygonOptions2.strokeWidth(polygonOptions.getStrokeWidth());
        }
        return polygonOptions2;
    }

    public com.google.android.gms.maps.model.MarkerOptions getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public com.google.android.gms.maps.model.PolylineOptions getPolylineOptions() {
        return createPolylineOptions(this.mPolylineOptions);
    }

    public com.google.android.gms.maps.model.PolygonOptions getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public static int computeRandomColor(int i) {
        java.util.Random random = new java.util.Random();
        int iRed = android.graphics.Color.red(i);
        int iGreen = android.graphics.Color.green(i);
        int iBlue = android.graphics.Color.blue(i);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return android.graphics.Color.rgb(iRed, iGreen, iBlue);
    }

    public java.lang.String toString() {
        return "Style{\n balloon options=" + this.mBalloonOptions + ",\n fill=" + this.mFill + ",\n outline=" + this.mOutline + ",\n icon url=" + this.mIconUrl + ",\n scale=" + this.mScale + ",\n style id=" + this.mStyleId + "\n}\n";
    }
}
