package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgLineChartData;", "", "xValue", "", "avgData", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;", "(FLpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;)V", "getAvgData", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;", "getXValue", "()F", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AvgLineChartData {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData;
    private final float xValue;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData, float f, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = avgLineChartData.xValue;
        }
        if ((i & 2) != 0) {
            avgData = avgLineChartData.avgData;
        }
        return avgLineChartData.copy(f, avgData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getXValue() {
        return this.xValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData getAvgData() {
        return this.avgData;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData copy(float xValue, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgData, "avgData");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData(xValue, avgData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData avgLineChartData = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgLineChartData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.xValue), (java.lang.Object) java.lang.Float.valueOf(avgLineChartData.xValue)) && kotlin.jvm.internal.Intrinsics.areEqual(this.avgData, avgLineChartData.avgData);
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.xValue) * 31) + this.avgData.hashCode();
    }

    public java.lang.String toString() {
        return "AvgLineChartData(xValue=" + this.xValue + ", avgData=" + this.avgData + ')';
    }

    public AvgLineChartData(float f, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avgData, "avgData");
        this.xValue = f;
        this.avgData = avgData;
    }

    public /* synthetic */ AvgLineChartData(float f, powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, avgData);
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData getAvgData() {
        return this.avgData;
    }

    public final float getXValue() {
        return this.xValue;
    }
}
