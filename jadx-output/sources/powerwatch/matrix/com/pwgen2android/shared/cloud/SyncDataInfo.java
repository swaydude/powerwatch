package powerwatch.matrix.com.pwgen2android.shared.cloud;

/* JADX INFO: compiled from: CloudSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/SyncDataInfo;", "", "shouldSyncWalkingLogs", "", "shouldSyncSleepLogs", "shouldSyncRestingLogs", "shouldSyncActivitySession", "(ZZZZ)V", "getShouldSyncActivitySession", "()Z", "getShouldSyncRestingLogs", "getShouldSyncSleepLogs", "getShouldSyncWalkingLogs", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SyncDataInfo {
    private final boolean shouldSyncActivitySession;
    private final boolean shouldSyncRestingLogs;
    private final boolean shouldSyncSleepLogs;
    private final boolean shouldSyncWalkingLogs;

    public SyncDataInfo() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo syncDataInfo, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = syncDataInfo.shouldSyncWalkingLogs;
        }
        if ((i & 2) != 0) {
            z2 = syncDataInfo.shouldSyncSleepLogs;
        }
        if ((i & 4) != 0) {
            z3 = syncDataInfo.shouldSyncRestingLogs;
        }
        if ((i & 8) != 0) {
            z4 = syncDataInfo.shouldSyncActivitySession;
        }
        return syncDataInfo.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShouldSyncWalkingLogs() {
        return this.shouldSyncWalkingLogs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldSyncSleepLogs() {
        return this.shouldSyncSleepLogs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldSyncRestingLogs() {
        return this.shouldSyncRestingLogs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldSyncActivitySession() {
        return this.shouldSyncActivitySession;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo copy(boolean shouldSyncWalkingLogs, boolean shouldSyncSleepLogs, boolean shouldSyncRestingLogs, boolean shouldSyncActivitySession) {
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo(shouldSyncWalkingLogs, shouldSyncSleepLogs, shouldSyncRestingLogs, shouldSyncActivitySession);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo syncDataInfo = (powerwatch.matrix.com.pwgen2android.shared.cloud.SyncDataInfo) other;
        return this.shouldSyncWalkingLogs == syncDataInfo.shouldSyncWalkingLogs && this.shouldSyncSleepLogs == syncDataInfo.shouldSyncSleepLogs && this.shouldSyncRestingLogs == syncDataInfo.shouldSyncRestingLogs && this.shouldSyncActivitySession == syncDataInfo.shouldSyncActivitySession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public int hashCode() {
        boolean z = this.shouldSyncWalkingLogs;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.shouldSyncSleepLogs;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.shouldSyncRestingLogs;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.shouldSyncActivitySession;
        return i3 + (z4 ? 1 : z4);
    }

    public java.lang.String toString() {
        return "SyncDataInfo(shouldSyncWalkingLogs=" + this.shouldSyncWalkingLogs + ", shouldSyncSleepLogs=" + this.shouldSyncSleepLogs + ", shouldSyncRestingLogs=" + this.shouldSyncRestingLogs + ", shouldSyncActivitySession=" + this.shouldSyncActivitySession + ')';
    }

    public SyncDataInfo(boolean z, boolean z2, boolean z3, boolean z4) {
        this.shouldSyncWalkingLogs = z;
        this.shouldSyncSleepLogs = z2;
        this.shouldSyncRestingLogs = z3;
        this.shouldSyncActivitySession = z4;
    }

    public /* synthetic */ SyncDataInfo(boolean z, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    public final boolean getShouldSyncWalkingLogs() {
        return this.shouldSyncWalkingLogs;
    }

    public final boolean getShouldSyncSleepLogs() {
        return this.shouldSyncSleepLogs;
    }

    public final boolean getShouldSyncRestingLogs() {
        return this.shouldSyncRestingLogs;
    }

    public final boolean getShouldSyncActivitySession() {
        return this.shouldSyncActivitySession;
    }
}
