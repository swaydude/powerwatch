package powerwatch.matrix.com.pwgen2android.sdk.highlevel;

/* JADX INFO: compiled from: WatchSettingsExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchAlarmTimerSettingExecutor;", "", "setAlarm", "Lio/reactivex/Completable;", "alarmData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;", "setTimer", "timerData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface WatchAlarmTimerSettingExecutor {
    io.reactivex.Completable setAlarm(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmData);

    io.reactivex.Completable setTimer(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData timerData);
}
