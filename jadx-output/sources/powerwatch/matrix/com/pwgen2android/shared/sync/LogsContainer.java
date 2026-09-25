package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JI\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/LogsContainer;", "", "walkingLogs", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "restingLogs", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "sleepLogs", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "activitySessions", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getActivitySessions", "()Ljava/util/List;", "getRestingLogs", "getSleepLogs", "getWalkingLogs", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LogsContainer {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> activitySessions;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs;

    public LogsContainer() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer copy$default(powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer logsContainer, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = logsContainer.walkingLogs;
        }
        if ((i & 2) != 0) {
            list2 = logsContainer.restingLogs;
        }
        if ((i & 4) != 0) {
            list3 = logsContainer.sleepLogs;
        }
        if ((i & 8) != 0) {
            list4 = logsContainer.activitySessions;
        }
        return logsContainer.copy(list, list2, list3, list4);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> component1() {
        return this.walkingLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> component2() {
        return this.restingLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> component3() {
        return this.sleepLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> component4() {
        return this.activitySessions;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer copy(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> activitySessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogs, "walkingLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "restingLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogs, "sleepLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySessions, "activitySessions");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer(walkingLogs, restingLogs, sleepLogs, activitySessions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer logsContainer = (powerwatch.matrix.com.pwgen2android.shared.sync.LogsContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walkingLogs, logsContainer.walkingLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingLogs, logsContainer.restingLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepLogs, logsContainer.sleepLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.activitySessions, logsContainer.activitySessions);
    }

    public int hashCode() {
        return (((((this.walkingLogs.hashCode() * 31) + this.restingLogs.hashCode()) * 31) + this.sleepLogs.hashCode()) * 31) + this.activitySessions.hashCode();
    }

    public java.lang.String toString() {
        return "LogsContainer(walkingLogs=" + this.walkingLogs + ", restingLogs=" + this.restingLogs + ", sleepLogs=" + this.sleepLogs + ", activitySessions=" + this.activitySessions + ')';
    }

    public LogsContainer(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> activitySessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingLogs, "walkingLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingLogs, "restingLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogs, "sleepLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySessions, "activitySessions");
        this.walkingLogs = walkingLogs;
        this.restingLogs = restingLogs;
        this.sleepLogs = sleepLogs;
        this.activitySessions = activitySessions;
    }

    public /* synthetic */ LogsContainer(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> getWalkingLogs() {
        return this.walkingLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> getRestingLogs() {
        return this.restingLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> getSleepLogs() {
        return this.sleepLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> getActivitySessions() {
        return this.activitySessions;
    }
}
