package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0002\u0010\u001fJ\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\bHÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\u0013HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\bHÆ\u0003J\t\u0010m\u001a\u00020\bHÆ\u0003J\t\u0010n\u001a\u00020\u0006HÆ\u0003J\t\u0010o\u001a\u00020\bHÆ\u0003J\t\u0010p\u001a\u00020\u0006HÆ\u0003J\t\u0010q\u001a\u00020\u0006HÆ\u0003J\t\u0010r\u001a\u00020\bHÆ\u0003J\t\u0010s\u001a\u00020\bHÆ\u0003J\t\u0010t\u001a\u00020\bHÆ\u0003Jõ\u0001\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\bHÆ\u0001J\u0013\u0010v\u001a\u00020;2\b\u0010w\u001a\u0004\u0018\u00010xHÖ\u0003J\t\u0010y\u001a\u00020\u0006HÖ\u0001J\t\u0010z\u001a\u00020{HÖ\u0001R\u001a\u0010\u0014\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u001b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u000f\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u001c\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u001a\u0010\u000b\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R\u001a\u0010\u001a\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\u001c\u0010:\u001a\u00020;8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010\u001e\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\u001a\u0010\t\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010'\"\u0004\bE\u0010)R\u001a\u0010\u001d\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010'\"\u0004\bG\u0010)R\u001a\u0010\n\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#R\u001a\u0010\u000e\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010'\"\u0004\bK\u0010)R\u001a\u0010\u0016\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010!\"\u0004\bM\u0010#R\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010'\"\u0004\bO\u0010)R\u001a\u0010\f\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010)R\u001a\u0010\u0010\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010'\"\u0004\bS\u0010)R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00101\"\u0004\bU\u00103R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010!\"\u0004\b]\u0010#¨\u0006|"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingBasePeriod;", "startTime", "", "endTime", "steps", "", "heartRate", "", "maxHeartRate", "minHeartRate", "hrv", "skinTemp", "maxSkinTemp", "minSkinTemp", "bodyPower", "solarPower", "peakTemp", "distance", "", "activeCalories", "weekInMonth", "minsInPeriod", "walkingDays", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "lastUpdated", "bmrCalories", "caseTemp", "minCaseTemp", "maxCaseTemp", "(JJIFIIFFFFFFFDIIILjava/util/List;JIFFF)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getDistance", "()D", "setDistance", "(D)V", "getEndTime", "()J", "setEndTime", "(J)V", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getLastUpdated", "setLastUpdated", "malformed", "", "getMalformed", "()Z", "setMalformed", "(Z)V", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getPeakTemp", "setPeakTemp", "getSkinTemp", "setSkinTemp", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "getSteps", "setSteps", "getWalkingDays", "()Ljava/util/List;", "setWalkingDays", "(Ljava/util/List;)V", "getWeekInMonth", "setWeekInMonth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WalkingWeekPeriod implements powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingBasePeriod {
    private int activeCalories;
    private int bmrCalories;
    private float bodyPower;
    private float caseTemp;
    private double distance;
    private long endTime;
    private float heartRate;
    private float hrv;
    private long lastUpdated;
    private boolean malformed;
    private float maxCaseTemp;
    private int maxHeartRate;
    private float maxSkinTemp;
    private float minCaseTemp;
    private int minHeartRate;
    private float minSkinTemp;
    private int minsInPeriod;
    private float peakTemp;
    private float skinTemp;
    private float solarPower;
    private long startTime;
    private int steps;
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays;
    private int weekInMonth;

    public WalkingWeekPeriod() {
        this(0L, 0L, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0d, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 8388607, null);
    }

    public final long component1() {
        return getStartTime();
    }

    public final float component10() {
        return getMinSkinTemp();
    }

    public final float component11() {
        return getBodyPower();
    }

    public final float component12() {
        return getSolarPower();
    }

    public final float component13() {
        return getPeakTemp();
    }

    public final double component14() {
        return getDistance();
    }

    public final int component15() {
        return getActiveCalories();
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getWeekInMonth() {
        return this.weekInMonth;
    }

    public final int component17() {
        return getMinsInPeriod();
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> component18() {
        return this.walkingDays;
    }

    public final long component19() {
        return getLastUpdated();
    }

    public final long component2() {
        return getEndTime();
    }

    public final int component20() {
        return getBmrCalories();
    }

    public final float component21() {
        return getCaseTemp();
    }

    public final float component22() {
        return getMinCaseTemp();
    }

    public final float component23() {
        return getMaxCaseTemp();
    }

    public final int component3() {
        return getSteps();
    }

    public final float component4() {
        return getHeartRate();
    }

    public final int component5() {
        return getMaxHeartRate();
    }

    public final int component6() {
        return getMinHeartRate();
    }

    public final float component7() {
        return getHrv();
    }

    public final float component8() {
        return getSkinTemp();
    }

    public final float component9() {
        return getMaxSkinTemp();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod copy(long startTime, long endTime, int steps, float heartRate, int maxHeartRate, int minHeartRate, float hrv, float skinTemp, float maxSkinTemp, float minSkinTemp, float bodyPower, float solarPower, float peakTemp, double distance, int activeCalories, int weekInMonth, int minsInPeriod, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays, long lastUpdated, int bmrCalories, float caseTemp, float minCaseTemp, float maxCaseTemp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDays, "walkingDays");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod(startTime, endTime, steps, heartRate, maxHeartRate, minHeartRate, hrv, skinTemp, maxSkinTemp, minSkinTemp, bodyPower, solarPower, peakTemp, distance, activeCalories, weekInMonth, minsInPeriod, walkingDays, lastUpdated, bmrCalories, caseTemp, minCaseTemp, maxCaseTemp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod walkingWeekPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod) other;
        return getStartTime() == walkingWeekPeriod.getStartTime() && getEndTime() == walkingWeekPeriod.getEndTime() && getSteps() == walkingWeekPeriod.getSteps() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getHeartRate())) && getMaxHeartRate() == walkingWeekPeriod.getMaxHeartRate() && getMinHeartRate() == walkingWeekPeriod.getMinHeartRate() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getHrv())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getPeakTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getPeakTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(getDistance()), (java.lang.Object) java.lang.Double.valueOf(walkingWeekPeriod.getDistance())) && getActiveCalories() == walkingWeekPeriod.getActiveCalories() && this.weekInMonth == walkingWeekPeriod.weekInMonth && getMinsInPeriod() == walkingWeekPeriod.getMinsInPeriod() && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingDays, walkingWeekPeriod.walkingDays) && getLastUpdated() == walkingWeekPeriod.getLastUpdated() && getBmrCalories() == walkingWeekPeriod.getBmrCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getMinCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(walkingWeekPeriod.getMaxCaseTemp()));
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + getSteps()) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + getMaxHeartRate()) * 31) + getMinHeartRate()) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getPeakTemp())) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(getDistance())) * 31) + getActiveCalories()) * 31) + this.weekInMonth) * 31) + getMinsInPeriod()) * 31) + this.walkingDays.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getLastUpdated())) * 31) + getBmrCalories()) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp());
    }

    public java.lang.String toString() {
        return "WalkingWeekPeriod(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", steps=" + getSteps() + ", heartRate=" + getHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", minHeartRate=" + getMinHeartRate() + ", hrv=" + getHrv() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", peakTemp=" + getPeakTemp() + ", distance=" + getDistance() + ", activeCalories=" + getActiveCalories() + ", weekInMonth=" + this.weekInMonth + ", minsInPeriod=" + getMinsInPeriod() + ", walkingDays=" + this.walkingDays + ", lastUpdated=" + getLastUpdated() + ", bmrCalories=" + getBmrCalories() + ", caseTemp=" + getCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ')';
    }

    public WalkingWeekPeriod(long j, long j2, int i, float f, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, double d, int i4, int i5, int i6, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays, long j3, int i7, float f9, float f10, float f11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDays, "walkingDays");
        this.startTime = j;
        this.endTime = j2;
        this.steps = i;
        this.heartRate = f;
        this.maxHeartRate = i2;
        this.minHeartRate = i3;
        this.hrv = f2;
        this.skinTemp = f3;
        this.maxSkinTemp = f4;
        this.minSkinTemp = f5;
        this.bodyPower = f6;
        this.solarPower = f7;
        this.peakTemp = f8;
        this.distance = d;
        this.activeCalories = i4;
        this.weekInMonth = i5;
        this.minsInPeriod = i6;
        this.walkingDays = walkingDays;
        this.lastUpdated = j3;
        this.bmrCalories = i7;
        this.caseTemp = f9;
        this.minCaseTemp = f10;
        this.maxCaseTemp = f11;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public long getStartTime() {
        return this.startTime;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public void setStartTime(long j) {
        this.startTime = j;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public long getEndTime() {
        return this.endTime;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.BaseTimePeriod
    public void setEndTime(long j) {
        this.endTime = j;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog
    public int getSteps() {
        return this.steps;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog
    public void setSteps(int i) {
        this.steps = i;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getHrv() {
        return this.hrv;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setHrv(float f) {
        this.hrv = f;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog
    public double getDistance() {
        return this.distance;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingBaseLog
    public void setDistance(double d) {
        this.distance = d;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getActiveCalories() {
        return this.activeCalories;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setActiveCalories(int i) {
        this.activeCalories = i;
    }

    public final int getWeekInMonth() {
        return this.weekInMonth;
    }

    public final void setWeekInMonth(int i) {
        this.weekInMonth = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMinsInPeriod() {
        return this.minsInPeriod;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinsInPeriod(int i) {
        this.minsInPeriod = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WalkingWeekPeriod(long j, long j2, int i, float f, int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, double d, int i4, int i5, int i6, java.util.List list, long j3, int i7, float f9, float f10, float f11, int i8, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j4 = (i8 & 1) != 0 ? 0L : j;
        long j5 = (i8 & 2) == 0 ? j2 : 0L;
        int i9 = (i8 & 4) != 0 ? 0 : i;
        float f12 = (i8 & 8) != 0 ? 0.0f : f;
        int i10 = (i8 & 16) != 0 ? 0 : i2;
        int i11 = (i8 & 32) != 0 ? 0 : i3;
        float f13 = (i8 & 64) != 0 ? 0.0f : f2;
        float f14 = (i8 & 128) != 0 ? 0.0f : f3;
        float f15 = (i8 & 256) != 0 ? f14 : f4;
        float f16 = (i8 & 512) != 0 ? f14 : f5;
        float f17 = (i8 & 1024) != 0 ? 0.0f : f6;
        float f18 = (i8 & 2048) != 0 ? 0.0f : f7;
        float f19 = (i8 & 4096) != 0 ? 0.0f : f8;
        double d2 = (i8 & 8192) != 0 ? 0.0d : d;
        int i12 = (i8 & 16384) != 0 ? 0 : i4;
        int i13 = (i8 & 32768) != 0 ? 0 : i5;
        int i14 = (i8 & 65536) != 0 ? 0 : i6;
        java.util.List listEmptyList = (i8 & 131072) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        long jCurrentTimeMillis = (i8 & 262144) != 0 ? java.lang.System.currentTimeMillis() : j3;
        int i15 = (i8 & 524288) != 0 ? 0 : i7;
        float f20 = (i8 & 1048576) != 0 ? 0.0f : f9;
        this(j4, j5, i9, f12, i10, i11, f13, f14, f15, f16, f17, f18, f19, d2, i12, i13, i14, listEmptyList, jCurrentTimeMillis, i15, f20, (i8 & 2097152) != 0 ? f20 : f10, (i8 & 4194304) != 0 ? f20 : f11);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> getWalkingDays() {
        return this.walkingDays;
    }

    public final void setWalkingDays(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.walkingDays = list;
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

    public final void setMalformed(boolean z) {
        this.malformed = z;
    }

    public final boolean getMalformed() {
        return this.malformed && getStartTime() > 0;
    }
}
