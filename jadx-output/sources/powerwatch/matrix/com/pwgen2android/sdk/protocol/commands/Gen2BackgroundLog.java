package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u0081\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\b\u0010B\u001a\u00020CH\u0016R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016¨\u0006D"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2BackgroundLog;", "", "logType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "logTimeIndex", "", "logTableTime", "", "walkStepDelta", "runningStepDelta", "distanceDelta", "battery", "activeCalories", "bmrCalories", "heartRate", "powerLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "hrv", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;IJIIIIIIILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;I)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBattery", "setBattery", "getBmrCalories", "setBmrCalories", "getDistanceDelta", "setDistanceDelta", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getLogTableTime", "()J", "setLogTableTime", "(J)V", "getLogTimeIndex", "setLogTimeIndex", "getLogType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "getPowerLog", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "setPowerLog", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;)V", "getRunningStepDelta", "setRunningStepDelta", "getWalkStepDelta", "setWalkStepDelta", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2BackgroundLog {
    private int activeCalories;
    private int battery;
    private int bmrCalories;
    private int distanceDelta;
    private int heartRate;
    private int hrv;
    private long logTableTime;
    private int logTimeIndex;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType logType;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog powerLog;
    private int runningStepDelta;
    private int walkStepDelta;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType getLogType() {
        return this.logType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog getPowerLog() {
        return this.powerLog;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getHrv() {
        return this.hrv;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLogTimeIndex() {
        return this.logTimeIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLogTableTime() {
        return this.logTableTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWalkStepDelta() {
        return this.walkStepDelta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRunningStepDelta() {
        return this.runningStepDelta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDistanceDelta() {
        return this.distanceDelta;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBattery() {
        return this.battery;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getActiveCalories() {
        return this.activeCalories;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getBmrCalories() {
        return this.bmrCalories;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType logType, int logTimeIndex, long logTableTime, int walkStepDelta, int runningStepDelta, int distanceDelta, int battery, int activeCalories, int bmrCalories, int heartRate, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog powerLog, int hrv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logType, "logType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(powerLog, "powerLog");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog(logType, logTimeIndex, logTableTime, walkStepDelta, runningStepDelta, distanceDelta, battery, activeCalories, bmrCalories, heartRate, powerLog, hrv);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog gen2BackgroundLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.logType, gen2BackgroundLog.logType) && this.logTimeIndex == gen2BackgroundLog.logTimeIndex && this.logTableTime == gen2BackgroundLog.logTableTime && this.walkStepDelta == gen2BackgroundLog.walkStepDelta && this.runningStepDelta == gen2BackgroundLog.runningStepDelta && this.distanceDelta == gen2BackgroundLog.distanceDelta && this.battery == gen2BackgroundLog.battery && this.activeCalories == gen2BackgroundLog.activeCalories && this.bmrCalories == gen2BackgroundLog.bmrCalories && this.heartRate == gen2BackgroundLog.heartRate && kotlin.jvm.internal.Intrinsics.areEqual(this.powerLog, gen2BackgroundLog.powerLog) && this.hrv == gen2BackgroundLog.hrv;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.logType.hashCode() * 31) + this.logTimeIndex) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.logTableTime)) * 31) + this.walkStepDelta) * 31) + this.runningStepDelta) * 31) + this.distanceDelta) * 31) + this.battery) * 31) + this.activeCalories) * 31) + this.bmrCalories) * 31) + this.heartRate) * 31) + this.powerLog.hashCode()) * 31) + this.hrv;
    }

    public Gen2BackgroundLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType logType, int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog powerLog, int i9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logType, "logType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(powerLog, "powerLog");
        this.logType = logType;
        this.logTimeIndex = i;
        this.logTableTime = j;
        this.walkStepDelta = i2;
        this.runningStepDelta = i3;
        this.distanceDelta = i4;
        this.battery = i5;
        this.activeCalories = i6;
        this.bmrCalories = i7;
        this.heartRate = i8;
        this.powerLog = powerLog;
        this.hrv = i9;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType getLogType() {
        return this.logType;
    }

    public final int getDistanceDelta() {
        return this.distanceDelta;
    }

    public final long getLogTableTime() {
        return this.logTableTime;
    }

    public final int getLogTimeIndex() {
        return this.logTimeIndex;
    }

    public final int getRunningStepDelta() {
        return this.runningStepDelta;
    }

    public final int getWalkStepDelta() {
        return this.walkStepDelta;
    }

    public final void setDistanceDelta(int i) {
        this.distanceDelta = i;
    }

    public final void setLogTableTime(long j) {
        this.logTableTime = j;
    }

    public final void setLogTimeIndex(int i) {
        this.logTimeIndex = i;
    }

    public final void setRunningStepDelta(int i) {
        this.runningStepDelta = i;
    }

    public final void setWalkStepDelta(int i) {
        this.walkStepDelta = i;
    }

    public /* synthetic */ Gen2BackgroundLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType logType, int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog, int i9, int i10, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(logType, (i10 & 2) != 0 ? 0 : i, j, (i10 & 8) != 0 ? 0 : i2, (i10 & 16) != 0 ? 0 : i3, (i10 & 32) != 0 ? 0 : i4, (i10 & 64) != 0 ? 0 : i5, (i10 & 128) != 0 ? 0 : i6, (i10 & 256) != 0 ? 0 : i7, (i10 & 512) != 0 ? 0 : i8, (i10 & 1024) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog(0, 0, 0, 0, 0, 31, null) : watchPowerLog, (i10 & 2048) != 0 ? 0 : i9);
    }

    public final int getActiveCalories() {
        return this.activeCalories;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final int getBmrCalories() {
        return this.bmrCalories;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHrv() {
        return this.hrv;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog getPowerLog() {
        return this.powerLog;
    }

    public final void setActiveCalories(int i) {
        this.activeCalories = i;
    }

    public final void setBattery(int i) {
        this.battery = i;
    }

    public final void setBmrCalories(int i) {
        this.bmrCalories = i;
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setHrv(int i) {
        this.hrv = i;
    }

    public final void setPowerLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchPowerLog, "<set-?>");
        this.powerLog = watchPowerLog;
    }

    public java.lang.String toString() {
        return "RTL Index: " + this.logTimeIndex + " Activity: " + this.logType.getEnumValue() + "  Delta Walk Steps: " + this.walkStepDelta + " Delta Run Steps: " + this.runningStepDelta + " Delta Distance: " + this.distanceDelta + " Delta Act Cals: " + this.activeCalories + " Delta BMR Cals: " + this.bmrCalories + " Heart Rate: " + this.heartRate + " HRV: " + this.hrv + " Skin Temp: " + this.powerLog.getSkinTemp() + " Case Temp: " + this.powerLog.getCaseTemp() + " Thermal Gen: " + this.powerLog.getThermalGen() + " Solar Gen: " + this.powerLog.getSolarGen() + " Power Consumed: " + this.powerLog.getPowerConsumed() + " Battery: " + this.battery + '\n';
    }
}
