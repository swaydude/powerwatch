package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: ReportIssueViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "ScreenshotsRequest", "SendLogsRequest", "SendLogsResponse", "SendUserEnvResponse", "WebLogRequest", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$SendLogsRequest;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$SendLogsResponse;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$ScreenshotsRequest;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$SendUserEnvResponse;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class EnvelopeTypes {
    private final java.lang.String type;

    public /* synthetic */ EnvelopeTypes(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$SendLogsRequest;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SendLogsRequest extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendLogsRequest INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendLogsRequest();

        private SendLogsRequest() {
            super("SEND_LOGS_REQUEST", null);
        }
    }

    private EnvelopeTypes(java.lang.String str) {
        this.type = str;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$SendLogsResponse;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SendLogsResponse extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendLogsResponse INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendLogsResponse();

        private SendLogsResponse() {
            super("SEND_LOGS_RESPONSE", null);
        }
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$ScreenshotsRequest;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ScreenshotsRequest extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.ScreenshotsRequest INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.ScreenshotsRequest();

        private ScreenshotsRequest() {
            super("ADD_SCREENSHOTS_REQUEST", null);
        }
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WebLogRequest extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.WebLogRequest INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.WebLogRequest();

        private WebLogRequest() {
            super("WEB_LOG_REQUEST", null);
        }
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$SendUserEnvResponse;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SendUserEnvResponse extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendUserEnvResponse INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.SendUserEnvResponse();

        private SendUserEnvResponse() {
            super("USER_ENV_RESPONSE", null);
        }
    }
}
