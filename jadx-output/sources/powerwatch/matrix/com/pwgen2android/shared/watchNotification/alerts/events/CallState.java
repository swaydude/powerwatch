package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events;

/* JADX INFO: compiled from: CallEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;", "", "(Ljava/lang/String;I)V", "IDLE", "RINGING", "MISSED", "ANSWERED", "CALL_ENDED", "DISMISSED", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum CallState {
    IDLE,
    RINGING,
    MISSED,
    ANSWERED,
    CALL_ENDED,
    DISMISSED;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState[] valuesCustom() {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState[] callStateArrValuesCustom = values();
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState[]) java.util.Arrays.copyOf(callStateArrValuesCustom, callStateArrValuesCustom.length);
    }
}
