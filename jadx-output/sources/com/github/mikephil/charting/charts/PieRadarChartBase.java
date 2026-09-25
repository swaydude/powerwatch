package com.github.mikephil.charting.charts;

/* JADX INFO: loaded from: classes.dex */
public abstract class PieRadarChartBase<T extends com.github.mikephil.charting.data.ChartData<? extends com.github.mikephil.charting.interfaces.datasets.IDataSet<? extends com.github.mikephil.charting.data.Entry>>> extends com.github.mikephil.charting.charts.Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;

    @Override // com.github.mikephil.charting.charts.Chart
    protected void calcMinMax() {
    }

    public abstract int getIndexForAngle(float f);

    public abstract float getRadius();

    protected abstract float getRequiredBaseOffset();

    protected abstract float getRequiredLegendOffset();

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    public PieRadarChartBase(android.content.Context context) {
        super(context);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void init() {
        super.init();
        this.mChartTouchListener = new com.github.mikephil.charting.listener.PieRadarChartTouchListener(this);
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.mTouchEnabled && this.mChartTouchListener != null) {
            return this.mChartTouchListener.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mChartTouchListener instanceof com.github.mikephil.charting.listener.PieRadarChartTouchListener) {
            ((com.github.mikephil.charting.listener.PieRadarChartTouchListener) this.mChartTouchListener).computeScroll();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float requiredBaseOffset3;
        float fConvertDpToPixel;
        float fMin;
        float f;
        float f2;
        float requiredBaseOffset4 = 0.0f;
        if (this.mLegend == null || !this.mLegend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            requiredBaseOffset3 = 0.0f;
        } else {
            float fMin2 = java.lang.Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent());
            int i = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
            if (i == 1) {
                if (this.mLegend.getHorizontalAlignment() != com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT) {
                    fConvertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.CENTER) {
                    fConvertDpToPixel = fMin2 + com.github.mikephil.charting.utils.Utils.convertDpToPixel(13.0f);
                } else {
                    fConvertDpToPixel = fMin2 + com.github.mikephil.charting.utils.Utils.convertDpToPixel(8.0f);
                    float f3 = this.mLegend.mNeededHeight + this.mLegend.mTextHeightMax;
                    com.github.mikephil.charting.utils.MPPointF center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - fConvertDpToPixel) + 15.0f : fConvertDpToPixel - 15.0f;
                    float f4 = f3 + 15.0f;
                    float fDistanceToCenter = distanceToCenter(width, f4);
                    com.github.mikephil.charting.utils.MPPointF position = getPosition(center, getRadius(), getAngleForPoint(width, f4));
                    float fDistanceToCenter2 = distanceToCenter(position.x, position.y);
                    float fConvertDpToPixel2 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(5.0f);
                    if (f4 < center.y || getHeight() - fConvertDpToPixel <= getWidth()) {
                        fConvertDpToPixel = fDistanceToCenter < fDistanceToCenter2 ? fConvertDpToPixel2 + (fDistanceToCenter2 - fDistanceToCenter) : 0.0f;
                    }
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(center);
                    com.github.mikephil.charting.utils.MPPointF.recycleInstance(position);
                }
                int i2 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        f = 0.0f;
                    } else if (i2 == 3) {
                        int i3 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                        if (i3 == 1) {
                            fMin = java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                            f2 = fMin;
                            fConvertDpToPixel = 0.0f;
                            f = 0.0f;
                            requiredBaseOffset4 += getRequiredBaseOffset();
                            requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                            requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                            requiredBaseOffset2 = f + getRequiredBaseOffset();
                        } else if (i3 == 2) {
                            fMin = java.lang.Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                            f = fMin;
                            fConvertDpToPixel = 0.0f;
                        }
                    }
                    f2 = 0.0f;
                    requiredBaseOffset4 += getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                    requiredBaseOffset2 = f + getRequiredBaseOffset();
                } else {
                    requiredBaseOffset4 = fConvertDpToPixel;
                }
                fConvertDpToPixel = 0.0f;
                f = 0.0f;
                f2 = 0.0f;
                requiredBaseOffset4 += getRequiredBaseOffset();
                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                requiredBaseOffset2 = f + getRequiredBaseOffset();
            } else {
                if (i == 2 && (this.mLegend.getVerticalAlignment() == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM)) {
                    fMin = java.lang.Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                    int i4 = com.github.mikephil.charting.charts.PieRadarChartBase.AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            f = fMin;
                            fConvertDpToPixel = 0.0f;
                        }
                        f2 = 0.0f;
                    } else {
                        f2 = fMin;
                        fConvertDpToPixel = 0.0f;
                        f = 0.0f;
                    }
                    requiredBaseOffset4 += getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                    requiredBaseOffset2 = f + getRequiredBaseOffset();
                }
                fConvertDpToPixel = 0.0f;
                f = 0.0f;
                f2 = 0.0f;
                requiredBaseOffset4 += getRequiredBaseOffset();
                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                requiredBaseOffset2 = f + getRequiredBaseOffset();
            }
        }
        float fConvertDpToPixel3 = com.github.mikephil.charting.utils.Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof com.github.mikephil.charting.charts.RadarChart) {
            com.github.mikephil.charting.components.XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fConvertDpToPixel3 = java.lang.Math.max(fConvertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        float extraTopOffset = requiredBaseOffset3 + getExtraTopOffset();
        float extraRightOffset = requiredBaseOffset + getExtraRightOffset();
        float extraBottomOffset = requiredBaseOffset2 + getExtraBottomOffset();
        float fMax = java.lang.Math.max(fConvertDpToPixel3, requiredBaseOffset4 + getExtraLeftOffset());
        float fMax2 = java.lang.Math.max(fConvertDpToPixel3, extraTopOffset);
        float fMax3 = java.lang.Math.max(fConvertDpToPixel3, extraRightOffset);
        float fMax4 = java.lang.Math.max(fConvertDpToPixel3, java.lang.Math.max(getRequiredBaseOffset(), extraBottomOffset));
        this.mViewPortHandler.restrainViewPort(fMax, fMax2, fMax3, fMax4);
        if (this.mLogEnabled) {
            android.util.Log.i(com.github.mikephil.charting.charts.Chart.LOG_TAG, "offsetLeft: " + fMax + ", offsetTop: " + fMax2 + ", offsetRight: " + fMax3 + ", offsetBottom: " + fMax4);
        }
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[com.github.mikephil.charting.components.Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr2;
            try {
                iArr2[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public float getAngleForPoint(float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.x;
        double d2 = f2 - centerOffsets.y;
        float degrees = (float) java.lang.Math.toDegrees(java.lang.Math.acos(d2 / java.lang.Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.x) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        return f3;
    }

    public com.github.mikephil.charting.utils.MPPointF getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2) {
        com.github.mikephil.charting.utils.MPPointF mPPointF2 = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f, f2, mPPointF2);
        return mPPointF2;
    }

    public void getPosition(com.github.mikephil.charting.utils.MPPointF mPPointF, float f, float f2, com.github.mikephil.charting.utils.MPPointF mPPointF2) {
        double d = f;
        double d2 = f2;
        mPPointF2.x = (float) (((double) mPPointF.x) + (java.lang.Math.cos(java.lang.Math.toRadians(d2)) * d));
        mPPointF2.y = (float) (((double) mPPointF.y) + (d * java.lang.Math.sin(java.lang.Math.toRadians(d2))));
    }

    public float distanceToCenter(float f, float f2) {
        float f3;
        float f4;
        com.github.mikephil.charting.utils.MPPointF centerOffsets = getCenterOffsets();
        if (f > centerOffsets.x) {
            f3 = f - centerOffsets.x;
        } else {
            f3 = centerOffsets.x - f;
        }
        if (f2 > centerOffsets.y) {
            f4 = f2 - centerOffsets.y;
        } else {
            f4 = centerOffsets.y - f2;
        }
        float fSqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(f3, 2.0d) + java.lang.Math.pow(f4, 2.0d));
        com.github.mikephil.charting.utils.MPPointF.recycleInstance(centerOffsets);
        return fSqrt;
    }

    public void setRotationAngle(float f) {
        this.mRawRotationAngle = f;
        this.mRotationAngle = com.github.mikephil.charting.utils.Utils.getNormalizedAngle(f);
    }

    public float getRawRotationAngle() {
        return this.mRawRotationAngle;
    }

    public float getRotationAngle() {
        return this.mRotationAngle;
    }

    public void setRotationEnabled(boolean z) {
        this.mRotateEnabled = z;
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public float getDiameter() {
        android.graphics.RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left += getExtraLeftOffset();
        contentRect.top += getExtraTopOffset();
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return java.lang.Math.min(contentRect.width(), contentRect.height());
    }

    public void spin(int i, float f, float f2, com.github.mikephil.charting.animation.Easing.EasingOption easingOption) {
        if (android.os.Build.VERSION.SDK_INT < 11) {
            return;
        }
        setRotationAngle(f);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "rotationAngle", f, f2);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.setInterpolator(com.github.mikephil.charting.animation.Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.PieRadarChartBase.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.github.mikephil.charting.charts.PieRadarChartBase.this.postInvalidate();
            }
        });
        objectAnimatorOfFloat.start();
    }
}
