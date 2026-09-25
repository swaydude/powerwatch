package powerwatch.matrix.com.pwgen2android.main.battery;

/* JADX INFO: compiled from: BatteryNotificationPersistence.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006J\u001a\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "storeLevelKey", "", "storeSettingKey", "enableBatteryNotification", "", "enabled", "", "deviceId", "getBatteryLevelChange", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", "isBatteryNotificationEnabled", "storeBatteryLevelChange", "batteryLevel", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BatteryNotificationPersistence {
    private final android.content.Context context;
    private final java.lang.String storeLevelKey;
    private final java.lang.String storeSettingKey;

    public BatteryNotificationPersistence(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.storeLevelKey = "stored_battery_level_change";
        this.storeSettingKey = "stored_setting_key";
    }

    public final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel getBatteryLevelChange(java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.INSTANCE.getLevel(androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).getFloat(kotlin.jvm.internal.Intrinsics.stringPlus(deviceId, this.storeLevelKey), 100.0f));
    }

    public static /* synthetic */ void storeBatteryLevelChange$default(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = Float.MIN_VALUE;
        }
        batteryNotificationPersistence.storeBatteryLevelChange(str, f);
    }

    public final void storeBatteryLevelChange(java.lang.String deviceId, float batteryLevel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).edit().putFloat(kotlin.jvm.internal.Intrinsics.stringPlus(deviceId, this.storeLevelKey), batteryLevel).commit();
    }

    public final void enableBatteryNotification(boolean enabled, java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).edit().putBoolean(kotlin.jvm.internal.Intrinsics.stringPlus(deviceId, this.storeSettingKey), enabled).commit();
    }

    public final boolean isBatteryNotificationEnabled(java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(kotlin.jvm.internal.Intrinsics.stringPlus(deviceId, this.storeSettingKey), true);
    }
}
