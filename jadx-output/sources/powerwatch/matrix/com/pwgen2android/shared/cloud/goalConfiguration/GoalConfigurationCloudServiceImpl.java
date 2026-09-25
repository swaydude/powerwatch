package powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration;

/* JADX INFO: compiled from: GoalConfigurationCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;", "goalConfigurationService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;)V", "getAllConfigurations", "Lio/reactivex/Single;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "save", "Lio/reactivex/Completable;", "goalConfiguration", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoalConfigurationCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService goalConfigurationService;

    public GoalConfigurationCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GoalConfigurationService goalConfigurationService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationService, "goalConfigurationService");
        this.goalConfigurationService = goalConfigurationService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService
    public io.reactivex.Completable save(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfiguration, "goalConfiguration");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService.DefaultImpls.add$default(this.goalConfigurationService, goalConfiguration, null, 2, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.goalConfiguration.GoalConfigurationCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> getAllConfigurations() {
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService.DefaultImpls.all$default(this.goalConfigurationService, null, 1, null);
    }
}
