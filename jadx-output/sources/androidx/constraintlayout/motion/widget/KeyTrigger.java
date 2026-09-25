package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyTrigger extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 5;
    static final java.lang.String NAME = "KeyTrigger";
    private static final java.lang.String TAG = "KeyTrigger";
    private java.lang.reflect.Method mFireCross;
    private float mFireLastPos;
    private java.lang.reflect.Method mFireNegativeCross;
    private java.lang.reflect.Method mFirePositiveCross;
    private int mCurveFit = -1;
    private java.lang.String mCross = null;
    private int mTriggerReceiver = UNSET;
    private java.lang.String mNegativeCross = null;
    private java.lang.String mPositiveCross = null;
    private int mTriggerID = UNSET;
    private int mTriggerCollisionId = UNSET;
    private android.view.View mTriggerCollisionView = null;
    float mTriggerSlack = 0.1f;
    private boolean mFireCrossReset = true;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    private boolean mPostLayout = false;
    android.graphics.RectF mCollisionRect = new android.graphics.RectF();
    android.graphics.RectF mTargetRect = new android.graphics.RectF();

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String str, java.lang.Object obj) {
    }

    public KeyTrigger() {
        this.mType = 5;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyTrigger.Loader.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyTrigger), context);
    }

    int getCurveFit() {
        return this.mCurveFit;
    }

    private void setUpRect(android.graphics.RectF rectF, android.view.View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    public void conditionallyFire(float f, android.view.View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4;
        boolean z5 = true;
        if (this.mTriggerCollisionId != UNSET) {
            if (this.mTriggerCollisionView == null) {
                this.mTriggerCollisionView = ((android.view.ViewGroup) view.getParent()).findViewById(this.mTriggerCollisionId);
            }
            setUpRect(this.mCollisionRect, this.mTriggerCollisionView, this.mPostLayout);
            setUpRect(this.mTargetRect, view, this.mPostLayout);
            if (this.mCollisionRect.intersect(this.mTargetRect)) {
                if (this.mFireCrossReset) {
                    this.mFireCrossReset = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.mFirePositiveReset) {
                    this.mFirePositiveReset = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.mFireNegativeReset = true;
                z5 = z4;
                z3 = false;
            } else {
                if (this.mFireCrossReset) {
                    z = false;
                } else {
                    this.mFireCrossReset = true;
                    z = true;
                }
                if (this.mFireNegativeReset) {
                    this.mFireNegativeReset = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.mFirePositiveReset = true;
                z5 = false;
            }
        } else {
            if (this.mFireCrossReset) {
                float f6 = this.mFireThreshold;
                if ((f - f6) * (this.mFireLastPos - f6) < 0.0f) {
                    this.mFireCrossReset = false;
                    z = true;
                }
                if (this.mFireNegativeReset) {
                    f4 = this.mFireThreshold;
                    f5 = f - f4;
                    if ((this.mFireLastPos - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.mFireNegativeReset = false;
                        z2 = true;
                    }
                    if (this.mFirePositiveReset) {
                        f2 = this.mFireThreshold;
                        f3 = f - f2;
                        if ((this.mFireLastPos - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z5 = false;
                        } else {
                            this.mFirePositiveReset = false;
                        }
                        z3 = z2;
                    } else {
                        if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                            this.mFirePositiveReset = true;
                        }
                        z3 = z2;
                        z5 = false;
                    }
                } else if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFireNegativeReset = true;
                }
                z2 = false;
                if (this.mFirePositiveReset) {
                    f2 = this.mFireThreshold;
                    f3 = f - f2;
                    if ((this.mFireLastPos - f2) * f3 < 0.0f) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z2;
                } else {
                    if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                        this.mFirePositiveReset = true;
                    }
                    z3 = z2;
                    z5 = false;
                }
            } else if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireCrossReset = true;
            }
            z = false;
            if (this.mFireNegativeReset) {
                f4 = this.mFireThreshold;
                f5 = f - f4;
                if ((this.mFireLastPos - f4) * f5 >= 0.0f) {
                }
                if (this.mFirePositiveReset) {
                    f2 = this.mFireThreshold;
                    f3 = f - f2;
                    if ((this.mFireLastPos - f2) * f3 < 0.0f) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z2;
                } else {
                    if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                        this.mFirePositiveReset = true;
                    }
                    z3 = z2;
                    z5 = false;
                }
            } else if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                this.mFireNegativeReset = true;
            }
            z2 = false;
            if (this.mFirePositiveReset) {
                f2 = this.mFireThreshold;
                f3 = f - f2;
                if ((this.mFireLastPos - f2) * f3 < 0.0f) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                z3 = z2;
            } else {
                if (java.lang.Math.abs(f - this.mFireThreshold) > this.mTriggerSlack) {
                    this.mFirePositiveReset = true;
                }
                z3 = z2;
                z5 = false;
            }
        }
        this.mFireLastPos = f;
        if (z3 || z || z5) {
            ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).fireTrigger(this.mTriggerID, z5, f);
        }
        if (this.mTriggerReceiver != UNSET) {
            view = ((androidx.constraintlayout.motion.widget.MotionLayout) view.getParent()).findViewById(this.mTriggerReceiver);
        }
        if (z3 && this.mNegativeCross != null) {
            if (this.mFireNegativeCross == null) {
                try {
                    this.mFireNegativeCross = view.getClass().getMethod(this.mNegativeCross, new java.lang.Class[0]);
                } catch (java.lang.NoSuchMethodException unused) {
                    android.util.Log.e("KeyTrigger", "Could not find method \"" + this.mNegativeCross + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(view));
                }
            }
            try {
                this.mFireNegativeCross.invoke(view, new java.lang.Object[0]);
            } catch (java.lang.Exception unused2) {
                android.util.Log.e("KeyTrigger", "Exception in call \"" + this.mNegativeCross + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(view));
            }
        }
        if (z5 && this.mPositiveCross != null) {
            if (this.mFirePositiveCross == null) {
                try {
                    this.mFirePositiveCross = view.getClass().getMethod(this.mPositiveCross, new java.lang.Class[0]);
                } catch (java.lang.NoSuchMethodException unused3) {
                    android.util.Log.e("KeyTrigger", "Could not find method \"" + this.mPositiveCross + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(view));
                }
            }
            try {
                this.mFirePositiveCross.invoke(view, new java.lang.Object[0]);
            } catch (java.lang.Exception unused4) {
                android.util.Log.e("KeyTrigger", "Exception in call \"" + this.mPositiveCross + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(view));
            }
        }
        if (!z || this.mCross == null) {
            return;
        }
        if (this.mFireCross == null) {
            try {
                this.mFireCross = view.getClass().getMethod(this.mCross, new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused5) {
                android.util.Log.e("KeyTrigger", "Could not find method \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(view));
            }
        }
        try {
            this.mFireCross.invoke(view, new java.lang.Object[0]);
        } catch (java.lang.Exception unused6) {
            android.util.Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + " " + androidx.constraintlayout.motion.widget.Debug.getName(view));
        }
    }

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_framePosition, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onCross, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onNegativeCross, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_onPositiveCross, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motionTarget, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerId, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerSlack, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTrigger_triggerReceiver, 11);
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTrigger keyTrigger, android.content.res.TypedArray typedArray, android.content.Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        keyTrigger.mNegativeCross = typedArray.getString(index);
                        continue;
                        break;
                    case 2:
                        keyTrigger.mPositiveCross = typedArray.getString(index);
                        continue;
                        break;
                    case 4:
                        keyTrigger.mCross = typedArray.getString(index);
                        continue;
                        break;
                    case 5:
                        keyTrigger.mTriggerSlack = typedArray.getFloat(index, keyTrigger.mTriggerSlack);
                        continue;
                        break;
                    case 6:
                        keyTrigger.mTriggerID = typedArray.getResourceId(index, keyTrigger.mTriggerID);
                        continue;
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 3) {
                            keyTrigger.mTargetString = typedArray.getString(index);
                            continue;
                        } else {
                            keyTrigger.mTargetId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                        }
                        break;
                    case 8:
                        keyTrigger.mFramePosition = typedArray.getInteger(index, keyTrigger.mFramePosition);
                        keyTrigger.mFireThreshold = (keyTrigger.mFramePosition + 0.5f) / 100.0f;
                        continue;
                        break;
                    case 9:
                        keyTrigger.mTriggerCollisionId = typedArray.getResourceId(index, keyTrigger.mTriggerCollisionId);
                        continue;
                        break;
                    case 10:
                        keyTrigger.mPostLayout = typedArray.getBoolean(index, keyTrigger.mPostLayout);
                        continue;
                        break;
                    case 11:
                        keyTrigger.mTriggerReceiver = typedArray.getResourceId(index, keyTrigger.mTriggerReceiver);
                        break;
                }
                android.util.Log.e("KeyTrigger", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
            }
        }
    }
}
