package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: HeaderProcessState.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/HeaderProcessState;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;", "()V", "process", "Ljava/util/ArrayList;", "", "list", "payload", "nextIsEven", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HeaderProcessState extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State {
    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State
    public java.util.ArrayList<byte[]> process(java.util.ArrayList<byte[]> list, byte[] payload, boolean nextIsEven) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 20) {
            byte[] bArr = new byte[20];
            java.lang.System.arraycopy(payload, 0, bArr, 1, payload.length);
            bArr[0] = -1;
            java.util.Arrays.fill(bArr, payload.length + 1, 20, (byte) 0);
            list.add(bArr);
            return list;
        }
        byte[] bArr2 = new byte[19];
        java.lang.System.arraycopy(payload, 0, bArr2, 0, 19);
        list.add(prependData(bArr2, (byte) -1));
        int length = payload.length - 19;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(payload, 19, bArr3, 0, length);
        setNextState(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.OddProcessState());
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State nextState = getNextState();
        kotlin.jvm.internal.Intrinsics.checkNotNull(nextState);
        return nextState.process(list, bArr3, true);
    }
}
