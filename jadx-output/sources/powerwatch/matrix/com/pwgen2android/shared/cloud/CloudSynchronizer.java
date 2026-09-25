package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0014\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0014\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;", "", "hasActivitySessionsToSync", "", "hasBackgroundLogsToSync", "hasDataToSync", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;", "syncAllDataToCloud", "Lio/reactivex/Completable;", "scheduleTime", "Ljava/util/concurrent/TimeUnit;", "syncData", "", "syncWatchLogsToCloud", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface CloudSynchronizer {
    boolean hasActivitySessionsToSync();

    boolean hasBackgroundLogsToSync();

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo> hasDataToSync();

    io.reactivex.Completable syncAllDataToCloud(java.util.concurrent.TimeUnit scheduleTime);

    void syncData();

    io.reactivex.Completable syncWatchLogsToCloud(java.util.concurrent.TimeUnit scheduleTime);

    /* JADX INFO: compiled from: CloudSynchronizer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Completable syncAllDataToCloud$default(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer, java.util.concurrent.TimeUnit timeUnit, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncAllDataToCloud");
            }
            if ((i & 1) != 0) {
                timeUnit = null;
            }
            return cloudSynchronizer.syncAllDataToCloud(timeUnit);
        }

        public static /* synthetic */ io.reactivex.Completable syncWatchLogsToCloud$default(powerwatch.matrix.com.pwgen2android.shared.cloud.CloudSynchronizer cloudSynchronizer, java.util.concurrent.TimeUnit timeUnit, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncWatchLogsToCloud");
            }
            if ((i & 1) != 0) {
                timeUnit = null;
            }
            return cloudSynchronizer.syncWatchLogsToCloud(timeUnit);
        }
    }
}
