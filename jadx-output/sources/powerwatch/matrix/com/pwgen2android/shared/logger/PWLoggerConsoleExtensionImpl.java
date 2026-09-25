package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerConsoleExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;", "loggerOutput", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;", "loggerConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "init", "listenFor", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "logDebug", "log", "logError", "logInfo", "logWTF", "logWarn", "prepareMessage", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWLoggerConsoleExtensionImpl implements powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput loggerOutput;

    public PWLoggerConsoleExtensionImpl(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput loggerOutput, powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerOutput, "loggerOutput");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerConfig, "loggerConfig");
        this.loggerOutput = loggerOutput;
        this.loggerConfig = loggerConfig;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension
    public void init() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.loggerConfig.getEnv(), powerwatch.matrix.com.pwgen2android.shared.logger.Env.PROD.INSTANCE)) {
            return;
        }
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerConsoleExtensionImpl$NzHFj4eM31xzX_JZqRI45nAKi7w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl.m3330init$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerConsoleExtensionImpl$K0XtshuouRBhcXtesDda1nPeofY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl.m3331init$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerConsoleExtensionImpl$eiqs7eiLp2SHQll3GHj6r_YlBG8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl.m3332init$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerConsoleExtensionImpl$uA2oz73pfwB-dfao4_0JC1f7Jts
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl.m3333init$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerConsoleExtensionImpl$Xu4Ma1x707kizzv6KV_h2RlCEgY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl.m3334init$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m3330init$lambda0(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logDebug(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final void m3331init$lambda1(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logInfo(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3332init$lambda2(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logWarn(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3333init$lambda3(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-4, reason: not valid java name */
    public static final void m3334init$lambda4(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl this$0, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.logWTF(it);
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel level) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> observableFilter = this.loggerOutput.logOutput(level).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerConsoleExtensionImpl$wYLOVnbby9Aa6nG1g3I8srGxz8s
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtensionImpl.m3336listenFor$lambda5((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "loggerOutput.logOutput(level).filter { it.tag != CloudInterceptLogger.CloudTag }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: listenFor$lambda-5, reason: not valid java name */
    public static final boolean m3336listenFor$lambda5(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getTag(), powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.CloudTag);
    }

    private final void logInfo(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog log) {
        android.util.Log.i("PWLogger", prepareMessage(log));
    }

    private final void logDebug(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog log) {
        android.util.Log.d("PWLogger", prepareMessage(log));
    }

    private final void logError(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog log) {
        android.util.Log.e("PWLogger", prepareMessage(log));
    }

    private final void logWarn(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog log) {
        android.util.Log.w("PWLogger", prepareMessage(log));
    }

    private final void logWTF(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog log) {
        android.util.Log.wtf("PWLogger", prepareMessage(log));
    }

    private final java.lang.String prepareMessage(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog log) {
        return "***********************" + log.getTag() + "***********************\n" + (log.getTimestamp() + " - " + log.getLogLevel().getLevelTag() + ": " + log.getMessage()) + "\n**********************************************";
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension
    public void destroy() {
        this.compositeDisposable.dispose();
    }
}
