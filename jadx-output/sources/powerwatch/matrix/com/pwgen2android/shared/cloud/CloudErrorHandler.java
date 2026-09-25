package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: Cloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;", "", "authRequiredError", "Lio/reactivex/Observable;", "", "getAuthRequiredError", "()Lio/reactivex/Observable;", "handleApiError", "Lio/reactivex/Completable;", "error", "handleAuthError", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "passwordCredentials", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface CloudErrorHandler {
    io.reactivex.Observable<java.lang.Throwable> getAuthRequiredError();

    io.reactivex.Completable handleApiError(java.lang.Throwable error);

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> handleAuthError(java.lang.Throwable error, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials);
}
