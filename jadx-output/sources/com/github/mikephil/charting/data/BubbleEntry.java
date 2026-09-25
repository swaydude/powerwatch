package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class BubbleEntry extends com.github.mikephil.charting.data.Entry {
    private float mSize;

    public BubbleEntry(float f, float f2, float f3) {
        super(f, f2);
        this.mSize = 0.0f;
        this.mSize = f3;
    }

    public BubbleEntry(float f, float f2, float f3, java.lang.Object obj) {
        super(f, f2, obj);
        this.mSize = 0.0f;
        this.mSize = f3;
    }

    public BubbleEntry(float f, float f2, float f3, android.graphics.drawable.Drawable drawable) {
        super(f, f2, drawable);
        this.mSize = 0.0f;
        this.mSize = f3;
    }

    public BubbleEntry(float f, float f2, float f3, android.graphics.drawable.Drawable drawable, java.lang.Object obj) {
        super(f, f2, drawable, obj);
        this.mSize = 0.0f;
        this.mSize = f3;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public com.github.mikephil.charting.data.BubbleEntry copy() {
        return new com.github.mikephil.charting.data.BubbleEntry(getX(), getY(), this.mSize, getData());
    }

    public float getSize() {
        return this.mSize;
    }

    public void setSize(float f) {
        this.mSize = f;
    }
}
