package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: StateController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/StateController;", "", "()V", "startState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;", "process", "Ljava/util/ArrayList;", "", "data", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StateController {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State startState = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.HeaderProcessState();

    public final java.util.ArrayList<byte[]> process(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this.startState.process(new java.util.ArrayList<>(), data, true);
    }
}
