package androidx.constraintlayout.solver.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
class BaselineDimensionDependency extends androidx.constraintlayout.solver.widgets.analyzer.DimensionDependency {
    public BaselineDimensionDependency(androidx.constraintlayout.solver.widgets.analyzer.WidgetRun widgetRun) {
        super(widgetRun);
    }

    public void update(androidx.constraintlayout.solver.widgets.analyzer.DependencyNode dependencyNode) {
        ((androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun) this.run).baseline.margin = this.run.widget.getBaselineDistance();
        this.resolved = true;
    }
}
