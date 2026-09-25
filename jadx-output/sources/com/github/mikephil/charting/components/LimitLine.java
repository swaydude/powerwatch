package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public class LimitLine extends com.github.mikephil.charting.components.ComponentBase {
    private android.graphics.DashPathEffect mDashPathEffect;
    private java.lang.String mLabel;
    private com.github.mikephil.charting.components.LimitLine.LimitLabelPosition mLabelPosition;
    private float mLimit;
    private int mLineColor;
    private float mLineWidth;
    private android.graphics.Paint.Style mTextStyle;

    public enum LimitLabelPosition {
        LEFT_TOP,
        LEFT_BOTTOM,
        RIGHT_TOP,
        RIGHT_BOTTOM
    }

    public LimitLine(float f) {
        this.mLimit = 0.0f;
        this.mLineWidth = 2.0f;
        this.mLineColor = android.graphics.Color.rgb(237, 91, 91);
        this.mTextStyle = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.mLabel = "";
        this.mDashPathEffect = null;
        this.mLabelPosition = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP;
        this.mLimit = f;
    }

    public LimitLine(float f, java.lang.String str) {
        this.mLimit = 0.0f;
        this.mLineWidth = 2.0f;
        this.mLineColor = android.graphics.Color.rgb(237, 91, 91);
        this.mTextStyle = android.graphics.Paint.Style.FILL_AND_STROKE;
        this.mLabel = "";
        this.mDashPathEffect = null;
        this.mLabelPosition = com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP;
        this.mLimit = f;
        this.mLabel = str;
    }

    public float getLimit() {
        return this.mLimit;
    }

    public void setLineWidth(float f) {
        if (f < 0.2f) {
            f = 0.2f;
        }
        if (f > 12.0f) {
            f = 12.0f;
        }
        this.mLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public void setLineColor(int i) {
        this.mLineColor = i;
    }

    public int getLineColor() {
        return this.mLineColor;
    }

    public void enableDashedLine(float f, float f2, float f3) {
        this.mDashPathEffect = new android.graphics.DashPathEffect(new float[]{f, f2}, f3);
    }

    public void disableDashedLine() {
        this.mDashPathEffect = null;
    }

    public boolean isDashedLineEnabled() {
        return this.mDashPathEffect != null;
    }

    public android.graphics.DashPathEffect getDashPathEffect() {
        return this.mDashPathEffect;
    }

    public void setTextStyle(android.graphics.Paint.Style style) {
        this.mTextStyle = style;
    }

    public android.graphics.Paint.Style getTextStyle() {
        return this.mTextStyle;
    }

    public void setLabelPosition(com.github.mikephil.charting.components.LimitLine.LimitLabelPosition limitLabelPosition) {
        this.mLabelPosition = limitLabelPosition;
    }

    public com.github.mikephil.charting.components.LimitLine.LimitLabelPosition getLabelPosition() {
        return this.mLabelPosition;
    }

    public void setLabel(java.lang.String str) {
        this.mLabel = str;
    }

    public java.lang.String getLabel() {
        return this.mLabel;
    }
}
