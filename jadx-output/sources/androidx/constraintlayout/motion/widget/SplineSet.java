package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class SplineSet {
    private static final java.lang.String TAG = "SplineSet";
    private int count;
    protected androidx.constraintlayout.motion.utils.CurveFit mCurveFit;
    private java.lang.String mType;
    protected int[] mTimePoints = new int[10];
    protected float[] mValues = new float[10];

    public abstract void setProperty(android.view.View view, float f);

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

    public float get(float f) {
        return (float) this.mCurveFit.getPos(f, 0);
    }

    public float getSlope(float f) {
        return (float) this.mCurveFit.getSlope(f, 0);
    }

    public androidx.constraintlayout.motion.utils.CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    static androidx.constraintlayout.motion.widget.SplineSet makeCustomSpline(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
        return new androidx.constraintlayout.motion.widget.SplineSet.CustomSet(str, sparseArray);
    }

    static androidx.constraintlayout.motion.widget.SplineSet makeSpline(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "rotationX":
                return new androidx.constraintlayout.motion.widget.SplineSet.RotationXset();
            case "rotationY":
                return new androidx.constraintlayout.motion.widget.SplineSet.RotationYset();
            case "translationX":
                return new androidx.constraintlayout.motion.widget.SplineSet.TranslationXset();
            case "translationY":
                return new androidx.constraintlayout.motion.widget.SplineSet.TranslationYset();
            case "translationZ":
                return new androidx.constraintlayout.motion.widget.SplineSet.TranslationZset();
            case "progress":
                return new androidx.constraintlayout.motion.widget.SplineSet.ProgressSet();
            case "scaleX":
                return new androidx.constraintlayout.motion.widget.SplineSet.ScaleXset();
            case "scaleY":
                return new androidx.constraintlayout.motion.widget.SplineSet.ScaleYset();
            case "waveVariesBy":
                return new androidx.constraintlayout.motion.widget.SplineSet.AlphaSet();
            case "rotation":
                return new androidx.constraintlayout.motion.widget.SplineSet.RotationSet();
            case "elevation":
                return new androidx.constraintlayout.motion.widget.SplineSet.ElevationSet();
            case "transitionPathRotate":
                return new androidx.constraintlayout.motion.widget.SplineSet.PathRotate();
            case "alpha":
                return new androidx.constraintlayout.motion.widget.SplineSet.AlphaSet();
            case "waveOffset":
                return new androidx.constraintlayout.motion.widget.SplineSet.AlphaSet();
            default:
                return null;
        }
    }

    public void setPoint(int i, float f) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.count + 1) {
            this.mTimePoints = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = java.util.Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i2 = this.count;
        iArr2[i2] = i;
        this.mValues[i2] = f;
        this.count = i2 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            return;
        }
        androidx.constraintlayout.motion.widget.SplineSet.Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.count; i4++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                    dArr2[i5][0] = this.mValues[i6];
                    i5++;
                }
            } else {
                dArr[i5] = ((double) this.mTimePoints[i6]) * 0.01d;
                dArr2[i5][0] = this.mValues[i6];
                i5++;
            }
        }
        this.mCurveFit = androidx.constraintlayout.motion.utils.CurveFit.get(i, dArr, dArr2);
    }

    static class ElevationSet extends androidx.constraintlayout.motion.widget.SplineSet {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                view.setElevation(get(f));
            }
        }
    }

    static class AlphaSet extends androidx.constraintlayout.motion.widget.SplineSet {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setAlpha(get(f));
        }
    }

    static class RotationSet extends androidx.constraintlayout.motion.widget.SplineSet {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setRotation(get(f));
        }
    }

    static class RotationXset extends androidx.constraintlayout.motion.widget.SplineSet {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setRotationX(get(f));
        }
    }

    static class RotationYset extends androidx.constraintlayout.motion.widget.SplineSet {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setRotationY(get(f));
        }
    }

    static class PathRotate extends androidx.constraintlayout.motion.widget.SplineSet {
        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
        }

        PathRotate() {
        }

        public void setPathRotate(android.view.View view, float f, double d, double d2) {
            view.setRotation(get(f) + ((float) java.lang.Math.toDegrees(java.lang.Math.atan2(d2, d))));
        }
    }

    static class ScaleXset extends androidx.constraintlayout.motion.widget.SplineSet {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setScaleX(get(f));
        }
    }

    static class ScaleYset extends androidx.constraintlayout.motion.widget.SplineSet {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setScaleY(get(f));
        }
    }

    static class TranslationXset extends androidx.constraintlayout.motion.widget.SplineSet {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setTranslationX(get(f));
        }
    }

    static class TranslationYset extends androidx.constraintlayout.motion.widget.SplineSet {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            view.setTranslationY(get(f));
        }
    }

    static class TranslationZset extends androidx.constraintlayout.motion.widget.SplineSet {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                view.setTranslationZ(get(f));
            }
        }
    }

    static class CustomSet extends androidx.constraintlayout.motion.widget.SplineSet {
        java.lang.String mAttributeName;
        android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(java.lang.String str, android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNoOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[iNoOfInterpValues];
            double[][] dArr2 = (double[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) double.class, size, iNoOfInterpValues);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i2);
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.mCurveFit = androidx.constraintlayout.motion.utils.CurveFit.get(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setPoint(int i, float f) {
            throw new java.lang.RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int i, androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i, constraintAttribute);
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            this.mCurveFit.getPos(f, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view, this.mTempValues);
        }
    }

    static class ProgressSet extends androidx.constraintlayout.motion.widget.SplineSet {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.widget.SplineSet
        public void setProperty(android.view.View view, float f) {
            if (view instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) view).setProgress(get(f));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            java.lang.reflect.Method method = null;
            try {
                method = view.getClass().getMethod("setProgress", java.lang.Float.TYPE);
            } catch (java.lang.NoSuchMethodException unused) {
                this.mNoMethod = true;
            }
            if (method != null) {
                try {
                    method.invoke(view, java.lang.Float.valueOf(get(f)));
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.e(androidx.constraintlayout.motion.widget.SplineSet.TAG, "unable to setProgress", e);
                } catch (java.lang.reflect.InvocationTargetException e2) {
                    android.util.Log.e(androidx.constraintlayout.motion.widget.SplineSet.TAG, "unable to setProgress", e2);
                }
            }
        }
    }

    private static class Sort {
        private Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[] fArr, int i, int i2) {
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

        private static int partition(int[] iArr, float[] fArr, int i, int i2) {
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

        private static void swap(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }
}
