package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH&J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J$\u0010\u0011\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00120\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizer;", "", "syncInProgress", "", "getSyncInProgress", "()Z", "setSyncInProgress", "(Z)V", "formattedDataOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;", "gpsTransferOutput", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", "startSync", "", "syncConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;", "syncOutput", "Lkotlin/Triple;", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface WatchSynchronizer {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent> formattedDataOutput();

    boolean getSyncInProgress();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult> gpsTransferOutput();

    void setSyncInProgress(boolean z);

    void startSync(powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig);

    io.reactivex.Observable<kotlin.Triple<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo, java.lang.Throwable>> syncOutput();

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void startSync$default(powerwatch.matrix.com.pwgen2android.shared.sync.WatchSynchronizer watchSynchronizer, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSync");
            }
            if ((i & 1) != 0) {
                syncConfig = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig(false, null, null, false, false, 31, null);
            }
            watchSynchronizer.startSync(syncConfig);
        }
    }
}
