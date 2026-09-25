package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final java.lang.String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    java.lang.String[] attributeTable;
    private androidx.constraintlayout.motion.utils.CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private java.lang.String[] mAttributeNames;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> mAttributesMap;
    java.lang.String mConstraintTag;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private androidx.constraintlayout.motion.widget.KeyTrigger[] mKeyTriggers;
    private androidx.constraintlayout.motion.utils.CurveFit[] mSpline;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> mTimeCycleAttributesMap;
    android.view.View mView;
    private int mCurveFitType = -1;
    private androidx.constraintlayout.motion.widget.MotionPaths mStartMotionPath = new androidx.constraintlayout.motion.widget.MotionPaths();
    private androidx.constraintlayout.motion.widget.MotionPaths mEndMotionPath = new androidx.constraintlayout.motion.widget.MotionPaths();
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mStartPoint = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint();
    private androidx.constraintlayout.motion.widget.MotionConstrainedPoint mEndPoint = new androidx.constraintlayout.motion.widget.MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionPaths> mMotionPaths = new java.util.ArrayList<>();
    private float[] mVelocity = new float[1];
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> mKeyList = new java.util.ArrayList<>();

    androidx.constraintlayout.motion.widget.MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    MotionController(android.view.View view) {
        setView(view);
    }

    float getStartX() {
        return this.mStartMotionPath.x;
    }

    float getStartY() {
        return this.mStartMotionPath.y;
    }

    float getFinalX() {
        return this.mEndMotionPath.x;
    }

    float getFinalY() {
        return this.mEndMotionPath.y;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[PHI: r11
      0x0065: PHI (r11v2 float) = (r11v1 float), (r11v4 float) binds: [B:21:0x004b, B:26:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112 A[SYNTHETIC] */
    void buildPath(float[] fArr, int i) {
        androidx.constraintlayout.motion.widget.SplineSet splineSet;
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet2 = map == null ? null : map.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map2 = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet3 = map2 == null ? null : map2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map3 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map4 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float f3 = i2 * f2;
            float f4 = this.mStaggerScale;
            if (f4 != f) {
                float f5 = this.mStaggerOffset;
                if (f3 < f5) {
                    f3 = 0.0f;
                }
                if (f3 > f5) {
                    splineSet = splineSet2;
                    if (f3 < 1.0d) {
                        f3 = (f3 - f5) * f4;
                    }
                } else {
                    splineSet = splineSet2;
                }
            } else {
                splineSet = splineSet2;
            }
            double d = f3;
            androidx.constraintlayout.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            float f7 = 0.0f;
            for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < f3) {
                        androidx.constraintlayout.motion.utils.Easing easing2 = motionPaths.mKeyFrameEasing;
                        f7 = motionPaths.time;
                        easing = easing2;
                    } else if (java.lang.Float.isNaN(f6)) {
                        f6 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (java.lang.Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f7;
                d = (((float) easing.get((f3 - f7) / f8)) * f8) + f7;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            androidx.constraintlayout.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i3 = i2 * 2;
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i3);
            if (keyCycleOscillator != null) {
                fArr[i3] = fArr[i3] + keyCycleOscillator.get(f3);
            } else {
                if (splineSet != null) {
                    splineSet2 = splineSet;
                    fArr[i3] = fArr[i3] + splineSet2.get(f3);
                }
                if (keyCycleOscillator2 != null) {
                    int i4 = i3 + 1;
                    fArr[i4] = fArr[i4] + keyCycleOscillator2.get(f3);
                } else if (splineSet3 != null) {
                    int i5 = i3 + 1;
                    fArr[i5] = fArr[i5] + splineSet3.get(f3);
                }
                i2++;
                f = 1.0f;
            }
            splineSet2 = splineSet;
            if (keyCycleOscillator2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + keyCycleOscillator2.get(f3);
            } else if (splineSet3 != null) {
                int i7 = i3 + 1;
                fArr[i7] = fArr[i7] + splineSet3.get(f3);
            }
            i2++;
            f = 1.0f;
        }
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f2 = i * f;
            double d3 = f2;
            androidx.constraintlayout.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
                if (motionPaths.mKeyFrameEasing != null) {
                    if (motionPaths.time < f2) {
                        androidx.constraintlayout.motion.utils.Easing easing2 = motionPaths.mKeyFrameEasing;
                        f4 = motionPaths.time;
                        easing = easing2;
                    } else if (java.lang.Float.isNaN(f3)) {
                        f3 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (java.lang.Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f5 = f3 - f4;
                d3 = (((float) easing.get((f2 - f4) / f5)) * f5) + f4;
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i > 0) {
                fHypot = (float) (((double) fHypot) + java.lang.Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return fHypot;
    }

    androidx.constraintlayout.motion.widget.KeyPositionBase getPositionKeyframe(int i, int i2, float f, float f2) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = this.mStartMotionPath.x;
        rectF.top = this.mStartMotionPath.y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = this.mEndMotionPath.x;
        rectF2.top = this.mEndMotionPath.y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        for (androidx.constraintlayout.motion.widget.Key key : this.mKeyList) {
            if (key instanceof androidx.constraintlayout.motion.widget.KeyPositionBase) {
                androidx.constraintlayout.motion.widget.KeyPositionBase keyPositionBase = (androidx.constraintlayout.motion.widget.KeyPositionBase) key;
                if (keyPositionBase.intersects(i, i2, rectF, rectF2, f, f2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    int getAttributeValues(java.lang.String str, float[] fArr, int i) {
        androidx.constraintlayout.motion.widget.SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = splineSet.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    void buildRect(float f, float[] fArr, int i) {
        this.mSpline[0].getPos(getAdjustedPosition(f, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    void buildRectangles(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.mSpline[0].getPos(getAdjustedPosition(i2 * f, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 8);
        }
    }

    float getKeyFrameParameter(int i, float f, float f2) {
        float f3 = this.mEndMotionPath.x - this.mStartMotionPath.x;
        float f4 = this.mEndMotionPath.y - this.mStartMotionPath.y;
        float f5 = this.mStartMotionPath.x + (this.mStartMotionPath.width / 2.0f);
        float f6 = this.mStartMotionPath.y + (this.mStartMotionPath.height / 2.0f);
        float fHypot = (float) java.lang.Math.hypot(f3, f4);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f7 = f - f5;
        float f8 = f2 - f6;
        if (((float) java.lang.Math.hypot(f7, f8)) == 0.0f) {
            return 0.0f;
        }
        float f9 = (f7 * f3) + (f8 * f4);
        if (i == 0) {
            return f9 / fHypot;
        }
        if (i == 1) {
            return (float) java.lang.Math.sqrt((fHypot * fHypot) - (f9 * f9));
        }
        if (i == 2) {
            return f7 / f3;
        }
        if (i == 3) {
            return f8 / f3;
        }
        if (i == 4) {
            return f7 / f4;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f8 / f4;
    }

    private void insertKey(androidx.constraintlayout.motion.widget.MotionPaths motionPaths) {
        int iBinarySearch = java.util.Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (iBinarySearch == 0) {
            android.util.Log.e(TAG, " KeyPath positon \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-iBinarySearch) - 1, motionPaths);
    }

    void addKeys(java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    void addKey(androidx.constraintlayout.motion.widget.Key key) {
        this.mKeyList.add(key);
    }

    public void setup(int i, int i2, float f) {
        java.util.ArrayList arrayList;
        androidx.constraintlayout.motion.widget.TimeCycleSplineSet timeCycleSplineSetMakeSpline;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute;
        androidx.constraintlayout.motion.widget.SplineSet splineSetMakeSpline;
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute2;
        new java.util.HashSet();
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet<>();
        java.util.HashSet<java.lang.String> hashSet3 = new java.util.HashSet<>();
        java.util.HashMap<java.lang.String, java.lang.Integer> map = new java.util.HashMap<>();
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.motion.widget.Key key : arrayList2) {
                if (key instanceof androidx.constraintlayout.motion.widget.KeyPosition) {
                    androidx.constraintlayout.motion.widget.KeyPosition keyPosition = (androidx.constraintlayout.motion.widget.KeyPosition) key;
                    insertKey(new androidx.constraintlayout.motion.widget.MotionPaths(i, i2, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    if (keyPosition.mCurveFit != androidx.constraintlayout.motion.widget.Key.UNSET) {
                        this.mCurveFitType = keyPosition.mCurveFit;
                    }
                } else if (key instanceof androidx.constraintlayout.motion.widget.KeyCycle) {
                    key.getAttributeNames(hashSet3);
                } else if (key instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle) {
                    key.getAttributeNames(hashSet);
                } else if (key instanceof androidx.constraintlayout.motion.widget.KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add((androidx.constraintlayout.motion.widget.KeyTrigger) key);
                } else {
                    key.setInterpolation(map);
                    key.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (androidx.constraintlayout.motion.widget.KeyTrigger[]) arrayList.toArray(new androidx.constraintlayout.motion.widget.KeyTrigger[0]);
        }
        char c2 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new java.util.HashMap<>();
            for (java.lang.String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    android.util.SparseArray sparseArray = new android.util.SparseArray();
                    java.lang.String str2 = str.split(",")[c2];
                    for (androidx.constraintlayout.motion.widget.Key key2 : this.mKeyList) {
                        if (key2.mCustomConstraints != null && (constraintAttribute2 = key2.mCustomConstraints.get(str2)) != null) {
                            sparseArray.append(key2.mFramePosition, constraintAttribute2);
                        }
                    }
                    splineSetMakeSpline = androidx.constraintlayout.motion.widget.SplineSet.makeCustomSpline(str, sparseArray);
                } else {
                    splineSetMakeSpline = androidx.constraintlayout.motion.widget.SplineSet.makeSpline(str);
                }
                if (splineSetMakeSpline != null) {
                    splineSetMakeSpline.setType(str);
                    this.mAttributesMap.put(str, splineSetMakeSpline);
                }
                c2 = 1;
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.motion.widget.Key key3 : arrayList3) {
                    if (key3 instanceof androidx.constraintlayout.motion.widget.KeyAttributes) {
                        key3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (java.lang.String str3 : this.mAttributesMap.keySet()) {
                this.mAttributesMap.get(str3).setup(map.containsKey(str3) ? map.get(str3).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            this.mTimeCycleAttributesMap = new java.util.HashMap<>();
            for (java.lang.String str4 : hashSet) {
                if (str4.startsWith("CUSTOM,")) {
                    android.util.SparseArray sparseArray2 = new android.util.SparseArray();
                    java.lang.String str5 = str4.split(",")[1];
                    for (androidx.constraintlayout.motion.widget.Key key4 : this.mKeyList) {
                        if (key4.mCustomConstraints != null && (constraintAttribute = key4.mCustomConstraints.get(str5)) != null) {
                            sparseArray2.append(key4.mFramePosition, constraintAttribute);
                        }
                    }
                    timeCycleSplineSetMakeSpline = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeCustomSpline(str4, sparseArray2);
                } else {
                    timeCycleSplineSetMakeSpline = androidx.constraintlayout.motion.widget.TimeCycleSplineSet.makeSpline(str4);
                }
                if (timeCycleSplineSetMakeSpline != null) {
                    timeCycleSplineSetMakeSpline.setType(str4);
                    this.mTimeCycleAttributesMap.put(str4, timeCycleSplineSetMakeSpline);
                }
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.motion.widget.Key key5 : arrayList4) {
                    if (key5 instanceof androidx.constraintlayout.motion.widget.KeyTimeCycle) {
                        ((androidx.constraintlayout.motion.widget.KeyTimeCycle) key5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (java.lang.String str6 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int i3 = 2;
        int size = this.mMotionPaths.size() + 2;
        androidx.constraintlayout.motion.widget.MotionPaths[] motionPathsArr = new androidx.constraintlayout.motion.widget.MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            motionPathsArr[i4] = it.next();
            i4++;
        }
        java.util.HashSet hashSet4 = new java.util.HashSet();
        for (java.lang.String str7 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) hashSet4.toArray(new java.lang.String[0]);
        this.mAttributeNames = strArr;
        this.mAttributeInterpCount = new int[strArr.length];
        int i5 = 0;
        while (true) {
            java.lang.String[] strArr2 = this.mAttributeNames;
            if (i5 >= strArr2.length) {
                break;
            }
            java.lang.String str8 = strArr2[i5];
            this.mAttributeInterpCount[i5] = 1;
            for (int i6 = 0; i6 < size; i6++) {
                if (motionPathsArr[i5].attributes.containsKey(str8)) {
                    this.mAttributeInterpCount[i5] = motionPathsArr[i5].attributes.get(str8).noOfInterpValues();
                    break;
                }
            }
            i5++;
        }
        boolean z = motionPathsArr[0].mPathMotionArc != androidx.constraintlayout.motion.widget.Key.UNSET;
        int length = 18 + this.mAttributeNames.length;
        boolean[] zArr = new boolean[length];
        for (int i7 = 1; i7 < size; i7++) {
            motionPathsArr[i7].different(motionPathsArr[i7 - 1], zArr, this.mAttributeNames, z);
        }
        int i8 = 0;
        for (int i9 = 1; i9 < length; i9++) {
            if (zArr[i9]) {
                i8++;
            }
        }
        int[] iArr = new int[i8];
        this.mInterpolateVariables = iArr;
        this.mInterpolateData = new double[iArr.length];
        this.mInterpolateVelocity = new double[iArr.length];
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                this.mInterpolateVariables[i10] = i11;
                i10++;
            }
        }
        double[][] dArr = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i12 = 0; i12 < size; i12++) {
            motionPathsArr[i12].fillStandard(dArr[i12], this.mInterpolateVariables);
            dArr2[i12] = motionPathsArr[i12].time;
        }
        int i13 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i13 >= iArr2.length) {
                break;
            }
            if (iArr2[i13] < androidx.constraintlayout.motion.widget.MotionPaths.names.length) {
                java.lang.String str9 = androidx.constraintlayout.motion.widget.MotionPaths.names[this.mInterpolateVariables[i13]] + " [";
                for (int i14 = 0; i14 < size; i14++) {
                    str9 = str9 + dArr[i14][i13];
                }
            }
            i13++;
        }
        this.mSpline = new androidx.constraintlayout.motion.utils.CurveFit[this.mAttributeNames.length + 1];
        int i15 = 0;
        while (true) {
            java.lang.String[] strArr3 = this.mAttributeNames;
            if (i15 >= strArr3.length) {
                break;
            }
            double[][] dArr3 = (double[][]) null;
            java.lang.String str10 = strArr3[i15];
            double[] dArr4 = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < size) {
                if (motionPathsArr[i16].hasCustomData(str10)) {
                    if (dArr3 == null) {
                        int[] iArr3 = new int[i3];
                        iArr3[1] = motionPathsArr[i16].getCustomDataCount(str10);
                        iArr3[c] = size;
                        dArr3 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, iArr3);
                        dArr4 = new double[size];
                    }
                    dArr4[i17] = motionPathsArr[i16].time;
                    motionPathsArr[i16].getCustomData(str10, dArr3[i17], 0);
                    i17++;
                }
                i16++;
                i3 = 2;
                c = 0;
            }
            i15++;
            this.mSpline[i15] = androidx.constraintlayout.motion.utils.CurveFit.get(this.mCurveFitType, java.util.Arrays.copyOf(dArr4, i17), (double[][]) java.util.Arrays.copyOf(dArr3, i17));
            i3 = 2;
            c = 0;
        }
        this.mSpline[0] = androidx.constraintlayout.motion.utils.CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != androidx.constraintlayout.motion.widget.Key.UNSET) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, size, 2);
            for (int i18 = 0; i18 < size; i18++) {
                iArr4[i18] = motionPathsArr[i18].mPathMotionArc;
                dArr5[i18] = motionPathsArr[i18].time;
                dArr6[i18][0] = motionPathsArr[i18].x;
                dArr6[i18][1] = motionPathsArr[i18].y;
            }
            this.mArcSpline = androidx.constraintlayout.motion.utils.CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        float preCycleDistance = Float.NaN;
        this.mCycleMap = new java.util.HashMap<>();
        if (this.mKeyList != null) {
            for (java.lang.String str11 : hashSet3) {
                androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillatorMakeSpline = androidx.constraintlayout.motion.widget.KeyCycleOscillator.makeSpline(str11);
                if (keyCycleOscillatorMakeSpline != null) {
                    if (keyCycleOscillatorMakeSpline.variesByPath() && java.lang.Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    keyCycleOscillatorMakeSpline.setType(str11);
                    this.mCycleMap.put(str11, keyCycleOscillatorMakeSpline);
                }
            }
            for (androidx.constraintlayout.motion.widget.Key key6 : this.mKeyList) {
                if (key6 instanceof androidx.constraintlayout.motion.widget.KeyCycle) {
                    ((androidx.constraintlayout.motion.widget.KeyCycle) key6).addCycleValues(this.mCycleMap);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.widget.KeyCycleOscillator> it2 = this.mCycleMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public java.lang.String toString() {
        return " start: x: " + this.mStartMotionPath.x + " y: " + this.mStartMotionPath.y + " end: x: " + this.mEndMotionPath.x + " y: " + this.mEndMotionPath.y;
    }

    private void readView(androidx.constraintlayout.motion.widget.MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void setView(android.view.View view) {
        this.mView = view;
        this.mId = view.getId();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    void setStartCurrentState(android.view.View view) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        this.mStartMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    void setStartState(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.mStartMotionPath.time = 0.0f;
        this.mStartMotionPath.position = 0.0f;
        readView(this.mStartMotionPath);
        this.mStartMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        androidx.constraintlayout.widget.ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    void setEndState(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.mEndMotionPath.time = 1.0f;
        this.mEndMotionPath.position = 1.0f;
        readView(this.mEndMotionPath);
        this.mEndMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.mStaggerScale;
            if (f3 != 1.0d) {
                float f4 = this.mStaggerOffset;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        androidx.constraintlayout.motion.utils.Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f5 = Float.NaN;
        for (androidx.constraintlayout.motion.widget.MotionPaths motionPaths : this.mMotionPaths) {
            if (motionPaths.mKeyFrameEasing != null) {
                if (motionPaths.time < f) {
                    easing = motionPaths.mKeyFrameEasing;
                    f2 = motionPaths.time;
                } else if (java.lang.Float.isNaN(f5)) {
                    f5 = motionPaths.time;
                }
            }
        }
        if (easing != null) {
            float f6 = (java.lang.Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f6;
            f = (((float) easing.get(d)) * f6) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    boolean interpolate(android.view.View view, float f, long j) {
        androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate pathRotate;
        boolean pathRotate2;
        androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate pathRotate3 = null;
        float adjustedPosition = getAdjustedPosition(f, null);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map = this.mAttributesMap;
        if (map != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view, adjustedPosition);
            }
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.TimeCycleSplineSet> map2 = this.mTimeCycleAttributesMap;
        if (map2 != null) {
            boolean property = false;
            for (androidx.constraintlayout.motion.widget.TimeCycleSplineSet timeCycleSplineSet : map2.values()) {
                if (timeCycleSplineSet instanceof androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate) {
                    pathRotate3 = (androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate) timeCycleSplineSet;
                } else {
                    property |= timeCycleSplineSet.setProperty(view, adjustedPosition, j);
                }
            }
            pathRotate = pathRotate3;
            pathRotate2 = property;
        } else {
            pathRotate = null;
            pathRotate2 = false;
        }
        androidx.constraintlayout.motion.utils.CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getPos(d, this.mInterpolateData);
            this.mSpline[0].getSlope(d, this.mInterpolateVelocity);
            androidx.constraintlayout.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                }
            }
            this.mStartMotionPath.setView(view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map3 = this.mAttributesMap;
            if (map3 != null) {
                for (androidx.constraintlayout.motion.widget.SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof androidx.constraintlayout.motion.widget.SplineSet.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        ((androidx.constraintlayout.motion.widget.SplineSet.PathRotate) splineSet).setPathRotate(view, adjustedPosition, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                pathRotate2 = pathRotate.setPathRotate(view, adjustedPosition, j, dArr3[0], dArr3[1]) | pathRotate2;
            }
            int i = 1;
            while (true) {
                androidx.constraintlayout.motion.utils.CurveFit[] curveFitArr2 = this.mSpline;
                if (i >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i].getPos(d, this.mValuesBuff);
                this.mStartMotionPath.attributes.get(this.mAttributeNames[i - 1]).setInterpolatedValue(view, this.mValuesBuff);
                i++;
            }
            if (this.mStartPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= 0.0f) {
                    view.setVisibility(this.mStartPoint.visibility);
                } else if (adjustedPosition >= 1.0f) {
                    view.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != this.mStartPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i2 = 0;
                while (true) {
                    androidx.constraintlayout.motion.widget.KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i2 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i2].conditionallyFire(adjustedPosition, view);
                    i2++;
                }
            }
        } else {
            float f2 = this.mStartMotionPath.x + ((this.mEndMotionPath.x - this.mStartMotionPath.x) * adjustedPosition);
            float f3 = this.mStartMotionPath.y + ((this.mEndMotionPath.y - this.mStartMotionPath.y) * adjustedPosition);
            float f4 = f2 + 0.5f;
            int i3 = (int) f4;
            float f5 = f3 + 0.5f;
            int i4 = (int) f5;
            int i5 = (int) (f4 + this.mStartMotionPath.width + ((this.mEndMotionPath.width - this.mStartMotionPath.width) * adjustedPosition));
            int i6 = (int) (f5 + this.mStartMotionPath.height + ((this.mEndMotionPath.height - this.mStartMotionPath.height) * adjustedPosition));
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (this.mEndMotionPath.width != this.mStartMotionPath.width || this.mEndMotionPath.height != this.mStartMotionPath.height) {
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i7, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), android.view.View.MeasureSpec.makeMeasureSpec(i8, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY));
            }
            view.layout(i3, i4, i5, i6);
        }
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            for (androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator : map4.values()) {
                if (keyCycleOscillator instanceof androidx.constraintlayout.motion.widget.KeyCycleOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((androidx.constraintlayout.motion.widget.KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(view, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    keyCycleOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return pathRotate2;
    }

    void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        androidx.constraintlayout.motion.utils.CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            androidx.constraintlayout.motion.utils.CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d, dArr2);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        float f5 = this.mEndMotionPath.x - this.mStartMotionPath.x;
        float f6 = this.mEndMotionPath.y - this.mStartMotionPath.y;
        float f7 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f5;
        float f8 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f6;
        fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
        fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
    }

    void getPostLayoutDvDp(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet = map == null ? null : map.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map2 = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map3 = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet3 = map3 == null ? null : map3.get("rotation");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map4 = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet4 = map4 == null ? null : map4.get("scaleX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map5 = this.mAttributesMap;
        androidx.constraintlayout.motion.widget.SplineSet splineSet5 = map5 == null ? null : map5.get("scaleY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map6 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator = map6 == null ? null : map6.get("translationX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map7 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator2 = map7 == null ? null : map7.get("translationY");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map8 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator3 = map8 == null ? null : map8.get("rotation");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map9 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator4 = map9 == null ? null : map9.get("scaleX");
        java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.KeyCycleOscillator> map10 = this.mCycleMap;
        androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator5 = map10 != null ? map10.get("scaleY") : null;
        androidx.constraintlayout.motion.utils.VelocityMatrix velocityMatrix = new androidx.constraintlayout.motion.utils.VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        androidx.constraintlayout.motion.utils.CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f4 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            float f5 = this.mEndMotionPath.x - this.mStartMotionPath.x;
            float f6 = this.mEndMotionPath.y - this.mStartMotionPath.y;
            androidx.constraintlayout.motion.widget.KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f7 = (this.mEndMotionPath.width - this.mStartMotionPath.width) + f5;
            float f8 = (this.mEndMotionPath.height - this.mStartMotionPath.height) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = java.lang.Math.max(iMax, it.next().mDrawPath);
        }
        return java.lang.Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    java.lang.String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    void positionKeyframe(android.view.View view, androidx.constraintlayout.motion.widget.KeyPositionBase keyPositionBase, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        rectF.left = this.mStartMotionPath.x;
        rectF.top = this.mStartMotionPath.y;
        rectF.right = rectF.left + this.mStartMotionPath.width;
        rectF.bottom = rectF.top + this.mStartMotionPath.height;
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = this.mEndMotionPath.x;
        rectF2.top = this.mEndMotionPath.y;
        rectF2.right = rectF2.left + this.mEndMotionPath.width;
        rectF2.bottom = rectF2.top + this.mEndMotionPath.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
    }
}
