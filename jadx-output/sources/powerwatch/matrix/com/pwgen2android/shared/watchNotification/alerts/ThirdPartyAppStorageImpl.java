package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorageImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isAppNotificationEnabled", "", "context", "appPackageName", "", "defaultValue", "setThirdPartAppEnabled", "", "enabled", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ThirdPartyAppStorageImpl implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage {
    private final android.content.Context appContext;

    public ThirdPartyAppStorageImpl(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage
    public void setThirdPartAppEnabled(java.lang.String appPackageName, boolean enabled, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(kotlin.jvm.internal.Intrinsics.stringPlus("com.matrix.powerwatch.APP_NOTIFICATION_ENABLED", appPackageName), enabled).apply();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage
    public boolean isAppNotificationEnabled(android.content.Context context, java.lang.String appPackageName, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(kotlin.jvm.internal.Intrinsics.stringPlus("com.matrix.powerwatch.APP_NOTIFICATION_ENABLED", appPackageName), defaultValue);
    }
}
