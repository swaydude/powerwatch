package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends androidx.constraintlayout.motion.widget.Key {
    public static final int KEY_TYPE = 1;
    static final java.lang.String NAME = "KeyAttribute";
    private static final java.lang.String TAG = "KeyAttribute";
    private java.lang.String mTransitionEasing;
    private int mCurveFit = -1;
    private boolean mVisibility = false;
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

    public KeyAttributes() {
        this.mType = 1;
        this.mCustomConstraints = new java.util.HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.KeyAttributes.Loader.read(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.KeyAttribute));
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
        if (!java.lang.Float.isNaN(this.mScaleX)) {
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
        if (!java.lang.Float.isNaN(this.mScaleY)) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map) {
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.motion.widget.SplineSet splineSet = map.get(str);
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (constraintAttribute != null) {
                    ((androidx.constraintlayout.motion.widget.SplineSet.CustomSet) splineSet).setPoint(this.mFramePosition, constraintAttribute);
                }
            } else {
                str.hashCode();
                switch (str) {
                    case "rotationX":
                        if (java.lang.Float.isNaN(this.mRotationX)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mRotationX);
                            break;
                        }
                        break;
                    case "rotationY":
                        if (java.lang.Float.isNaN(this.mRotationY)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mRotationY);
                            break;
                        }
                        break;
                    case "translationX":
                        if (java.lang.Float.isNaN(this.mTranslationX)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                            break;
                        }
                        break;
                    case "translationY":
                        if (java.lang.Float.isNaN(this.mTranslationY)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                            break;
                        }
                        break;
                    case "translationZ":
                        if (java.lang.Float.isNaN(this.mTranslationZ)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                            break;
                        }
                        break;
                    case "progress":
                        if (java.lang.Float.isNaN(this.mProgress)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mProgress);
                            break;
                        }
                        break;
                    case "scaleX":
                        if (java.lang.Float.isNaN(this.mScaleX)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mScaleX);
                            break;
                        }
                        break;
                    case "scaleY":
                        if (java.lang.Float.isNaN(this.mScaleY)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mScaleY);
                            break;
                        }
                        break;
                    case "rotation":
                        if (java.lang.Float.isNaN(this.mRotation)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mRotation);
                            break;
                        }
                        break;
                    case "elevation":
                        if (java.lang.Float.isNaN(this.mElevation)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mElevation);
                            break;
                        }
                        break;
                    case "transitionPathRotate":
                        if (java.lang.Float.isNaN(this.mTransitionPathRotate)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                            break;
                        }
                        break;
                    case "alpha":
                        if (java.lang.Float.isNaN(this.mAlpha)) {
                            break;
                        } else {
                            splineSet.setPoint(this.mFramePosition, this.mAlpha);
                            break;
                        }
                        break;
                    default:
                        android.util.Log.v("KeyAttributes", "UNKNOWN addValues \"" + str + "\"");
                        break;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(java.lang.String str, java.lang.Object obj) {
        str.hashCode();
        switch (str) {
            case "motionProgress":
                this.mProgress = toFloat(obj);
                break;
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
            case "visibility":
                this.mVisibility = toBoolean(obj);
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
        private static final int ANDROID_SCALE_Y = 15;
        private static final int ANDROID_TRANSLATION_X = 16;
        private static final int ANDROID_TRANSLATION_Y = 17;
        private static final int ANDROID_TRANSLATION_Z = 18;
        private static final int ANDROID_VISIBILITY = 14;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 19;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static android.util.SparseIntArray mAttrMap;

        private Loader() {
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_alpha, 1);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_elevation, 2);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotation, 4);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationX, 5);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_rotationY, 6);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleX, 7);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionPathRotate, 8);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_transitionEasing, 9);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionTarget, 10);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_framePosition, 12);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_curveFit, 13);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_visibility, 14);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_scaleY, 15);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationX, 16);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationY, 17);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_android_translationZ, 18);
            mAttrMap.append(androidx.constraintlayout.widget.R.styleable.KeyAttribute_motionProgress, 19);
        }

        public static void read(androidx.constraintlayout.motion.widget.KeyAttributes keyAttributes, android.content.res.TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        keyAttributes.mAlpha = typedArray.getFloat(index, keyAttributes.mAlpha);
                        break;
                    case 2:
                        keyAttributes.mElevation = typedArray.getDimension(index, keyAttributes.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        android.util.Log.e("KeyAttribute", "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        keyAttributes.mRotation = typedArray.getFloat(index, keyAttributes.mRotation);
                        break;
                    case 5:
                        keyAttributes.mRotationX = typedArray.getFloat(index, keyAttributes.mRotationX);
                        break;
                    case 6:
                        keyAttributes.mRotationY = typedArray.getFloat(index, keyAttributes.mRotationY);
                        break;
                    case 7:
                        keyAttributes.mScaleX = typedArray.getFloat(index, keyAttributes.mScaleX);
                        break;
                    case 8:
                        keyAttributes.mTransitionPathRotate = typedArray.getFloat(index, keyAttributes.mTransitionPathRotate);
                        break;
                    case 9:
                        keyAttributes.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (typedArray.peekValue(index).type == 3) {
                            keyAttributes.mTargetString = typedArray.getString(index);
                        } else {
                            keyAttributes.mTargetId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                        }
                        break;
                    case 12:
                        keyAttributes.mFramePosition = typedArray.getInt(index, keyAttributes.mFramePosition);
                        break;
                    case 13:
                        keyAttributes.mCurveFit = typedArray.getInteger(index, keyAttributes.mCurveFit);
                        break;
                    case 14:
                        keyAttributes.mVisibility = typedArray.getBoolean(index, keyAttributes.mVisibility);
                        break;
                    case 15:
                        keyAttributes.mScaleY = typedArray.getFloat(index, keyAttributes.mScaleY);
                        break;
                    case 16:
                        keyAttributes.mTranslationX = typedArray.getDimension(index, keyAttributes.mTranslationX);
                        break;
                    case 17:
                        keyAttributes.mTranslationY = typedArray.getDimension(index, keyAttributes.mTranslationY);
                        break;
                    case 18:
                        if (android.os.Build.VERSION.SDK_INT >= 21) {
                            keyAttributes.mTranslationZ = typedArray.getDimension(index, keyAttributes.mTranslationZ);
                        }
                        break;
                    case 19:
                        keyAttributes.mProgress = typedArray.getFloat(index, keyAttributes.mProgress);
                        break;
                }
            }
        }
    }
}
