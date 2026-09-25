package powerwatch.matrix.com.pwgen2android.main.notification;

/* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0007J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppContext", "()Landroid/content/Context;", "connectionStoreKey", "", "enableWatchConnectionNotification", "", "enabled", "", "deviceId", "isWatchConnectionNotificationEnabled", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConnectionNotificationPersistence {
    private final android.content.Context appContext;
    private final java.lang.String connectionStoreKey;

    public ConnectionNotificationPersistence(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.connectionStoreKey = "notification_enabled_key";
    }

    public final android.content.Context getAppContext() {
        return this.appContext;
    }

    public final void enableWatchConnectionNotification(boolean enabled, java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putBoolean(kotlin.jvm.internal.Intrinsics.stringPlus(deviceId, this.connectionStoreKey), enabled).commit();
    }

    public final boolean isWatchConnectionNotificationEnabled(java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).getBoolean(kotlin.jvm.internal.Intrinsics.stringPlus(deviceId, this.connectionStoreKey), true);
    }
}
