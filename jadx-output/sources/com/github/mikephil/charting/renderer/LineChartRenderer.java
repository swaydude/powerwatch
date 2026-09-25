package com.github.mikephil.charting.renderer;

/* JADX INFO: loaded from: classes.dex */
public class LineChartRenderer extends com.github.mikephil.charting.renderer.LineRadarRenderer {
    protected android.graphics.Path cubicFillPath;
    protected android.graphics.Path cubicPath;
    protected android.graphics.Canvas mBitmapCanvas;
    protected android.graphics.Bitmap.Config mBitmapConfig;
    protected com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider mChart;
    protected android.graphics.Paint mCirclePaintInner;
    private float[] mCirclesBuffer;
    protected java.lang.ref.WeakReference<android.graphics.Bitmap> mDrawBitmap;
    protected android.graphics.Path mGenerateFilledPathBuffer;
    private java.util.HashMap<com.github.mikephil.charting.interfaces.datasets.IDataSet, com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache> mImageCaches;
    private float[] mLineBuffer;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public LineChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider lineDataProvider, com.github.mikephil.charting.animation.ChartAnimator chartAnimator, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        this.cubicPath = new android.graphics.Path();
        this.cubicFillPath = new android.graphics.Path();
        this.mLineBuffer = new float[4];
        this.mGenerateFilledPathBuffer = new android.graphics.Path();
        this.mImageCaches = new java.util.HashMap<>();
        this.mCirclesBuffer = new float[2];
        this.mChart = lineDataProvider;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(android.graphics.Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        java.lang.ref.WeakReference<android.graphics.Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.mDrawBitmap.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.mDrawBitmap = new java.lang.ref.WeakReference<>(android.graphics.Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig));
            this.mBitmapCanvas = new android.graphics.Canvas(this.mDrawBitmap.get());
        }
        this.mDrawBitmap.get().eraseColor(0);
        for (T t : this.mChart.getLineData().getDataSets()) {
            if (t.isVisible()) {
                drawDataSet(canvas, t);
            }
        }
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, this.mRenderPaint);
    }

    protected void drawDataSet(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        if (iLineDataSet.getEntryCount() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
        int i = com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[iLineDataSet.getMode().ordinal()];
        if (i == 3) {
            drawCubicBezier(iLineDataSet);
        } else if (i != 4) {
            drawLinear(canvas, iLineDataSet);
        } else {
            drawHorizontalBezier(iLineDataSet);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.renderer.LineChartRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode;

        static {
            int[] iArr = new int[com.github.mikephil.charting.data.LineDataSet.Mode.values().length];
            $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode = iArr;
            try {
                iArr[com.github.mikephil.charting.data.LineDataSet.Mode.LINEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[com.github.mikephil.charting.data.LineDataSet.Mode.CUBIC_BEZIER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$data$LineDataSet$Mode[com.github.mikephil.charting.data.LineDataSet.Mode.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawHorizontalBezier(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        this.cubicPath.reset();
        if (this.mXBounds.range >= 1) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min);
            this.cubicPath.moveTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
            int i = this.mXBounds.min + 1;
            ?? r2 = entryForIndex;
            while (i <= this.mXBounds.range + this.mXBounds.min) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i);
                float x = r2.getX() + ((entryForIndex2.getX() - r2.getX()) / 2.0f);
                this.cubicPath.cubicTo(x, r2.getY() * phaseY, x, entryForIndex2.getY() * phaseY, entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                i++;
                r2 = entryForIndex2;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicBezier(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, this.mAnimator.getPhaseX()));
        float phaseY = this.mAnimator.getPhaseY();
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        this.mXBounds.set(this.mChart, iLineDataSet);
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.cubicPath.reset();
        if (this.mXBounds.range >= 1) {
            int i = this.mXBounds.min + 1;
            int i2 = this.mXBounds.min;
            int i3 = this.mXBounds.range;
            java.lang.Object entryForIndex = iLineDataSet.getEntryForIndex(java.lang.Math.max(i - 2, 0));
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(java.lang.Math.max(i - 1, 0));
            int i4 = -1;
            if (entryForIndex2 != 0) {
                this.cubicPath.moveTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
                int i5 = this.mXBounds.min + 1;
                ?? r3 = entryForIndex2;
                ?? r2 = entryForIndex2;
                ?? r4 = entryForIndex;
                while (true) {
                    ?? entryForIndex3 = r2;
                    if (i5 > this.mXBounds.range + this.mXBounds.min) {
                        break;
                    }
                    if (i4 != i5) {
                        entryForIndex3 = iLineDataSet.getEntryForIndex(i5);
                    }
                    int i6 = i5 + 1;
                    if (i6 < iLineDataSet.getEntryCount()) {
                        i5 = i6;
                    }
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i5);
                    this.cubicPath.cubicTo(r3.getX() + ((entryForIndex3.getX() - r4.getX()) * cubicIntensity), (r3.getY() + ((entryForIndex3.getY() - r4.getY()) * cubicIntensity)) * phaseY, entryForIndex3.getX() - ((entryForIndex4.getX() - r3.getX()) * cubicIntensity), (entryForIndex3.getY() - ((entryForIndex4.getY() - r3.getY()) * cubicIntensity)) * phaseY, entryForIndex3.getX(), entryForIndex3.getY() * phaseY);
                    r4 = r3;
                    r3 = entryForIndex3;
                    r2 = entryForIndex4;
                    int i7 = i5;
                    i5 = i6;
                    i4 = i7;
                }
            } else {
                return;
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, this.mXBounds);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCubicFill(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, android.graphics.Path path, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min + xBounds.range).getX(), fillLinePosition);
        path.lineTo(iLineDataSet.getEntryForIndex(xBounds.min).getX(), fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v23, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawLinear(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        int i = zIsDrawSteppedEnabled ? 4 : 2;
        com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        android.graphics.Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        this.mXBounds.set(this.mChart, iLineDataSet);
        if (iLineDataSet.isDrawFilledEnabled() && entryCount > 0) {
            drawLinearFill(canvas, iLineDataSet, transformer, this.mXBounds);
        }
        if (iLineDataSet.getColors().size() > 1) {
            int i2 = i * 2;
            if (this.mLineBuffer.length <= i2) {
                this.mLineBuffer = new float[i * 4];
            }
            for (int i3 = this.mXBounds.min; i3 <= this.mXBounds.range + this.mXBounds.min; i3++) {
                ?? entryForIndex = iLineDataSet.getEntryForIndex(i3);
                if (entryForIndex != 0) {
                    this.mLineBuffer[0] = entryForIndex.getX();
                    this.mLineBuffer[1] = entryForIndex.getY() * phaseY;
                    if (i3 < this.mXBounds.max) {
                        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3 + 1);
                        if (entryForIndex2 == 0) {
                            break;
                        }
                        if (zIsDrawSteppedEnabled) {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            float[] fArr = this.mLineBuffer;
                            fArr[3] = fArr[1];
                            fArr[4] = fArr[2];
                            fArr[5] = fArr[3];
                            fArr[6] = entryForIndex2.getX();
                            this.mLineBuffer[7] = entryForIndex2.getY() * phaseY;
                        } else {
                            this.mLineBuffer[2] = entryForIndex2.getX();
                            this.mLineBuffer[3] = entryForIndex2.getY() * phaseY;
                        }
                    } else {
                        float[] fArr2 = this.mLineBuffer;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mLineBuffer[0])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mLineBuffer[2]) && (this.mViewPortHandler.isInBoundsTop(this.mLineBuffer[1]) || this.mViewPortHandler.isInBoundsBottom(this.mLineBuffer[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i3));
                        canvas2.drawLines(this.mLineBuffer, 0, i2, this.mRenderPaint);
                    }
                }
            }
        } else {
            int i4 = entryCount * i;
            if (this.mLineBuffer.length < java.lang.Math.max(i4, i) * 2) {
                this.mLineBuffer = new float[java.lang.Math.max(i4, i) * 4];
            }
            if (iLineDataSet.getEntryForIndex(this.mXBounds.min) != 0) {
                int i5 = this.mXBounds.min;
                int i6 = 0;
                while (i5 <= this.mXBounds.range + this.mXBounds.min) {
                    ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i5 == 0 ? 0 : i5 - 1);
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i5);
                    if (entryForIndex3 != 0 && entryForIndex4 != 0) {
                        int i7 = i6 + 1;
                        this.mLineBuffer[i6] = entryForIndex3.getX();
                        int i8 = i7 + 1;
                        this.mLineBuffer[i7] = entryForIndex3.getY() * phaseY;
                        if (zIsDrawSteppedEnabled) {
                            int i9 = i8 + 1;
                            this.mLineBuffer[i8] = entryForIndex4.getX();
                            int i10 = i9 + 1;
                            this.mLineBuffer[i9] = entryForIndex3.getY() * phaseY;
                            int i11 = i10 + 1;
                            this.mLineBuffer[i10] = entryForIndex4.getX();
                            i8 = i11 + 1;
                            this.mLineBuffer[i11] = entryForIndex3.getY() * phaseY;
                        }
                        int i12 = i8 + 1;
                        this.mLineBuffer[i8] = entryForIndex4.getX();
                        this.mLineBuffer[i12] = entryForIndex4.getY() * phaseY;
                        i6 = i12 + 1;
                    }
                    i5++;
                }
                if (i6 > 0) {
                    transformer.pointValuesToPixel(this.mLineBuffer);
                    int iMax = java.lang.Math.max((this.mXBounds.range + 1) * i, i) * 2;
                    this.mRenderPaint.setColor(iLineDataSet.getColor());
                    canvas2.drawLines(this.mLineBuffer, 0, iMax, this.mRenderPaint);
                }
            }
        }
        this.mRenderPaint.setPathEffect(null);
    }

    protected void drawLinearFill(android.graphics.Canvas canvas, com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, com.github.mikephil.charting.utils.Transformer transformer, com.github.mikephil.charting.renderer.BarLineScatterCandleBubbleRenderer.XBounds xBounds) {
        int i;
        int i2;
        android.graphics.Path path = this.mGenerateFilledPathBuffer;
        int i3 = xBounds.min;
        int i4 = xBounds.range + xBounds.min;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                generateFilledPath(iLineDataSet, i, i2, path);
                transformer.pathValueToPixel(path);
                android.graphics.drawable.Drawable fillDrawable = iLineDataSet.getFillDrawable();
                if (fillDrawable != null) {
                    drawFilledPath(canvas, path, fillDrawable);
                } else {
                    drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
                }
            }
            i5++;
        } while (i <= i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.github.mikephil.charting.data.Entry] */
    private void generateFilledPath(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, int i, int i2, android.graphics.Path path) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseY = this.mAnimator.getPhaseY();
        boolean z = iLineDataSet.getMode() == com.github.mikephil.charting.data.LineDataSet.Mode.STEPPED;
        path.reset();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i);
        path.moveTo(entryForIndex.getX(), fillLinePosition);
        path.lineTo(entryForIndex.getX(), entryForIndex.getY() * phaseY);
        int i3 = i + 1;
        ?? r3 = 0;
        while (true) {
            ?? r4 = r3;
            if (i3 > i2) {
                break;
            }
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i3);
            if (z && r4 != 0) {
                path.lineTo(entryForIndex2.getX(), r4.getY() * phaseY);
            }
            path.lineTo(entryForIndex2.getX(), entryForIndex2.getY() * phaseY);
            i3++;
            r3 = entryForIndex2;
        }
        if (r3 != 0) {
            path.lineTo(r3.getX(), fillLinePosition);
        }
        path.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(android.graphics.Canvas canvas) {
        if (isDrawingValuesAllowed(this.mChart)) {
            java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
            for (int i = 0; i < dataSets.size(); i++) {
                com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) dataSets.get(i);
                if (shouldDrawValues(iLineDataSet)) {
                    applyValueTextStyle(iLineDataSet);
                    com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int i2 = circleRadius;
                    this.mXBounds.set(this.mChart, iLineDataSet);
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                    com.github.mikephil.charting.utils.MPPointF mPPointF = com.github.mikephil.charting.utils.MPPointF.getInstance(iLineDataSet.getIconsOffset());
                    mPPointF.x = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.x);
                    mPPointF.y = com.github.mikephil.charting.utils.Utils.convertDpToPixel(mPPointF.y);
                    int i3 = 0;
                    while (i3 < fArrGenerateTransformedValuesLine.length) {
                        float f = fArrGenerateTransformedValuesLine[i3];
                        float f2 = fArrGenerateTransformedValuesLine[i3 + 1];
                        if (!this.mViewPortHandler.isInBoundsRight(f)) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(f) && this.mViewPortHandler.isInBoundsY(f2)) {
                            int i4 = i3 / 2;
                            ?? entryForIndex = iLineDataSet.getEntryForIndex(this.mXBounds.min + i4);
                            if (iLineDataSet.isDrawValuesEnabled()) {
                                drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getY(), entryForIndex, i, f, f2 - i2, iLineDataSet.getValueTextColor(i4));
                            }
                            if (entryForIndex.getIcon() != null && iLineDataSet.isDrawIconsEnabled()) {
                                android.graphics.drawable.Drawable icon = entryForIndex.getIcon();
                                com.github.mikephil.charting.utils.Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                            }
                        } else {
                            i3 = i3;
                            mPPointF = mPPointF;
                        }
                        i3 += 2;
                        mPPointF = mPPointF;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(android.graphics.Canvas canvas) {
        drawCircles(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [com.github.mikephil.charting.data.Entry] */
    protected void drawCircles(android.graphics.Canvas canvas) {
        com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache dataSetImageCache;
        android.graphics.Bitmap bitmap;
        this.mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
        float phaseY = this.mAnimator.getPhaseY();
        float[] fArr = this.mCirclesBuffer;
        char c = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        java.util.List<T> dataSets = this.mChart.getLineData().getDataSets();
        int i = 0;
        while (i < dataSets.size()) {
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) dataSets.get(i);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                com.github.mikephil.charting.utils.Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                this.mXBounds.set(this.mChart, iLineDataSet);
                float circleRadius = iLineDataSet.getCircleRadius();
                float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
                boolean z = iLineDataSet.isDrawCircleHoleEnabled() && circleHoleRadius < circleRadius && circleHoleRadius > f;
                boolean z2 = z && iLineDataSet.getCircleHoleColor() == 1122867;
                com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1 anonymousClass1 = null;
                if (this.mImageCaches.containsKey(iLineDataSet)) {
                    dataSetImageCache = this.mImageCaches.get(iLineDataSet);
                } else {
                    dataSetImageCache = new com.github.mikephil.charting.renderer.LineChartRenderer.DataSetImageCache(this, anonymousClass1);
                    this.mImageCaches.put(iLineDataSet, dataSetImageCache);
                }
                if (dataSetImageCache.init(iLineDataSet)) {
                    dataSetImageCache.fill(iLineDataSet, z, z2);
                }
                int i2 = this.mXBounds.range + this.mXBounds.min;
                int i3 = this.mXBounds.min;
                while (i3 <= i2) {
                    ?? entryForIndex = iLineDataSet.getEntryForIndex(i3);
                    if (entryForIndex == 0) {
                        break;
                    }
                    this.mCirclesBuffer[c] = entryForIndex.getX();
                    this.mCirclesBuffer[1] = entryForIndex.getY() * phaseY;
                    transformer.pointValuesToPixel(this.mCirclesBuffer);
                    if (!this.mViewPortHandler.isInBoundsRight(this.mCirclesBuffer[c])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.mCirclesBuffer[c]) && this.mViewPortHandler.isInBoundsY(this.mCirclesBuffer[1]) && (bitmap = dataSetImageCache.getBitmap(i3)) != null) {
                        float[] fArr2 = this.mCirclesBuffer;
                        canvas.drawBitmap(bitmap, fArr2[c] - circleRadius, fArr2[1] - circleRadius, (android.graphics.Paint) null);
                    }
                    i3++;
                    c = 0;
                }
            }
            i++;
            c = 0;
            f = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(android.graphics.Canvas canvas, com.github.mikephil.charting.highlight.Highlight[] highlightArr) {
        com.github.mikephil.charting.data.LineData lineData = this.mChart.getLineData();
        for (com.github.mikephil.charting.highlight.Highlight highlight : highlightArr) {
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) lineData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                ?? entryForXValue = iLineDataSet.getEntryForXValue(highlight.getX(), highlight.getY());
                if (isInBoundsX(entryForXValue, iLineDataSet)) {
                    com.github.mikephil.charting.utils.MPPointD pixelForValues = this.mChart.getTransformer(iLineDataSet.getAxisDependency()).getPixelForValues(entryForXValue.getX(), entryForXValue.getY() * this.mAnimator.getPhaseY());
                    highlight.setDraw((float) pixelForValues.x, (float) pixelForValues.y);
                    drawHighlightLines(canvas, (float) pixelForValues.x, (float) pixelForValues.y, iLineDataSet);
                }
            }
        }
    }

    public void setBitmapConfig(android.graphics.Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }

    public android.graphics.Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
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

    private class DataSetImageCache {
        private android.graphics.Bitmap[] circleBitmaps;
        private android.graphics.Path mCirclePathBuffer;

        private DataSetImageCache() {
            this.mCirclePathBuffer = new android.graphics.Path();
        }

        /* synthetic */ DataSetImageCache(com.github.mikephil.charting.renderer.LineChartRenderer lineChartRenderer, com.github.mikephil.charting.renderer.LineChartRenderer.AnonymousClass1 anonymousClass1) {
            this();
        }

        protected boolean init(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            android.graphics.Bitmap[] bitmapArr = this.circleBitmaps;
            if (bitmapArr == null) {
                this.circleBitmaps = new android.graphics.Bitmap[circleColorCount];
                return true;
            }
            if (bitmapArr.length == circleColorCount) {
                return false;
            }
            this.circleBitmaps = new android.graphics.Bitmap[circleColorCount];
            return true;
        }

        protected void fill(com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet, boolean z, boolean z2) {
            int circleColorCount = iLineDataSet.getCircleColorCount();
            float circleRadius = iLineDataSet.getCircleRadius();
            float circleHoleRadius = iLineDataSet.getCircleHoleRadius();
            for (int i = 0; i < circleColorCount; i++) {
                int i2 = (int) (((double) circleRadius) * 2.1d);
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i2, i2, android.graphics.Bitmap.Config.ARGB_4444);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                this.circleBitmaps[i] = bitmapCreateBitmap;
                com.github.mikephil.charting.renderer.LineChartRenderer.this.mRenderPaint.setColor(iLineDataSet.getCircleColor(i));
                if (z2) {
                    this.mCirclePathBuffer.reset();
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleRadius, android.graphics.Path.Direction.CW);
                    this.mCirclePathBuffer.addCircle(circleRadius, circleRadius, circleHoleRadius, android.graphics.Path.Direction.CCW);
                    canvas.drawPath(this.mCirclePathBuffer, com.github.mikephil.charting.renderer.LineChartRenderer.this.mRenderPaint);
                } else {
                    canvas.drawCircle(circleRadius, circleRadius, circleRadius, com.github.mikephil.charting.renderer.LineChartRenderer.this.mRenderPaint);
                    if (z) {
                        canvas.drawCircle(circleRadius, circleRadius, circleHoleRadius, com.github.mikephil.charting.renderer.LineChartRenderer.this.mCirclePaintInner);
                    }
                }
            }
        }

        protected android.graphics.Bitmap getBitmap(int i) {
            android.graphics.Bitmap[] bitmapArr = this.circleBitmaps;
            return bitmapArr[i % bitmapArr.length];
        }
    }
}
