package com.github.mikephil.charting.components;

/* JADX INFO: loaded from: classes.dex */
public interface IMarker {
    void draw(android.graphics.Canvas canvas, float f, float f2);

    com.github.mikephil.charting.utils.MPPointF getOffset();

    com.github.mikephil.charting.utils.MPPointF getOffsetForDrawingAtPoint(float f, float f2);

    void refreshContent(com.github.mikephil.charting.data.Entry entry, com.github.mikephil.charting.highlight.Highlight highlight);
}
