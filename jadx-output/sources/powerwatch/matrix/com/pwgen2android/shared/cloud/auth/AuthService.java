package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: compiled from: AuthService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;", "", "authorize", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "authConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "refresh", "refreshToken", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AuthService {
    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> authorize(powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.host.Host host);

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> refresh(java.lang.String refreshToken, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.OAuth2Config authConfig, powerwatch.matrix.com.pwgen2android.shared.host.Host host);
}
