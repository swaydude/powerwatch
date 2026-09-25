package powerwatch.matrix.com.pwgen2android.sdk.technologies.operations;

/* JADX INFO: compiled from: BleConnectionWithRetryOperation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppContext", "()Landroid/content/Context;", "lastConnect", "", "getLastConnect", "()Z", "setLastConnect", "(Z)V", "locationTag", "", "getLocationTag", "()Ljava/lang/String;", "enableAutoConnect", "", "isAutoConnectEnabled", "restoreLastState", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConnectionPreference {
    private final android.content.Context appContext;
    private boolean lastConnect;
    private final java.lang.String locationTag;

    public ConnectionPreference(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.locationTag = "auto_connect_enabled";
        this.lastConnect = isAutoConnectEnabled();
    }

    public final android.content.Context getAppContext() {
        return this.appContext;
    }

    public final java.lang.String getLocationTag() {
        return this.locationTag;
    }

    public final boolean getLastConnect() {
        return this.lastConnect;
    }

    public final void setLastConnect(boolean z) {
        this.lastConnect = z;
    }

    public final boolean isAutoConnectEnabled() {
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).getBoolean(this.locationTag, true);
    }

    public final void enableAutoConnect(boolean enableAutoConnect) {
        this.lastConnect = isAutoConnectEnabled();
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putBoolean(this.locationTag, enableAutoConnect).apply();
    }

    public final void restoreLastState() {
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putBoolean(this.locationTag, this.lastConnect).apply();
    }
}
