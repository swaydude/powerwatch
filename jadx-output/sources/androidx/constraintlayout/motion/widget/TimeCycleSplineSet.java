package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    private static final int CURVE_OFFSET = 2;
    private static final int CURVE_PERIOD = 1;
    private static final int CURVE_VALUE = 0;
    private static final java.lang.String TAG = "SplineSet";
    private static float VAL_2PI = 6.2831855f;
    private int count;
    long last_time;
    protected androidx.constraintlayout.motion.utils.CurveFit mCurveFit;
    private java.lang.String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) float.class, 10, 3);
    private float[] mCache = new float[3];
    protected boolean mContinue = false;
    float last_cycle = 0.0f;

    public abstract boolean setProperty(android.view.View view, float f, long j);

    public java.lang.String toString() {
        java.lang.String str = this.mType;
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("##.##");
        for (int i = 0; i < this.count; i++) {
            str = str + "[" + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }

    public void setType(java.lang.String str) {
        this.mType = str;
    }

    public float get(float f, long j) {
        this.mCurveFit.getPos(f, this.mCache);
        float[] fArr = this.mCache;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        float f3 = (float) ((((double) this.last_cycle) + (((j - this.last_time) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.last_cycle = f3;
        this.last_time = j;
        float f4 = fArr[0];
        float fCalcWave = (calcWave(f3) * f4) + this.mCache[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.mContinue = z;
        return fCalcWave;
    }

    protected float calcWave(float f) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return java.lang.Math.signum(f * VAL_2PI);
            case 2:
                fAbs = java.lang.Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) java.lang.Math.cos(f * VAL_2PI);
            case 6:
                float fAbs2 = 1.0f - java.lang.Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) java.lang.Math.sin(f * VAL_2PI);
        }
        return 1.0f - fAbs;
    }

    public androidx.constraintlayout.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    static androidx.constraintlayout.motion.widget.TimeCycleSplineSet makeCustomSpline(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
        return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.CustomSet(str, sparseArray);
    }

    static androidx.constraintlayout.motion.widget.TimeCycleSplineSet makeSpline(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.RotationXset();
            case "rotationY":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.RotationYset();
            case "translationX":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.TranslationXset();
            case "translationY":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.TranslationYset();
            case "translationZ":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.TranslationZset();
            case "progress":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.ProgressSet();
            case "scaleX":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.ScaleXset();
            case "scaleY":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.ScaleYset();
            case "rotation":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.RotationSet();
            case "elevation":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.ElevationSet();
            case "transitionPathRotate":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.PathRotate();
            case "alpha":
                return new androidx.constraintlayout.motion.widget.TimeCycleSplineSet.AlphaSet();
            default:
                return null;
        }
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.count;
        iArr[i3] = i;
        float[][] fArr = this.mValues;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        this.count++;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            android.util.Log.e(TAG, "Error no points added to " + this.mType);
            return;
        }
        androidx.constraintlayout.motion.widget.TimeCycleSplineSet.Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[][] fArr = this.mValues;
                    dArr3[0] = fArr[i6][0];
                    dArr2[i5][1] = fArr[i6][1];
                    dArr2[i5][2] = fArr[i6][2];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                double[] dArr4 = dArr2[i5];
                float[][] fArr2 = this.mValues;
                dArr4[0] = fArr2[i6][0];
                dArr2[i5][1] = fArr2[i6][1];
                dArr2[i5][2] = fArr2[i6][2];
                i5++;
            }
        }
        this.mCurveFit = androidx.constraintlayout.motion.utils.CurveFit.get(i, dArr, dArr2);
    }

    static class ElevationSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                view.setElevation(get(f, j));
            }
            return this.mContinue;
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setAlpha(get(f, j));
            return this.mContinue;
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setRotation(get(f, j));
            return this.mContinue;
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setRotationX(get(f, j));
            return this.mContinue;
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setRotationY(get(f, j));
            return this.mContinue;
        }
    }

    static class PathRotate extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        PathRotate() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            return this.mContinue;
        }

        public boolean setPathRotate(android.view.View view, float f, long j, double d, double d2) {
            view.setRotation(get(f, j) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
            return this.mContinue;
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setScaleX(get(f, j));
            return this.mContinue;
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setScaleY(get(f, j));
            return this.mContinue;
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setTranslationX(get(f, j));
            return this.mContinue;
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            view.setTranslationY(get(f, j));
            return this.mContinue;
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(get(f, j));
            }
            return this.mContinue;
        }
    }

    static class CustomSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        java.lang.String mAttributeName;
        float[] mCache;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        android.util.SparseArray<float[]> mWaveProperties = new android.util.SparseArray<>();

        public CustomSet(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNoOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            int i2 = iNoOfInterpValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[iNoOfInterpValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i3);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                dArr2[i3][iNoOfInterpValues] = fArrValueAt[0];
                dArr2[i3][iNoOfInterpValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = androidx.constraintlayout.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i, androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, constraintAttribute);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = java.lang.Math.max(this.mWaveShape, i2);
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            this.last_cycle = (float) ((((double) this.last_cycle) + (((j - this.last_time) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.last_time = j;
            float fCalcWave = calcWave(this.last_cycle);
            this.mContinue = false;
            for (int i = 0; i < this.mCache.length; i++) {
                this.mContinue |= ((double) this.mTempValues[i]) != 0.0d;
                this.mCache[i] = (this.mTempValues[i] * fCalcWave) + f3;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.widget.TimeCycleSplineSet {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(android.view.View view, float f, long j) {
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(f, j));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                java.lang.reflect.Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
                } catch (java.lang.NoSuchMethodException unused) {
                    this.mNoMethod = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, java.lang.Float.valueOf(get(f, j)));
                    } catch (java.lang.IllegalAccessException e) {
                        android.util.Log.e(androidx.constraintlayout.motion.widget.TimeCycleSplineSet.TAG, "unable to setProgress", e);
                    } catch (java.lang.reflect.InvocationTargetException e2) {
                        android.util.Log.e(androidx.constraintlayout.motion.widget.TimeCycleSplineSet.TAG, "unable to setProgress", e2);
                    }
                }
            }
            return this.mContinue;
        }
    }

    private static class Sort {
        private Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int iPartition = partition(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = iPartition - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = iPartition + 1;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }
}
