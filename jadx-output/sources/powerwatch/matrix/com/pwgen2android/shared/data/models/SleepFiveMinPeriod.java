package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cJ\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0010HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\bHÆ\u0003Jå\u0001\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010kHÖ\u0003J\t\u0010l\u001a\u00020\u0005HÖ\u0001J\t\u0010m\u001a\u00020nHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0017\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\f\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0018\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u0011\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001a\u0010\u0012\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001a\u0010\u000b\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u0010\u0015\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001a\u0010\u001a\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001a\u0010\u0013\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001a\u0010\u0019\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u001a\u0010\u0014\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001a\u0010\n\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001a\u0010\u0016\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001a\u0010\u000e\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001a\u0010\u001b\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010$\"\u0004\bN\u0010&R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010*\"\u0004\bP\u0010,¨\u0006o"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;", "startTime", "", "fiveMinsInHour", "", "activeCalories", "skinTemp", "", "maxSkinTemp", "minSkinTemp", "hrv", "bodyPower", "solarPower", "peakTemp", "sleepType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "endTime", "heartRate", "maxHeartRate", "minHeartRate", "lastUpdated", "minsInPeriod", "bmrCalories", "caseTemp", "minCaseTemp", "maxCaseTemp", "restlessMinutes", "(JIIFFFFFFFLpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;JFIIJIIFFFI)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getEndTime", "()J", "setEndTime", "(J)V", "getFiveMinsInHour", "setFiveMinsInHour", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getLastUpdated", "setLastUpdated", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getPeakTemp", "setPeakTemp", "getRestlessMinutes", "setRestlessMinutes", "getSkinTemp", "setSkinTemp", "getSleepType", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "setSleepType", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)V", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SleepFiveMinPeriod implements powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod {
    private int activeCalories;
    private int bmrCalories;
    private float bodyPower;
    private float caseTemp;
    private long endTime;
    private int fiveMinsInHour;
    private float heartRate;
    private float hrv;
    private long lastUpdated;
    private float maxCaseTemp;
    private int maxHeartRate;
    private float maxSkinTemp;
    private float minCaseTemp;
    private int minHeartRate;
    private float minSkinTemp;
    private int minsInPeriod;
    private float peakTemp;
    private int restlessMinutes;
    private float skinTemp;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType;
    private float solarPower;
    private long startTime;

    public SleepFiveMinPeriod() {
        this(0L, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0L, 0.0f, 0, 0, 0L, 0, 0, 0.0f, 0.0f, 0.0f, 0, 4194303, null);
    }

    public final long component1() {
        return getStartTime();
    }

    public final float component10() {
        return getPeakTemp();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType component11() {
        return getSleepType();
    }

    public final long component12() {
        return getEndTime();
    }

    public final float component13() {
        return getHeartRate();
    }

    public final int component14() {
        return getMaxHeartRate();
    }

    public final int component15() {
        return getMinHeartRate();
    }

    public final long component16() {
        return getLastUpdated();
    }

    public final int component17() {
        return getMinsInPeriod();
    }

    public final int component18() {
        return getBmrCalories();
    }

    public final float component19() {
        return getCaseTemp();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFiveMinsInHour() {
        return this.fiveMinsInHour;
    }

    public final float component20() {
        return getMinCaseTemp();
    }

    public final float component21() {
        return getMaxCaseTemp();
    }

    public final int component22() {
        return getRestlessMinutes();
    }

    public final int component3() {
        return getActiveCalories();
    }

    public final float component4() {
        return getSkinTemp();
    }

    public final float component5() {
        return getMaxSkinTemp();
    }

    public final float component6() {
        return getMinSkinTemp();
    }

    public final float component7() {
        return getHrv();
    }

    public final float component8() {
        return getBodyPower();
    }

    public final float component9() {
        return getSolarPower();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod copy(long startTime, int fiveMinsInHour, int activeCalories, float skinTemp, float maxSkinTemp, float minSkinTemp, float hrv, float bodyPower, float solarPower, float peakTemp, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, long endTime, float heartRate, int maxHeartRate, int minHeartRate, long lastUpdated, int minsInPeriod, int bmrCalories, float caseTemp, float minCaseTemp, float maxCaseTemp, int restlessMinutes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod(startTime, fiveMinsInHour, activeCalories, skinTemp, maxSkinTemp, minSkinTemp, hrv, bodyPower, solarPower, peakTemp, sleepType, endTime, heartRate, maxHeartRate, minHeartRate, lastUpdated, minsInPeriod, bmrCalories, caseTemp, minCaseTemp, maxCaseTemp, restlessMinutes);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod sleepFiveMinPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod) other;
        return getStartTime() == sleepFiveMinPeriod.getStartTime() && this.fiveMinsInHour == sleepFiveMinPeriod.fiveMinsInHour && getActiveCalories() == sleepFiveMinPeriod.getActiveCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getHrv())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getPeakTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getPeakTemp())) && getSleepType() == sleepFiveMinPeriod.getSleepType() && getEndTime() == sleepFiveMinPeriod.getEndTime() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getHeartRate())) && getMaxHeartRate() == sleepFiveMinPeriod.getMaxHeartRate() && getMinHeartRate() == sleepFiveMinPeriod.getMinHeartRate() && getLastUpdated() == sleepFiveMinPeriod.getLastUpdated() && getMinsInPeriod() == sleepFiveMinPeriod.getMinsInPeriod() && getBmrCalories() == sleepFiveMinPeriod.getBmrCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getMinCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepFiveMinPeriod.getMaxCaseTemp())) && getRestlessMinutes() == sleepFiveMinPeriod.getRestlessMinutes();
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + this.fiveMinsInHour) * 31) + getActiveCalories()) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getPeakTemp())) * 31) + getSleepType().hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + getMaxHeartRate()) * 31) + getMinHeartRate()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getLastUpdated())) * 31) + getMinsInPeriod()) * 31) + getBmrCalories()) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp())) * 31) + getRestlessMinutes();
    }

    public java.lang.String toString() {
        return "SleepFiveMinPeriod(startTime=" + getStartTime() + ", fiveMinsInHour=" + this.fiveMinsInHour + ", activeCalories=" + getActiveCalories() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", hrv=" + getHrv() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", peakTemp=" + getPeakTemp() + ", sleepType=" + getSleepType() + ", endTime=" + getEndTime() + ", heartRate=" + getHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", minHeartRate=" + getMinHeartRate() + ", lastUpdated=" + getLastUpdated() + ", minsInPeriod=" + getMinsInPeriod() + ", bmrCalories=" + getBmrCalories() + ", caseTemp=" + getCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ", restlessMinutes=" + getRestlessMinutes() + ')';
    }

    public SleepFiveMinPeriod(long j, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, long j2, float f8, int i3, int i4, long j3, int i5, int i6, float f9, float f10, float f11, int i7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        this.startTime = j;
        this.fiveMinsInHour = i;
        this.activeCalories = i2;
        this.skinTemp = f;
        this.maxSkinTemp = f2;
        this.minSkinTemp = f3;
        this.hrv = f4;
        this.bodyPower = f5;
        this.solarPower = f6;
        this.peakTemp = f7;
        this.sleepType = sleepType;
        this.endTime = j2;
        this.heartRate = f8;
        this.maxHeartRate = i3;
        this.minHeartRate = i4;
        this.lastUpdated = j3;
        this.minsInPeriod = i5;
        this.bmrCalories = i6;
        this.caseTemp = f9;
        this.minCaseTemp = f10;
        this.maxCaseTemp = f11;
        this.restlessMinutes = i7;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public long getStartTime() {
        return this.startTime;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public void setStartTime(long j) {
        this.startTime = j;
    }

    public final int getFiveMinsInHour() {
        return this.fiveMinsInHour;
    }

    public final void setFiveMinsInHour(int i) {
        this.fiveMinsInHour = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getActiveCalories() {
        return this.activeCalories;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setActiveCalories(int i) {
        this.activeCalories = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getSkinTemp() {
        return this.skinTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setSkinTemp(float f) {
        this.skinTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getMaxSkinTemp() {
        return this.maxSkinTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMaxSkinTemp(float f) {
        this.maxSkinTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getMinSkinTemp() {
        return this.minSkinTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinSkinTemp(float f) {
        this.minSkinTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getHrv() {
        return this.hrv;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setHrv(float f) {
        this.hrv = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getBodyPower() {
        return this.bodyPower;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setBodyPower(float f) {
        this.bodyPower = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getSolarPower() {
        return this.solarPower;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setSolarPower(float f) {
        this.solarPower = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod
    public float getPeakTemp() {
        return this.peakTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseActivityPeriod
    public void setPeakTemp(float f) {
        this.peakTemp = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SleepFiveMinPeriod(long j, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, long j2, float f8, int i3, int i4, long j3, int i5, int i6, float f9, float f10, float f11, int i7, int i8, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j4 = (i8 & 1) != 0 ? 0L : j;
        int i9 = (i8 & 2) != 0 ? 0 : i;
        int i10 = (i8 & 4) != 0 ? 0 : i2;
        float f12 = (i8 & 8) != 0 ? 0.0f : f;
        float f13 = (i8 & 16) != 0 ? f12 : f2;
        float f14 = (i8 & 32) != 0 ? f12 : f3;
        float f15 = (i8 & 64) != 0 ? 0.0f : f4;
        float f16 = (i8 & 128) != 0 ? 0.0f : f5;
        float f17 = (i8 & 256) != 0 ? 0.0f : f6;
        float f18 = (i8 & 512) != 0 ? 0.0f : f7;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType2 = (i8 & 1024) != 0 ? powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.LIGHT : sleepType;
        long j5 = (i8 & 2048) != 0 ? 0L : j2;
        float f19 = (i8 & 4096) != 0 ? 0.0f : f8;
        int i11 = (i8 & 8192) != 0 ? 0 : i3;
        int i12 = (i8 & 16384) != 0 ? 0 : i4;
        long j6 = (i8 & 32768) != 0 ? 0L : j3;
        int i13 = (i8 & 65536) != 0 ? 0 : i5;
        int i14 = (i8 & 131072) != 0 ? 0 : i6;
        float f20 = (i8 & 262144) != 0 ? 0.0f : f9;
        this(j4, i9, i10, f12, f13, f14, f15, f16, f17, f18, sleepType2, j5, f19, i11, i12, j6, i13, i14, f20, (i8 & 524288) != 0 ? f20 : f10, (i8 & 1048576) != 0 ? f20 : f11, (i8 & 2097152) != 0 ? 0 : i7);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog
    public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType getSleepType() {
        return this.sleepType;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog
    public void setSleepType(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "<set-?>");
        this.sleepType = sleepType;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public long getEndTime() {
        return this.endTime;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public void setEndTime(long j) {
        this.endTime = j;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getHeartRate() {
        return this.heartRate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setHeartRate(float f) {
        this.heartRate = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.CacheTimePeriod
    public long getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.CacheTimePeriod
    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMinsInPeriod() {
        return this.minsInPeriod;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinsInPeriod(int i) {
        this.minsInPeriod = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getBmrCalories() {
        return this.bmrCalories;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setBmrCalories(int i) {
        this.bmrCalories = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getCaseTemp() {
        return this.caseTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setCaseTemp(float f) {
        this.caseTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getMinCaseTemp() {
        return this.minCaseTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinCaseTemp(float f) {
        this.minCaseTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getMaxCaseTemp() {
        return this.maxCaseTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMaxCaseTemp(float f) {
        this.maxCaseTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod
    public int getRestlessMinutes() {
        return this.restlessMinutes;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod
    public void setRestlessMinutes(int i) {
        this.restlessMinutes = i;
    }
}
