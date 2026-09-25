package powerwatch.matrix.com.pwgen2android.shared.data.providers;

/* JADX INFO: compiled from: SettingsDataRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0007J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataRepository;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "changeSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "listen", "Lio/reactivex/Observable;", "loadAlarm", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;", "loadSettings", "deviceID", "", "saveAlarm", "", "alarmData", "saveSettings", "settingsData", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SettingsDataRepository {
    private final android.content.Context appContext;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> changeSubject;
    private final com.google.gson.Gson gson;

    public SettingsDataRepository(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.gson = new com.google.gson.Gson();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<SettingsData>()");
        this.changeSubject = publishSubjectCreate;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData loadSettings(java.lang.String deviceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        java.lang.String string = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).getString(kotlin.jvm.internal.Intrinsics.stringPlus(deviceID, " - watch_settings"), null);
        if (string != null) {
            return (powerwatch.matrix.com.pwgen2android.sdk.SettingsData) this.gson.fromJson(string, new com.google.gson.reflect.TypeToken<powerwatch.matrix.com.pwgen2android.sdk.SettingsData>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository.loadSettings.1
            }.getType());
        }
        return null;
    }

    public final void saveSettings(java.lang.String deviceID, powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        if (settingsData == null) {
            return;
        }
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putString(kotlin.jvm.internal.Intrinsics.stringPlus(deviceID, " - watch_settings"), this.gson.toJson(settingsData)).commit();
        this.changeSubject.onNext(settingsData);
    }

    public final void saveAlarm(java.lang.String deviceID, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmData, "alarmData");
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).edit().putString("watch_alarm", this.gson.toJson(new powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData(alarmData.getHour(), alarmData.getMinute(), alarmData.isAM(), alarmData.getDaySelection().getMode(), alarmData.getAlarmControl().getMode()))).commit();
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData loadAlarm() {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay everyDay;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off off;
        java.lang.String string = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.appContext).getString("watch_alarm", null);
        if (string == null) {
            return null;
        }
        java.lang.Object objFromJson = this.gson.fromJson(string, new com.google.gson.reflect.TypeToken<powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataRepository$loadAlarm$loadedData$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(data, object : TypeToken<AlarmSaveData>() {}.type)");
        powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData alarmSaveData = (powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData) objFromJson;
        int daySelection = alarmSaveData.getDaySelection();
        if (daySelection == 0) {
            everyDay = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay.INSTANCE;
        } else if (daySelection == 1) {
            everyDay = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekDay.INSTANCE;
        } else {
            everyDay = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryWeekend.INSTANCE;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection2 = everyDay;
        int alarmControl = alarmSaveData.getAlarmControl();
        if (alarmControl == 0) {
            off = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off.INSTANCE;
        } else if (alarmControl == 1) {
            off = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.On.INSTANCE;
        } else {
            off = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Once.INSTANCE;
        }
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData(alarmSaveData.getHour(), alarmSaveData.getMinute(), alarmSaveData.isAM(), daySelection2, off);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.SettingsData> listen() {
        return this.changeSubject;
    }
}
