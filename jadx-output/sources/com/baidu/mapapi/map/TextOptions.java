package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class TextOptions extends com.baidu.mapapi.map.OverlayOptions {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;
    int a;
    android.os.Bundle c;
    private java.lang.String d;
    private com.baidu.mapapi.model.LatLng e;
    private int f;
    private android.graphics.Typeface i;
    private float l;
    private int g = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
    private int h = 12;
    private int j = 4;
    private int k = 32;
    boolean b = true;

    @Override // com.baidu.mapapi.map.OverlayOptions
    com.baidu.mapapi.map.Overlay a() {
        com.baidu.mapapi.map.Text text = new com.baidu.mapapi.map.Text();
        text.B = this.b;
        text.A = this.a;
        text.C = this.c;
        text.a = this.d;
        text.b = this.e;
        text.c = this.f;
        text.d = this.g;
        text.e = this.h;
        text.f = this.i;
        text.g = this.j;
        text.h = this.k;
        text.i = this.l;
        return text;
    }

    public com.baidu.mapapi.map.TextOptions align(int i, int i2) {
        this.j = i;
        this.k = i2;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions bgColor(int i) {
        this.f = i;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions extraInfo(android.os.Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions fontColor(int i) {
        this.g = i;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions fontSize(int i) {
        this.h = i;
        return this;
    }

    public float getAlignX() {
        return this.j;
    }

    public float getAlignY() {
        return this.k;
    }

    public int getBgColor() {
        return this.f;
    }

    public android.os.Bundle getExtraInfo() {
        return this.c;
    }

    public int getFontColor() {
        return this.g;
    }

    public int getFontSize() {
        return this.h;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.e;
    }

    public float getRotate() {
        return this.l;
    }

    public java.lang.String getText() {
        return this.d;
    }

    public android.graphics.Typeface getTypeface() {
        return this.i;
    }

    public int getZIndex() {
        return this.a;
    }

    public boolean isVisible() {
        return this.b;
    }

    public com.baidu.mapapi.map.TextOptions position(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.e = latLng;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions rotate(float f) {
        this.l = f;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions text(java.lang.String str) {
        if (str == null || str.equals("")) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: text can not be null or empty");
        }
        this.d = str;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions typeface(android.graphics.Typeface typeface) {
        this.i = typeface;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public com.baidu.mapapi.map.TextOptions zIndex(int i) {
        this.a = i;
        return this;
    }
}
