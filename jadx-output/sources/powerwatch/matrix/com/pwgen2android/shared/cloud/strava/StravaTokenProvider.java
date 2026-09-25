package powerwatch.matrix.com.pwgen2android.shared.cloud.strava;

/* JADX INFO: compiled from: StravaTokenProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenProvider;", "", "provideToken", "Lio/reactivex/Maybe;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface StravaTokenProvider {
    io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials> provideToken();
}
