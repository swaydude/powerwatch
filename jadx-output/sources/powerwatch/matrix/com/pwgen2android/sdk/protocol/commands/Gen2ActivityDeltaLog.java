package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0002\u0010\u0016J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\fHÆ\u0003J\t\u0010K\u001a\u00020\fHÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J©\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\bHÖ\u0001J\b\u0010R\u001a\u00020SH\u0016R\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006T"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;", "", "type", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "deltaStep", "", "deltaRunningStepCount", "deltaDistance", "", "deltaCalsActive", "deltaCalsBRM", "deltaGPSLat", "", "deltaGPSLong", "deltaSkinTemp", "deltCaseTemp", "deltaHeartRate", "deltaHRV", "deltaThermalGen", "deltaSolarGen", "deltaPowerConsumed", "deltaAltitude", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;JJIIIBBIIIIIIII)V", "getDeltCaseTemp", "()I", "setDeltCaseTemp", "(I)V", "getDeltaAltitude", "setDeltaAltitude", "getDeltaCalsActive", "setDeltaCalsActive", "getDeltaCalsBRM", "setDeltaCalsBRM", "getDeltaDistance", "setDeltaDistance", "getDeltaGPSLat", "()B", "setDeltaGPSLat", "(B)V", "getDeltaGPSLong", "setDeltaGPSLong", "getDeltaHRV", "setDeltaHRV", "getDeltaHeartRate", "setDeltaHeartRate", "getDeltaPowerConsumed", "setDeltaPowerConsumed", "getDeltaRunningStepCount", "()J", "setDeltaRunningStepCount", "(J)V", "getDeltaSkinTemp", "setDeltaSkinTemp", "getDeltaSolarGen", "setDeltaSolarGen", "getDeltaStep", "setDeltaStep", "getDeltaThermalGen", "setDeltaThermalGen", "getType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2ActivityDeltaLog {
    private int deltCaseTemp;
    private int deltaAltitude;
    private int deltaCalsActive;
    private int deltaCalsBRM;
    private int deltaDistance;
    private byte deltaGPSLat;
    private byte deltaGPSLong;
    private int deltaHRV;
    private int deltaHeartRate;
    private int deltaPowerConsumed;
    private long deltaRunningStepCount;
    private int deltaSkinTemp;
    private int deltaSolarGen;
    private long deltaStep;
    private int deltaThermalGen;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type;

    public Gen2ActivityDeltaLog() {
        this(null, 0L, 0L, 0, 0, 0, (byte) 0, (byte) 0, 0, 0, 0, 0, 0, 0, 0, 0, androidx.core.internal.view.SupportMenu.USER_MASK, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDeltCaseTemp() {
        return this.deltCaseTemp;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeltaHeartRate() {
        return this.deltaHeartRate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDeltaHRV() {
        return this.deltaHRV;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDeltaThermalGen() {
        return this.deltaThermalGen;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDeltaSolarGen() {
        return this.deltaSolarGen;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getDeltaPowerConsumed() {
        return this.deltaPowerConsumed;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getDeltaAltitude() {
        return this.deltaAltitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDeltaStep() {
        return this.deltaStep;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDeltaRunningStepCount() {
        return this.deltaRunningStepCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeltaDistance() {
        return this.deltaDistance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeltaCalsActive() {
        return this.deltaCalsActive;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeltaCalsBRM() {
        return this.deltaCalsBRM;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final byte getDeltaGPSLat() {
        return this.deltaGPSLat;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final byte getDeltaGPSLong() {
        return this.deltaGPSLong;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeltaSkinTemp() {
        return this.deltaSkinTemp;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type, long deltaStep, long deltaRunningStepCount, int deltaDistance, int deltaCalsActive, int deltaCalsBRM, byte deltaGPSLat, byte deltaGPSLong, int deltaSkinTemp, int deltCaseTemp, int deltaHeartRate, int deltaHRV, int deltaThermalGen, int deltaSolarGen, int deltaPowerConsumed, int deltaAltitude) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog(type, deltaStep, deltaRunningStepCount, deltaDistance, deltaCalsActive, deltaCalsBRM, deltaGPSLat, deltaGPSLong, deltaSkinTemp, deltCaseTemp, deltaHeartRate, deltaHRV, deltaThermalGen, deltaSolarGen, deltaPowerConsumed, deltaAltitude);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog gen2ActivityDeltaLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, gen2ActivityDeltaLog.type) && this.deltaStep == gen2ActivityDeltaLog.deltaStep && this.deltaRunningStepCount == gen2ActivityDeltaLog.deltaRunningStepCount && this.deltaDistance == gen2ActivityDeltaLog.deltaDistance && this.deltaCalsActive == gen2ActivityDeltaLog.deltaCalsActive && this.deltaCalsBRM == gen2ActivityDeltaLog.deltaCalsBRM && this.deltaGPSLat == gen2ActivityDeltaLog.deltaGPSLat && this.deltaGPSLong == gen2ActivityDeltaLog.deltaGPSLong && this.deltaSkinTemp == gen2ActivityDeltaLog.deltaSkinTemp && this.deltCaseTemp == gen2ActivityDeltaLog.deltCaseTemp && this.deltaHeartRate == gen2ActivityDeltaLog.deltaHeartRate && this.deltaHRV == gen2ActivityDeltaLog.deltaHRV && this.deltaThermalGen == gen2ActivityDeltaLog.deltaThermalGen && this.deltaSolarGen == gen2ActivityDeltaLog.deltaSolarGen && this.deltaPowerConsumed == gen2ActivityDeltaLog.deltaPowerConsumed && this.deltaAltitude == gen2ActivityDeltaLog.deltaAltitude;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.type.hashCode() * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.deltaStep)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.deltaRunningStepCount)) * 31) + this.deltaDistance) * 31) + this.deltaCalsActive) * 31) + this.deltaCalsBRM) * 31) + this.deltaGPSLat) * 31) + this.deltaGPSLong) * 31) + this.deltaSkinTemp) * 31) + this.deltCaseTemp) * 31) + this.deltaHeartRate) * 31) + this.deltaHRV) * 31) + this.deltaThermalGen) * 31) + this.deltaSolarGen) * 31) + this.deltaPowerConsumed) * 31) + this.deltaAltitude;
    }

    public Gen2ActivityDeltaLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type, long j, long j2, int i, int i2, int i3, byte b, byte b2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.deltaStep = j;
        this.deltaRunningStepCount = j2;
        this.deltaDistance = i;
        this.deltaCalsActive = i2;
        this.deltaCalsBRM = i3;
        this.deltaGPSLat = b;
        this.deltaGPSLong = b2;
        this.deltaSkinTemp = i4;
        this.deltCaseTemp = i5;
        this.deltaHeartRate = i6;
        this.deltaHRV = i7;
        this.deltaThermalGen = i8;
        this.deltaSolarGen = i9;
        this.deltaPowerConsumed = i10;
        this.deltaAltitude = i11;
    }

    public /* synthetic */ Gen2ActivityDeltaLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType activityType, long j, long j2, int i, int i2, int i3, byte b, byte b2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE : activityType, (i12 & 2) != 0 ? 0L : j, (i12 & 4) == 0 ? j2 : 0L, (i12 & 8) != 0 ? 0 : i, (i12 & 16) != 0 ? 0 : i2, (i12 & 32) != 0 ? 0 : i3, (i12 & 64) != 0 ? (byte) 0 : b, (i12 & 128) != 0 ? (byte) 0 : b2, (i12 & 256) != 0 ? 0 : i4, (i12 & 512) != 0 ? 0 : i5, (i12 & 1024) != 0 ? 0 : i6, (i12 & 2048) != 0 ? 0 : i7, (i12 & 4096) != 0 ? 0 : i8, (i12 & 8192) != 0 ? 0 : i9, (i12 & 16384) != 0 ? 0 : i10, (i12 & 32768) != 0 ? 0 : i11);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType getType() {
        return this.type;
    }

    public final long getDeltaStep() {
        return this.deltaStep;
    }

    public final void setDeltaStep(long j) {
        this.deltaStep = j;
    }

    public final long getDeltaRunningStepCount() {
        return this.deltaRunningStepCount;
    }

    public final void setDeltaRunningStepCount(long j) {
        this.deltaRunningStepCount = j;
    }

    public final int getDeltaDistance() {
        return this.deltaDistance;
    }

    public final void setDeltaDistance(int i) {
        this.deltaDistance = i;
    }

    public final int getDeltaCalsActive() {
        return this.deltaCalsActive;
    }

    public final void setDeltaCalsActive(int i) {
        this.deltaCalsActive = i;
    }

    public final int getDeltaCalsBRM() {
        return this.deltaCalsBRM;
    }

    public final void setDeltaCalsBRM(int i) {
        this.deltaCalsBRM = i;
    }

    public final byte getDeltaGPSLat() {
        return this.deltaGPSLat;
    }

    public final void setDeltaGPSLat(byte b) {
        this.deltaGPSLat = b;
    }

    public final byte getDeltaGPSLong() {
        return this.deltaGPSLong;
    }

    public final void setDeltaGPSLong(byte b) {
        this.deltaGPSLong = b;
    }

    public final int getDeltaSkinTemp() {
        return this.deltaSkinTemp;
    }

    public final void setDeltaSkinTemp(int i) {
        this.deltaSkinTemp = i;
    }

    public final int getDeltCaseTemp() {
        return this.deltCaseTemp;
    }

    public final void setDeltCaseTemp(int i) {
        this.deltCaseTemp = i;
    }

    public final int getDeltaHeartRate() {
        return this.deltaHeartRate;
    }

    public final void setDeltaHeartRate(int i) {
        this.deltaHeartRate = i;
    }

    public final int getDeltaHRV() {
        return this.deltaHRV;
    }

    public final void setDeltaHRV(int i) {
        this.deltaHRV = i;
    }

    public final int getDeltaThermalGen() {
        return this.deltaThermalGen;
    }

    public final void setDeltaThermalGen(int i) {
        this.deltaThermalGen = i;
    }

    public final int getDeltaSolarGen() {
        return this.deltaSolarGen;
    }

    public final void setDeltaSolarGen(int i) {
        this.deltaSolarGen = i;
    }

    public final int getDeltaPowerConsumed() {
        return this.deltaPowerConsumed;
    }

    public final void setDeltaPowerConsumed(int i) {
        this.deltaPowerConsumed = i;
    }

    public final int getDeltaAltitude() {
        return this.deltaAltitude;
    }

    public final void setDeltaAltitude(int i) {
        this.deltaAltitude = i;
    }

    public java.lang.String toString() {
        return "Activity: " + this.type.getType() + " Delta Walk Steps: " + this.deltaStep + " Delta Run Steps: " + this.deltaRunningStepCount + " Delta Distance: " + this.deltaDistance + " Delta Active Cals: " + this.deltaCalsActive + " Delta BMR Cals: " + this.deltaCalsBRM + " Heart Rate: " + this.deltaHeartRate + " HRV: " + this.deltaHRV + " Skin Temp: " + this.deltaSkinTemp + " Case Temp: " + this.deltCaseTemp + " Thermal Gen: " + this.deltaThermalGen + " Solar Gen: " + this.deltaSolarGen + " Power Consumed: " + this.deltaPowerConsumed + " Delta GPS Lat: " + ((int) this.deltaGPSLat) + " Delta GPS Long: " + ((int) this.deltaGPSLong) + " Delta Altitude: " + this.deltaAltitude + '\n';
    }
}
