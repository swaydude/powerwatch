package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels;

/* JADX INFO: compiled from: PedometerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/pedometerComponent/periodsViewModels/PedometerDataContainer;", "", "steps", "", "isArtificialData", "", "valid", "malformedContainer", "(IZZZ)V", "()Z", "setArtificialData", "(Z)V", "malformed", "getMalformed", "getMalformedContainer", "setMalformedContainer", "getSteps", "()I", "setSteps", "(I)V", "getValid", "setValid", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PedometerDataContainer {
    private boolean isArtificialData;
    private boolean malformedContainer;
    private int steps;
    private boolean valid;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer, int i, boolean z, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = pedometerDataContainer.steps;
        }
        if ((i2 & 2) != 0) {
            z = pedometerDataContainer.isArtificialData;
        }
        if ((i2 & 4) != 0) {
            z2 = pedometerDataContainer.valid;
        }
        if ((i2 & 8) != 0) {
            z3 = pedometerDataContainer.malformedContainer;
        }
        return pedometerDataContainer.copy(i, z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsArtificialData() {
        return this.isArtificialData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer copy(int steps, boolean isArtificialData, boolean valid, boolean malformedContainer) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer(steps, isArtificialData, valid, malformedContainer);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer pedometerDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.pedometerComponent.periodsViewModels.PedometerDataContainer) other;
        return this.steps == pedometerDataContainer.steps && this.isArtificialData == pedometerDataContainer.isArtificialData && this.valid == pedometerDataContainer.valid && this.malformedContainer == pedometerDataContainer.malformedContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = this.steps * 31;
        boolean z = this.isArtificialData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.valid;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i3 = (i2 + r2) * 31;
        boolean z3 = this.malformedContainer;
        return i3 + (z3 ? 1 : z3);
    }

    public java.lang.String toString() {
        return "PedometerDataContainer(steps=" + this.steps + ", isArtificialData=" + this.isArtificialData + ", valid=" + this.valid + ", malformedContainer=" + this.malformedContainer + ')';
    }

    public PedometerDataContainer(int i, boolean z, boolean z2, boolean z3) {
        this.steps = i;
        this.isArtificialData = z;
        this.valid = z2;
        this.malformedContainer = z3;
    }

    public /* synthetic */ PedometerDataContainer(int i, boolean z, boolean z2, boolean z3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3);
    }

    public final int getSteps() {
        return this.steps;
    }

    public final void setSteps(int i) {
        this.steps = i;
    }

    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final boolean isArtificialData() {
        return this.isArtificialData;
    }

    public final void setArtificialData(boolean z) {
        this.isArtificialData = z;
    }

    public final void setMalformedContainer(boolean z) {
        this.malformedContainer = z;
    }

    public final void setValid(boolean z) {
        this.valid = z;
    }

    public final boolean getMalformed() {
        return !(this.isArtificialData || this.valid) || this.malformedContainer;
    }
}
