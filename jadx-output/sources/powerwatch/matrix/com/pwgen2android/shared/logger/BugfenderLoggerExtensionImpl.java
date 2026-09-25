package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: BugfenderLoggerExtenstion.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtensionImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtension;", "loggerOutput", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;", "loggerConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "init", "", "listenFor", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BugfenderLoggerExtensionImpl implements powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput loggerOutput;

    public BugfenderLoggerExtensionImpl(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput loggerOutput, powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerOutput, "loggerOutput");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerConfig, "loggerConfig");
        this.loggerOutput = loggerOutput;
        this.loggerConfig = loggerConfig;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel level) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> observableFilter = this.loggerOutput.logOutput(level).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$BugfenderLoggerExtensionImpl$h4liNCtCesdd9G25S_dN_rJINjM
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl.m3324listenFor$lambda0((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "loggerOutput.logOutput(level).filter { it.tag != INTERNAL_TAG }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: listenFor$lambda-0, reason: not valid java name */
    public static final boolean m3324listenFor$lambda0(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getTag(), powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.getINTERNAL_TAG());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension
    public void init() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "Manufacturer: %s, Android: %s (%s); %s,OS: %s, %s", java.util.Arrays.copyOf(new java.lang.Object[]{android.os.Build.MANUFACTURER, powerwatch.matrix.com.pwgen2android.BuildConfig.VERSION_NAME, java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.BuildConfig.VERSION_CODE), android.os.Build.MODEL, android.os.Build.VERSION.RELEASE, android.os.Build.DEVICE}, 6));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        com.bugfender.sdk.Bugfender.d("DEVICE_INFO", str);
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$BugfenderLoggerExtensionImpl$xJADfxGHBcwUk8E3MORNPJj4bfo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl.m3318init$lambda1((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$BugfenderLoggerExtensionImpl$jqeHEp6yAiV5CJ5Aq2vPRxN6Rs0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl.m3319init$lambda2((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$BugfenderLoggerExtensionImpl$xvoT60D0NdjYwesRROu_08XTygQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl.m3320init$lambda3((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$BugfenderLoggerExtensionImpl$kZ8DDGQvbZmA3hdzwOctkoSRR4I
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl.m3321init$lambda4((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
        this.compositeDisposable.add(listenFor(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$BugfenderLoggerExtensionImpl$a5gJpez-nSv5IcFmYQWwfuAt3us
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtensionImpl.m3322init$lambda5((powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-1, reason: not valid java name */
    public static final void m3318init$lambda1(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog) {
        com.bugfender.sdk.Bugfender.d(pWLog.getTag(), pWLog.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3319init$lambda2(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog) {
        com.bugfender.sdk.Bugfender.i(pWLog.getTag(), pWLog.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3320init$lambda3(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog) {
        com.bugfender.sdk.Bugfender.w(pWLog.getTag(), pWLog.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-4, reason: not valid java name */
    public static final void m3321init$lambda4(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog) {
        com.bugfender.sdk.Bugfender.e(pWLog.getTag(), pWLog.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-5, reason: not valid java name */
    public static final void m3322init$lambda5(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog) {
        com.bugfender.sdk.Bugfender.e(pWLog.getTag(), pWLog.getMessage());
    }
}
