package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
class MotionConstrainedPoint implements java.lang.Comparable<androidx.constraintlayout.motion.widget.MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final java.lang.String TAG = "MotionPaths";
    static java.lang.String[] names = {"position", "x", "y", io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, "pathRotate"};
    private float height;
    private androidx.constraintlayout.motion.utils.Easing mKeyFrameEasing;
    private float position;
    int visibility;
    private float width;
    private float x;
    private float y;
    private float alpha = 1.0f;
    int mVisibilityMode = 0;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> attributes = new java.util.LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];

    private boolean diff(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return java.lang.Float.isNaN(f) != java.lang.Float.isNaN(f2);
        }
        return java.lang.Math.abs(f - f2) > 1.0E-6f;
    }

    void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint, java.util.HashSet<java.lang.String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
        int i = this.visibility;
        int i2 = motionConstrainedPoint.visibility;
        if (i != i2 && this.mVisibilityMode == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add("rotation");
        }
        if (!java.lang.Float.isNaN(this.mPathRotate) || !java.lang.Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!java.lang.Float.isNaN(this.mProgress) || !java.lang.Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS);
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
    }

    void different(androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, java.lang.String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.x, motionConstrainedPoint.x);
        zArr[2] = zArr[2] | diff(this.y, motionConstrainedPoint.y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }

    void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 18) {
                dArr[i] = fArr[iArr[i2]];
                i++;
            }
        }
    }

    boolean hasCustomData(java.lang.String str) {
        return this.attributes.containsKey(str);
    }

    int getCustomDataCount(java.lang.String str) {
        return this.attributes.get(str).noOfInterpValues();
    }

    int getCustomData(java.lang.String str, double[] dArr, int i) {
        androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.noOfInterpValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNoOfInterpValues = constraintAttribute.noOfInterpValues();
        float[] fArr = new float[iNoOfInterpValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i2 = 0;
        while (i2 < iNoOfInterpValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return iNoOfInterpValues;
    }

    void setBounds(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.constraintlayout.motion.widget.MotionConstrainedPoint motionConstrainedPoint) {
        return java.lang.Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void applyParameters(android.view.View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.elevation = view.getElevation();
        }
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.translationZ = view.getTranslationZ();
        }
    }

    public void applyParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint) {
        this.mVisibilityMode = constraint.propertySet.mVisibilityMode;
        this.visibility = constraint.propertySet.visibility;
        this.alpha = (constraint.propertySet.visibility == 0 || this.mVisibilityMode != 0) ? constraint.propertySet.alpha : 0.0f;
        this.applyElevation = constraint.transform.applyElevation;
        this.elevation = constraint.transform.elevation;
        this.rotation = constraint.transform.rotation;
        this.rotationX = constraint.transform.rotationX;
        this.rotationY = constraint.transform.rotationY;
        this.scaleX = constraint.transform.scaleX;
        this.scaleY = constraint.transform.scaleY;
        this.mPivotX = constraint.transform.transformPivotX;
        this.mPivotY = constraint.transform.transformPivotY;
        this.translationX = constraint.transform.translationX;
        this.translationY = constraint.transform.translationY;
        this.translationZ = constraint.transform.translationZ;
        this.mKeyFrameEasing = androidx.constraintlayout.motion.utils.Easing.getInterpolator(constraint.motion.mTransitionEasing);
        this.mPathRotate = constraint.motion.mPathRotate;
        this.mDrawPath = constraint.motion.mDrawPath;
        this.mProgress = constraint.propertySet.mProgress;
        for (java.lang.String str : constraint.mCustomConstraints.keySet()) {
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.getType() != androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.SplineSet> map, int i) {
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.motion.widget.SplineSet splineSet = map.get(str);
            str.hashCode();
            byte b = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b = 1;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b = 2;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b = 3;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b = 4;
                    }
                    break;
                case -1001078227:
                    if (str.equals(androidx.core.app.NotificationCompat.CATEGORY_PROGRESS)) {
                        b = 5;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b = 6;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b = 7;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        b = 8;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        b = 9;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        b = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b = 11;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.rotationX) ? 0.0f : this.rotationX);
                    break;
                case 1:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.rotationY) ? 0.0f : this.rotationY);
                    break;
                case 2:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.translationX) ? 0.0f : this.translationX);
                    break;
                case 3:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.translationY) ? 0.0f : this.translationY);
                    break;
                case 4:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.translationZ) ? 0.0f : this.translationZ);
                    break;
                case 5:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.mProgress) ? 0.0f : this.mProgress);
                    break;
                case 6:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.scaleX) ? 1.0f : this.scaleX);
                    break;
                case 7:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.scaleY) ? 1.0f : this.scaleY);
                    break;
                case 8:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.rotation) ? 0.0f : this.rotation);
                    break;
                case 9:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.elevation) ? 0.0f : this.elevation);
                    break;
                case 10:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.mPathRotate) ? 0.0f : this.mPathRotate);
                    break;
                case 11:
                    splineSet.setPoint(i, java.lang.Float.isNaN(this.alpha) ? 1.0f : this.alpha);
                    break;
                default:
                    if (!str.startsWith("CUSTOM")) {
                        android.util.Log.e("MotionPaths", "UNKNOWN spline " + str);
                    } else {
                        java.lang.String str2 = str.split(",")[1];
                        if (!this.attributes.containsKey(str2)) {
                            android.util.Log.e("MotionPaths", "UNKNOWN customName " + str2);
                        } else {
                            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.attributes.get(str2);
                            if (splineSet instanceof androidx.constraintlayout.motion.widget.SplineSet.CustomSet) {
                                ((androidx.constraintlayout.motion.widget.SplineSet.CustomSet) splineSet).setPoint(i, constraintAttribute);
                            } else {
                                android.util.Log.e("MotionPaths", str + " splineSet not a CustomSet frame = " + i + ", value" + constraintAttribute.getValueToInterpolate() + splineSet);
                            }
                        }
                    }
                    break;
            }
        }
    }

    public void setState(android.view.View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    public void setState(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i) {
        setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        applyParameters(constraintSet.getParameters(i));
    }
}
