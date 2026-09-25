package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: NetworkInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;", "", "()V", "Connected", "Disconnected", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class NetworkStatus {
    public /* synthetic */ NetworkStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: NetworkInfoProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Connected;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Connected extends powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Connected();

        private Connected() {
            super(null);
        }
    }

    private NetworkStatus() {
    }

    /* JADX INFO: compiled from: NetworkInfoProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus$Disconnected;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Disconnected extends powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus.Disconnected();

        private Disconnected() {
            super(null);
        }
    }
}
