package com.github.mikephil.charting.interfaces.datasets;

/* JADX INFO: loaded from: classes.dex */
public interface IBubbleDataSet extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BubbleEntry> {
    float getHighlightCircleWidth();

    float getMaxSize();

    boolean isNormalizeSizeEnabled();

    void setHighlightCircleWidth(float f);
}
