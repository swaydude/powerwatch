package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAError;", "", "desc", "", "(Ljava/lang/String;)V", "DeviceNotAppeared", "DeviceNotConnected", "FileDownload", "FileTransferInterrupted", "VersionMismatch", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotAppeared;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError$VersionMismatch;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileTransferInterrupted;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class OTAError extends java.lang.Throwable {
    public /* synthetic */ OTAError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotConnected;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DeviceNotConnected extends powerwatch.matrix.com.pwgen2android.main.OTAError {
        public DeviceNotConnected() {
            super("Device is not connected.", null);
        }
    }

    private OTAError(java.lang.String str) {
        super(str);
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAError$DeviceNotAppeared;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DeviceNotAppeared extends powerwatch.matrix.com.pwgen2android.main.OTAError {
        public DeviceNotAppeared() {
            super("Device Not Appeared", null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileDownload;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError;", "details", "", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FileDownload extends powerwatch.matrix.com.pwgen2android.main.OTAError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileDownload(java.lang.String details) {
            super(details, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAError$VersionMismatch;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class VersionMismatch extends powerwatch.matrix.com.pwgen2android.main.OTAError {
        public VersionMismatch() {
            super("Firmware Version Mismatch", null);
        }
    }

    /* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAError$FileTransferInterrupted;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAError;", "details", "", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FileTransferInterrupted extends powerwatch.matrix.com.pwgen2android.main.OTAError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileTransferInterrupted(java.lang.String details) {
            super(details, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "details");
        }
    }
}
