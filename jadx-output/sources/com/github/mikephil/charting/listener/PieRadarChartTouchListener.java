package com.github.mikephil.charting.listener;

/* JADX INFO: loaded from: classes.dex */
public class PieRadarChartTouchListener extends com.github.mikephil.charting.listener.ChartTouchListener<com.github.mikephil.charting.charts.PieRadarChartBase<?>> {
    private java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample> _velocitySamples;
    private float mDecelerationAngularVelocity;
    private long mDecelerationLastTime;
    private float mStartAngle;
    private com.github.mikephil.charting.utils.MPPointF mTouchStartPoint;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        return true;
    }

    public PieRadarChartTouchListener(com.github.mikephil.charting.charts.PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.mTouchStartPoint = com.github.mikephil.charting.utils.MPPointF.getInstance(0.0f, 0.0f);
        this.mStartAngle = 0.0f;
        this._velocitySamples = new java.util.ArrayList<>();
        this.mDecelerationLastTime = 0L;
        this.mDecelerationAngularVelocity = 0.0f;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent) && ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                resetVelocity();
                if (((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x, y);
                }
                setGestureStartAngle(x, y);
                this.mTouchStartPoint.x = x;
                this.mTouchStartPoint.y = y;
            } else if (action == 1) {
                if (((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    sampleVelocity(x, y);
                    float fCalculateVelocity = calculateVelocity();
                    this.mDecelerationAngularVelocity = fCalculateVelocity;
                    if (fCalculateVelocity != 0.0f) {
                        this.mDecelerationLastTime = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x, y);
                }
                if (this.mTouchMode == 0 && distance(x, this.mTouchStartPoint.x, y, this.mTouchStartPoint.y) > com.github.mikephil.charting.utils.Utils.convertDpToPixel(8.0f)) {
                    this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.ROTATE;
                    this.mTouchMode = 6;
                    ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).disableScroll();
                } else if (this.mTouchMode == 6) {
                    updateGestureRotation(x, y);
                    ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        this.mLastGesture = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP;
        com.github.mikephil.charting.listener.OnChartGestureListener onChartGestureListener = ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    private void resetVelocity() {
        this._velocitySamples.clear();
    }

    private void sampleVelocity(float f, float f2) {
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this._velocitySamples.add(new com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample(jCurrentAnimationTimeMillis, ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getAngleForPoint(f, f2)));
        for (int size = this._velocitySamples.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this._velocitySamples.get(0).time > 1000; size--) {
            this._velocitySamples.remove(0);
        }
    }

    private float calculateVelocity() {
        if (this._velocitySamples.isEmpty()) {
            return 0.0f;
        }
        com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample angularVelocitySample = this._velocitySamples.get(0);
        java.util.ArrayList<com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample> arrayList = this._velocitySamples;
        com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample angularVelocitySample2 = arrayList.get(arrayList.size() - 1);
        com.github.mikephil.charting.listener.PieRadarChartTouchListener.AngularVelocitySample angularVelocitySample3 = angularVelocitySample;
        for (int size = this._velocitySamples.size() - 1; size >= 0; size--) {
            angularVelocitySample3 = this._velocitySamples.get(size);
            if (angularVelocitySample3.angle != angularVelocitySample2.angle) {
                break;
            }
        }
        float f = (angularVelocitySample2.time - angularVelocitySample.time) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        boolean z = angularVelocitySample2.angle >= angularVelocitySample3.angle;
        if (java.lang.Math.abs(angularVelocitySample2.angle - angularVelocitySample3.angle) > 270.0d) {
            z = !z;
        }
        if (angularVelocitySample2.angle - angularVelocitySample.angle > 180.0d) {
            angularVelocitySample.angle = (float) (((double) angularVelocitySample.angle) + 360.0d);
        } else if (angularVelocitySample.angle - angularVelocitySample2.angle > 180.0d) {
            angularVelocitySample2.angle = (float) (((double) angularVelocitySample2.angle) + 360.0d);
        }
        float fAbs = java.lang.Math.abs((angularVelocitySample2.angle - angularVelocitySample.angle) / f);
        return !z ? -fAbs : fAbs;
    }

    public void setGestureStartAngle(float f, float f2) {
        this.mStartAngle = ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    public void updateGestureRotation(float f, float f2) {
        ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).setRotationAngle(((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - this.mStartAngle);
    }

    public void stopDeceleration() {
        this.mDecelerationAngularVelocity = 0.0f;
    }

    public void computeScroll() {
        if (this.mDecelerationAngularVelocity == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        this.mDecelerationAngularVelocity *= ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
        ((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).setRotationAngle(((com.github.mikephil.charting.charts.PieRadarChartBase) this.mChart).getRotationAngle() + (this.mDecelerationAngularVelocity * ((jCurrentAnimationTimeMillis - this.mDecelerationLastTime) / 1000.0f)));
        this.mDecelerationLastTime = jCurrentAnimationTimeMillis;
        if (java.lang.Math.abs(this.mDecelerationAngularVelocity) >= 0.001d) {
            com.github.mikephil.charting.utils.Utils.postInvalidateOnAnimation(this.mChart);
        } else {
            stopDeceleration();
        }
    }

    private class AngularVelocitySample {
        public float angle;
        public long time;

        public AngularVelocitySample(long j, float f) {
            this.time = j;
            this.angle = f;
        }
    }
}
