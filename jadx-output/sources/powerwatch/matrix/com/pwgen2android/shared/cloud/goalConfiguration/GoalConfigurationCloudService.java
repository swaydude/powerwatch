package powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration;

/* JADX INFO: compiled from: GoalConfigurationCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;", "", "getAllConfigurations", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "save", "Lio/reactivex/Completable;", "goalConfiguration", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface GoalConfigurationCloudService {
    io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> getAllConfigurations();

    io.reactivex.Completable save(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration);
}
