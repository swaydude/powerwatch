package com.github.mikephil.charting.charts;

/* JADX INFO: loaded from: classes.dex */
public class PieChart extends com.github.mikephil.charting.charts.PieRadarChartBase<com.github.mikephil.charting.data.PieData> {
    private float[] mAbsoluteAngles;
    private java.lang.CharSequence mCenterText;
    private com.github.mikephil.charting.utils.MPPointF mCenterTextOffset;
    private float mCenterTextRadiusPercent;
    private android.graphics.RectF mCircleBox;
    private float[] mDrawAngles;
    private boolean mDrawCenterText;
    private boolean mDrawEntryLabels;
    private boolean mDrawHole;
    private boolean mDrawRoundedSlices;
    private boolean mDrawSlicesUnderHole;
    private float mHoleRadiusPercent;
    protected float mMaxAngle;
    protected float mTransparentCircleRadiusPercent;
    private boolean mUsePercentValues;

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return 0.0f;
    }

    public PieChart(android.content.Context context) {
        super(context);
        this.mCircleBox = new android.graphics.RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    public PieChart(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCircleBox = new android.graphics.RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    public PieChart(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCircleBox = new android.graphics.RectF();
        this.mDrawEntryLabels = true;
        this.mDrawAngles = new float[1];
        this.mAbsoluteAngles = new float[1];
        this.mDrawHole = true;
        this.mDrawSlicesUnderHole = false;
        this.mUsePercentValues = false;
        this.mDrawRoundedSlices = false;
        this.mCenterText = "";
        this.mCenterTextOffset = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mHoleRadiusPercent = 50.0f;
        this.mTransparentCircleRadiusPercent = 55.0f;
        this.mDrawCenterText = true;
        this.mCenterTextRadiusPercent = 100.0f;
        this.mMaxAngle = 360.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mRenderer = new com.github.mikephil.charting.renderer.PieChartRenderer(this, this.mAnimator, this.mViewPortHandler);
        this.mXAxis = null;
        this.mHighlighter = new com.github.mikephil.charting.highlight.PieHighlighter(this);
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        this.mRenderer.drawData(canvas);
        if (valuesToHighlight()) {
            this.mRenderer.drawHighlighted(canvas, this.mIndicesToHighlight);
        }
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawValues(canvas);
        this.mLegendRenderer.renderLegend(canvas);
        drawDescription(canvas);
        drawMarkers(canvas);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        super.calculateOffsets();
        if (this.mData == 0) {
            return;
        }
        float diameter = getDiameter() / 2.0f;
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        float selectionShift = ((com.github.mikephil.charting.data.PieData) this.mData).getDataSet().getSelectionShift();
        this.mCircleBox.set((centerOffsets.x - diameter) + selectionShift, (centerOffsets.y - diameter) + selectionShift, (centerOffsets.x + diameter) - selectionShift, (centerOffsets.y + diameter) - selectionShift);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
        calcAngles();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected float[] getMarkerPosition(com.github.mikephil.charting.highlight.Highlight highlight) {
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = getCenterCircleBox();
        float radius = getRadius();
        float holeRadius = (radius / 10.0f) * 3.6f;
        if (isDrawHoleEnabled()) {
            holeRadius = (radius - ((radius / 100.0f) * getHoleRadius())) / 2.0f;
        }
        float f = radius - holeRadius;
        float rotationAngle = getRotationAngle();
        int x = (int) highlight.getX();
        float f2 = this.mDrawAngles[x] / 2.0f;
        double d = f;
        float fCos = (float) ((java.lang.Math.cos(java.lang.Math.toRadians(((this.mAbsoluteAngles[x] + rotationAngle) - f2) * this.mAnimator.getPhaseY())) * d) + ((double) centerCircleBox.x));
        float fSin = (float) ((d * java.lang.Math.sin(java.lang.Math.toRadians(((rotationAngle + this.mAbsoluteAngles[x]) - f2) * this.mAnimator.getPhaseY()))) + ((double) centerCircleBox.y));
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
        return new float[]{fCos, fSin};
    }

    private void calcAngles() {
        int entryCount = ((com.github.mikephil.charting.data.PieData) this.mData).getEntryCount();
        if (this.mDrawAngles.length != entryCount) {
            this.mDrawAngles = new float[entryCount];
        } else {
            for (int i = 0; i < entryCount; i++) {
                this.mDrawAngles[i] = 0.0f;
            }
        }
        if (this.mAbsoluteAngles.length != entryCount) {
            this.mAbsoluteAngles = new float[entryCount];
        } else {
            for (int i2 = 0; i2 < entryCount; i2++) {
                this.mAbsoluteAngles[i2] = 0.0f;
            }
        }
        float yValueSum = ((com.github.mikephil.charting.data.PieData) this.mData).getYValueSum();
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> dataSets = ((com.github.mikephil.charting.data.PieData) this.mData).getDataSets();
        int i3 = 0;
        for (int i4 = 0; i4 < ((com.github.mikephil.charting.data.PieData) this.mData).getDataSetCount(); i4++) {
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet = dataSets.get(i4);
            for (int i5 = 0; i5 < iPieDataSet.getEntryCount(); i5++) {
                this.mDrawAngles[i3] = calcAngle(java.lang.Math.abs(iPieDataSet.getEntryForIndex(i5).getY()), yValueSum);
                if (i3 == 0) {
                    this.mAbsoluteAngles[i3] = this.mDrawAngles[i3];
                } else {
                    float[] fArr = this.mAbsoluteAngles;
                    fArr[i3] = fArr[i3 - 1] + this.mDrawAngles[i3];
                }
                i3++;
            }
        }
    }

    public boolean needsHighlight(int i) {
        if (!valuesToHighlight()) {
            return false;
        }
        for (int i2 = 0; i2 < this.mIndicesToHighlight.length; i2++) {
            if (((int) this.mIndicesToHighlight[i2].getX()) == i) {
                return true;
            }
        }
        return false;
    }

    private float calcAngle(float f) {
        return calcAngle(f, ((com.github.mikephil.charting.data.PieData) this.mData).getYValueSum());
    }

    private float calcAngle(float f, float f2) {
        return (f / f2) * this.mMaxAngle;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    @java.lang.Deprecated
    public com.github.mikephil.charting.components.XAxis getXAxis() {
        throw new java.lang.RuntimeException("PieChart has no XAxis");
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public int getIndexForAngle(float f) {
        float normalizedAngle = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(f - getRotationAngle());
        int i = 0;
        while (true) {
            float[] fArr = this.mAbsoluteAngles;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > normalizedAngle) {
                return i;
            }
            i++;
        }
    }

    public int getDataSetIndexForIndex(int i) {
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> dataSets = ((com.github.mikephil.charting.data.PieData) this.mData).getDataSets();
        for (int i2 = 0; i2 < dataSets.size(); i2++) {
            if (dataSets.get(i2).getEntryForXValue(i, Float.NaN) != null) {
                return i2;
            }
        }
        return -1;
    }

    public float[] getDrawAngles() {
        return this.mDrawAngles;
    }

    public float[] getAbsoluteAngles() {
        return this.mAbsoluteAngles;
    }

    public void setHoleColor(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintHole().setColor(i);
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.mDrawSlicesUnderHole = z;
    }

    public boolean isDrawSlicesUnderHoleEnabled() {
        return this.mDrawSlicesUnderHole;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.mDrawHole = z;
    }

    public boolean isDrawHoleEnabled() {
        return this.mDrawHole;
    }

    public void setCenterText(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            this.mCenterText = "";
        } else {
            this.mCenterText = charSequence;
        }
    }

    public java.lang.CharSequence getCenterText() {
        return this.mCenterText;
    }

    public void setDrawCenterText(boolean z) {
        this.mDrawCenterText = z;
    }

    public boolean isDrawCenterTextEnabled() {
        return this.mDrawCenterText;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.mLegendRenderer.getLabelPaint().getTextSize() * 2.0f;
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        android.graphics.RectF rectF = this.mCircleBox;
        if (rectF == null) {
            return 0.0f;
        }
        return java.lang.Math.min(rectF.width() / 2.0f, this.mCircleBox.height() / 2.0f);
    }

    public android.graphics.RectF getCircleBox() {
        return this.mCircleBox;
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterCircleBox() {
        return com.github.mikephil.charting.utils.MPPointF.getInstance(this.mCircleBox.centerX(), this.mCircleBox.centerY());
    }

    public void setCenterTextTypeface(android.graphics.Typeface typeface) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setTypeface(typeface);
    }

    public void setCenterTextSize(float f) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setTextSize(f);
    }

    public void setCenterTextOffset(float f, float f2) {
        this.mCenterTextOffset.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        this.mCenterTextOffset.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f2);
    }

    public com.github.mikephil.charting.utils.MPPointF getCenterTextOffset() {
        return com.github.mikephil.charting.utils.MPPointF.getInstance(this.mCenterTextOffset.x, this.mCenterTextOffset.y);
    }

    public void setCenterTextColor(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintCenterText().setColor(i);
    }

    public void setHoleRadius(float f) {
        this.mHoleRadiusPercent = f;
    }

    public float getHoleRadius() {
        return this.mHoleRadiusPercent;
    }

    public void setTransparentCircleColor(int i) {
        android.graphics.Paint paintTransparentCircle = ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintTransparentCircle();
        int alpha = paintTransparentCircle.getAlpha();
        paintTransparentCircle.setColor(i);
        paintTransparentCircle.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.mTransparentCircleRadiusPercent = f;
    }

    public float getTransparentCircleRadius() {
        return this.mTransparentCircleRadiusPercent;
    }

    public void setTransparentCircleAlpha(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintTransparentCircle().setAlpha(i);
    }

    @java.lang.Deprecated
    public void setDrawSliceText(boolean z) {
        this.mDrawEntryLabels = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.mDrawEntryLabels = z;
    }

    public boolean isDrawEntryLabelsEnabled() {
        return this.mDrawEntryLabels;
    }

    public void setEntryLabelColor(int i) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintEntryLabels().setColor(i);
    }

    public void setEntryLabelTypeface(android.graphics.Typeface typeface) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTypeface(typeface);
    }

    public void setEntryLabelTextSize(float f) {
        ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).getPaintEntryLabels().setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(f));
    }

    public boolean isDrawRoundedSlicesEnabled() {
        return this.mDrawRoundedSlices;
    }

    public void setUsePercentValues(boolean z) {
        this.mUsePercentValues = z;
    }

    public boolean isUsePercentValuesEnabled() {
        return this.mUsePercentValues;
    }

    public void setCenterTextRadiusPercent(float f) {
        this.mCenterTextRadiusPercent = f;
    }

    public float getCenterTextRadiusPercent() {
        return this.mCenterTextRadiusPercent;
    }

    public float getMaxAngle() {
        return this.mMaxAngle;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.mMaxAngle = f;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.mRenderer != null && (this.mRenderer instanceof com.github.mikephil.charting.renderer.PieChartRenderer)) {
            ((com.github.mikephil.charting.renderer.PieChartRenderer) this.mRenderer).releaseBitmap();
        }
        super.onDetachedFromWindow();
    }
}
