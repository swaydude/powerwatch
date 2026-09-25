package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;", "", "min", "", "avg", "max", "isArtificialData", "", "valid", "malformedContainer", "(FFFZZZ)V", "getAvg", "()F", "setAvg", "(F)V", "()Z", "setArtificialData", "(Z)V", "malformed", "getMalformed", "getMalformedContainer", "setMalformedContainer", "getMax", "setMax", "getMin", "setMin", "getValid", "setValid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TemperatureDataContainer {
    private float avg;
    private boolean isArtificialData;
    private boolean malformedContainer;
    private float max;
    private float min;
    private boolean valid;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer, float f, float f2, float f3, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = temperatureDataContainer.min;
        }
        if ((i & 2) != 0) {
            f2 = temperatureDataContainer.avg;
        }
        float f4 = f2;
        if ((i & 4) != 0) {
            f3 = temperatureDataContainer.max;
        }
        float f5 = f3;
        if ((i & 8) != 0) {
            z = temperatureDataContainer.isArtificialData;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = temperatureDataContainer.valid;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = temperatureDataContainer.malformedContainer;
        }
        return temperatureDataContainer.copy(f, f4, f5, z4, z5, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsArtificialData() {
        return this.isArtificialData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer copy(float min, float avg, float max, boolean isArtificialData, boolean valid, boolean malformedContainer) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer(min, avg, max, isArtificialData, valid, malformedContainer);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.min), (java.lang.Object) java.lang.Float.valueOf(temperatureDataContainer.min)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.avg), (java.lang.Object) java.lang.Float.valueOf(temperatureDataContainer.avg)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.max), (java.lang.Object) java.lang.Float.valueOf(temperatureDataContainer.max)) && this.isArtificialData == temperatureDataContainer.isArtificialData && this.valid == temperatureDataContainer.valid && this.malformedContainer == temperatureDataContainer.malformedContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iFloatToIntBits = ((((java.lang.Float.floatToIntBits(this.min) * 31) + java.lang.Float.floatToIntBits(this.avg)) * 31) + java.lang.Float.floatToIntBits(this.max)) * 31;
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
        return "TemperatureDataContainer(min=" + this.min + ", avg=" + this.avg + ", max=" + this.max + ", isArtificialData=" + this.isArtificialData + ", valid=" + this.valid + ", malformedContainer=" + this.malformedContainer + ')';
    }

    public TemperatureDataContainer(float f, float f2, float f3, boolean z, boolean z2, boolean z3) {
        this.min = f;
        this.avg = f2;
        this.max = f3;
        this.isArtificialData = z;
        this.valid = z2;
        this.malformedContainer = z3;
    }

    public /* synthetic */ TemperatureDataContainer(float f, float f2, float f3, boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3);
    }

    public final float getAvg() {
        return this.avg;
    }

    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
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

    public final void setAvg(float f) {
        this.avg = f;
    }

    public final void setMalformedContainer(boolean z) {
        this.malformedContainer = z;
    }

    public final void setMax(float f) {
        this.max = f;
    }

    public final void setMin(float f) {
        this.min = f;
    }

    public final void setValid(boolean z) {
        this.valid = z;
    }

    public final boolean getMalformed() {
        return !(this.isArtificialData || this.valid) || this.malformedContainer;
    }
}
