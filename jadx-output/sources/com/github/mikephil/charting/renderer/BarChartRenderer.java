package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class BarChartRenderer extends com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer {
    protected android.graphics.Paint mBarBorderPaint;
    protected com.github.mikephil.charting.buffer.BarBuffer[] mBarBuffers;
    protected android.graphics.RectF mBarRect;
    private android.graphics.RectF mBarShadowRectBuffer;
    protected com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider mChart;
    protected android.graphics.Paint mShadowPaint;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
    }

    public BarChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider barDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBarRect = new android.graphics.RectF();
        this.mBarShadowRectBuffer = new android.graphics.RectF();
        this.mChart = barDataProvider;
        this.mHighlightPaint = new android.graphics.Paint(1);
        this.mHighlightPaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mHighlightPaint.setColor(android.graphics.Color.rgb(0, 0, 0));
        this.mHighlightPaint.setAlpha(120);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mShadowPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.mBarBorderPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        com.github.mikephil.charting.data.BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new com.github.mikephil.charting.buffer.BarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new com.github.mikephil.charting.buffer.BarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.data.BarData barData = this.mChart.getBarData();
        for (int i = 0; i < barData.getDataSetCount(); i++) {
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) barData.getDataSetByIndex(i);
            if (iBarDataSet.isVisible()) {
                drawDataSet(canvas, iBarDataSet, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet, int i) {
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
        this.mBarBorderPaint.setColor(iBarDataSet.getBarBorderColor());
        this.mBarBorderPaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iBarDataSet.getBarBorderWidth()));
        boolean z = iBarDataSet.getBarBorderWidth() > 0.0f;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        if (this.mChart.isDrawBarShadowEnabled()) {
            this.mShadowPaint.setColor(iBarDataSet.getBarShadowColor());
            float barWidth = this.mChart.getBarData().getBarWidth() / 2.0f;
            int iMin = java.lang.Math.min((int) java.lang.Math.ceil(iBarDataSet.getEntryCount() * phaseX), iBarDataSet.getEntryCount());
            for (int i2 = 0; i2 < iMin; i2++) {
                float x = ((com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForIndex(i2)).getX();
                this.mBarShadowRectBuffer.left = x - barWidth;
                this.mBarShadowRectBuffer.right = x + barWidth;
                transformer.rectValueToPixel(this.mBarShadowRectBuffer);
                if (this.mViewPortHandler.isInBoundsLeft(this.mBarShadowRectBuffer.right)) {
                    if (!this.mViewPortHandler.isInBoundsRight(this.mBarShadowRectBuffer.left)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.top = this.mViewPortHandler.contentTop();
                    this.mBarShadowRectBuffer.bottom = this.mViewPortHandler.contentBottom();
                    canvas.drawRect(this.mBarShadowRectBuffer, this.mShadowPaint);
                }
            }
        }
        com.github.mikephil.charting.buffer.BarBuffer barBuffer = this.mBarBuffers[i];
        barBuffer.setPhases(phaseX, phaseY);
        barBuffer.setDataSet(i);
        barBuffer.setInverted(this.mChart.isInverted(iBarDataSet.getAxisDependency()));
        barBuffer.setBarWidth(this.mChart.getBarData().getBarWidth());
        barBuffer.feed(iBarDataSet);
        transformer.pointValuesToPixel(barBuffer.buffer);
        boolean z2 = iBarDataSet.getColors().size() == 1;
        if (z2) {
            this.mRenderPaint.setColor(iBarDataSet.getColor());
        }
        for (int i3 = 0; i3 < barBuffer.size(); i3 += 4) {
            int i4 = i3 + 2;
            if (this.mViewPortHandler.isInBoundsLeft(barBuffer.buffer[i4])) {
                if (!this.mViewPortHandler.isInBoundsRight(barBuffer.buffer[i3])) {
                    return;
                }
                if (!z2) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                }
                int i5 = i3 + 1;
                int i6 = i3 + 3;
                canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i5], barBuffer.buffer[i4], barBuffer.buffer[i6], this.mRenderPaint);
                if (z) {
                    canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i5], barBuffer.buffer[i4], barBuffer.buffer[i6], this.mBarBorderPaint);
                }
            }
        }
    }

    protected void prepareBarHighlight(float f, float f2, float f3, float f4, com.github.mikephil.charting.utils.Transformer transformer) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.mBarRect, this.mAnimator.getPhaseY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        java.util.List list;
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        float f5;
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.5f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i = 0;
            while (i < this.mChart.getBarData().getDataSetCount()) {
                com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) dataSets.get(i);
                if (shouldDrawValues(iBarDataSet)) {
                    applyValueTextStyle(iBarDataSet);
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "8");
                    float f6 = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                    float f7 = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                    if (zIsInverted) {
                        f6 = (-f6) - fCalcTextHeight;
                        f7 = (-f7) - fCalcTextHeight;
                    }
                    float f8 = f6;
                    float f9 = f7;
                    com.github.mikephil.charting.buffer.BarBuffer barBuffer = this.mBarBuffers[i];
                    float phaseY = this.mAnimator.getPhaseY();
                    com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF2.x);
                    mPPointF2.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF2.y);
                    if (iBarDataSet.isStacked()) {
                        mPPointF = mPPointF2;
                        list = dataSets;
                        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i2 = 0;
                        int length = 0;
                        while (i2 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
                            com.github.mikephil.charting.data.BarEntry barEntry = (com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForIndex(i2);
                            float[] yVals = barEntry.getYVals();
                            float f10 = (barBuffer.buffer[length] + barBuffer.buffer[length + 2]) / 2.0f;
                            int valueTextColor = iBarDataSet.getValueTextColor(i2);
                            if (yVals == null) {
                                if (!this.mViewPortHandler.isInBoundsRight(f10)) {
                                    break;
                                }
                                int i3 = length + 1;
                                if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i3]) && this.mViewPortHandler.isInBoundsLeft(f10)) {
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        f3 = f10;
                                        drawValue(canvas, iBarDataSet.getValueFormatter(), barEntry.getY(), barEntry, i, f3, barBuffer.buffer[i3] + (barEntry.getY() >= 0.0f ? f8 : f9), valueTextColor);
                                    } else {
                                        f3 = f10;
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        android.graphics.drawable.Drawable icon = barEntry.getIcon();
                                        com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f3 + mPPointF.x), (int) (barBuffer.buffer[i3] + (barEntry.getY() >= 0.0f ? f8 : f9) + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                } else {
                                    transformer = transformer;
                                    zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                    fConvertDpToPixel = fConvertDpToPixel;
                                    i2 = i2;
                                }
                            } else {
                                i2 = i2;
                                fConvertDpToPixel = fConvertDpToPixel;
                                zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                                yVals = yVals;
                                transformer = transformer;
                                float f11 = f10;
                                int length2 = yVals.length * 2;
                                float[] fArr = new float[length2];
                                float f12 = -barEntry.getNegativeSum();
                                int i4 = 0;
                                int i5 = 0;
                                float f13 = 0.0f;
                                while (i4 < length2) {
                                    float f14 = yVals[i5];
                                    if (f14 == 0.0f && (f13 == 0.0f || f12 == 0.0f)) {
                                        float f15 = f12;
                                        f12 = f14;
                                        f2 = f15;
                                    } else if (f14 >= 0.0f) {
                                        f13 += f14;
                                        f2 = f12;
                                        f12 = f13;
                                    } else {
                                        f2 = f12 - f14;
                                    }
                                    fArr[i4 + 1] = f12 * phaseY;
                                    i4 += 2;
                                    i5++;
                                    f12 = f2;
                                }
                                transformer.pointValuesToPixel(fArr);
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = i6 / 2;
                                    float f16 = yVals[i7];
                                    float f17 = fArr[i6 + 1] + (((f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) == 0 && (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1)) == 0 && (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1)) > 0) || (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) < 0 ? f9 : f8);
                                    if (!this.mViewPortHandler.isInBoundsRight(f11)) {
                                        break;
                                    }
                                    if (this.mViewPortHandler.isInBoundsY(f17) && this.mViewPortHandler.isInBoundsLeft(f11)) {
                                        if (iBarDataSet.isDrawValuesEnabled()) {
                                            f = f17;
                                            drawValue(canvas, iBarDataSet.getValueFormatter(), yVals[i7], barEntry, i, f11, f, valueTextColor);
                                        } else {
                                            f = f17;
                                        }
                                        if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                            android.graphics.drawable.Drawable icon2 = barEntry.getIcon();
                                            com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon2, (int) (f11 + mPPointF.x), (int) (f + mPPointF.y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i6 = i6;
                                        fArr = fArr;
                                        length2 = length2;
                                        f11 = f11;
                                    }
                                    i6 += 2;
                                    fArr = fArr;
                                    length2 = length2;
                                    f11 = f11;
                                }
                            }
                            length = yVals == null ? length + 4 : length + (yVals.length * 4);
                            i2++;
                            transformer = transformer;
                            zIsDrawValueAboveBarEnabled = zIsDrawValueAboveBarEnabled;
                            fConvertDpToPixel = fConvertDpToPixel;
                        }
                    } else {
                        int i8 = 0;
                        while (i8 < barBuffer.buffer.length * this.mAnimator.getPhaseX()) {
                            float f18 = (barBuffer.buffer[i8] + barBuffer.buffer[i8 + 2]) / 2.0f;
                            if (!this.mViewPortHandler.isInBoundsRight(f18)) {
                                break;
                            }
                            int i9 = i8 + 1;
                            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i9]) && this.mViewPortHandler.isInBoundsLeft(f18)) {
                                int i10 = i8 / 4;
                                com.github.mikephil.charting.data.Entry entry = (com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForIndex(i10);
                                float y = entry.getY();
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    f5 = f18;
                                    drawValue(canvas, iBarDataSet.getValueFormatter(), y, entry, i, f5, y >= 0.0f ? barBuffer.buffer[i9] + f8 : barBuffer.buffer[i8 + 3] + f9, iBarDataSet.getValueTextColor(i10));
                                } else {
                                    f5 = f18;
                                }
                                if (entry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    android.graphics.drawable.Drawable icon3 = entry.getIcon();
                                    com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon3, (int) (f5 + mPPointF2.x), (int) ((y >= 0.0f ? barBuffer.buffer[i9] + f8 : barBuffer.buffer[i8 + 3] + f9) + mPPointF2.y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i8 = i8;
                                mPPointF2 = mPPointF2;
                                dataSets = dataSets;
                                barBuffer = barBuffer;
                            }
                            i8 += 4;
                            barBuffer = barBuffer;
                            mPPointF2 = mPPointF2;
                            dataSets = dataSets;
                        }
                        mPPointF = mPPointF2;
                        list = dataSets;
                    }
                    f4 = fConvertDpToPixel;
                    z = zIsDrawValueAboveBarEnabled;
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                    f4 = fConvertDpToPixel;
                    z = zIsDrawValueAboveBarEnabled;
                }
                i++;
                dataSets = list;
                zIsDrawValueAboveBarEnabled = z;
                fConvertDpToPixel = f4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        float y;
        float f;
        com.github.mikephil.charting.data.BarData barData = this.mChart.getBarData();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iBarDataSet != null && iBarDataSet.isHighlightEnabled()) {
                com.github.mikephil.charting.data.BarEntry barEntry = (com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(barEntry, iBarDataSet)) {
                    com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                    this.mHighlightPaint.setColor(iBarDataSet.getHighLightColor());
                    this.mHighlightPaint.setAlpha(iBarDataSet.getHighLightAlpha());
                    if (highlight.getStackIndex() >= 0 && barEntry.isStacked()) {
                        if (this.mChart.isHighlightFullBarEnabled()) {
                            float positiveSum = barEntry.getPositiveSum();
                            f = -barEntry.getNegativeSum();
                            y = positiveSum;
                        } else {
                            com.github.mikephil.charting.highlight.Range range = barEntry.getRanges()[highlight.getStackIndex()];
                            y = range.from;
                            f = range.to;
                        }
                    } else {
                        y = barEntry.getY();
                        f = 0.0f;
                    }
                    prepareBarHighlight(barEntry.getX(), y, f, barData.getBarWidth() / 2.0f, transformer);
                    setHighlightDrawPos(highlight, this.mBarRect);
                    canvas.drawRect(this.mBarRect, this.mHighlightPaint);
                }
            }
        }
    }

    protected void setHighlightDrawPos(com.github.mikephil.charting.highlight.Highlight highlight, android.graphics.RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }
}
