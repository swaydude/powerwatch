package powerwatch.matrix.com.pwgen2android.main.watch.settings.timer;

/* JADX INFO: compiled from: TimerSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"powerwatch/matrix/com/pwgen2android/main/watch/settings/timer/TimerSettingsVM$onStartButtonClicked$1$1", "Ljava/util/TimerTask;", "run", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimerSettingsVM$onStartButtonClicked$1$1 extends java.util.TimerTask {
    final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM this$0;

    TimerSettingsVM$onStartButtonClicked$1$1(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM timerSettingsVM) {
        this.this$0 = timerSettingsVM;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("timer_flow: triggered ", java.lang.Integer.valueOf(this.this$0.getTimerValue())));
        if (this.this$0.getTimerValue() > 0) {
            powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM timerSettingsVM = this.this$0;
            timerSettingsVM.setTimerValue(timerSettingsVM.getTimerValue() - 1);
            this.this$0.updateUI();
        } else {
            this.this$0.getTimer().cancel();
            this.this$0.getTimer().purge();
            this.this$0.setTimer(new java.util.Timer());
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            final powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM timerSettingsVM2 = this.this$0;
            handler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.-$$Lambda$TimerSettingsVM$onStartButtonClicked$1$1$LD6Sn-3rO0g_R8fPciJBqlKfHYw
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM$onStartButtonClicked$1$1.m1999run$lambda0(timerSettingsVM2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: run$lambda-0, reason: not valid java name */
    public static final void m1999run$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTimerStateField().set(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerState.Idle.INSTANCE);
    }
}
