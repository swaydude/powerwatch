package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/AvgData;", "", "maxAvg", "", "avg", "minAvg", "(FFF)V", "getAvg", "()F", "getMaxAvg", "getMinAvg", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AvgData {
    private final float avg;
    private final float maxAvg;
    private final float minAvg;

    public AvgData() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = avgData.maxAvg;
        }
        if ((i & 2) != 0) {
            f2 = avgData.avg;
        }
        if ((i & 4) != 0) {
            f3 = avgData.minAvg;
        }
        return avgData.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMaxAvg() {
        return this.maxAvg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMinAvg() {
        return this.minAvg;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData copy(float maxAvg, float avg, float minAvg) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData(maxAvg, avg, minAvg);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData avgData = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.AvgData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.maxAvg), (java.lang.Object) java.lang.Float.valueOf(avgData.maxAvg)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.avg), (java.lang.Object) java.lang.Float.valueOf(avgData.avg)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.minAvg), (java.lang.Object) java.lang.Float.valueOf(avgData.minAvg));
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.maxAvg) * 31) + java.lang.Float.floatToIntBits(this.avg)) * 31) + java.lang.Float.floatToIntBits(this.minAvg);
    }

    public java.lang.String toString() {
        return "AvgData(maxAvg=" + this.maxAvg + ", avg=" + this.avg + ", minAvg=" + this.minAvg + ')';
    }

    public AvgData(float f, float f2, float f3) {
        this.maxAvg = f;
        this.avg = f2;
        this.minAvg = f3;
    }

    public /* synthetic */ AvgData(float f, float f2, float f3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }

    public final float getAvg() {
        return this.avg;
    }

    public final float getMaxAvg() {
        return this.maxAvg;
    }

    public final float getMinAvg() {
        return this.minAvg;
    }
}
