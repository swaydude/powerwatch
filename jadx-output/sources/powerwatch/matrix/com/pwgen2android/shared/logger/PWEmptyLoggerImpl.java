package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWEmptyLoggerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;", "()V", "addLog", "", "pwLog", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "debug", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "tag", "", "error", "", "info", "logOutput", "Lio/reactivex/Observable;", "logLevels", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;", "warn", "wtfError", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class PWEmptyLoggerImpl implements powerwatch.matrix.com.pwgen2android.shared.logger.PWLogger {
    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void addLog(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pwLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pwLog, "pwLog");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void debug(java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void error(java.lang.String message, java.lang.Object tag, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void info(java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void warn(java.lang.String message, java.lang.Object tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput
    public void wtfError(java.lang.String message, java.lang.Object tag, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerOutput
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> logOutput(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel... logLevels) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevels, "logLevels");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> observableEmpty = io.reactivex.Observable.empty();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty()");
        return observableEmpty;
    }
}
