package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: ReportIssueViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;", "", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Companion", "LOGS", "SCREENSHOT", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$LOGS;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$SCREENSHOT;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AttachmentType {
    public static final java.lang.String key = "attachmentType";
    private final java.lang.String type;

    public /* synthetic */ AttachmentType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AttachmentType(java.lang.String str) {
        this.type = str;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$LOGS;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LOGS extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.LOGS INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.LOGS();

        private LOGS() {
            super("LOG", null);
        }
    }

    /* JADX INFO: compiled from: ReportIssueViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType$SCREENSHOT;", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AttachmentType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SCREENSHOT extends powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType {
        public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.SCREENSHOT INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AttachmentType.SCREENSHOT();

        private SCREENSHOT() {
            super("SCREENSHOT", null);
        }
    }
}
