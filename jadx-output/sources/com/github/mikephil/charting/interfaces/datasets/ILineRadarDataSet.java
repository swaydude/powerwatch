package com.github.mikephil.charting.interfaces.datasets;

/* JADX INFO: loaded from: classes.dex */
public interface ILineRadarDataSet<T extends com.github.mikephil.charting.data.Entry> extends com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet<T> {
    int getFillAlpha();

    int getFillColor();

    android.graphics.drawable.Drawable getFillDrawable();

    float getLineWidth();

    boolean isDrawFilledEnabled();

    void setDrawFilled(boolean z);
}
