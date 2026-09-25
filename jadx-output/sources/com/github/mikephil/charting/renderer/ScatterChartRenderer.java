package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class ScatterChartRenderer extends com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer {
    protected com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider mChart;
    float[] mPixelBuffer;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public ScatterChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider scatterDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mPixelBuffer = new float[2];
        this.mChart = scatterDataProvider;
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        for (T t : this.mChart.getScatterData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet) {
        com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = this.mViewPortHandler;
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iScatterDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.renderer.scatter.IShapeRenderer shapeRenderer = iScatterDataSet.getShapeRenderer();
        if (shapeRenderer == null) {
            android.util.Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
            return;
        }
        int iMin = (int) java.lang.Math.min(java.lang.Math.ceil(iScatterDataSet.getEntryCount() * this.mAnimator.getPhaseX()), iScatterDataSet.getEntryCount());
        for (int i = 0; i < iMin; i++) {
            ?? entryForIndex = iScatterDataSet.getEntryForIndex(i);
            this.mPixelBuffer[0] = entryForIndex.getX();
            this.mPixelBuffer[1] = entryForIndex.getY() * phaseY;
            transformer.pointValuesToPixel(this.mPixelBuffer);
            if (!viewPortHandler.isInBoundsRight(this.mPixelBuffer[0])) {
                return;
            }
            if (viewPortHandler.isInBoundsLeft(this.mPixelBuffer[0]) && viewPortHandler.isInBoundsY(this.mPixelBuffer[1])) {
                this.mRenderPaint.setColor(iScatterDataSet.getColor(i / 2));
                com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                float[] fArr = this.mPixelBuffer;
                shapeRenderer.renderShape(canvas, iScatterDataSet, viewPortHandler2, fArr[0], fArr[1], this.mRenderPaint);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List<T> dataSets = this.mChart.getScatterData().getDataSets();
            for (int i = 0; i < this.mChart.getScatterData().getDataSetCount(); i++) {
                com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) dataSets.get(i);
                if (shouldDrawValues(iScatterDataSet)) {
                    applyValueTextStyle(iScatterDataSet);
                    this.mXBounds.set(this.mChart, iScatterDataSet);
                    float[] fArrGenerateTransformedValuesScatter = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).generateTransformedValuesScatter(iScatterDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(iScatterDataSet.getScatterShapeSize());
                    com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iScatterDataSet.getIconsOffset());
                    mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                    int i2 = 0;
                    while (i2 < fArrGenerateTransformedValuesScatter.length && this.mViewPortHandler.isInBoundsRight(fArrGenerateTransformedValuesScatter[i2])) {
                        if (this.mViewPortHandler.isInBoundsLeft(fArrGenerateTransformedValuesScatter[i2])) {
                            int i3 = i2 + 1;
                            if (this.mViewPortHandler.isInBoundsY(fArrGenerateTransformedValuesScatter[i3])) {
                                int i4 = i2 / 2;
                                ?? entryForIndex = iScatterDataSet.getEntryForIndex(this.mXBounds.min + i4);
                                if (iScatterDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, iScatterDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i, fArrGenerateTransformedValuesScatter[i2], fArrGenerateTransformedValuesScatter[i3] - fConvertDpToPixel, iScatterDataSet.getValueTextColor(i4 + this.mXBounds.min));
                                }
                                if (entryForIndex.getIcon() != null && iScatterDataSet.isDrawIconsEnabled()) {
                                    android.graphics.drawable.Drawable icon = entryForIndex.getIcon();
                                    com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (fArrGenerateTransformedValuesScatter[i2] + mPPointF.x), (int) (fArrGenerateTransformedValuesScatter[i3] + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                }
                            } else {
                                i2 = i2;
                                mPPointF = mPPointF;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.ScatterData scatterData = this.mChart.getScatterData();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.IScatterDataSet iScatterDataSet = (com.github.mikephil.charting.interfaces.datasets.IScatterDataSet) scatterData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iScatterDataSet != null && iScatterDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iScatterDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iScatterDataSet)) {
                    com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mChart.getTransformer(iScatterDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iScatterDataSet);
                }
            }
        }
    }
}
