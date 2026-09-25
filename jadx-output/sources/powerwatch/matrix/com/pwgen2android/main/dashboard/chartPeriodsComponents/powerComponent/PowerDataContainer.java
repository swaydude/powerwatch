package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent;

/* JADX INFO: compiled from: PowerPeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/powerComponent/PowerDataContainer;", "", "solarPower", "", "bodyPower", "isArtificialData", "", "valid", "malformedContainer", "(FFZZZ)V", "getBodyPower", "()F", "setBodyPower", "(F)V", "()Z", "setArtificialData", "(Z)V", "malformed", "getMalformed", "getMalformedContainer", "setMalformedContainer", "getSolarPower", "setSolarPower", "getValid", "setValid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PowerDataContainer {
    private float bodyPower;
    private boolean isArtificialData;
    private boolean malformedContainer;
    private float solarPower;
    private boolean valid;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer, float f, float f2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = powerDataContainer.solarPower;
        }
        if ((i & 2) != 0) {
            f2 = powerDataContainer.bodyPower;
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            z = powerDataContainer.isArtificialData;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = powerDataContainer.valid;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = powerDataContainer.malformedContainer;
        }
        return powerDataContainer.copy(f, f3, z4, z5, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSolarPower() {
        return this.solarPower;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getBodyPower() {
        return this.bodyPower;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsArtificialData() {
        return this.isArtificialData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer copy(float solarPower, float bodyPower, boolean isArtificialData, boolean valid, boolean malformedContainer) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer(solarPower, bodyPower, isArtificialData, valid, malformedContainer);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer powerDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.powerComponent.PowerDataContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.solarPower), (java.lang.Object) java.lang.Float.valueOf(powerDataContainer.solarPower)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.bodyPower), (java.lang.Object) java.lang.Float.valueOf(powerDataContainer.bodyPower)) && this.isArtificialData == powerDataContainer.isArtificialData && this.valid == powerDataContainer.valid && this.malformedContainer == powerDataContainer.malformedContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iFloatToIntBits = ((java.lang.Float.floatToIntBits(this.solarPower) * 31) + java.lang.Float.floatToIntBits(this.bodyPower)) * 31;
        boolean z = this.isArtificialData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iFloatToIntBits + r1) * 31;
        boolean z2 = this.valid;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.malformedContainer;
        return i2 + (z3 ? 1 : z3);
    }

    public java.lang.String toString() {
        return "PowerDataContainer(solarPower=" + this.solarPower + ", bodyPower=" + this.bodyPower + ", isArtificialData=" + this.isArtificialData + ", valid=" + this.valid + ", malformedContainer=" + this.malformedContainer + ')';
    }

    public PowerDataContainer(float f, float f2, boolean z, boolean z2, boolean z3) {
        this.solarPower = f;
        this.bodyPower = f2;
        this.isArtificialData = z;
        this.valid = z2;
        this.malformedContainer = z3;
    }

    public /* synthetic */ PowerDataContainer(float f, float f2, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3);
    }

    public final float getBodyPower() {
        return this.bodyPower;
    }

    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final float getSolarPower() {
        return this.solarPower;
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

    public final void setBodyPower(float f) {
        this.bodyPower = f;
    }

    public final void setMalformedContainer(boolean z) {
        this.malformedContainer = z;
    }

    public final void setSolarPower(float f) {
        this.solarPower = f;
    }

    public final void setValid(boolean z) {
        this.valid = z;
    }

    public final boolean getMalformed() {
        return !(this.isArtificialData || this.valid) || this.malformedContainer;
    }
}
