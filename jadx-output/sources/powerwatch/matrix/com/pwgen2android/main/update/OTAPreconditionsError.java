package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError;", "", "()V", "BluetoothNotEnabled", "DeviceNotConnected", "NetworkNotConnected", "Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$BluetoothNotEnabled;", "Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$DeviceNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$NetworkNotConnected;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class OTAPreconditionsError extends java.lang.Throwable {
    public /* synthetic */ OTAPreconditionsError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: FirmwareAvailableViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$BluetoothNotEnabled;", "Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BluetoothNotEnabled extends powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError {
        public static final powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.BluetoothNotEnabled INSTANCE = new powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.BluetoothNotEnabled();

        private BluetoothNotEnabled() {
            super(null);
        }
    }

    private OTAPreconditionsError() {
    }

    /* JADX INFO: compiled from: FirmwareAvailableViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$DeviceNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DeviceNotConnected extends powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError {
        public static final powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.DeviceNotConnected INSTANCE = new powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.DeviceNotConnected();

        private DeviceNotConnected() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FirmwareAvailableViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError$NetworkNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/main/update/OTAPreconditionsError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NetworkNotConnected extends powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError {
        public static final powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.NetworkNotConnected INSTANCE = new powerwatch.matrix.com.pwgen2android.main.update.OTAPreconditionsError.NetworkNotConnected();

        private NetworkNotConnected() {
            super(null);
        }
    }
}
