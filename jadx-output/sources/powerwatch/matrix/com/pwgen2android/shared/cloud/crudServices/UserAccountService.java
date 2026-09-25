package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: UserAccountService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH&J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0014j\u0002`\u0015H&¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;", "addFirebaseToken", "Lio/reactivex/CompletableSource;", "token", "", "forgotPassword", "Lio/reactivex/Completable;", "email", "resendVerifyEmail", "resetPassword", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;", "verifyUser", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;", "headers", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UserAccountService extends powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.User>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.User>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> {
    io.reactivex.CompletableSource addFirebaseToken(java.lang.String token);

    io.reactivex.Completable forgotPassword(java.lang.String email);

    io.reactivex.Completable resendVerifyEmail(java.lang.String email);

    io.reactivex.Completable resetPassword(powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword resetPassword);

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> verifyUser(powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser verifyUser, java.util.Map<java.lang.String, java.lang.String> headers);
}
