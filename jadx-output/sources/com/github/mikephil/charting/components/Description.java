package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public class Description extends com.github.mikephil.charting.components.ComponentBase {
    private com.github.mikephil.charting.utils.MPPointF mPosition;
    private java.lang.String text = "Description Label";
    private android.graphics.Paint.Align mTextAlign = android.graphics.Paint.Align.RIGHT;

    public Description() {
        this.mTextSize = com.github.mikephil.charting.utils.Utils.convertDpToPixel(8.0f);
    }

    public void setText(java.lang.String str) {
        this.text = str;
    }

    public java.lang.String getText() {
        return this.text;
    }

    public void setPosition(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF = this.mPosition;
        if (mPPointF == null) {
            this.mPosition = com.github.mikephil.charting.utils.MPPointF.getInstance(f, f2);
        } else {
            mPPointF.x = f;
            this.mPosition.y = f2;
        }
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition() {
        return this.mPosition;
    }

    public void setTextAlign(android.graphics.Paint.Align align) {
        this.mTextAlign = align;
    }

    public android.graphics.Paint.Align getTextAlign() {
        return this.mTextAlign;
    }
}
