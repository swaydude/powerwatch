package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public abstract class LineScatterCandleRadarRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    private android.graphics.Path mHighlightLinePath;

    public LineScatterCandleRadarRenderer(com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mHighlightLinePath = new android.graphics.Path();
    }

    protected void drawHighlightLines(android.graphics.Canvas canvas, float f, float f2, com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet iLineScatterCandleRadarDataSet) {
        this.mHighlightPaint.setColor(iLineScatterCandleRadarDataSet.getHighLightColor());
        this.mHighlightPaint.setStrokeWidth(iLineScatterCandleRadarDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setPathEffect(iLineScatterCandleRadarDataSet.getDashPathEffectHighlight());
        if (iLineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(f, this.mViewPortHandler.contentTop());
            this.mHighlightLinePath.lineTo(f, this.mViewPortHandler.contentBottom());
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
        if (iLineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()) {
            this.mHighlightLinePath.reset();
            this.mHighlightLinePath.moveTo(this.mViewPortHandler.contentLeft(), f2);
            this.mHighlightLinePath.lineTo(this.mViewPortHandler.contentRight(), f2);
            canvas.drawPath(this.mHighlightLinePath, this.mHighlightPaint);
        }
    }
}
