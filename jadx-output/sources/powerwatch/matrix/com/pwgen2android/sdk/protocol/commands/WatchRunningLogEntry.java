package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J_\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\nHÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017¨\u00067"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;", "", "sessionType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "runningStart", "", "runningEnd", "distance", "steps", "activeCalories", "", "elapsed", "runningSplits", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;JJJJIILjava/util/List;)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getDistance", "()J", "setDistance", "(J)V", "getElapsed", "setElapsed", "getRunningEnd", "setRunningEnd", "getRunningSplits", "()Ljava/util/List;", "setRunningSplits", "(Ljava/util/List;)V", "getRunningStart", "setRunningStart", "getSessionType", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "setSessionType", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;)V", "getSteps", "setSteps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WatchRunningLogEntry {
    private int activeCalories;
    private long distance;
    private int elapsed;
    private long runningEnd;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry> runningSplits;
    private long runningStart;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType sessionType;
    private long steps;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType getSessionType() {
        return this.sessionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRunningStart() {
        return this.runningStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRunningEnd() {
        return this.runningEnd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getActiveCalories() {
        return this.activeCalories;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getElapsed() {
        return this.elapsed;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry> component8() {
        return this.runningSplits;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry copy(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType sessionType, long runningStart, long runningEnd, long distance, long steps, int activeCalories, int elapsed, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry> runningSplits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningSplits, "runningSplits");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry(sessionType, runningStart, runningEnd, distance, steps, activeCalories, elapsed, runningSplits);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry watchRunningLogEntry = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry) other;
        return this.sessionType == watchRunningLogEntry.sessionType && this.runningStart == watchRunningLogEntry.runningStart && this.runningEnd == watchRunningLogEntry.runningEnd && this.distance == watchRunningLogEntry.distance && this.steps == watchRunningLogEntry.steps && this.activeCalories == watchRunningLogEntry.activeCalories && this.elapsed == watchRunningLogEntry.elapsed && kotlin.jvm.internal.Intrinsics.areEqual(this.runningSplits, watchRunningLogEntry.runningSplits);
    }

    public int hashCode() {
        return (((((((((((((this.sessionType.hashCode() * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.runningStart)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.runningEnd)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.distance)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.steps)) * 31) + this.activeCalories) * 31) + this.elapsed) * 31) + this.runningSplits.hashCode();
    }

    public java.lang.String toString() {
        return "WatchRunningLogEntry(sessionType=" + this.sessionType + ", runningStart=" + this.runningStart + ", runningEnd=" + this.runningEnd + ", distance=" + this.distance + ", steps=" + this.steps + ", activeCalories=" + this.activeCalories + ", elapsed=" + this.elapsed + ", runningSplits=" + this.runningSplits + ')';
    }

    public WatchRunningLogEntry(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType sessionType, long j, long j2, long j3, long j4, int i, int i2, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry> runningSplits) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningSplits, "runningSplits");
        this.sessionType = sessionType;
        this.runningStart = j;
        this.runningEnd = j2;
        this.distance = j3;
        this.steps = j4;
        this.activeCalories = i;
        this.elapsed = i2;
        this.runningSplits = runningSplits;
    }

    public /* synthetic */ WatchRunningLogEntry(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityType, long j, long j2, long j3, long j4, int i, int i2, java.util.List list, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_RUNNING : userActivityType, j, j2, j3, j4, i, i2, (i3 & 128) != 0 ? new java.util.ArrayList() : list);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType getSessionType() {
        return this.sessionType;
    }

    public final void setSessionType(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivityType, "<set-?>");
        this.sessionType = userActivityType;
    }

    public final long getRunningStart() {
        return this.runningStart;
    }

    public final void setRunningStart(long j) {
        this.runningStart = j;
    }

    public final long getRunningEnd() {
        return this.runningEnd;
    }

    public final void setRunningEnd(long j) {
        this.runningEnd = j;
    }

    public final long getDistance() {
        return this.distance;
    }

    public final void setDistance(long j) {
        this.distance = j;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final void setSteps(long j) {
        this.steps = j;
    }

    public final int getActiveCalories() {
        return this.activeCalories;
    }

    public final void setActiveCalories(int i) {
        this.activeCalories = i;
    }

    public final int getElapsed() {
        return this.elapsed;
    }

    public final void setElapsed(int i) {
        this.elapsed = i;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry> getRunningSplits() {
        return this.runningSplits;
    }

    public final void setRunningSplits(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.runningSplits = list;
    }
}
