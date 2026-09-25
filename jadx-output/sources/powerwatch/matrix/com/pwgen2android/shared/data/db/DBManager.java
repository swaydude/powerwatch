package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: DBManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;", "", "clearAllData", "", "clearAllDataCompletable", "Lio/reactivex/Completable;", "clearBackgroundAndActivityLogs", "clearBackgroundAndActivityLogsCompletable", "clearDevices", "clearDevicesCompletable", "clearGoalConfigurations", "clearGoalConfigurationsCompletable", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DBManager {
    void clearAllData();

    io.reactivex.Completable clearAllDataCompletable();

    void clearBackgroundAndActivityLogs();

    io.reactivex.Completable clearBackgroundAndActivityLogsCompletable();

    void clearDevices();

    io.reactivex.Completable clearDevicesCompletable();

    void clearGoalConfigurations();

    io.reactivex.Completable clearGoalConfigurationsCompletable();
}
