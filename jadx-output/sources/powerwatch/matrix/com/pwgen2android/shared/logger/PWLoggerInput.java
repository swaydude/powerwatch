package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H&J$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;", "", "addLog", "", "pwLog", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "debug", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "tag", "error", "", "info", "warn", "wtfError", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface PWLoggerInput {
    void addLog(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pwLog);

    void debug(java.lang.String message, java.lang.Object tag);

    void error(java.lang.String message, java.lang.Object tag, java.lang.Throwable error);

    void info(java.lang.String message, java.lang.Object tag);

    void warn(java.lang.String message, java.lang.Object tag);

    void wtfError(java.lang.String message, java.lang.Object tag, java.lang.Throwable error);

    /* JADX INFO: compiled from: PWLoggerInput.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput pWLoggerInput, java.lang.String str, java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 4) != 0) {
                th = null;
            }
            pWLoggerInput.error(str, obj, th);
        }

        public static /* synthetic */ void wtfError$default(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput pWLoggerInput, java.lang.String str, java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: wtfError");
            }
            if ((i & 4) != 0) {
                th = null;
            }
            pWLoggerInput.wtfError(str, obj, th);
        }
    }
}
