package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
public class HelperWidget extends androidx.constraintlayout.solver.widgets.ConstraintWidget implements androidx.constraintlayout.solver.widgets.Helper {
    public androidx.constraintlayout.solver.widgets.ConstraintWidget[] mWidgets = new androidx.constraintlayout.solver.widgets.ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void add(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        int i = this.mWidgetsCount + 1;
        androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        if (i > constraintWidgetArr.length) {
            this.mWidgets = (androidx.constraintlayout.solver.widgets.ConstraintWidget[]) java.util.Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i2 = this.mWidgetsCount;
        constraintWidgetArr2[i2] = constraintWidget;
        this.mWidgetsCount = i2 + 1;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        androidx.constraintlayout.solver.widgets.HelperWidget helperWidget = (androidx.constraintlayout.solver.widgets.HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i = helperWidget.mWidgetsCount;
        for (int i2 = 0; i2 < i; i2++) {
            add(map.get(helperWidget.mWidgets[i2]));
        }
        this.mWidgetsCount = helperWidget.mWidgetsCount;
    }

    @Override // androidx.constraintlayout.solver.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        java.util.Arrays.fill(this.mWidgets, (java.lang.Object) null);
    }
}
