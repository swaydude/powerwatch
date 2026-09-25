package androidx.constraintlayout.solver.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class DependencyGraph {
    private static final boolean USE_GROUPS = true;
    private androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer container;
    private androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer mContainer;
    private boolean mNeedBuildGraph = true;
    private boolean mNeedRedoMeasures = true;
    private java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> mRuns = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> runGroups = new java.util.ArrayList<>();
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer mMeasurer = null;
    private androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure mMeasure = new androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measure();
    java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> mGroups = new java.util.ArrayList<>();

    public DependencyGraph(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.container = constraintWidgetContainer;
        this.mContainer = constraintWidgetContainer;
    }

    public void setMeasurer(androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer measurer) {
        this.mMeasurer = measurer;
    }

    private int computeWrap(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.mGroups.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = java.lang.Math.max(jMax, this.mGroups.get(i2).computeWrapSize(constraintWidgetContainer, i));
        }
        return (int) jMax;
    }

    public void defineTerminalWidgets(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.mNeedBuildGraph) {
            buildGraph();
            boolean z = false;
            for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget : this.container.mChildren) {
                constraintWidget.isTerminalWidget[0] = true;
                constraintWidget.isTerminalWidget[1] = true;
                if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.Barrier) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> it = this.mGroups.iterator();
            while (it.hasNext()) {
                it.next().defineTerminalWidgets(dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.mNeedBuildGraph || this.mNeedRedoMeasures) {
            for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget : this.container.mChildren) {
                constraintWidget.measured = false;
                constraintWidget.horizontalRun.dimension.resolved = false;
                constraintWidget.verticalRun.dimension.resolved = false;
                constraintWidget.horizontalRun.resolved = false;
                constraintWidget.verticalRun.resolved = false;
                constraintWidget.horizontalRun.reset();
                constraintWidget.verticalRun.reset();
            }
            this.container.measured = false;
            this.container.horizontalRun.dimension.resolved = false;
            this.container.verticalRun.dimension.resolved = false;
            this.container.horizontalRun.resolved = false;
            this.container.verticalRun.resolved = false;
            this.container.horizontalRun.reset();
            this.container.verticalRun.reset();
            this.mNeedRedoMeasures = false;
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.container.getDimensionBehaviour(0);
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(1);
        if (this.mNeedBuildGraph) {
            buildGraph();
        }
        int x = this.container.getX();
        int y = this.container.getY();
        this.container.horizontalRun.start.resolve(x);
        this.container.verticalRun.start.resolve(y);
        measureWidgets();
        if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            if (z4) {
                java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> it = this.mRuns.iterator();
                while (it.hasNext()) {
                    if (!it.next().supportsWrapComputation()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.container;
                constraintWidgetContainer.setWidth(computeWrap(constraintWidgetContainer, 0));
                this.container.horizontalRun.dimension.resolve(this.container.getWidth());
            }
            if (z4 && dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                constraintWidgetContainer2.setHeight(computeWrap(constraintWidgetContainer2, 1));
                this.container.verticalRun.dimension.resolve(this.container.getHeight());
            }
        }
        if (this.container.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.container.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = this.container.getWidth() + x;
            this.container.horizontalRun.end.resolve(width);
            this.container.horizontalRun.dimension.resolve(width - x);
            measureWidgets();
            if (this.container.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.container.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = this.container.getHeight() + y;
                this.container.verticalRun.end.resolve(height);
                this.container.verticalRun.dimension.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun : this.mRuns) {
            if (widgetRun.widget != this.container || widgetRun.resolved) {
                widgetRun.applyToWidget();
            }
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun2 : this.mRuns) {
            if (z2 || widgetRun2.widget != this.container) {
                if (!widgetRun2.start.resolved || ((!widgetRun2.end.resolved && !(widgetRun2 instanceof androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference)) || (!widgetRun2.dimension.resolved && !(widgetRun2 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun) && !(widgetRun2 instanceof androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.mNeedBuildGraph) {
            for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget : this.container.mChildren) {
                constraintWidget.measured = false;
                constraintWidget.horizontalRun.dimension.resolved = false;
                constraintWidget.horizontalRun.resolved = false;
                constraintWidget.horizontalRun.reset();
                constraintWidget.verticalRun.dimension.resolved = false;
                constraintWidget.verticalRun.resolved = false;
                constraintWidget.verticalRun.reset();
            }
            this.container.measured = false;
            this.container.horizontalRun.dimension.resolved = false;
            this.container.horizontalRun.resolved = false;
            this.container.horizontalRun.reset();
            this.container.verticalRun.dimension.resolved = false;
            this.container.verticalRun.resolved = false;
            this.container.verticalRun.reset();
            buildGraph();
        }
        if (basicMeasureWidgets(this.mContainer)) {
            return false;
        }
        this.container.setX(0);
        this.container.setY(0);
        this.container.horizontalRun.start.resolve(0);
        this.container.verticalRun.start.resolve(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.container.getDimensionBehaviour(0);
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.container.getDimensionBehaviour(1);
        int x = this.container.getX();
        int y = this.container.getY();
        if (z4 && (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
            for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun : this.mRuns) {
                if (widgetRun.orientation == i && !widgetRun.supportsWrapComputation()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.container.setHorizontalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.container;
                    constraintWidgetContainer.setWidth(computeWrap(constraintWidgetContainer, 0));
                    this.container.horizontalRun.dimension.resolve(this.container.getWidth());
                }
            } else if (z4 && dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.container.setVerticalDimensionBehaviour(androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = this.container;
                constraintWidgetContainer2.setHeight(computeWrap(constraintWidgetContainer2, 1));
                this.container.verticalRun.dimension.resolve(this.container.getHeight());
            }
        }
        if (i == 0) {
            if (this.container.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.container.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = this.container.getWidth() + x;
                this.container.horizontalRun.end.resolve(width);
                this.container.horizontalRun.dimension.resolve(width - x);
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (this.container.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.container.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int height = this.container.getHeight() + y;
            this.container.verticalRun.end.resolve(height);
            this.container.verticalRun.dimension.resolve(height - y);
            z2 = true;
        } else {
            z2 = false;
        }
        measureWidgets();
        for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun2 : this.mRuns) {
            if (widgetRun2.orientation == i && (widgetRun2.widget != this.container || widgetRun2.resolved)) {
                widgetRun2.applyToWidget();
            }
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun3 : this.mRuns) {
            if (widgetRun3.orientation == i && (z2 || widgetRun3.widget != this.container)) {
                if (!widgetRun3.start.resolved || !widgetRun3.end.resolved || (!(widgetRun3 instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun) && !widgetRun3.dimension.resolved)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.container.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.container.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    private void measure(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        this.mMeasure.horizontalBehavior = dimensionBehaviour;
        this.mMeasure.verticalBehavior = dimensionBehaviour2;
        this.mMeasure.horizontalDimension = i;
        this.mMeasure.verticalDimension = i2;
        this.mMeasurer.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    private boolean basicMeasureWidgets(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        int width;
        int height;
        for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget : constraintWidgetContainer.mChildren) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.mListDimensionBehaviors[0];
            androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.mListDimensionBehaviors[1];
            if (constraintWidget.getVisibility() == 8) {
                constraintWidget.measured = true;
            } else {
                if (constraintWidget.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.mMatchConstraintDefaultWidth = 2;
                }
                if (constraintWidget.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.mMatchConstraintDefaultHeight = 2;
                }
                if (constraintWidget.getDimensionRatio() > 0.0f) {
                    if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                            constraintWidget.mMatchConstraintDefaultWidth = 3;
                        }
                        if (constraintWidget.mMatchConstraintDefaultHeight == 0) {
                            constraintWidget.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 1 && (constraintWidget.mLeft.mTarget == null || constraintWidget.mRight.mTarget == null)) {
                    dimensionBehaviour = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviour;
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 1 && (constraintWidget.mTop.mTarget == null || constraintWidget.mBottom.mTarget == null)) ? androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : dimensionBehaviour2;
                constraintWidget.horizontalRun.dimensionBehavior = dimensionBehaviour3;
                constraintWidget.horizontalRun.matchConstraintsType = constraintWidget.mMatchConstraintDefaultWidth;
                constraintWidget.verticalRun.dimensionBehavior = dimensionBehaviour4;
                constraintWidget.verticalRun.matchConstraintsType = constraintWidget.mMatchConstraintDefaultHeight;
                if ((dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int width2 = constraintWidget.getWidth();
                    if (dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        width = (constraintWidgetContainer.getWidth() - constraintWidget.mLeft.mMargin) - constraintWidget.mRight.mMargin;
                        dimensionBehaviour3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        width = width2;
                    }
                    int height2 = constraintWidget.getHeight();
                    if (dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        height = (constraintWidgetContainer.getHeight() - constraintWidget.mTop.mMargin) - constraintWidget.mBottom.mMargin;
                        dimensionBehaviour4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        height = height2;
                    }
                    measure(constraintWidget, dimensionBehaviour3, width, dimensionBehaviour4, height);
                    constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                    constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                    constraintWidget.measured = true;
                } else {
                    if (dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (constraintWidget.mMatchConstraintDefaultWidth == 3) {
                            if (dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            int height3 = constraintWidget.getHeight();
                            measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((height3 * constraintWidget.mDimensionRatio) + 0.5f), androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, height3);
                            constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                            constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        } else if (constraintWidget.mMatchConstraintDefaultWidth == 1) {
                            measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour4, 0);
                            constraintWidget.horizontalRun.dimension.wrapValue = constraintWidget.getWidth();
                        } else if (constraintWidget.mMatchConstraintDefaultWidth == 2) {
                            if (constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((constraintWidget.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour4, constraintWidget.getHeight());
                                constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                                constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        } else if (constraintWidget.mListAnchors[0].mTarget == null || constraintWidget.mListAnchors[1].mTarget == null) {
                            measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour4, 0);
                            constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                            constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        }
                    }
                    if (dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (constraintWidget.mMatchConstraintDefaultHeight == 3) {
                            if (dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            int width3 = constraintWidget.getWidth();
                            float f = constraintWidget.mDimensionRatio;
                            if (constraintWidget.getDimensionRatioSide() == -1) {
                                f = 1.0f / f;
                            }
                            measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, width3, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((width3 * f) + 0.5f));
                            constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                            constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        } else if (constraintWidget.mMatchConstraintDefaultHeight == 1) {
                            measure(constraintWidget, dimensionBehaviour3, 0, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            constraintWidget.verticalRun.dimension.wrapValue = constraintWidget.getHeight();
                        } else if (constraintWidget.mMatchConstraintDefaultHeight == 2) {
                            if (constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                measure(constraintWidget, dimensionBehaviour3, constraintWidget.getWidth(), androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((constraintWidget.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                                constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        } else if (constraintWidget.mListAnchors[2].mTarget == null || constraintWidget.mListAnchors[3].mTarget == null) {
                            measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour4, 0);
                            constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                            constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                            constraintWidget.measured = true;
                        }
                    }
                    if (dimensionBehaviour3 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour4 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.mMatchConstraintDefaultWidth == 1 || constraintWidget.mMatchConstraintDefaultHeight == 1) {
                            measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            constraintWidget.horizontalRun.dimension.wrapValue = constraintWidget.getWidth();
                            constraintWidget.verticalRun.dimension.wrapValue = constraintWidget.getHeight();
                        } else if (constraintWidget.mMatchConstraintDefaultHeight == 2 && constraintWidget.mMatchConstraintDefaultWidth == 2 && (constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                            if (constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                                measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((constraintWidget.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((constraintWidget.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                                constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                                constraintWidget.measured = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void measureWidgets() {
        for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget : this.container.mChildren) {
            if (!constraintWidget.measured) {
                boolean z = false;
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.mListDimensionBehaviors[0];
                androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.mListDimensionBehaviors[1];
                int i = constraintWidget.mMatchConstraintDefaultWidth;
                int i2 = constraintWidget.mMatchConstraintDefaultHeight;
                boolean z2 = dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                boolean z3 = constraintWidget.horizontalRun.dimension.resolved;
                boolean z4 = constraintWidget.verticalRun.dimension.resolved;
                if (z3 && z4) {
                    measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.horizontalRun.dimension.value, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.verticalRun.dimension.value);
                    constraintWidget.measured = true;
                } else if (z3 && z) {
                    measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.horizontalRun.dimension.value, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, constraintWidget.verticalRun.dimension.value);
                    if (dimensionBehaviour2 == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.verticalRun.dimension.wrapValue = constraintWidget.getHeight();
                    } else {
                        constraintWidget.verticalRun.dimension.resolve(constraintWidget.getHeight());
                        constraintWidget.measured = true;
                    }
                } else if (z4 && z2) {
                    measure(constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, constraintWidget.horizontalRun.dimension.value, androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED, constraintWidget.verticalRun.dimension.value);
                    if (dimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.horizontalRun.dimension.wrapValue = constraintWidget.getWidth();
                    } else {
                        constraintWidget.horizontalRun.dimension.resolve(constraintWidget.getWidth());
                        constraintWidget.measured = true;
                    }
                }
                if (constraintWidget.measured && constraintWidget.verticalRun.baselineDimension != null) {
                    constraintWidget.verticalRun.baselineDimension.resolve(constraintWidget.getBaselineDistance());
                }
            }
        }
    }

    public void invalidateGraph() {
        this.mNeedBuildGraph = true;
    }

    public void invalidateMeasures() {
        this.mNeedRedoMeasures = true;
    }

    public void buildGraph() {
        buildGraph(this.mRuns);
        this.mGroups.clear();
        androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index = 0;
        findGroup(this.container.horizontalRun, 0, this.mGroups);
        findGroup(this.container.verticalRun, 1, this.mGroups);
        this.mNeedBuildGraph = false;
    }

    public void buildGraph(java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> arrayList) {
        arrayList.clear();
        this.mContainer.horizontalRun.clear();
        this.mContainer.verticalRun.clear();
        arrayList.add(this.mContainer.horizontalRun);
        arrayList.add(this.mContainer.verticalRun);
        java.util.HashSet hashSet = null;
        for (androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget : this.mContainer.mChildren) {
            if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.Guideline) {
                arrayList.add(new androidx.constraintlayout.solver.widgets.analyzer.GuidelineReference(constraintWidget));
            } else {
                if (constraintWidget.isInHorizontalChain()) {
                    if (constraintWidget.horizontalChainRun == null) {
                        constraintWidget.horizontalChainRun = new androidx.constraintlayout.solver.widgets.analyzer.ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(constraintWidget.horizontalChainRun);
                } else {
                    arrayList.add(constraintWidget.horizontalRun);
                }
                if (constraintWidget.isInVerticalChain()) {
                    if (constraintWidget.verticalChainRun == null) {
                        constraintWidget.verticalChainRun = new androidx.constraintlayout.solver.widgets.analyzer.ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(constraintWidget.verticalChainRun);
                } else {
                    arrayList.add(constraintWidget.verticalRun);
                }
                if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.HelperWidget) {
                    arrayList.add(new androidx.constraintlayout.solver.widgets.analyzer.HelperReferences(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun : arrayList) {
            if (widgetRun.widget != this.mContainer) {
                widgetRun.apply();
            }
        }
    }

    private void displayGraph() {
        java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> it = this.mRuns.iterator();
        java.lang.String strGenerateDisplayGraph = "digraph {\n";
        while (it.hasNext()) {
            strGenerateDisplayGraph = generateDisplayGraph(it.next(), strGenerateDisplayGraph);
        }
        java.lang.String str = strGenerateDisplayGraph + "\n}\n";
        java.lang.System.out.println("content:<<\n" + str + "\n>>");
    }

    private void applyGroup(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode, int i, int i2, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode2, java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> arrayList, androidx.constraintlayout.solver.widgets.analyzer.RunGroup runGroup) {
        androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun = dependencyNode.run;
        if (widgetRun.runGroup != null || widgetRun == this.container.horizontalRun || widgetRun == this.container.verticalRun) {
            return;
        }
        if (runGroup == null) {
            runGroup = new androidx.constraintlayout.solver.widgets.analyzer.RunGroup(widgetRun, i2);
            arrayList.add(runGroup);
        }
        widgetRun.runGroup = runGroup;
        runGroup.add(widgetRun);
        for (androidx.constraintlayout.solver.widgets.analyzer.Dependency dependency : widgetRun.start.dependencies) {
            if (dependency instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) {
                applyGroup((androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) dependency, i, 0, dependencyNode2, arrayList, runGroup);
            }
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.Dependency dependency2 : widgetRun.end.dependencies) {
            if (dependency2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) {
                applyGroup((androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) dependency2, i, 1, dependencyNode2, arrayList, runGroup);
            }
        }
        if (i == 1 && (widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun)) {
            for (androidx.constraintlayout.solver.widgets.analyzer.Dependency dependency3 : ((androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.dependencies) {
                if (dependency3 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) {
                    applyGroup((androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) dependency3, i, 2, dependencyNode2, arrayList, runGroup);
                }
            }
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode3 : widgetRun.start.targets) {
            if (dependencyNode3 == dependencyNode2) {
                runGroup.dual = true;
            }
            applyGroup(dependencyNode3, i, 0, dependencyNode2, arrayList, runGroup);
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode4 : widgetRun.end.targets) {
            if (dependencyNode4 == dependencyNode2) {
                runGroup.dual = true;
            }
            applyGroup(dependencyNode4, i, 1, dependencyNode2, arrayList, runGroup);
        }
        if (i == 1 && (widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun)) {
            java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> it = ((androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.targets.iterator();
            while (it.hasNext()) {
                applyGroup(it.next(), i, 2, dependencyNode2, arrayList, runGroup);
            }
        }
    }

    private void findGroup(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun, int i, java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.RunGroup> arrayList) {
        for (androidx.constraintlayout.solver.widgets.analyzer.Dependency dependency : widgetRun.start.dependencies) {
            if (dependency instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) {
                applyGroup((androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) dependency, i, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) {
                applyGroup(((androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) dependency).start, i, 0, widgetRun.end, arrayList, null);
            }
        }
        for (androidx.constraintlayout.solver.widgets.analyzer.Dependency dependency2 : widgetRun.end.dependencies) {
            if (dependency2 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) {
                applyGroup((androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) dependency2, i, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) {
                applyGroup(((androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) dependency2).end, i, 1, widgetRun.start, arrayList, null);
            }
        }
        if (i == 1) {
            for (androidx.constraintlayout.solver.widgets.analyzer.Dependency dependency3 : ((androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.dependencies) {
                if (dependency3 instanceof androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) {
                    applyGroup((androidx.constraintlayout.solver.widgets.analyzer.DependencyNode) dependency3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private java.lang.String generateDisplayNode(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode, boolean z, java.lang.String str) {
        for (androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode2 : dependencyNode.targets) {
            java.lang.String str2 = ("\n" + dependencyNode.name()) + " -> " + dependencyNode2.name();
            if (dependencyNode.margin > 0 || z || (dependencyNode.run instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences)) {
                java.lang.String str3 = str2 + "[";
                if (dependencyNode.margin > 0) {
                    str3 = str3 + "label=\"" + dependencyNode.margin + "\"";
                    if (z) {
                        str3 = str3 + ",";
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (dependencyNode.run instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + "]";
            }
            str = str + (str2 + "\n");
        }
        return str;
    }

    private java.lang.String nodeDefinition(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean z = widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
        java.lang.String debugName = widgetRun.widget.getDebugName();
        androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget = widgetRun.widget;
        androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = !z ? constraintWidget.getHorizontalDimensionBehaviour() : constraintWidget.getVerticalDimensionBehaviour();
        androidx.constraintlayout.solver.widgets.analyzer.RunGroup runGroup = widgetRun.runGroup;
        if (!z) {
            str = debugName + "_HORIZONTAL";
        } else {
            str = debugName + "_VERTICAL";
        }
        java.lang.String str5 = ((str + " [shape=none, label=<") + "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">") + "  <TR>";
        if (!z) {
            java.lang.String str6 = str5 + "    <TD ";
            if (widgetRun.start.resolved) {
                str6 = str6 + " BGCOLOR=\"green\"";
            }
            str2 = str6 + " PORT=\"LEFT\" BORDER=\"1\">L</TD>";
        } else {
            java.lang.String str7 = str5 + "    <TD ";
            if (widgetRun.start.resolved) {
                str7 = str7 + " BGCOLOR=\"green\"";
            }
            str2 = str7 + " PORT=\"TOP\" BORDER=\"1\">T</TD>";
        }
        java.lang.String str8 = str2 + "    <TD BORDER=\"1\" ";
        if (widgetRun.dimension.resolved && !widgetRun.widget.measured) {
            str8 = str8 + " BGCOLOR=\"green\" ";
        } else if (widgetRun.dimension.resolved && widgetRun.widget.measured) {
            str8 = str8 + " BGCOLOR=\"lightgray\" ";
        } else if (!widgetRun.dimension.resolved && widgetRun.widget.measured) {
            str8 = str8 + " BGCOLOR=\"yellow\" ";
        }
        if (horizontalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            str8 = str8 + "style=\"dashed\"";
        }
        if (runGroup != null) {
            str3 = " [" + (runGroup.groupIndex + 1) + "/" + androidx.constraintlayout.solver.widgets.analyzer.RunGroup.index + "]";
        } else {
            str3 = "";
        }
        java.lang.String str9 = str8 + ">" + debugName + str3 + " </TD>";
        if (!z) {
            java.lang.String str10 = str9 + "    <TD ";
            if (widgetRun.end.resolved) {
                str10 = str10 + " BGCOLOR=\"green\"";
            }
            str4 = str10 + " PORT=\"RIGHT\" BORDER=\"1\">R</TD>";
        } else {
            java.lang.String str11 = str9 + "    <TD ";
            if (z && ((androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.resolved) {
                str11 = str11 + " BGCOLOR=\"green\"";
            }
            java.lang.String str12 = (str11 + " PORT=\"BASELINE\" BORDER=\"1\">b</TD>") + "    <TD ";
            if (widgetRun.end.resolved) {
                str12 = str12 + " BGCOLOR=\"green\"";
            }
            str4 = str12 + " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>";
        }
        return (str4 + "  </TR></TABLE>") + ">];\n";
    }

    private java.lang.String generateChainDisplayGraph(androidx.constraintlayout.solver.widgets.analyzer.ChainRun chainRun, java.lang.String str) {
        int i = chainRun.orientation;
        java.lang.String str2 = "cluster_" + chainRun.widget.getDebugName();
        java.lang.String str3 = "subgraph " + (i == 0 ? str2 + "_h" : str2 + "_v") + " {\n";
        java.lang.String strGenerateDisplayGraph = "";
        for (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun : chainRun.widgets) {
            java.lang.String debugName = widgetRun.widget.getDebugName();
            str3 = str3 + (i == 0 ? debugName + "_HORIZONTAL" : debugName + "_VERTICAL") + ";\n";
            strGenerateDisplayGraph = generateDisplayGraph(widgetRun, strGenerateDisplayGraph);
        }
        return str + strGenerateDisplayGraph + (str3 + "}\n");
    }

    private boolean isCenteredConnection(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode, androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode2) {
        java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> it = dependencyNode.targets.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() != dependencyNode2) {
                i++;
            }
        }
        java.util.Iterator<androidx.constraintlayout.solver.widgets.analyzer.DependencyNode> it2 = dependencyNode2.targets.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (it2.next() != dependencyNode) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    private java.lang.String generateDisplayGraph(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun, java.lang.String str) {
        boolean z;
        androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode = widgetRun.start;
        androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode2 = widgetRun.end;
        if (!(widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.HelperReferences) && dependencyNode.dependencies.isEmpty() && (dependencyNode2.dependencies.isEmpty() && dependencyNode.targets.isEmpty()) && dependencyNode2.targets.isEmpty()) {
            return str;
        }
        java.lang.String str2 = str + nodeDefinition(widgetRun);
        boolean zIsCenteredConnection = isCenteredConnection(dependencyNode, dependencyNode2);
        java.lang.String strGenerateDisplayNode = generateDisplayNode(dependencyNode2, zIsCenteredConnection, generateDisplayNode(dependencyNode, zIsCenteredConnection, str2));
        boolean z2 = widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
        if (z2) {
            strGenerateDisplayNode = generateDisplayNode(((androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline, zIsCenteredConnection, strGenerateDisplayNode);
        }
        if ((widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun) || (((z = widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun)) && ((androidx.constraintlayout.solver.widgets.analyzer.ChainRun) widgetRun).orientation == 0)) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = widgetRun.widget.getHorizontalDimensionBehaviour();
            if (horizontalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || horizontalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.targets.isEmpty() && dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = strGenerateDisplayNode + ("\n" + dependencyNode2.name() + " -> " + dependencyNode.name() + "\n");
                } else if (dependencyNode.targets.isEmpty() && !dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = strGenerateDisplayNode + ("\n" + dependencyNode.name() + " -> " + dependencyNode2.name() + "\n");
                }
            } else if (horizontalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.widget.getDimensionRatio() > 0.0f) {
                widgetRun.widget.getDebugName();
            }
        } else if (z2 || (z && ((androidx.constraintlayout.solver.widgets.analyzer.ChainRun) widgetRun).orientation == 1)) {
            androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = widgetRun.widget.getVerticalDimensionBehaviour();
            if (verticalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED || verticalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                if (!dependencyNode.targets.isEmpty() && dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = strGenerateDisplayNode + ("\n" + dependencyNode2.name() + " -> " + dependencyNode.name() + "\n");
                } else if (dependencyNode.targets.isEmpty() && !dependencyNode2.targets.isEmpty()) {
                    strGenerateDisplayNode = strGenerateDisplayNode + ("\n" + dependencyNode.name() + " -> " + dependencyNode2.name() + "\n");
                }
            } else if (verticalDimensionBehaviour == androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun.widget.getDimensionRatio() > 0.0f) {
                widgetRun.widget.getDebugName();
            }
        }
        return widgetRun instanceof androidx.constraintlayout.solver.widgets.analyzer.ChainRun ? generateChainDisplayGraph((androidx.constraintlayout.solver.widgets.analyzer.ChainRun) widgetRun, strGenerateDisplayNode) : strGenerateDisplayNode;
    }
}
