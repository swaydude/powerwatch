package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLogCollectorExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J4\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;", "", "clear", "", "collectedLogs", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "logLevels", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "tags", "", "destroy", "init", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface PWLogCollectorExtension {
    void clear();

    io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog>> collectedLogs(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel> logLevels, java.util.List<java.lang.String> tags);

    void destroy();

    void init();
}
