package com.github.mikephil.charting.interfaces.datasets;

/* JADX INFO: loaded from: classes.dex */
public interface IScatterDataSet extends com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet<com.github.mikephil.charting.data.Entry> {
    int getScatterShapeHoleColor();

    float getScatterShapeHoleRadius();

    float getScatterShapeSize();

    com.github.mikephil.charting.renderer.scatter.IShapeRenderer getShapeRenderer();
}
