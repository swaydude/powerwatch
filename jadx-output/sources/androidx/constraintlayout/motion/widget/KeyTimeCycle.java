package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyTimeCycle extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyTimeCycle";
    private static final java.lang.String TAG = "KeyTimeCycle";
    private java.lang.String mTransitionEasing;
    private androidx.constraintlayout.motion.utils.CurveFit mWaveOffsetSpline;
    private androidx.constraintlayout.motion.utils.CurveFit mWavePeriodSpline;
    private int mCurveFit = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;
    private int mWaveShape = 0;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;

    public KeyTimeCycle() {
        this.mType = 1;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyTimeCycle.Loader.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyTimeCycle));
    }

    int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(java.util.HashSet<java.lang.String> hashSet) {
        if (!java.lang.Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!java.lang.Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!java.lang.Float.isNaN(this.mRotation)) {
            hashSet.add("rotation");
        }
        if (!java.lang.Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!java.lang.Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!java.lang.Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!java.lang.Float.isNaN(this.mProgress)) {
            hashSet.add(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.mCustomConstraints.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(java.util.HashMap<java.lang.String, java.lang.Integer> map) {
        if (this.mCurveFit == -1) {
            return;
        }
        if (!java.lang.Float.isNaN(this.mAlpha)) {
            map.put("alpha", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mElevation)) {
            map.put("elevation", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotation)) {
            map.put("rotation", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotationX)) {
            map.put("rotationX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mRotationY)) {
            map.put("rotationY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationX)) {
            map.put("translationX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationY)) {
            map.put("translationY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTranslationZ)) {
            map.put("translationZ", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mTransitionPathRotate)) {
            map.put("transitionPathRotate", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            map.put("scaleX", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mScaleX)) {
            map.put("scaleY", java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (!java.lang.Float.isNaN(this.mProgress)) {
            map.put(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, java.lang.Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustomConstraints.size() > 0) {
            java.util.Iterator<java.lang.String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), java.lang.Integer.valueOf(this.mCurveFit));
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map) {
        throw new java.lang.IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x004d  */
    public void addTimeValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> map) {
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.motion.widget.TimeCycleSplineSet timeCycleSplineSet = map.get(str);
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (constraintAttribute != null) {
                    ((androidx.constraintlayout.motion.widget.TimeCycleSplineSet.CustomSet) timeCycleSplineSet).setPoint(this.mFramePosition, constraintAttribute, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                }
            } else {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        if (java.lang.Float.isNaN(this.mRotationX)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mRotationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (java.lang.Float.isNaN(this.mRotationY)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mRotationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "translationX":
                        if (java.lang.Float.isNaN(this.mTranslationX)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "translationY":
                        if (java.lang.Float.isNaN(this.mTranslationY)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (java.lang.Float.isNaN(this.mTranslationZ)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mTranslationZ, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "progress":
                        if (java.lang.Float.isNaN(this.mProgress)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mProgress, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (java.lang.Float.isNaN(this.mScaleX)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mScaleX, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (java.lang.Float.isNaN(this.mScaleY)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mScaleY, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "rotation":
                        if (java.lang.Float.isNaN(this.mRotation)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mRotation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "elevation":
                        if (java.lang.Float.isNaN(this.mElevation)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mElevation, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (java.lang.Float.isNaN(this.mTransitionPathRotate)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    case "alpha":
                        if (java.lang.Float.isNaN(this.mAlpha)) {
                            break;
                        } else {
                            timeCycleSplineSet.setPoint(this.mFramePosition, this.mAlpha, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                            break;
                        }
                        break;
                    default:
                        android.util.Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String str, java.lang.Object obj) {
        str.hashCode();
        switch (str) {
            case "transitionEasing":
                this.mTransitionEasing = obj.toString();
                break;
            case "rotationX":
                this.mRotationX = toFloat(obj);
                break;
            case "rotationY":
                this.mRotationY = toFloat(obj);
                break;
            case "translationX":
                this.mTranslationX = toFloat(obj);
                break;
            case "translationY":
                this.mTranslationY = toFloat(obj);
                break;
            case "progress":
                this.mProgress = toFloat(obj);
                break;
            case "scaleX":
                this.mScaleX = toFloat(obj);
                break;
            case "scaleY":
                this.mScaleY = toFloat(obj);
                break;
            case "rotation":
                this.mRotation = toFloat(obj);
                break;
            case "elevation":
                this.mElevation = toFloat(obj);
                break;
            case "transitionPathRotate":
                this.mTransitionPathRotate = toFloat(obj);
                break;
            case "alpha":
                this.mAlpha = toFloat(obj);
                break;
            case "curveFit":
                this.mCurveFit = toInt(obj);
                break;
            case "mTranslationZ":
                this.mTranslationZ = toFloat(obj);
                break;
        }
    }

    private static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_alpha, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_elevation, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotation, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationX, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_rotationY, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleX, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_transitionEasing, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionTarget, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_framePosition, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_curveFit, 13);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_scaleY, 14);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationX, 15);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationY, 16);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_android_translationZ, 17);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_motionProgress, 18);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_wavePeriod, 20);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveOffset, 21);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyTimeCycle keyTimeCycle, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        keyTimeCycle.mAlpha = typedArray.getFloat(index, keyTimeCycle.mAlpha);
                        break;
                    case 2:
                        keyTimeCycle.mElevation = typedArray.getDimension(index, keyTimeCycle.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        android.util.Log.e("KeyTimeCycle", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        keyTimeCycle.mRotation = typedArray.getFloat(index, keyTimeCycle.mRotation);
                        break;
                    case 5:
                        keyTimeCycle.mRotationX = typedArray.getFloat(index, keyTimeCycle.mRotationX);
                        break;
                    case 6:
                        keyTimeCycle.mRotationY = typedArray.getFloat(index, keyTimeCycle.mRotationY);
                        break;
                    case 7:
                        keyTimeCycle.mScaleX = typedArray.getFloat(index, keyTimeCycle.mScaleX);
                        break;
                    case 8:
                        keyTimeCycle.mTransitionPathRotate = typedArray.getFloat(index, keyTimeCycle.mTransitionPathRotate);
                        break;
                    case 9:
                        keyTimeCycle.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (typedArray.peekValue(index).type == 3) {
                            keyTimeCycle.mTargetString = typedArray.getString(index);
                        } else {
                            keyTimeCycle.mTargetId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                        }
                        break;
                    case 12:
                        keyTimeCycle.mFramePosition = typedArray.getInt(index, keyTimeCycle.mFramePosition);
                        break;
                    case 13:
                        keyTimeCycle.mCurveFit = typedArray.getInteger(index, keyTimeCycle.mCurveFit);
                        break;
                    case 14:
                        keyTimeCycle.mScaleY = typedArray.getFloat(index, keyTimeCycle.mScaleY);
                        break;
                    case 15:
                        keyTimeCycle.mTranslationX = typedArray.getDimension(index, keyTimeCycle.mTranslationX);
                        break;
                    case 16:
                        keyTimeCycle.mTranslationY = typedArray.getDimension(index, keyTimeCycle.mTranslationY);
                        break;
                    case 17:
                        if (android.os.Build.VERSION.SDK_INT >= 21) {
                            keyTimeCycle.mTranslationZ = typedArray.getDimension(index, keyTimeCycle.mTranslationZ);
                        }
                        break;
                    case 18:
                        keyTimeCycle.mProgress = typedArray.getFloat(index, keyTimeCycle.mProgress);
                        break;
                    case 19:
                        keyTimeCycle.mWaveShape = typedArray.getInt(index, keyTimeCycle.mWaveShape);
                        break;
                    case 20:
                        keyTimeCycle.mWavePeriod = typedArray.getFloat(index, keyTimeCycle.mWavePeriod);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            keyTimeCycle.mWaveOffset = typedArray.getDimension(index, keyTimeCycle.mWaveOffset);
                        } else {
                            keyTimeCycle.mWaveOffset = typedArray.getFloat(index, keyTimeCycle.mWaveOffset);
                        }
                        break;
                }
            }
        }
    }
}
