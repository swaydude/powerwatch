package androidx.constraintlayout.solver.widgets;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {
    private static final boolean ALLOW_BINARY = false;
    private static final int UNSET_GONE_MARGIN = -1;
    public final androidx.constraintlayout.solver.widgets.ConstraintWidget mOwner;
    androidx.constraintlayout.solver.SolverVariable mSolverVariable;
    public androidx.constraintlayout.solver.widgets.ConstraintAnchor mTarget;
    public final androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type mType;
    public int mMargin = 0;
    int mGoneMargin = -1;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public void copyFrom(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, java.util.HashMap<androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget> map) {
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null) {
            this.mTarget = map.get(constraintAnchor.mTarget.mOwner).getAnchor(constraintAnchor2.getType());
        } else {
            this.mTarget = null;
        }
        this.mMargin = constraintAnchor.mMargin;
        this.mGoneMargin = constraintAnchor.mGoneMargin;
    }

    public ConstraintAnchor(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type) {
        this.mOwner = constraintWidget;
        this.mType = type;
    }

    public androidx.constraintlayout.solver.SolverVariable getSolverVariable() {
        return this.mSolverVariable;
    }

    public void resetSolverVariable(androidx.constraintlayout.solver.Cache cache) {
        androidx.constraintlayout.solver.SolverVariable solverVariable = this.mSolverVariable;
        if (solverVariable == null) {
            this.mSolverVariable = new androidx.constraintlayout.solver.SolverVariable(androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED, (java.lang.String) null);
        } else {
            solverVariable.reset();
        }
    }

    public androidx.constraintlayout.solver.widgets.ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type getType() {
        return this.mType;
    }

    public int getMargin() {
        androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        if (this.mGoneMargin > -1 && (constraintAnchor = this.mTarget) != null && constraintAnchor.mOwner.getVisibility() == 8) {
            return this.mGoneMargin;
        }
        return this.mMargin;
    }

    public androidx.constraintlayout.solver.widgets.ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public void reset() {
        this.mTarget = null;
        this.mMargin = 0;
        this.mGoneMargin = -1;
    }

    public boolean connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            this.mTarget = null;
            this.mMargin = 0;
            this.mGoneMargin = -1;
            return true;
        }
        if (!z && !isValidConnection(constraintAnchor)) {
            return false;
        }
        this.mTarget = constraintAnchor;
        if (i > 0) {
            this.mMargin = i;
        } else {
            this.mMargin = 0;
        }
        this.mGoneMargin = i2;
        return true;
    }

    public boolean connect(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor, int i) {
        return connect(constraintAnchor, i, -1, false);
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isValidConnection(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type = constraintAnchor.getType();
        androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type2 = this.mType;
        if (type == type2) {
            return type2 != androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE || (constraintAnchor.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
                return (type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT;
                if (constraintAnchor.getOwner() instanceof androidx.constraintlayout.solver.widgets.Guideline) {
                    return z || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM;
                if (constraintAnchor.getOwner() instanceof androidx.constraintlayout.solver.widgets.Guideline) {
                    return z2 || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    public boolean isSideAnchor() {
        switch (androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor) {
        androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type type = constraintAnchor.getType();
        if (type == this.mType) {
            return true;
        }
        switch (androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
                return type != androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE;
            case 2:
            case 3:
            case 7:
                return type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_X;
            case 4:
            case 5:
            case 6:
            case 8:
                return type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER_Y || type == androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE;
            case 9:
                return false;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public void setMargin(int i) {
        if (isConnected()) {
            this.mMargin = i;
        }
    }

    public void setGoneMargin(int i) {
        if (isConnected()) {
            this.mGoneMargin = i;
        }
    }

    public boolean isVerticalAnchor() {
        switch (androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public java.lang.String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor) {
        return isConnectionAllowed(constraintWidget);
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget) {
        if (isConnectionToMe(constraintWidget, new java.util.HashSet<>())) {
            return false;
        }
        androidx.constraintlayout.solver.widgets.ConstraintWidget parent = getOwner().getParent();
        return parent == constraintWidget || constraintWidget.getParent() == parent;
    }

    private boolean isConnectionToMe(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, java.util.HashSet<androidx.constraintlayout.solver.widgets.ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == getOwner()) {
            return true;
        }
        java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintAnchor> anchors = constraintWidget.getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = anchors.get(i);
            if (constraintAnchor.isSimilarDimensionConnection(this) && constraintAnchor.isConnected() && isConnectionToMe(constraintAnchor.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.constraintlayout.solver.widgets.ConstraintAnchor getOpposite() {
        switch (androidx.constraintlayout.solver.widgets.ConstraintAnchor.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.mOwner.mRight;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mBottom;
            case 5:
                return this.mOwner.mTop;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }
}
