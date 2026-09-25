package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: DeviceEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0016\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0016\u001d\u001e\u001f !\"#$%&'()*+,-./012¨\u00063"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTIVITY_IN_PROGRESS", "ACTIVITY_LOG_WRONG_INDEX", "BACKGROUND_LOG_SIZE_MISMATCH", "BACKGROUND_LOG_UNKNOWN_TYPE", "COMMUNICATION_TIMEOUT", "CONNECTION_FAILURE", "DATA_UPLOAD_FAILED", "DELTA_ACTIVITY_LOG_SIZE_MISMATCH", "DEVICE_DISCONNECTED", "DEVICE_NOT_APPEARED", "DEVICE_NOT_FOUND", "DOWNLOAD_FILE_FAILED", "END_ACTIVITY_LOG_SIZE_MISMATCH", "FILE_TRANSFER_FAILED", "INVALID_RTL_INDEX", "MANDATORY_UPDATE", "OTA_DEVICE_DISCONNECTED", "START_ACTIVITY_LOG_SIZE_MISMATCH", "SUCCESS", "UNKNOWN", "VERSION_MISMATCH", "WATCH_BUSY", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$COMMUNICATION_TIMEOUT;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$MANDATORY_UPDATE;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$WATCH_BUSY;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_DISCONNECTED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$ACTIVITY_IN_PROGRESS;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$START_ACTIVITY_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DELTA_ACTIVITY_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$END_ACTIVITY_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$INVALID_RTL_INDEX;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_UNKNOWN_TYPE;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$ACTIVITY_LOG_WRONG_INDEX;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DATA_UPLOAD_FAILED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DOWNLOAD_FILE_FAILED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$FILE_TRANSFER_FAILED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_APPEARED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$VERSION_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$OTA_DEVICE_DISCONNECTED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_FOUND;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$CONNECTION_FAILURE;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DeviceEventStatus {
    private final java.lang.String value;

    public /* synthetic */ DeviceEventStatus(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SUCCESS extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.SUCCESS INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.SUCCESS();

        private SUCCESS() {
            super("SUCCESS", null);
        }
    }

    private DeviceEventStatus(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$UNKNOWN;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UNKNOWN extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public UNKNOWN() {
            super("UNKNOWN", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$COMMUNICATION_TIMEOUT;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class COMMUNICATION_TIMEOUT extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.COMMUNICATION_TIMEOUT INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.COMMUNICATION_TIMEOUT();

        private COMMUNICATION_TIMEOUT() {
            super("COMMUNICATION_TIMEOUT", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$MANDATORY_UPDATE;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class MANDATORY_UPDATE extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.MANDATORY_UPDATE INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.MANDATORY_UPDATE();

        private MANDATORY_UPDATE() {
            super("MANDATORY_UPDATE", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$WATCH_BUSY;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WATCH_BUSY extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.WATCH_BUSY INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.WATCH_BUSY();

        private WATCH_BUSY() {
            super("WATCH_BUSY", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_DISCONNECTED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DEVICE_DISCONNECTED extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_DISCONNECTED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_DISCONNECTED();

        private DEVICE_DISCONNECTED() {
            super("DEVICE_DISCONNECTED", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$ACTIVITY_IN_PROGRESS;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_IN_PROGRESS extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.ACTIVITY_IN_PROGRESS INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.ACTIVITY_IN_PROGRESS();

        private ACTIVITY_IN_PROGRESS() {
            super("ACTIVITY_IN_PROGRESS", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$START_ACTIVITY_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class START_ACTIVITY_LOG_SIZE_MISMATCH extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.START_ACTIVITY_LOG_SIZE_MISMATCH INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.START_ACTIVITY_LOG_SIZE_MISMATCH();

        private START_ACTIVITY_LOG_SIZE_MISMATCH() {
            super("START_ACTIVITY_LOG_SIZE_MISMATCH", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DELTA_ACTIVITY_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DELTA_ACTIVITY_LOG_SIZE_MISMATCH extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DELTA_ACTIVITY_LOG_SIZE_MISMATCH INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DELTA_ACTIVITY_LOG_SIZE_MISMATCH();

        private DELTA_ACTIVITY_LOG_SIZE_MISMATCH() {
            super("DELTA_ACTIVITY_LOG_SIZE_MISMATCH", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$END_ACTIVITY_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class END_ACTIVITY_LOG_SIZE_MISMATCH extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.END_ACTIVITY_LOG_SIZE_MISMATCH INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.END_ACTIVITY_LOG_SIZE_MISMATCH();

        private END_ACTIVITY_LOG_SIZE_MISMATCH() {
            super("END_ACTIVITY_LOG_SIZE_MISMATCH", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_SIZE_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BACKGROUND_LOG_SIZE_MISMATCH extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.BACKGROUND_LOG_SIZE_MISMATCH INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.BACKGROUND_LOG_SIZE_MISMATCH();

        private BACKGROUND_LOG_SIZE_MISMATCH() {
            super("BACKGROUND_LOG_SIZE_MISMATCH", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$INVALID_RTL_INDEX;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class INVALID_RTL_INDEX extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.INVALID_RTL_INDEX INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.INVALID_RTL_INDEX();

        private INVALID_RTL_INDEX() {
            super("INVALID_RTL_INDEX", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$BACKGROUND_LOG_UNKNOWN_TYPE;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BACKGROUND_LOG_UNKNOWN_TYPE extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.BACKGROUND_LOG_UNKNOWN_TYPE INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.BACKGROUND_LOG_UNKNOWN_TYPE();

        private BACKGROUND_LOG_UNKNOWN_TYPE() {
            super("BACKGROUND_LOG_UNKNOWN_TYPE", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$ACTIVITY_LOG_WRONG_INDEX;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ACTIVITY_LOG_WRONG_INDEX extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.ACTIVITY_LOG_WRONG_INDEX INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.ACTIVITY_LOG_WRONG_INDEX();

        private ACTIVITY_LOG_WRONG_INDEX() {
            super("ACTIVITY_LOG_WRONG_INDEX", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DATA_UPLOAD_FAILED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DATA_UPLOAD_FAILED extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DATA_UPLOAD_FAILED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DATA_UPLOAD_FAILED();

        private DATA_UPLOAD_FAILED() {
            super("DATA_UPLOAD_FAILED", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DOWNLOAD_FILE_FAILED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DOWNLOAD_FILE_FAILED extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DOWNLOAD_FILE_FAILED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DOWNLOAD_FILE_FAILED();

        private DOWNLOAD_FILE_FAILED() {
            super("DOWNLOAD_FILE_FAILED", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$FILE_TRANSFER_FAILED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FILE_TRANSFER_FAILED extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.FILE_TRANSFER_FAILED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.FILE_TRANSFER_FAILED();

        private FILE_TRANSFER_FAILED() {
            super("FILE_TRANSFER_FAILED", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_APPEARED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DEVICE_NOT_APPEARED extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_APPEARED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_APPEARED();

        private DEVICE_NOT_APPEARED() {
            super("DEVICE_NOT_APPEARED", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$VERSION_MISMATCH;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class VERSION_MISMATCH extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.VERSION_MISMATCH INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.VERSION_MISMATCH();

        private VERSION_MISMATCH() {
            super("VERSION_MISMATCH", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$OTA_DEVICE_DISCONNECTED;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OTA_DEVICE_DISCONNECTED extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.OTA_DEVICE_DISCONNECTED INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.OTA_DEVICE_DISCONNECTED();

        private OTA_DEVICE_DISCONNECTED() {
            super("OTA_DEVICE_DISCONNECTED", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_FOUND;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DEVICE_NOT_FOUND extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_FOUND INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.DEVICE_NOT_FOUND();

        private DEVICE_NOT_FOUND() {
            super("DEVICE_NOT_FOUND", null);
        }
    }

    /* JADX INFO: compiled from: DeviceEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$CONNECTION_FAILURE;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CONNECTION_FAILURE extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.CONNECTION_FAILURE INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus.CONNECTION_FAILURE();

        private CONNECTION_FAILURE() {
            super("CONNECTION_FAILURE", null);
        }
    }
}
