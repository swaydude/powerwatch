package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006¢\u0006\u0002\u0010\u001dJ\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0006HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\t\u0010f\u001a\u00020\u0006HÆ\u0003J\t\u0010g\u001a\u00020\u0006HÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\bHÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0006HÆ\u0003J\t\u0010l\u001a\u00020\u0006HÆ\u0003J\t\u0010m\u001a\u00020\u0006HÆ\u0003Jë\u0001\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0006HÆ\u0001J\u0013\u0010o\u001a\u0002092\b\u0010p\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\bHÖ\u0001J\t\u0010s\u001a\u00020tHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0019\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\u000e\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u001a\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u001a\u0010\n\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010'R\u001a\u0010\u0018\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001c\u00108\u001a\u0002098FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u001c\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010%\"\u0004\b?\u0010'R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\u001a\u0010\u001b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001f\"\u0004\bG\u0010!R\u001a\u0010\r\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\u001a\u0010\u0014\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001f\"\u0004\bK\u0010!R\u001a\u0010\u0010\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010%\"\u0004\bM\u0010'R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010\u000b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010%\"\u0004\bS\u0010'R\u001a\u0010\u000f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010%\"\u0004\bU\u0010'R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010/\"\u0004\bW\u00101¨\u0006u"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingBasePeriod;", "startTime", "", "endTime", "heartRate", "", "maxHeartRate", "", "minHeartRate", "hrv", "skinTemp", "maxSkinTemp", "minSkinTemp", "bodyPower", "solarPower", "peakTemp", "activeCalories", "dayInWeek", "dayInMonth", "minsInPeriod", "restingHours", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "lastUpdated", "bmrCalories", "caseTemp", "minCaseTemp", "maxCaseTemp", "(JJFIIFFFFFFFIIIILjava/util/List;JIFFF)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getDayInMonth", "setDayInMonth", "getDayInWeek", "setDayInWeek", "getEndTime", "()J", "setEndTime", "(J)V", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getLastUpdated", "setLastUpdated", "malformed", "", "getMalformed", "()Z", "setMalformed", "(Z)V", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getPeakTemp", "setPeakTemp", "getRestingHours", "()Ljava/util/List;", "setRestingHours", "(Ljava/util/List;)V", "getSkinTemp", "setSkinTemp", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RestingDayPeriod implements powerwatch.matrix.com.pwgen2android.shared.data.models.RestingBasePeriod {
    private int activeCalories;
    private int bmrCalories;
    private float bodyPower;
    private float caseTemp;
    private int dayInMonth;
    private int dayInWeek;
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
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours;
    private float skinTemp;
    private float solarPower;
    private long startTime;

    public RestingDayPeriod() {
        this(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
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
    public final int getDayInWeek() {
        return this.dayInWeek;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getDayInMonth() {
        return this.dayInMonth;
    }

    public final int component16() {
        return getMinsInPeriod();
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> component17() {
        return this.restingHours;
    }

    public final long component18() {
        return getLastUpdated();
    }

    public final int component19() {
        return getBmrCalories();
    }

    public final long component2() {
        return getEndTime();
    }

    public final float component20() {
        return getCaseTemp();
    }

    public final float component21() {
        return getMinCaseTemp();
    }

    public final float component22() {
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

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod copy(long startTime, long endTime, float heartRate, int maxHeartRate, int minHeartRate, float hrv, float skinTemp, float maxSkinTemp, float minSkinTemp, float bodyPower, float solarPower, float peakTemp, int activeCalories, int dayInWeek, int dayInMonth, int minsInPeriod, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours, long lastUpdated, int bmrCalories, float caseTemp, float minCaseTemp, float maxCaseTemp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHours, "restingHours");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(startTime, endTime, heartRate, maxHeartRate, minHeartRate, hrv, skinTemp, maxSkinTemp, minSkinTemp, bodyPower, solarPower, peakTemp, activeCalories, dayInWeek, dayInMonth, minsInPeriod, restingHours, lastUpdated, bmrCalories, caseTemp, minCaseTemp, maxCaseTemp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) other;
        return getStartTime() == restingDayPeriod.getStartTime() && getEndTime() == restingDayPeriod.getEndTime() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getHeartRate())) && getMaxHeartRate() == restingDayPeriod.getMaxHeartRate() && getMinHeartRate() == restingDayPeriod.getMinHeartRate() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getHrv())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getPeakTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getPeakTemp())) && getActiveCalories() == restingDayPeriod.getActiveCalories() && this.dayInWeek == restingDayPeriod.dayInWeek && this.dayInMonth == restingDayPeriod.dayInMonth && getMinsInPeriod() == restingDayPeriod.getMinsInPeriod() && kotlin.jvm.internal.Intrinsics.areEqual(this.restingHours, restingDayPeriod.restingHours) && getLastUpdated() == restingDayPeriod.getLastUpdated() && getBmrCalories() == restingDayPeriod.getBmrCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getMinCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingDayPeriod.getMaxCaseTemp()));
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + getMaxHeartRate()) * 31) + getMinHeartRate()) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getPeakTemp())) * 31) + getActiveCalories()) * 31) + this.dayInWeek) * 31) + this.dayInMonth) * 31) + getMinsInPeriod()) * 31) + this.restingHours.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getLastUpdated())) * 31) + getBmrCalories()) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp());
    }

    public java.lang.String toString() {
        return "RestingDayPeriod(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", heartRate=" + getHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", minHeartRate=" + getMinHeartRate() + ", hrv=" + getHrv() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", peakTemp=" + getPeakTemp() + ", activeCalories=" + getActiveCalories() + ", dayInWeek=" + this.dayInWeek + ", dayInMonth=" + this.dayInMonth + ", minsInPeriod=" + getMinsInPeriod() + ", restingHours=" + this.restingHours + ", lastUpdated=" + getLastUpdated() + ", bmrCalories=" + getBmrCalories() + ", caseTemp=" + getCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ')';
    }

    public RestingDayPeriod(long j, long j2, float f, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, int i6, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours, long j3, int i7, float f9, float f10, float f11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHours, "restingHours");
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
        this.dayInWeek = i4;
        this.dayInMonth = i5;
        this.minsInPeriod = i6;
        this.restingHours = restingHours;
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

    public final int getDayInWeek() {
        return this.dayInWeek;
    }

    public final void setDayInWeek(int i) {
        this.dayInWeek = i;
    }

    public final int getDayInMonth() {
        return this.dayInMonth;
    }

    public final void setDayInMonth(int i) {
        this.dayInMonth = i;
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
    public /* synthetic */ RestingDayPeriod(long j, long j2, float f, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, int i6, java.util.List list, long j3, int i7, float f9, float f10, float f11, int i8, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j4 = (i8 & 1) != 0 ? 0L : j;
        long j5 = (i8 & 2) == 0 ? j2 : 0L;
        float f12 = (i8 & 4) != 0 ? 0.0f : f;
        int i9 = (i8 & 8) != 0 ? 0 : i;
        int i10 = (i8 & 16) != 0 ? 0 : i2;
        float f13 = (i8 & 32) != 0 ? 0.0f : f2;
        float f14 = (i8 & 64) != 0 ? 0.0f : f3;
        float f15 = (i8 & 128) != 0 ? f14 : f4;
        float f16 = (i8 & 256) != 0 ? f14 : f5;
        float f17 = (i8 & 512) != 0 ? 0.0f : f6;
        float f18 = (i8 & 1024) != 0 ? 0.0f : f7;
        float f19 = (i8 & 2048) != 0 ? 0.0f : f8;
        int i11 = (i8 & 4096) != 0 ? 0 : i3;
        int i12 = (i8 & 8192) != 0 ? 0 : i4;
        int i13 = (i8 & 16384) != 0 ? 0 : i5;
        int i14 = (i8 & 32768) != 0 ? 0 : i6;
        java.util.List listEmptyList = (i8 & 65536) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        long jCurrentTimeMillis = (i8 & 131072) != 0 ? java.lang.System.currentTimeMillis() : j3;
        int i15 = (i8 & 262144) != 0 ? 0 : i7;
        float f20 = (i8 & 524288) != 0 ? 0.0f : f9;
        this(j4, j5, f12, i9, i10, f13, f14, f15, f16, f17, f18, f19, i11, i12, i13, i14, listEmptyList, jCurrentTimeMillis, i15, f20, (i8 & 1048576) != 0 ? f20 : f10, (i8 & 2097152) != 0 ? f20 : f11);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> getRestingHours() {
        return this.restingHours;
    }

    public final void setRestingHours(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.restingHours = list;
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
