package powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour;

/* JADX INFO: compiled from: SleepHourPeriodCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "periodConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;", "crudHoursPeriodService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;", "crudDayPeriodService", "crudWeekPeriodService", "crudMonthPeriodService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepHourPeriodService;)V", "getAllSleepPeriods", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepHourPeriodCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudDayPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudHoursPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudMonthPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudWeekPeriodService;

    public SleepHourPeriodCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig periodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudHoursPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudDayPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudWeekPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService crudMonthPeriodService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodConfig, "periodConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudHoursPeriodService, "crudHoursPeriodService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudDayPeriodService, "crudDayPeriodService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudWeekPeriodService, "crudWeekPeriodService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudMonthPeriodService, "crudMonthPeriodService");
        this.crudHoursPeriodService = crudHoursPeriodService;
        this.crudDayPeriodService = crudDayPeriodService;
        this.crudWeekPeriodService = crudWeekPeriodService;
        this.crudMonthPeriodService = crudMonthPeriodService;
    }

    public /* synthetic */ SleepHourPeriodCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig hourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService sleepHourPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService sleepHourPeriodService2, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService sleepHourPeriodService3, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService sleepHourPeriodService4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, hourPeriodConfig, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodServiceImpl(httpClient, hourPeriodConfig.getHoursEndpoint(), null, 4, null) : sleepHourPeriodService, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodServiceImpl(httpClient, hourPeriodConfig.getDayHoursEndpoint(), null, 4, null) : sleepHourPeriodService2, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodServiceImpl(httpClient, hourPeriodConfig.getWeekHoursEndpoint(), null, 4, null) : sleepHourPeriodService3, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodServiceImpl(httpClient, hourPeriodConfig.getMonthHoursEndpoint(), null, 4, null) : sleepHourPeriodService4);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.SleepHourPeriodCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>> getAllSleepPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepHourPeriodService sleepHourPeriodService;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("timezone", java.util.TimeZone.getDefault().getID()));
        mapMutableMapOf.put("offset", java.lang.String.valueOf(page.getOffset()));
        mapMutableMapOf.put("limit", java.lang.String.valueOf(page.getLimit()));
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Hour.INSTANCE)) {
            sleepHourPeriodService = this.crudHoursPeriodService;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Day.INSTANCE)) {
            sleepHourPeriodService = this.crudDayPeriodService;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Week.INSTANCE)) {
            sleepHourPeriodService = this.crudWeekPeriodService;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Month.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            sleepHourPeriodService = this.crudMonthPeriodService;
        }
        return sleepHourPeriodService.all(mapMutableMapOf);
    }
}
