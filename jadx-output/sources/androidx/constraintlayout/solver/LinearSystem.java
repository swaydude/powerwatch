package androidx.constraintlayout.solver;

/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {
    private static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    private static int POOL_SIZE = 1000;
    public static androidx.constraintlayout.solver.Metrics sMetrics;
    final androidx.constraintlayout.solver.Cache mCache;
    private androidx.constraintlayout.solver.LinearSystem.Row mGoal;
    androidx.constraintlayout.solver.ArrayRow[] mRows;
    private final androidx.constraintlayout.solver.LinearSystem.Row mTempGoal;
    int mVariablesID = 0;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> mVariables = null;
    private int TABLE_SIZE = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    int mNumColumns = 1;
    int mNumRows = 0;
    private int mMaxRows = 32;
    private androidx.constraintlayout.solver.SolverVariable[] mPoolVariables = new androidx.constraintlayout.solver.SolverVariable[POOL_SIZE];
    private int mPoolVariablesCount = 0;
    private androidx.constraintlayout.solver.ArrayRow[] tempClientsCopy = new androidx.constraintlayout.solver.ArrayRow[32];

    interface Row {
        void addError(androidx.constraintlayout.solver.SolverVariable solverVariable);

        void clear();

        androidx.constraintlayout.solver.SolverVariable getKey();

        androidx.constraintlayout.solver.SolverVariable getPivotCandidate(androidx.constraintlayout.solver.LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(androidx.constraintlayout.solver.LinearSystem.Row row);

        boolean isEmpty();
    }

    private java.lang.String getDisplayStrength(int i) {
        if (i == 1) {
            return "LOW";
        }
        if (i == 2) {
            return "MEDIUM";
        }
        if (i == 3) {
            return "HIGH";
        }
        if (i == 4) {
            return "HIGHEST";
        }
        if (i == 5) {
            return "EQUALITY";
        }
        return i == 6 ? "FIXED" : "NONE";
    }

    public LinearSystem() {
        this.mRows = null;
        this.mRows = new androidx.constraintlayout.solver.ArrayRow[32];
        releaseRows();
        androidx.constraintlayout.solver.Cache cache = new androidx.constraintlayout.solver.Cache();
        this.mCache = cache;
        this.mGoal = new androidx.constraintlayout.solver.GoalRow(cache);
        this.mTempGoal = new androidx.constraintlayout.solver.ArrayRow(cache);
    }

    public void fillMetrics(androidx.constraintlayout.solver.Metrics metrics) {
        sMetrics = metrics;
    }

    public static androidx.constraintlayout.solver.Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i = this.TABLE_SIZE * 2;
        this.TABLE_SIZE = i;
        this.mRows = (androidx.constraintlayout.solver.ArrayRow[]) java.util.Arrays.copyOf(this.mRows, i);
        androidx.constraintlayout.solver.Cache cache = this.mCache;
        cache.mIndexedVariables = (androidx.constraintlayout.solver.SolverVariable[]) java.util.Arrays.copyOf(cache.mIndexedVariables, this.TABLE_SIZE);
        int i2 = this.TABLE_SIZE;
        this.mAlreadyTestedCandidates = new boolean[i2];
        this.mMaxColumns = i2;
        this.mMaxRows = i2;
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            androidx.constraintlayout.solver.Metrics metrics2 = sMetrics;
            metrics2.maxTableSize = java.lang.Math.max(metrics2.maxTableSize, this.TABLE_SIZE);
            androidx.constraintlayout.solver.Metrics metrics3 = sMetrics;
            metrics3.lastTableSize = metrics3.maxTableSize;
        }
    }

    private void releaseRows() {
        int i = 0;
        while (true) {
            androidx.constraintlayout.solver.ArrayRow[] arrayRowArr = this.mRows;
            if (i >= arrayRowArr.length) {
                return;
            }
            androidx.constraintlayout.solver.ArrayRow arrayRow = arrayRowArr[i];
            if (arrayRow != null) {
                this.mCache.arrayRowPool.release(arrayRow);
            }
            this.mRows[i] = null;
            i++;
        }
    }

    public void reset() {
        for (int i = 0; i < this.mCache.mIndexedVariables.length; i++) {
            androidx.constraintlayout.solver.SolverVariable solverVariable = this.mCache.mIndexedVariables[i];
            if (solverVariable != null) {
                solverVariable.reset();
            }
        }
        this.mCache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        java.util.Arrays.fill(this.mCache.mIndexedVariables, (java.lang.Object) null);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.solver.SolverVariable> map = this.mVariables;
        if (map != null) {
            map.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            this.mRows[i2].used = false;
        }
        releaseRows();
        this.mNumRows = 0;
    }

    public androidx.constraintlayout.solver.SolverVariable createObjectVariable(java.lang.Object obj) {
        androidx.constraintlayout.solver.SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof androidx.constraintlayout.solver.widgets.ConstraintAnchor) {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor constraintAnchor = (androidx.constraintlayout.solver.widgets.ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            if (solverVariable.id == -1 || solverVariable.id > this.mVariablesID || this.mCache.mIndexedVariables[solverVariable.id] == null) {
                if (solverVariable.id != -1) {
                    solverVariable.reset();
                }
                int i = this.mVariablesID + 1;
                this.mVariablesID = i;
                this.mNumColumns++;
                solverVariable.id = i;
                solverVariable.mType = androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[this.mVariablesID] = solverVariable;
            }
        }
        return solverVariable;
    }

    public androidx.constraintlayout.solver.ArrayRow createRow() {
        androidx.constraintlayout.solver.ArrayRow arrayRowAcquire = this.mCache.arrayRowPool.acquire();
        if (arrayRowAcquire == null) {
            arrayRowAcquire = new androidx.constraintlayout.solver.ArrayRow(this.mCache);
        } else {
            arrayRowAcquire.reset();
        }
        androidx.constraintlayout.solver.SolverVariable.increaseErrorId();
        return arrayRowAcquire;
    }

    public androidx.constraintlayout.solver.SolverVariable createSlackVariable() {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.solver.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(androidx.constraintlayout.solver.SolverVariable.Type.SLACK, null);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i;
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    public androidx.constraintlayout.solver.SolverVariable createExtraVariable() {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.solver.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(androidx.constraintlayout.solver.SolverVariable.Type.SLACK, null);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i;
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    private void addError(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        arrayRow.addError(this, 0);
    }

    private void addSingleError(androidx.constraintlayout.solver.ArrayRow arrayRow, int i) {
        addSingleError(arrayRow, i, 0);
    }

    void addSingleError(androidx.constraintlayout.solver.ArrayRow arrayRow, int i, int i2) {
        arrayRow.addSingleError(createErrorVariable(i2, null), i);
    }

    private androidx.constraintlayout.solver.SolverVariable createVariable(java.lang.String str, androidx.constraintlayout.solver.SolverVariable.Type type) {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.solver.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(type, null);
        solverVariableAcquireSolverVariable.setName(str);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i;
        if (this.mVariables == null) {
            this.mVariables = new java.util.HashMap<>();
        }
        this.mVariables.put(str, solverVariableAcquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    public androidx.constraintlayout.solver.SolverVariable createErrorVariable(int i, java.lang.String str) {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.solver.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(androidx.constraintlayout.solver.SolverVariable.Type.ERROR, str);
        int i2 = this.mVariablesID + 1;
        this.mVariablesID = i2;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i2;
        solverVariableAcquireSolverVariable.strength = i;
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        this.mGoal.addError(solverVariableAcquireSolverVariable);
        return solverVariableAcquireSolverVariable;
    }

    private androidx.constraintlayout.solver.SolverVariable acquireSolverVariable(androidx.constraintlayout.solver.SolverVariable.Type type, java.lang.String str) {
        androidx.constraintlayout.solver.SolverVariable solverVariableAcquire = this.mCache.solverVariablePool.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new androidx.constraintlayout.solver.SolverVariable(type, str);
            solverVariableAcquire.setType(type, str);
        } else {
            solverVariableAcquire.reset();
            solverVariableAcquire.setType(type, str);
        }
        int i = this.mPoolVariablesCount;
        int i2 = POOL_SIZE;
        if (i >= i2) {
            int i3 = i2 * 2;
            POOL_SIZE = i3;
            this.mPoolVariables = (androidx.constraintlayout.solver.SolverVariable[]) java.util.Arrays.copyOf(this.mPoolVariables, i3);
        }
        androidx.constraintlayout.solver.SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i4 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i4 + 1;
        solverVariableArr[i4] = solverVariableAcquire;
        return solverVariableAcquire;
    }

    androidx.constraintlayout.solver.LinearSystem.Row getGoal() {
        return this.mGoal;
    }

    androidx.constraintlayout.solver.ArrayRow getRow(int i) {
        return this.mRows[i];
    }

    float getValueFor(java.lang.String str) {
        androidx.constraintlayout.solver.SolverVariable variable = getVariable(str, androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public int getObjectVariableValue(java.lang.Object obj) {
        androidx.constraintlayout.solver.SolverVariable solverVariable = ((androidx.constraintlayout.solver.widgets.ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.solver.SolverVariable getVariable(java.lang.String str, androidx.constraintlayout.solver.SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new java.util.HashMap<>();
        }
        androidx.constraintlayout.solver.SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() throws java.lang.Exception {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.graphOptimizer || this.newgraphOptimizer) {
            androidx.constraintlayout.solver.Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.mNumRows) {
                    z = true;
                    break;
                } else if (!this.mRows[i].isSimpleDefinition) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                minimizeGoal(this.mGoal);
                return;
            }
            androidx.constraintlayout.solver.Metrics metrics3 = sMetrics;
            if (metrics3 != null) {
                metrics3.fullySolved++;
            }
            computeValues();
            return;
        }
        minimizeGoal(this.mGoal);
    }

    void minimizeGoal(androidx.constraintlayout.solver.LinearSystem.Row row) throws java.lang.Exception {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            androidx.constraintlayout.solver.Metrics metrics2 = sMetrics;
            metrics2.maxVariables = java.lang.Math.max(metrics2.maxVariables, this.mNumColumns);
            androidx.constraintlayout.solver.Metrics metrics3 = sMetrics;
            metrics3.maxRows = java.lang.Math.max(metrics3.maxRows, this.mNumRows);
        }
        updateRowFromVariables((androidx.constraintlayout.solver.ArrayRow) row);
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    private final void updateRowFromVariables(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        if (this.mNumRows > 0) {
            arrayRow.variables.updateFromSystem(arrayRow, this.mRows);
            if (arrayRow.variables.currentSize == 0) {
                arrayRow.isSimpleDefinition = true;
            }
        }
    }

    public void addConstraint(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        androidx.constraintlayout.solver.SolverVariable solverVariablePickPivot;
        if (arrayRow == null) {
            return;
        }
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.constraints++;
            if (arrayRow.isSimpleDefinition) {
                sMetrics.simpleconstraints++;
            }
        }
        boolean z = true;
        if (this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        boolean z2 = false;
        if (!arrayRow.isSimpleDefinition) {
            updateRowFromVariables(arrayRow);
            if (arrayRow.isEmpty()) {
                return;
            }
            arrayRow.ensurePositiveConstant();
            if (arrayRow.chooseSubject(this)) {
                androidx.constraintlayout.solver.SolverVariable solverVariableCreateExtraVariable = createExtraVariable();
                arrayRow.variable = solverVariableCreateExtraVariable;
                addRow(arrayRow);
                this.mTempGoal.initFromRow(arrayRow);
                optimize(this.mTempGoal, true);
                if (solverVariableCreateExtraVariable.definitionId == -1) {
                    if (arrayRow.variable == solverVariableCreateExtraVariable && (solverVariablePickPivot = arrayRow.pickPivot(solverVariableCreateExtraVariable)) != null) {
                        androidx.constraintlayout.solver.Metrics metrics2 = sMetrics;
                        if (metrics2 != null) {
                            metrics2.pivots++;
                        }
                        arrayRow.pivot(solverVariablePickPivot);
                    }
                    if (!arrayRow.isSimpleDefinition) {
                        arrayRow.variable.updateReferencesWithNewDefinition(arrayRow);
                    }
                    this.mNumRows--;
                }
            } else {
                z = false;
            }
            if (!arrayRow.hasKeyVariable()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        addRow(arrayRow);
    }

    private final void addRow(androidx.constraintlayout.solver.ArrayRow arrayRow) {
        if (this.mRows[this.mNumRows] != null) {
            this.mCache.arrayRowPool.release(this.mRows[this.mNumRows]);
        }
        this.mRows[this.mNumRows] = arrayRow;
        arrayRow.variable.definitionId = this.mNumRows;
        this.mNumRows++;
        arrayRow.variable.updateReferencesWithNewDefinition(arrayRow);
    }

    private final int optimize(androidx.constraintlayout.solver.LinearSystem.Row row, boolean z) {
        androidx.constraintlayout.solver.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i = 0; i < this.mNumColumns; i++) {
            this.mAlreadyTestedCandidates[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            androidx.constraintlayout.solver.Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i2++;
            if (i2 >= this.mNumColumns * 2) {
                return i2;
            }
            if (row.getKey() != null) {
                this.mAlreadyTestedCandidates[row.getKey().id] = true;
            }
            androidx.constraintlayout.solver.SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                if (this.mAlreadyTestedCandidates[pivotCandidate.id]) {
                    return i2;
                }
                this.mAlreadyTestedCandidates[pivotCandidate.id] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.mNumRows; i4++) {
                    androidx.constraintlayout.solver.ArrayRow arrayRow = this.mRows[i4];
                    if (arrayRow.variable.mType != androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                        float f2 = arrayRow.variables.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-arrayRow.constantValue) / f2;
                            if (f3 < f) {
                                i3 = i4;
                                f = f3;
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    androidx.constraintlayout.solver.ArrayRow arrayRow2 = this.mRows[i3];
                    arrayRow2.variable.definitionId = -1;
                    androidx.constraintlayout.solver.Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.pivot(pivotCandidate);
                    arrayRow2.variable.definitionId = i3;
                    arrayRow2.variable.updateReferencesWithNewDefinition(arrayRow2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    private int enforceBFS(androidx.constraintlayout.solver.LinearSystem.Row row) throws java.lang.Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.mNumRows) {
                z = false;
                break;
            }
            if (this.mRows[i].variable.mType != androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED && this.mRows[i].constantValue < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            androidx.constraintlayout.solver.Metrics metrics = sMetrics;
            if (metrics != null) {
                metrics.bfs++;
            }
            i2++;
            float f2 = Float.MAX_VALUE;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            while (i3 < this.mNumRows) {
                androidx.constraintlayout.solver.ArrayRow arrayRow = this.mRows[i3];
                if (arrayRow.variable.mType != androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.constantValue < f) {
                    int i7 = 1;
                    while (i7 < this.mNumColumns) {
                        androidx.constraintlayout.solver.SolverVariable solverVariable = this.mCache.mIndexedVariables[i7];
                        float f3 = arrayRow.variables.get(solverVariable);
                        if (f3 > f) {
                            for (int i8 = 0; i8 < 7; i8++) {
                                float f4 = solverVariable.strengthVector[i8] / f3;
                                if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                    i5 = i7;
                                    i6 = i8;
                                    f2 = f4;
                                    i4 = i3;
                                }
                            }
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                androidx.constraintlayout.solver.ArrayRow arrayRow2 = this.mRows[i4];
                arrayRow2.variable.definitionId = -1;
                androidx.constraintlayout.solver.Metrics metrics2 = sMetrics;
                if (metrics2 != null) {
                    metrics2.pivots++;
                }
                arrayRow2.pivot(this.mCache.mIndexedVariables[i5]);
                arrayRow2.variable.definitionId = i4;
                arrayRow2.variable.updateReferencesWithNewDefinition(arrayRow2);
            } else {
                z2 = true;
            }
            if (i2 > this.mNumColumns / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    private void computeValues() {
        for (int i = 0; i < this.mNumRows; i++) {
            androidx.constraintlayout.solver.ArrayRow arrayRow = this.mRows[i];
            arrayRow.variable.computedValue = arrayRow.constantValue;
        }
    }

    private void displayRows() {
        displaySolverVariables();
        java.lang.String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            str = (str + this.mRows[i]) + "\n";
        }
        java.lang.System.out.println(str + this.mGoal + "\n");
    }

    void displayReadableRows() {
        displaySolverVariables();
        java.lang.String str = " #  ";
        for (int i = 0; i < this.mNumRows; i++) {
            str = (str + this.mRows[i].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            str = str + this.mGoal + "\n";
        }
        java.lang.System.out.println(str);
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        java.lang.String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i].variable.mType == androidx.constraintlayout.solver.SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.mRows[i].toReadableString()) + "\n";
            }
        }
        java.lang.System.out.println(str + this.mGoal + "\n");
    }

    public int getMemoryUsed() {
        int iSizeInBytes = 0;
        for (int i = 0; i < this.mNumRows; i++) {
            androidx.constraintlayout.solver.ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i] != null) {
                iSizeInBytes += arrayRowArr[i].sizeInBytes();
            }
        }
        return iSizeInBytes;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    void displaySystemInformations() {
        int iSizeInBytes = 0;
        for (int i = 0; i < this.TABLE_SIZE; i++) {
            androidx.constraintlayout.solver.ArrayRow[] arrayRowArr = this.mRows;
            if (arrayRowArr[i] != null) {
                iSizeInBytes += arrayRowArr[i].sizeInBytes();
            }
        }
        int iSizeInBytes2 = 0;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            androidx.constraintlayout.solver.ArrayRow[] arrayRowArr2 = this.mRows;
            if (arrayRowArr2[i2] != null) {
                iSizeInBytes2 += arrayRowArr2[i2].sizeInBytes();
            }
        }
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.TABLE_SIZE);
        sb.append(" (");
        int i3 = this.TABLE_SIZE;
        sb.append(getDisplaySize(i3 * i3));
        sb.append(") -- row sizes: ");
        sb.append(getDisplaySize(iSizeInBytes));
        sb.append(", actual size: ");
        sb.append(getDisplaySize(iSizeInBytes2));
        sb.append(" rows: ");
        sb.append(this.mNumRows);
        sb.append("/");
        sb.append(this.mMaxRows);
        sb.append(" cols: ");
        sb.append(this.mNumColumns);
        sb.append("/");
        sb.append(this.mMaxColumns);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(getDisplaySize(0));
        printStream.println(sb.toString());
    }

    private void displaySolverVariables() {
        java.lang.System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private java.lang.String getDisplaySize(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        }
        if (i3 > 0) {
            return "" + i3 + " Kb";
        }
        return "" + i2 + " bytes";
    }

    public androidx.constraintlayout.solver.Cache getCache() {
        return this.mCache;
    }

    public void addGreaterThan(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (i2 != 6) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addGreaterThan(androidx.constraintlayout.solver.SolverVariable solverVariable, int i) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, i, solverVariableCreateSlackVariable);
        addConstraint(arrayRowCreateRow);
    }

    public void addGreaterBarrier(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (z) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), 1);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerThan(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (i2 != 6) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerBarrier(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (z) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), 1);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addCentering(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, float f, androidx.constraintlayout.solver.SolverVariable solverVariable3, androidx.constraintlayout.solver.SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowCentering(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 6) {
            arrayRowCreateRow.addError(this, i3);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addRatio(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, androidx.constraintlayout.solver.SolverVariable solverVariable3, androidx.constraintlayout.solver.SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 6) {
            arrayRowCreateRow.addError(this, i);
        }
        addConstraint(arrayRowCreateRow);
    }

    public androidx.constraintlayout.solver.ArrayRow addEquality(androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowEquals(solverVariable, solverVariable2, i);
        if (i2 != 6) {
            arrayRowCreateRow.addError(this, i2);
        }
        addConstraint(arrayRowCreateRow);
        return arrayRowCreateRow;
    }

    public void addEquality(androidx.constraintlayout.solver.SolverVariable solverVariable, int i) {
        int i2 = solverVariable.definitionId;
        if (solverVariable.definitionId != -1) {
            androidx.constraintlayout.solver.ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow.isSimpleDefinition) {
                arrayRow.constantValue = i;
                return;
            }
            if (arrayRow.variables.currentSize == 0) {
                arrayRow.isSimpleDefinition = true;
                arrayRow.constantValue = i;
                return;
            } else {
                androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
                arrayRowCreateRow.createRowEquals(solverVariable, i);
                addConstraint(arrayRowCreateRow);
                return;
            }
        }
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowDefinition(solverVariable, i);
        addConstraint(arrayRowCreateRow2);
    }

    public void addEquality(androidx.constraintlayout.solver.SolverVariable solverVariable, int i, int i2) {
        int i3 = solverVariable.definitionId;
        if (solverVariable.definitionId != -1) {
            androidx.constraintlayout.solver.ArrayRow arrayRow = this.mRows[i3];
            if (arrayRow.isSimpleDefinition) {
                arrayRow.constantValue = i;
                return;
            }
            androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
            arrayRowCreateRow.createRowEquals(solverVariable, i);
            arrayRowCreateRow.addError(this, i2);
            addConstraint(arrayRowCreateRow);
            return;
        }
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowDefinition(solverVariable, i);
        arrayRowCreateRow2.addError(this, i2);
        addConstraint(arrayRowCreateRow2);
    }

    public static androidx.constraintlayout.solver.ArrayRow createRowEquals(androidx.constraintlayout.solver.LinearSystem linearSystem, androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = linearSystem.createRow();
        arrayRowCreateRow.createRowEquals(solverVariable, solverVariable2, i);
        if (z) {
            linearSystem.addSingleError(arrayRowCreateRow, 1);
        }
        return arrayRowCreateRow;
    }

    public static androidx.constraintlayout.solver.ArrayRow createRowDimensionPercent(androidx.constraintlayout.solver.LinearSystem linearSystem, androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, androidx.constraintlayout.solver.SolverVariable solverVariable3, float f, boolean z) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = linearSystem.createRow();
        if (z) {
            linearSystem.addError(arrayRowCreateRow);
        }
        return arrayRowCreateRow.createRowDimensionPercent(solverVariable, solverVariable2, solverVariable3, f);
    }

    public static androidx.constraintlayout.solver.ArrayRow createRowGreaterThan(androidx.constraintlayout.solver.LinearSystem linearSystem, androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = linearSystem.createSlackVariable();
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = linearSystem.createRow();
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (z) {
            linearSystem.addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)));
        }
        return arrayRowCreateRow;
    }

    public static androidx.constraintlayout.solver.ArrayRow createRowLowerThan(androidx.constraintlayout.solver.LinearSystem linearSystem, androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateSlackVariable = linearSystem.createSlackVariable();
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = linearSystem.createRow();
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (z) {
            linearSystem.addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)));
        }
        return arrayRowCreateRow;
    }

    public static androidx.constraintlayout.solver.ArrayRow createRowCentering(androidx.constraintlayout.solver.LinearSystem linearSystem, androidx.constraintlayout.solver.SolverVariable solverVariable, androidx.constraintlayout.solver.SolverVariable solverVariable2, int i, float f, androidx.constraintlayout.solver.SolverVariable solverVariable3, androidx.constraintlayout.solver.SolverVariable solverVariable4, int i2, boolean z) {
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = linearSystem.createRow();
        arrayRowCreateRow.createRowCentering(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (z) {
            arrayRowCreateRow.addError(linearSystem, 4);
        }
        return arrayRowCreateRow;
    }

    public void addCenterPoint(androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.solver.widgets.ConstraintWidget constraintWidget2, float f, int i) {
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT));
        androidx.constraintlayout.solver.SolverVariable solverVariableCreateObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM));
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow = createRow();
        double d = f;
        double d2 = i;
        arrayRowCreateRow.createRowWithAngle(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable8, (float) (java.lang.Math.sin(d) * d2));
        addConstraint(arrayRowCreateRow);
        androidx.constraintlayout.solver.ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowWithAngle(solverVariableCreateObjectVariable, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable7, (float) (java.lang.Math.cos(d) * d2));
        addConstraint(arrayRowCreateRow2);
    }
}
