package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public androidx.constraintlayout.solver.widgets.analyzer.ChainRun horizontalChainRun;
    public androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> mAnchors;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mCenter;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mCenterX;
    androidx.constraintlayout.solver.widgets.ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private java.lang.Object mCompanionWidget;
    private int mContainerItemSkip;
    private java.lang.String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    androidx.constraintlayout.solver.widgets.ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor[] mListAnchors;
    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[] mListDimensionBehaviors;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public androidx.constraintlayout.solver.widgets.ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    public int[] mResolvedMatchConstraintDefault;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private java.lang.String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    androidx.constraintlayout.solver.widgets.ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    protected int mX;
    protected int mY;
    public boolean measured;
    public androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[] run;
    public androidx.constraintlayout.solver.widgets.analyzer.ChainRun verticalChainRun;
    public androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public androidx.constraintlayout.solver.widgets.analyzer.WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mListDimensionBehaviors[0] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[2];
        this.horizontalRun = new androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun(this);
        this.verticalRun = new androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0};
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.solver.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.mListDimensionBehaviors = new androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new androidx.constraintlayout.solver.widgets.analyzer.WidgetRun[2];
        this.horizontalRun = new androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun(this);
        this.verticalRun = new androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0};
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.solver.widgets.ConstraintAnchor(this, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.solver.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.mListDimensionBehaviors = new androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void resetSolverVariables(androidx.constraintlayout.solver.Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER, constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public java.lang.String getType() {
        return this.mType;
    }

    public void setType(java.lang.String str) {
        this.mType = str;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public java.lang.String getDebugName() {
        return this.mDebugName;
    }

    public void setDebugName(java.lang.String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(androidx.constraintlayout.solver.LinearSystem linearSystem, java.lang.String str) {
        this.mDebugName = str;
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
        }
    }

    public void createObjectVariables(androidx.constraintlayout.solver.LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str2 = "";
        if (this.mType != null) {
            str = "type: " + this.mType + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.mDebugName != null) {
            str2 = "id: " + this.mDebugName + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        sb.append(this.mHeight);
        sb.append(")");
        return sb.toString();
    }

    public int getX() {
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer)) {
            return ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer)) {
            return ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getOptimizerWrapWidth() {
        int iMax;
        int i = this.mWidth;
        if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = java.lang.Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            iMax = this.mMatchConstraintMinWidth;
            if (iMax > 0) {
                this.mWidth = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxWidth;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getOptimizerWrapHeight() {
        int iMax;
        int i = this.mHeight;
        if (this.mListDimensionBehaviors[1] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            iMax = java.lang.Math.max(this.mMatchConstraintMinHeight, i);
        } else {
            iMax = this.mMatchConstraintMinHeight;
            if (iMax > 0) {
                this.mHeight = iMax;
            } else {
                iMax = 0;
            }
        }
        int i2 = this.mMatchConstraintMaxHeight;
        return (i2 <= 0 || i2 >= iMax) ? iMax : i2;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public java.lang.Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setGoneMargin(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type, int i) {
        int i2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else {
            if (i2 != 4) {
                return;
            }
            this.mBottom.mGoneMargin = i;
        }
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public void setDimensionRatio(java.lang.String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            java.lang.String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                java.lang.String strSubstring2 = str.substring(i3, iIndexOf2);
                java.lang.String strSubstring3 = str.substring(iIndexOf2 + 1);
                if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                    fAbs = 0.0f;
                } else {
                    float f = java.lang.Float.parseFloat(strSubstring2);
                    float f2 = java.lang.Float.parseFloat(strSubstring3);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = 0.0f;
                    } else if (i2 == 1) {
                        fAbs = java.lang.Math.abs(f2 / f);
                    } else {
                        fAbs = java.lang.Math.abs(f / f2);
                    }
                }
            } else {
                java.lang.String strSubstring4 = str.substring(i3);
                if (strSubstring4.length() > 0) {
                    fAbs = java.lang.Float.parseFloat(strSubstring4);
                } else {
                    fAbs = 0.0f;
                }
            }
        } catch (java.lang.NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i2;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
    }

    public void setCompanionWidget(java.lang.Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER) {
            if (type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER) {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT);
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor2 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT);
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor3 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP);
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor4 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, 0);
                    connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, 0);
                    connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER), 0);
                    return;
                } else if (z) {
                    getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT || type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT) {
                connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                return;
            } else {
                if (type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP || type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM) {
                    connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                    connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
        }
        if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X && (type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT || type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT)) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor5 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor7 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
            return;
        }
        if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y && (type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP || type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM)) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
            return;
        }
        if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X && type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X) {
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT), 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y && type2 == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP), 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor9 = getAnchor(type);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE) {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor11 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP);
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor12 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
                i = 0;
            } else if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM) {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor13 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor14 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor opposite = getAnchor(type).getOpposite();
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor15 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT) {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor16 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                androidx.constraintlayout.solver.widgets.ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor17 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) && ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor2 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor3 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor4 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor5 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor6 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X);
        androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor7 = getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        androidx.constraintlayout.solver.widgets.ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) && ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type) {
        switch (androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new java.lang.AssertionError(type.name());
        }
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget == null) {
                return null;
            }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2 = this.mLeft;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mTop.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor4 = this.mTop;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget == null) {
                return null;
            }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2 = this.mRight;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.solver.widgets.ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            androidx.constraintlayout.solver.widgets.ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP);
            androidx.constraintlayout.solver.widgets.ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            androidx.constraintlayout.solver.widgets.ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            androidx.constraintlayout.solver.widgets.ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean isChainHead(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget != null) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
            androidx.constraintlayout.solver.widgets.ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
            if (constraintAnchor != constraintAnchorArr[i2]) {
                int i3 = i2 + 1;
                if (constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:198:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:199:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:201:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:206:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:213:0x0408  */
    /* JADX WARN: Code duplicated, block: B:216:0x040e  */
    /* JADX WARN: Code duplicated, block: B:218:0x041b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0429  */
    /* JADX WARN: Code duplicated, block: B:221:0x042f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0438  */
    /* JADX WARN: Code duplicated, block: B:226:0x0441  */
    /* JADX WARN: Code duplicated, block: B:229:0x0447  */
    /* JADX WARN: Code duplicated, block: B:231:0x048f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0495  */
    /* JADX WARN: Code duplicated, block: B:235:0x049d  */
    /* JADX WARN: Code duplicated, block: B:236:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:237:0x04be  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    public void addToSolver(androidx.constraintlayout.solver.LinearSystem linearSystem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.constraintlayout.solver.SolverVariable solverVariable;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z5;
        androidx.constraintlayout.solver.LinearSystem linearSystem2;
        androidx.constraintlayout.solver.SolverVariable solverVariable2;
        androidx.constraintlayout.solver.SolverVariable solverVariable3;
        androidx.constraintlayout.solver.SolverVariable solverVariable4;
        int i5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget;
        boolean z8;
        boolean z9;
        boolean z10;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2;
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable;
        int i8;
        int i9;
        boolean zIsInHorizontalChain;
        boolean zIsInVerticalChain;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3 = this;
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(constraintWidget3.mLeft);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget3.mRight);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintWidget3.mTop);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintWidget3.mBottom);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintWidget3.mBaseline);
        if (androidx.constraintlayout.solver.LinearSystem.sMetrics != null) {
            androidx.constraintlayout.solver.LinearSystem.sMetrics.widgets++;
        }
        if (constraintWidget3.horizontalRun.start.resolved && constraintWidget3.horizontalRun.end.resolved && constraintWidget3.verticalRun.start.resolved && constraintWidget3.verticalRun.end.resolved) {
            if (androidx.constraintlayout.solver.LinearSystem.sMetrics != null) {
                androidx.constraintlayout.solver.LinearSystem.sMetrics.graphSolved++;
            }
            linearSystem.addEquality(solverVariableCreateObjectVariable2, constraintWidget3.horizontalRun.start.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable3, constraintWidget3.horizontalRun.end.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable4, constraintWidget3.verticalRun.start.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable5, constraintWidget3.verticalRun.end.value);
            linearSystem.addEquality(solverVariableCreateObjectVariable6, constraintWidget3.verticalRun.baseline.value);
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget4 = constraintWidget3.mParent;
            if (constraintWidget4 != null) {
                boolean z11 = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget5 = constraintWidget3.mParent;
                boolean z12 = constraintWidget5 != null && constraintWidget5.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z11 && constraintWidget3.isTerminalWidget[0] && !isInHorizontalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget3.mParent.mRight), solverVariableCreateObjectVariable3, 0, 6);
                }
                if (z12 && constraintWidget3.isTerminalWidget[1] && !isInVerticalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget3.mParent.mBottom), solverVariableCreateObjectVariable5, 0, 6);
                    return;
                }
                return;
            }
            return;
        }
        if (androidx.constraintlayout.solver.LinearSystem.sMetrics != null) {
            androidx.constraintlayout.solver.LinearSystem.sMetrics.linearSolved++;
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget6 = constraintWidget3.mParent;
        if (constraintWidget6 != null) {
            z = constraintWidget6 != null && constraintWidget6.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget7 = constraintWidget3.mParent;
            boolean z13 = constraintWidget7 != null && constraintWidget7.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (constraintWidget3.isChainHead(0)) {
                ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) constraintWidget3.mParent).addChain(constraintWidget3, 0);
                zIsInHorizontalChain = true;
            } else {
                zIsInHorizontalChain = isInHorizontalChain();
            }
            if (constraintWidget3.isChainHead(1)) {
                ((androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) constraintWidget3.mParent).addChain(constraintWidget3, 1);
                zIsInVerticalChain = true;
            } else {
                zIsInVerticalChain = isInVerticalChain();
            }
            if (!zIsInHorizontalChain && z && constraintWidget3.mVisibility != 8 && constraintWidget3.mLeft.mTarget == null && constraintWidget3.mRight.mTarget == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget3.mParent.mRight), solverVariableCreateObjectVariable3, 0, 1);
            }
            if (!zIsInVerticalChain && z13 && constraintWidget3.mVisibility != 8 && constraintWidget3.mTop.mTarget == null && constraintWidget3.mBottom.mTarget == null && constraintWidget3.mBaseline == null) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget3.mParent.mBottom), solverVariableCreateObjectVariable5, 0, 1);
            }
            z2 = z13;
            z3 = zIsInHorizontalChain;
            z4 = zIsInVerticalChain;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i10 = constraintWidget3.mWidth;
        int i11 = constraintWidget3.mMinWidth;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = constraintWidget3.mHeight;
        int i13 = constraintWidget3.mMinHeight;
        if (i12 < i13) {
            i12 = i13;
        }
        boolean z14 = constraintWidget3.mListDimensionBehaviors[0] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z15 = constraintWidget3.mListDimensionBehaviors[1] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        constraintWidget3.mResolvedDimensionRatioSide = constraintWidget3.mDimensionRatioSide;
        float f = constraintWidget3.mDimensionRatio;
        constraintWidget3.mResolvedDimensionRatio = f;
        int i14 = constraintWidget3.mMatchConstraintDefaultWidth;
        int i15 = constraintWidget3.mMatchConstraintDefaultHeight;
        androidx.constraintlayout.solver.SolverVariable solverVariable5 = solverVariableCreateObjectVariable4;
        if (f <= 0.0f || constraintWidget3.mVisibility == 8) {
            solverVariable = solverVariableCreateObjectVariable6;
            i = i10;
            i2 = i12;
            i3 = i14;
            i4 = i15;
            z5 = false;
        } else {
            solverVariable = solverVariableCreateObjectVariable6;
            if (constraintWidget3.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i14 == 0) {
                i14 = 3;
            }
            if (constraintWidget3.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i15 == 0) {
                i15 = 3;
            }
            if (constraintWidget3.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i14 == 3 && i15 == 3) {
                constraintWidget3.setupDimensionRatio(z, z2, z14, z15);
            } else if (constraintWidget3.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i14 == 3) {
                constraintWidget3.mResolvedDimensionRatioSide = 0;
                i = (int) (constraintWidget3.mResolvedDimensionRatio * constraintWidget3.mHeight);
                i2 = i12;
                if (constraintWidget3.mListDimensionBehaviors[1] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4 = i15;
                    z5 = false;
                    i3 = 4;
                } else {
                    i3 = i14;
                    i4 = i15;
                    z5 = true;
                }
            } else if (constraintWidget3.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i15 == 3) {
                constraintWidget3.mResolvedDimensionRatioSide = 1;
                if (constraintWidget3.mDimensionRatioSide == -1) {
                    constraintWidget3.mResolvedDimensionRatio = 1.0f / constraintWidget3.mResolvedDimensionRatio;
                }
                i2 = (int) (constraintWidget3.mResolvedDimensionRatio * constraintWidget3.mWidth);
                i = i10;
                i3 = i14;
                if (constraintWidget3.mListDimensionBehaviors[0] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z5 = false;
                    i4 = 4;
                } else {
                    i4 = i15;
                    z5 = true;
                }
            }
            i = i10;
            i2 = i12;
            i3 = i14;
            i4 = i15;
            z5 = true;
        }
        int[] iArr = constraintWidget3.mResolvedMatchConstraintDefault;
        iArr[0] = i3;
        iArr[1] = i4;
        boolean z16 = z5 && ((i9 = constraintWidget3.mResolvedDimensionRatioSide) == 0 || i9 == -1);
        boolean z17 = constraintWidget3.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && (constraintWidget3 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer);
        boolean z18 = !constraintWidget3.mCenter.isConnected();
        if (constraintWidget3.mHorizontalResolution != 2) {
            if (!constraintWidget3.horizontalRun.start.resolved || !constraintWidget3.horizontalRun.end.resolved) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget8 = constraintWidget3.mParent;
                androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable7 = constraintWidget8 != null ? linearSystem.createObjectVariable(constraintWidget8.mRight) : null;
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget9 = constraintWidget3.mParent;
                applyConstraints(linearSystem, z, constraintWidget3.isTerminalWidget[0], constraintWidget9 != null ? linearSystem.createObjectVariable(constraintWidget9.mLeft) : null, solverVariableCreateObjectVariable7, constraintWidget3.mListDimensionBehaviors[0], z17, constraintWidget3.mLeft, constraintWidget3.mRight, constraintWidget3.mX, i, constraintWidget3.mMinWidth, constraintWidget3.mMaxDimension[0], constraintWidget3.mHorizontalBiasPercent, z16, z3, i3, i4, constraintWidget3.mMatchConstraintMinWidth, constraintWidget3.mMatchConstraintMaxWidth, constraintWidget3.mMatchConstraintPercentWidth, z18);
            } else {
                linearSystem.addEquality(solverVariableCreateObjectVariable2, constraintWidget3.horizontalRun.start.value);
                linearSystem.addEquality(solverVariableCreateObjectVariable3, constraintWidget3.horizontalRun.end.value);
                if (constraintWidget3.mParent != null && z && constraintWidget3.isTerminalWidget[0] && !isInHorizontalChain()) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget3.mParent.mRight), solverVariableCreateObjectVariable3, 0, 6);
                }
                solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                z2 = z2;
                solverVariable5 = solverVariable5;
                solverVariable = solverVariable;
                solverVariableCreateObjectVariable3 = solverVariableCreateObjectVariable3;
                solverVariableCreateObjectVariable2 = solverVariableCreateObjectVariable2;
            }
            if (constraintWidget3.verticalRun.start.resolved || !constraintWidget3.verticalRun.end.resolved) {
                linearSystem2 = linearSystem;
                solverVariable2 = solverVariable;
                solverVariable3 = solverVariableCreateObjectVariable5;
                solverVariable4 = solverVariable5;
                i5 = 6;
                i6 = 0;
                i7 = 1;
                z6 = true;
            } else {
                linearSystem2 = linearSystem;
                solverVariable4 = solverVariable5;
                linearSystem2.addEquality(solverVariable4, constraintWidget3.verticalRun.start.value);
                solverVariable3 = solverVariableCreateObjectVariable5;
                linearSystem2.addEquality(solverVariable3, constraintWidget3.verticalRun.end.value);
                solverVariable2 = solverVariable;
                linearSystem2.addEquality(solverVariable2, constraintWidget3.verticalRun.baseline.value);
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget10 = constraintWidget3.mParent;
                if (constraintWidget10 == null || z4 || !z2) {
                    i5 = 6;
                    i6 = 0;
                    i7 = 1;
                } else {
                    i7 = 1;
                    if (constraintWidget3.isTerminalWidget[1]) {
                        i5 = 6;
                        i6 = 0;
                        linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget10.mBottom), solverVariable3, 0, 6);
                    } else {
                        i5 = 6;
                        i6 = 0;
                    }
                }
                z6 = false;
            }
            if (constraintWidget3.mVerticalResolution == 2) {
                z7 = false;
            } else {
                z7 = z6;
            }
            if (!z7) {
                if (constraintWidget3.mListDimensionBehaviors[i7] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || !(constraintWidget3 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z5 || !((i8 = constraintWidget3.mResolvedDimensionRatioSide) == i7 || i8 == -1)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (constraintWidget3.mBaselineDistance > 0) {
                    linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                    if (constraintWidget3.mBaseline.mTarget != null) {
                        linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget3.mBaseline.mTarget), i6, i5);
                        z10 = false;
                    }
                    constraintWidget2 = constraintWidget3.mParent;
                    if (constraintWidget2 != null) {
                        solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
                    } else {
                        solverVariableCreateObjectVariable = null;
                    }
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget11 = constraintWidget3.mParent;
                    applyConstraints(linearSystem, z2, constraintWidget3.isTerminalWidget[i7], constraintWidget11 != null ? linearSystem2.createObjectVariable(constraintWidget11.mTop) : null, solverVariableCreateObjectVariable, constraintWidget3.mListDimensionBehaviors[i7], z8, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i2, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i7], constraintWidget3.mVerticalBiasPercent, z9, z4, i4, i3, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z10);
                } else if (constraintWidget3.mVisibility == 8) {
                    linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
                }
                z10 = z18;
                constraintWidget2 = constraintWidget3.mParent;
                if (constraintWidget2 != null) {
                    solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
                } else {
                    solverVariableCreateObjectVariable = null;
                }
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget12 = constraintWidget3.mParent;
                applyConstraints(linearSystem, z2, constraintWidget3.isTerminalWidget[i7], constraintWidget12 != null ? linearSystem2.createObjectVariable(constraintWidget12.mTop) : null, solverVariableCreateObjectVariable, constraintWidget3.mListDimensionBehaviors[i7], z8, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i2, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i7], constraintWidget3.mVerticalBiasPercent, z9, z4, i4, i3, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z10);
            }
            if (z5) {
                constraintWidget = this;
                if (constraintWidget.mResolvedDimensionRatioSide == 1) {
                    linearSystem.addRatio(solverVariable3, solverVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, constraintWidget.mResolvedDimensionRatio, 6);
                } else {
                    linearSystem.addRatio(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable3, solverVariable4, constraintWidget.mResolvedDimensionRatio, 6);
                }
            } else {
                constraintWidget = this;
            }
            if (constraintWidget.mCenter.isConnected()) {
                linearSystem.addCenterPoint(constraintWidget, constraintWidget.mCenter.getTarget().getOwner(), (float) java.lang.Math.toRadians(constraintWidget.mCircleConstraintAngle + 90.0f), constraintWidget.mCenter.getMargin());
            }
        }
        constraintWidget3 = this;
        if (constraintWidget3.verticalRun.start.resolved) {
            linearSystem2 = linearSystem;
            solverVariable2 = solverVariable;
            solverVariable3 = solverVariableCreateObjectVariable5;
            solverVariable4 = solverVariable5;
            i5 = 6;
            i6 = 0;
            i7 = 1;
            z6 = true;
        } else {
            linearSystem2 = linearSystem;
            solverVariable2 = solverVariable;
            solverVariable3 = solverVariableCreateObjectVariable5;
            solverVariable4 = solverVariable5;
            i5 = 6;
            i6 = 0;
            i7 = 1;
            z6 = true;
        }
        if (constraintWidget3.mVerticalResolution == 2) {
            z7 = false;
        } else {
            z7 = z6;
        }
        if (!z7) {
            if (constraintWidget3.mListDimensionBehaviors[i7] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (constraintWidget3.mBaselineDistance > 0) {
                linearSystem2.addEquality(solverVariable2, solverVariable4, getBaselineDistance(), i5);
                if (constraintWidget3.mBaseline.mTarget != null) {
                    linearSystem2.addEquality(solverVariable2, linearSystem2.createObjectVariable(constraintWidget3.mBaseline.mTarget), i6, i5);
                    z10 = false;
                }
                constraintWidget2 = constraintWidget3.mParent;
                if (constraintWidget2 != null) {
                    solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
                } else {
                    solverVariableCreateObjectVariable = null;
                }
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget13 = constraintWidget3.mParent;
                applyConstraints(linearSystem, z2, constraintWidget3.isTerminalWidget[i7], constraintWidget13 != null ? linearSystem2.createObjectVariable(constraintWidget13.mTop) : null, solverVariableCreateObjectVariable, constraintWidget3.mListDimensionBehaviors[i7], z8, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i2, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i7], constraintWidget3.mVerticalBiasPercent, z9, z4, i4, i3, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z10);
            } else if (constraintWidget3.mVisibility == 8) {
                linearSystem2.addEquality(solverVariable2, solverVariable4, i6, i5);
            }
            z10 = z18;
            constraintWidget2 = constraintWidget3.mParent;
            if (constraintWidget2 != null) {
                solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget2.mBottom);
            } else {
                solverVariableCreateObjectVariable = null;
            }
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget14 = constraintWidget3.mParent;
            applyConstraints(linearSystem, z2, constraintWidget3.isTerminalWidget[i7], constraintWidget14 != null ? linearSystem2.createObjectVariable(constraintWidget14.mTop) : null, solverVariableCreateObjectVariable, constraintWidget3.mListDimensionBehaviors[i7], z8, constraintWidget3.mTop, constraintWidget3.mBottom, constraintWidget3.mY, i2, constraintWidget3.mMinHeight, constraintWidget3.mMaxDimension[i7], constraintWidget3.mVerticalBiasPercent, z9, z4, i4, i3, constraintWidget3.mMatchConstraintMinHeight, constraintWidget3.mMatchConstraintMaxHeight, constraintWidget3.mMatchConstraintPercentHeight, z10);
        }
        if (z5) {
            constraintWidget = this;
            if (constraintWidget.mResolvedDimensionRatioSide == 1) {
                linearSystem.addRatio(solverVariable3, solverVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, constraintWidget.mResolvedDimensionRatio, 6);
            } else {
                linearSystem.addRatio(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariable3, solverVariable4, constraintWidget.mResolvedDimensionRatio, 6);
            }
        } else {
            constraintWidget = this;
        }
        if (constraintWidget.mCenter.isConnected()) {
            linearSystem.addCenterPoint(constraintWidget, constraintWidget.mCenter.getTarget().getOwner(), (float) java.lang.Math.toRadians(constraintWidget.mCircleConstraintAngle + 90.0f), constraintWidget.mCenter.getMargin());
        }
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z && !z2) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z && z2) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (i == 0 && this.mMatchConstraintMinHeight > 0) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1 && z && z2) {
            this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x027d  */
    /* JADX WARN: Code duplicated, block: B:172:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:176:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x02de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x02f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v5 */
    private void applyConstraints(androidx.constraintlayout.solver.LinearSystem linearSystem, boolean z, boolean z2, androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, boolean z3, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z4, boolean z5, int i5, int i6, int i7, int i8, float f2, boolean z6) {
        int iMin;
        int i9;
        int i10;
        int i11;
        androidx.constraintlayout.solver.SolverVariable solverVariable3;
        boolean z7;
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable;
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable2;
        int i12;
        boolean z8;
        int i13;
        int i14;
        char c;
        androidx.constraintlayout.solver.SolverVariable solverVariable4;
        boolean z9;
        boolean z10;
        int i15;
        androidx.constraintlayout.solver.SolverVariable solverVariable5;
        androidx.constraintlayout.solver.SolverVariable solverVariable6;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        androidx.constraintlayout.solver.SolverVariable solverVariable7;
        int i18;
        int i19;
        boolean z13;
        boolean z14;
        int i20;
        boolean z15;
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (androidx.constraintlayout.solver.LinearSystem.getMetrics() != null) {
            androidx.constraintlayout.solver.LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i21 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i21++;
        }
        int i22 = i21;
        int i23 = z4 ? 3 : i5;
        int i24 = androidx.constraintlayout.solver.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        boolean z16 = (i24 == 1 || i24 == 2 || i24 == 3 || i24 != 4 || i23 == 4) ? false : true;
        if (this.mVisibility == 8) {
            iMin = 0;
            z16 = false;
        } else {
            iMin = i2;
        }
        if (z6) {
            if (!zIsConnected && !zIsConnected2 && !zIsConnected3) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, i);
            } else if (zIsConnected && !zIsConnected2) {
                i9 = 6;
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 6);
            }
            i9 = 6;
        } else {
            i9 = 6;
        }
        if (z16) {
            int i25 = i7;
            i10 = i8;
            if (i25 == -2) {
                i25 = iMin;
            }
            if (i10 == -2) {
                i10 = iMin;
            }
            if (i25 > 0) {
                if ((z && i23 == 1) ? false : true) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i25, 6);
                }
                iMin = java.lang.Math.max(iMin, i25);
            }
            if (i10 > 0) {
                if ((z && i23 == 1) ? false : true) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i10, 6);
                }
                iMin = java.lang.Math.min(iMin, i10);
            }
            if (i23 == 1) {
                if (z) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 6);
                } else if (z5) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 4);
                } else {
                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 1);
                }
                i11 = i23;
                z7 = z2;
                solverVariable3 = solverVariableCreateObjectVariable5;
            } else if (i23 == 2) {
                i11 = i23;
                if (constraintAnchor.getType() == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP || constraintAnchor.getType() == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM) {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP));
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM));
                } else {
                    solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT));
                    solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT));
                }
                solverVariable3 = solverVariableCreateObjectVariable5;
                linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, f2));
                z7 = z2;
                z16 = false;
            } else {
                i11 = i23;
                solverVariable3 = solverVariableCreateObjectVariable5;
                z7 = true;
            }
            if (z16 && i22 != 2 && !z4) {
                int iMax = java.lang.Math.max(i25, iMin);
                if (i10 > 0) {
                    iMax = java.lang.Math.min(i10, iMax);
                }
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMax, 6);
                z16 = false;
            }
            boolean z17 = z7;
            i12 = i25;
            z8 = z17;
        } else {
            if (z3) {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
                if (i3 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i3, 6);
                }
                if (i4 < Integer.MAX_VALUE) {
                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i4, 6);
                }
            } else {
                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i9);
            }
            z8 = z2;
            i10 = i8;
            i11 = i23;
            solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
            solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
            i22 = i22;
            i12 = i7;
            solverVariable3 = solverVariableCreateObjectVariable5;
        }
        if (!z6) {
            i13 = 6;
            i14 = 0;
            c = 2;
        } else {
            if (!z5) {
                if ((zIsConnected || zIsConnected2 || zIsConnected3) && (!zIsConnected || zIsConnected2)) {
                    if (!zIsConnected && zIsConnected2) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 6);
                        if (z) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 5);
                        }
                    } else if (zIsConnected && zIsConnected2) {
                        if (z16) {
                            if (z && i3 == 0) {
                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 6);
                            }
                            if (i11 == 0) {
                                if (i10 > 0 || i12 > 0) {
                                    i20 = 4;
                                    z15 = true;
                                } else {
                                    i20 = 6;
                                    z15 = false;
                                }
                                solverVariable4 = solverVariable3;
                                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariable4, constraintAnchor.getMargin(), i20);
                                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i20);
                                boolean z18 = i10 > 0 || i12 > 0;
                                z10 = z15;
                                i15 = 5;
                                z9 = z18;
                            } else {
                                solverVariable4 = solverVariable3;
                                int i26 = i11;
                                if (i26 == 1) {
                                    z9 = true;
                                    z10 = true;
                                    i15 = 6;
                                } else {
                                    if (i26 == 3) {
                                        if (i6 == 2 || i6 == 1) {
                                            z14 = false;
                                        } else {
                                            int i27 = (z4 || this.mResolvedDimensionRatioSide == -1 || i10 > 0) ? 4 : 6;
                                            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariable4, constraintAnchor.getMargin(), i27);
                                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i27);
                                            z14 = true;
                                        }
                                        z10 = z14;
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    i15 = 5;
                                }
                            }
                            if (z9) {
                                androidx.constraintlayout.solver.SolverVariable solverVariable8 = solverVariableCreateObjectVariable4;
                                androidx.constraintlayout.solver.SolverVariable solverVariable9 = solverVariable4;
                                solverVariable6 = solverVariable9;
                                solverVariable5 = solverVariable8;
                                z12 = true;
                                linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariable9, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariable8, constraintAnchor2.getMargin(), i15);
                                z13 = constraintAnchor.mTarget.mOwner instanceof androidx.constraintlayout.solver.widgets.Barrier;
                                boolean z19 = constraintAnchor2.mTarget.mOwner instanceof androidx.constraintlayout.solver.widgets.Barrier;
                                if (!z13 && !z19) {
                                    z12 = z;
                                    i16 = 6;
                                    z11 = true;
                                    i17 = 5;
                                } else if (z13 && z19) {
                                    z11 = z;
                                    i16 = 5;
                                    i17 = 6;
                                }
                                if (z10) {
                                    i16 = 6;
                                    i17 = 6;
                                }
                                if ((z16 && z12) || z10) {
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable6, constraintAnchor.getMargin(), i17);
                                }
                                if ((z16 && z11) || z10) {
                                    solverVariable7 = solverVariable5;
                                    linearSystem.addLowerThan(solverVariable7, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i16);
                                }
                                i18 = 6;
                                i19 = 0;
                                if (z) {
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 6);
                                }
                            } else {
                                solverVariable5 = solverVariableCreateObjectVariable4;
                                solverVariable6 = solverVariable4;
                            }
                            z11 = z;
                            z12 = z11;
                            i16 = 5;
                            i17 = 5;
                            if (z10) {
                                i16 = 6;
                                i17 = 6;
                            }
                            if (z16) {
                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable6, constraintAnchor.getMargin(), i17);
                            } else {
                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable6, constraintAnchor.getMargin(), i17);
                            }
                            solverVariable7 = z16 ? solverVariable5 : solverVariable5;
                            i18 = 6;
                            i19 = 0;
                            if (z) {
                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 6);
                            }
                        } else {
                            solverVariable4 = solverVariable3;
                            z9 = true;
                        }
                        z10 = false;
                        i15 = 5;
                        if (z9) {
                            androidx.constraintlayout.solver.SolverVariable solverVariable10 = solverVariableCreateObjectVariable4;
                            androidx.constraintlayout.solver.SolverVariable solverVariable11 = solverVariable4;
                            solverVariable6 = solverVariable11;
                            solverVariable5 = solverVariable10;
                            z12 = true;
                            linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariable11, constraintAnchor.getMargin(), f, solverVariableCreateObjectVariable6, solverVariable10, constraintAnchor2.getMargin(), i15);
                            z13 = constraintAnchor.mTarget.mOwner instanceof androidx.constraintlayout.solver.widgets.Barrier;
                            boolean z110 = constraintAnchor2.mTarget.mOwner instanceof androidx.constraintlayout.solver.widgets.Barrier;
                            if (!z13) {
                            }
                            if (z13) {
                            }
                        } else {
                            solverVariable5 = solverVariableCreateObjectVariable4;
                            solverVariable6 = solverVariable4;
                        }
                        z11 = z;
                        z12 = z11;
                        i16 = 5;
                        i17 = 5;
                        if (z10) {
                            i16 = 6;
                            i17 = 6;
                        }
                        if (z16) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable6, constraintAnchor.getMargin(), i17);
                        } else {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable6, constraintAnchor.getMargin(), i17);
                        }
                        if (z16) {
                        }
                        i18 = 6;
                        i19 = 0;
                        if (z) {
                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 6);
                        }
                    }
                    solverVariable7 = solverVariableCreateObjectVariable4;
                    i18 = 6;
                    i19 = 0;
                } else {
                    solverVariable7 = solverVariableCreateObjectVariable4;
                    i18 = 6;
                    i19 = 0;
                }
                if (z && z8) {
                    linearSystem.addGreaterThan(solverVariable2, solverVariable7, i19, i18);
                    return;
                }
                return;
            }
            i13 = 6;
            c = 2;
            i14 = 0;
        }
        if (i22 < c && z && z8) {
            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, i14, i13);
            linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, i14, i13);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
        }
    }

    public void updateFromSolver(androidx.constraintlayout.solver.LinearSystem linearSystem) {
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (this.horizontalRun.start.resolved && this.horizontalRun.end.resolved) {
            objectVariableValue = this.horizontalRun.start.value;
            objectVariableValue3 = this.horizontalRun.end.value;
        }
        if (this.verticalRun.start.resolved && this.verticalRun.end.resolved) {
            objectVariableValue2 = this.verticalRun.start.value;
            objectVariableValue4 = this.verticalRun.end.value;
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue4 = 0;
            objectVariableValue = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> map) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = java.util.Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour[]) java.util.Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mOptimizerMeasurable = constraintWidget.mOptimizerMeasurable;
        this.mGroupsToSolver = constraintWidget.mGroupsToSolver;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : map.get(constraintWidget2);
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zIsResolved = z & this.horizontalRun.isResolved();
        boolean zIsResolved2 = z2 & this.verticalRun.isResolved();
        int i3 = this.horizontalRun.start.value;
        int i4 = this.verticalRun.start.value;
        int i5 = this.horizontalRun.end.value;
        int i6 = this.verticalRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zIsResolved) {
            this.mX = i3;
        }
        if (zIsResolved2) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }
}
