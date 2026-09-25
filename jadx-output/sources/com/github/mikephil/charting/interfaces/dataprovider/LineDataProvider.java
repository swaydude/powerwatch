package com.github.mikephil.charting.interfaces.dataprovider;

/* JADX INFO: loaded from: classes.dex */
public interface LineDataProvider extends com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider {
    com.github.mikephil.charting.components.YAxis getAxis(com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency);

    com.github.mikephil.charting.data.LineData getLineData();
}
