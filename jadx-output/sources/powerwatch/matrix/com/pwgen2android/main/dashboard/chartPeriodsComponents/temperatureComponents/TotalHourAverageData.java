package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TotalHourAverageData;", "", "startTime", "", "fullTime", "hourInDay", "", "avgData", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "valid", "", "(JJILpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;IZ)V", "getAvgData", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;", "setAvgData", "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;)V", "getFullTime", "()J", "setFullTime", "(J)V", "getHourInDay", "()I", "setHourInDay", "(I)V", "getIndex", "setIndex", "getStartTime", "setStartTime", "getValid", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TotalHourAverageData {
    private powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData;
    private long fullTime;
    private int hourInDay;
    private int index;
    private long startTime;
    private final boolean valid;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFullTime() {
        return this.fullTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHourInDay() {
        return this.hourInDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData getAvgData() {
        return this.avgData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData copy(long startTime, long fullTime, int hourInDay, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData, int index, boolean valid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgData, "avgData");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData(startTime, fullTime, hourInDay, avgData, index, valid);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData totalHourAverageData = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TotalHourAverageData) other;
        return this.startTime == totalHourAverageData.startTime && this.fullTime == totalHourAverageData.fullTime && this.hourInDay == totalHourAverageData.hourInDay && kotlin.jvm.internal.Intrinsics.areEqual(this.avgData, totalHourAverageData.avgData) && this.index == totalHourAverageData.index && this.valid == totalHourAverageData.valid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iM0 = ((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startTime) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.fullTime)) * 31) + this.hourInDay) * 31) + this.avgData.hashCode()) * 31) + this.index) * 31;
        boolean z = this.valid;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM0 + r1;
    }

    public java.lang.String toString() {
        return "TotalHourAverageData(startTime=" + this.startTime + ", fullTime=" + this.fullTime + ", hourInDay=" + this.hourInDay + ", avgData=" + this.avgData + ", index=" + this.index + ", valid=" + this.valid + ')';
    }

    public TotalHourAverageData(long j, long j2, int i, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgData, "avgData");
        this.startTime = j;
        this.fullTime = j2;
        this.hourInDay = i;
        this.avgData = avgData;
        this.index = i2;
        this.valid = z;
    }

    public /* synthetic */ TotalHourAverageData(long j, long j2, int i, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData, int i2, boolean z, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? 1 : i, avgData, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? true : z);
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData getAvgData() {
        return this.avgData;
    }

    public final long getFullTime() {
        return this.fullTime;
    }

    public final int getHourInDay() {
        return this.hourInDay;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final void setAvgData(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgData, "<set-?>");
        this.avgData = avgData;
    }

    public final void setFullTime(long j) {
        this.fullTime = j;
    }

    public final void setHourInDay(int i) {
        this.hourInDay = i;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
