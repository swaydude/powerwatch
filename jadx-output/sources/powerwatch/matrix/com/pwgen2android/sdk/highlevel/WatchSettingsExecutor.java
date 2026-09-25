package powerwatch.matrix.com.pwgen2android.sdk.highlevel;

/* JADX INFO: compiled from: WatchSettingsExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSettingsExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchAlarmTimerSettingExecutor;", "resetWatch", "Lio/reactivex/Completable;", "resetMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/ResetMode;", "setAlert", "alertMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlertMode;", "setBLEDisconnectionAlert", "bleAlertMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BLEAlertMode;", "setBackLightDuration", "duration", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;", "setBackLightMode", "mode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightMode;", "setDNDMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;", "setGPSUpdateRate", "gpsUpdateRate", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "setHomeScreenMode", "homeScreenMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "setPopupDuration", "popupDuration", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/PopupDuration;", "setRingtone", "ringtoneMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface WatchSettingsExecutor extends powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchAlarmTimerSettingExecutor {
    io.reactivex.Completable resetWatch(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.ResetMode resetMode);

    io.reactivex.Completable setAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlertMode alertMode);

    io.reactivex.Completable setBLEDisconnectionAlert(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BLEAlertMode bleAlertMode);

    io.reactivex.Completable setBackLightDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration duration);

    io.reactivex.Completable setBackLightMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightMode mode);

    io.reactivex.Completable setDNDMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode mode);

    io.reactivex.Completable setGPSUpdateRate(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate gpsUpdateRate);

    io.reactivex.Completable setHomeScreenMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode homeScreenMode);

    io.reactivex.Completable setPopupDuration(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.PopupDuration popupDuration);

    io.reactivex.Completable setRingtone(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode ringtoneMode);
}
