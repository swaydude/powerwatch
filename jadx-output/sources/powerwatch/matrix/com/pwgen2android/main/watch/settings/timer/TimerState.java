package powerwatch.matrix.com.pwgen2android.main.watch.settings.timer;

/* JADX INFO: compiled from: TimerSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState;", "", "()V", "Idle", "Pause", "Running", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Running;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Pause;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Idle;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class TimerState {
    public /* synthetic */ TimerState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: TimerSettingsVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Running;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Running extends powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState {
        public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Running INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Running();

        private Running() {
            super(null);
        }
    }

    private TimerState() {
    }

    /* JADX INFO: compiled from: TimerSettingsVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Pause;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Pause extends powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState {
        public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Pause INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Pause();

        private Pause() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: TimerSettingsVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState$Idle;", "Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Idle extends powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState {
        public static final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Idle INSTANCE = new powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Idle();

        private Idle() {
            super(null);
        }
    }
}
