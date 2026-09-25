package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010!R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006A"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;", "", "isSleep", "", "timestamp", "", "state", "", "battery", "activeCalories", "bmrCalories", "hrv", "pulseCount", "walkingSteps", "runningSteps", "distance", "watchPowerLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "(ZJIIIIIIJJJLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBattery", "setBattery", "getBmrCalories", "setBmrCalories", "getDistance", "()J", "setDistance", "(J)V", "getHrv", "setHrv", "()Z", "getPulseCount", "setPulseCount", "getRunningSteps", "setRunningSteps", "getState", "setState", "getTimestamp", "getWalkingSteps", "setWalkingSteps", "getWatchPowerLog", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "setWatchPowerLog", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WatchLogEntry {
    private int activeCalories;
    private int battery;
    private int bmrCalories;
    private long distance;
    private int hrv;
    private final boolean isSleep;
    private int pulseCount;
    private long runningSteps;
    private int state;
    private final long timestamp;
    private long walkingSteps;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSleep() {
        return this.isSleep;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getRunningSteps() {
        return this.runningSteps;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog getWatchPowerLog() {
        return this.watchPowerLog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBattery() {
        return this.battery;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getActiveCalories() {
        return this.activeCalories;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBmrCalories() {
        return this.bmrCalories;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHrv() {
        return this.hrv;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPulseCount() {
        return this.pulseCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getWalkingSteps() {
        return this.walkingSteps;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry copy(boolean isSleep, long timestamp, int state, int battery, int activeCalories, int bmrCalories, int hrv, int pulseCount, long walkingSteps, long runningSteps, long distance, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "watchPowerLog");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry(isSleep, timestamp, state, battery, activeCalories, bmrCalories, hrv, pulseCount, walkingSteps, runningSteps, distance, watchPowerLog);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) other;
        return this.isSleep == watchLogEntry.isSleep && this.timestamp == watchLogEntry.timestamp && this.state == watchLogEntry.state && this.battery == watchLogEntry.battery && this.activeCalories == watchLogEntry.activeCalories && this.bmrCalories == watchLogEntry.bmrCalories && this.hrv == watchLogEntry.hrv && this.pulseCount == watchLogEntry.pulseCount && this.walkingSteps == watchLogEntry.walkingSteps && this.runningSteps == watchLogEntry.runningSteps && this.distance == watchLogEntry.distance && kotlin.jvm.internal.Intrinsics.areEqual(this.watchPowerLog, watchLogEntry.watchPowerLog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    public int hashCode() {
        boolean z = this.isSleep;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((((((((((r0 * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.timestamp)) * 31) + this.state) * 31) + this.battery) * 31) + this.activeCalories) * 31) + this.bmrCalories) * 31) + this.hrv) * 31) + this.pulseCount) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.walkingSteps)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.runningSteps)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.distance)) * 31) + this.watchPowerLog.hashCode();
    }

    public java.lang.String toString() {
        return "WatchLogEntry(isSleep=" + this.isSleep + ", timestamp=" + this.timestamp + ", state=" + this.state + ", battery=" + this.battery + ", activeCalories=" + this.activeCalories + ", bmrCalories=" + this.bmrCalories + ", hrv=" + this.hrv + ", pulseCount=" + this.pulseCount + ", walkingSteps=" + this.walkingSteps + ", runningSteps=" + this.runningSteps + ", distance=" + this.distance + ", watchPowerLog=" + this.watchPowerLog + ')';
    }

    public WatchLogEntry(boolean z, long j, int i, int i2, int i3, int i4, int i5, int i6, long j2, long j3, long j4, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "watchPowerLog");
        this.isSleep = z;
        this.timestamp = j;
        this.state = i;
        this.battery = i2;
        this.activeCalories = i3;
        this.bmrCalories = i4;
        this.hrv = i5;
        this.pulseCount = i6;
        this.walkingSteps = j2;
        this.runningSteps = j3;
        this.distance = j4;
        this.watchPowerLog = watchPowerLog;
    }

    public final boolean isSleep() {
        return this.isSleep;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final void setBattery(int i) {
        this.battery = i;
    }

    public final int getActiveCalories() {
        return this.activeCalories;
    }

    public final void setActiveCalories(int i) {
        this.activeCalories = i;
    }

    public final int getBmrCalories() {
        return this.bmrCalories;
    }

    public final void setBmrCalories(int i) {
        this.bmrCalories = i;
    }

    public final int getHrv() {
        return this.hrv;
    }

    public final void setHrv(int i) {
        this.hrv = i;
    }

    public final int getPulseCount() {
        return this.pulseCount;
    }

    public final void setPulseCount(int i) {
        this.pulseCount = i;
    }

    public final long getWalkingSteps() {
        return this.walkingSteps;
    }

    public final void setWalkingSteps(long j) {
        this.walkingSteps = j;
    }

    public final long getRunningSteps() {
        return this.runningSteps;
    }

    public final void setRunningSteps(long j) {
        this.runningSteps = j;
    }

    public final long getDistance() {
        return this.distance;
    }

    public final void setDistance(long j) {
        this.distance = j;
    }

    public /* synthetic */ WatchLogEntry(boolean z, long j, int i, int i2, int i3, int i4, int i5, int i6, long j2, long j3, long j4, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog, int i7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i7 & 2) != 0 ? -1L : j, i, i2, i3, i4, (i7 & 64) != 0 ? 0 : i5, i6, (i7 & 256) != 0 ? 0L : j2, (i7 & 512) != 0 ? 0L : j3, (i7 & 1024) != 0 ? 0L : j4, (i7 & 2048) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog(0, 0, 0, 0, 0, 31, null) : watchPowerLog);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog getWatchPowerLog() {
        return this.watchPowerLog;
    }

    public final void setWatchPowerLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "<set-?>");
        this.watchPowerLog = watchPowerLog;
    }
}
