package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError;", "", "desc", "", "(Ljava/lang/String;)V", "AckResentControlPackage", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError$AckResentControlPackage;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ControlPackageResendError extends java.lang.Throwable {
    public /* synthetic */ ControlPackageResendError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: Gen2Executor.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError$AckResentControlPackage;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ControlPackageResendError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AckResentControlPackage extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ControlPackageResendError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ControlPackageResendError.AckResentControlPackage INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ControlPackageResendError.AckResentControlPackage();

        private AckResentControlPackage() {
            super("ACK resend control package error", null);
        }
    }

    private ControlPackageResendError(java.lang.String str) {
        super(str);
    }
}
