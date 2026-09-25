package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class BubbleChartRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    private float[] _hsvBuffer;
    protected com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider mChart;
    private float[] pointBuffer;
    private float[] sizeBuffer;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public BubbleChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BubbleDataProvider bubbleDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.sizeBuffer = new float[4];
        this.pointBuffer = new float[2];
        this._hsvBuffer = new float[3];
        this.mChart = bubbleDataProvider;
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mHighlightPaint.setStyle(android.graphics.Paint.Style.STROKE);
        this.mHighlightPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(1.5f));
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        for (T t : this.mChart.getBubbleData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
    }

    protected float getShapeSize(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == 0.0f ? 1.0f : (float) java.lang.Math.sqrt(f / f2);
        }
        return f3 * f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet) {
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mXBounds.set(this.mChart, iBubbleDataSet);
        float[] fArr = this.sizeBuffer;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        transformer.pointValuesToPixel(fArr);
        boolean zIsNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
        float[] fArr2 = this.sizeBuffer;
        float fMin = java.lang.Math.min(java.lang.Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), java.lang.Math.abs(fArr2[2] - fArr2[0]));
        for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min; i++) {
            com.github.mikephil.charting.data.BubbleEntry bubbleEntry = (com.github.mikephil.charting.data.BubbleEntry) iBubbleDataSet.getEntryForIndex(i);
            this.pointBuffer[0] = bubbleEntry.getX();
            this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
            transformer.pointValuesToPixel(this.pointBuffer);
            float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), fMin, zIsNormalizeSizeEnabled) / 2.0f;
            if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                    return;
                }
                this.mRenderPaint.setColor(iBubbleDataSet.getColor((int) bubbleEntry.getX()));
                float[] fArr3 = this.pointBuffer;
                canvas.drawCircle(fArr3[0], fArr3[1], shapeSize, this.mRenderPaint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.data.BubbleData bubbleData = this.mChart.getBubbleData();
        if (bubbleData != null && isDrawingValuesAllowed(this.mChart)) {
            java.util.List<T> dataSets = bubbleData.getDataSets();
            float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "1");
            for (int i = 0; i < dataSets.size(); i++) {
                com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) dataSets.get(i);
                if (shouldDrawValues(iBubbleDataSet)) {
                    applyValueTextStyle(iBubbleDataSet);
                    float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.mAnimator.getPhaseX()));
                    float phaseY = this.mAnimator.getPhaseY();
                    this.mXBounds.set(this.mChart, iBubbleDataSet);
                    float[] fArrGenerateTransformedValuesBubble = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency()).generateTransformedValuesBubble(iBubbleDataSet, phaseY, this.mXBounds.min, this.mXBounds.max);
                    float f = fMax == 1.0f ? phaseY : fMax;
                    com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iBubbleDataSet.getIconsOffset());
                    mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                    int i2 = 0;
                    while (i2 < fArrGenerateTransformedValuesBubble.length) {
                        int i3 = i2 / 2;
                        int valueTextColor = iBubbleDataSet.getValueTextColor(this.mXBounds.min + i3);
                        int iArgb = android.graphics.Color.argb(java.lang.Math.round(255.0f * f), android.graphics.Color.red(valueTextColor), android.graphics.Color.green(valueTextColor), android.graphics.Color.blue(valueTextColor));
                        float f2 = fArrGenerateTransformedValuesBubble[i2];
                        float f3 = fArrGenerateTransformedValuesBubble[i2 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f2)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f2) && this.mViewPortHandler.isInBoundsY(f3)) {
                            com.github.mikephil.charting.data.BubbleEntry bubbleEntry = (com.github.mikephil.charting.data.BubbleEntry) iBubbleDataSet.getEntryForIndex(i3 + this.mXBounds.min);
                            if (iBubbleDataSet.isDrawValuesEnabled()) {
                                drawValue(canvas, iBubbleDataSet.getValueFormatter(), bubbleEntry.getSize(), bubbleEntry, i, f2, f3 + (0.5f * fCalcTextHeight), iArgb);
                            }
                            if (bubbleEntry.getIcon() != null && iBubbleDataSet.isDrawIconsEnabled()) {
                                android.graphics.drawable.Drawable icon = bubbleEntry.getIcon();
                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f2 + mPPointF.x), (int) (f3 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i2 = i2;
                            mPPointF = mPPointF;
                        }
                        i2 += 2;
                        mPPointF = mPPointF;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.BubbleData bubbleData = this.mChart.getBubbleData();
        float phaseY = this.mAnimator.getPhaseY();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet iBubbleDataSet = (com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet) bubbleData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBubbleDataSet != null && iBubbleDataSet.isHighlightEnabled()) {
                com.github.mikephil.charting.data.BubbleEntry bubbleEntry = (com.github.mikephil.charting.data.BubbleEntry) iBubbleDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (bubbleEntry.getY() == highlight.getY() && isInBoundsX(bubbleEntry, iBubbleDataSet)) {
                    com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBubbleDataSet.getAxisDependency());
                    float[] fArr = this.sizeBuffer;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    transformer.pointValuesToPixel(fArr);
                    boolean zIsNormalizeSizeEnabled = iBubbleDataSet.isNormalizeSizeEnabled();
                    float[] fArr2 = this.sizeBuffer;
                    float fMin = java.lang.Math.min(java.lang.Math.abs(this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()), java.lang.Math.abs(fArr2[2] - fArr2[0]));
                    this.pointBuffer[0] = bubbleEntry.getX();
                    this.pointBuffer[1] = bubbleEntry.getY() * phaseY;
                    transformer.pointValuesToPixel(this.pointBuffer);
                    float[] fArr3 = this.pointBuffer;
                    highlight.setDraw(fArr3[0], fArr3[1]);
                    float shapeSize = getShapeSize(bubbleEntry.getSize(), iBubbleDataSet.getMaxSize(), fMin, zIsNormalizeSizeEnabled) / 2.0f;
                    if (this.mViewPortHandler.isInBoundsTop(this.pointBuffer[1] + shapeSize) && this.mViewPortHandler.isInBoundsBottom(this.pointBuffer[1] - shapeSize) && this.mViewPortHandler.isInBoundsLeft(this.pointBuffer[0] + shapeSize)) {
                        if (!this.mViewPortHandler.isInBoundsRight(this.pointBuffer[0] - shapeSize)) {
                            return;
                        }
                        int color = iBubbleDataSet.getColor((int) bubbleEntry.getX());
                        android.graphics.Color.RGBToHSV(android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color), this._hsvBuffer);
                        float[] fArr4 = this._hsvBuffer;
                        fArr4[2] = fArr4[2] * 0.5f;
                        this.mHighlightPaint.setColor(android.graphics.Color.HSVToColor(android.graphics.Color.alpha(color), this._hsvBuffer));
                        this.mHighlightPaint.setStrokeWidth(iBubbleDataSet.getHighlightCircleWidth());
                        float[] fArr5 = this.pointBuffer;
                        canvas.drawCircle(fArr5[0], fArr5[1], shapeSize, this.mHighlightPaint);
                    }
                }
            }
        }
    }
}
