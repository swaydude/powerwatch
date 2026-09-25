package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0004J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;", "", "()V", "nextState", "getNextState", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;", "setNextState", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;)V", "prependData", "", "data", "headerByte", "", "process", "Ljava/util/ArrayList;", "list", "payload", "nextIsEven", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class State {
    private powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State nextState;

    public abstract java.util.ArrayList<byte[]> process(java.util.ArrayList<byte[]> list, byte[] payload, boolean nextIsEven);

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State getNextState() {
        return this.nextState;
    }

    public final void setNextState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State state) {
        this.nextState = state;
    }

    protected final byte[] prependData(byte[] data, byte headerByte) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = new byte[20];
        java.lang.System.arraycopy(data, 0, bArr, 1, data.length);
        bArr[0] = headerByte;
        return bArr;
    }
}
