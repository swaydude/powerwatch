package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends android.view.ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final java.lang.String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final java.lang.String VERSION = "ConstraintLayout-2.0-beta2";
    android.util.SparseArray<android.view.View> mChildrenByIds;
    private java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> mConstraintHelpers;
    protected androidx.constraintlayout.widget.ConstraintLayoutStates mConstraintLayoutSpec;
    private androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    androidx.constraintlayout.widget.ConstraintLayout.Measurer mMeasurer;
    private androidx.constraintlayout.solver.Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> mTempMapIdToWidget;
    private final java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> mVariableDimensionsWidgets;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, java.lang.Object obj, java.lang.Object obj2) {
        if (i == 0 && (obj instanceof java.lang.String) && (obj2 instanceof java.lang.Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new java.util.HashMap<>();
            }
            java.lang.String strSubstring = (java.lang.String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.mDesignIds.put(strSubstring, java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue()));
        }
    }

    public java.lang.Object getDesignInformation(int i, java.lang.Object obj) {
        if (i != 0 || !(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String str = (java.lang.String) obj;
        java.util.HashMap<java.lang.String, java.lang.Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public ConstraintLayout(android.content.Context context) {
        super(context);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mVariableDimensionsWidgets = new java.util.ArrayList<>(100);
        this.mLayoutWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 71;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mVariableDimensionsWidgets = new java.util.ArrayList<>(100);
        this.mLayoutWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 71;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mVariableDimensionsWidgets = new java.util.ArrayList<>(100);
        this.mLayoutWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 71;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    public ConstraintLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new android.util.SparseArray<>();
        this.mConstraintHelpers = new java.util.ArrayList<>(4);
        this.mVariableDimensionsWidgets = new java.util.ArrayList<>(100);
        this.mLayoutWidget = new androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 71;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new java.util.HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new android.util.SparseArray<>();
        this.mMeasurer = new androidx.constraintlayout.widget.ConstraintLayout.Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    class Measurer implements androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer {
        androidx.constraintlayout.widget.ConstraintLayout layout;

        public Measurer(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
            this.layout = constraintLayout;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0176  */
        /* JADX WARN: Code duplicated, block: B:104:0x0187  */
        /* JADX WARN: Code duplicated, block: B:105:0x018e  */
        /* JADX WARN: Code duplicated, block: B:107:0x0192  */
        /* JADX WARN: Code duplicated, block: B:110:0x019b  */
        /* JADX WARN: Code duplicated, block: B:111:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:114:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:117:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:121:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:124:0x01c7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:126:0x01d1 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:127:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:130:0x01dd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:133:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:135:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:137:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:140:0x0202  */
        /* JADX WARN: Code duplicated, block: B:141:0x0204  */
        /* JADX WARN: Code duplicated, block: B:144:0x0209  */
        /* JADX WARN: Code duplicated, block: B:148:0x0210  */
        /* JADX WARN: Code duplicated, block: B:151:0x0217  */
        /* JADX WARN: Code duplicated, block: B:153:0x021a  */
        /* JADX WARN: Code duplicated, block: B:33:0x00aa A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ac A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x00ae A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:55:0x0104  */
        /* JADX WARN: Code duplicated, block: B:56:0x0106  */
        /* JADX WARN: Code duplicated, block: B:59:0x010b  */
        /* JADX WARN: Code duplicated, block: B:60:0x010d  */
        /* JADX WARN: Code duplicated, block: B:63:0x0112  */
        /* JADX WARN: Code duplicated, block: B:67:0x0119  */
        /* JADX WARN: Code duplicated, block: B:70:0x011e  */
        /* JADX WARN: Code duplicated, block: B:74:0x0125  */
        /* JADX WARN: Code duplicated, block: B:77:0x0129  */
        /* JADX WARN: Code duplicated, block: B:80:0x0131  */
        /* JADX WARN: Code duplicated, block: B:82:0x0134  */
        /* JADX WARN: Code duplicated, block: B:85:0x013c  */
        /* JADX WARN: Code duplicated, block: B:88:0x014f A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:96:0x0164  */
        /* JADX WARN: Code duplicated, block: B:98:0x0168  */
        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure measure) {
            int iMakeMeasureSpec;
            boolean z;
            int i;
            int iMakeMeasureSpec2;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            android.view.View view;
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int measuredWidth2;
            int measuredHeight2;
            int i2;
            boolean z9;
            boolean z10;
            boolean z11;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.getVisibility() == 8) {
                measure.measuredWidth = 0;
                measure.measuredHeight = 0;
                measure.measuredBaseline = 0;
                return;
            }
            androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.verticalBehavior;
            int i3 = measure.horizontalDimension;
            int i4 = measure.verticalDimension;
            int paddingTop = this.layout.getPaddingTop() + this.layout.getPaddingBottom();
            int paddingLeft = this.layout.getPaddingLeft() + this.layout.getPaddingRight();
            int i5 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
            if (i5 == 1) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i3, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
            } else {
                if (i5 == 2) {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureWidthMeasureSpec, paddingLeft, -2);
                } else if (i5 == 3) {
                    iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureWidthMeasureSpec, paddingLeft, -1);
                } else {
                    if (i5 == 4) {
                        iMakeMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureWidthMeasureSpec, paddingLeft, -2);
                        boolean z12 = constraintWidget.mMatchConstraintDefaultWidth == 1;
                        if (measure.useDeprecated && (!z12 || (z12 && constraintWidget.wrapMeasure[0] != constraintWidget.getWidth()))) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(constraintWidget.getWidth(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        i = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour2.ordinal()];
                        if (i == 1) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        } else {
                            if (i == 2) {
                                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -2);
                            } else if (i == 3) {
                                iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -1);
                            } else {
                                if (i == 4) {
                                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -2);
                                    if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!measure.useDeprecated && (!z11 || (z11 && constraintWidget.wrapMeasure[1] != constraintWidget.getHeight()))) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z3 || constraintWidget.mDimensionRatio <= 0.0f) {
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (z4 || constraintWidget.mDimensionRatio <= 0.0f) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                    view = (android.view.View) constraintWidget.getCompanionWidget();
                                    layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                                    if (measure.useDeprecated && z3 && constraintWidget.mMatchConstraintDefaultWidth == 0 && z4 && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                                        i2 = -1;
                                        measuredWidth2 = 0;
                                        measuredHeight2 = 0;
                                        baseline = 0;
                                    } else {
                                        if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout) && (constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) {
                                            ((androidx.constraintlayout.widget.VirtualLayout) view).onMeasure((androidx.constraintlayout.solver.widgets.VirtualLayout) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        if (z) {
                                            constraintWidget.wrapMeasure[0] = measuredWidth;
                                        }
                                        if (z2) {
                                            constraintWidget.wrapMeasure[1] = measuredHeight;
                                        }
                                        if (constraintWidget.mMatchConstraintMinWidth > 0) {
                                            measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                                        } else {
                                            measuredWidth2 = measuredWidth;
                                        }
                                        if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                            measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                                        }
                                        if (constraintWidget.mMatchConstraintMinHeight > 0) {
                                            measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                                        } else {
                                            measuredHeight2 = measuredHeight;
                                        }
                                        if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                            measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                                        }
                                        if (!z7 && z5) {
                                            measuredWidth2 = (int) ((measuredHeight2 * constraintWidget.mDimensionRatio) + 0.5f);
                                        } else if (z8 && z6) {
                                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                        }
                                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                                            if (measuredWidth != measuredWidth2) {
                                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                            }
                                            if (measuredHeight != measuredHeight2) {
                                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            measuredWidth2 = view.getMeasuredWidth();
                                            measuredHeight2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                        i2 = -1;
                                    }
                                    if (baseline != i2) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (measuredWidth2 == measure.horizontalDimension || measuredHeight2 != measure.verticalDimension) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    measure.measuredNeedsSolverPass = z10;
                                    if (layoutParams.needsBaseline) {
                                        z9 = true;
                                    }
                                    if (z9 && baseline != -1 && constraintWidget.getBaselineDistance() != baseline) {
                                        measure.measuredNeedsSolverPass = true;
                                    }
                                    measure.measuredWidth = measuredWidth2;
                                    measure.measuredHeight = measuredHeight2;
                                    measure.measuredHasBaseline = z9;
                                    measure.measuredBaseline = baseline;
                                }
                                iMakeMeasureSpec2 = 0;
                            }
                            z2 = true;
                            if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (z3) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z4) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            view = (android.view.View) constraintWidget.getCompanionWidget();
                            layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                            if (measure.useDeprecated) {
                                if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z) {
                                    constraintWidget.wrapMeasure[0] = measuredWidth;
                                }
                                if (z2) {
                                    constraintWidget.wrapMeasure[1] = measuredHeight;
                                }
                                if (constraintWidget.mMatchConstraintMinWidth > 0) {
                                    measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                    measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                                }
                                if (constraintWidget.mMatchConstraintMinHeight > 0) {
                                    measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                    measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                                }
                                if (!z7) {
                                    if (z8) {
                                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                    }
                                } else if (z8) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i2 = -1;
                            } else {
                                if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z) {
                                    constraintWidget.wrapMeasure[0] = measuredWidth;
                                }
                                if (z2) {
                                    constraintWidget.wrapMeasure[1] = measuredHeight;
                                }
                                if (constraintWidget.mMatchConstraintMinWidth > 0) {
                                    measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                    measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                                }
                                if (constraintWidget.mMatchConstraintMinHeight > 0) {
                                    measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                    measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                                }
                                if (!z7) {
                                    if (z8) {
                                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                    }
                                } else if (z8) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                                i2 = -1;
                            }
                            if (baseline != i2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (measuredWidth2 == measure.horizontalDimension) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            measure.measuredNeedsSolverPass = z10;
                            if (layoutParams.needsBaseline) {
                                z9 = true;
                            }
                            if (z9) {
                                measure.measuredNeedsSolverPass = true;
                            }
                            measure.measuredWidth = measuredWidth2;
                            measure.measuredHeight = measuredHeight2;
                            measure.measuredHasBaseline = z9;
                            measure.measuredBaseline = baseline;
                        }
                        z2 = false;
                        if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (z3) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z4) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        view = (android.view.View) constraintWidget.getCompanionWidget();
                        layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                        if (measure.useDeprecated) {
                            if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z) {
                                constraintWidget.wrapMeasure[0] = measuredWidth;
                            }
                            if (z2) {
                                constraintWidget.wrapMeasure[1] = measuredHeight;
                            }
                            if (constraintWidget.mMatchConstraintMinWidth > 0) {
                                measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                            }
                            if (constraintWidget.mMatchConstraintMinHeight > 0) {
                                measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                            }
                            if (!z7) {
                                if (z8) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            } else if (z8) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i2 = -1;
                        } else {
                            if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z) {
                                constraintWidget.wrapMeasure[0] = measuredWidth;
                            }
                            if (z2) {
                                constraintWidget.wrapMeasure[1] = measuredHeight;
                            }
                            if (constraintWidget.mMatchConstraintMinWidth > 0) {
                                measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                                measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                            }
                            if (constraintWidget.mMatchConstraintMinHeight > 0) {
                                measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                                measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                            }
                            if (!z7) {
                                if (z8) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                                }
                            } else if (z8) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                            i2 = -1;
                        }
                        if (baseline != i2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (measuredWidth2 == measure.horizontalDimension) {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                        measure.measuredNeedsSolverPass = z10;
                        if (layoutParams.needsBaseline) {
                            z9 = true;
                        }
                        if (z9) {
                            measure.measuredNeedsSolverPass = true;
                        }
                        measure.measuredWidth = measuredWidth2;
                        measure.measuredHeight = measuredHeight2;
                        measure.measuredHasBaseline = z9;
                        measure.measuredBaseline = baseline;
                    }
                    iMakeMeasureSpec = 0;
                }
                z = true;
                i = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour2.ordinal()];
                if (i == 1) {
                    iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                } else {
                    if (i == 2) {
                        iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -2);
                    } else if (i == 3) {
                        iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -1);
                    } else if (i == 4) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -2);
                        if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!measure.useDeprecated) {
                        }
                    }
                    z2 = true;
                    if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (z3) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (z4) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    view = (android.view.View) constraintWidget.getCompanionWidget();
                    layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                    if (measure.useDeprecated) {
                        if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z) {
                            constraintWidget.wrapMeasure[0] = measuredWidth;
                        }
                        if (z2) {
                            constraintWidget.wrapMeasure[1] = measuredHeight;
                        }
                        if (constraintWidget.mMatchConstraintMinWidth > 0) {
                            measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                            measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                        }
                        if (constraintWidget.mMatchConstraintMinHeight > 0) {
                            measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                            measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                        }
                        if (!z7) {
                            if (z8) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                        } else if (z8) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i2 = -1;
                    } else {
                        if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z) {
                            constraintWidget.wrapMeasure[0] = measuredWidth;
                        }
                        if (z2) {
                            constraintWidget.wrapMeasure[1] = measuredHeight;
                        }
                        if (constraintWidget.mMatchConstraintMinWidth > 0) {
                            measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                            measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                        }
                        if (constraintWidget.mMatchConstraintMinHeight > 0) {
                            measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                            measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                        }
                        if (!z7) {
                            if (z8) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                            }
                        } else if (z8) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                        i2 = -1;
                    }
                    if (baseline != i2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (measuredWidth2 == measure.horizontalDimension) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    measure.measuredNeedsSolverPass = z10;
                    if (layoutParams.needsBaseline) {
                        z9 = true;
                    }
                    if (z9) {
                        measure.measuredNeedsSolverPass = true;
                    }
                    measure.measuredWidth = measuredWidth2;
                    measure.measuredHeight = measuredHeight2;
                    measure.measuredHasBaseline = z9;
                    measure.measuredBaseline = baseline;
                }
                z2 = false;
                if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                view = (android.view.View) constraintWidget.getCompanionWidget();
                layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                if (measure.useDeprecated) {
                    if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z) {
                        constraintWidget.wrapMeasure[0] = measuredWidth;
                    }
                    if (z2) {
                        constraintWidget.wrapMeasure[1] = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMinWidth > 0) {
                        measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                        measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                    }
                    if (constraintWidget.mMatchConstraintMinHeight > 0) {
                        measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                        measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                    }
                    if (!z7) {
                        if (z8) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i2 = -1;
                } else {
                    if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z) {
                        constraintWidget.wrapMeasure[0] = measuredWidth;
                    }
                    if (z2) {
                        constraintWidget.wrapMeasure[1] = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMinWidth > 0) {
                        measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                        measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                    }
                    if (constraintWidget.mMatchConstraintMinHeight > 0) {
                        measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                        measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                    }
                    if (!z7) {
                        if (z8) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i2 = -1;
                }
                if (baseline != i2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (measuredWidth2 == measure.horizontalDimension) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                measure.measuredNeedsSolverPass = z10;
                if (layoutParams.needsBaseline) {
                    z9 = true;
                }
                if (z9) {
                    measure.measuredNeedsSolverPass = true;
                }
                measure.measuredWidth = measuredWidth2;
                measure.measuredHeight = measuredHeight2;
                measure.measuredHasBaseline = z9;
                measure.measuredBaseline = baseline;
            }
            z = false;
            i = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour2.ordinal()];
            if (i == 1) {
                iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
            } else {
                if (i == 2) {
                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -2);
                } else if (i == 3) {
                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -1);
                } else if (i == 4) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    iMakeMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(this.layout.mOnMeasureHeightMeasureSpec, paddingTop, -2);
                    if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!measure.useDeprecated) {
                    }
                }
                z2 = true;
                if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (z3) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                view = (android.view.View) constraintWidget.getCompanionWidget();
                layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
                if (measure.useDeprecated) {
                    if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z) {
                        constraintWidget.wrapMeasure[0] = measuredWidth;
                    }
                    if (z2) {
                        constraintWidget.wrapMeasure[1] = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMinWidth > 0) {
                        measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                        measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                    }
                    if (constraintWidget.mMatchConstraintMinHeight > 0) {
                        measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                        measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                    }
                    if (!z7) {
                        if (z8) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i2 = -1;
                } else {
                    if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z) {
                        constraintWidget.wrapMeasure[0] = measuredWidth;
                    }
                    if (z2) {
                        constraintWidget.wrapMeasure[1] = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMinWidth > 0) {
                        measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                        measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                    }
                    if (constraintWidget.mMatchConstraintMinHeight > 0) {
                        measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                        measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                    }
                    if (!z7) {
                        if (z8) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                        }
                    } else if (z8) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i2 = -1;
                }
                if (baseline != i2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (measuredWidth2 == measure.horizontalDimension) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                measure.measuredNeedsSolverPass = z10;
                if (layoutParams.needsBaseline) {
                    z9 = true;
                }
                if (z9) {
                    measure.measuredNeedsSolverPass = true;
                }
                measure.measuredWidth = measuredWidth2;
                measure.measuredHeight = measuredHeight2;
                measure.measuredHasBaseline = z9;
                measure.measuredBaseline = baseline;
            }
            z2 = false;
            if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (dimensionBehaviour != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z3) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            view = (android.view.View) constraintWidget.getCompanionWidget();
            layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            if (measure.useDeprecated) {
                if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z) {
                    constraintWidget.wrapMeasure[0] = measuredWidth;
                }
                if (z2) {
                    constraintWidget.wrapMeasure[1] = measuredHeight;
                }
                if (constraintWidget.mMatchConstraintMinWidth > 0) {
                    measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                    measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                }
                if (constraintWidget.mMatchConstraintMinHeight > 0) {
                    measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                    measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                }
                if (!z7) {
                    if (z8) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                } else if (z8) {
                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i2 = -1;
            } else {
                if (!(view instanceof androidx.constraintlayout.widget.VirtualLayout)) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z) {
                    constraintWidget.wrapMeasure[0] = measuredWidth;
                }
                if (z2) {
                    constraintWidget.wrapMeasure[1] = measuredHeight;
                }
                if (constraintWidget.mMatchConstraintMinWidth > 0) {
                    measuredWidth2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinWidth, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                if (constraintWidget.mMatchConstraintMaxWidth > 0) {
                    measuredWidth2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxWidth, measuredWidth2);
                }
                if (constraintWidget.mMatchConstraintMinHeight > 0) {
                    measuredHeight2 = java.lang.Math.max(constraintWidget.mMatchConstraintMinHeight, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                if (constraintWidget.mMatchConstraintMaxHeight > 0) {
                    measuredHeight2 = java.lang.Math.min(constraintWidget.mMatchConstraintMaxHeight, measuredHeight2);
                }
                if (!z7) {
                    if (z8) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                    }
                } else if (z8) {
                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.mDimensionRatio) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i2 = -1;
            }
            if (baseline != i2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (measuredWidth2 == measure.horizontalDimension) {
                z10 = true;
            } else {
                z10 = true;
            }
            measure.measuredNeedsSolverPass = z10;
            if (layoutParams.needsBaseline) {
                z9 = true;
            }
            if (z9) {
                measure.measuredNeedsSolverPass = true;
            }
            measure.measuredWidth = measuredWidth2;
            measure.measuredHeight = measuredHeight2;
            measure.measuredHasBaseline = z9;
            measure.measuredBaseline = baseline;
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void didMeasures() {
            int childCount = this.layout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = this.layout.getChildAt(i);
                if (childAt instanceof androidx.constraintlayout.widget.Placeholder) {
                    ((androidx.constraintlayout.widget.Placeholder) childAt).updatePostMeasure(this.layout);
                }
            }
            int size = this.layout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.ConstraintHelper) this.layout.mConstraintHelpers.get(i2)).updatePostMeasure(this.layout);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
        }
    }

    private void init(android.util.AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mLayoutWidget.setMeasurer(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.load(getContext(), resourceId2);
                    } catch (android.content.res.Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ConstraintLayoutStates(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (android.os.Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        super.removeView(view);
        if (android.os.Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof androidx.constraintlayout.widget.Guideline) && !(viewWidget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams();
            layoutParams.widget = new androidx.constraintlayout.solver.widgets.Guideline();
            layoutParams.isGuideline = true;
            ((androidx.constraintlayout.solver.widgets.Guideline) layoutParams.widget).setOrientation(layoutParams.orientation);
        }
        if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) view;
            constraintHelper.validateParams();
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        androidx.constraintlayout.solver.widgets.ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.remove(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            this.mVariableDimensionsWidgets.clear();
            setChildrenConstraints();
        }
        return z;
    }

    private void setChildrenConstraints() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                try {
                    java.lang.String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, java.lang.Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
            }
        } else {
            this.mLayoutWidget.setDebugName("root");
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt2 = getChildAt(i3);
                try {
                    java.lang.String resourceName2 = getResources().getResourceName(childAt2.getId());
                    setDesignInformation(0, resourceName2, java.lang.Integer.valueOf(childAt2.getId()));
                    int iIndexOf2 = resourceName2.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName2 = resourceName2.substring(iIndexOf2 + 1);
                    }
                    getTargetWidget(childAt2.getId()).setDebugName(resourceName2);
                } catch (android.content.res.Resources.NotFoundException unused2) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                android.view.View childAt3 = getChildAt(i4);
                if (childAt3.getId() == this.mConstraintSetId && (childAt3 instanceof androidx.constraintlayout.widget.Constraints)) {
                    this.mConstraintSet = ((androidx.constraintlayout.widget.Constraints) childAt3).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.applyToInternal(this, true);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.mConstraintHelpers.get(i5).updatePreLayout(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt4 = getChildAt(i6);
            if (childAt4 instanceof androidx.constraintlayout.widget.Placeholder) {
                ((androidx.constraintlayout.widget.Placeholder) childAt4).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt5 = getChildAt(i7);
            this.mTempMapIdToWidget.put(childAt5.getId(), getViewWidget(childAt5));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            android.view.View childAt6 = getChildAt(i8);
            androidx.constraintlayout.solver.widgets.ConstraintWidget viewWidget2 = getViewWidget(childAt6);
            if (viewWidget2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt6.getLayoutParams();
                this.mLayoutWidget.add(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt6, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyConstraintsFromLayoutParams(boolean z, android.view.View view, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> sparseArray) {
        int i;
        int i2;
        float f;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget4;
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget5;
        layoutParams.validate();
        layoutParams.helped = false;
        constraintWidget.setVisibility(view.getVisibility());
        if (layoutParams.isInPlaceholder) {
            constraintWidget.setInPlaceholder(true);
            constraintWidget.setVisibility(8);
        }
        constraintWidget.setCompanionWidget(view);
        if (!layoutParams.verticalDimensionFixed || !layoutParams.horizontalDimensionFixed) {
            this.mVariableDimensionsWidgets.add(constraintWidget);
        }
        if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
            ((androidx.constraintlayout.widget.ConstraintHelper) view).resolveRtl(constraintWidget, this.mLayoutWidget.isRtl());
        }
        if (layoutParams.isGuideline) {
            androidx.constraintlayout.solver.widgets.Guideline guideline = (androidx.constraintlayout.solver.widgets.Guideline) constraintWidget;
            int i3 = layoutParams.resolvedGuideBegin;
            int i4 = layoutParams.resolvedGuideEnd;
            float f2 = layoutParams.resolvedGuidePercent;
            if (android.os.Build.VERSION.SDK_INT < 17) {
                i3 = layoutParams.guideBegin;
                i4 = layoutParams.guideEnd;
                f2 = layoutParams.guidePercent;
            }
            if (f2 != -1.0f) {
                guideline.setGuidePercent(f2);
                return;
            } else if (i3 != -1) {
                guideline.setGuideBegin(i3);
                return;
            } else {
                if (i4 != -1) {
                    guideline.setGuideEnd(i4);
                    return;
                }
                return;
            }
        }
        int i5 = layoutParams.resolvedLeftToLeft;
        int i6 = layoutParams.resolvedLeftToRight;
        int i7 = layoutParams.resolvedRightToLeft;
        int i8 = layoutParams.resolvedRightToRight;
        int i9 = layoutParams.resolveGoneLeftMargin;
        int i10 = layoutParams.resolveGoneRightMargin;
        float f3 = layoutParams.resolvedHorizontalBias;
        if (android.os.Build.VERSION.SDK_INT < 17) {
            i5 = layoutParams.leftToLeft;
            int i11 = layoutParams.leftToRight;
            int i12 = layoutParams.rightToLeft;
            i8 = layoutParams.rightToRight;
            int i13 = layoutParams.goneLeftMargin;
            int i14 = layoutParams.goneRightMargin;
            f3 = layoutParams.horizontalBias;
            if (i5 == -1 && i11 == -1) {
                if (layoutParams.startToStart != -1) {
                    i5 = layoutParams.startToStart;
                } else if (layoutParams.startToEnd != -1) {
                    i11 = layoutParams.startToEnd;
                }
            }
            if (i12 == -1 && i8 == -1) {
                if (layoutParams.endToStart != -1) {
                    i12 = layoutParams.endToStart;
                } else if (layoutParams.endToEnd != -1) {
                    i8 = layoutParams.endToEnd;
                }
            }
            i2 = i12;
            i = i14;
            i9 = i13;
            i6 = i11;
        } else {
            i = i10;
            i2 = i7;
        }
        float f4 = f3;
        int i15 = i8;
        if (layoutParams.circleConstraint != -1) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget6 = sparseArray.get(layoutParams.circleConstraint);
            if (constraintWidget6 != null) {
                constraintWidget.connectCircularConstraint(constraintWidget6, layoutParams.circleAngle, layoutParams.circleRadius);
            }
        } else {
            if (i5 != -1) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget7 = sparseArray.get(i5);
                if (constraintWidget7 != null) {
                    f = f4;
                    constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, constraintWidget7, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, layoutParams.leftMargin, i9);
                } else {
                    f = f4;
                }
            } else {
                f = f4;
                if (i6 != -1 && (constraintWidget2 = sparseArray.get(i6)) != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, constraintWidget2, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, layoutParams.leftMargin, i9);
                }
            }
            if (i2 != -1) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget8 = sparseArray.get(i2);
                if (constraintWidget8 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget8, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT, layoutParams.rightMargin, i);
                }
            } else if (i15 != -1 && (constraintWidget3 = sparseArray.get(i15)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget3, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT, layoutParams.rightMargin, i);
            }
            if (layoutParams.topToTop != -1) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget9 = sparseArray.get(layoutParams.topToTop);
                if (constraintWidget9 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, constraintWidget9, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, layoutParams.topMargin, layoutParams.goneTopMargin);
                }
            } else if (layoutParams.topToBottom != -1 && (constraintWidget4 = sparseArray.get(layoutParams.topToBottom)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, constraintWidget4, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, layoutParams.topMargin, layoutParams.goneTopMargin);
            }
            if (layoutParams.bottomToTop != -1) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget10 = sparseArray.get(layoutParams.bottomToTop);
                if (constraintWidget10 != null) {
                    constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget10, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                }
            } else if (layoutParams.bottomToBottom != -1 && (constraintWidget5 = sparseArray.get(layoutParams.bottomToBottom)) != null) {
                constraintWidget.immediateConnect(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget5, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
            }
            if (layoutParams.baselineToBaseline != -1) {
                android.view.View view2 = this.mChildrenByIds.get(layoutParams.baselineToBaseline);
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget11 = sparseArray.get(layoutParams.baselineToBaseline);
                if (constraintWidget11 != null && view2 != null && (view2.getLayoutParams() instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams)) {
                    androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams.needsBaseline = true;
                    layoutParams2.needsBaseline = true;
                    constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE).connect(constraintWidget11.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE), 0, -1, true);
                    constraintWidget.setHasBaseline(true);
                    layoutParams2.widget.setHasBaseline(true);
                    constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP).reset();
                    constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).reset();
                }
            }
            float f5 = f;
            if (f5 >= 0.0f) {
                constraintWidget.setHorizontalBiasPercent(f5);
            }
            if (layoutParams.verticalBias >= 0.0f) {
                constraintWidget.setVerticalBiasPercent(layoutParams.verticalBias);
            }
        }
        if (z && (layoutParams.editorAbsoluteX != -1 || layoutParams.editorAbsoluteY != -1)) {
            constraintWidget.setOrigin(layoutParams.editorAbsoluteX, layoutParams.editorAbsoluteY);
        }
        if (!layoutParams.horizontalDimensionFixed) {
            if (layoutParams.width == -1) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT).mMargin = layoutParams.leftMargin;
                constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT).mMargin = layoutParams.rightMargin;
            } else {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.setWidth(0);
            }
        } else {
            constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setWidth(layoutParams.width);
            if (layoutParams.width == -2) {
                constraintWidget.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        if (!layoutParams.verticalDimensionFixed) {
            if (layoutParams.height == -1) {
                constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP).mMargin = layoutParams.topMargin;
                constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).mMargin = layoutParams.bottomMargin;
            } else {
                constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget.setHeight(0);
            }
        } else {
            constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(layoutParams.height);
            if (layoutParams.height == -2) {
                constraintWidget.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
        if (layoutParams.dimensionRatio != null) {
            constraintWidget.setDimensionRatio(layoutParams.dimensionRatio);
        }
        constraintWidget.setHorizontalWeight(layoutParams.horizontalWeight);
        constraintWidget.setVerticalWeight(layoutParams.verticalWeight);
        constraintWidget.setHorizontalChainStyle(layoutParams.horizontalChainStyle);
        constraintWidget.setVerticalChainStyle(layoutParams.verticalChainStyle);
        constraintWidget.setHorizontalMatchStyle(layoutParams.matchConstraintDefaultWidth, layoutParams.matchConstraintMinWidth, layoutParams.matchConstraintMaxWidth, layoutParams.matchConstraintPercentWidth);
        constraintWidget.setVerticalMatchStyle(layoutParams.matchConstraintDefaultHeight, layoutParams.matchConstraintMinHeight, layoutParams.matchConstraintMaxHeight, layoutParams.matchConstraintPercentHeight);
    }

    private final androidx.constraintlayout.solver.widgets.ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        android.view.View viewFindViewById = this.mChildrenByIds.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).widget;
    }

    public final androidx.constraintlayout.solver.widgets.ConstraintWidget getViewWidget(android.view.View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) view.getLayoutParams()).widget;
    }

    public void fillMetrics(androidx.constraintlayout.solver.Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveSystem(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int paddingLeft;
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i3);
        int size2 = android.view.View.MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = 0;
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            int paddingStart = getPaddingStart();
            paddingRight = getPaddingEnd() + paddingStart;
            paddingLeft = paddingStart;
        } else {
            paddingLeft = 0;
        }
        if (paddingRight == 0) {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight() + paddingLeft;
        }
        int i4 = size - paddingRight;
        int i5 = size2 - paddingBottom;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i4, mode2, i5);
        constraintWidgetContainer.measure(i, mode, i4, mode2, i5, this.mLastMeasureWidth, this.mLastMeasureHeight, paddingLeft, paddingTop);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
        int i5 = i4 + paddingTop;
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            int iResolveSizeAndState = resolveSizeAndState(paddingLeft, i, 0);
            int iResolveSizeAndState2 = resolveSizeAndState(i5, i2, 0);
            int i6 = iResolveSizeAndState & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            int i7 = iResolveSizeAndState2 & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
            int iMin = java.lang.Math.min(this.mMaxWidth, i6);
            int iMin2 = java.lang.Math.min(this.mMaxHeight, i7);
            if (z) {
                iMin |= 16777216;
            }
            if (z2) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
            this.mLastMeasureWidth = iMin;
            this.mLastMeasureHeight = iMin2;
            return;
        }
        setMeasuredDimension(paddingLeft, i5);
        this.mLastMeasureWidth = paddingLeft;
        this.mLastMeasureHeight = i5;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            this.mLayoutWidget.setRtl(((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection());
        }
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.updateHierarchy();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.getWidth(), this.mLayoutWidget.getHeight(), this.mLayoutWidget.isWidthMeasuredTooSmall(), this.mLayoutWidget.isHeightMeasuredTooSmall());
    }

    protected void setSelfDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (i == 1073741824) {
                i2 = java.lang.Math.min(this.mMaxWidth, i2);
            }
            i2 = 0;
        } else {
            dimensionBehaviour = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (i3 == 1073741824) {
                i4 = java.lang.Math.min(this.mMaxHeight, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (i2 != constraintWidgetContainer.getWidth() || i4 != constraintWidgetContainer.getHeight()) {
            constraintWidgetContainer.invalidateMeasures();
        }
        constraintWidgetContainer.setX(0);
        constraintWidgetContainer.setY(0);
        constraintWidgetContainer.setMaxWidth(this.mMaxWidth);
        constraintWidgetContainer.setMaxHeight(this.mMaxHeight);
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setHorizontalDimensionBehaviour(dimensionBehaviour);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setVerticalDimensionBehaviour(dimensionBehaviour2);
        constraintWidgetContainer.setHeight(i4);
        constraintWidgetContainer.setMinWidth(this.mMinWidth - paddingLeft);
        constraintWidgetContainer.setMinHeight(this.mMinHeight - paddingTop);
    }

    public void setState(int i, int i2, int i3) {
        androidx.constraintlayout.widget.ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || layoutParams.isVirtualGroup || zIsInEditMode) && !layoutParams.isInPlaceholder) {
                int x = constraintWidget.getX();
                int y = constraintWidget.getY();
                int width = constraintWidget.getWidth() + x;
                int height = constraintWidget.getHeight() + y;
                childAt.layout(x, y, width, height);
                if ((childAt instanceof androidx.constraintlayout.widget.Placeholder) && (content = ((androidx.constraintlayout.widget.Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(x, y, width, height);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams generateDefaultLayoutParams() {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public android.view.View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        java.lang.Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof java.lang.String)) {
                    java.lang.String[] strArrSplit = ((java.lang.String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i2 = java.lang.Integer.parseInt(strArrSplit[0]);
                        int i3 = java.lang.Integer.parseInt(strArrSplit[1]);
                        int i4 = java.lang.Integer.parseInt(strArrSplit[2]);
                        int i5 = (int) ((i2 / 1080.0f) * width);
                        int i6 = (int) ((i3 / 1920.0f) * height);
                        int i7 = (int) ((java.lang.Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        android.graphics.Paint paint = new android.graphics.Paint();
                        paint.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
                        float f = i5;
                        float f2 = i6;
                        float f3 = i5 + ((int) ((i4 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i6 + i7;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        androidx.constraintlayout.widget.ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.setOnConstraintsChanged(constraintsChangedListener);
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.ConstraintLayoutStates(getContext(), this, i);
                return;
            } catch (android.content.res.Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String constraintTag;
        public java.lang.String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        boolean isVirtualGroup;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        androidx.constraintlayout.solver.widgets.ConstraintWidget widget;

        public androidx.constraintlayout.solver.widgets.ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void setWidgetDebugName(java.lang.String str) {
            this.widget.setDebugName(str);
        }

        public void reset() {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.reset();
            }
        }

        public LayoutParams(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.solver.widgets.ConstraintWidget();
            this.helped = false;
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.constraintTag = layoutParams.constraintTag;
            this.widget = layoutParams.widget;
        }

        private static class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TAG = 51;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED = 0;
            public static final android.util.SparseIntArray map;

            private Table() {
            }

            static {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.solver.widgets.ConstraintWidget();
            this.helped = false;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.Table.map.get(index);
                switch (i3) {
                    case 1:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId == -1) {
                            this.circleConstraint = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f < 0.0f) {
                            this.circleAngle = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 == -1) {
                            this.leftToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 == -1) {
                            this.leftToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 == -1) {
                            this.rightToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 == -1) {
                            this.rightToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 == -1) {
                            this.topToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 == -1) {
                            this.topToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 == -1) {
                            this.bottomToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 == -1) {
                            this.bottomToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 == -1) {
                            this.baselineToBaseline = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 == -1) {
                            this.startToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 == -1) {
                            this.startToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 == -1) {
                            this.endToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 == -1) {
                            this.endToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i4;
                        if (i4 == 1) {
                            android.util.Log.e(androidx.constraintlayout.widget.ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i5;
                        if (i5 == 1) {
                            android.util.Log.e(androidx.constraintlayout.widget.ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                        } catch (java.lang.Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                                this.matchConstraintMinWidth = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                        } catch (java.lang.Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                                this.matchConstraintMaxWidth = -2;
                            }
                        }
                        break;
                    case 35:
                        this.matchConstraintPercentWidth = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                        } catch (java.lang.Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                                this.matchConstraintMinHeight = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                        } catch (java.lang.Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                                this.matchConstraintMaxHeight = -2;
                            }
                        }
                        break;
                    case 38:
                        this.matchConstraintPercentHeight = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                                this.dimensionRatio = string;
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.dimensionRatio.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        java.lang.String strSubstring = this.dimensionRatio.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.dimensionRatioSide = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.dimensionRatio.indexOf(58);
                                    if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                        java.lang.String strSubstring2 = this.dimensionRatio.substring(i, iIndexOf2);
                                        java.lang.String strSubstring3 = this.dimensionRatio.substring(iIndexOf2 + 1);
                                        if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                            try {
                                                float f2 = java.lang.Float.parseFloat(strSubstring2);
                                                float f3 = java.lang.Float.parseFloat(strSubstring3);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.dimensionRatioSide == 1) {
                                                        this.dimensionRatioValue = java.lang.Math.abs(f3 / f2);
                                                    } else {
                                                        this.dimensionRatioValue = java.lang.Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (java.lang.NumberFormatException unused5) {
                                            }
                                        }
                                    } else {
                                        java.lang.String strSubstring4 = this.dimensionRatio.substring(i);
                                        if (strSubstring4.length() > 0) {
                                            this.dimensionRatioValue = java.lang.Float.parseFloat(strSubstring4);
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            validate();
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.horizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.verticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
                return;
            }
            this.isGuideline = true;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (!(this.widget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                this.widget = new androidx.constraintlayout.solver.widgets.Guideline();
            }
            ((androidx.constraintlayout.solver.widgets.Guideline) this.widget).setOrientation(this.orientation);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.solver.widgets.ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0.0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0.0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1.0f;
            this.verticalWeight = -1.0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1.0f;
            this.matchConstraintPercentHeight = 1.0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.constraintTag = null;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.isVirtualGroup = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new androidx.constraintlayout.solver.widgets.ConstraintWidget();
            this.helped = false;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0052  */
        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:25:0x0060  */
        /* JADX WARN: Code duplicated, block: B:28:0x0066  */
        /* JADX WARN: Code duplicated, block: B:31:0x006c  */
        /* JADX WARN: Code duplicated, block: B:38:0x0082  */
        /* JADX WARN: Code duplicated, block: B:39:0x008a  */
        /* JADX WARN: Code duplicated, block: B:41:0x008e  */
        /* JADX WARN: Code duplicated, block: B:42:0x0095  */
        /* JADX WARN: Code duplicated, block: B:44:0x0099  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            float f;
            int i6;
            int i7;
            int i8 = this.leftMargin;
            int i9 = this.rightMargin;
            if (android.os.Build.VERSION.SDK_INT >= 17) {
                super.resolveLayoutDirection(i);
            }
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolveGoneLeftMargin = this.goneLeftMargin;
            this.resolveGoneRightMargin = this.goneRightMargin;
            this.resolvedHorizontalBias = this.horizontalBias;
            this.resolvedGuideBegin = this.guideBegin;
            this.resolvedGuideEnd = this.guideEnd;
            this.resolvedGuidePercent = this.guidePercent;
            boolean z = false;
            if (1 == getLayoutDirection()) {
                int i10 = this.startToEnd;
                if (i10 != -1) {
                    this.resolvedRightToLeft = i10;
                } else {
                    int i11 = this.startToStart;
                    if (i11 != -1) {
                        this.resolvedRightToRight = i11;
                    } else {
                        i2 = this.endToStart;
                        if (i2 != -1) {
                            this.resolvedLeftToRight = i2;
                            z = true;
                        }
                        i3 = this.endToEnd;
                        if (i3 != -1) {
                            this.resolvedLeftToLeft = i3;
                            z = true;
                        }
                        i4 = this.goneStartMargin;
                        if (i4 != -1) {
                            this.resolveGoneRightMargin = i4;
                        }
                        i5 = this.goneEndMargin;
                        if (i5 != -1) {
                            this.resolveGoneLeftMargin = i5;
                        }
                        if (z) {
                            this.resolvedHorizontalBias = 1.0f - this.horizontalBias;
                        }
                        if (this.isGuideline && this.orientation == 1) {
                            f = this.guidePercent;
                            if (f != -1.0f) {
                                this.resolvedGuidePercent = 1.0f - f;
                                this.resolvedGuideBegin = -1;
                                this.resolvedGuideEnd = -1;
                            } else {
                                i6 = this.guideBegin;
                                if (i6 != -1) {
                                    this.resolvedGuideEnd = i6;
                                    this.resolvedGuideBegin = -1;
                                    this.resolvedGuidePercent = -1.0f;
                                } else {
                                    i7 = this.guideEnd;
                                    if (i7 != -1) {
                                        this.resolvedGuideBegin = i7;
                                        this.resolvedGuideEnd = -1;
                                        this.resolvedGuidePercent = -1.0f;
                                    }
                                }
                            }
                        }
                    }
                }
                z = true;
                i2 = this.endToStart;
                if (i2 != -1) {
                    this.resolvedLeftToRight = i2;
                    z = true;
                }
                i3 = this.endToEnd;
                if (i3 != -1) {
                    this.resolvedLeftToLeft = i3;
                    z = true;
                }
                i4 = this.goneStartMargin;
                if (i4 != -1) {
                    this.resolveGoneRightMargin = i4;
                }
                i5 = this.goneEndMargin;
                if (i5 != -1) {
                    this.resolveGoneLeftMargin = i5;
                }
                if (z) {
                    this.resolvedHorizontalBias = 1.0f - this.horizontalBias;
                }
                if (this.isGuideline) {
                    f = this.guidePercent;
                    if (f != -1.0f) {
                        this.resolvedGuidePercent = 1.0f - f;
                        this.resolvedGuideBegin = -1;
                        this.resolvedGuideEnd = -1;
                    } else {
                        i6 = this.guideBegin;
                        if (i6 != -1) {
                            this.resolvedGuideEnd = i6;
                            this.resolvedGuideBegin = -1;
                            this.resolvedGuidePercent = -1.0f;
                        } else {
                            i7 = this.guideEnd;
                            if (i7 != -1) {
                                this.resolvedGuideBegin = i7;
                                this.resolvedGuideEnd = -1;
                                this.resolvedGuidePercent = -1.0f;
                            }
                        }
                    }
                }
            } else {
                int i12 = this.startToEnd;
                if (i12 != -1) {
                    this.resolvedLeftToRight = i12;
                }
                int i13 = this.startToStart;
                if (i13 != -1) {
                    this.resolvedLeftToLeft = i13;
                }
                int i14 = this.endToStart;
                if (i14 != -1) {
                    this.resolvedRightToLeft = i14;
                }
                int i15 = this.endToEnd;
                if (i15 != -1) {
                    this.resolvedRightToRight = i15;
                }
                int i16 = this.goneStartMargin;
                if (i16 != -1) {
                    this.resolveGoneLeftMargin = i16;
                }
                int i17 = this.goneEndMargin;
                if (i17 != -1) {
                    this.resolveGoneRightMargin = i17;
                }
            }
            if (this.endToStart == -1 && this.endToEnd == -1 && this.startToStart == -1 && this.startToEnd == -1) {
                int i18 = this.rightToLeft;
                if (i18 != -1) {
                    this.resolvedRightToLeft = i18;
                    if (this.rightMargin <= 0 && i9 > 0) {
                        this.rightMargin = i9;
                    }
                } else {
                    int i19 = this.rightToRight;
                    if (i19 != -1) {
                        this.resolvedRightToRight = i19;
                        if (this.rightMargin <= 0 && i9 > 0) {
                            this.rightMargin = i9;
                        }
                    }
                }
                int i20 = this.leftToLeft;
                if (i20 != -1) {
                    this.resolvedLeftToLeft = i20;
                    if (this.leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                    this.leftMargin = i8;
                    return;
                }
                int i21 = this.leftToRight;
                if (i21 != -1) {
                    this.resolvedLeftToRight = i21;
                    if (this.leftMargin > 0 || i8 <= 0) {
                        return;
                    }
                    this.leftMargin = i8;
                }
            }
        }

        public java.lang.String getConstraintTag() {
            return this.constraintTag;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
