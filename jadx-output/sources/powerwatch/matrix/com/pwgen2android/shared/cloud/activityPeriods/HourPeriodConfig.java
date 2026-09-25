package powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods;

/* JADX INFO: compiled from: PeriodConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;", "", "hoursEndpoint", "", "dayHoursEndpoint", "weekHoursEndpoint", "monthHoursEndpoint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDayHoursEndpoint", "()Ljava/lang/String;", "getHoursEndpoint", "getMonthHoursEndpoint", "getWeekHoursEndpoint", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HourPeriodConfig {
    private final java.lang.String dayHoursEndpoint;
    private final java.lang.String hoursEndpoint;
    private final java.lang.String monthHoursEndpoint;
    private final java.lang.String weekHoursEndpoint;

    public HourPeriodConfig(java.lang.String hoursEndpoint, java.lang.String dayHoursEndpoint, java.lang.String weekHoursEndpoint, java.lang.String monthHoursEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hoursEndpoint, "hoursEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayHoursEndpoint, "dayHoursEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekHoursEndpoint, "weekHoursEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthHoursEndpoint, "monthHoursEndpoint");
        this.hoursEndpoint = hoursEndpoint;
        this.dayHoursEndpoint = dayHoursEndpoint;
        this.weekHoursEndpoint = weekHoursEndpoint;
        this.monthHoursEndpoint = monthHoursEndpoint;
    }

    public final java.lang.String getDayHoursEndpoint() {
        return this.dayHoursEndpoint;
    }

    public final java.lang.String getHoursEndpoint() {
        return this.hoursEndpoint;
    }

    public final java.lang.String getMonthHoursEndpoint() {
        return this.monthHoursEndpoint;
    }

    public final java.lang.String getWeekHoursEndpoint() {
        return this.weekHoursEndpoint;
    }
}
