package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends androidx.constraintlayout.solver.widgets.WidgetContainer {
    private static final boolean DEBUG = false;
    static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure mBasicMeasureSolver;
    int mDebugSolverPassCount;
    public androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph mDependencyGraph;
    public boolean mGroupsWrapOptimized;
    private boolean mHeightMeasuredTooSmall;
    androidx.constraintlayout.solver.widgets.ChainHead[] mHorizontalChainsArray;
    int mHorizontalChainsSize;
    public boolean mHorizontalWrapOptimized;
    private boolean mIsRtl;
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer mMeasurer;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    public boolean mSkipSolver;
    protected androidx.constraintlayout.solver.LinearSystem mSystem;
    androidx.constraintlayout.solver.widgets.ChainHead[] mVerticalChainsArray;
    int mVerticalChainsSize;
    public boolean mVerticalWrapOptimized;
    private boolean mWidthMeasuredTooSmall;
    public int mWrapFixedHeight;
    public int mWrapFixedWidth;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public java.lang.String getType() {
        return "ConstraintLayout";
    }

    public boolean handlesInternalConstraints() {
        return false;
    }

    public void invalidateGraph() {
        this.mDependencyGraph.invalidateGraph();
    }

    public void invalidateMeasures() {
        this.mDependencyGraph.invalidateMeasures();
    }

    public boolean directMeasure(boolean z) {
        return this.mDependencyGraph.directMeasure(z);
    }

    public boolean directMeasureSetup(boolean z) {
        return this.mDependencyGraph.directMeasureSetup(z);
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        return this.mDependencyGraph.directMeasureWithOrientation(z, i);
    }

    public void defineTerminalWidgets() {
        this.mDependencyGraph.defineTerminalWidgets(getHorizontalDimensionBehaviour(), getVerticalDimensionBehaviour());
    }

    public void measure(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.mPaddingLeft = i8;
        this.mPaddingTop = i9;
        this.mBasicMeasureSolver.solverMeasure(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public void updateHierarchy() {
        this.mBasicMeasureSolver.updateHierarchy(this);
    }

    public void setMeasurer(androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
        this.mDependencyGraph.setMeasurer(measurer);
    }

    public androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer getMeasurer() {
        return this.mMeasurer;
    }

    public void fillMetrics(androidx.constraintlayout.solver.Metrics metrics) {
        this.mSystem.fillMetrics(metrics);
    }

    public ConstraintWidgetContainer() {
        this.mBasicMeasureSolver = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.solver.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.solver.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.solver.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 71;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.mBasicMeasureSolver = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.solver.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.solver.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.solver.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 71;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
        this.mBasicMeasureSolver = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure(this);
        this.mDependencyGraph = new androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph(this);
        this.mMeasurer = null;
        this.mIsRtl = false;
        this.mSystem = new androidx.constraintlayout.solver.LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new androidx.constraintlayout.solver.widgets.ChainHead[4];
        this.mHorizontalChainsArray = new androidx.constraintlayout.solver.widgets.ChainHead[4];
        this.mGroupsWrapOptimized = false;
        this.mHorizontalWrapOptimized = false;
        this.mVerticalWrapOptimized = false;
        this.mWrapFixedWidth = 0;
        this.mWrapFixedHeight = 0;
        this.mOptimizationLevel = 71;
        this.mSkipSolver = false;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
    }

    public int getOptimizationLevel() {
        return this.mOptimizationLevel;
    }

    public boolean optimizeFor(int i) {
        return (this.mOptimizationLevel & i) == i;
    }

    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer, androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        this.mSkipSolver = false;
        super.reset();
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    public boolean addChildrenToSolver(androidx.constraintlayout.solver.LinearSystem linearSystem) {
        addToSolver(linearSystem);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout) {
                constraintWidget.addToSolver(linearSystem);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = this.mChildren.get(i2);
            if (constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.mListDimensionBehaviors[0];
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.mListDimensionBehaviors[1];
                if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget2.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget2.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                }
                constraintWidget2.addToSolver(linearSystem);
                if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget2.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            } else {
                androidx.constraintlayout.solver.widgets.Optimizer.checkMatchParent(this, linearSystem, constraintWidget2);
                if (!(constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) {
                    constraintWidget2.addToSolver(linearSystem);
                }
            }
        }
        if (this.mHorizontalChainsSize > 0) {
            androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(this, linearSystem, 0);
        }
        if (this.mVerticalChainsSize > 0) {
            androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(this, linearSystem, 1);
        }
        return true;
    }

    public void updateChildrenFromSolver(androidx.constraintlayout.solver.LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        updateFromSolver(linearSystem);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromSolver(linearSystem);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromRuns(boolean z, boolean z2) {
        super.updateFromRuns(z, z2);
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            this.mChildren.get(i).updateFromRuns(z, z2);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.mPaddingLeft = i;
        this.mPaddingTop = i2;
        this.mPaddingRight = i3;
        this.mPaddingBottom = i4;
    }

    public void setRtl(boolean z) {
        this.mIsRtl = z;
    }

    public boolean isRtl() {
        return this.mIsRtl;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01d4 A[PHI: r0 r12
      0x01d4: PHI (r0v28 boolean) = (r0v27 boolean), (r0v30 boolean), (r0v30 boolean), (r0v30 boolean) binds: [B:70:0x0197, B:78:0x01bc, B:79:0x01be, B:81:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean) binds: [B:70:0x0197, B:78:0x01bc, B:79:0x01be, B:81:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean] */
    @Override // androidx.constraintlayout.solver.widgets.WidgetContainer
    public void layout() {
        boolean z;
        ?? r11;
        this.mX = 0;
        this.mY = 0;
        int iMax = java.lang.Math.max(0, getWidth());
        int iMax2 = java.lang.Math.max(0, getHeight());
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        boolean z2 = optimizeFor(64) || optimizeFor(128);
        this.mSystem.graphOptimizer = false;
        this.mSystem.newgraphOptimizer = false;
        if (this.mOptimizationLevel != 0 && z2) {
            this.mSystem.newgraphOptimizer = true;
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[1];
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[0];
        resetChains();
        java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> arrayList = this.mChildren;
        boolean z3 = getHorizontalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getVerticalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        resetChains();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.WidgetContainer) {
                ((androidx.constraintlayout.solver.widgets.WidgetContainer) constraintWidget).layout();
            }
        }
        int i2 = 0;
        boolean zAddChildrenToSolver = true;
        boolean z4 = false;
        while (zAddChildrenToSolver) {
            int i3 = i2 + 1;
            try {
                this.mSystem.reset();
                resetChains();
                createObjectVariables(this.mSystem);
                for (int i4 = 0; i4 < size; i4++) {
                    this.mChildren.get(i4).createObjectVariables(this.mSystem);
                }
                zAddChildrenToSolver = addChildrenToSolver(this.mSystem);
                if (zAddChildrenToSolver) {
                    this.mSystem.minimize();
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                java.lang.System.out.println("EXCEPTION : " + e);
            }
            if (zAddChildrenToSolver) {
                updateChildrenFromSolver(this.mSystem, androidx.constraintlayout.solver.widgets.Optimizer.flags);
            } else {
                updateFromSolver(this.mSystem);
                for (int i5 = 0; i5 < size; i5++) {
                    this.mChildren.get(i5);
                }
            }
            if (z3 && i3 < 8 && androidx.constraintlayout.solver.widgets.Optimizer.flags[2]) {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 = this.mChildren.get(i6);
                    iMax3 = java.lang.Math.max(iMax3, constraintWidget2.mX + constraintWidget2.getWidth());
                    iMax4 = java.lang.Math.max(iMax4, constraintWidget2.mY + constraintWidget2.getHeight());
                }
                int iMax5 = java.lang.Math.max(this.mMinWidth, iMax3);
                int iMax6 = java.lang.Math.max(this.mMinHeight, iMax4);
                if (dimensionBehaviour2 != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || getWidth() >= iMax5) {
                    z = false;
                } else {
                    setWidth(iMax5);
                    this.mListDimensionBehaviors[0] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z = true;
                    z4 = true;
                }
                if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getHeight() < iMax6) {
                    setHeight(iMax6);
                    this.mListDimensionBehaviors[1] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z = true;
                    z4 = true;
                }
            } else {
                z = false;
            }
            int iMax7 = java.lang.Math.max(this.mMinWidth, getWidth());
            if (iMax7 > getWidth()) {
                setWidth(iMax7);
                this.mListDimensionBehaviors[0] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                z = true;
                z4 = true;
            }
            int iMax8 = java.lang.Math.max(this.mMinHeight, getHeight());
            if (iMax8 > getHeight()) {
                setHeight(iMax8);
                r11 = 1;
                this.mListDimensionBehaviors[1] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                z = true;
                z4 = true;
            } else {
                r11 = 1;
            }
            if (z4) {
                zAddChildrenToSolver = z;
            } else {
                if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && iMax > 0 && getWidth() > iMax) {
                    this.mWidthMeasuredTooSmall = r11;
                    this.mListDimensionBehaviors[0] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    setWidth(iMax);
                    z = true;
                    z4 = true;
                }
                if (this.mListDimensionBehaviors[r11] != androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || iMax2 <= 0 || getHeight() <= iMax2) {
                    zAddChildrenToSolver = z;
                } else {
                    this.mHeightMeasuredTooSmall = r11;
                    this.mListDimensionBehaviors[r11] = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    setHeight(iMax2);
                    zAddChildrenToSolver = true;
                    z4 = true;
                }
            }
            i2 = i3;
        }
        this.mChildren = arrayList;
        if (z4) {
            this.mListDimensionBehaviors[0] = dimensionBehaviour2;
            this.mListDimensionBehaviors[1] = dimensionBehaviour;
        }
        resetSolverVariables(this.mSystem.getCache());
    }

    public java.util.ArrayList<androidx.constraintlayout.solver.widgets.Guideline> getVerticalGuidelines() {
        java.util.ArrayList<androidx.constraintlayout.solver.widgets.Guideline> arrayList = new java.util.ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.Guideline) {
                androidx.constraintlayout.solver.widgets.Guideline guideline = (androidx.constraintlayout.solver.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public java.util.ArrayList<androidx.constraintlayout.solver.widgets.Guideline> getHorizontalGuidelines() {
        java.util.ArrayList<androidx.constraintlayout.solver.widgets.Guideline> arrayList = new java.util.ArrayList<>();
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = this.mChildren.get(i);
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.Guideline) {
                androidx.constraintlayout.solver.widgets.Guideline guideline = (androidx.constraintlayout.solver.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 0) {
                    arrayList.add(guideline);
                }
            }
        }
        return arrayList;
    }

    public androidx.constraintlayout.solver.LinearSystem getSystem() {
        return this.mSystem;
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    void addChain(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            addHorizontalChain(constraintWidget);
        } else if (i == 1) {
            addVerticalChain(constraintWidget);
        }
    }

    private void addHorizontalChain(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        int i = this.mHorizontalChainsSize + 1;
        androidx.constraintlayout.solver.widgets.ChainHead[] chainHeadArr = this.mHorizontalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mHorizontalChainsArray = (androidx.constraintlayout.solver.widgets.ChainHead[]) java.util.Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = new androidx.constraintlayout.solver.widgets.ChainHead(constraintWidget, 0, isRtl());
        this.mHorizontalChainsSize++;
    }

    private void addVerticalChain(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        int i = this.mVerticalChainsSize + 1;
        androidx.constraintlayout.solver.widgets.ChainHead[] chainHeadArr = this.mVerticalChainsArray;
        if (i >= chainHeadArr.length) {
            this.mVerticalChainsArray = (androidx.constraintlayout.solver.widgets.ChainHead[]) java.util.Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.mVerticalChainsArray[this.mVerticalChainsSize] = new androidx.constraintlayout.solver.widgets.ChainHead(constraintWidget, 1, isRtl());
        this.mVerticalChainsSize++;
    }
}
