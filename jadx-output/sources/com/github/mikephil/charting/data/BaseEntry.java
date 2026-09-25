package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseEntry {
    private java.lang.Object mData;
    private android.graphics.drawable.Drawable mIcon;
    private float y;

    public BaseEntry() {
        this.y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public BaseEntry(float f) {
        this.y = 0.0f;
        this.mData = null;
        this.mIcon = null;
        this.y = f;
    }

    public BaseEntry(float f, java.lang.Object obj) {
        this(f);
        this.mData = obj;
    }

    public BaseEntry(float f, android.graphics.drawable.Drawable drawable) {
        this(f);
        this.mIcon = drawable;
    }

    public BaseEntry(float f, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        this(f);
        this.mIcon = drawable;
        this.mData = obj;
    }

    public float getY() {
        return this.y;
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mIcon = drawable;
    }

    public android.graphics.drawable.Drawable getIcon() {
        return this.mIcon;
    }

    public void setY(float f) {
        this.y = f;
    }

    public java.lang.Object getData() {
        return this.mData;
    }

    public void setData(java.lang.Object obj) {
        this.mData = obj;
    }
}
