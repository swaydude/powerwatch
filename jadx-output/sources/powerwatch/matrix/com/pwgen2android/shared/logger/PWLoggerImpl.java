package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;", "loggerConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V", "loggerSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "kotlin.jvm.PlatformType", "addLog", "", "pwLog", "debug", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "tag", "", "error", "", "info", "logOutput", "Lio/reactivex/Observable;", "logLevels", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;", "warn", "wtfError", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PWLoggerImpl implements powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger {
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> loggerSubject;

    public PWLoggerImpl(powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerConfig, "loggerConfig");
        this.loggerConfig = loggerConfig;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<PWLog>()");
        this.loggerSubject = publishSubjectCreate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void info(java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.lang.String strCreateTag = powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.createTag(tag);
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> publishSubject = this.loggerSubject;
        powerwatch.matrix.com.pwgen2android.shared.logger.Env env = this.loggerConfig.getEnv();
        publishSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(message, strCreateTag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateString(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())), env));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void warn(java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.lang.String strCreateTag = powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.createTag(tag);
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> publishSubject = this.loggerSubject;
        powerwatch.matrix.com.pwgen2android.shared.logger.Env env = this.loggerConfig.getEnv();
        publishSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(message, strCreateTag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateString(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())), env));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void error(java.lang.String message, java.lang.Object tag, java.lang.Throwable error) {
        java.lang.String message2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.lang.String strCreateTag = powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.createTag(tag);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message);
        sb.append('\n');
        java.lang.String str = "";
        if (error != null && (message2 = error.getMessage()) != null) {
            str = message2;
        }
        sb.append(str);
        java.lang.String string = sb.toString();
        this.loggerSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(string, strCreateTag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateString(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())), this.loggerConfig.getEnv()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void wtfError(java.lang.String message, java.lang.Object tag, java.lang.Throwable error) {
        java.lang.String message2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.lang.String strCreateTag = powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.createTag(tag);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message);
        sb.append('\n');
        java.lang.String str = "";
        if (error != null && (message2 = error.getMessage()) != null) {
            str = message2;
        }
        sb.append(str);
        java.lang.String string = sb.toString();
        this.loggerSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(string, strCreateTag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateString(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())), this.loggerConfig.getEnv()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void addLog(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pwLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwLog, "pwLog");
        this.loggerSubject.onNext(pwLog);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void debug(java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        java.lang.String strCreateTag = powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.createTag(tag);
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> publishSubject = this.loggerSubject;
        powerwatch.matrix.com.pwgen2android.shared.logger.Env env = this.loggerConfig.getEnv();
        publishSubject.onNext(new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(message, strCreateTag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateString(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())), env));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> logOutput(final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel... logLevels) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevels, "logLevels");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> observableFilter = this.loggerSubject.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.logger.-$$Lambda$PWLoggerImpl$-Q9VlzpakbVqbRP5P2sw4016314
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerImpl.m3338logOutput$lambda1(logLevels, (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "loggerSubject\n                .filter { pwLog ->\n                    if (logLevels.isEmpty()) return@filter true\n                    !logLevels.none {\n                        it == pwLog.logLevel\n                    }\n                }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logOutput$lambda-1, reason: not valid java name */
    public static final boolean m3338logOutput$lambda1(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel[] logLevels, powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pwLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevels, "$logLevels");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwLog, "pwLog");
        boolean z = false;
        if (logLevels.length == 0) {
            return true;
        }
        for (powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel : logLevels) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(logLevel, pwLog.getLogLevel())) {
                return !z;
            }
        }
        z = true;
        return !z;
    }
}
