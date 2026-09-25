package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: AppBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;", "", "destroy", "", "messageOutput", "Lio/reactivex/Observable;", "", "sendMessage", "Lio/reactivex/Completable;", "data", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AppBridge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.Companion INSTANCE = powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.Companion.$$INSTANCE;
    public static final java.lang.String INJECTED_VARIABLE = "android";
    public static final java.lang.String NATIVE_INTERFACE = "androidWrapper";
    public static final java.lang.String UI_INTERFACE = "bridge";

    void destroy();

    io.reactivex.Observable<java.lang.String> messageOutput();

    io.reactivex.Completable sendMessage(java.lang.String data);

    /* JADX INFO: compiled from: AppBridge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge$Companion;", "", "()V", "INJECTED_VARIABLE", "", "NATIVE_INTERFACE", "UI_INTERFACE", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.Companion $$INSTANCE = new powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge.Companion();
        public static final java.lang.String INJECTED_VARIABLE = "android";
        public static final java.lang.String NATIVE_INTERFACE = "androidWrapper";
        public static final java.lang.String UI_INTERFACE = "bridge";

        private Companion() {
        }
    }
}
