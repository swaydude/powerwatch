package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class PieEntry extends com.github.mikephil.charting.data.Entry {
    private java.lang.String label;

    public PieEntry(float f) {
        super(0.0f, f);
    }

    public PieEntry(float f, java.lang.Object obj) {
        super(0.0f, f, obj);
    }

    public PieEntry(float f, android.graphics.drawable.Drawable drawable) {
        super(0.0f, f, drawable);
    }

    public PieEntry(float f, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(0.0f, f, drawable, obj);
    }

    public PieEntry(float f, java.lang.String str) {
        super(0.0f, f);
        this.label = str;
    }

    public PieEntry(float f, java.lang.String str, java.lang.Object obj) {
        super(0.0f, f, obj);
        this.label = str;
    }

    public PieEntry(float f, java.lang.String str, android.graphics.drawable.Drawable drawable) {
        super(0.0f, f, drawable);
        this.label = str;
    }

    public PieEntry(float f, java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(0.0f, f, drawable, obj);
        this.label = str;
    }

    public float getValue() {
        return getY();
    }

    public java.lang.String getLabel() {
        return this.label;
    }

    public void setLabel(java.lang.String str) {
        this.label = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @java.lang.Deprecated
    public void setX(float f) {
        super.setX(f);
        android.util.Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    @Override // com.github.mikephil.charting.data.Entry
    @java.lang.Deprecated
    public float getX() {
        android.util.Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.getX();
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.PieEntry copy() {
        return new com.github.mikephil.charting.data.PieEntry(getY(), this.label, getData());
    }
}
