package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class Text extends com.baidu.mapapi.map.Overlay {
    private static final java.lang.String k = "Text";
    java.lang.String a;
    com.baidu.mapapi.model.LatLng b;
    int c;
    int d;
    int e;
    android.graphics.Typeface f;
    int g;
    int h;
    float i;
    int j;

    Text() {
        this.type = com.baidu.mapsdkplatform.comapi.map.j.text;
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a() {
        android.graphics.Typeface typeface = this.f;
        if (typeface != null) {
            mapsdkvi.com.gdi.bgl.android.java.EnvDrawText.removeFontCache(typeface.hashCode());
        }
        return super.a();
    }

    @Override // com.baidu.mapapi.map.Overlay
    android.os.Bundle a(android.os.Bundle bundle) {
        float f;
        super.a(bundle);
        if (this.b == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: when you add a text overlay, you must provide text and the position info.");
        }
        bundle.putString("text", this.a);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(this.b);
        bundle.putDouble("location_x", geoPointLl2mc.getLongitudeE6());
        bundle.putDouble("location_y", geoPointLl2mc.getLatitudeE6());
        int i = this.d;
        bundle.putInt("font_color", android.graphics.Color.argb(i >>> 24, i & 255, (i >> 8) & 255, (i >> 16) & 255));
        int i2 = this.c;
        bundle.putInt("bg_color", android.graphics.Color.argb(i2 >>> 24, i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255));
        bundle.putInt("font_size", this.e);
        android.graphics.Typeface typeface = this.f;
        if (typeface != null) {
            mapsdkvi.com.gdi.bgl.android.java.EnvDrawText.registFontCache(typeface.hashCode(), this.f);
            bundle.putInt("type_face", this.f.hashCode());
        }
        int i3 = this.g;
        float f2 = 1.0f;
        if (i3 != 1) {
            f = i3 != 2 ? 0.5f : 1.0f;
        } else {
            f = 0.0f;
        }
        bundle.putFloat("align_x", f);
        int i4 = this.h;
        if (i4 == 8) {
            f2 = 0.0f;
        } else if (i4 != 16) {
            f2 = 0.5f;
        }
        bundle.putFloat("align_y", f2);
        bundle.putFloat("rotate", this.i);
        bundle.putInt("update", this.j);
        return bundle;
    }

    public float getAlignX() {
        return this.g;
    }

    public float getAlignY() {
        return this.h;
    }

    public int getBgColor() {
        return this.c;
    }

    public int getFontColor() {
        return this.d;
    }

    public int getFontSize() {
        return this.e;
    }

    public com.baidu.mapapi.model.LatLng getPosition() {
        return this.b;
    }

    public float getRotate() {
        return this.i;
    }

    public java.lang.String getText() {
        return this.a;
    }

    public android.graphics.Typeface getTypeface() {
        return this.f;
    }

    public void setAlign(int i, int i2) {
        this.g = i;
        this.h = i2;
        this.j = 1;
        this.listener.b(this);
    }

    public void setBgColor(int i) {
        this.c = i;
        this.j = 1;
        this.listener.b(this);
    }

    public void setFontColor(int i) {
        this.d = i;
        this.j = 1;
        this.listener.b(this);
    }

    public void setFontSize(int i) {
        this.e = i;
        this.j = 1;
        this.listener.b(this);
    }

    public void setPosition(com.baidu.mapapi.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.b = latLng;
        this.j = 1;
        this.listener.b(this);
    }

    public void setRotate(float f) {
        this.i = f;
        this.j = 1;
        this.listener.b(this);
    }

    public void setText(java.lang.String str) {
        if (str == null || str.equals("")) {
            throw new java.lang.IllegalArgumentException("BDMapSDKException: text can not be null or empty");
        }
        this.a = str;
        this.j = 1;
        this.listener.b(this);
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        this.f = typeface;
        this.j = 1;
        this.listener.b(this);
    }
}
