package androidx.constraintlayout.solver;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable {
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 7;
    public static final int STRENGTH_BARRIER = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 6;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    int definitionId;
    public int id;
    androidx.constraintlayout.solver.ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    private java.lang.String mName;
    androidx.constraintlayout.solver.SolverVariable.Type mType;
    public int strength;
    float[] strengthVector;
    public int usageInRowCount;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    static void increaseErrorId() {
        uniqueErrorId++;
    }

    private static java.lang.String getUniqueName(androidx.constraintlayout.solver.SolverVariable.Type type, java.lang.String str) {
        if (str != null) {
            return str + uniqueErrorId;
        }
        int i = androidx.constraintlayout.solver.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[type.ordinal()];
        if (i == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("U");
            int i2 = uniqueUnrestrictedId + 1;
            uniqueUnrestrictedId = i2;
            sb.append(i2);
            return sb.toString();
        }
        if (i == 2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("C");
            int i3 = uniqueConstantId + 1;
            uniqueConstantId = i3;
            sb2.append(i3);
            return sb2.toString();
        }
        if (i == 3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append("S");
            int i4 = uniqueSlackId + 1;
            uniqueSlackId = i4;
            sb3.append(i4);
            return sb3.toString();
        }
        if (i == 4) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(com.baidu.mapsdkplatform.comapi.e.a);
            int i5 = uniqueErrorId + 1;
            uniqueErrorId = i5;
            sb4.append(i5);
            return sb4.toString();
        }
        if (i == 5) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append("V");
            int i6 = uniqueId + 1;
            uniqueId = i6;
            sb5.append(i6);
            return sb5.toString();
        }
        throw new java.lang.AssertionError(type.name());
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.solver.SolverVariable$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type;

        static {
            int[] iArr = new int[androidx.constraintlayout.solver.SolverVariable.Type.values().length];
            $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = iArr;
            try {
                iArr[androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[androidx.constraintlayout.solver.SolverVariable.Type.CONSTANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[androidx.constraintlayout.solver.SolverVariable.Type.SLACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[androidx.constraintlayout.solver.SolverVariable.Type.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public SolverVariable(java.lang.String str, androidx.constraintlayout.solver.SolverVariable.Type type) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new androidx.constraintlayout.solver.ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mName = str;
        this.mType = type;
    }

    public SolverVariable(androidx.constraintlayout.solver.SolverVariable.Type type, java.lang.String str) {
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new androidx.constraintlayout.solver.ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mType = type;
    }

    void clearStrengths() {
        for (int i = 0; i < 7; i++) {
            this.strengthVector[i] = 0.0f;
        }
    }

    java.lang.String strengthsToString() {
        java.lang.String str = this + "[";
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.strengthVector.length; i++) {
            java.lang.String str2 = str + this.strengthVector[i];
            float[] fArr = this.strengthVector;
            if (fArr[i] > 0.0f) {
                z = false;
            } else if (fArr[i] < 0.0f) {
                z = true;
            }
            if (fArr[i] != 0.0f) {
                z2 = false;
            }
            str = i < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    public final void addToRow(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.mClientEquationsCount;
            if (i < i2) {
                if (this.mClientEquations[i] == arrayRow) {
                    return;
                } else {
                    i++;
                }
            } else {
                androidx.constraintlayout.solver.ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i2 >= arrayRowArr.length) {
                    this.mClientEquations = (androidx.constraintlayout.solver.ArrayRow[]) java.util.Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                androidx.constraintlayout.solver.ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i3 = this.mClientEquationsCount;
                arrayRowArr2[i3] = arrayRow;
                this.mClientEquationsCount = i3 + 1;
                return;
            }
        }
    }

    public final void removeFromRow(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mClientEquations[i2] == arrayRow) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    androidx.constraintlayout.solver.ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i4 = i2 + i3;
                    arrayRowArr[i4] = arrayRowArr[i4 + 1];
                }
                this.mClientEquationsCount--;
                return;
            }
        }
    }

    public final void updateReferencesWithNewDefinition(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        int i = this.mClientEquationsCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.mClientEquations[i2].variables.updateFromRow(this.mClientEquations[i2], arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void reset() {
        this.mName = null;
        this.mType = androidx.constraintlayout.solver.SolverVariable.Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0.0f;
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
    }

    public java.lang.String getName() {
        return this.mName;
    }

    public void setName(java.lang.String str) {
        this.mName = str;
    }

    public void setType(androidx.constraintlayout.solver.SolverVariable.Type type, java.lang.String str) {
        this.mType = type;
    }

    public java.lang.String toString() {
        return "" + this.mName;
    }
}
