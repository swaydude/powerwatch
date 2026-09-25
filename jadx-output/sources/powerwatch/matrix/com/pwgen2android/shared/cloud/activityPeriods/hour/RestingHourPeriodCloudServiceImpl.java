package powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour;

/* JADX INFO: compiled from: RestingHourPeriodCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "periodConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;", "crudHoursPeriodService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;", "crudDayPeriodService", "crudWeekPeriodService", "crudMonthPeriodService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingHourPeriodService;)V", "getAllRestingPeriods", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RestingHourPeriodCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudDayPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudHoursPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudMonthPeriodService;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudWeekPeriodService;

    public RestingHourPeriodCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig periodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudHoursPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudDayPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudWeekPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService crudMonthPeriodService) {
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

    public /* synthetic */ RestingHourPeriodCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.HourPeriodConfig hourPeriodConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService restingHourPeriodService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService restingHourPeriodService2, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService restingHourPeriodService3, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService restingHourPeriodService4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpClient, hourPeriodConfig, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodServiceImpl(httpClient, hourPeriodConfig.getHoursEndpoint(), null, 4, null) : restingHourPeriodService, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodServiceImpl(httpClient, hourPeriodConfig.getDayHoursEndpoint(), null, 4, null) : restingHourPeriodService2, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodServiceImpl(httpClient, hourPeriodConfig.getWeekHoursEndpoint(), null, 4, null) : restingHourPeriodService3, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodServiceImpl(httpClient, hourPeriodConfig.getMonthHoursEndpoint(), null, 4, null) : restingHourPeriodService4);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour.RestingHourPeriodCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod>> getAllRestingPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.RestingHourPeriodService restingHourPeriodService;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("timezone", java.util.TimeZone.getDefault().getID()));
        mapMutableMapOf.put("offset", java.lang.String.valueOf(page.getOffset()));
        mapMutableMapOf.put("limit", java.lang.String.valueOf(page.getLimit()));
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Hour.INSTANCE)) {
            restingHourPeriodService = this.crudHoursPeriodService;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Day.INSTANCE)) {
            restingHourPeriodService = this.crudDayPeriodService;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Week.INSTANCE)) {
            restingHourPeriodService = this.crudWeekPeriodService;
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType.Month.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            restingHourPeriodService = this.crudMonthPeriodService;
        }
        return restingHourPeriodService.all(mapMutableMapOf);
    }
}
