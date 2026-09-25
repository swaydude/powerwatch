package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsStorage.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H&J \u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "", "isAppNotificationEnabled", "", "context", "Landroid/content/Context;", "appPackageName", "", "defaultValue", "setThirdPartAppEnabled", "", "enabled", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ThirdPartyAppStorage {
    boolean isAppNotificationEnabled(android.content.Context context, java.lang.String appPackageName, boolean defaultValue);

    void setThirdPartAppEnabled(java.lang.String appPackageName, boolean enabled, android.content.Context context);

    /* JADX INFO: compiled from: AlertsStorage.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean isAppNotificationEnabled$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage thirdPartyAppStorage, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isAppNotificationEnabled");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return thirdPartyAppStorage.isAppNotificationEnabled(context, str, z);
        }
    }
}
