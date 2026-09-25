package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent;

/* JADX INFO: compiled from: HeartRatePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/heartRateComponent/HeartRateHeaderValues;", "", "average", "", "range", "hrv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAverage", "()Ljava/lang/String;", "getHrv", "getRange", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class HeartRateHeaderValues {
    private final java.lang.String average;
    private final java.lang.String hrv;
    private final java.lang.String range;

    public HeartRateHeaderValues() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues heartRateHeaderValues, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = heartRateHeaderValues.average;
        }
        if ((i & 2) != 0) {
            str2 = heartRateHeaderValues.range;
        }
        if ((i & 4) != 0) {
            str3 = heartRateHeaderValues.hrv;
        }
        return heartRateHeaderValues.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getAverage() {
        return this.average;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getHrv() {
        return this.hrv;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues copy(java.lang.String average, java.lang.String range, java.lang.String hrv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(average, "average");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hrv, "hrv");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues(average, range, hrv);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues heartRateHeaderValues = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.heartRateComponent.HeartRateHeaderValues) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.average, heartRateHeaderValues.average) && kotlin.jvm.internal.Intrinsics.areEqual(this.range, heartRateHeaderValues.range) && kotlin.jvm.internal.Intrinsics.areEqual(this.hrv, heartRateHeaderValues.hrv);
    }

    public int hashCode() {
        return (((this.average.hashCode() * 31) + this.range.hashCode()) * 31) + this.hrv.hashCode();
    }

    public java.lang.String toString() {
        return "HeartRateHeaderValues(average=" + this.average + ", range=" + this.range + ", hrv=" + this.hrv + ')';
    }

    public HeartRateHeaderValues(java.lang.String average, java.lang.String range, java.lang.String hrv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(average, "average");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hrv, "hrv");
        this.average = average;
        this.range = range;
        this.hrv = hrv;
    }

    public /* synthetic */ HeartRateHeaderValues(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str, (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str2, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.defaultNoDataText : str3);
    }

    public final java.lang.String getAverage() {
        return this.average;
    }

    public final java.lang.String getHrv() {
        return this.hrv;
    }

    public final java.lang.String getRange() {
        return this.range;
    }
}
