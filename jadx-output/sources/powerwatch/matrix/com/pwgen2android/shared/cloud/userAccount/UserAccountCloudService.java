package powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount;

/* JADX INFO: compiled from: UserAccountCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;", "", "addPushNotificationsToken", "Lio/reactivex/CompletableSource;", "token", "", "addUser", "Lio/reactivex/Completable;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "forgotUserPassword", "email", "getUser", "Lio/reactivex/Single;", "resendVerifyEmail", "resetUserPassword", "oldPassword", "newPassword", "updateUser", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UserAccountCloudService {
    io.reactivex.CompletableSource addPushNotificationsToken(java.lang.String token);

    io.reactivex.Completable addUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user);

    io.reactivex.Completable forgotUserPassword(java.lang.String email);

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getUser();

    io.reactivex.Completable resendVerifyEmail(java.lang.String email);

    io.reactivex.Completable resetUserPassword(java.lang.String oldPassword, java.lang.String newPassword);

    io.reactivex.Completable updateUser(powerwatch.matrix.com.pwgen2android.shared.data.models.User user);
}
