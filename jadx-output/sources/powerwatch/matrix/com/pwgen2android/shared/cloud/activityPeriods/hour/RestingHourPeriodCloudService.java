package powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.hour;

/* JADX INFO: compiled from: RestingHourPeriodCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;", "", "getAllRestingPeriods", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface RestingHourPeriodCloudService {
    io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod>> getAllRestingPeriods(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, powerwatch.matrix.com.pwgen2android.shared.cloud.activityPeriods.PeriodType type);
}
