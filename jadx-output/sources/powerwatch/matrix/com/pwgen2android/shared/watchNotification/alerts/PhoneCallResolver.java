package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: PhoneCallResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;", "", "()V", "callEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;", "lastCallState", "", "getEvent", "state", "time", "", "callerName", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PhoneCallResolver {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent(null, null, null, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.IDLE, 0, 0, 0, "", false, 279, null);
    private int lastCallState;

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent getEvent(int state, long time, java.lang.String callerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerName, "callerName");
        int i = this.lastCallState;
        if (i == state) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = this.callEvent;
            return callEvent.copy((511 & 1) != 0 ? callEvent.getTitle() : null, (511 & 2) != 0 ? callEvent.getSubTitle() : null, (511 & 4) != 0 ? callEvent.getAppPackageName() : null, (511 & 8) != 0 ? callEvent.callState : null, (511 & 16) != 0 ? callEvent.getId() : 0, (511 & 32) != 0 ? callEvent.getPostTimestamp() : 0L, (511 & 64) != 0 ? callEvent.getNotificationTimestamp() : 0L, (511 & 128) != 0 ? callEvent.getText() : null, (511 & 256) != 0 ? callEvent.isVoip : false);
        }
        if (state != 0) {
            if (state == 1) {
                this.callEvent.setCallState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING);
            } else if (state == 2 && i == 1) {
                this.callEvent.setCallState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.ANSWERED);
            }
        } else if (i == 1) {
            this.callEvent.setCallState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED);
        } else if (i == 2) {
            this.callEvent.setCallState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.CALL_ENDED);
        }
        this.lastCallState = state;
        if (this.callEvent.getCallState() == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING || this.callEvent.getCallState() == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.ANSWERED) {
            return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent(callerName, null, null, this.callEvent.getCallState(), 0, time, time, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.getIncomingCallString(), false, 278, null);
        }
        if (this.callEvent.getCallState() == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED) {
            return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent(callerName, null, null, this.callEvent.getCallState(), 0, time, time, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.getMissedCallString(), false, 278, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent2 = this.callEvent;
        return callEvent2.copy((511 & 1) != 0 ? callEvent2.getTitle() : null, (511 & 2) != 0 ? callEvent2.getSubTitle() : null, (511 & 4) != 0 ? callEvent2.getAppPackageName() : null, (511 & 8) != 0 ? callEvent2.callState : null, (511 & 16) != 0 ? callEvent2.getId() : 0, (511 & 32) != 0 ? callEvent2.getPostTimestamp() : 0L, (511 & 64) != 0 ? callEvent2.getNotificationTimestamp() : 0L, (511 & 128) != 0 ? callEvent2.getText() : null, (511 & 256) != 0 ? callEvent2.isVoip : false);
    }
}
