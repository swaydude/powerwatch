package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;", "", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "", "syncConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "throwable", "", "(ILpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/lang/Throwable;)V", "getDataInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "getProgress", "()I", "getSyncConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncConfig;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SyncInternalResult {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo;
    private final int progress;
    private final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig;
    private final java.lang.Throwable throwable;

    public SyncInternalResult() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult copy$default(powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncInternalResult, int i, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = syncInternalResult.progress;
        }
        if ((i2 & 2) != 0) {
            syncConfig = syncInternalResult.syncConfig;
        }
        if ((i2 & 4) != 0) {
            dataInfo = syncInternalResult.dataInfo;
        }
        if ((i2 & 8) != 0) {
            th = syncInternalResult.throwable;
        }
        return syncInternalResult.copy(i, syncConfig, dataInfo, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
        return this.dataInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult copy(int progress, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfig, "syncConfig");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult(progress, syncConfig, dataInfo, throwable);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult syncInternalResult = (powerwatch.matrix.com.pwgen2android.shared.sync.SyncInternalResult) other;
        return this.progress == syncInternalResult.progress && kotlin.jvm.internal.Intrinsics.areEqual(this.syncConfig, syncInternalResult.syncConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataInfo, syncInternalResult.dataInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, syncInternalResult.throwable);
    }

    public int hashCode() {
        int iHashCode = ((this.progress * 31) + this.syncConfig.hashCode()) * 31;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo = this.dataInfo;
        int iHashCode2 = (iHashCode + (dataInfo == null ? 0 : dataInfo.hashCode())) * 31;
        java.lang.Throwable th = this.throwable;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SyncInternalResult(progress=" + this.progress + ", syncConfig=" + this.syncConfig + ", dataInfo=" + this.dataInfo + ", throwable=" + this.throwable + ')';
    }

    public SyncInternalResult(int i, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(syncConfig, "syncConfig");
        this.progress = i;
        this.syncConfig = syncConfig;
        this.dataInfo = dataInfo;
        this.throwable = th;
    }

    public /* synthetic */ SyncInternalResult(int i, powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig syncConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig(false, null, null, false, false, 31, null) : syncConfig, (i2 & 4) != 0 ? null : dataInfo, (i2 & 8) != 0 ? null : th);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
        return this.dataInfo;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.SyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }
}
