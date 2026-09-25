package com.github.mikephil.charting.charts;

/* JADX INFO: loaded from: classes.dex */
public class RadarChart extends com.github.mikephil.charting.charts.PieRadarChartBase<com.github.mikephil.charting.data.RadarData> {
    private boolean mDrawWeb;
    private float mInnerWebLineWidth;
    private int mSkipWebLineCount;
    private int mWebAlpha;
    private int mWebColor;
    private int mWebColorInner;
    private float mWebLineWidth;
    protected com.github.mikephil.charting.renderer.XAxisRendererRadarChart mXAxisRenderer;
    private com.github.mikephil.charting.components.YAxis mYAxis;
    protected com.github.mikephil.charting.renderer.YAxisRendererRadarChart mYAxisRenderer;

    public RadarChart(android.content.Context context) {
        super(context);
        this.mWebLineWidth = 2.5f;
        this.mInnerWebLineWidth = 1.5f;
        this.mWebColor = android.graphics.Color.rgb(122, 122, 122);
        this.mWebColorInner = android.graphics.Color.rgb(122, 122, 122);
        this.mWebAlpha = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax;
        this.mDrawWeb = true;
        this.mSkipWebLineCount = 0;
    }

    public RadarChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWebLineWidth = 2.5f;
        this.mInnerWebLineWidth = 1.5f;
        this.mWebColor = android.graphics.Color.rgb(122, 122, 122);
        this.mWebColorInner = android.graphics.Color.rgb(122, 122, 122);
        this.mWebAlpha = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax;
        this.mDrawWeb = true;
        this.mSkipWebLineCount = 0;
    }

    public RadarChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mWebLineWidth = 2.5f;
        this.mInnerWebLineWidth = 1.5f;
        this.mWebColor = android.graphics.Color.rgb(122, 122, 122);
        this.mWebColorInner = android.graphics.Color.rgb(122, 122, 122);
        this.mWebAlpha = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax;
        this.mDrawWeb = true;
        this.mSkipWebLineCount = 0;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mYAxis = new com.github.mikephil.charting.components.YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
        this.mWebLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.5f);
        this.mInnerWebLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(0.75f);
        this.mRenderer = new com.github.mikephil.charting.renderer.RadarChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mYAxisRenderer = new com.github.mikephil.charting.renderer.YAxisRendererRadarChart(this.mViewPortHandler, this.mYAxis, this);
        this.mXAxisRenderer = new com.github.mikephil.charting.renderer.XAxisRendererRadarChart(this.mViewPortHandler, this.mXAxis, this);
        this.mHighlighter = new com.github.mikephil.charting.highlight.RadarHighlighter(this);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        super.calcMinMax();
        this.mYAxis.calculate(((com.github.mikephil.charting.data.RadarData) this.mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT), ((com.github.mikephil.charting.data.RadarData) this.mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT));
        this.mXAxis.calculate(0.0f, ((com.github.mikephil.charting.data.RadarData) this.mData).getMaxEntryCountSet().getEntryCount());
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == 0) {
            return;
        }
        calcMinMax();
        this.mYAxisRenderer.computeAxis(this.mYAxis.mAxisMinimum, this.mYAxis.mAxisMaximum, this.mYAxis.isInverted());
        this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        if (this.mLegend != null && !this.mLegend.isLegendCustom()) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        if (this.mXAxis.isEnabled()) {
            this.mXAxisRenderer.computeAxis(this.mXAxis.mAxisMinimum, this.mXAxis.mAxisMaximum, false);
        }
        this.mXAxisRenderer.renderAxisLabels(canvas);
        if (this.mDrawWeb) {
            this.mRenderer.drawExtras(canvas);
        }
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mYAxisRenderer.renderLimitLines(canvas);
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        if (this.mYAxis.isEnabled() && !this.mYAxis.isDrawLimitLinesBehindDataEnabled()) {
            this.mYAxisRenderer.renderLimitLines(canvas);
        }
        this.mYAxisRenderer.renderAxisLabels(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    public float getFactor() {
        android.graphics.RectF contentRect = this.mViewPortHandler.getContentRect();
        return java.lang.Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f) / this.mYAxis.mAxisRange;
    }

    public float getSliceAngle() {
        return 360.0f / ((com.github.mikephil.charting.data.RadarData) this.mData).getMaxEntryCountSet().getEntryCount();
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f) {
        float normalizedAngle = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(f - getRotationAngle());
        float sliceAngle = getSliceAngle();
        int entryCount = ((com.github.mikephil.charting.data.RadarData) this.mData).getMaxEntryCountSet().getEntryCount();
        int i = 0;
        while (i < entryCount) {
            int i2 = i + 1;
            if ((i2 * sliceAngle) - (sliceAngle / 2.0f) > normalizedAngle) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public com.github.mikephil.charting.components.YAxis getYAxis() {
        return this.mYAxis;
    }

    public void setWebLineWidth(float f) {
        this.mWebLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getWebLineWidth() {
        return this.mWebLineWidth;
    }

    public void setWebLineWidthInner(float f) {
        this.mInnerWebLineWidth = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    public float getWebLineWidthInner() {
        return this.mInnerWebLineWidth;
    }

    public void setWebAlpha(int i) {
        this.mWebAlpha = i;
    }

    public int getWebAlpha() {
        return this.mWebAlpha;
    }

    public void setWebColor(int i) {
        this.mWebColor = i;
    }

    public int getWebColor() {
        return this.mWebColor;
    }

    public void setWebColorInner(int i) {
        this.mWebColorInner = i;
    }

    public int getWebColorInner() {
        return this.mWebColorInner;
    }

    public void setDrawWeb(boolean z) {
        this.mDrawWeb = z;
    }

    public void setSkipWebLineCount(int i) {
        this.mSkipWebLineCount = java.lang.Math.max(0, i);
    }

    public int getSkipWebLineCount() {
        return this.mSkipWebLineCount;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 4.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) ? this.mXAxis.mLabelRotatedWidth : com.github.mikephil.charting.utils.Utils.convertDpToPixel(10.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        android.graphics.RectF contentRect = this.mViewPortHandler.getContentRect();
        return java.lang.Math.min(contentRect.width() / 2.0f, contentRect.height() / 2.0f);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return this.mYAxis.mAxisMaximum;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return this.mYAxis.mAxisMinimum;
    }

    public float getYRange() {
        return this.mYAxis.mAxisRange;
    }
}
