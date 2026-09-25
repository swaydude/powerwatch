package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class PieChartRenderer extends com.github.mikephil.charting.renderer.DataRenderer {
    protected android.graphics.Canvas mBitmapCanvas;
    private android.graphics.RectF mCenterTextLastBounds;
    private java.lang.CharSequence mCenterTextLastValue;
    private android.text.StaticLayout mCenterTextLayout;
    private android.text.TextPaint mCenterTextPaint;
    protected com.github.mikephil.charting.charts.PieChart mChart;
    protected java.lang.ref.WeakReference<android.graphics.Bitmap> mDrawBitmap;
    protected android.graphics.Path mDrawCenterTextPathBuffer;
    protected android.graphics.RectF mDrawHighlightedRectF;
    private android.graphics.Paint mEntryLabelsPaint;
    private android.graphics.Path mHoleCirclePath;
    protected android.graphics.Paint mHolePaint;
    private android.graphics.RectF mInnerRectBuffer;
    private android.graphics.Path mPathBuffer;
    private android.graphics.RectF[] mRectBuffer;
    protected android.graphics.Paint mTransparentCirclePaint;
    protected android.graphics.Paint mValueLinePaint;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public PieChartRenderer(com.github.mikephil.charting.charts.PieChart pieChart, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new android.graphics.RectF();
        this.mRectBuffer = new android.graphics.RectF[]{new android.graphics.RectF(), new android.graphics.RectF(), new android.graphics.RectF()};
        this.mPathBuffer = new android.graphics.Path();
        this.mInnerRectBuffer = new android.graphics.RectF();
        this.mHoleCirclePath = new android.graphics.Path();
        this.mDrawCenterTextPathBuffer = new android.graphics.Path();
        this.mDrawHighlightedRectF = new android.graphics.RectF();
        this.mChart = pieChart;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(android.graphics.Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(105);
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        this.mCenterTextPaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.mEntryLabelsPaint = paint3;
        paint3.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        this.mEntryLabelsPaint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(13.0f));
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(android.graphics.Paint.Style.STROKE);
    }

    public android.graphics.Paint getPaintHole() {
        return this.mHolePaint;
    }

    public android.graphics.Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    public android.text.TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public android.graphics.Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        java.lang.ref.WeakReference<android.graphics.Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.mDrawBitmap.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.mDrawBitmap = new java.lang.ref.WeakReference<>(android.graphics.Bitmap.createBitmap(chartWidth, chartHeight, android.graphics.Bitmap.Config.ARGB_4444));
            this.mBitmapCanvas = new android.graphics.Canvas(this.mDrawBitmap.get());
        }
        this.mDrawBitmap.get().eraseColor(0);
        for (com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet : ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    protected float calculateMinimumRadiusForSpacedSlice(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = mPPointF.x + (((float) java.lang.Math.cos(d)) * f);
        float fSin = mPPointF.y + (((float) java.lang.Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) (((double) (f - ((float) ((java.lang.Math.sqrt(java.lang.Math.pow(fCos - f3, 2.0d) + java.lang.Math.pow(fSin - f4, 2.0d)) / 2.0d) * java.lang.Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - java.lang.Math.sqrt(java.lang.Math.pow((mPPointF.x + (((float) java.lang.Math.cos(d2)) * f)) - ((fCos + f3) / 2.0f), 2.0d) + java.lang.Math.pow((mPPointF.y + (((float) java.lang.Math.sin(d2)) * f)) - ((fSin + f4) / 2.0f), 2.0d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected float getSliceSpace(com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet) {
        int i;
        int i2;
        float f;
        float f2;
        boolean z;
        com.github.mikephil.charting.renderer.PieChartRenderer pieChartRenderer = this;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = pieChartRenderer.mChart.getRotationAngle();
        float phaseX = pieChartRenderer.mAnimator.getPhaseX();
        float phaseY = pieChartRenderer.mAnimator.getPhaseY();
        android.graphics.RectF circleBox = pieChartRenderer.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = pieChartRenderer.mChart.getDrawAngles();
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = pieChartRenderer.mChart.getCenterCircleBox();
        float radius = pieChartRenderer.mChart.getRadius();
        boolean z2 = pieChartRenderer.mChart.isDrawHoleEnabled() && !pieChartRenderer.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z2 ? (pieChartRenderer.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < entryCount; i4++) {
            if (java.lang.Math.abs(iPieDataSet2.getEntryForIndex(i4).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                i3++;
            }
        }
        float sliceSpace = i3 <= 1 ? 0.0f : pieChartRenderer.getSliceSpace(iPieDataSet2);
        int i5 = 0;
        float f3 = 0.0f;
        while (i5 < entryCount) {
            float f4 = drawAngles[i5];
            if (java.lang.Math.abs(iPieDataSet2.getEntryForIndex(i5).getY()) <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON || pieChartRenderer.mChart.needsHighlight(i5)) {
                i = i5;
                radius = radius;
                rotationAngle = rotationAngle;
                phaseX = phaseX;
                circleBox = circleBox;
                i2 = i3;
                holeRadius = holeRadius;
                centerCircleBox = centerCircleBox;
            } else {
                boolean z3 = sliceSpace > 0.0f && f4 <= 180.0f;
                pieChartRenderer.mRenderPaint.setColor(iPieDataSet2.getColor(i5));
                float f5 = i3 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f6 = rotationAngle + ((f3 + (f5 / 2.0f)) * phaseY);
                float f7 = (f4 - f5) * phaseY;
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                pieChartRenderer.mPathBuffer.reset();
                int i6 = i5;
                double d = f6 * 0.017453292f;
                float fCos = centerCircleBox.x + (((float) java.lang.Math.cos(d)) * radius);
                float fSin = centerCircleBox.y + (((float) java.lang.Math.sin(d)) * radius);
                if (f7 >= 360.0f && f7 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, radius, android.graphics.Path.Direction.CW);
                } else {
                    pieChartRenderer.mPathBuffer.moveTo(fCos, fSin);
                    pieChartRenderer.mPathBuffer.arcTo(circleBox, f6, f7);
                }
                float f8 = f7;
                pieChartRenderer.mInnerRectBuffer.set(centerCircleBox.x - holeRadius, centerCircleBox.y - holeRadius, centerCircleBox.x + holeRadius, centerCircleBox.y + holeRadius);
                if (z2) {
                    if (holeRadius > 0.0f || z3) {
                        if (z3) {
                            f2 = f8;
                            i = i6;
                            holeRadius = holeRadius;
                            z = true;
                            float fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f4 * phaseY, fCos, fSin, f6, f2);
                            if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                                fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                            }
                            holeRadius = java.lang.Math.max(holeRadius, fCalculateMinimumRadiusForSpacedSlice);
                        } else {
                            holeRadius = holeRadius;
                            f2 = f8;
                            z = true;
                            i = i6;
                        }
                        float f9 = (i2 == z || holeRadius == 0.0f) ? 0.0f : sliceSpace / (holeRadius * 0.017453292f);
                        float f10 = ((f3 + (f9 / 2.0f)) * phaseY) + rotationAngle;
                        float f11 = (f4 - f9) * phaseY;
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        float f12 = f10 + f11;
                        if (f7 >= 360.0f && f2 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                            pieChartRenderer = this;
                            pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, android.graphics.Path.Direction.CCW);
                        } else {
                            pieChartRenderer = this;
                            double d2 = f12 * 0.017453292f;
                            pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.x + (((float) java.lang.Math.cos(d2)) * holeRadius), centerCircleBox.y + (holeRadius * ((float) java.lang.Math.sin(d2))));
                            pieChartRenderer.mPathBuffer.arcTo(pieChartRenderer.mInnerRectBuffer, f12, -f11);
                        }
                        centerCircleBox = centerCircleBox;
                    } else {
                        f = 360.0f;
                        i = i6;
                    }
                    pieChartRenderer.mPathBuffer.close();
                    pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
                } else {
                    i = i6;
                    f = 360.0f;
                }
                if (f8 % f > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    if (z3) {
                        float fCalculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f4 * phaseY, fCos, fSin, f6, f8);
                        double d3 = (f6 + (f8 / 2.0f)) * 0.017453292f;
                        pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.x + (((float) java.lang.Math.cos(d3)) * fCalculateMinimumRadiusForSpacedSlice2), centerCircleBox.y + (fCalculateMinimumRadiusForSpacedSlice2 * ((float) java.lang.Math.sin(d3))));
                    } else {
                        pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                    }
                }
                pieChartRenderer.mPathBuffer.close();
                pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
            }
            f3 += f4 * phaseX;
            i5 = i + 1;
            iPieDataSet2 = iPieDataSet;
            centerCircleBox = centerCircleBox;
            i3 = i2;
            holeRadius = holeRadius;
            circleBox = circleBox;
            entryCount = entryCount;
            drawAngles = drawAngles;
            phaseX = phaseX;
            radius = radius;
            rotationAngle = rotationAngle;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        int i;
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> list;
        float f;
        float f2;
        float[] fArr;
        float[] fArr2;
        com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition;
        float f3;
        com.github.mikephil.charting.data.PieDataSet.ValuePosition valuePosition2;
        float f4;
        float f5;
        int i2;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet;
        float f6;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet2;
        float f7;
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = this.mChart.getHoleRadius() / 100.0f;
        float f8 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f8 = (radius - (radius * holeRadius)) / 2.0f;
        }
        float f9 = radius - f8;
        com.github.mikephil.charting.data.PieData pieData = (com.github.mikephil.charting.data.PieData) this.mChart.getData();
        java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float fConvertDpToPixel = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
        int i3 = 0;
        int i4 = 0;
        while (i4 < dataSets.size()) {
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet3 = dataSets.get(i4);
            boolean zIsDrawValuesEnabled = iPieDataSet3.isDrawValuesEnabled();
            if (zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) {
                com.github.mikephil.charting.data.PieDataSet.ValuePosition xValuePosition = iPieDataSet3.getXValuePosition();
                com.github.mikephil.charting.data.PieDataSet.ValuePosition yValuePosition = iPieDataSet3.getYValuePosition();
                applyValueTextStyle(iPieDataSet3);
                float fCalcTextHeight = com.github.mikephil.charting.utils.Utils.calcTextHeight(this.mValuePaint, "Q") + com.github.mikephil.charting.utils.Utils.convertDpToPixel(4.0f);
                com.github.mikephil.charting.formatter.IValueFormatter valueFormatter = iPieDataSet3.getValueFormatter();
                int entryCount = iPieDataSet3.getEntryCount();
                this.mValueLinePaint.setColor(iPieDataSet3.getValueLineColor());
                this.mValueLinePaint.setStrokeWidth(com.github.mikephil.charting.utils.Utils.convertDpToPixel(iPieDataSet3.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet3);
                com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iPieDataSet3.getIconsOffset());
                mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                int i5 = i3;
                int i6 = 0;
                while (i6 < entryCount) {
                    com.github.mikephil.charting.data.PieEntry entryForIndex = iPieDataSet3.getEntryForIndex(i6);
                    float f10 = (((i5 == 0 ? 0.0f : absoluteAngles[i5 - 1] * phaseX) + ((drawAngles[i5] - ((sliceSpace / (f9 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY) + rotationAngle;
                    int i7 = i6;
                    float y = this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY();
                    com.github.mikephil.charting.utils.MPPointF mPPointF2 = mPPointF;
                    double d = f10 * 0.017453292f;
                    int i8 = i4;
                    java.util.List<com.github.mikephil.charting.interfaces.datasets.IPieDataSet> list2 = dataSets;
                    float fCos = (float) java.lang.Math.cos(d);
                    float f11 = rotationAngle;
                    float[] fArr3 = drawAngles;
                    float fSin = (float) java.lang.Math.sin(d);
                    boolean z = zIsDrawEntryLabelsEnabled && xValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z2 = zIsDrawValuesEnabled && yValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    int i9 = entryCount;
                    boolean z3 = zIsDrawEntryLabelsEnabled && xValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
                    boolean z4 = zIsDrawValuesEnabled && yValuePosition == com.github.mikephil.charting.data.PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z || z2) {
                        float valueLinePart1Length = iPieDataSet3.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet3.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet3.getValueLinePart1OffsetPercentage() / 100.0f;
                        valuePosition = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f12 = radius * holeRadius;
                            f3 = ((radius - f12) * valueLinePart1OffsetPercentage) + f12;
                        } else {
                            f3 = radius * valueLinePart1OffsetPercentage;
                        }
                        float fAbs = iPieDataSet3.isValueLineVariableLength() ? valueLinePart2Length * f9 * ((float) java.lang.Math.abs(java.lang.Math.sin(d))) : valueLinePart2Length * f9;
                        float f13 = (f3 * fCos) + centerCircleBox.x;
                        float f14 = (f3 * fSin) + centerCircleBox.y;
                        float f15 = (valueLinePart1Length + 1.0f) * f9;
                        valuePosition2 = xValuePosition;
                        float f16 = (f15 * fCos) + centerCircleBox.x;
                        float f17 = (f15 * fSin) + centerCircleBox.y;
                        double d2 = ((double) f10) % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float f18 = f16 - fAbs;
                            this.mValuePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                            if (z) {
                                this.mEntryLabelsPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
                            }
                            f4 = f18;
                            f5 = f18 - fConvertDpToPixel;
                        } else {
                            f4 = f16 + fAbs;
                            this.mValuePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                            if (z) {
                                this.mEntryLabelsPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
                            }
                            f5 = f4 + fConvertDpToPixel;
                        }
                        if (iPieDataSet3.getValueLineColor() != 1122867) {
                            i2 = i7;
                            canvas.drawLine(f13, f14, f16, f17, this.mValueLinePaint);
                            canvas.drawLine(f16, f17, f4, f17, this.mValueLinePaint);
                        } else {
                            i2 = i7;
                        }
                        if (z && z2) {
                            iPieDataSet = iPieDataSet3;
                            f6 = fCos;
                            drawValue(canvas, valueFormatter, y, entryForIndex, 0, f5, f17, iPieDataSet3.getValueTextColor(i2));
                            if (i2 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                drawEntryLabel(canvas, entryForIndex.getLabel(), f5, f17 + fCalcTextHeight);
                            }
                        } else {
                            iPieDataSet = iPieDataSet3;
                            f6 = fCos;
                            float f19 = f5;
                            if (z) {
                                if (i2 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                    drawEntryLabel(canvas, entryForIndex.getLabel(), f19, f17 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z2) {
                                iPieDataSet2 = iPieDataSet;
                                drawValue(canvas, valueFormatter, y, entryForIndex, 0, f19, f17 + (fCalcTextHeight / 2.0f), iPieDataSet2.getValueTextColor(i2));
                            }
                        }
                        iPieDataSet2 = iPieDataSet;
                    } else {
                        valuePosition = yValuePosition;
                        valuePosition2 = xValuePosition;
                        iPieDataSet2 = iPieDataSet3;
                        f6 = fCos;
                        radius = radius;
                        mPPointF2 = mPPointF2;
                        i9 = i9;
                        absoluteAngles = absoluteAngles;
                        i2 = i7;
                    }
                    if (z3 || z4) {
                        float f20 = (f9 * f6) + centerCircleBox.x;
                        float f21 = (f9 * fSin) + centerCircleBox.y;
                        this.mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
                        if (z3 && z4) {
                            f7 = fSin;
                            drawValue(canvas, valueFormatter, y, entryForIndex, 0, f20, f21, iPieDataSet2.getValueTextColor(i2));
                            if (i2 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                drawEntryLabel(canvas, entryForIndex.getLabel(), f20, f21 + fCalcTextHeight);
                            }
                        } else {
                            f7 = fSin;
                            if (z3) {
                                if (i2 < pieData.getEntryCount() && entryForIndex.getLabel() != null) {
                                    drawEntryLabel(canvas, entryForIndex.getLabel(), f20, f21 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z4) {
                                drawValue(canvas, valueFormatter, y, entryForIndex, 0, f20, f21 + (fCalcTextHeight / 2.0f), iPieDataSet2.getValueTextColor(i2));
                            }
                        }
                    } else {
                        f7 = fSin;
                    }
                    if (entryForIndex.getIcon() != null && iPieDataSet2.isDrawIconsEnabled()) {
                        android.graphics.drawable.Drawable icon = entryForIndex.getIcon();
                        com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (((f9 + mPPointF2.y) * f6) + centerCircleBox.x), (int) (((f9 + mPPointF2.y) * f7) + centerCircleBox.y + mPPointF2.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i5++;
                    i6 = i2 + 1;
                    mPPointF = mPPointF2;
                    iPieDataSet3 = iPieDataSet2;
                    radius = radius;
                    entryCount = i9;
                    dataSets = list2;
                    i4 = i8;
                    rotationAngle = f11;
                    drawAngles = fArr3;
                    absoluteAngles = absoluteAngles;
                    xValuePosition = valuePosition2;
                    yValuePosition = valuePosition;
                }
                i = i4;
                list = dataSets;
                f = radius;
                f2 = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                i3 = i5;
            } else {
                i = i4;
                list = dataSets;
                f = radius;
                f2 = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
            }
            i4 = i + 1;
            radius = f;
            dataSets = list;
            rotationAngle = f2;
            drawAngles = fArr;
            absoluteAngles = fArr2;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    protected void drawEntryLabel(android.graphics.Canvas canvas, java.lang.String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (android.graphics.Paint) null);
        drawCenterText(canvas);
    }

    protected void drawHole(android.graphics.Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (android.graphics.Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
        }
        if (android.graphics.Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = radius * (this.mChart.getTransparentCircleRadius() / 100.0f);
            this.mTransparentCirclePaint.setAlpha((int) (alpha * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, transparentCircleRadius, android.graphics.Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, android.graphics.Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
    }

    protected void drawCenterText(android.graphics.Canvas canvas) {
        float radius;
        java.lang.CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        com.github.mikephil.charting.utils.MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f = centerCircleBox.x + centerTextOffset.x;
        float f2 = centerCircleBox.y + centerTextOffset.y;
        if (this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
        } else {
            radius = this.mChart.getRadius();
        }
        android.graphics.RectF rectF = this.mRectBuffer[0];
        rectF.left = f - radius;
        rectF.top = f2 - radius;
        rectF.right = f + radius;
        rectF.bottom = f2 + radius;
        android.graphics.RectF rectF2 = this.mRectBuffer[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            this.mCenterTextLayout = new android.text.StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) java.lang.Math.max(java.lang.Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), android.text.Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        if (android.os.Build.VERSION.SDK_INT >= 18) {
            android.graphics.Path path = this.mDrawCenterTextPathBuffer;
            path.reset();
            path.addOval(rectF, android.graphics.Path.Direction.CW);
            canvas.clipPath(path);
        }
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerTextOffset);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        android.graphics.RectF rectF;
        float f;
        com.github.mikephil.charting.interfaces.datasets.IPieDataSet dataSetByIndex;
        float f2;
        int i;
        int i2;
        float f3;
        float fCalculateMinimumRadiusForSpacedSlice;
        float fMax;
        float f4;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        android.graphics.RectF rectF2 = this.mDrawHighlightedRectF;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i3 = 0;
        while (i3 < highlightArr.length) {
            int x = (int) highlightArr[i3].getX();
            if (x < drawAngles.length && (dataSetByIndex = ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getDataSetByIndex(highlightArr[i3].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i4 = 0;
                for (int i5 = 0; i5 < entryCount; i5++) {
                    if (java.lang.Math.abs(dataSetByIndex.getEntryForIndex(i5).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        i4++;
                    }
                }
                if (x == 0) {
                    i = 1;
                    f2 = 0.0f;
                } else {
                    f2 = absoluteAngles[x - 1] * phaseX;
                    i = 1;
                }
                float sliceSpace = i4 <= i ? 0.0f : dataSetByIndex.getSliceSpace();
                float f5 = drawAngles[x];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f6 = radius + selectionShift;
                rectF2.set(this.mChart.getCircleBox());
                float f7 = -selectionShift;
                rectF2.inset(f7, f7);
                boolean z2 = sliceSpace > 0.0f && f5 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x));
                float f8 = i4 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f9 = i4 == 1 ? 0.0f : sliceSpace / (f6 * 0.017453292f);
                float f10 = rotationAngle + ((f2 + (f8 / 2.0f)) * phaseY);
                float f11 = (f5 - f8) * phaseY;
                float f12 = f11 < 0.0f ? 0.0f : f11;
                float f13 = ((f2 + (f9 / 2.0f)) * phaseY) + rotationAngle;
                float f14 = (f5 - f9) * phaseY;
                if (f14 < 0.0f) {
                    f14 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f12 >= 360.0f && f12 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, f6, android.graphics.Path.Direction.CW);
                } else {
                    double d = f13 * 0.017453292f;
                    this.mPathBuffer.moveTo(centerCircleBox.x + (((float) java.lang.Math.cos(d)) * f6), centerCircleBox.y + (f6 * ((float) java.lang.Math.sin(d))));
                    this.mPathBuffer.arcTo(rectF2, f13, f14);
                }
                if (z2) {
                    double d2 = f10 * 0.017453292f;
                    f3 = 0.0f;
                    rectF = rectF2;
                    i2 = 1;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f5 * phaseY, (((float) java.lang.Math.cos(d2)) * radius) + centerCircleBox.x, centerCircleBox.y + (((float) java.lang.Math.sin(d2)) * radius), f10, f12);
                } else {
                    rectF = rectF2;
                    i2 = 1;
                    f3 = 0.0f;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                this.mInnerRectBuffer.set(centerCircleBox.x - holeRadius, centerCircleBox.y - holeRadius, centerCircleBox.x + holeRadius, centerCircleBox.y + holeRadius);
                if (!z || (holeRadius <= f3 && !z2)) {
                    f = holeRadius;
                    if (f12 % 360.0f > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        if (z2) {
                            double d3 = (f10 + (f12 / 2.0f)) * 0.017453292f;
                            this.mPathBuffer.lineTo(centerCircleBox.x + (((float) java.lang.Math.cos(d3)) * fCalculateMinimumRadiusForSpacedSlice), centerCircleBox.y + (fCalculateMinimumRadiusForSpacedSlice * ((float) java.lang.Math.sin(d3))));
                        } else {
                            this.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                        }
                    }
                } else {
                    if (z2) {
                        if (fCalculateMinimumRadiusForSpacedSlice < f3) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = java.lang.Math.max(holeRadius, fCalculateMinimumRadiusForSpacedSlice);
                    }
                    if (i4 != i2) {
                        fMax = holeRadius;
                        if (fMax == f3) {
                            fMax = holeRadius;
                            f4 = 0.0f;
                        } else {
                            f4 = sliceSpace / (fMax * 0.017453292f);
                        }
                    } else {
                        fMax = holeRadius;
                        f4 = 0.0f;
                    }
                    float f15 = rotationAngle + ((f2 + (f4 / 2.0f)) * phaseY);
                    float f16 = (f5 - f4) * phaseY;
                    if (f16 < f3) {
                        f16 = 0.0f;
                    }
                    float f17 = f15 + f16;
                    if (f12 >= 360.0f && f12 % 360.0f <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, fMax, android.graphics.Path.Direction.CCW);
                        f = holeRadius;
                    } else {
                        double d4 = f17 * 0.017453292f;
                        f = holeRadius;
                        this.mPathBuffer.lineTo(centerCircleBox.x + (((float) java.lang.Math.cos(d4)) * fMax), centerCircleBox.y + (fMax * ((float) java.lang.Math.sin(d4))));
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f17, -f16);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                rectF = rectF2;
                f = holeRadius;
                phaseX = phaseX;
                drawAngles = drawAngles;
                absoluteAngles = absoluteAngles;
            }
            i3++;
            rectF2 = rectF;
            holeRadius = f;
            phaseX = phaseX;
            drawAngles = drawAngles;
            absoluteAngles = absoluteAngles;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawRoundedSlices(android.graphics.Canvas canvas) {
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            com.github.mikephil.charting.interfaces.datasets.IPieDataSet dataSet = ((com.github.mikephil.charting.data.PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                com.github.mikephil.charting.utils.MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i = 0;
                while (i < dataSet.getEntryCount()) {
                    float f = drawAngles[i];
                    if (java.lang.Math.abs(dataSet.getEntryForIndex(i).getY()) > com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) {
                        double d = radius - holeRadius;
                        double d2 = (rotationAngle + f) * phaseY;
                        float fCos = (float) (((double) centerCircleBox.x) + (java.lang.Math.cos(java.lang.Math.toRadians(d2)) * d));
                        float fSin = (float) ((d * java.lang.Math.sin(java.lang.Math.toRadians(d2))) + ((double) centerCircleBox.y));
                        this.mRenderPaint.setColor(dataSet.getColor(i));
                        this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                    }
                    rotationAngle += f * phaseX;
                    i++;
                    phaseY = phaseY;
                    drawAngles = drawAngles;
                }
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    public void releaseBitmap() {
        android.graphics.Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        java.lang.ref.WeakReference<android.graphics.Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            weakReference.get().recycle();
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
