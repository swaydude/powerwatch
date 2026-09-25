package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalBarChartRenderer extends com.github.mikephil.charting.renderer.BarChartRenderer {
    private android.graphics.RectF mBarShadowRectBuffer;

    public HorizontalBarChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider barDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(barDataProvider, chartAnimator, viewPortHandler);
        this.mBarShadowRectBuffer = new android.graphics.RectF();
        this.mValuePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        com.github.mikephil.charting.data.BarData barData = this.mChart.getBarData();
        this.mBarBuffers = new com.github.mikephil.charting.buffer.HorizontalBarBuffer[barData.getDataSetCount()];
        for (int i = 0; i < this.mBarBuffers.length; i++) {
            com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) barData.getDataSetByIndex(i);
            this.mBarBuffers[i] = new com.github.mikephil.charting.buffer.HorizontalBarBuffer(iBarDataSet.getEntryCount() * 4 * (iBarDataSet.isStacked() ? iBarDataSet.getStackSize() : 1), barData.getDataSetCount(), iBarDataSet.isStacked());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
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
                this.mBarShadowRectBuffer.top = x - barWidth;
                this.mBarShadowRectBuffer.bottom = x + barWidth;
                transformer.rectValueToPixel(this.mBarShadowRectBuffer);
                if (this.mViewPortHandler.isInBoundsTop(this.mBarShadowRectBuffer.bottom)) {
                    if (!this.mViewPortHandler.isInBoundsBottom(this.mBarShadowRectBuffer.top)) {
                        break;
                    }
                    this.mBarShadowRectBuffer.left = this.mViewPortHandler.contentLeft();
                    this.mBarShadowRectBuffer.right = this.mViewPortHandler.contentRight();
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
            int i4 = i3 + 3;
            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i4])) {
                return;
            }
            int i5 = i3 + 1;
            if (this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i5])) {
                if (!z2) {
                    this.mRenderPaint.setColor(iBarDataSet.getColor(i3 / 4));
                }
                int i6 = i3 + 2;
                canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i5], barBuffer.buffer[i6], barBuffer.buffer[i4], this.mRenderPaint);
                if (z) {
                    canvas.drawRect(barBuffer.buffer[i3], barBuffer.buffer[i5], barBuffer.buffer[i6], barBuffer.buffer[i4], this.mBarBorderPaint);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not found block with instruction: 0x00ee: MOVE (r3v14 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    /* JADX WARN: Not found block with instruction: 0x0100: MOVE (r5v17 ?? I:??[OBJECT, ARRAY]) A[DONT_GENERATE, REMOVE] */
    @Override // com.github.mikephil.charting.renderer.BarChartRenderer, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        java.util.List list;
        com.github.mikephil.charting.utils.MPPointF mPPointF;
        float f;
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List dataSets = this.mChart.getBarData().getDataSets();
            float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
            boolean zIsDrawValueAboveBarEnabled = this.mChart.isDrawValueAboveBarEnabled();
            int i = 0;
            while (i < this.mChart.getBarData().getDataSetCount()) {
                com.github.mikephil.charting.interfaces.datasets.IBarDataSet iBarDataSet = (com.github.mikephil.charting.interfaces.datasets.IBarDataSet) dataSets.get(i);
                if (shouldDrawValues(iBarDataSet)) {
                    boolean zIsInverted = this.mChart.isInverted(iBarDataSet.getAxisDependency());
                    applyValueTextStyle(iBarDataSet);
                    float f2 = 2.0f;
                    float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "10") / 2.0f;
                    com.github.mikephil.charting.formatter.IValueFormatter valueFormatter = iBarDataSet.getValueFormatter();
                    com.github.mikephil.charting.buffer.BarBuffer barBuffer = this.mBarBuffers[i];
                    float phaseY = this.mAnimator.getPhaseY();
                    com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(iBarDataSet.getIconsOffset());
                    mPPointF2.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF2.x);
                    mPPointF2.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF2.y);
                    if (iBarDataSet.isStacked()) {
                        list = dataSets;
                        mPPointF = mPPointF2;
                        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iBarDataSet.getAxisDependency());
                        int i2 = 0;
                        int length = 0;
                        while (i2 < iBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
                            com.github.mikephil.charting.data.BarEntry barEntry = (com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForIndex(i2);
                            int valueTextColor = iBarDataSet.getValueTextColor(i2);
                            float[] yVals = barEntry.getYVals();
                            if (yVals == null) {
                                int i3 = length + 1;
                                if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i3])) {
                                    break;
                                }
                                if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[length]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i3])) {
                                    java.lang.String formattedValue = valueFormatter.getFormattedValue(barEntry.getY(), barEntry, i, this.mViewPortHandler);
                                    float fCalcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(this.mValuePaint, formattedValue);
                                    float f3 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth + fConvertDpToPixel);
                                    float f4 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth + fConvertDpToPixel) : fConvertDpToPixel;
                                    if (zIsInverted) {
                                        f3 = (-f3) - fCalcTextWidth;
                                        f4 = (-f4) - fCalcTextWidth;
                                    }
                                    float f5 = f3;
                                    float f6 = f4;
                                    if (iBarDataSet.isDrawValuesEnabled()) {
                                        drawValue(canvas, formattedValue, barBuffer.buffer[length + 2] + (barEntry.getY() >= 0.0f ? f5 : f6), barBuffer.buffer[i3] + fCalcTextHeight, valueTextColor);
                                    }
                                    if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                        android.graphics.drawable.Drawable icon = barEntry.getIcon();
                                        float f7 = barBuffer.buffer[length + 2];
                                        if (barEntry.getY() < 0.0f) {
                                            f5 = f6;
                                        }
                                        com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f7 + f5 + mPPointF.x), (int) (barBuffer.buffer[i3] + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i2 = i2;
                                yVals = yVals;
                                int length2 = yVals.length * 2;
                                float[] fArr = new float[length2];
                                float f8 = -barEntry.getNegativeSum();
                                int i4 = 0;
                                int i5 = 0;
                                float f9 = 0.0f;
                                while (i4 < length2) {
                                    float f10 = yVals[i5];
                                    if (f10 == 0.0f && (f9 == 0.0f || f8 == 0.0f)) {
                                        float f11 = f8;
                                        f8 = f10;
                                        f = f11;
                                    } else if (f10 >= 0.0f) {
                                        f9 += f10;
                                        f = f8;
                                        f8 = f9;
                                    } else {
                                        f = f8 - f10;
                                    }
                                    fArr[i4] = f8 * phaseY;
                                    i4 += 2;
                                    i5++;
                                    f8 = f;
                                }
                                transformer.pointValuesToPixel(fArr);
                                int i6 = 0;
                                while (true) {
                                    if (i6 < length2) {
                                        float f12 = yVals[i6 / 2];
                                        java.lang.String formattedValue2 = valueFormatter.getFormattedValue(f12, barEntry, i, this.mViewPortHandler);
                                        float fCalcTextWidth2 = com.github.mikephil.charting.utils.Utils.calcTextWidth(this.mValuePaint, formattedValue2);
                                        float f13 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth2 + fConvertDpToPixel);
                                        int i7 = length2;
                                        float f14 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth2 + fConvertDpToPixel) : fConvertDpToPixel;
                                        if (zIsInverted) {
                                            f13 = (-f13) - fCalcTextWidth2;
                                            f14 = (-f14) - fCalcTextWidth2;
                                        }
                                        boolean z = (f12 == 0.0f && f8 == 0.0f && f9 > 0.0f) || f12 < 0.0f;
                                        float f15 = fArr[i6];
                                        if (z) {
                                            f13 = f14;
                                        }
                                        float f16 = f15 + f13;
                                        float f17 = (barBuffer.buffer[length + 1] + barBuffer.buffer[length + 3]) / 2.0f;
                                        if (!this.mViewPortHandler.isInBoundsTop(f17)) {
                                            break;
                                        }
                                        if (this.mViewPortHandler.isInBoundsX(f16) && this.mViewPortHandler.isInBoundsBottom(f17)) {
                                            if (iBarDataSet.isDrawValuesEnabled()) {
                                                drawValue(canvas, formattedValue2, f16, f17 + fCalcTextHeight, valueTextColor);
                                            }
                                            if (barEntry.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                                android.graphics.drawable.Drawable icon2 = barEntry.getIcon();
                                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon2, (int) (f16 + mPPointF.x), (int) (f17 + mPPointF.y), icon2.getIntrinsicWidth(), icon2.getIntrinsicHeight());
                                            }
                                        } else {
                                            i6 = i6;
                                            fArr = fArr;
                                        }
                                        i6 += 2;
                                        length2 = i7;
                                        fArr = fArr;
                                    }
                                }
                                if (yVals == null) {
                                    length += 4;
                                } else {
                                    length += yVals.length * 4;
                                }
                                i2++;
                            }
                            if (yVals == null) {
                                length += 4;
                            } else {
                                length += yVals.length * 4;
                            }
                            i2++;
                        }
                    } else {
                        int i8 = 0;
                        while (i8 < barBuffer.buffer.length * this.mAnimator.getPhaseX()) {
                            int i9 = i8 + 1;
                            float f18 = (barBuffer.buffer[i9] + barBuffer.buffer[i8 + 3]) / f2;
                            if (!this.mViewPortHandler.isInBoundsTop(barBuffer.buffer[i9])) {
                                break;
                            }
                            if (this.mViewPortHandler.isInBoundsX(barBuffer.buffer[i8]) && this.mViewPortHandler.isInBoundsBottom(barBuffer.buffer[i9])) {
                                com.github.mikephil.charting.data.BarEntry barEntry2 = (com.github.mikephil.charting.data.BarEntry) iBarDataSet.getEntryForIndex(i8 / 4);
                                float y = barEntry2.getY();
                                java.lang.String formattedValue3 = valueFormatter.getFormattedValue(y, barEntry2, i, this.mViewPortHandler);
                                float fCalcTextWidth3 = com.github.mikephil.charting.utils.Utils.calcTextWidth(this.mValuePaint, formattedValue3);
                                float f19 = zIsDrawValueAboveBarEnabled ? fConvertDpToPixel : -(fCalcTextWidth3 + fConvertDpToPixel);
                                float f20 = zIsDrawValueAboveBarEnabled ? -(fCalcTextWidth3 + fConvertDpToPixel) : fConvertDpToPixel;
                                if (zIsInverted) {
                                    f19 = (-f19) - fCalcTextWidth3;
                                    f20 = (-f20) - fCalcTextWidth3;
                                }
                                float f21 = f19;
                                float f22 = f20;
                                if (iBarDataSet.isDrawValuesEnabled()) {
                                    drawValue(canvas, formattedValue3, (y >= 0.0f ? f21 : f22) + barBuffer.buffer[i8 + 2], f18 + fCalcTextHeight, iBarDataSet.getValueTextColor(i8 / 2));
                                }
                                if (barEntry2.getIcon() != null && iBarDataSet.isDrawIconsEnabled()) {
                                    android.graphics.drawable.Drawable icon3 = barEntry2.getIcon();
                                    float f23 = barBuffer.buffer[i8 + 2];
                                    if (y < 0.0f) {
                                        f21 = f22;
                                    }
                                    com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon3, (int) (f23 + f21 + r19.x), (int) (f18 + r19.y), icon3.getIntrinsicWidth(), icon3.getIntrinsicHeight());
                                }
                            } else {
                                i8 = i8;
                                dataSets = dataSets;
                                zIsInverted = zIsInverted;
                                fCalcTextHeight = fCalcTextHeight;
                                barBuffer = barBuffer;
                            }
                            i8 += 4;
                            mPPointF2 = mPPointF2;
                            valueFormatter = valueFormatter;
                            barBuffer = barBuffer;
                            fCalcTextHeight = fCalcTextHeight;
                            dataSets = dataSets;
                            zIsInverted = zIsInverted;
                            f2 = 2.0f;
                        }
                        list = dataSets;
                        mPPointF = mPPointF2;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                } else {
                    list = dataSets;
                }
                i++;
                dataSets = list;
            }
        }
    }

    protected void drawValue(android.graphics.Canvas canvas, java.lang.String str, float f, float f2, int i) {
        this.mValuePaint.setColor(i);
        canvas.drawText(str, f, f2, this.mValuePaint);
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void prepareBarHighlight(float f, float f2, float f3, float f4, com.github.mikephil.charting.utils.Transformer transformer) {
        this.mBarRect.set(f2, f - f4, f3, f + f4);
        transformer.rectToPixelPhaseHorizontal(this.mBarRect, this.mAnimator.getPhaseY());
    }

    @Override // com.github.mikephil.charting.renderer.BarChartRenderer
    protected void setHighlightDrawPos(com.github.mikephil.charting.highlight.Highlight highlight, android.graphics.RectF rectF) {
        highlight.setDraw(rectF.centerY(), rectF.right);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    protected boolean isDrawingValuesAllowed(com.github.mikephil.charting.interfaces.dataprovider.ChartInterface chartInterface) {
        return ((float) chartInterface.getData().getEntryCount()) < ((float) chartInterface.getMaxVisibleCount()) * this.mViewPortHandler.getScaleY();
    }
}
