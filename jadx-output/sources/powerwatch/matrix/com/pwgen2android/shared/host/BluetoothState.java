package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: BluetoothManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;", "", "()V", "Disabled", "Enabled", "Unknown", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Unknown;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BluetoothState {
    public /* synthetic */ BluetoothState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: BluetoothManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Enabled extends powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled();

        private Enabled() {
            super(null);
        }
    }

    private BluetoothState() {
    }

    /* JADX INFO: compiled from: BluetoothManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Disabled extends powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled();

        private Disabled() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BluetoothManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Unknown INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Unknown();

        private Unknown() {
            super(null);
        }
    }
}
