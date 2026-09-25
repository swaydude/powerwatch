package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent;", "", "()V", "SyncFinishedEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class SyncEvent {
    public /* synthetic */ SyncEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncFinishedEvent extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent {
        public static final powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.sync.SyncEvent.SyncFinishedEvent();

        private SyncFinishedEvent() {
            super(null);
        }
    }

    private SyncEvent() {
    }
}
