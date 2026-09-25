package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;", "", "logOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "logLevels", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "([Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;)Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface PWLoggerOutput {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.logger.PWLog> logOutput(powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel... logLevels);
}
