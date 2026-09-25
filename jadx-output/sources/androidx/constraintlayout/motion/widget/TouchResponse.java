package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
class TouchResponse {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "TouchResponse";
    private float mLastTouchX;
    private float mLastTouchY;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}};
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private int mTouchAnchorSide = 0;
    private int mTouchSide = 0;
    private int mOnTouchUp = 0;
    private int mTouchAnchorId = -1;
    private int mTouchRegionId = -1;
    private float mTouchAnchorY = 0.5f;
    private float mTouchAnchorX = 0.5f;
    private float mTouchDirectionX = 0.0f;
    private float mTouchDirectionY = 1.0f;
    private boolean mDragStarted = false;
    private float[] mAnchorDpDt = new float[2];
    private float mMaxVelocity = 4.0f;
    private float mMaxAcceleration = 1.2f;
    private boolean mMoveWhenScrollAtTop = true;
    private float mDragScale = 1.0f;

    TouchResponse(android.content.Context context, androidx.constraintlayout.motion.widget.MotionLayout motionLayout, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.mMotionLayout = motionLayout;
        fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
    }

    private void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.OnSwipe);
        fill(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void fill(android.content.res.TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = typedArray.getResourceId(index, this.mTouchAnchorId);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.mTouchAnchorSide);
                this.mTouchAnchorSide = i2;
                float[][] fArr = TOUCH_SIDES;
                this.mTouchAnchorX = fArr[i2][0];
                this.mTouchAnchorY = fArr[i2][1];
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.mTouchSide);
                this.mTouchSide = i3;
                float[][] fArr2 = TOUCH_DIRECTION;
                this.mTouchDirectionX = fArr2[i3][0];
                this.mTouchDirectionY = fArr2[i3][1];
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = typedArray.getFloat(index, this.mMaxVelocity);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = typedArray.getFloat(index, this.mMaxAcceleration);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = typedArray.getBoolean(index, this.mMoveWhenScrollAtTop);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_dragScale) {
                this.mDragScale = typedArray.getFloat(index, this.mDragScale);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = typedArray.getResourceId(index, this.mTouchRegionId);
            } else if (index == androidx.constraintlayout.widget.R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = typedArray.getInt(index, this.mOnTouchUp);
            }
        }
    }

    void setUpTouchEvent(float f, float f2) {
        this.mLastTouchX = f;
        this.mLastTouchY = f2;
        this.mDragStarted = false;
    }

    void processTouchEvent(android.view.MotionEvent motionEvent, android.view.VelocityTracker velocityTracker, int i, androidx.constraintlayout.motion.widget.MotionScene motionScene) {
        float f;
        int i2;
        float f2;
        velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
            return;
        }
        if (action == 1) {
            this.mDragStarted = false;
            velocityTracker.computeCurrentVelocity(1000);
            float xVelocity = velocityTracker.getXVelocity();
            float yVelocity = velocityTracker.getYVelocity();
            float progress = this.mMotionLayout.getProgress();
            int i3 = this.mTouchAnchorId;
            if (i3 != -1) {
                this.mMotionLayout.getAnchorDpDt(i3, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float fMin = java.lang.Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr = this.mAnchorDpDt;
                fArr[0] = fMin;
                fArr[1] = fMin;
            }
            float f3 = this.mTouchDirectionX;
            float[] fArr2 = this.mAnchorDpDt;
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            if (f3 != 0.0f) {
                f = xVelocity / fArr2[0];
            } else {
                f = yVelocity / fArr2[1];
            }
            if (!java.lang.Float.isNaN(f)) {
                progress += f / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = this.mOnTouchUp) == 3) {
                return;
            }
            this.mMotionLayout.touchAnimateTo(i2, ((double) progress) < 0.5d ? 0.0f : 1.0f, f);
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.mLastTouchY;
        float rawX = motionEvent.getRawX() - this.mLastTouchX;
        if (java.lang.Math.abs((this.mTouchDirectionX * rawX) + (this.mTouchDirectionY * rawY)) > 10.0f || this.mDragStarted) {
            float progress2 = this.mMotionLayout.getProgress();
            if (!this.mDragStarted) {
                this.mDragStarted = true;
                this.mMotionLayout.setProgress(progress2);
            }
            int i4 = this.mTouchAnchorId;
            if (i4 != -1) {
                this.mMotionLayout.getAnchorDpDt(i4, progress2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float fMin2 = java.lang.Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr3 = this.mAnchorDpDt;
                fArr3[0] = fMin2;
                fArr3[1] = fMin2;
            }
            float f6 = this.mTouchDirectionX;
            float[] fArr4 = this.mAnchorDpDt;
            if (java.lang.Math.abs(((f6 * fArr4[0]) + (this.mTouchDirectionY * fArr4[1])) * this.mDragScale) < 0.01d) {
                float[] fArr5 = this.mAnchorDpDt;
                fArr5[0] = 0.01f;
                fArr5[1] = 0.01f;
            }
            if (this.mTouchDirectionX != 0.0f) {
                f2 = rawX / this.mAnchorDpDt[0];
            } else {
                f2 = rawY / this.mAnchorDpDt[1];
            }
            float fMax = java.lang.Math.max(java.lang.Math.min(progress2 + f2, 1.0f), 0.0f);
            if (fMax != this.mMotionLayout.getProgress()) {
                this.mMotionLayout.setProgress(fMax);
                velocityTracker.computeCurrentVelocity(1000);
                this.mMotionLayout.mLastVelocity = this.mTouchDirectionX != 0.0f ? velocityTracker.getXVelocity() / this.mAnchorDpDt[0] : velocityTracker.getYVelocity() / this.mAnchorDpDt[1];
            } else {
                this.mMotionLayout.mLastVelocity = 0.0f;
            }
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
        }
    }

    void setDown(float f, float f2) {
        this.mLastTouchX = f;
        this.mLastTouchY = f2;
    }

    float getProgressDirection(float f, float f2) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f3 = this.mTouchDirectionX;
        if (f3 != 0.0f) {
            float[] fArr = this.mAnchorDpDt;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.mAnchorDpDt;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.mTouchDirectionY) / fArr2[1];
    }

    void scrollUp(float f, float f2) {
        float f3;
        this.mDragStarted = false;
        float progress = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f4 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f5 = fArr[0];
        float f6 = this.mTouchDirectionY;
        float f7 = fArr[1];
        if (f4 != 0.0f) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!java.lang.Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z = progress != 1.0f;
            int i = this.mOnTouchUp;
            if ((i != 3) && z) {
                this.mMotionLayout.touchAnimateTo(i, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f3);
            }
        }
    }

    void scrollMove(float f, float f2) {
        float f3;
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f4 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (java.lang.Math.abs((f4 * fArr[0]) + (this.mTouchDirectionY * fArr[1])) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.mTouchDirectionX;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.mAnchorDpDt[0];
        } else {
            f3 = (f2 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
        }
        float fMax = java.lang.Math.max(java.lang.Math.min(progress + f3, 1.0f), 0.0f);
        if (fMax != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(fMax);
        }
    }

    void setupTouch() {
        android.view.View viewFindViewById = this.mMotionLayout.findViewById(this.mTouchAnchorId);
        if (viewFindViewById == null) {
            android.util.Log.w(TAG, " cannot find view to handle touch");
        }
        if (viewFindViewById instanceof androidx.core.widget.NestedScrollView) {
            androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new androidx.core.widget.NestedScrollView.OnScrollChangeListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(androidx.core.widget.NestedScrollView nestedScrollView2, int i, int i2, int i3, int i4) {
                }
            });
        }
    }

    public void setAnchorId(int i) {
        this.mTouchAnchorId = i;
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public void setTouchAnchorLocation(float f, float f2) {
        this.mTouchAnchorX = f;
        this.mTouchAnchorY = f2;
    }

    public void setMaxVelocity(float f) {
        this.mMaxVelocity = f;
    }

    public void setMaxAcceleration(float f) {
        this.mMaxAcceleration = f;
    }

    float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    android.graphics.RectF getTouchRegion(android.view.ViewGroup viewGroup, android.graphics.RectF rectF) {
        android.view.View viewFindViewById;
        int i = this.mTouchRegionId;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    float dot(float f, float f2) {
        return (f * this.mTouchDirectionX) + (f2 * this.mTouchDirectionY);
    }

    public java.lang.String toString() {
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }
}
