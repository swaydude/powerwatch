package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WatchLogModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BÃ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012¢\u0006\u0002\u0010\u001cJ\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\bHÆ\u0003J\t\u0010P\u001a\u00020\u0012HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\u0015HÆ\u0003J\t\u0010S\u001a\u00020\u0012HÆ\u0003J\t\u0010T\u001a\u00020\u0012HÆ\u0003J\t\u0010U\u001a\u00020\u0012HÆ\u0003J\t\u0010V\u001a\u00020\u001aHÆ\u0003J\t\u0010W\u001a\u00020\u0012HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003JÇ\u0001\u0010`\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0012HÆ\u0001J\u0013\u0010a\u001a\u00020\u00152\b\u0010b\u001a\u0004\u0018\u00010cHÖ\u0003J\t\u0010d\u001a\u00020\u0012HÖ\u0001J\t\u0010e\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0016\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\t\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001e\u0010\u0019\u001a\u00020\u001a8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u0010\u0013\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001e\u0010\u000f\u001a\u00020\b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010\u0018\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001a\u0010\f\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001e\u0010\u0010\u001a\u00020\b8\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010$\"\u0004\b<\u0010&R\u001e\u0010\u0017\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R\u001a\u0010\r\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010&R\u001e\u0010\u001b\u001a\u00020\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\u000b\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001a\u0010\n\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010$\"\u0004\bJ\u0010&R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010.\"\u0004\bL\u00100¨\u0006f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingBaseLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SaveSync;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/UserSpecificData;", "startTime", "", "endTime", "heartRate", "", "bodyPower", "solarPower", "skinTemp", "maxSkinTemp", "minSkinTemp", "caseTemp", "maxCaseTemp", "minCaseTemp", "activeCalories", "", "hrv", "shouldSend", "", "bmrCalories", "minHeartRate", "maxHeartRate", "email", "", "minsInPeriod", "(JJFFFFFFFFFIFZIIILjava/lang/String;I)V", "getActiveCalories", "()I", "setActiveCalories", "(I)V", "getBmrCalories", "setBmrCalories", "getBodyPower", "()F", "setBodyPower", "(F)V", "getCaseTemp", "setCaseTemp", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getHeartRate", "setHeartRate", "getHrv", "setHrv", "getMaxCaseTemp", "setMaxCaseTemp", "getMaxHeartRate", "setMaxHeartRate", "getMaxSkinTemp", "setMaxSkinTemp", "getMinCaseTemp", "setMinCaseTemp", "getMinHeartRate", "setMinHeartRate", "getMinSkinTemp", "setMinSkinTemp", "getMinsInPeriod", "setMinsInPeriod", "getShouldSend", "()Z", "setShouldSend", "(Z)V", "getSkinTemp", "setSkinTemp", "getSolarPower", "setSolarPower", "getStartTime", "setStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RestingLog implements powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingBaseLog, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SaveSync, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.UserSpecificData {
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
    private float solarPower;
    private long startTime;

    public RestingLog() {
        this(0L, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, false, 0, 0, 0, null, 0, 524287, null);
    }

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

    public final float component13() {
        return getHrv();
    }

    public final boolean component14() {
        return getShouldSend();
    }

    public final int component15() {
        return getBmrCalories();
    }

    public final int component16() {
        return getMinHeartRate();
    }

    public final int component17() {
        return getMaxHeartRate();
    }

    public final java.lang.String component18() {
        return getEmail();
    }

    public final int component19() {
        return getMinsInPeriod();
    }

    public final long component2() {
        return getEndTime();
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

    public final powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog copy(long startTime, long endTime, float heartRate, float bodyPower, float solarPower, float skinTemp, float maxSkinTemp, float minSkinTemp, float caseTemp, float maxCaseTemp, float minCaseTemp, int activeCalories, float hrv, boolean shouldSend, int bmrCalories, int minHeartRate, int maxHeartRate, java.lang.String email, int minsInPeriod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog(startTime, endTime, heartRate, bodyPower, solarPower, skinTemp, maxSkinTemp, minSkinTemp, caseTemp, maxCaseTemp, minCaseTemp, activeCalories, hrv, shouldSend, bmrCalories, minHeartRate, maxHeartRate, email, minsInPeriod);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog restingLog = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog) other;
        return getStartTime() == restingLog.getStartTime() && getEndTime() == restingLog.getEndTime() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHeartRate()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getHeartRate())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getBodyPower()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getBodyPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSolarPower()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getSolarPower())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getMaxSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinSkinTemp()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getMinSkinTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMaxCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getMaxCaseTemp())) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getMinCaseTemp()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getMinCaseTemp())) && getActiveCalories() == restingLog.getActiveCalories() && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(getHrv()), (java.lang.Object) java.lang.Float.valueOf(restingLog.getHrv())) && getShouldSend() == restingLog.getShouldSend() && getBmrCalories() == restingLog.getBmrCalories() && getMinHeartRate() == restingLog.getMinHeartRate() && getMaxHeartRate() == restingLog.getMaxHeartRate() && kotlin.jvm.internal.Intrinsics.areEqual(getEmail(), restingLog.getEmail()) && getMinsInPeriod() == restingLog.getMinsInPeriod();
    }

    public int hashCode() {
        int iM0 = ((((((((((((((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getStartTime()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(getEndTime())) * 31) + java.lang.Float.floatToIntBits(getHeartRate())) * 31) + java.lang.Float.floatToIntBits(getBodyPower())) * 31) + java.lang.Float.floatToIntBits(getSolarPower())) * 31) + java.lang.Float.floatToIntBits(getSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getMinSkinTemp())) * 31) + java.lang.Float.floatToIntBits(getCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMaxCaseTemp())) * 31) + java.lang.Float.floatToIntBits(getMinCaseTemp())) * 31) + getActiveCalories()) * 31) + java.lang.Float.floatToIntBits(getHrv())) * 31;
        boolean shouldSend = getShouldSend();
        int i = shouldSend;
        if (shouldSend) {
            i = 1;
        }
        return ((((((((((iM0 + i) * 31) + getBmrCalories()) * 31) + getMinHeartRate()) * 31) + getMaxHeartRate()) * 31) + getEmail().hashCode()) * 31) + getMinsInPeriod();
    }

    public java.lang.String toString() {
        return "RestingLog(startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", heartRate=" + getHeartRate() + ", bodyPower=" + getBodyPower() + ", solarPower=" + getSolarPower() + ", skinTemp=" + getSkinTemp() + ", maxSkinTemp=" + getMaxSkinTemp() + ", minSkinTemp=" + getMinSkinTemp() + ", caseTemp=" + getCaseTemp() + ", maxCaseTemp=" + getMaxCaseTemp() + ", minCaseTemp=" + getMinCaseTemp() + ", activeCalories=" + getActiveCalories() + ", hrv=" + getHrv() + ", shouldSend=" + getShouldSend() + ", bmrCalories=" + getBmrCalories() + ", minHeartRate=" + getMinHeartRate() + ", maxHeartRate=" + getMaxHeartRate() + ", email=" + getEmail() + ", minsInPeriod=" + getMinsInPeriod() + ')';
    }

    public RestingLog(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, float f10, boolean z, int i2, int i3, int i4, java.lang.String email, int i5) {
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
        this.hrv = f10;
        this.shouldSend = z;
        this.bmrCalories = i2;
        this.minHeartRate = i3;
        this.maxHeartRate = i4;
        this.email = email;
        this.minsInPeriod = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RestingLog(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, float f10, boolean z, int i2, int i3, int i4, java.lang.String str, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        long j3 = (i6 & 1) != 0 ? 0L : j;
        long j4 = (i6 & 2) == 0 ? j2 : 0L;
        float f11 = (i6 & 4) != 0 ? 0.0f : f;
        float f12 = (i6 & 8) != 0 ? 0.0f : f2;
        float f13 = (i6 & 16) != 0 ? 0.0f : f3;
        float f14 = (i6 & 32) != 0 ? 0.0f : f4;
        float f15 = (i6 & 64) != 0 ? f14 : f5;
        float f16 = (i6 & 128) != 0 ? f14 : f6;
        float f17 = (i6 & 256) != 0 ? 0.0f : f7;
        this(j3, j4, f11, f12, f13, f14, f15, f16, f17, (i6 & 512) != 0 ? f17 : f8, (i6 & 1024) != 0 ? f17 : f9, (i6 & 2048) != 0 ? 0 : i, (i6 & 4096) != 0 ? 0.0f : f10, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? 0 : i2, (i6 & 32768) != 0 ? 0 : i3, (i6 & 65536) != 0 ? 0 : i4, (i6 & 131072) != 0 ? "" : str, (i6 & 262144) == 0 ? i5 : 0);
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
