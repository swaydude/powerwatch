package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006¢\u0006\u0002\u0010\u001cJ\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0006HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0006HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\t\u0010g\u001a\u00020\u0006HÆ\u0003J\t\u0010h\u001a\u00020\u0006HÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003Já\u0001\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010k\u001a\u0002042\b\u0010l\u001a\u0004\u0018\u00010mHÖ\u0003J\t\u0010n\u001a\u00020\bHÖ\u0001J\t\u0010o\u001a\u00020pHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0018\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u000e\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0019\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001a\u0010\n\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001a\u0010\u0017\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001c\u00103\u001a\u0002048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u001b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u001a\u0010\u001a\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001a\u0010\r\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001a\u0010\u0013\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\u001a\u0010\u0010\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\u000b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010\u000f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010*\"\u0004\bT\u0010,¨\u0006q"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingBasePeriod;", "startTime", "", "endTime", "heartRate", "", "maxHeartRate", "", "minHeartRate", "hrv", "skinTemp", "maxSkinTemp", "minSkinTemp", "bodyPower", "solarPower", "peakTemp", "activeCalories", "monthInYear", "minsInPeriod", "restingWeeks", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;", "lastUpdated", "bmrCalories", "caseTemp", "minCaseTemp", "maxCaseTemp", "(JJFIIFFFFFFFIIILjava/util/List;JIFFF)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getEndTime", "()J", "setEndTime", "(J)V", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getLastUpdated", "setLastUpdated", "malformed", "", "getMalformed", "()Z", "setMalformed", "(Z)V", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getMonthInYear", "setMonthInYear", "getPeakTemp", "setPeakTemp", "getRestingWeeks", "()Ljava/util/List;", "setRestingWeeks", "(Ljava/util/List;)V", "getSkinTemp", "setSkinTemp", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RestingMonthPeriod implements powerwatch.matrix.com.pwgen2android.shared.data.models.RestingBasePeriod {
    private int activeCalories;
    private int bmrCalories;
    private float bodyPower;
    private float caseTemp;
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
    private int monthInYear;
    private float peakTemp;
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks;
    private float skinTemp;
    private float solarPower;
    private long startTime;

    public RestingMonthPeriod() {
        this(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 2097151, null);
    }

    public final long component1() {
        return getStartTime();
    }

    public final float component10() {
        return getBodyPower();
    }

    public final float component11() {
        return getSolarPower();
    }

    public final float component12() {
        return getPeakTemp();
    }

    public final int component13() {
        return getActiveCalories();
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMonthInYear() {
        return this.monthInYear;
    }

    public final int component15() {
        return getMinsInPeriod();
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> component16() {
        return this.restingWeeks;
    }

    public final long component17() {
        return getLastUpdated();
    }

    public final int component18() {
        return getBmrCalories();
    }

    public final float component19() {
        return getCaseTemp();
    }

    public final long component2() {
        return getEndTime();
    }

    public final float component20() {
        return getMinCaseTemp();
    }

    public final float component21() {
        return getMaxCaseTemp();
    }

    public final float component3() {
        return getHeartRate();
    }

    public final int component4() {
        return getMaxHeartRate();
    }

    public final int component5() {
        return getMinHeartRate();
    }

    public final float component6() {
        return getHrv();
    }

    public final float component7() {
        return getSkinTemp();
    }

    public final float component8() {
        return getMaxSkinTemp();
    }

    public final float component9() {
        return getMinSkinTemp();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod copy(long startTime, long endTime, float heartRate, int maxHeartRate, int minHeartRate, float hrv, float skinTemp, float maxSkinTemp, float minSkinTemp, float bodyPower, float solarPower, float peakTemp, int activeCalories, int monthInYear, int minsInPeriod, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks, long lastUpdated, int bmrCalories, float caseTemp, float minCaseTemp, float maxCaseTemp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeeks, "restingWeeks");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod(startTime, endTime, heartRate, maxHeartRate, minHeartRate, hrv, skinTemp, maxSkinTemp, minSkinTemp, bodyPower, solarPower, peakTemp, activeCalories, monthInYear, minsInPeriod, restingWeeks, lastUpdated, bmrCalories, caseTemp, minCaseTemp, maxCaseTemp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod restingMonthPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod) other;
        return getStartTime() == restingMonthPeriod.getStartTime() && getEndTime() == restingMonthPeriod.getEndTime() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getHeartRate())) && getMaxHeartRate() == restingMonthPeriod.getMaxHeartRate() && getMinHeartRate() == restingMonthPeriod.getMinHeartRate() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getHrv())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getPeakTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getPeakTemp())) && getActiveCalories() == restingMonthPeriod.getActiveCalories() && this.monthInYear == restingMonthPeriod.monthInYear && getMinsInPeriod() == restingMonthPeriod.getMinsInPeriod() && kotlin.jvm.internal.Intrinsics.areEqual(this.restingWeeks, restingMonthPeriod.restingWeeks) && getLastUpdated() == restingMonthPeriod.getLastUpdated() && getBmrCalories() == restingMonthPeriod.getBmrCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getMinCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingMonthPeriod.getMaxCaseTemp()));
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + getMaxHeartRate()) * 31) + getMinHeartRate()) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getPeakTemp())) * 31) + getActiveCalories()) * 31) + this.monthInYear) * 31) + getMinsInPeriod()) * 31) + this.restingWeeks.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getLastUpdated())) * 31) + getBmrCalories()) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp());
    }

    public java.lang.String toString() {
        return "RestingMonthPeriod(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", heartRate=" + getHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", minHeartRate=" + getMinHeartRate() + ", hrv=" + getHrv() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", peakTemp=" + getPeakTemp() + ", activeCalories=" + getActiveCalories() + ", monthInYear=" + this.monthInYear + ", minsInPeriod=" + getMinsInPeriod() + ", restingWeeks=" + this.restingWeeks + ", lastUpdated=" + getLastUpdated() + ", bmrCalories=" + getBmrCalories() + ", caseTemp=" + getCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ')';
    }

    public RestingMonthPeriod(long j, long j2, float f, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks, long j3, int i6, float f9, float f10, float f11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeeks, "restingWeeks");
        this.startTime = j;
        this.endTime = j2;
        this.heartRate = f;
        this.maxHeartRate = i;
        this.minHeartRate = i2;
        this.hrv = f2;
        this.skinTemp = f3;
        this.maxSkinTemp = f4;
        this.minSkinTemp = f5;
        this.bodyPower = f6;
        this.solarPower = f7;
        this.peakTemp = f8;
        this.activeCalories = i3;
        this.monthInYear = i4;
        this.minsInPeriod = i5;
        this.restingWeeks = restingWeeks;
        this.lastUpdated = j3;
        this.bmrCalories = i6;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getActiveCalories() {
        return this.activeCalories;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setActiveCalories(int i) {
        this.activeCalories = i;
    }

    public final int getMonthInYear() {
        return this.monthInYear;
    }

    public final void setMonthInYear(int i) {
        this.monthInYear = i;
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
    public /* synthetic */ RestingMonthPeriod(long j, long j2, float f, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, java.util.List list, long j3, int i6, float f9, float f10, float f11, int i7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j4 = (i7 & 1) != 0 ? 0L : j;
        long j5 = (i7 & 2) == 0 ? j2 : 0L;
        float f12 = (i7 & 4) != 0 ? 0.0f : f;
        int i8 = (i7 & 8) != 0 ? 0 : i;
        int i9 = (i7 & 16) != 0 ? 0 : i2;
        float f13 = (i7 & 32) != 0 ? 0.0f : f2;
        float f14 = (i7 & 64) != 0 ? 0.0f : f3;
        float f15 = (i7 & 128) != 0 ? f14 : f4;
        float f16 = (i7 & 256) != 0 ? f14 : f5;
        float f17 = (i7 & 512) != 0 ? 0.0f : f6;
        float f18 = (i7 & 1024) != 0 ? 0.0f : f7;
        float f19 = (i7 & 2048) != 0 ? 0.0f : f8;
        int i10 = (i7 & 4096) != 0 ? 0 : i3;
        int i11 = (i7 & 8192) != 0 ? 0 : i4;
        int i12 = (i7 & 16384) != 0 ? 0 : i5;
        java.util.List listEmptyList = (i7 & 32768) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        long jCurrentTimeMillis = (i7 & 65536) != 0 ? java.lang.System.currentTimeMillis() : j3;
        int i13 = (i7 & 131072) != 0 ? 0 : i6;
        float f20 = (i7 & 262144) != 0 ? 0.0f : f9;
        this(j4, j5, f12, i8, i9, f13, f14, f15, f16, f17, f18, f19, i10, i11, i12, listEmptyList, jCurrentTimeMillis, i13, f20, (i7 & 524288) != 0 ? f20 : f10, (i7 & 1048576) != 0 ? f20 : f11);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> getRestingWeeks() {
        return this.restingWeeks;
    }

    public final void setRestingWeeks(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.restingWeeks = list;
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
