package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth;

/* JADX INFO: compiled from: StravaAuthServiceImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaAuthService;", "", "authorize", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "config", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;", "logout", "Lio/reactivex/Completable;", "stravaHost", "refresh", "refreshToken", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface StravaAuthService {
    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> authorize(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost host);

    io.reactivex.Completable logout(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config);

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> refresh(java.lang.String refreshToken, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaConfig config, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost host);
}
