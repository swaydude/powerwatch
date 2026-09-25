package com.github.mikephil.charting.interfaces.datasets;

/* JADX INFO: loaded from: classes.dex */
public interface IRadarDataSet extends com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet<com.github.mikephil.charting.data.RadarEntry> {
    int getHighlightCircleFillColor();

    float getHighlightCircleInnerRadius();

    float getHighlightCircleOuterRadius();

    int getHighlightCircleStrokeAlpha();

    int getHighlightCircleStrokeColor();

    float getHighlightCircleStrokeWidth();

    boolean isDrawHighlightCircleEnabled();

    void setDrawHighlightCircleEnabled(boolean z);
}
