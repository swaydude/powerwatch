package com.github.mikephil.charting.interfaces.datasets;

/* JADX INFO: loaded from: classes.dex */
public interface IBarDataSet extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<com.github.mikephil.charting.data.BarEntry> {
    int getBarBorderColor();

    float getBarBorderWidth();

    int getBarShadowColor();

    int getHighLightAlpha();

    java.lang.String[] getStackLabels();

    int getStackSize();

    boolean isStacked();
}
