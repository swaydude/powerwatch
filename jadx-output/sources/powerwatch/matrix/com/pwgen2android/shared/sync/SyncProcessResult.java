package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", "", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "error", "", "(ILjava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getProgress", "()I", "AGPSProgress", "FontUpdateProgress", "SyncProgress", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class SyncProcessResult {
    private final java.lang.Throwable error;
    private final int progress;

    public /* synthetic */ SyncProcessResult(int i, java.lang.Throwable th, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, th);
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$SyncProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "error", "", "isAGPSNeeded", "", "(ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;Z)V", "getDataInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "()Z", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncProgress extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult {
        private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo;
        private final boolean isAGPSNeeded;

        public SyncProgress(int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.lang.Throwable th, boolean z) {
            super(i, th, null);
            this.dataInfo = dataInfo;
            this.isAGPSNeeded = z;
        }

        public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
            return this.dataInfo;
        }

        /* JADX INFO: renamed from: isAGPSNeeded, reason: from getter */
        public final boolean getIsAGPSNeeded() {
            return this.isAGPSNeeded;
        }
    }

    private SyncProcessResult(int i, java.lang.Throwable th) {
        this.progress = i;
        this.error = th;
    }

    public final java.lang.Throwable getError() {
        return this.error;
    }

    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$AGPSProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "started", "", "completed", "error", "", "(IZZLjava/lang/Throwable;)V", "getCompleted", "()Z", "getStarted", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class AGPSProgress extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult {
        private final boolean completed;
        private final boolean started;

        public AGPSProgress(int i, boolean z, boolean z2, java.lang.Throwable th) {
            super(i, th, null);
            this.started = z;
            this.completed = z2;
        }

        public /* synthetic */ AGPSProgress(int i, boolean z, boolean z2, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : th);
        }

        public final boolean getCompleted() {
            return this.completed;
        }

        public final boolean getStarted() {
            return this.started;
        }
    }

    /* JADX INFO: compiled from: WatchSynchronizer.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult$FontUpdateProgress;", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncProcessResult;", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "started", "", "completed", "error", "", "(IZZLjava/lang/Throwable;)V", "getCompleted", "()Z", "getStarted", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FontUpdateProgress extends powerwatch.matrix.com.pwgen2android.shared.sync.SyncProcessResult {
        private final boolean completed;
        private final boolean started;

        public FontUpdateProgress(int i, boolean z, boolean z2, java.lang.Throwable th) {
            super(i, th, null);
            this.started = z;
            this.completed = z2;
        }

        public /* synthetic */ FontUpdateProgress(int i, boolean z, boolean z2, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : th);
        }

        public final boolean getCompleted() {
            return this.completed;
        }

        public final boolean getStarted() {
            return this.started;
        }
    }
}
