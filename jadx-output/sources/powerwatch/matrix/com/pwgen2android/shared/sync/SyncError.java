package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "", "errorDesc", "", "(Ljava/lang/String;)V", "ActivityInProgress", "DeviceNotConnected", "SyncParsingError", "SyncTimeoutError", "Unknown", "WatchBusy", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class SyncError extends java.lang.Throwable {
    public /* synthetic */ SyncError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$DeviceNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DeviceNotConnected extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncError {
        public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.DeviceNotConnected();

        private DeviceNotConnected() {
            super("Device Not Connected Sync Error", null);
        }
    }

    private SyncError(java.lang.String str) {
        super(str);
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$ActivityInProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActivityInProgress extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncError {
        public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.ActivityInProgress();

        private ActivityInProgress() {
            super("Activity In Progress Sync Error", null);
        }
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$WatchBusy;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WatchBusy extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncError {
        public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.WatchBusy();

        private WatchBusy() {
            super("Watch Busy Sync Error", null);
        }
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncParsingError;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "code", "", "(I)V", "getCode", "()I", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncParsingError extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncError {
        private final int code;

        public SyncParsingError(int i) {
            super("Data parsing error occurred.", null);
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$SyncTimeoutError;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncTimeoutError extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncError {
        public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.SyncTimeoutError();

        private SyncTimeoutError() {
            super("Watch timeout error", null);
        }
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncError {
        public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncError.Unknown();

        private Unknown() {
            super("Unknown Error Occurred", null);
        }
    }
}
