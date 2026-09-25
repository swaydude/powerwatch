package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent;

/* JADX INFO: compiled from: HeartRatePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013¨\u0006+"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateDataContainer;", "", "min", "", "avg", "max", "isArtificailData", "", "valid", "malformedContainer", "hrv", "(IIIZZZI)V", "getAvg", "()I", "setAvg", "(I)V", "getHrv", "()Z", "setArtificailData", "(Z)V", "malformed", "getMalformed", "getMalformedContainer", "setMalformedContainer", "getMax", "setMax", "getMin", "setMin", "getValid", "setValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class HeartRateDataContainer {
    private int avg;
    private final int hrv;
    private boolean isArtificailData;
    private boolean malformedContainer;
    private int max;
    private int min;
    private boolean valid;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = heartRateDataContainer.min;
        }
        if ((i5 & 2) != 0) {
            i2 = heartRateDataContainer.avg;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = heartRateDataContainer.max;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            z = heartRateDataContainer.isArtificailData;
        }
        boolean z4 = z;
        if ((i5 & 16) != 0) {
            z2 = heartRateDataContainer.valid;
        }
        boolean z5 = z2;
        if ((i5 & 32) != 0) {
            z3 = heartRateDataContainer.malformedContainer;
        }
        boolean z6 = z3;
        if ((i5 & 64) != 0) {
            i4 = heartRateDataContainer.hrv;
        }
        return heartRateDataContainer.copy(i, i6, i7, z4, z5, z6, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsArtificailData() {
        return this.isArtificailData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHrv() {
        return this.hrv;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer copy(int min, int avg, int max, boolean isArtificailData, boolean valid, boolean malformedContainer, int hrv) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer(min, avg, max, isArtificailData, valid, malformedContainer, hrv);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer heartRateDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateDataContainer) other;
        return this.min == heartRateDataContainer.min && this.avg == heartRateDataContainer.avg && this.max == heartRateDataContainer.max && this.isArtificailData == heartRateDataContainer.isArtificailData && this.valid == heartRateDataContainer.valid && this.malformedContainer == heartRateDataContainer.malformedContainer && this.hrv == heartRateDataContainer.hrv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int i = ((((this.min * 31) + this.avg) * 31) + this.max) * 31;
        boolean z = this.isArtificailData;
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
        return ((i3 + (z3 ? 1 : z3)) * 31) + this.hrv;
    }

    public java.lang.String toString() {
        return "HeartRateDataContainer(min=" + this.min + ", avg=" + this.avg + ", max=" + this.max + ", isArtificailData=" + this.isArtificailData + ", valid=" + this.valid + ", malformedContainer=" + this.malformedContainer + ", hrv=" + this.hrv + ')';
    }

    public HeartRateDataContainer(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4) {
        this.min = i;
        this.avg = i2;
        this.max = i3;
        this.isArtificailData = z;
        this.valid = z2;
        this.malformedContainer = z3;
        this.hrv = i4;
    }

    public /* synthetic */ HeartRateDataContainer(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? true : z2, (i5 & 32) != 0 ? false : z3, (i5 & 64) != 0 ? 0 : i4);
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getHrv() {
        return this.hrv;
    }

    public final boolean getMalformedContainer() {
        return this.malformedContainer;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final boolean isArtificailData() {
        return this.isArtificailData;
    }

    public final void setArtificailData(boolean z) {
        this.isArtificailData = z;
    }

    public final void setAvg(int i) {
        this.avg = i;
    }

    public final void setMalformedContainer(boolean z) {
        this.malformedContainer = z;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setValid(boolean z) {
        this.valid = z;
    }

    public final boolean getMalformed() {
        return !(this.isArtificailData || this.valid) || this.malformedContainer;
    }
}
