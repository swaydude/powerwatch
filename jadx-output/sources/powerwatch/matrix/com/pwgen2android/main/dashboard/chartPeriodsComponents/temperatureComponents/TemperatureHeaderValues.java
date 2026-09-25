package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;", "", "average", "", "range", "(Ljava/lang/String;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "getRange", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TemperatureHeaderValues {
    private final java.lang.String average;
    private final java.lang.String range;

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureHeaderValues() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues temperatureHeaderValues, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = temperatureHeaderValues.average;
        }
        if ((i & 2) != 0) {
            str2 = temperatureHeaderValues.range;
        }
        return temperatureHeaderValues.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getRange() {
        return this.range;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues copy(java.lang.String average, java.lang.String range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(average, "average");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues(average, range);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues temperatureHeaderValues = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.average, temperatureHeaderValues.average) && kotlin.jvm.internal.Intrinsics.areEqual(this.range, temperatureHeaderValues.range);
    }

    public int hashCode() {
        return (this.average.hashCode() * 31) + this.range.hashCode();
    }

    public java.lang.String toString() {
        return "TemperatureHeaderValues(average=" + this.average + ", range=" + this.range + ')';
    }

    public TemperatureHeaderValues(java.lang.String average, java.lang.String range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(average, "average");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        this.average = average;
        this.range = range;
    }

    public /* synthetic */ TemperatureHeaderValues(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str, (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str2);
    }

    public final java.lang.String getAverage() {
        return this.average;
    }

    public final java.lang.String getRange() {
        return this.range;
    }
}
