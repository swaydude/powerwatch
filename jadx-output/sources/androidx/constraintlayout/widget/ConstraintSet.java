package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_TO_BASELINE = 1;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final java.lang.String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    public static final int INVISIBLE = 4;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final java.lang.String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 80;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static android.util.SparseIntArray mapToConstant;
    private boolean mValidate;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mSavedAttributes = new java.util.HashMap<>();
    private boolean mForceId = true;
    private java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet.Constraint> mConstraints = new java.util.HashMap<>();

    private java.lang.String sideToString(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        mapToConstant = sparseIntArray;
        sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteX, 6);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteY, 7);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_begin, 17);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_end, 18);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_percent, 19);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_orientation, 27);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginLeft, 13);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginTop, 16);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginRight, 14);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginBottom, 11);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginStart, 15);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginEnd, 12);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_weight, 40);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_bias, 37);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_creator, 80);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_creator, 80);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_creator, 80);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_creator, 80);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_creator, 80);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginLeft, 24);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginRight, 28);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart, 31);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd, 8);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginTop, 34);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginBottom, 2);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_width, 23);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_height, 21);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_visibility, 22);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_alpha, 43);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_elevation, 44);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationX, 45);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationY, 46);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_rotation, 60);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleX, 47);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleY, 48);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotX, 49);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotY, 50);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationX, 51);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationY, 52);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_translationZ, 53);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_default, 54);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_default, 55);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_max, 56);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_max, 57);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_min, 58);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_min, 59);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircle, 61);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleRadius, 62);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleAngle, 63);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_animate_relativeTo, 64);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_transitionEasing, 65);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_drawPath, 66);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_transitionPathRotate, 67);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_motionStagger, 79);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_android_id, 38);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_progress, 68);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_percent, 69);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_percent, 70);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_chainUseRtl, 71);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierDirection, 72);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierMargin, 73);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_constraint_referenced_ids, 74);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_pathMotionArc, 76);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTag, 77);
        mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Constraint_visibilityMode, 78);
    }

    public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getParameters(int i) {
        return get(i);
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        for (java.lang.Integer num : constraintSet.mConstraints.keySet()) {
            int iIntValue = num.intValue();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = constraintSet.mConstraints.get(num);
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(iIntValue))) {
                this.mConstraints.put(java.lang.Integer.valueOf(iIntValue), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.mConstraints.get(java.lang.Integer.valueOf(iIntValue));
            if (!constraint2.layout.mApply) {
                constraint2.layout.copyFrom(constraint.layout);
            }
            if (!constraint2.propertySet.mApply) {
                constraint2.propertySet.copyFrom(constraint.propertySet);
            }
            if (!constraint2.transform.mApply) {
                constraint2.transform.copyFrom(constraint.transform);
            }
            if (!constraint2.motion.mApply) {
                constraint2.motion.copyFrom(constraint.motion);
            }
        }
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            if (!constraint.layout.mApply) {
                constraint.fillFrom(id, layoutParams);
                if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                    constraint.layout.mReferenceIds = ((androidx.constraintlayout.widget.ConstraintHelper) childAt).getReferencedIds();
                    if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                        androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                        constraint.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                        constraint.layout.mBarrierDirection = barrier.getType();
                        constraint.layout.mBarrierMargin = barrier.getMargin();
                    }
                }
                constraint.layout.mApply = true;
            }
            if (!constraint.propertySet.mApply) {
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.propertySet.mApply = true;
            }
            if (android.os.Build.VERSION.SDK_INT >= 17 && !constraint.transform.mApply) {
                constraint.transform.mApply = true;
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    constraint.transform.transformPivotX = pivotX;
                    constraint.transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    if (constraint.transform.applyElevation) {
                        constraint.transform.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        private static final int UNUSED = 76;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_PERCENT = 69;
        private static android.util.SparseIntArray mapToConstant;
        public java.lang.String mConstraintTag;
        public int mHeight;
        public java.lang.String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public java.lang.String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = -1;
        public int rightMargin = -1;
        public int topMargin = -1;
        public int bottomMargin = -1;
        public int endMargin = -1;
        public int startMargin = -1;
        public int goneLeftMargin = -1;
        public int goneTopMargin = -1;
        public int goneRightMargin = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneStartMargin = -1;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = -1;
        public int heightMax = -1;
        public int widthMin = -1;
        public int heightMin = -1;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr != null) {
                this.mReferenceIds = java.util.Arrays.copyOf(iArr, iArr.length);
            } else {
                this.mReferenceIds = null;
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteX, 6);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteY, 7);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_begin, 17);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_end, 18);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_percent, 19);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_orientation, 26);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginLeft, 13);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginTop, 16);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginRight, 14);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginBottom, 11);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginStart, 15);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginEnd, 12);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_weight, 38);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_bias, 36);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintDimensionRatio, 5);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_creator, 76);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_creator, 76);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_creator, 76);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_creator, 76);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_creator, 76);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginLeft, 23);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginRight, 27);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginStart, 30);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginEnd, 8);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginTop, 33);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginBottom, 2);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_width, 22);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_android_layout_height, 21);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircle, 61);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleRadius, 62);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleAngle, 63);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_percent, 69);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight_percent, 70);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_chainUseRtl, 71);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierDirection, 72);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierMargin, 73);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_constraint_referenced_ids, 74);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Layout);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = mapToConstant.get(index);
                switch (i2) {
                    case 1:
                        this.baselineToBaseline = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    default:
                        switch (i2) {
                            case 56:
                                this.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                break;
                            case 57:
                                this.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                break;
                            case 58:
                                this.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                break;
                            case 59:
                                this.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.circleConstraint = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.circleConstraint);
                                        break;
                                    case 62:
                                        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                        break;
                                    case 63:
                                        this.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                android.util.Log.e(androidx.constraintlayout.widget.ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case 72:
                                                this.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                                continue;
                                            case 73:
                                                this.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                                continue;
                                            case 74:
                                                this.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                                continue;
                                            case 76:
                                                break;
                                            case 77:
                                                this.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                android.util.Log.w(androidx.constraintlayout.widget.ConstraintSet.TAG, "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                                                continue;
                                        }
                                        android.util.Log.w(androidx.constraintlayout.widget.ConstraintSet.TAG, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static android.util.SparseIntArray mapToConstant;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Transform transform) {
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotation, 1);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotationX, 2);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_rotationY, 3);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_scaleX, 4);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_scaleY, 5);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotX, 6);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotY, 7);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationX, 8);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationY, 9);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_translationZ, 10);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Transform_android_elevation, 11);
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Transform);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = typedArrayObtainStyledAttributes.getFloat(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = typedArrayObtainStyledAttributes.getFloat(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = typedArrayObtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = typedArrayObtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        if (android.os.Build.VERSION.SDK_INT >= 21) {
                            this.translationZ = typedArrayObtainStyledAttributes.getDimension(index, this.translationZ);
                        }
                        break;
                    case 11:
                        if (android.os.Build.VERSION.SDK_INT >= 21) {
                            this.applyElevation = true;
                            this.elevation = typedArrayObtainStyledAttributes.getDimension(index, this.elevation);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_android_alpha) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_android_visibility) {
                    this.visibility = typedArrayObtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == androidx.constraintlayout.widget.R.styleable.PropertySet_motionProgress) {
                    this.mProgress = typedArrayObtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Motion {
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 6;
        private static final int PATH_MOTION_ARC = 2;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static android.util.SparseIntArray mapToConstant;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public java.lang.String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public float mPathRotate = Float.NaN;

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
        }

        static {
            android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.Motion_motionPathRotate, 1);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_pathMotionArc, 2);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_transitionEasing, 3);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_drawPath, 4);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_animate_relativeTo, 5);
            mapToConstant.append(androidx.constraintlayout.widget.R.styleable.Motion_motionStagger, 6);
        }

        void fillFromAttributeList(android.content.Context context, android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Motion);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.mTransitionEasing = androidx.constraintlayout.motion.utils.Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = androidx.constraintlayout.widget.ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Constraint {
        int mViewId;
        public final androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet = new androidx.constraintlayout.widget.ConstraintSet.PropertySet();
        public final androidx.constraintlayout.widget.ConstraintSet.Motion motion = new androidx.constraintlayout.widget.ConstraintSet.Motion();
        public final androidx.constraintlayout.widget.ConstraintSet.Layout layout = new androidx.constraintlayout.widget.ConstraintSet.Layout();
        public final androidx.constraintlayout.widget.ConstraintSet.Transform transform = new androidx.constraintlayout.widget.ConstraintSet.Transform();
        public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints = new java.util.HashMap<>();

        private androidx.constraintlayout.widget.ConstraintAttribute get(java.lang.String str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType) {
            if (this.mCustomConstraints.containsKey(str)) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str);
                if (constraintAttribute.getType() == attributeType) {
                    return constraintAttribute;
                }
                throw new java.lang.IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
            }
            androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute2 = new androidx.constraintlayout.widget.ConstraintAttribute(str, attributeType);
            this.mCustomConstraints.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(java.lang.String str, java.lang.String str2) {
            get(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(java.lang.String str, float f) {
            get(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(java.lang.String str, int i) {
            get(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorValue(java.lang.String str, int i) {
            get(str, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i);
        }

        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public androidx.constraintlayout.widget.ConstraintSet.Constraint m2clone() {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            return constraint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(androidx.constraintlayout.widget.ConstraintHelper constraintHelper, int i, androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i, layoutParams);
            if (constraintHelper instanceof androidx.constraintlayout.widget.Barrier) {
                this.layout.mHelperType = 1;
                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) constraintHelper;
                this.layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(int i, androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams) {
            fillFrom(i, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            this.transform.rotation = layoutParams.rotation;
            this.transform.rotationX = layoutParams.rotationX;
            this.transform.rotationY = layoutParams.rotationY;
            this.transform.scaleX = layoutParams.scaleX;
            this.transform.scaleY = layoutParams.scaleY;
            this.transform.transformPivotX = layoutParams.transformPivotX;
            this.transform.transformPivotY = layoutParams.transformPivotY;
            this.transform.translationX = layoutParams.translationX;
            this.transform.translationY = layoutParams.translationY;
            this.transform.translationZ = layoutParams.translationZ;
            this.transform.elevation = layoutParams.elevation;
            this.transform.applyElevation = layoutParams.applyElevation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFrom(int i, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i;
            this.layout.leftToLeft = layoutParams.leftToLeft;
            this.layout.leftToRight = layoutParams.leftToRight;
            this.layout.rightToLeft = layoutParams.rightToLeft;
            this.layout.rightToRight = layoutParams.rightToRight;
            this.layout.topToTop = layoutParams.topToTop;
            this.layout.topToBottom = layoutParams.topToBottom;
            this.layout.bottomToTop = layoutParams.bottomToTop;
            this.layout.bottomToBottom = layoutParams.bottomToBottom;
            this.layout.baselineToBaseline = layoutParams.baselineToBaseline;
            this.layout.startToEnd = layoutParams.startToEnd;
            this.layout.startToStart = layoutParams.startToStart;
            this.layout.endToStart = layoutParams.endToStart;
            this.layout.endToEnd = layoutParams.endToEnd;
            this.layout.horizontalBias = layoutParams.horizontalBias;
            this.layout.verticalBias = layoutParams.verticalBias;
            this.layout.dimensionRatio = layoutParams.dimensionRatio;
            this.layout.circleConstraint = layoutParams.circleConstraint;
            this.layout.circleRadius = layoutParams.circleRadius;
            this.layout.circleAngle = layoutParams.circleAngle;
            this.layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.layout.orientation = layoutParams.orientation;
            this.layout.guidePercent = layoutParams.guidePercent;
            this.layout.guideBegin = layoutParams.guideBegin;
            this.layout.guideEnd = layoutParams.guideEnd;
            this.layout.mWidth = layoutParams.width;
            this.layout.mHeight = layoutParams.height;
            this.layout.leftMargin = layoutParams.leftMargin;
            this.layout.rightMargin = layoutParams.rightMargin;
            this.layout.topMargin = layoutParams.topMargin;
            this.layout.bottomMargin = layoutParams.bottomMargin;
            this.layout.verticalWeight = layoutParams.verticalWeight;
            this.layout.horizontalWeight = layoutParams.horizontalWeight;
            this.layout.verticalChainStyle = layoutParams.verticalChainStyle;
            this.layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.layout.constrainedWidth = layoutParams.constrainedWidth;
            this.layout.constrainedHeight = layoutParams.constrainedHeight;
            this.layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            this.layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            this.layout.constrainedWidth = layoutParams.constrainedWidth;
            this.layout.widthMax = layoutParams.matchConstraintMaxWidth;
            this.layout.heightMax = layoutParams.matchConstraintMaxHeight;
            this.layout.widthMin = layoutParams.matchConstraintMinWidth;
            this.layout.heightMin = layoutParams.matchConstraintMinHeight;
            this.layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            this.layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            this.layout.mConstraintTag = layoutParams.constraintTag;
            this.layout.goneTopMargin = layoutParams.goneTopMargin;
            this.layout.goneBottomMargin = layoutParams.goneBottomMargin;
            this.layout.goneLeftMargin = layoutParams.goneLeftMargin;
            this.layout.goneRightMargin = layoutParams.goneRightMargin;
            this.layout.goneStartMargin = layoutParams.goneStartMargin;
            this.layout.goneEndMargin = layoutParams.goneEndMargin;
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                this.layout.endMargin = layoutParams.getMarginEnd();
                this.layout.startMargin = layoutParams.getMarginStart();
            }
        }

        public void applyTo(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.leftToLeft = this.layout.leftToLeft;
            layoutParams.leftToRight = this.layout.leftToRight;
            layoutParams.rightToLeft = this.layout.rightToLeft;
            layoutParams.rightToRight = this.layout.rightToRight;
            layoutParams.topToTop = this.layout.topToTop;
            layoutParams.topToBottom = this.layout.topToBottom;
            layoutParams.bottomToTop = this.layout.bottomToTop;
            layoutParams.bottomToBottom = this.layout.bottomToBottom;
            layoutParams.baselineToBaseline = this.layout.baselineToBaseline;
            layoutParams.startToEnd = this.layout.startToEnd;
            layoutParams.startToStart = this.layout.startToStart;
            layoutParams.endToStart = this.layout.endToStart;
            layoutParams.endToEnd = this.layout.endToEnd;
            layoutParams.leftMargin = this.layout.leftMargin;
            layoutParams.rightMargin = this.layout.rightMargin;
            layoutParams.topMargin = this.layout.topMargin;
            layoutParams.bottomMargin = this.layout.bottomMargin;
            layoutParams.goneStartMargin = this.layout.goneStartMargin;
            layoutParams.goneEndMargin = this.layout.goneEndMargin;
            layoutParams.goneTopMargin = this.layout.goneTopMargin;
            layoutParams.goneBottomMargin = this.layout.goneBottomMargin;
            layoutParams.horizontalBias = this.layout.horizontalBias;
            layoutParams.verticalBias = this.layout.verticalBias;
            layoutParams.circleConstraint = this.layout.circleConstraint;
            layoutParams.circleRadius = this.layout.circleRadius;
            layoutParams.circleAngle = this.layout.circleAngle;
            layoutParams.dimensionRatio = this.layout.dimensionRatio;
            layoutParams.editorAbsoluteX = this.layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = this.layout.editorAbsoluteY;
            layoutParams.verticalWeight = this.layout.verticalWeight;
            layoutParams.horizontalWeight = this.layout.horizontalWeight;
            layoutParams.verticalChainStyle = this.layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = this.layout.horizontalChainStyle;
            layoutParams.constrainedWidth = this.layout.constrainedWidth;
            layoutParams.constrainedHeight = this.layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = this.layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = this.layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = this.layout.widthMax;
            layoutParams.matchConstraintMaxHeight = this.layout.heightMax;
            layoutParams.matchConstraintMinWidth = this.layout.widthMin;
            layoutParams.matchConstraintMinHeight = this.layout.heightMin;
            layoutParams.matchConstraintPercentWidth = this.layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = this.layout.heightPercent;
            layoutParams.orientation = this.layout.orientation;
            layoutParams.guidePercent = this.layout.guidePercent;
            layoutParams.guideBegin = this.layout.guideBegin;
            layoutParams.guideEnd = this.layout.guideEnd;
            layoutParams.width = this.layout.mWidth;
            layoutParams.height = this.layout.mHeight;
            if (this.layout.mConstraintTag != null) {
                layoutParams.constraintTag = this.layout.mConstraintTag;
            }
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.layout.startMargin);
                layoutParams.setMarginEnd(this.layout.endMargin);
            }
            layoutParams.validate();
        }
    }

    public void clone(android.content.Context context, int i) {
        clone((androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(context).inflate(i, (android.view.ViewGroup) null));
    }

    public void clone(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (java.lang.Integer num : constraintSet.mConstraints.keySet()) {
            this.mConstraints.put(num, constraintSet.mConstraints.get(num).m2clone());
        }
    }

    public void clone(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            constraint.mCustomConstraints = androidx.constraintlayout.widget.ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
            constraint.fillFrom(id, layoutParams);
            constraint.propertySet.visibility = childAt.getVisibility();
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    constraint.transform.transformPivotX = pivotX;
                    constraint.transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    if (constraint.transform.applyElevation) {
                        constraint.transform.elevation = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                constraint.layout.mBarrierAllowsGoneWidgets = barrier.allowsGoneWidget();
                constraint.layout.mReferenceIds = barrier.getReferencedIds();
                constraint.layout.mBarrierDirection = barrier.getType();
                constraint.layout.mBarrierMargin = barrier.getMargin();
            }
        }
    }

    public void clone(androidx.constraintlayout.widget.Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraints.getChildAt(i);
            androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams = (androidx.constraintlayout.widget.Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                this.mConstraints.put(java.lang.Integer.valueOf(id), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
            }
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                constraint.fillFromConstraints((androidx.constraintlayout.widget.ConstraintHelper) childAt, id, layoutParams);
            }
            constraint.fillFromConstraints(id, layoutParams);
        }
    }

    public void applyTo(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
    }

    public void applyToWithoutCustom(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void applyCustomAttributes(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                if (this.mForceId && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                    androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(childAt, this.mConstraints.get(java.lang.Integer.valueOf(id)).mCustomConstraints);
                }
            } else {
                android.util.Log.v(TAG, "id unknown " + androidx.constraintlayout.motion.widget.Debug.getName(childAt));
            }
        }
    }

    public void applyToHelper(androidx.constraintlayout.widget.ConstraintHelper constraintHelper, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> sparseArray) {
        int id = constraintHelper.getId();
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.HelperWidget) {
                constraintHelper.loadParameters(constraint, (androidx.constraintlayout.solver.widgets.HelperWidget) constraintWidget, layoutParams, sparseArray);
            }
        }
    }

    public void applyToLayoutParams(int i, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            this.mConstraints.get(java.lang.Integer.valueOf(i)).applyTo(layoutParams);
        }
    }

    void applyToInternal(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashSet<java.lang.Integer> hashSet = new java.util.HashSet(this.mConstraints.keySet());
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                if (this.mForceId && id == -1) {
                    throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.mConstraints.containsKey(java.lang.Integer.valueOf(id))) {
                        hashSet.remove(java.lang.Integer.valueOf(id));
                        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                            constraint.layout.mHelperType = 1;
                        }
                        if (constraint.layout.mHelperType != -1 && constraint.layout.mHelperType == 1) {
                            androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(constraint.layout.mBarrierDirection);
                            barrier.setMargin(constraint.layout.mBarrierMargin);
                            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                            if (constraint.layout.mReferenceIds != null) {
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            } else if (constraint.layout.mReferenceIdString != null) {
                                constraint.layout.mReferenceIds = convertReferenceString(barrier, constraint.layout.mReferenceIdString);
                                barrier.setReferencedIds(constraint.layout.mReferenceIds);
                            }
                        }
                        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.validate();
                        constraint.applyTo(layoutParams);
                        if (z) {
                            androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                        }
                        childAt.setLayoutParams(layoutParams);
                        if (constraint.propertySet.mVisibilityMode == 0) {
                            childAt.setVisibility(constraint.propertySet.visibility);
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 17) {
                            childAt.setAlpha(constraint.propertySet.alpha);
                            childAt.setRotation(constraint.transform.rotation);
                            childAt.setRotationX(constraint.transform.rotationX);
                            childAt.setRotationY(constraint.transform.rotationY);
                            childAt.setScaleX(constraint.transform.scaleX);
                            childAt.setScaleY(constraint.transform.scaleY);
                            if (!java.lang.Float.isNaN(constraint.transform.transformPivotX)) {
                                childAt.setPivotX(constraint.transform.transformPivotX);
                            }
                            if (!java.lang.Float.isNaN(constraint.transform.transformPivotY)) {
                                childAt.setPivotY(constraint.transform.transformPivotY);
                            }
                            childAt.setTranslationX(constraint.transform.translationX);
                            childAt.setTranslationY(constraint.transform.translationY);
                            if (android.os.Build.VERSION.SDK_INT >= 21) {
                                childAt.setTranslationZ(constraint.transform.translationZ);
                                if (constraint.transform.applyElevation) {
                                    childAt.setElevation(constraint.transform.elevation);
                                }
                            }
                        }
                    } else {
                        android.util.Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            } else {
                android.util.Log.w(TAG, "id unknown " + androidx.constraintlayout.motion.widget.Debug.getName(childAt));
            }
        }
        for (java.lang.Integer num : hashSet) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2.layout.mHelperType != -1 && constraint2.layout.mHelperType == 1) {
                androidx.constraintlayout.widget.Barrier barrier2 = new androidx.constraintlayout.widget.Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (constraint2.layout.mReferenceIds != null) {
                    barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                } else if (constraint2.layout.mReferenceIdString != null) {
                    constraint2.layout.mReferenceIds = convertReferenceString(barrier2, constraint2.layout.mReferenceIdString);
                    barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                }
                barrier2.setType(constraint2.layout.mBarrierDirection);
                barrier2.setMargin(constraint2.layout.mBarrierMargin);
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.validateParams();
                constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
            }
            if (constraint2.layout.mIsGuideline) {
                androidx.constraintlayout.widget.Guideline guideline = new androidx.constraintlayout.widget.Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
            }
        }
    }

    public void center(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (i7 < 0) {
            throw new java.lang.IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new java.lang.IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i3 == 1 || i3 == 2) {
            connect(i, 1, i2, i3, i4);
            connect(i, 2, i5, i6, i7);
            this.mConstraints.get(java.lang.Integer.valueOf(i)).layout.horizontalBias = f;
        } else if (i3 == 6 || i3 == 7) {
            connect(i, 6, i2, i3, i4);
            connect(i, 7, i5, i6, i7);
            this.mConstraints.get(java.lang.Integer.valueOf(i)).layout.horizontalBias = f;
        } else {
            connect(i, 3, i2, i3, i4);
            connect(i, 4, i5, i6, i7);
            this.mConstraints.get(java.lang.Integer.valueOf(i)).layout.verticalBias = f;
        }
    }

    public void centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 1, i2, i3, i4);
        connect(i, 2, i5, i6, i7);
        this.mConstraints.get(java.lang.Integer.valueOf(i)).layout.horizontalBias = f;
    }

    public void centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 6, i2, i3, i4);
        connect(i, 7, i5, i6, i7);
        this.mConstraints.get(java.lang.Integer.valueOf(i)).layout.horizontalBias = f;
    }

    public void centerVertically(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        this.mConstraints.get(java.lang.Integer.valueOf(i)).layout.verticalBias = f;
    }

    public void createVerticalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.verticalWeight = fArr[0];
        }
        get(iArr[0]).layout.verticalChainStyle = i5;
        connect(iArr[0], 3, i, i2, 0);
        for (int i6 = 1; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            int i8 = i6 - 1;
            connect(iArr[i6], 3, iArr[i8], 4, 0);
            connect(iArr[i8], 4, iArr[i6], 3, 0);
            if (fArr != null) {
                get(iArr[i6]).layout.verticalWeight = fArr[i6];
            }
        }
        connect(iArr[iArr.length - 1], 4, i3, i4, 0);
    }

    public void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    public void createHorizontalChainRtl(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    private void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length < 2) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        get(iArr[0]).layout.horizontalChainStyle = i5;
        connect(iArr[0], i6, i, i2, -1);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            int i10 = i8 - 1;
            connect(iArr[i8], i6, iArr[i10], i7, -1);
            connect(iArr[i10], i7, iArr[i8], i6, -1);
            if (fArr != null) {
                get(iArr[i8]).layout.horizontalWeight = fArr[i8];
            }
        }
        connect(iArr[iArr.length - 1], i7, i3, i4, -1);
    }

    public void connect(int i, int i2, int i3, int i4, int i5) {
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            this.mConstraints.put(java.lang.Integer.valueOf(i), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    constraint.layout.leftToLeft = i3;
                    constraint.layout.leftToRight = -1;
                } else if (i4 == 2) {
                    constraint.layout.leftToRight = i3;
                    constraint.layout.leftToLeft = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("Left to " + sideToString(i4) + " undefined");
                }
                constraint.layout.leftMargin = i5;
                return;
            case 2:
                if (i4 == 1) {
                    constraint.layout.rightToLeft = i3;
                    constraint.layout.rightToRight = -1;
                } else if (i4 == 2) {
                    constraint.layout.rightToRight = i3;
                    constraint.layout.rightToLeft = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.layout.rightMargin = i5;
                return;
            case 3:
                if (i4 == 3) {
                    constraint.layout.topToTop = i3;
                    constraint.layout.topToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                } else if (i4 == 4) {
                    constraint.layout.topToBottom = i3;
                    constraint.layout.topToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.layout.topMargin = i5;
                return;
            case 4:
                if (i4 == 4) {
                    constraint.layout.bottomToBottom = i3;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                } else if (i4 == 3) {
                    constraint.layout.bottomToTop = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.layout.bottomMargin = i5;
                return;
            case 5:
                if (i4 == 5) {
                    constraint.layout.baselineToBaseline = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    constraint.layout.startToStart = i3;
                    constraint.layout.startToEnd = -1;
                } else if (i4 == 7) {
                    constraint.layout.startToEnd = i3;
                    constraint.layout.startToStart = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.layout.startMargin = i5;
                return;
            case 7:
                if (i4 == 7) {
                    constraint.layout.endToEnd = i3;
                    constraint.layout.endToStart = -1;
                } else if (i4 == 6) {
                    constraint.layout.endToStart = i3;
                    constraint.layout.endToEnd = -1;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.layout.endMargin = i5;
                return;
            default:
                throw new java.lang.IllegalArgumentException(sideToString(i2) + " to " + sideToString(i4) + " unknown");
        }
    }

    public void connect(int i, int i2, int i3, int i4) {
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            this.mConstraints.put(java.lang.Integer.valueOf(i), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    constraint.layout.leftToLeft = i3;
                    constraint.layout.leftToRight = -1;
                    return;
                } else if (i4 == 2) {
                    constraint.layout.leftToRight = i3;
                    constraint.layout.leftToLeft = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("left to " + sideToString(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    constraint.layout.rightToLeft = i3;
                    constraint.layout.rightToRight = -1;
                    return;
                } else if (i4 == 2) {
                    constraint.layout.rightToRight = i3;
                    constraint.layout.rightToLeft = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    constraint.layout.topToTop = i3;
                    constraint.layout.topToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    return;
                } else if (i4 == 4) {
                    constraint.layout.topToBottom = i3;
                    constraint.layout.topToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    constraint.layout.bottomToBottom = i3;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.baselineToBaseline = -1;
                    return;
                } else if (i4 == 3) {
                    constraint.layout.bottomToTop = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.baselineToBaseline = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    constraint.layout.baselineToBaseline = i3;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topToBottom = -1;
                    return;
                }
                throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    constraint.layout.startToStart = i3;
                    constraint.layout.startToEnd = -1;
                    return;
                } else if (i4 == 7) {
                    constraint.layout.startToEnd = i3;
                    constraint.layout.startToStart = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    constraint.layout.endToEnd = i3;
                    constraint.layout.endToStart = -1;
                    return;
                } else if (i4 == 6) {
                    constraint.layout.endToStart = i3;
                    constraint.layout.endToEnd = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            default:
                throw new java.lang.IllegalArgumentException(sideToString(i2) + " to " + sideToString(i4) + " unknown");
        }
    }

    public void centerHorizontally(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    public void clear(int i) {
        this.mConstraints.remove(java.lang.Integer.valueOf(i));
    }

    public void clear(int i, int i2) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(i));
            switch (i2) {
                case 1:
                    constraint.layout.leftToRight = -1;
                    constraint.layout.leftToLeft = -1;
                    constraint.layout.leftMargin = -1;
                    constraint.layout.goneLeftMargin = -1;
                    return;
                case 2:
                    constraint.layout.rightToRight = -1;
                    constraint.layout.rightToLeft = -1;
                    constraint.layout.rightMargin = -1;
                    constraint.layout.goneRightMargin = -1;
                    return;
                case 3:
                    constraint.layout.topToBottom = -1;
                    constraint.layout.topToTop = -1;
                    constraint.layout.topMargin = -1;
                    constraint.layout.goneTopMargin = -1;
                    return;
                case 4:
                    constraint.layout.bottomToTop = -1;
                    constraint.layout.bottomToBottom = -1;
                    constraint.layout.bottomMargin = -1;
                    constraint.layout.goneBottomMargin = -1;
                    return;
                case 5:
                    constraint.layout.baselineToBaseline = -1;
                    return;
                case 6:
                    constraint.layout.startToEnd = -1;
                    constraint.layout.startToStart = -1;
                    constraint.layout.startMargin = -1;
                    constraint.layout.goneStartMargin = -1;
                    return;
                case 7:
                    constraint.layout.endToStart = -1;
                    constraint.layout.endToEnd = -1;
                    constraint.layout.endMargin = -1;
                    constraint.layout.goneEndMargin = -1;
                    return;
                default:
                    throw new java.lang.IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void setMargin(int i, int i2, int i3) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.layout.leftMargin = i3;
                return;
            case 2:
                constraint.layout.rightMargin = i3;
                return;
            case 3:
                constraint.layout.topMargin = i3;
                return;
            case 4:
                constraint.layout.bottomMargin = i3;
                return;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.layout.startMargin = i3;
                return;
            case 7:
                constraint.layout.endMargin = i3;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setGoneMargin(int i, int i2, int i3) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.layout.goneLeftMargin = i3;
                return;
            case 2:
                constraint.layout.goneRightMargin = i3;
                return;
            case 3:
                constraint.layout.goneTopMargin = i3;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i3;
                return;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.layout.goneStartMargin = i3;
                return;
            case 7:
                constraint.layout.goneEndMargin = i3;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void setHorizontalBias(int i, float f) {
        get(i).layout.horizontalBias = f;
    }

    public void setVerticalBias(int i, float f) {
        get(i).layout.verticalBias = f;
    }

    public void setDimensionRatio(int i, java.lang.String str) {
        get(i).layout.dimensionRatio = str;
    }

    public void setVisibility(int i, int i2) {
        get(i).propertySet.visibility = i2;
    }

    public void setVisibilityMode(int i, int i2) {
        get(i).propertySet.mVisibilityMode = i2;
    }

    public int getVisibilityMode(int i) {
        return get(i).propertySet.mVisibilityMode;
    }

    public int getVisibility(int i) {
        return get(i).propertySet.visibility;
    }

    public int getHeight(int i) {
        return get(i).layout.mHeight;
    }

    public int getWidth(int i) {
        return get(i).layout.mWidth;
    }

    public void setAlpha(int i, float f) {
        get(i).propertySet.alpha = f;
    }

    public boolean getApplyElevation(int i) {
        return get(i).transform.applyElevation;
    }

    public void setApplyElevation(int i, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            get(i).transform.applyElevation = z;
        }
    }

    public void setElevation(int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            get(i).transform.elevation = f;
            get(i).transform.applyElevation = true;
        }
    }

    public void setRotation(int i, float f) {
        get(i).transform.rotation = f;
    }

    public void setRotationX(int i, float f) {
        get(i).transform.rotationX = f;
    }

    public void setRotationY(int i, float f) {
        get(i).transform.rotationY = f;
    }

    public void setScaleX(int i, float f) {
        get(i).transform.scaleX = f;
    }

    public void setScaleY(int i, float f) {
        get(i).transform.scaleY = f;
    }

    public void setTransformPivotX(int i, float f) {
        get(i).transform.transformPivotX = f;
    }

    public void setTransformPivotY(int i, float f) {
        get(i).transform.transformPivotY = f;
    }

    public void setTransformPivot(int i, float f, float f2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        constraint.transform.transformPivotY = f2;
        constraint.transform.transformPivotX = f;
    }

    public void setTranslationX(int i, float f) {
        get(i).transform.translationX = f;
    }

    public void setTranslationY(int i, float f) {
        get(i).transform.translationY = f;
    }

    public void setTranslation(int i, float f, float f2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        constraint.transform.translationX = f;
        constraint.transform.translationY = f2;
    }

    public void setTranslationZ(int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            get(i).transform.translationZ = f;
        }
    }

    public void setEditorAbsoluteX(int i, int i2) {
        get(i).layout.editorAbsoluteX = i2;
    }

    public void setEditorAbsoluteY(int i, int i2) {
        get(i).layout.editorAbsoluteY = i2;
    }

    public void constrainHeight(int i, int i2) {
        get(i).layout.mHeight = i2;
    }

    public void constrainWidth(int i, int i2) {
        get(i).layout.mWidth = i2;
    }

    public void constrainCircle(int i, int i2, int i3, float f) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        constraint.layout.circleConstraint = i2;
        constraint.layout.circleRadius = i3;
        constraint.layout.circleAngle = f;
    }

    public void constrainMaxHeight(int i, int i2) {
        get(i).layout.heightMax = i2;
    }

    public void constrainMaxWidth(int i, int i2) {
        get(i).layout.widthMax = i2;
    }

    public void constrainMinHeight(int i, int i2) {
        get(i).layout.heightMin = i2;
    }

    public void constrainMinWidth(int i, int i2) {
        get(i).layout.widthMin = i2;
    }

    public void constrainPercentWidth(int i, float f) {
        get(i).layout.widthPercent = f;
    }

    public void constrainPercentHeight(int i, float f) {
        get(i).layout.heightPercent = f;
    }

    public void constrainDefaultHeight(int i, int i2) {
        get(i).layout.heightDefault = i2;
    }

    public void constrainDefaultWidth(int i, int i2) {
        get(i).layout.widthDefault = i2;
    }

    public void setHorizontalWeight(int i, float f) {
        get(i).layout.horizontalWeight = f;
    }

    public void setVerticalWeight(int i, float f) {
        get(i).layout.verticalWeight = f;
    }

    public void setHorizontalChainStyle(int i, int i2) {
        get(i).layout.horizontalChainStyle = i2;
    }

    public void setVerticalChainStyle(int i, int i2) {
        get(i).layout.verticalChainStyle = i2;
    }

    public void addToHorizontalChain(int i, int i2, int i3) {
        connect(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        connect(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            connect(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            connect(i3, 1, i, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i, int i2, int i3) {
        connect(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        connect(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            connect(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            connect(i3, 6, i, 7, 0);
        }
    }

    public void addToVerticalChain(int i, int i2, int i3) {
        connect(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        connect(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            connect(i2, 4, i, 3, 0);
        }
        if (i2 != 0) {
            connect(i3, 3, i, 4, 0);
        }
    }

    public void removeFromVerticalChain(int i) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(i));
            int i2 = constraint.layout.topToBottom;
            int i3 = constraint.layout.bottomToTop;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    connect(i2, 4, i3, 3, 0);
                    connect(i3, 3, i2, 4, 0);
                } else if (i2 != -1 || i3 != -1) {
                    if (constraint.layout.bottomToBottom != -1) {
                        connect(i2, 4, constraint.layout.bottomToBottom, 4, 0);
                    } else if (constraint.layout.topToTop != -1) {
                        connect(i3, 3, constraint.layout.topToTop, 3, 0);
                    }
                }
            }
        }
        clear(i, 3);
        clear(i, 4);
    }

    public void removeFromHorizontalChain(int i) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = this.mConstraints.get(java.lang.Integer.valueOf(i));
            int i2 = constraint.layout.leftToRight;
            int i3 = constraint.layout.rightToLeft;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    connect(i2, 2, i3, 1, 0);
                    connect(i3, 1, i2, 2, 0);
                } else if (i2 != -1 || i3 != -1) {
                    if (constraint.layout.rightToRight != -1) {
                        connect(i2, 2, constraint.layout.rightToRight, 2, 0);
                    } else if (constraint.layout.leftToLeft != -1) {
                        connect(i3, 1, constraint.layout.leftToLeft, 1, 0);
                    }
                }
                clear(i, 1);
                clear(i, 2);
                return;
            }
            int i4 = constraint.layout.startToEnd;
            int i5 = constraint.layout.endToStart;
            if (i4 != -1 || i5 != -1) {
                if (i4 != -1 && i5 != -1) {
                    connect(i4, 7, i5, 6, 0);
                    connect(i5, 6, i2, 7, 0);
                } else if (i2 != -1 || i5 != -1) {
                    if (constraint.layout.rightToRight != -1) {
                        connect(i2, 7, constraint.layout.rightToRight, 7, 0);
                    } else if (constraint.layout.leftToLeft != -1) {
                        connect(i5, 6, constraint.layout.leftToLeft, 6, 0);
                    }
                }
            }
            clear(i, 6);
            clear(i, 7);
        }
    }

    public void create(int i, int i2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        constraint.layout.mIsGuideline = true;
        constraint.layout.orientation = i2;
    }

    public void createBarrier(int i, int i2, int i3, int... iArr) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = get(i);
        constraint.layout.mHelperType = 1;
        constraint.layout.mBarrierDirection = i2;
        constraint.layout.mBarrierMargin = i3;
        constraint.layout.mIsGuideline = false;
        constraint.layout.mReferenceIds = iArr;
    }

    public void setGuidelineBegin(int i, int i2) {
        get(i).layout.guideBegin = i2;
        get(i).layout.guideEnd = -1;
        get(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i, int i2) {
        get(i).layout.guideEnd = i2;
        get(i).layout.guideBegin = -1;
        get(i).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i, float f) {
        get(i).layout.guidePercent = f;
        get(i).layout.guideEnd = -1;
        get(i).layout.guideBegin = -1;
    }

    public void setBarrierType(int i, int i2) {
        get(i).layout.mHelperType = i2;
    }

    public void removeAttribute(java.lang.String str) {
        this.mSavedAttributes.remove(str);
    }

    public void setIntValue(int i, java.lang.String str, int i2) {
        get(i).setIntValue(str, i2);
    }

    public void setColorValue(int i, java.lang.String str, int i2) {
        get(i).setColorValue(str, i2);
    }

    public void setFloatValue(int i, java.lang.String str, float f) {
        get(i).setFloatValue(str, f);
    }

    public void setStringValue(int i, java.lang.String str, java.lang.String str2) {
        get(i).setStringValue(str, str2);
    }

    private void addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType attributeType, java.lang.String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.mSavedAttributes.containsKey(strArr[i])) {
                androidx.constraintlayout.widget.ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i]);
                if (constraintAttribute.getType() != attributeType) {
                    throw new java.lang.IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.getType().name());
                }
            } else {
                this.mSavedAttributes.put(strArr[i], new androidx.constraintlayout.widget.ConstraintAttribute(strArr[i], attributeType));
            }
        }
    }

    public void parseIntAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] strArrSplit = str.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length == 2) {
                constraint.setFloatValue(strArrSplit2[0], java.lang.Integer.decode(strArrSplit2[1]).intValue());
            } else {
                android.util.Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            }
        }
    }

    public void parseColorAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] strArrSplit = str.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length == 2) {
                constraint.setColorValue(strArrSplit2[0], android.graphics.Color.parseColor(strArrSplit2[1]));
            } else {
                android.util.Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            }
        }
    }

    public void parseFloatAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] strArrSplit = str.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            java.lang.String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length == 2) {
                constraint.setFloatValue(strArrSplit2[0], java.lang.Float.parseFloat(strArrSplit2[1]));
            } else {
                android.util.Log.w(TAG, " Unable to parse " + strArrSplit[i]);
            }
        }
    }

    public void parseStringAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, java.lang.String str) {
        java.lang.String[] strArrSplitString = splitString(str);
        for (int i = 0; i < strArrSplitString.length; i++) {
            java.lang.String[] strArrSplit = strArrSplitString[i].split("=");
            android.util.Log.w(TAG, " Unable to parse " + strArrSplitString[i]);
            constraint.setStringValue(strArrSplit[0], strArrSplit[1]);
        }
    }

    private static java.lang.String[] splitString(java.lang.String str) {
        char[] charArray = str.toCharArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (charArray[i2] == ',' && !z) {
                arrayList.add(new java.lang.String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (charArray[i2] == '\"') {
                z = !z;
            }
        }
        arrayList.add(new java.lang.String(charArray, i, charArray.length - i));
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public void addIntAttributes(java.lang.String... strArr) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addColorAttributes(java.lang.String... strArr) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(java.lang.String... strArr) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addStringAttributes(java.lang.String... strArr) {
        addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint get(int i) {
        if (!this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            this.mConstraints.put(java.lang.Integer.valueOf(i), new androidx.constraintlayout.widget.ConstraintSet.Constraint());
        }
        return this.mConstraints.get(java.lang.Integer.valueOf(i));
    }

    public void load(android.content.Context context, int i) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    androidx.constraintlayout.widget.ConstraintSet.Constraint constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintFillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(java.lang.Integer.valueOf(constraintFillFromAttributeList.mViewId), constraintFillFromAttributeList);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    public void load(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraintFillFromAttributeList;
        try {
            int eventType = xmlPullParser.getEventType();
            androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                constraintFillFromAttributeList.layout.mIsGuideline = true;
                                constraintFillFromAttributeList.layout.mApply = true;
                                break;
                            case "Barrier":
                                constraintFillFromAttributeList = fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                constraintFillFromAttributeList.layout.mHelperType = 1;
                                break;
                            case "PropertySet":
                                if (constraint == null) {
                                    throw new java.lang.RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraint.propertySet.fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Transform":
                                if (constraint == null) {
                                    throw new java.lang.RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraint.transform.fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Layout":
                                if (constraint == null) {
                                    throw new java.lang.RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraint.layout.fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "Motion":
                                if (constraint == null) {
                                    throw new java.lang.RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                constraint.motion.fillFromAttributeList(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                continue;
                                break;
                                break;
                            case "CustomAttribute":
                                if (constraint == null) {
                                    throw new java.lang.RuntimeException(ERROR_MESSAGE + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.ConstraintAttribute.parse(context, xmlPullParser, constraint.mCustomConstraints);
                                continue;
                                break;
                                break;
                            default:
                                continue;
                                break;
                        }
                        constraint = constraintFillFromAttributeList;
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        java.lang.String name = xmlPullParser.getName();
                        if (TAG.equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.mConstraints.put(java.lang.Integer.valueOf(constraint.mViewId), constraint);
                            constraint = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lookupID(android.content.res.TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint fillFromAttributeList(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint = new androidx.constraintlayout.widget.ConstraintSet.Constraint();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Constraint);
        populateConstraint(context, constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    private void populateConstraint(android.content.Context context, androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, android.content.res.TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != androidx.constraintlayout.widget.R.styleable.Constraint_android_id) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            int i2 = mapToConstant.get(index);
            switch (i2) {
                case 1:
                    constraint.layout.baselineToBaseline = lookupID(typedArray, index, constraint.layout.baselineToBaseline);
                    break;
                case 2:
                    constraint.layout.bottomMargin = typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin);
                    break;
                case 3:
                    constraint.layout.bottomToBottom = lookupID(typedArray, index, constraint.layout.bottomToBottom);
                    break;
                case 4:
                    constraint.layout.bottomToTop = lookupID(typedArray, index, constraint.layout.bottomToTop);
                    break;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    break;
                case 6:
                    constraint.layout.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX);
                    break;
                case 7:
                    constraint.layout.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY);
                    break;
                case 8:
                    constraint.layout.endMargin = typedArray.getDimensionPixelSize(index, constraint.layout.endMargin);
                    break;
                case 9:
                    constraint.layout.endToEnd = lookupID(typedArray, index, constraint.layout.endToEnd);
                    break;
                case 10:
                    constraint.layout.endToStart = lookupID(typedArray, index, constraint.layout.endToStart);
                    break;
                case 11:
                    constraint.layout.goneBottomMargin = typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin);
                    break;
                case 12:
                    constraint.layout.goneEndMargin = typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin);
                    break;
                case 13:
                    constraint.layout.goneLeftMargin = typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin);
                    break;
                case 14:
                    constraint.layout.goneRightMargin = typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin);
                    break;
                case 15:
                    constraint.layout.goneStartMargin = typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin);
                    break;
                case 16:
                    constraint.layout.goneTopMargin = typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin);
                    break;
                case 17:
                    constraint.layout.guideBegin = typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin);
                    break;
                case 18:
                    constraint.layout.guideEnd = typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd);
                    break;
                case 19:
                    constraint.layout.guidePercent = typedArray.getFloat(index, constraint.layout.guidePercent);
                    break;
                case 20:
                    constraint.layout.horizontalBias = typedArray.getFloat(index, constraint.layout.horizontalBias);
                    break;
                case 21:
                    constraint.layout.mHeight = typedArray.getLayoutDimension(index, constraint.layout.mHeight);
                    break;
                case 22:
                    constraint.propertySet.visibility = typedArray.getInt(index, constraint.propertySet.visibility);
                    constraint.propertySet.visibility = VISIBILITY_FLAGS[constraint.propertySet.visibility];
                    break;
                case 23:
                    constraint.layout.mWidth = typedArray.getLayoutDimension(index, constraint.layout.mWidth);
                    break;
                case 24:
                    constraint.layout.leftMargin = typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin);
                    break;
                case 25:
                    constraint.layout.leftToLeft = lookupID(typedArray, index, constraint.layout.leftToLeft);
                    break;
                case 26:
                    constraint.layout.leftToRight = lookupID(typedArray, index, constraint.layout.leftToRight);
                    break;
                case 27:
                    constraint.layout.orientation = typedArray.getInt(index, constraint.layout.orientation);
                    break;
                case 28:
                    constraint.layout.rightMargin = typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin);
                    break;
                case 29:
                    constraint.layout.rightToLeft = lookupID(typedArray, index, constraint.layout.rightToLeft);
                    break;
                case 30:
                    constraint.layout.rightToRight = lookupID(typedArray, index, constraint.layout.rightToRight);
                    break;
                case 31:
                    constraint.layout.startMargin = typedArray.getDimensionPixelSize(index, constraint.layout.startMargin);
                    break;
                case 32:
                    constraint.layout.startToEnd = lookupID(typedArray, index, constraint.layout.startToEnd);
                    break;
                case 33:
                    constraint.layout.startToStart = lookupID(typedArray, index, constraint.layout.startToStart);
                    break;
                case 34:
                    constraint.layout.topMargin = typedArray.getDimensionPixelSize(index, constraint.layout.topMargin);
                    break;
                case 35:
                    constraint.layout.topToBottom = lookupID(typedArray, index, constraint.layout.topToBottom);
                    break;
                case 36:
                    constraint.layout.topToTop = lookupID(typedArray, index, constraint.layout.topToTop);
                    break;
                case 37:
                    constraint.layout.verticalBias = typedArray.getFloat(index, constraint.layout.verticalBias);
                    break;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    break;
                case 39:
                    constraint.layout.horizontalWeight = typedArray.getFloat(index, constraint.layout.horizontalWeight);
                    break;
                case 40:
                    constraint.layout.verticalWeight = typedArray.getFloat(index, constraint.layout.verticalWeight);
                    break;
                case 41:
                    constraint.layout.horizontalChainStyle = typedArray.getInt(index, constraint.layout.horizontalChainStyle);
                    break;
                case 42:
                    constraint.layout.verticalChainStyle = typedArray.getInt(index, constraint.layout.verticalChainStyle);
                    break;
                case 43:
                    constraint.propertySet.alpha = typedArray.getFloat(index, constraint.propertySet.alpha);
                    break;
                case 44:
                    if (android.os.Build.VERSION.SDK_INT >= 21) {
                        constraint.transform.applyElevation = true;
                        constraint.transform.elevation = typedArray.getDimension(index, constraint.transform.elevation);
                    }
                    break;
                case 45:
                    constraint.transform.rotationX = typedArray.getFloat(index, constraint.transform.rotationX);
                    break;
                case 46:
                    constraint.transform.rotationY = typedArray.getFloat(index, constraint.transform.rotationY);
                    break;
                case 47:
                    constraint.transform.scaleX = typedArray.getFloat(index, constraint.transform.scaleX);
                    break;
                case 48:
                    constraint.transform.scaleY = typedArray.getFloat(index, constraint.transform.scaleY);
                    break;
                case 49:
                    constraint.transform.transformPivotX = typedArray.getFloat(index, constraint.transform.transformPivotX);
                    break;
                case 50:
                    constraint.transform.transformPivotY = typedArray.getFloat(index, constraint.transform.transformPivotY);
                    break;
                case 51:
                    constraint.transform.translationX = typedArray.getDimension(index, constraint.transform.translationX);
                    break;
                case 52:
                    constraint.transform.translationY = typedArray.getDimension(index, constraint.transform.translationY);
                    break;
                case 53:
                    if (android.os.Build.VERSION.SDK_INT >= 21) {
                        constraint.transform.translationZ = typedArray.getDimension(index, constraint.transform.translationZ);
                    }
                    break;
                default:
                    switch (i2) {
                        case 60:
                            constraint.transform.rotation = typedArray.getFloat(index, constraint.transform.rotation);
                            break;
                        case 61:
                            constraint.layout.circleConstraint = lookupID(typedArray, index, constraint.layout.circleConstraint);
                            break;
                        case 62:
                            constraint.layout.circleRadius = typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius);
                            break;
                        case 63:
                            constraint.layout.circleAngle = typedArray.getFloat(index, constraint.layout.circleAngle);
                            break;
                        case 64:
                            constraint.motion.mAnimateRelativeTo = lookupID(typedArray, index, constraint.motion.mAnimateRelativeTo);
                            break;
                        case 65:
                            if (typedArray.peekValue(index).type == 3) {
                                constraint.motion.mTransitionEasing = typedArray.getString(index);
                            } else {
                                constraint.motion.mTransitionEasing = androidx.constraintlayout.motion.utils.Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                            }
                            break;
                        case 66:
                            constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                            break;
                        case 67:
                            constraint.motion.mPathRotate = typedArray.getFloat(index, constraint.motion.mPathRotate);
                            break;
                        case 68:
                            constraint.propertySet.mProgress = typedArray.getFloat(index, constraint.propertySet.mProgress);
                            break;
                        case 69:
                            constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                            break;
                        case 70:
                            constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                            break;
                        case 71:
                            android.util.Log.e(TAG, "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            constraint.layout.mBarrierDirection = typedArray.getInt(index, constraint.layout.mBarrierDirection);
                            break;
                        case 73:
                            constraint.layout.mBarrierMargin = typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin);
                            break;
                        case 74:
                            constraint.layout.mReferenceIdString = typedArray.getString(index);
                            break;
                        case 75:
                            constraint.layout.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets);
                            break;
                        case 76:
                            constraint.motion.mPathMotionArc = typedArray.getInt(index, constraint.motion.mPathMotionArc);
                            break;
                        case 77:
                            constraint.layout.mConstraintTag = typedArray.getString(index);
                            break;
                        case 78:
                            constraint.propertySet.mVisibilityMode = typedArray.getInt(index, constraint.propertySet.mVisibilityMode);
                            break;
                        case 79:
                            constraint.motion.mMotionStagger = typedArray.getFloat(index, constraint.motion.mMotionStagger);
                            break;
                        case 80:
                            android.util.Log.w(TAG, "unused attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                            break;
                        default:
                            android.util.Log.w(TAG, "Unknown attribute 0x" + java.lang.Integer.toHexString(index) + "   " + mapToConstant.get(index));
                            break;
                    }
                    break;
            }
        }
    }

    private int[] convertReferenceString(android.view.View view, java.lang.String str) {
        int iIntValue;
        java.lang.Object designInformation;
        java.lang.String[] strArrSplit = str.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            java.lang.String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.R.id.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) && (designInformation = ((androidx.constraintlayout.widget.ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof java.lang.Integer)) {
                iIntValue = ((java.lang.Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? java.util.Arrays.copyOf(iArr, i2) : iArr;
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getConstraint(int i) {
        if (this.mConstraints.containsKey(java.lang.Integer.valueOf(i))) {
            return this.mConstraints.get(java.lang.Integer.valueOf(i));
        }
        return null;
    }

    public int[] getKnownIds() {
        java.lang.Integer[] numArr = (java.lang.Integer[]) this.mConstraints.keySet().toArray(new java.lang.Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public void setForceId(boolean z) {
        this.mForceId = z;
    }

    public void setValidateOnParse(boolean z) {
        this.mValidate = z;
    }
}
