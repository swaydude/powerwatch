package powerwatch.matrix.com.pwgen2android.main.notification;

/* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\fJ\u001a\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAppContext", "()Landroid/content/Context;", "goalsStoreKey", "", "enableUserGoalsNotification", "", "enabled", "", "isGoalsHit", "goalType", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;", "isGoalsNotificationsEnabled", "setGoalsHit", "goalsHit", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoalsNotificationPersistence {
    private final android.content.Context appContext;
    private final java.lang.String goalsStoreKey;

    public GoalsNotificationPersistence(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.goalsStoreKey = "goals_notification_enabled_key";
    }

    public final android.content.Context getAppContext() {
        return this.appContext;
    }

    public final void enableUserGoalsNotification(boolean enabled) {
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putBoolean(this.goalsStoreKey, enabled).commit();
    }

    public final boolean isGoalsNotificationsEnabled() {
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).getBoolean(this.goalsStoreKey, true);
    }

    public final boolean isGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType goalType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalType, "goalType");
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).getBoolean(goalType.getStoreKey(), false);
    }

    public static /* synthetic */ void setGoalsHit$default(powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsType goalsType, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        goalsNotificationPersistence.setGoalsHit(goalsType, z);
    }

    public final void setGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType goalType, boolean goalsHit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalType, "goalType");
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putBoolean(goalType.getStoreKey(), goalsHit).commit();
    }
}
