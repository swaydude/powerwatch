package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class XAxisRendererRadarChart extends com.github.mikephil.charting.renderer.XAxisRenderer {
    private com.github.mikephil.charting.charts.RadarChart mChart;

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(android.graphics.Canvas canvas) {
    }

    public XAxisRendererRadarChart(com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.XAxis xAxis, com.github.mikephil.charting.charts.RadarChart radarChart) {
        super(viewPortHandler, xAxis, null);
        this.mChart = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(android.graphics.Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
            com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(0.5f, 0.25f);
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            float sliceAngle = this.mChart.getSliceAngle();
            float factor = this.mChart.getFactor();
            com.github.mikephil.charting.utils.MPPointF centerOffsets = this.mChart.getCenterOffsets();
            com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
            for (int i = 0; i < ((com.github.mikephil.charting.data.RadarData) this.mChart.getData()).getMaxEntryCountSet().getEntryCount(); i++) {
                float f = i;
                java.lang.String formattedValue = this.mXAxis.getValueFormatter().getFormattedValue(f, this.mXAxis);
                com.github.mikephil.charting.utils.Utils.getPosition(centerOffsets, (this.mChart.getYRange() * factor) + (this.mXAxis.mLabelRotatedWidth / 2.0f), ((f * sliceAngle) + this.mChart.getRotationAngle()) % 360.0f, mPPointF2);
                drawLabel(canvas, formattedValue, mPPointF2.x, mPPointF2.y - (this.mXAxis.mLabelRotatedHeight / 2.0f), mPPointF, labelRotationAngle);
            }
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF2);
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
        }
    }
}
