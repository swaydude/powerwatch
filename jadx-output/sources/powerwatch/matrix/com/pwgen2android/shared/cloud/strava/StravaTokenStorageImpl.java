package powerwatch.matrix.com.pwgen2android.shared.cloud.strava;

/* JADX INFO: compiled from: StravaTokenStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ACCESS_TOKEN", "", "CODE", "EXPIRES_AT", "EXPIRES_IN", "REFRESH_TOKEN", "TOKEN_TYPE", "contextWearReference", "Ljava/lang/ref/WeakReference;", "clearCredentials", "", "loadCredentials", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;", "storeCredentials", "credentials", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaTokenStorageImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage {
    private final java.lang.String ACCESS_TOKEN;
    private final java.lang.String CODE;
    private final java.lang.String EXPIRES_AT;
    private final java.lang.String EXPIRES_IN;
    private final java.lang.String REFRESH_TOKEN;
    private final java.lang.String TOKEN_TYPE;
    private final java.lang.ref.WeakReference<android.content.Context> contextWearReference;

    public StravaTokenStorageImpl(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.contextWearReference = new java.lang.ref.WeakReference<>(appContext);
        this.ACCESS_TOKEN = "password_credentials_access_token";
        this.REFRESH_TOKEN = "password_credentials_refresh_token";
        this.TOKEN_TYPE = "password_credentials_token_type";
        this.EXPIRES_IN = "password_credentials_expires_in";
        this.EXPIRES_AT = "password_credentials_expires_at";
        this.CODE = "password_credentials_code";
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage
    public void clearCredentials() {
        android.content.Context context = this.contextWearReference.get();
        if (context == null) {
            return;
        }
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.ACCESS_TOKEN, null).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.REFRESH_TOKEN, null).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(this.EXPIRES_AT, -1L).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(this.EXPIRES_IN, -1L).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.TOKEN_TYPE, null).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.CODE, null).commit();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage
    public void storeCredentials(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials credentials) {
        android.content.Context context = this.contextWearReference.get();
        if (context == null) {
            return;
        }
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.ACCESS_TOKEN, credentials == null ? null : credentials.getAccessToken()).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.REFRESH_TOKEN, credentials == null ? null : credentials.getRefreshToken()).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(this.EXPIRES_AT, credentials == null ? -1L : credentials.getExpiresAt()).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(this.EXPIRES_IN, credentials != null ? credentials.getExpiresIn() : -1L).commit();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.TOKEN_TYPE, credentials == null ? null : credentials.getTokenType()).commit();
        if ((credentials != null ? credentials.getCode() : null) != null) {
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putString(this.CODE, credentials.getCode()).commit();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaTokenStorage
    public powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials loadCredentials() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        android.content.Context context = this.contextWearReference.get();
        if (context == null || (string = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(this.ACCESS_TOKEN, null)) == null || (string2 = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(this.REFRESH_TOKEN, null)) == null) {
            return null;
        }
        long j = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(this.EXPIRES_AT, -1L);
        long j2 = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(this.EXPIRES_IN, -1L);
        java.lang.String string4 = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(this.TOKEN_TYPE, null);
        if (string4 == null || (string3 = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(this.CODE, null)) == null) {
            return null;
        }
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials(0, string, string4, string2, j2, j, string3, 1, null);
    }
}
