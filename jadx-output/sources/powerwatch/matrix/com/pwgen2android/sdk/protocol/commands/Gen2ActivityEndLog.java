package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\bH\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0014HÆ\u0003J\t\u0010O\u001a\u00020\u0014HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003JÑ\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\u0003HÖ\u0001J\b\u0010`\u001a\u00020aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001b\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001eR\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001b\"\u0004\b\"\u0010\u001eR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\u001a\u0010\u0015\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001b\"\u0004\b<\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001b\"\u0004\bF\u0010\u001e¨\u0006b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityDetailsFragment.ACTIVITY_ID, "", "endLogTime", "", "endLogIndex", "endLogDistance", "endStepsWalk", "endStepsRunning", "endActiveCals", "endBMRCals", "endHeartRate", "endHRV", "endThermalGen", "endSolarGen", "endPowerConsumed", "endSkinTemp", "endCaseTemp", "endLat", "", "endLong", "endAlt", "endActivityValue1", "endActivityValue2", "(IJIJIIIIIIIIIIIFFIII)V", "getActivityId", "()I", "getEndActiveCals", "setEndActiveCals", "(I)V", "getEndActivityValue1", "setEndActivityValue1", "getEndActivityValue2", "setEndActivityValue2", "getEndAlt", "setEndAlt", "getEndBMRCals", "setEndBMRCals", "getEndCaseTemp", "setEndCaseTemp", "getEndHRV", "setEndHRV", "getEndHeartRate", "setEndHeartRate", "getEndLat", "()F", "setEndLat", "(F)V", "getEndLogDistance", "()J", "setEndLogDistance", "(J)V", "getEndLogIndex", "setEndLogIndex", "getEndLogTime", "setEndLogTime", "getEndLong", "setEndLong", "getEndPowerConsumed", "setEndPowerConsumed", "getEndSkinTemp", "setEndSkinTemp", "getEndSolarGen", "setEndSolarGen", "getEndStepsRunning", "setEndStepsRunning", "getEndStepsWalk", "setEndStepsWalk", "getEndThermalGen", "setEndThermalGen", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2ActivityEndLog {
    private final int activityId;
    private int endActiveCals;
    private int endActivityValue1;
    private int endActivityValue2;
    private int endAlt;
    private int endBMRCals;
    private int endCaseTemp;
    private int endHRV;
    private int endHeartRate;
    private float endLat;
    private long endLogDistance;
    private int endLogIndex;
    private long endLogTime;
    private float endLong;
    private int endPowerConsumed;
    private int endSkinTemp;
    private int endSolarGen;
    private int endStepsRunning;
    private int endStepsWalk;
    private int endThermalGen;

    public Gen2ActivityEndLog() {
        this(0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 1048575, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getEndHRV() {
        return this.endHRV;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getEndThermalGen() {
        return this.endThermalGen;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getEndSolarGen() {
        return this.endSolarGen;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getEndPowerConsumed() {
        return this.endPowerConsumed;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getEndSkinTemp() {
        return this.endSkinTemp;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getEndCaseTemp() {
        return this.endCaseTemp;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getEndLat() {
        return this.endLat;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getEndLong() {
        return this.endLong;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getEndAlt() {
        return this.endAlt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getEndActivityValue1() {
        return this.endActivityValue1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndLogTime() {
        return this.endLogTime;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getEndActivityValue2() {
        return this.endActivityValue2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndLogIndex() {
        return this.endLogIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndLogDistance() {
        return this.endLogDistance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getEndStepsWalk() {
        return this.endStepsWalk;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getEndStepsRunning() {
        return this.endStepsRunning;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getEndActiveCals() {
        return this.endActiveCals;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getEndBMRCals() {
        return this.endBMRCals;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getEndHeartRate() {
        return this.endHeartRate;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog copy(int activityId, long endLogTime, int endLogIndex, long endLogDistance, int endStepsWalk, int endStepsRunning, int endActiveCals, int endBMRCals, int endHeartRate, int endHRV, int endThermalGen, int endSolarGen, int endPowerConsumed, int endSkinTemp, int endCaseTemp, float endLat, float endLong, int endAlt, int endActivityValue1, int endActivityValue2) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog(activityId, endLogTime, endLogIndex, endLogDistance, endStepsWalk, endStepsRunning, endActiveCals, endBMRCals, endHeartRate, endHRV, endThermalGen, endSolarGen, endPowerConsumed, endSkinTemp, endCaseTemp, endLat, endLong, endAlt, endActivityValue1, endActivityValue2);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog gen2ActivityEndLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog) other;
        return this.activityId == gen2ActivityEndLog.activityId && this.endLogTime == gen2ActivityEndLog.endLogTime && this.endLogIndex == gen2ActivityEndLog.endLogIndex && this.endLogDistance == gen2ActivityEndLog.endLogDistance && this.endStepsWalk == gen2ActivityEndLog.endStepsWalk && this.endStepsRunning == gen2ActivityEndLog.endStepsRunning && this.endActiveCals == gen2ActivityEndLog.endActiveCals && this.endBMRCals == gen2ActivityEndLog.endBMRCals && this.endHeartRate == gen2ActivityEndLog.endHeartRate && this.endHRV == gen2ActivityEndLog.endHRV && this.endThermalGen == gen2ActivityEndLog.endThermalGen && this.endSolarGen == gen2ActivityEndLog.endSolarGen && this.endPowerConsumed == gen2ActivityEndLog.endPowerConsumed && this.endSkinTemp == gen2ActivityEndLog.endSkinTemp && this.endCaseTemp == gen2ActivityEndLog.endCaseTemp && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.endLat), (java.lang.Object) java.lang.Float.valueOf(gen2ActivityEndLog.endLat)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.endLong), (java.lang.Object) java.lang.Float.valueOf(gen2ActivityEndLog.endLong)) && this.endAlt == gen2ActivityEndLog.endAlt && this.endActivityValue1 == gen2ActivityEndLog.endActivityValue1 && this.endActivityValue2 == gen2ActivityEndLog.endActivityValue2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.activityId * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.endLogTime)) * 31) + this.endLogIndex) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.endLogDistance)) * 31) + this.endStepsWalk) * 31) + this.endStepsRunning) * 31) + this.endActiveCals) * 31) + this.endBMRCals) * 31) + this.endHeartRate) * 31) + this.endHRV) * 31) + this.endThermalGen) * 31) + this.endSolarGen) * 31) + this.endPowerConsumed) * 31) + this.endSkinTemp) * 31) + this.endCaseTemp) * 31) + java.lang.Float.floatToIntBits(this.endLat)) * 31) + java.lang.Float.floatToIntBits(this.endLong)) * 31) + this.endAlt) * 31) + this.endActivityValue1) * 31) + this.endActivityValue2;
    }

    public Gen2ActivityEndLog(int i, long j, int i2, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f, float f2, int i14, int i15, int i16) {
        this.activityId = i;
        this.endLogTime = j;
        this.endLogIndex = i2;
        this.endLogDistance = j2;
        this.endStepsWalk = i3;
        this.endStepsRunning = i4;
        this.endActiveCals = i5;
        this.endBMRCals = i6;
        this.endHeartRate = i7;
        this.endHRV = i8;
        this.endThermalGen = i9;
        this.endSolarGen = i10;
        this.endPowerConsumed = i11;
        this.endSkinTemp = i12;
        this.endCaseTemp = i13;
        this.endLat = f;
        this.endLong = f2;
        this.endAlt = i14;
        this.endActivityValue1 = i15;
        this.endActivityValue2 = i16;
    }

    public /* synthetic */ Gen2ActivityEndLog(int i, long j, int i2, long j2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f, float f2, int i14, int i15, int i16, int i17, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i, (i17 & 2) != 0 ? 0L : j, (i17 & 4) != 0 ? 0 : i2, (i17 & 8) == 0 ? j2 : 0L, (i17 & 16) != 0 ? 0 : i3, (i17 & 32) != 0 ? 0 : i4, (i17 & 64) != 0 ? 0 : i5, (i17 & 128) != 0 ? 0 : i6, (i17 & 256) != 0 ? 0 : i7, (i17 & 512) != 0 ? 0 : i8, (i17 & 1024) != 0 ? 0 : i9, (i17 & 2048) != 0 ? 0 : i10, (i17 & 4096) != 0 ? 0 : i11, (i17 & 8192) != 0 ? 0 : i12, (i17 & 16384) != 0 ? 0 : i13, (i17 & 32768) != 0 ? 0.0f : f, (i17 & 65536) == 0 ? f2 : 0.0f, (i17 & 131072) != 0 ? 0 : i14, (i17 & 262144) != 0 ? 0 : i15, (i17 & 524288) != 0 ? 0 : i16);
    }

    public final int getActivityId() {
        return this.activityId;
    }

    public final long getEndLogDistance() {
        return this.endLogDistance;
    }

    public final int getEndLogIndex() {
        return this.endLogIndex;
    }

    public final long getEndLogTime() {
        return this.endLogTime;
    }

    public final void setEndLogDistance(long j) {
        this.endLogDistance = j;
    }

    public final void setEndLogIndex(int i) {
        this.endLogIndex = i;
    }

    public final void setEndLogTime(long j) {
        this.endLogTime = j;
    }

    public final int getEndStepsRunning() {
        return this.endStepsRunning;
    }

    public final int getEndStepsWalk() {
        return this.endStepsWalk;
    }

    public final void setEndStepsRunning(int i) {
        this.endStepsRunning = i;
    }

    public final void setEndStepsWalk(int i) {
        this.endStepsWalk = i;
    }

    public final int getEndActiveCals() {
        return this.endActiveCals;
    }

    public final int getEndBMRCals() {
        return this.endBMRCals;
    }

    public final void setEndActiveCals(int i) {
        this.endActiveCals = i;
    }

    public final void setEndBMRCals(int i) {
        this.endBMRCals = i;
    }

    public final int getEndHRV() {
        return this.endHRV;
    }

    public final int getEndHeartRate() {
        return this.endHeartRate;
    }

    public final void setEndHRV(int i) {
        this.endHRV = i;
    }

    public final void setEndHeartRate(int i) {
        this.endHeartRate = i;
    }

    public final int getEndPowerConsumed() {
        return this.endPowerConsumed;
    }

    public final int getEndSolarGen() {
        return this.endSolarGen;
    }

    public final int getEndThermalGen() {
        return this.endThermalGen;
    }

    public final void setEndPowerConsumed(int i) {
        this.endPowerConsumed = i;
    }

    public final void setEndSolarGen(int i) {
        this.endSolarGen = i;
    }

    public final void setEndThermalGen(int i) {
        this.endThermalGen = i;
    }

    public final int getEndCaseTemp() {
        return this.endCaseTemp;
    }

    public final int getEndSkinTemp() {
        return this.endSkinTemp;
    }

    public final void setEndCaseTemp(int i) {
        this.endCaseTemp = i;
    }

    public final void setEndSkinTemp(int i) {
        this.endSkinTemp = i;
    }

    public final int getEndAlt() {
        return this.endAlt;
    }

    public final float getEndLat() {
        return this.endLat;
    }

    public final float getEndLong() {
        return this.endLong;
    }

    public final void setEndAlt(int i) {
        this.endAlt = i;
    }

    public final void setEndLat(float f) {
        this.endLat = f;
    }

    public final void setEndLong(float f) {
        this.endLong = f;
    }

    public final int getEndActivityValue1() {
        return this.endActivityValue1;
    }

    public final int getEndActivityValue2() {
        return this.endActivityValue2;
    }

    public final void setEndActivityValue1(int i) {
        this.endActivityValue1 = i;
    }

    public final void setEndActivityValue2(int i) {
        this.endActivityValue2 = i;
    }

    public java.lang.String toString() {
        return "\n--- Activity End Log print \nActivity End Log Index: " + this.endLogIndex + " Time: " + this.endLogTime + " GPS Lat (UINT32): " + ((java.lang.Object) kotlin.UInt.m152toStringimpl(kotlin.UnsignedKt.doubleToUInt(this.endLat))) + " GPS Long (UINT32) " + ((java.lang.Object) kotlin.UInt.m152toStringimpl(kotlin.UnsignedKt.doubleToUInt(this.endLong))) + " GPS Lat  (Float) : " + this.endLat + " GPS Long (Float) : " + this.endLong + " Run Steps : " + this.endStepsRunning + " Skin Temp: " + this.endSkinTemp + " Walk Steps: " + this.endStepsWalk + " Case Temp: " + this.endCaseTemp + " Distance: " + this.endLogDistance + " Act Cals: " + this.endActiveCals + " HRV: " + this.endHRV + " BMR Cals: " + this.endBMRCals + " Heart Rate: " + this.endHeartRate + " Thermal Gen: " + this.endThermalGen + " Activity 1: " + this.endActivityValue1 + " Solar Gen: " + this.endSolarGen + " Power Consumed: " + this.endPowerConsumed + " \n";
    }
}
