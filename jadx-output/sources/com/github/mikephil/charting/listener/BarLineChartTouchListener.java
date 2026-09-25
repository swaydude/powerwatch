package com.github.mikephil.charting.listener;

/* JADX INFO: loaded from: classes.dex */
public class BarLineChartTouchListener extends com.github.mikephil.charting.listener.ChartTouchListener<com.github.mikephil.charting.charts.BarLineChartBase<? extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>>> {
    private com.github.mikephil.charting.interfaces.datasets.IDataSet mClosestDataSetToTouch;
    private com.github.mikephil.charting.utils.MPPointF mDecelerationCurrentPoint;
    private long mDecelerationLastTime;
    private com.github.mikephil.charting.utils.MPPointF mDecelerationVelocity;
    private float mDragTriggerDist;
    private android.graphics.Matrix mMatrix;
    private float mMinScalePointerDistance;
    private float mSavedDist;
    private android.graphics.Matrix mSavedMatrix;
    private float mSavedXDist;
    private float mSavedYDist;
    private com.github.mikephil.charting.utils.MPPointF mTouchPointCenter;
    private com.github.mikephil.charting.utils.MPPointF mTouchStartPoint;
    private android.view.VelocityTracker mVelocityTracker;

    public BarLineChartTouchListener(com.github.mikephil.charting.charts.BarLineChartBase<? extends com.github.mikephil.charting.data.BarLineScatterCandleBubbleData<? extends com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet<? extends com.github.mikephil.charting.data.Entry>>> barLineChartBase, android.graphics.Matrix matrix, float f) {
        super(barLineChartBase);
        this.mMatrix = new android.graphics.Matrix();
        this.mSavedMatrix = new android.graphics.Matrix();
        this.mTouchStartPoint = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mTouchPointCenter = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mSavedXDist = 1.0f;
        this.mSavedYDist = 1.0f;
        this.mSavedDist = 1.0f;
        this.mDecelerationLastTime = 0L;
        this.mDecelerationCurrentPoint = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mDecelerationVelocity = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mMatrix = matrix;
        this.mDragTriggerDist = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
        this.mMinScalePointerDistance = com.github.mikephil.charting.utils.Utils.convertDpToPixel(3.5f);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        if (this.mTouchMode == 0) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (!((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragEnabled() && !((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() && !((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                android.view.VelocityTracker velocityTracker2 = this.mVelocityTracker;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, com.github.mikephil.charting.utils.Utils.getMaximumFlingVelocity());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((java.lang.Math.abs(xVelocity) > com.github.mikephil.charting.utils.Utils.getMinimumFlingVelocity() || java.lang.Math.abs(yVelocity) > com.github.mikephil.charting.utils.Utils.getMinimumFlingVelocity()) && this.mTouchMode == 1 && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    this.mDecelerationLastTime = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    this.mDecelerationCurrentPoint.x = motionEvent.getX();
                    this.mDecelerationCurrentPoint.y = motionEvent.getY();
                    this.mDecelerationVelocity.x = xVelocity;
                    this.mDecelerationVelocity.y = yVelocity;
                    com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
                }
                if (this.mTouchMode == 2 || this.mTouchMode == 3 || this.mTouchMode == 4 || this.mTouchMode == 5) {
                    ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).calculateOffsets();
                    ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).postInvalidate();
                }
                this.mTouchMode = 0;
                ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).enableScroll();
                android.view.VelocityTracker velocityTracker3 = this.mVelocityTracker;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.mVelocityTracker = null;
                }
                endAction(motionEvent);
            } else if (action != 2) {
                if (action == 3) {
                    this.mTouchMode = 0;
                    endAction(motionEvent);
                } else if (action != 5) {
                    if (action == 6) {
                        com.github.mikephil.charting.utils.Utils.velocityTrackerPointerUpCleanUpIfNecessary(motionEvent, this.mVelocityTracker);
                        this.mTouchMode = 5;
                    }
                } else if (motionEvent.getPointerCount() >= 2) {
                    ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).disableScroll();
                    saveTouchStart(motionEvent);
                    this.mSavedXDist = getXDist(motionEvent);
                    this.mSavedYDist = getYDist(motionEvent);
                    float fSpacing = spacing(motionEvent);
                    this.mSavedDist = fSpacing;
                    if (fSpacing > 10.0f) {
                        if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isPinchZoomEnabled()) {
                            this.mTouchMode = 4;
                        } else if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() != ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
                            this.mTouchMode = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() ? 2 : 3;
                        } else {
                            this.mTouchMode = this.mSavedXDist > this.mSavedYDist ? 2 : 3;
                        }
                    }
                    midPoint(this.mTouchPointCenter, motionEvent);
                }
            } else if (this.mTouchMode == 1) {
                ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).disableScroll();
                performDrag(motionEvent, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragXEnabled() ? motionEvent.getX() - this.mTouchStartPoint.x : 0.0f, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragYEnabled() ? motionEvent.getY() - this.mTouchStartPoint.y : 0.0f);
            } else if (this.mTouchMode == 2 || this.mTouchMode == 3 || this.mTouchMode == 4) {
                ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).disableScroll();
                if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() || ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    performZoom(motionEvent);
                }
            } else if (this.mTouchMode == 0 && java.lang.Math.abs(distance(motionEvent.getX(), this.mTouchStartPoint.x, motionEvent.getY(), this.mTouchStartPoint.y)) > this.mDragTriggerDist && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragEnabled()) {
                if ((((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isFullyZoomedOut() && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).hasNoDragOffset()) ? false : true) {
                    float fAbs = java.lang.Math.abs(motionEvent.getX() - this.mTouchStartPoint.x);
                    float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.mTouchStartPoint.y);
                    if ((((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragXEnabled() || fAbs2 >= fAbs) && (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragYEnabled() || fAbs2 <= fAbs)) {
                        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG;
                        this.mTouchMode = 1;
                    }
                } else if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG;
                    if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isHighlightPerDragEnabled()) {
                        performHighlightDrag(motionEvent);
                    }
                }
            }
        } else {
            startAction(motionEvent);
            stopDeceleration();
            saveTouchStart(motionEvent);
        }
        this.mMatrix = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, true);
        return true;
    }

    private void saveTouchStart(android.view.MotionEvent motionEvent) {
        this.mSavedMatrix.set(this.mMatrix);
        this.mTouchStartPoint.x = motionEvent.getX();
        this.mTouchStartPoint.y = motionEvent.getY();
        this.mClosestDataSetToTouch = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private void performDrag(android.view.MotionEvent motionEvent, float f, float f2) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG;
        this.mMatrix.set(this.mSavedMatrix);
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (inverted()) {
            if (this.mChart instanceof com.github.mikephil.charting.charts.HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.mMatrix.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, f, f2);
        }
    }

    private void performZoom(android.view.MotionEvent motionEvent) {
        boolean zCanZoomInMoreY;
        boolean zCanZoomInMoreX;
        boolean zCanZoomInMoreX2;
        boolean zCanZoomInMoreY2;
        if (motionEvent.getPointerCount() >= 2) {
            com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
            float fSpacing = spacing(motionEvent);
            if (fSpacing > this.mMinScalePointerDistance) {
                com.github.mikephil.charting.utils.MPPointF trans = getTrans(this.mTouchPointCenter.x, this.mTouchPointCenter.y);
                com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler();
                if (this.mTouchMode == 4) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f = fSpacing / this.mSavedDist;
                    boolean z = f < 1.0f;
                    if (z) {
                        zCanZoomInMoreX2 = viewPortHandler.canZoomOutMoreX();
                    } else {
                        zCanZoomInMoreX2 = viewPortHandler.canZoomInMoreX();
                    }
                    if (z) {
                        zCanZoomInMoreY2 = viewPortHandler.canZoomOutMoreY();
                    } else {
                        zCanZoomInMoreY2 = viewPortHandler.canZoomInMoreY();
                    }
                    float f2 = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() ? f : 1.0f;
                    float f3 = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled() ? f : 1.0f;
                    if (zCanZoomInMoreY2 || zCanZoomInMoreX2) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(f2, f3, trans.x, trans.y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, f2, f3);
                        }
                    }
                } else if (this.mTouchMode == 2 && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled()) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.X_ZOOM;
                    float xDist = getXDist(motionEvent) / this.mSavedXDist;
                    if (xDist < 1.0f) {
                        zCanZoomInMoreX = viewPortHandler.canZoomOutMoreX();
                    } else {
                        zCanZoomInMoreX = viewPortHandler.canZoomInMoreX();
                    }
                    if (zCanZoomInMoreX) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(xDist, 1.0f, trans.x, trans.y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, xDist, 1.0f);
                        }
                    }
                } else if (this.mTouchMode == 3 && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled()) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.Y_ZOOM;
                    float yDist = getYDist(motionEvent) / this.mSavedYDist;
                    if (yDist < 1.0f) {
                        zCanZoomInMoreY = viewPortHandler.canZoomOutMoreY();
                    } else {
                        zCanZoomInMoreY = viewPortHandler.canZoomInMoreY();
                    }
                    if (zCanZoomInMoreY) {
                        this.mMatrix.set(this.mSavedMatrix);
                        this.mMatrix.postScale(1.0f, yDist, trans.x, trans.y);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.onChartScale(motionEvent, 1.0f, yDist);
                        }
                    }
                }
                com.github.mikephil.charting.utils.MPPointF.recycleInstance(trans);
            }
        }
    }

    private void performHighlightDrag(android.view.MotionEvent motionEvent) {
        com.github.mikephil.charting.highlight.Highlight highlightByTouchPoint = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        if (highlightByTouchPoint == null || highlightByTouchPoint.equalTo(this.mLastHighlighted)) {
            return;
        }
        this.mLastHighlighted = highlightByTouchPoint;
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).highlightValue(highlightByTouchPoint, true);
    }

    private static void midPoint(com.github.mikephil.charting.utils.MPPointF mPPointF, android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX(0) + motionEvent.getX(1);
        float y = motionEvent.getY(0) + motionEvent.getY(1);
        mPPointF.x = x / 2.0f;
        mPPointF.y = y / 2.0f;
    }

    private static float spacing(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x * x) + (y * y));
    }

    private static float getXDist(android.view.MotionEvent motionEvent) {
        return java.lang.Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float getYDist(android.view.MotionEvent motionEvent) {
        return java.lang.Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    public com.github.mikephil.charting.utils.MPPointF getTrans(float f, float f2) {
        float f3;
        com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler();
        float fOffsetLeft = f - viewPortHandler.offsetLeft();
        if (inverted()) {
            f3 = -(f2 - viewPortHandler.offsetTop());
        } else {
            f3 = -((((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getMeasuredHeight() - f2) - viewPortHandler.offsetBottom());
        }
        return com.github.mikephil.charting.utils.MPPointF.getInstance(fOffsetLeft, f3);
    }

    private boolean inverted() {
        return (this.mClosestDataSetToTouch == null && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isAnyAxisInverted()) || (this.mClosestDataSetToTouch != null && ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isInverted(this.mClosestDataSetToTouch.getAxisDependency()));
    }

    public android.graphics.Matrix getMatrix() {
        return this.mMatrix;
    }

    public void setDragTriggerDist(float f) {
        this.mDragTriggerDist = com.github.mikephil.charting.utils.Utils.convertDpToPixel(f);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DOUBLE_TAP;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDoubleTapToZoomEnabled() && ((com.github.mikephil.charting.data.BarLineScatterCandleBubbleData) ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getData()).getEntryCount() > 0) {
            com.github.mikephil.charting.utils.MPPointF trans = getTrans(motionEvent.getX(), motionEvent.getY());
            ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).zoom(((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleXEnabled() ? 1.4f : 1.0f, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isScaleYEnabled() ? 1.4f : 1.0f, trans.x, trans.y);
            if (((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isLogEnabled()) {
                android.util.Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + trans.x + ", y: " + trans.y);
            }
            com.github.mikephil.charting.utils.MPPointF.recycleInstance(trans);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.FLING;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void stopDeceleration() {
        this.mDecelerationVelocity.x = 0.0f;
        this.mDecelerationVelocity.y = 0.0f;
    }

    public void computeScroll() {
        if (this.mDecelerationVelocity.x == 0.0f && this.mDecelerationVelocity.y == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationVelocity.x *= ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        this.mDecelerationVelocity.y *= ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f = (jCurrentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f;
        float f2 = this.mDecelerationVelocity.x * f;
        float f3 = this.mDecelerationVelocity.y * f;
        this.mDecelerationCurrentPoint.x += f2;
        this.mDecelerationCurrentPoint.y += f3;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, this.mDecelerationCurrentPoint.x, this.mDecelerationCurrentPoint.y, 0);
        performDrag(motionEventObtain, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragXEnabled() ? this.mDecelerationCurrentPoint.x - this.mTouchStartPoint.x : 0.0f, ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).isDragYEnabled() ? this.mDecelerationCurrentPoint.y - this.mTouchStartPoint.y : 0.0f);
        motionEventObtain.recycle();
        this.mMatrix = ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).getViewPortHandler().refresh(this.mMatrix, this.mChart, false);
        this.mDecelerationLastTime = jCurrentAnimationTimeMillis;
        if (java.lang.Math.abs(this.mDecelerationVelocity.x) >= 0.01d || java.lang.Math.abs(this.mDecelerationVelocity.y) >= 0.01d) {
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
            return;
        }
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).calculateOffsets();
        ((com.github.mikephil.charting.charts.BarLineChartBase) this.mChart).postInvalidate();
        stopDeceleration();
    }
}
