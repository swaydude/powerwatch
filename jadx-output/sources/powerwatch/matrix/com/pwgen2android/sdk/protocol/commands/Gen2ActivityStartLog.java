package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0016HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0007HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\nHÆ\u0003J\t\u0010M\u001a\u00020\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J©\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u0005HÖ\u0001J\b\u0010T\u001a\u00020UH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006V"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;", "", "type", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "", "startTime", "", "startLogIndex", "startLatitude", "", "startLongitude", "startAltitude", "startLogDistance", "startStepsWalk", "startStepsRunning", "startActiveCals", "startBMRCals", "startHeartRate", "startHRV", "activityValue2", "watchPowerLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;IJIFFFJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V", "getActivityId", "()I", "getActivityValue2", "setActivityValue2", "(I)V", "getStartActiveCals", "setStartActiveCals", "getStartAltitude", "()F", "setStartAltitude", "(F)V", "getStartBMRCals", "setStartBMRCals", "getStartHRV", "setStartHRV", "getStartHeartRate", "setStartHeartRate", "getStartLatitude", "setStartLatitude", "getStartLogDistance", "()J", "setStartLogDistance", "(J)V", "getStartLogIndex", "setStartLogIndex", "getStartLongitude", "setStartLongitude", "getStartStepsRunning", "setStartStepsRunning", "getStartStepsWalk", "setStartStepsWalk", "getStartTime", "setStartTime", "getType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "getWatchPowerLog", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "setWatchPowerLog", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2ActivityStartLog {
    private final int activityId;
    private int activityValue2;
    private int startActiveCals;
    private float startAltitude;
    private int startBMRCals;
    private int startHRV;
    private int startHeartRate;
    private float startLatitude;
    private long startLogDistance;
    private int startLogIndex;
    private float startLongitude;
    private int startStepsRunning;
    private int startStepsWalk;
    private long startTime;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getStartStepsRunning() {
        return this.startStepsRunning;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getStartActiveCals() {
        return this.startActiveCals;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getStartBMRCals() {
        return this.startBMRCals;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getStartHeartRate() {
        return this.startHeartRate;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getStartHRV() {
        return this.startHRV;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getActivityValue2() {
        return this.activityValue2;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog getWatchPowerLog() {
        return this.watchPowerLog;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStartLogIndex() {
        return this.startLogIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getStartLatitude() {
        return this.startLatitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getStartLongitude() {
        return this.startLongitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getStartAltitude() {
        return this.startAltitude;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getStartLogDistance() {
        return this.startLogDistance;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStartStepsWalk() {
        return this.startStepsWalk;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type, int activityId, long startTime, int startLogIndex, float startLatitude, float startLongitude, float startAltitude, long startLogDistance, int startStepsWalk, int startStepsRunning, int startActiveCals, int startBMRCals, int startHeartRate, int startHRV, int activityValue2, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "watchPowerLog");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog(type, activityId, startTime, startLogIndex, startLatitude, startLongitude, startAltitude, startLogDistance, startStepsWalk, startStepsRunning, startActiveCals, startBMRCals, startHeartRate, startHRV, activityValue2, watchPowerLog);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog gen2ActivityStartLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, gen2ActivityStartLog.type) && this.activityId == gen2ActivityStartLog.activityId && this.startTime == gen2ActivityStartLog.startTime && this.startLogIndex == gen2ActivityStartLog.startLogIndex && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.startLatitude), (java.lang.Object) java.lang.Float.valueOf(gen2ActivityStartLog.startLatitude)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.startLongitude), (java.lang.Object) java.lang.Float.valueOf(gen2ActivityStartLog.startLongitude)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.startAltitude), (java.lang.Object) java.lang.Float.valueOf(gen2ActivityStartLog.startAltitude)) && this.startLogDistance == gen2ActivityStartLog.startLogDistance && this.startStepsWalk == gen2ActivityStartLog.startStepsWalk && this.startStepsRunning == gen2ActivityStartLog.startStepsRunning && this.startActiveCals == gen2ActivityStartLog.startActiveCals && this.startBMRCals == gen2ActivityStartLog.startBMRCals && this.startHeartRate == gen2ActivityStartLog.startHeartRate && this.startHRV == gen2ActivityStartLog.startHRV && this.activityValue2 == gen2ActivityStartLog.activityValue2 && kotlin.jvm.internal.Intrinsics.areEqual(this.watchPowerLog, gen2ActivityStartLog.watchPowerLog);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.type.hashCode() * 31) + this.activityId) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startTime)) * 31) + this.startLogIndex) * 31) + java.lang.Float.floatToIntBits(this.startLatitude)) * 31) + java.lang.Float.floatToIntBits(this.startLongitude)) * 31) + java.lang.Float.floatToIntBits(this.startAltitude)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startLogDistance)) * 31) + this.startStepsWalk) * 31) + this.startStepsRunning) * 31) + this.startActiveCals) * 31) + this.startBMRCals) * 31) + this.startHeartRate) * 31) + this.startHRV) * 31) + this.activityValue2) * 31) + this.watchPowerLog.hashCode();
    }

    public Gen2ActivityStartLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type, int i, long j, int i2, float f, float f2, float f3, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "watchPowerLog");
        this.type = type;
        this.activityId = i;
        this.startTime = j;
        this.startLogIndex = i2;
        this.startLatitude = f;
        this.startLongitude = f2;
        this.startAltitude = f3;
        this.startLogDistance = j2;
        this.startStepsWalk = i3;
        this.startStepsRunning = i4;
        this.startActiveCals = i5;
        this.startBMRCals = i6;
        this.startHeartRate = i7;
        this.startHRV = i8;
        this.activityValue2 = i9;
        this.watchPowerLog = watchPowerLog;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType getType() {
        return this.type;
    }

    public final int getActivityId() {
        return this.activityId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final int getStartLogIndex() {
        return this.startLogIndex;
    }

    public final void setStartLogIndex(int i) {
        this.startLogIndex = i;
    }

    public final float getStartLatitude() {
        return this.startLatitude;
    }

    public final void setStartLatitude(float f) {
        this.startLatitude = f;
    }

    public final float getStartLongitude() {
        return this.startLongitude;
    }

    public final void setStartLongitude(float f) {
        this.startLongitude = f;
    }

    public final float getStartAltitude() {
        return this.startAltitude;
    }

    public final void setStartAltitude(float f) {
        this.startAltitude = f;
    }

    public final long getStartLogDistance() {
        return this.startLogDistance;
    }

    public final void setStartLogDistance(long j) {
        this.startLogDistance = j;
    }

    public final int getStartStepsWalk() {
        return this.startStepsWalk;
    }

    public final void setStartStepsWalk(int i) {
        this.startStepsWalk = i;
    }

    public final int getStartStepsRunning() {
        return this.startStepsRunning;
    }

    public final void setStartStepsRunning(int i) {
        this.startStepsRunning = i;
    }

    public final int getStartActiveCals() {
        return this.startActiveCals;
    }

    public final void setStartActiveCals(int i) {
        this.startActiveCals = i;
    }

    public final int getStartBMRCals() {
        return this.startBMRCals;
    }

    public final void setStartBMRCals(int i) {
        this.startBMRCals = i;
    }

    public final int getStartHeartRate() {
        return this.startHeartRate;
    }

    public final void setStartHeartRate(int i) {
        this.startHeartRate = i;
    }

    public final int getStartHRV() {
        return this.startHRV;
    }

    public final void setStartHRV(int i) {
        this.startHRV = i;
    }

    public final int getActivityValue2() {
        return this.activityValue2;
    }

    public final void setActivityValue2(int i) {
        this.activityValue2 = i;
    }

    public /* synthetic */ Gen2ActivityStartLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType activityType, int i, long j, int i2, float f, float f2, float f3, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog, int i10, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(activityType, (i10 & 2) != 0 ? 0 : i, (i10 & 4) != 0 ? 0L : j, (i10 & 8) != 0 ? 0 : i2, (i10 & 16) != 0 ? 0.0f : f, (i10 & 32) != 0 ? 0.0f : f2, (i10 & 64) == 0 ? f3 : 0.0f, (i10 & 128) == 0 ? j2 : 0L, (i10 & 256) != 0 ? 0 : i3, (i10 & 512) != 0 ? 0 : i4, (i10 & 1024) != 0 ? 0 : i5, (i10 & 2048) != 0 ? 0 : i6, (i10 & 4096) != 0 ? 0 : i7, (i10 & 8192) != 0 ? 0 : i8, (i10 & 16384) != 0 ? 0 : i9, (i10 & 32768) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog(0, 0, 0, 0, 0, 31, null) : watchPowerLog);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog getWatchPowerLog() {
        return this.watchPowerLog;
    }

    public final void setWatchPowerLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "<set-?>");
        this.watchPowerLog = watchPowerLog;
    }

    public java.lang.String toString() {
        return "\n---Activity start log print---\nActivity type: " + this.type.getType() + " Activity Start Log Index: " + this.startLogIndex + " Time: " + this.startTime + " GPS Lat " + this.startLatitude + " GPS Long " + this.startLongitude + " GPS Altitude " + this.startAltitude + " Run Steps: " + this.startStepsRunning + " Skin Temp: " + this.watchPowerLog.getSkinTemp() + " Walk Steps: " + this.startStepsWalk + " Case Temp: " + this.watchPowerLog.getCaseTemp() + " Distance: " + this.startLogDistance + " Act Cals: " + this.startActiveCals + " HRV: " + this.startHRV + " BMR Cals: " + this.startBMRCals + " Heart Rate: " + this.startHeartRate + " Thermal Gen: " + this.watchPowerLog.getThermalGen() + " Activity 1: " + this.type.getType() + " Solar Gen: " + this.watchPowerLog.getSolarGen() + " Activity 2: " + this.activityValue2 + " Power Consumed: " + this.watchPowerLog.getPowerConsumed() + '\n';
    }
}
