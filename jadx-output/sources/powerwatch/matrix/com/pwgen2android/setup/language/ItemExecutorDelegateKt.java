package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: ItemExecutorDelegate.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"currentRepeat", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;", "getCurrentRepeat", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;", "setCurrentRepeat", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;)V", "currentSelectionMode", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;", "getCurrentSelectionMode", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;", "setCurrentSelectionMode", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ItemExecutorDelegateKt {
    private static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection currentRepeat = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection.EveryDay.INSTANCE;
    private static powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl currentSelectionMode = powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl.Off.INSTANCE;

    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection getCurrentRepeat() {
        return currentRepeat;
    }

    public static final void setCurrentRepeat(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySelection, "<set-?>");
        currentRepeat = daySelection;
    }

    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl getCurrentSelectionMode() {
        return currentSelectionMode;
    }

    public static final void setCurrentSelectionMode(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl alarmControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmControl, "<set-?>");
        currentSelectionMode = alarmControl;
    }
}
