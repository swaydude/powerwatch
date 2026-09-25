package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WatchLogModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\bM\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BÍ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0002\u0010\u001eJ\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0012HÆ\u0003J\t\u0010W\u001a\u00020\u0014HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0017HÆ\u0003J\t\u0010Z\u001a\u00020\u0012HÆ\u0003J\t\u0010[\u001a\u00020\u0012HÆ\u0003J\t\u0010\\\u001a\u00020\u0012HÆ\u0003J\t\u0010]\u001a\u00020\u001cHÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0012HÆ\u0003J\t\u0010`\u001a\u00020\bHÆ\u0003J\t\u0010a\u001a\u00020\bHÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\t\u0010c\u001a\u00020\bHÆ\u0003J\t\u0010d\u001a\u00020\bHÆ\u0003J\t\u0010e\u001a\u00020\bHÆ\u0003J\t\u0010f\u001a\u00020\bHÆ\u0003JÑ\u0001\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0012HÆ\u0001J\u0013\u0010h\u001a\u00020\u00172\b\u0010i\u001a\u0004\u0018\u00010jHÖ\u0003J\t\u0010k\u001a\u00020\u0012HÖ\u0001J\t\u0010l\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0018\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001e\u0010\u001b\u001a\u00020\u001c8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001a\u0010\u0015\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001e\u0010\u000f\u001a\u00020\b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001e\u0010\u001a\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\u001a\u0010\f\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001e\u0010\u0010\u001a\u00020\b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u001e\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010&\"\u0004\bB\u0010(R\u001e\u0010\u001d\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010 \"\u0004\bD\u0010\"R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010\u000b\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\n\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010&\"\u0004\bP\u0010(R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00100\"\u0004\bR\u00102¨\u0006m"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepBaseLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;", "startTime", "", "endTime", "heartRate", "", "bodyPower", "solarPower", "skinTemp", "maxSkinTemp", "minSkinTemp", "caseTemp", "maxCaseTemp", "minCaseTemp", "activeCalories", "", "sleepType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "hrv", "shouldSend", "", "bmrCalories", "minHeartRate", "maxHeartRate", "email", "", "minsInPeriod", "(JJFFFFFFFFFILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;FZIIILjava/lang/String;I)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getShouldSend", "()Z", "setShouldSend", "(Z)V", "getSkinTemp", "setSkinTemp", "getSleepType", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "setSleepType", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)V", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SleepLog implements powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SaveSync, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.UserSpecificData {
    private int activeCalories;
    private int bmrCalories;
    private float bodyPower;
    private float caseTemp;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private java.lang.String email;
    private long endTime;
    private float heartRate;
    private float hrv;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private float maxCaseTemp;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private int maxHeartRate;
    private float maxSkinTemp;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private float minCaseTemp;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private int minHeartRate;
    private float minSkinTemp;

    @powerwatch.matrix.com.pwgen2android.shared.cloud.http.GsonExclude
    private int minsInPeriod;
    private boolean shouldSend;
    private float skinTemp;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType;
    private float solarPower;
    private long startTime;

    public final long component1() {
        return getStartTime();
    }

    public final float component10() {
        return getMaxCaseTemp();
    }

    public final float component11() {
        return getMinCaseTemp();
    }

    public final int component12() {
        return getActiveCalories();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType component13() {
        return getSleepType();
    }

    public final float component14() {
        return getHrv();
    }

    public final boolean component15() {
        return getShouldSend();
    }

    public final int component16() {
        return getBmrCalories();
    }

    public final int component17() {
        return getMinHeartRate();
    }

    public final int component18() {
        return getMaxHeartRate();
    }

    public final java.lang.String component19() {
        return getEmail();
    }

    public final long component2() {
        return getEndTime();
    }

    public final int component20() {
        return getMinsInPeriod();
    }

    public final float component3() {
        return getHeartRate();
    }

    public final float component4() {
        return getBodyPower();
    }

    public final float component5() {
        return getSolarPower();
    }

    public final float component6() {
        return getSkinTemp();
    }

    public final float component7() {
        return getMaxSkinTemp();
    }

    public final float component8() {
        return getMinSkinTemp();
    }

    public final float component9() {
        return getCaseTemp();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog copy(long startTime, long endTime, float heartRate, float bodyPower, float solarPower, float skinTemp, float maxSkinTemp, float minSkinTemp, float caseTemp, float maxCaseTemp, float minCaseTemp, int activeCalories, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, float hrv, boolean shouldSend, int bmrCalories, int minHeartRate, int maxHeartRate, java.lang.String email, int minsInPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog(startTime, endTime, heartRate, bodyPower, solarPower, skinTemp, maxSkinTemp, minSkinTemp, caseTemp, maxCaseTemp, minCaseTemp, activeCalories, sleepType, hrv, shouldSend, bmrCalories, minHeartRate, maxHeartRate, email, minsInPeriod);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) other;
        return getStartTime() == sleepLog.getStartTime() && getEndTime() == sleepLog.getEndTime() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getHeartRate())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getMaxCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getMinCaseTemp())) && getActiveCalories() == sleepLog.getActiveCalories() && getSleepType() == sleepLog.getSleepType() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(sleepLog.getHrv())) && getShouldSend() == sleepLog.getShouldSend() && getBmrCalories() == sleepLog.getBmrCalories() && getMinHeartRate() == sleepLog.getMinHeartRate() && getMaxHeartRate() == sleepLog.getMaxHeartRate() && kotlin.jvm.internal.Intrinsics.areEqual(getEmail(), sleepLog.getEmail()) && getMinsInPeriod() == sleepLog.getMinsInPeriod();
    }

    public int hashCode() {
        int iM0 = ((((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + getActiveCalories()) * 31) + getSleepType().hashCode()) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31;
        boolean shouldSend = getShouldSend();
        int i = shouldSend;
        if (shouldSend) {
            i = 1;
        }
        return ((((((((((iM0 + i) * 31) + getBmrCalories()) * 31) + getMinHeartRate()) * 31) + getMaxHeartRate()) * 31) + getEmail().hashCode()) * 31) + getMinsInPeriod();
    }

    public java.lang.String toString() {
        return "SleepLog(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", heartRate=" + getHeartRate() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", caseTemp=" + getCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", activeCalories=" + getActiveCalories() + ", sleepType=" + getSleepType() + ", hrv=" + getHrv() + ", shouldSend=" + getShouldSend() + ", bmrCalories=" + getBmrCalories() + ", minHeartRate=" + getMinHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", email=" + getEmail() + ", minsInPeriod=" + getMinsInPeriod() + ')';
    }

    public SleepLog(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, float f10, boolean z, int i2, int i3, int i4, java.lang.String email, int i5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        this.startTime = j;
        this.endTime = j2;
        this.heartRate = f;
        this.bodyPower = f2;
        this.solarPower = f3;
        this.skinTemp = f4;
        this.maxSkinTemp = f5;
        this.minSkinTemp = f6;
        this.caseTemp = f7;
        this.maxCaseTemp = f8;
        this.minCaseTemp = f9;
        this.activeCalories = i;
        this.sleepType = sleepType;
        this.hrv = f10;
        this.shouldSend = z;
        this.bmrCalories = i2;
        this.minHeartRate = i3;
        this.maxHeartRate = i4;
        this.email = email;
        this.minsInPeriod = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SleepLog(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType, float f10, boolean z, int i2, int i3, int i4, java.lang.String str, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j3 = (i6 & 1) != 0 ? 0L : j;
        long j4 = (i6 & 2) != 0 ? 0L : j2;
        float f11 = (i6 & 4) != 0 ? 0.0f : f;
        float f12 = (i6 & 8) != 0 ? 0.0f : f2;
        float f13 = (i6 & 16) != 0 ? 0.0f : f3;
        float f14 = (i6 & 32) != 0 ? 0.0f : f4;
        float f15 = (i6 & 64) != 0 ? f14 : f5;
        float f16 = (i6 & 128) != 0 ? f14 : f6;
        float f17 = (i6 & 256) != 0 ? 0.0f : f7;
        this(j3, j4, f11, f12, f13, f14, f15, f16, f17, (i6 & 512) != 0 ? f17 : f8, (i6 & 1024) != 0 ? f17 : f9, (i6 & 2048) != 0 ? 0 : i, sleepType, (i6 & 8192) != 0 ? 0.0f : f10, (i6 & 16384) != 0 ? false : z, (32768 & i6) != 0 ? 0 : i2, (65536 & i6) != 0 ? 0 : i3, (131072 & i6) != 0 ? 0 : i4, (262144 & i6) != 0 ? "" : str, (i6 & 524288) != 0 ? 0 : i5);
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
    public float getCaseTemp() {
        return this.caseTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setCaseTemp(float f) {
        this.caseTemp = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public float getMaxCaseTemp() {
        return this.maxCaseTemp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMaxCaseTemp(float f) {
        this.maxCaseTemp = f;
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
    public int getActiveCalories() {
        return this.activeCalories;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setActiveCalories(int i) {
        this.activeCalories = i;
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
    public float getHrv() {
        return this.hrv;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setHrv(float f) {
        this.hrv = f;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SaveSync
    public boolean getShouldSend() {
        return this.shouldSend;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SaveSync
    public void setShouldSend(boolean z) {
        this.shouldSend = z;
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
    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.UserSpecificData
    public java.lang.String getEmail() {
        return this.email;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.UserSpecificData
    public void setEmail(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public int getMinsInPeriod() {
        return this.minsInPeriod;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.BaseLog
    public void setMinsInPeriod(int i) {
        this.minsInPeriod = i;
    }
}
