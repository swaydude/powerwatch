package powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods;

/* JADX INFO: compiled from: SleepDayPeriodCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/SleepDayPeriodCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/SleepDayPeriodCloudService;", "crudDayPeriodService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepDayPeriodService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepDayPeriodService;)V", "getAllSleepPeriods", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepDayPeriodCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.SleepDayPeriodCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodService crudDayPeriodService;

    public SleepDayPeriodCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.SleepDayPeriodService crudDayPeriodService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudDayPeriodService, "crudDayPeriodService");
        this.crudDayPeriodService = crudDayPeriodService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.SleepDayPeriodCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod>> getAllSleepPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("timezone", java.util.TimeZone.getDefault().getID()));
        mapMutableMapOf.put("offset", java.lang.String.valueOf(page.getOffset()));
        mapMutableMapOf.put("limit", java.lang.String.valueOf(page.getLimit()));
        return this.crudDayPeriodService.all(mapMutableMapOf);
    }
}
