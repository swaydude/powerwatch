package powerwatch.matrix.com.pwgen2android.shared.cloud.strava;

/* JADX INFO: compiled from: StravaCloud.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;", "", "hasToken", "", "loadStoredCredentials", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN, "Lio/reactivex/Single;", "stravaHost", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaHost;", "logout", "Lio/reactivex/Completable;", "uploadActivity", "data", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface StravaCloud {
    boolean hasToken();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> loadStoredCredentials();

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> login(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost);

    io.reactivex.Completable logout(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost stravaHost);

    io.reactivex.Completable uploadActivity(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData data);
}
