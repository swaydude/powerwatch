package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: FinalProcessState.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/FinalProcessState;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/State;", "()V", "process", "Ljava/util/ArrayList;", "", "list", "payload", "nextIsEven", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FinalProcessState extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State {
    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.State
    public java.util.ArrayList<byte[]> process(java.util.ArrayList<byte[]> list, byte[] payload, boolean nextIsEven) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        byte[] bArr = new byte[20];
        if (payload.length <= 19) {
            java.lang.System.arraycopy(payload, 0, bArr, 1, payload.length);
            bArr[0] = -4;
            java.util.Arrays.fill(bArr, payload.length + 1, 20, (byte) 0);
            list.add(bArr);
        }
        return list;
    }
}
