package powerwatch.matrix.com.pwgen2android.shared.cloud.strava;

/* JADX INFO: compiled from: StravaTokenStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;", "", "clearCredentials", "", "loadCredentials", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "storeCredentials", "credentials", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface StravaTokenStorage {
    void clearCredentials();

    powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials loadCredentials();

    void storeCredentials(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials credentials);
}
