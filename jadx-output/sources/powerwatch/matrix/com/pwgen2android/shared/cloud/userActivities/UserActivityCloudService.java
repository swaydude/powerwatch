package powerwatch.matrix.com.pwgen2android.shared.cloud.userActivities;

/* JADX INFO: compiled from: UserActivityCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;", "", "deleteUserActivity", "Lio/reactivex/Completable;", "userActivity", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "getAllUserActivities", "Lio/reactivex/Single;", "", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "getAllUserActivityDates", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "getOneUserActivity", "id", "", "saveUserActivities", "userActivities", "updateUserActivity", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UserActivityCloudService {
    io.reactivex.Completable deleteUserActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivity);

    io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> getAllUserActivities(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page);

    io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> getAllUserActivityDates(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page);

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getOneUserActivity(java.lang.String id);

    io.reactivex.Completable saveUserActivities(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivities);

    io.reactivex.Completable updateUserActivity(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivity);
}
