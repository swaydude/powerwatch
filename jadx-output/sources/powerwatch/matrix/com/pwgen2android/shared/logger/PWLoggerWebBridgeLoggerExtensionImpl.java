package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: WebBridgeLoggerExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtension;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "gson", "Lcom/google/gson/Gson;", "bridge", "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;", "logger", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;", "(Lcom/google/gson/Gson;Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "init", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWLoggerWebBridgeLoggerExtensionImpl implements powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge bridge;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final com.google.gson.Gson gson;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger logger;

    public PWLoggerWebBridgeLoggerExtensionImpl(com.google.gson.Gson gson, powerwatch.matrix.com.pwgen2android.report.ui.bridge.AppBridge bridge, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "gson");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bridge, "bridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.gson = gson;
        this.bridge = bridge;
        this.logger = logger;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension
    public void init() {
        this.compositeDisposable.add(this.bridge.messageOutput().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$SA2SGwIze9cBOE01xxvwBMlwbkM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl.m3344init$lambda0(this.f$0, (java.lang.String) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl.m3345init$lambda1((powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl.m3346init$lambda2((powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$izQWFFr_0dn0POhDgHrlv4bccb8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl.m3347init$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope m3344init$lambda0(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) this$0.gson.fromJson(it, powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final boolean m3345init$lambda1(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(it.getEnvelopeType(), powerwatch.matrix.com.pwgen2android.report.ui.bridge.EnvelopeTypes.WebLogRequest.INSTANCE.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLog m3346init$lambda2(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope it) {
        powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF wtf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.WebLog webLog = (powerwatch.matrix.com.pwgen2android.shared.logger.WebLog) it.extractPayload();
        kotlin.jvm.internal.Intrinsics.checkNotNull(webLog);
        powerwatch.matrix.com.pwgen2android.shared.logger.Env env = kotlin.jvm.internal.Intrinsics.areEqual(webLog.getEnv(), "prod") ? powerwatch.matrix.com.pwgen2android.shared.logger.Env.PROD.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.logger.Env.DEV.INSTANCE;
        switch (webLog.getLevel()) {
            case "info":
                wtf = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE;
                break;
            case "debug":
                wtf = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE;
                break;
            case "error":
                wtf = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE;
                break;
            case "warning":
                wtf = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE;
                break;
            default:
                wtf = powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE;
                break;
        }
        return new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(webLog.getMessage(), webLog.getTag(), wtf, webLog.getTimestamp(), env);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3347init$lambda3(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger pWLogger = this$0.logger;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        pWLogger.addLog(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerWebBridgeLoggerExtension
    public void destroy() {
        this.compositeDisposable.dispose();
    }
}
