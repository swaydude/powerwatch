package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b?\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0002\u0010 J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\bHÆ\u0003J\t\u0010g\u001a\u00020\bHÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\u0016HÆ\u0003J\t\u0010j\u001a\u00020\bHÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\bHÆ\u0003J\t\u0010o\u001a\u00020\u0006HÆ\u0003J\t\u0010p\u001a\u00020\u0006HÆ\u0003J\t\u0010q\u001a\u00020\u0006HÆ\u0003J\t\u0010r\u001a\u00020\u0006HÆ\u0003J\t\u0010s\u001a\u00020\bHÆ\u0003J\t\u0010t\u001a\u00020\bHÆ\u0003J\t\u0010u\u001a\u00020\u0006HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\t\u0010w\u001a\u00020\u0006HÆ\u0003J\t\u0010x\u001a\u00020\u0006HÆ\u0003Jÿ\u0001\u0010y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010z\u001a\u00020<2\b\u0010{\u001a\u0004\u0018\u00010|HÖ\u0003J\t\u0010}\u001a\u00020\bHÖ\u0001J\t\u0010~\u001a\u00020\u007fHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u001c\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u000e\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u001d\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\u001a\u0010\n\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u001a\u0010\u001b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\u001c\u0010;\u001a\u00020<8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u001f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010*R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001a\u0010\f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*R\u001a\u0010\u001e\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010(\"\u0004\bH\u0010*R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010$R\u001a\u0010\r\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R\u001a\u0010\u0017\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\"\"\u0004\bN\u0010$R\u001a\u0010\u0010\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010(\"\u0004\bP\u0010*R\u001a\u0010\u0014\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010$R\u001a\u0010\u000b\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010(\"\u0004\bT\u0010*R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010\u000f\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010(\"\u0004\b^\u0010*R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u00102\"\u0004\b`\u00104¨\u0006\u0080\u0001"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepBasePeriod;", "startTime", "", "endTime", "heartRate", "", "maxHeartRate", "", "minHeartRate", "hrv", "skinTemp", "maxSkinTemp", "minSkinTemp", "bodyPower", "solarPower", "peakTemp", "activeCalories", "dayInWeek", "dayInMonth", "restlessMinutes", "sleepType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "minsInPeriod", "sleepHours", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "lastUpdated", "bmrCalories", "caseTemp", "minCaseTemp", "maxCaseTemp", "(JJFIIFFFFFFFIIIILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILjava/util/List;JIFFF)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getDayInMonth", "setDayInMonth", "getDayInWeek", "setDayInWeek", "getEndTime", "()J", "setEndTime", "(J)V", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getLastUpdated", "setLastUpdated", "malformed", "", "getMalformed", "()Z", "setMalformed", "(Z)V", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getPeakTemp", "setPeakTemp", "getRestlessMinutes", "setRestlessMinutes", "getSkinTemp", "setSkinTemp", "getSleepHours", "()Ljava/util/List;", "setSleepHours", "(Ljava/util/List;)V", "getSleepType", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "setSleepType", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)V", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SleepDayPeriod implements powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod {
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
    private int restlessMinutes;
    private float skinTemp;
    private java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType;
    private float solarPower;
    private long startTime;

    public SleepDayPeriod() {
        this(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
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
        return getRestlessMinutes();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType component17() {
        return getSleepType();
    }

    public final int component18() {
        return getMinsInPeriod();
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> component19() {
        return this.sleepHours;
    }

    public final long component2() {
        return getEndTime();
    }

    public final long component20() {
        return getLastUpdated();
    }

    public final int component21() {
        return getBmrCalories();
    }

    public final float component22() {
        return getCaseTemp();
    }

    public final float component23() {
        return getMinCaseTemp();
    }

    public final float component24() {
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

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod copy(long startTime, long endTime, float heartRate, int maxHeartRate, int minHeartRate, float hrv, float skinTemp, float maxSkinTemp, float minSkinTemp, float bodyPower, float solarPower, float peakTemp, int activeCalories, int dayInWeek, int dayInMonth, int restlessMinutes, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, int minsInPeriod, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours, long lastUpdated, int bmrCalories, float caseTemp, float minCaseTemp, float maxCaseTemp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHours, "sleepHours");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(startTime, endTime, heartRate, maxHeartRate, minHeartRate, hrv, skinTemp, maxSkinTemp, minSkinTemp, bodyPower, solarPower, peakTemp, activeCalories, dayInWeek, dayInMonth, restlessMinutes, sleepType, minsInPeriod, sleepHours, lastUpdated, bmrCalories, caseTemp, minCaseTemp, maxCaseTemp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) other;
        return getStartTime() == sleepDayPeriod.getStartTime() && getEndTime() == sleepDayPeriod.getEndTime() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getHeartRate())) && getMaxHeartRate() == sleepDayPeriod.getMaxHeartRate() && getMinHeartRate() == sleepDayPeriod.getMinHeartRate() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getHrv())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getPeakTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getPeakTemp())) && getActiveCalories() == sleepDayPeriod.getActiveCalories() && this.dayInWeek == sleepDayPeriod.dayInWeek && this.dayInMonth == sleepDayPeriod.dayInMonth && getRestlessMinutes() == sleepDayPeriod.getRestlessMinutes() && getSleepType() == sleepDayPeriod.getSleepType() && getMinsInPeriod() == sleepDayPeriod.getMinsInPeriod() && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepHours, sleepDayPeriod.sleepHours) && getLastUpdated() == sleepDayPeriod.getLastUpdated() && getBmrCalories() == sleepDayPeriod.getBmrCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getMinCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepDayPeriod.getMaxCaseTemp()));
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + getMaxHeartRate()) * 31) + getMinHeartRate()) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getPeakTemp())) * 31) + getActiveCalories()) * 31) + this.dayInWeek) * 31) + this.dayInMonth) * 31) + getRestlessMinutes()) * 31) + getSleepType().hashCode()) * 31) + getMinsInPeriod()) * 31) + this.sleepHours.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getLastUpdated())) * 31) + getBmrCalories()) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp());
    }

    public java.lang.String toString() {
        return "SleepDayPeriod(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", heartRate=" + getHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", minHeartRate=" + getMinHeartRate() + ", hrv=" + getHrv() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", peakTemp=" + getPeakTemp() + ", activeCalories=" + getActiveCalories() + ", dayInWeek=" + this.dayInWeek + ", dayInMonth=" + this.dayInMonth + ", restlessMinutes=" + getRestlessMinutes() + ", sleepType=" + getSleepType() + ", minsInPeriod=" + getMinsInPeriod() + ", sleepHours=" + this.sleepHours + ", lastUpdated=" + getLastUpdated() + ", bmrCalories=" + getBmrCalories() + ", caseTemp=" + getCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ')';
    }

    public SleepDayPeriod(long j, long j2, float f, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, int i6, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, int i7, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours, long j3, int i8, float f9, float f10, float f11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHours, "sleepHours");
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
        this.restlessMinutes = i6;
        this.sleepType = sleepType;
        this.minsInPeriod = i7;
        this.sleepHours = sleepHours;
        this.lastUpdated = j3;
        this.bmrCalories = i8;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod
    public int getRestlessMinutes() {
        return this.restlessMinutes;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.models.SleepBasePeriod
    public void setRestlessMinutes(int i) {
        this.restlessMinutes = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SleepDayPeriod(long j, long j2, float f, int i, int i2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i3, int i4, int i5, int i6, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, int i7, java.util.List list, long j3, int i8, float f9, float f10, float f11, int i9, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j4 = (i9 & 1) != 0 ? 0L : j;
        long j5 = (i9 & 2) == 0 ? j2 : 0L;
        float f12 = (i9 & 4) != 0 ? 0.0f : f;
        int i10 = (i9 & 8) != 0 ? 0 : i;
        int i11 = (i9 & 16) != 0 ? 0 : i2;
        float f13 = (i9 & 32) != 0 ? 0.0f : f2;
        float f14 = (i9 & 64) != 0 ? 0.0f : f3;
        float f15 = (i9 & 128) != 0 ? f14 : f4;
        float f16 = (i9 & 256) != 0 ? f14 : f5;
        float f17 = (i9 & 512) != 0 ? 0.0f : f6;
        float f18 = (i9 & 1024) != 0 ? 0.0f : f7;
        float f19 = (i9 & 2048) != 0 ? 0.0f : f8;
        int i12 = (i9 & 4096) != 0 ? 0 : i3;
        int i13 = (i9 & 8192) != 0 ? 0 : i4;
        int i14 = (i9 & 16384) != 0 ? 0 : i5;
        int i15 = (i9 & 32768) != 0 ? 0 : i6;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType2 = (i9 & 65536) != 0 ? powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE : sleepType;
        int i16 = (i9 & 131072) != 0 ? 0 : i7;
        java.util.List listEmptyList = (i9 & 262144) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        long jCurrentTimeMillis = (i9 & 524288) != 0 ? java.lang.System.currentTimeMillis() : j3;
        int i17 = (i9 & 1048576) != 0 ? 0 : i8;
        float f20 = (i9 & 2097152) != 0 ? 0.0f : f9;
        this(j4, j5, f12, i10, i11, f13, f14, f15, f16, f17, f18, f19, i12, i13, i14, i15, sleepType2, i16, listEmptyList, jCurrentTimeMillis, i17, f20, (i9 & 4194304) != 0 ? f20 : f10, (i9 & 8388608) != 0 ? f20 : f11);
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMinsInPeriod() {
        return this.minsInPeriod;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinsInPeriod(int i) {
        this.minsInPeriod = i;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> getSleepHours() {
        return this.sleepHours;
    }

    public final void setSleepHours(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepHours = list;
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
