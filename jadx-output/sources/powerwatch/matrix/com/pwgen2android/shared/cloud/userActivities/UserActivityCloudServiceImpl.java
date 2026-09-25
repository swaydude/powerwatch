package powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities;

/* JADX INFO: compiled from: UserActivityCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;", "crudUserActivityService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;)V", "deleteUserActivity", "Lio/reactivex/Completable;", "userActivity", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "getAllUserActivities", "Lio/reactivex/Single;", "", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "getAllUserActivityDates", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "getOneUserActivity", "id", "", "saveUserActivities", "userActivities", "updateUserActivity", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserActivityCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService crudUserActivityService;

    public UserActivityCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService crudUserActivityService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudUserActivityService, "crudUserActivityService");
        this.crudUserActivityService = crudUserActivityService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> getAllUserActivityDates(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("timezone", java.util.TimeZone.getDefault().getID()));
        mapMutableMapOf.put("offset", java.lang.String.valueOf(page.getOffset()));
        mapMutableMapOf.put("limit", java.lang.String.valueOf(page.getLimit()));
        return this.crudUserActivityService.getAllUserActivityDates(mapMutableMapOf);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Completable updateUserActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        return this.crudUserActivityService.update(userActivity);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getOneUserActivity(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Completable deleteUserActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivity, "userActivity");
        return this.crudUserActivityService.delete(userActivity, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("id", userActivity.getId())));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> getAllUserActivities(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("timezone", java.util.TimeZone.getDefault().getID()));
        mapMutableMapOf.put("offset", java.lang.String.valueOf(page.getOffset()));
        mapMutableMapOf.put("limit", java.lang.String.valueOf(page.getLimit()));
        return this.crudUserActivityService.all(mapMutableMapOf);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities.UserActivityCloudService
    public io.reactivex.Completable saveUserActivities(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivities, "userActivities");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService.DefaultImpls.add$default(this.crudUserActivityService, userActivities, null, 2, null);
    }
}
