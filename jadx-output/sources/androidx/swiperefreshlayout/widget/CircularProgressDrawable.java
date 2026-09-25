package androidx.swiperefreshlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private android.animation.Animator mAnimator;
    boolean mFinishing;
    private android.content.res.Resources mResources;
    private final androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring mRing;
    private float mRotation;
    float mRotationCount;
    private static final android.view.animation.Interpolator LINEAR_INTERPOLATOR = new android.view.animation.LinearInterpolator();
    private static final android.view.animation.Interpolator MATERIAL_INTERPOLATOR = new androidx.interpolator.view.animation.FastOutSlowInInterpolator();
    private static final int[] COLORS = {androidx.core.view.ViewCompat.MEASURED_STATE_MASK};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    private int evaluateColorChange(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CircularProgressDrawable(android.content.Context context) {
        this.mResources = ((android.content.Context) androidx.core.util.Preconditions.checkNotNull(context)).getResources();
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = new androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring();
        this.mRing = ring;
        ring.setColors(COLORS);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.mRing;
        float f5 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f2 * f5);
        ring.setCenterRadius(f * f5);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f3 * f5, f4 * f5);
    }

    public void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(CENTER_RADIUS_LARGE, STROKE_WIDTH_LARGE, 12.0f, 6.0f);
        } else {
            setSizeParameters(CENTER_RADIUS, STROKE_WIDTH, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public float getStrokeWidth() {
        return this.mRing.getStrokeWidth();
    }

    public void setStrokeWidth(float f) {
        this.mRing.setStrokeWidth(f);
        invalidateSelf();
    }

    public float getCenterRadius() {
        return this.mRing.getCenterRadius();
    }

    public void setCenterRadius(float f) {
        this.mRing.setCenterRadius(f);
        invalidateSelf();
    }

    public void setStrokeCap(android.graphics.Paint.Cap cap) {
        this.mRing.setStrokeCap(cap);
        invalidateSelf();
    }

    public android.graphics.Paint.Cap getStrokeCap() {
        return this.mRing.getStrokeCap();
    }

    public float getArrowWidth() {
        return this.mRing.getArrowWidth();
    }

    public float getArrowHeight() {
        return this.mRing.getArrowHeight();
    }

    public void setArrowDimensions(float f, float f2) {
        this.mRing.setArrowDimensions(f, f2);
        invalidateSelf();
    }

    public boolean getArrowEnabled() {
        return this.mRing.getShowArrow();
    }

    public void setArrowEnabled(boolean z) {
        this.mRing.setShowArrow(z);
        invalidateSelf();
    }

    public float getArrowScale() {
        return this.mRing.getArrowScale();
    }

    public void setArrowScale(float f) {
        this.mRing.setArrowScale(f);
        invalidateSelf();
    }

    public float getStartTrim() {
        return this.mRing.getStartTrim();
    }

    public float getEndTrim() {
        return this.mRing.getEndTrim();
    }

    public void setStartEndTrim(float f, float f2) {
        this.mRing.setStartTrim(f);
        this.mRing.setEndTrim(f2);
        invalidateSelf();
    }

    public float getProgressRotation() {
        return this.mRing.getRotation();
    }

    public void setProgressRotation(float f) {
        this.mRing.setRotation(f);
        invalidateSelf();
    }

    public int getBackgroundColor() {
        return this.mRing.getBackgroundColor();
    }

    public void setBackgroundColor(int i) {
        this.mRing.setBackgroundColor(i);
        invalidateSelf();
    }

    public int[] getColorSchemeColors() {
        return this.mRing.getColors();
    }

    public void setColorSchemeColors(int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mRing.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    private void setRotation(float f) {
        this.mRotation = f;
    }

    private float getRotation() {
        return this.mRotation;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666L);
            this.mAnimator.start();
        } else {
            this.mRing.setColorIndex(0);
            this.mRing.resetOriginals();
            this.mAnimator.setDuration(1332L);
            this.mAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    void updateRingColor(float f, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring) {
        if (f > COLOR_CHANGE_OFFSET) {
            ring.setColor(evaluateColorChange((f - COLOR_CHANGE_OFFSET) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
        } else {
            ring.setColor(ring.getStartingColor());
        }
    }

    private void applyFinishTranslation(float f, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring) {
        updateRingColor(f, ring);
        float fFloor = (float) (java.lang.Math.floor(ring.getStartingRotation() / MAX_PROGRESS_ARC) + 1.0d);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - MIN_PROGRESS_ARC) - ring.getStartingStartTrim()) * f));
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + ((fFloor - ring.getStartingRotation()) * f));
    }

    void applyTransformation(float f, androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.mFinishing) {
            applyFinishTranslation(f, ring);
            return;
        }
        if (f != 1.0f || z) {
            float startingRotation = ring.getStartingRotation();
            if (f < SHRINK_OFFSET) {
                float f2 = f / SHRINK_OFFSET;
                interpolation = ring.getStartingStartTrim();
                interpolation2 = (MATERIAL_INTERPOLATOR.getInterpolation(f2) * 0.79f) + MIN_PROGRESS_ARC + interpolation;
            } else {
                float f3 = (f - SHRINK_OFFSET) / SHRINK_OFFSET;
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                interpolation = startingStartTrim - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation(f3)) * 0.79f) + MIN_PROGRESS_ARC);
                interpolation2 = startingStartTrim;
            }
            float f4 = startingRotation + (RING_ROTATION * f);
            float f5 = (f + this.mRotationCount) * GROUP_FULL_ROTATION;
            ring.setStartTrim(interpolation);
            ring.setEndTrim(interpolation2);
            ring.setRotation(f4);
            setRotation(f5);
        }
    }

    private void setupAnimators() {
        final androidx.swiperefreshlayout.widget.CircularProgressDrawable.Ring ring = this.mRing;
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.updateRingColor(fFloatValue, ring);
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.applyTransformation(fFloatValue, ring, false);
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(LINEAR_INTERPOLATOR);
        valueAnimatorOfFloat.addListener(new android.animation.Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.mRotationCount = 0.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.applyTransformation(1.0f, ring, true);
                ring.storeOriginals();
                ring.goToNextColor();
                if (androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.mFinishing) {
                    androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.mFinishing = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    ring.setShowArrow(false);
                    return;
                }
                androidx.swiperefreshlayout.widget.CircularProgressDrawable.this.mRotationCount += 1.0f;
            }
        });
        this.mAnimator = valueAnimatorOfFloat;
    }

    private static class Ring {
        int mAlpha;
        android.graphics.Path mArrow;
        int mArrowHeight;
        final android.graphics.Paint mArrowPaint;
        float mArrowScale;
        int mArrowWidth;
        final android.graphics.Paint mCirclePaint;
        int mColorIndex;
        int[] mColors;
        int mCurrentColor;
        float mEndTrim;
        final android.graphics.Paint mPaint;
        float mRingCenterRadius;
        float mRotation;
        boolean mShowArrow;
        float mStartTrim;
        float mStartingEndTrim;
        float mStartingRotation;
        float mStartingStartTrim;
        float mStrokeWidth;
        final android.graphics.RectF mTempBounds = new android.graphics.RectF();

        Ring() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.mPaint = paint;
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.mArrowPaint = paint2;
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.mCirclePaint = paint3;
            this.mStartTrim = 0.0f;
            this.mEndTrim = 0.0f;
            this.mRotation = 0.0f;
            this.mStrokeWidth = 5.0f;
            this.mArrowScale = 1.0f;
            this.mAlpha = 255;
            paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint2.setStyle(android.graphics.Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void setArrowDimensions(float f, float f2) {
            this.mArrowWidth = (int) f;
            this.mArrowHeight = (int) f2;
        }

        void setStrokeCap(android.graphics.Paint.Cap cap) {
            this.mPaint.setStrokeCap(cap);
        }

        android.graphics.Paint.Cap getStrokeCap() {
            return this.mPaint.getStrokeCap();
        }

        float getArrowWidth() {
            return this.mArrowWidth;
        }

        float getArrowHeight() {
            return this.mArrowHeight;
        }

        void draw(android.graphics.Canvas canvas, android.graphics.Rect rect) {
            android.graphics.RectF rectF = this.mTempBounds;
            float f = this.mRingCenterRadius;
            float fMin = (this.mStrokeWidth / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (java.lang.Math.min(rect.width(), rect.height()) / 2.0f) - java.lang.Math.max((this.mArrowWidth * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.mStartTrim;
            float f3 = this.mRotation;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.mEndTrim + f3) * 360.0f) - f4;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f6 = this.mStrokeWidth / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.mPaint);
            drawTriangle(canvas, f4, f5, rectF);
        }

        void drawTriangle(android.graphics.Canvas canvas, float f, float f2, android.graphics.RectF rectF) {
            if (this.mShowArrow) {
                android.graphics.Path path = this.mArrow;
                if (path == null) {
                    android.graphics.Path path2 = new android.graphics.Path();
                    this.mArrow = path2;
                    path2.setFillType(android.graphics.Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = java.lang.Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.mArrowWidth * this.mArrowScale) / 2.0f;
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0f);
                android.graphics.Path path3 = this.mArrow;
                float f4 = this.mArrowWidth;
                float f5 = this.mArrowScale;
                path3.lineTo((f4 * f5) / 2.0f, this.mArrowHeight * f5);
                this.mArrow.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.mStrokeWidth / 2.0f));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }

        void setColors(int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        int[] getColors() {
            return this.mColors;
        }

        void setColor(int i) {
            this.mCurrentColor = i;
        }

        void setBackgroundColor(int i) {
            this.mCirclePaint.setColor(i);
        }

        int getBackgroundColor() {
            return this.mCirclePaint.getColor();
        }

        void setColorIndex(int i) {
            this.mColorIndex = i;
            this.mCurrentColor = this.mColors[i];
        }

        int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        void setColorFilter(android.graphics.ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        void setAlpha(int i) {
            this.mAlpha = i;
        }

        int getAlpha() {
            return this.mAlpha;
        }

        void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
            this.mPaint.setStrokeWidth(f);
        }

        float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        void setStartTrim(float f) {
            this.mStartTrim = f;
        }

        float getStartTrim() {
            return this.mStartTrim;
        }

        float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        void setEndTrim(float f) {
            this.mEndTrim = f;
        }

        float getEndTrim() {
            return this.mEndTrim;
        }

        void setRotation(float f) {
            this.mRotation = f;
        }

        float getRotation() {
            return this.mRotation;
        }

        void setCenterRadius(float f) {
            this.mRingCenterRadius = f;
        }

        float getCenterRadius() {
            return this.mRingCenterRadius;
        }

        void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
            }
        }

        boolean getShowArrow() {
            return this.mShowArrow;
        }

        void setArrowScale(float f) {
            if (f != this.mArrowScale) {
                this.mArrowScale = f;
            }
        }

        float getArrowScale() {
            return this.mArrowScale;
        }

        float getStartingRotation() {
            return this.mStartingRotation;
        }

        void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }

        void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }
    }
}
