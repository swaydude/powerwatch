package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public abstract class LineRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<T> implements com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet<T> {
    private boolean mDrawFilled;
    private int mFillAlpha;
    private int mFillColor;
    protected android.graphics.drawable.Drawable mFillDrawable;
    private float mLineWidth;

    public LineRadarDataSet(java.util.List<T> list, java.lang.String str) {
        super(list, str);
        this.mFillColor = android.graphics.Color.rgb(140, 234, 255);
        this.mFillAlpha = 85;
        this.mLineWidth = 2.5f;
        this.mDrawFilled = false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public int getFillColor() {
        return this.mFillColor;
    }

    public void setFillColor(int i) {
        this.mFillColor = i;
        this.mFillDrawable = null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public android.graphics.drawable.Drawable getFillDrawable() {
        return this.mFillDrawable;
    }

    public void setFillDrawable(android.graphics.drawable.Drawable drawable) {
        this.mFillDrawable = drawable;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public int getFillAlpha() {
        return this.mFillAlpha;
    }

    public void setFillAlpha(int i) {
        this.mFillAlpha = i;
    }

    public void setLineWidth(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.mLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public float getLineWidth() {
        return this.mLineWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public void setDrawFilled(boolean z) {
        this.mDrawFilled = z;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public boolean isDrawFilledEnabled() {
        return this.mDrawFilled;
    }
}
