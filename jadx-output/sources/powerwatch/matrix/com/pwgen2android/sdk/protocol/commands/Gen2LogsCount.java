package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\b\u0010#\u001a\u00020$H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;", "", "realtimeStatusLogs", "", "realtimeLogs", "activityHeaderLogs", "activityStartLogs", "activityEndLog", "activityDeltaLogs", "backgroundLogs", "sleepLogs", "(JJJJJJJJ)V", "getActivityDeltaLogs", "()J", "getActivityEndLog", "getActivityHeaderLogs", "getActivityStartLogs", "getBackgroundLogs", "getRealtimeLogs", "getRealtimeStatusLogs", "getSleepLogs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2LogsCount {
    private final long activityDeltaLogs;
    private final long activityEndLog;
    private final long activityHeaderLogs;
    private final long activityStartLogs;
    private final long backgroundLogs;
    private final long realtimeLogs;
    private final long realtimeStatusLogs;
    private final long sleepLogs;

    public Gen2LogsCount() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRealtimeStatusLogs() {
        return this.realtimeStatusLogs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRealtimeLogs() {
        return this.realtimeLogs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getActivityHeaderLogs() {
        return this.activityHeaderLogs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getActivityStartLogs() {
        return this.activityStartLogs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getActivityEndLog() {
        return this.activityEndLog;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getActivityDeltaLogs() {
        return this.activityDeltaLogs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getBackgroundLogs() {
        return this.backgroundLogs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getSleepLogs() {
        return this.sleepLogs;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount copy(long realtimeStatusLogs, long realtimeLogs, long activityHeaderLogs, long activityStartLogs, long activityEndLog, long activityDeltaLogs, long backgroundLogs, long sleepLogs) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount(realtimeStatusLogs, realtimeLogs, activityHeaderLogs, activityStartLogs, activityEndLog, activityDeltaLogs, backgroundLogs, sleepLogs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount) other;
        return this.realtimeStatusLogs == gen2LogsCount.realtimeStatusLogs && this.realtimeLogs == gen2LogsCount.realtimeLogs && this.activityHeaderLogs == gen2LogsCount.activityHeaderLogs && this.activityStartLogs == gen2LogsCount.activityStartLogs && this.activityEndLog == gen2LogsCount.activityEndLog && this.activityDeltaLogs == gen2LogsCount.activityDeltaLogs && this.backgroundLogs == gen2LogsCount.backgroundLogs && this.sleepLogs == gen2LogsCount.sleepLogs;
    }

    public int hashCode() {
        return (((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.realtimeStatusLogs) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.realtimeLogs)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.activityHeaderLogs)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.activityStartLogs)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.activityEndLog)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.activityDeltaLogs)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.backgroundLogs)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.sleepLogs);
    }

    public Gen2LogsCount(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.realtimeStatusLogs = j;
        this.realtimeLogs = j2;
        this.activityHeaderLogs = j3;
        this.activityStartLogs = j4;
        this.activityEndLog = j5;
        this.activityDeltaLogs = j6;
        this.backgroundLogs = j7;
        this.sleepLogs = j8;
    }

    public /* synthetic */ Gen2LogsCount(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? 0L : j6, (i & 64) != 0 ? 0L : j7, (i & 128) == 0 ? j8 : 0L);
    }

    public final long getRealtimeStatusLogs() {
        return this.realtimeStatusLogs;
    }

    public final long getRealtimeLogs() {
        return this.realtimeLogs;
    }

    public final long getActivityHeaderLogs() {
        return this.activityHeaderLogs;
    }

    public final long getActivityStartLogs() {
        return this.activityStartLogs;
    }

    public final long getActivityEndLog() {
        return this.activityEndLog;
    }

    public final long getActivityDeltaLogs() {
        return this.activityDeltaLogs;
    }

    public final long getBackgroundLogs() {
        return this.backgroundLogs;
    }

    public final long getSleepLogs() {
        return this.sleepLogs;
    }

    public java.lang.String toString() {
        return "\n--Logs count print---\nRealtime status logs: " + this.realtimeStatusLogs + "\nRealtime logs: " + this.realtimeLogs + "\nActivity header logs count: " + this.activityHeaderLogs + "\nActivity start logs count: " + this.activityStartLogs + "\nActivity end logs count: " + this.activityEndLog + "\nActivity delta logs count: " + this.activityDeltaLogs + "\nBackground logs count: " + this.backgroundLogs + "\nSleep logs count: " + this.sleepLogs + '\n';
    }
}
