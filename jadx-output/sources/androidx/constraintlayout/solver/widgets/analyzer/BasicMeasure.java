package androidx.constraintlayout.solver.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    private static final boolean DEBUG = false;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    private static final int MODE_SHIFT = 30;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer;
    private final java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> mVariableDimensionsWidgets = new java.util.ArrayList<>();
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure mMeasure = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure();

    public static class Measure {
        public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public boolean useDeprecated;
        public androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    public enum MeasureType {
    }

    public interface Measurer {
        void didMeasures();

        void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure measure);
    }

    public void updateHierarchy(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.mVariableDimensionsWidgets.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                this.mVariableDimensionsWidgets.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    public BasicMeasure(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.constraintWidgetContainer = constraintWidgetContainer;
    }

    private void solveLinearSystem(java.lang.String str) {
        this.constraintWidgetContainer.layout();
    }

    private void measureChildren(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        int size = constraintWidgetContainer.mChildren.size();
        androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer = constraintWidgetContainer.getMeasurer();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (!(constraintWidget instanceof androidx.constraintlayout.solver.widgets.Guideline) && (!constraintWidget.horizontalRun.dimension.resolved || !constraintWidget.verticalRun.dimension.resolved)) {
                if (!(constraintWidget.getDimensionBehaviour(0) == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth != 1 && constraintWidget.getDimensionBehaviour(1) == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight != 1)) {
                    measure(measurer, constraintWidget, false);
                }
            }
        }
        measurer.didMeasures();
    }

    public void solverMeasure(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean zDirectMeasure;
        int i10;
        boolean z2;
        boolean z3;
        int i11;
        java.lang.String str;
        int i12;
        androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer;
        boolean z4;
        boolean zDirectMeasureWithOrientation;
        int i13;
        androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer2 = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean zEnabled = androidx.constraintlayout.solver.widgets.Optimizer.enabled(i, 128);
        boolean z5 = zEnabled || androidx.constraintlayout.solver.widgets.Optimizer.enabled(i, 64);
        if (z5) {
            int i14 = 0;
            while (true) {
                if (i14 < size) {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i14);
                    boolean z6 = z5;
                    boolean z7 = (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.getDimensionRatio() > 0.0f;
                    if ((constraintWidget.isInHorizontalChain() && z7) || ((constraintWidget.isInVerticalChain() && z7) || (constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout))) {
                        z = false;
                    } else {
                        i14++;
                        z5 = z6;
                    }
                } else {
                    z = z5;
                }
            }
        } else {
            z = z5;
        }
        if (z && androidx.constraintlayout.solver.LinearSystem.sMetrics != null) {
            androidx.constraintlayout.solver.LinearSystem.sMetrics.measures++;
        }
        if (z & (i4 == 1073741824 && i6 == 1073741824)) {
            if (i4 == 1073741824 && constraintWidgetContainer.getWidth() != i5) {
                constraintWidgetContainer.setWidth(i5);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.getHeight() != i7) {
                constraintWidgetContainer.setHeight(i7);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zDirectMeasure = constraintWidgetContainer.directMeasure(zEnabled);
                i10 = 2;
            } else {
                boolean zDirectMeasureSetup = constraintWidgetContainer.directMeasureSetup(zEnabled);
                if (i4 == 1073741824) {
                    zDirectMeasureWithOrientation = zDirectMeasureSetup & constraintWidgetContainer.directMeasureWithOrientation(zEnabled, 0);
                    i13 = 1;
                } else {
                    zDirectMeasureWithOrientation = zDirectMeasureSetup;
                    i13 = 0;
                }
                if (i6 == 1073741824) {
                    zDirectMeasureWithOrientation &= constraintWidgetContainer.directMeasureWithOrientation(zEnabled, 1);
                    i13++;
                }
                boolean z8 = zDirectMeasureWithOrientation;
                i10 = i13;
                zDirectMeasure = z8;
            }
            if (zDirectMeasure) {
                constraintWidgetContainer.updateFromRuns(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            constraintWidgetContainer.horizontalRun.clear();
            constraintWidgetContainer.verticalRun.clear();
            for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2 : constraintWidgetContainer.getChildren()) {
                constraintWidget2.horizontalRun.clear();
                constraintWidget2.verticalRun.clear();
            }
            zDirectMeasure = false;
            i10 = 0;
        }
        if (zDirectMeasure && i10 == 2) {
            return;
        }
        if (size > 0) {
            measureChildren(constraintWidgetContainer);
        }
        int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
        constraintWidgetContainer.setOptimizationLevel(64);
        int size2 = this.mVariableDimensionsWidgets.size();
        if (size > 0) {
            solveLinearSystem("First pass");
        }
        if (size2 > 0) {
            boolean z9 = constraintWidgetContainer.getHorizontalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z10 = constraintWidgetContainer.getVerticalDimensionBehaviour() == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int iMax = java.lang.Math.max(constraintWidgetContainer.getWidth(), this.constraintWidgetContainer.getMinWidth());
            int iMax2 = java.lang.Math.max(constraintWidgetContainer.getHeight(), this.constraintWidgetContainer.getMinHeight());
            int i15 = 0;
            boolean zMeasure = false;
            while (i15 < size2) {
                androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget3 = this.mVariableDimensionsWidgets.get(i15);
                if (constraintWidget3 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout) {
                    int width2 = constraintWidget3.getWidth();
                    int height2 = constraintWidget3.getHeight();
                    boolean zMeasure2 = zMeasure | measure(measurer2, constraintWidget3, true);
                    int width3 = constraintWidget3.getWidth();
                    int height3 = constraintWidget3.getHeight();
                    if (width3 != width2) {
                        constraintWidget3.setWidth(width3);
                        if (z9 && constraintWidget3.getRight() > iMax) {
                            iMax = java.lang.Math.max(iMax, constraintWidget3.getRight() + constraintWidget3.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
                        }
                        z4 = true;
                    } else {
                        z4 = zMeasure2;
                    }
                    if (height3 != height2) {
                        constraintWidget3.setHeight(height3);
                        if (z10 && constraintWidget3.getBottom() > iMax2) {
                            iMax2 = java.lang.Math.max(iMax2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
                        }
                        z4 = true;
                    }
                    zMeasure = z4 | ((androidx.constraintlayout.solver.widgets.VirtualLayout) constraintWidget3).needSolverPass();
                }
                i15++;
                optimizationLevel = optimizationLevel;
            }
            int i16 = optimizationLevel;
            java.lang.String str2 = "2nd pass";
            if (zMeasure) {
                constraintWidgetContainer.setWidth(width);
                constraintWidgetContainer.setHeight(height);
                solveLinearSystem("2nd pass");
                zMeasure = false;
            }
            int i17 = 0;
            while (i17 < 2) {
                int i18 = 0;
                while (i18 < size2) {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget4 = this.mVariableDimensionsWidgets.get(i18);
                    if ((!(constraintWidget4 instanceof androidx.constraintlayout.solver.widgets.Helper) || (constraintWidget4 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) && !(constraintWidget4 instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                        i11 = size2;
                        if (constraintWidget4.getVisibility() != 8 && ((!constraintWidget4.horizontalRun.dimension.resolved || !constraintWidget4.verticalRun.dimension.resolved) && !(constraintWidget4 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout))) {
                            int width4 = constraintWidget4.getWidth();
                            int height4 = constraintWidget4.getHeight();
                            str = str2;
                            int baselineDistance = constraintWidget4.getBaselineDistance();
                            i12 = i17;
                            zMeasure |= measure(measurer2, constraintWidget4, true);
                            int width5 = constraintWidget4.getWidth();
                            measurer = measurer2;
                            int height5 = constraintWidget4.getHeight();
                            if (width5 != width4) {
                                constraintWidget4.setWidth(width5);
                                if (z9 && constraintWidget4.getRight() > iMax) {
                                    iMax = java.lang.Math.max(iMax, constraintWidget4.getRight() + constraintWidget4.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                zMeasure = true;
                            }
                            if (height5 != height4) {
                                constraintWidget4.setHeight(height5);
                                if (z10 && constraintWidget4.getBottom() > iMax2) {
                                    iMax2 = java.lang.Math.max(iMax2, constraintWidget4.getBottom() + constraintWidget4.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                zMeasure = true;
                            }
                            if (constraintWidget4.hasBaseline() && baselineDistance != constraintWidget4.getBaselineDistance()) {
                                zMeasure = true;
                            }
                        }
                        i18++;
                        size2 = i11;
                        str2 = str;
                        measurer2 = measurer;
                        i17 = i12;
                    } else {
                        i11 = size2;
                    }
                    str = str2;
                    i12 = i17;
                    measurer = measurer2;
                    i18++;
                    size2 = i11;
                    str2 = str;
                    measurer2 = measurer;
                    i17 = i12;
                }
                java.lang.String str3 = str2;
                int i19 = size2;
                int i20 = i17;
                androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer3 = measurer2;
                if (zMeasure) {
                    constraintWidgetContainer.setWidth(width);
                    constraintWidgetContainer.setHeight(height);
                    solveLinearSystem("intermediate pass");
                    zMeasure = false;
                }
                i17 = i20 + 1;
                size2 = i19;
                str2 = str3;
                measurer2 = measurer3;
            }
            java.lang.String str4 = str2;
            if (zMeasure) {
                constraintWidgetContainer.setWidth(width);
                constraintWidgetContainer.setHeight(height);
                solveLinearSystem(str4);
                if (constraintWidgetContainer.getWidth() < iMax) {
                    constraintWidgetContainer.setWidth(iMax);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (constraintWidgetContainer.getHeight() < iMax2) {
                    constraintWidgetContainer.setHeight(iMax2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    solveLinearSystem("3rd pass");
                }
            }
            optimizationLevel = i16;
        }
        constraintWidgetContainer.setOptimizationLevel(optimizationLevel);
    }

    private boolean measure(androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, boolean z) {
        this.mMeasure.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.mMeasure.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.mMeasure.horizontalDimension = constraintWidget.getWidth();
        this.mMeasure.verticalDimension = constraintWidget.getHeight();
        this.mMeasure.measuredNeedsSolverPass = false;
        this.mMeasure.useDeprecated = z;
        measurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
        this.mMeasure.useDeprecated = false;
        return this.mMeasure.measuredNeedsSolverPass;
    }
}
