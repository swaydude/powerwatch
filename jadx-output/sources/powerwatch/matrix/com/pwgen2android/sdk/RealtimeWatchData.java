package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: RealtimeDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003Jo\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0006\u0010<\u001a\u000209J\t\u0010=\u001a\u00020>HÖ\u0001R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"¨\u0006?"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "", "totalSteps", "", "totalActiveCalories", "totalSleep", "totalDistance", "", "totalSolarPower", "totalThermalPower", "heartRate", "", "skinTemp", "batteryPercent", "settingsData", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "(IIIFIIJFFLpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V", "getBatteryPercent", "()F", "setBatteryPercent", "(F)V", "getHeartRate", "()J", "setHeartRate", "(J)V", "getSettingsData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "setSettingsData", "(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;)V", "getSkinTemp", "setSkinTemp", "getTotalActiveCalories", "()I", "setTotalActiveCalories", "(I)V", "getTotalDistance", "setTotalDistance", "getTotalSleep", "setTotalSleep", "getTotalSolarPower", "setTotalSolarPower", "getTotalSteps", "setTotalSteps", "getTotalThermalPower", "setTotalThermalPower", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "isBatteryValid", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RealtimeWatchData {
    private float batteryPercent;
    private long heartRate;
    private powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData;
    private float skinTemp;
    private int totalActiveCalories;
    private float totalDistance;
    private int totalSleep;
    private int totalSolarPower;
    private int totalSteps;
    private int totalThermalPower;

    public RealtimeWatchData() {
        this(0, 0, 0, 0.0f, 0, 0, 0L, 0.0f, 0.0f, null, 1023, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData getSettingsData() {
        return this.settingsData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalActiveCalories() {
        return this.totalActiveCalories;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalSleep() {
        return this.totalSleep;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalSolarPower() {
        return this.totalSolarPower;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalThermalPower() {
        return this.totalThermalPower;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getSkinTemp() {
        return this.skinTemp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getBatteryPercent() {
        return this.batteryPercent;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData copy(int totalSteps, int totalActiveCalories, int totalSleep, float totalDistance, int totalSolarPower, int totalThermalPower, long heartRate, float skinTemp, float batteryPercent, powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        return new powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData(totalSteps, totalActiveCalories, totalSleep, totalDistance, totalSolarPower, totalThermalPower, heartRate, skinTemp, batteryPercent, settingsData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData = (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) other;
        return this.totalSteps == realtimeWatchData.totalSteps && this.totalActiveCalories == realtimeWatchData.totalActiveCalories && this.totalSleep == realtimeWatchData.totalSleep && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.totalDistance), (java.lang.Object) java.lang.Float.valueOf(realtimeWatchData.totalDistance)) && this.totalSolarPower == realtimeWatchData.totalSolarPower && this.totalThermalPower == realtimeWatchData.totalThermalPower && this.heartRate == realtimeWatchData.heartRate && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.skinTemp), (java.lang.Object) java.lang.Float.valueOf(realtimeWatchData.skinTemp)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.batteryPercent), (java.lang.Object) java.lang.Float.valueOf(realtimeWatchData.batteryPercent)) && kotlin.jvm.internal.Intrinsics.areEqual(this.settingsData, realtimeWatchData.settingsData);
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((((((((((this.totalSteps * 31) + this.totalActiveCalories) * 31) + this.totalSleep) * 31) + java.lang.Float.floatToIntBits(this.totalDistance)) * 31) + this.totalSolarPower) * 31) + this.totalThermalPower) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.heartRate)) * 31) + java.lang.Float.floatToIntBits(this.skinTemp)) * 31) + java.lang.Float.floatToIntBits(this.batteryPercent)) * 31;
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = this.settingsData;
        return iFloatToIntBits + (settingsData == null ? 0 : settingsData.hashCode());
    }

    public java.lang.String toString() {
        return "RealtimeWatchData(totalSteps=" + this.totalSteps + ", totalActiveCalories=" + this.totalActiveCalories + ", totalSleep=" + this.totalSleep + ", totalDistance=" + this.totalDistance + ", totalSolarPower=" + this.totalSolarPower + ", totalThermalPower=" + this.totalThermalPower + ", heartRate=" + this.heartRate + ", skinTemp=" + this.skinTemp + ", batteryPercent=" + this.batteryPercent + ", settingsData=" + this.settingsData + ')';
    }

    public RealtimeWatchData(int i, int i2, int i3, float f, int i4, int i5, long j, float f2, float f3, powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        this.totalSteps = i;
        this.totalActiveCalories = i2;
        this.totalSleep = i3;
        this.totalDistance = f;
        this.totalSolarPower = i4;
        this.totalThermalPower = i5;
        this.heartRate = j;
        this.skinTemp = f2;
        this.batteryPercent = f3;
        this.settingsData = settingsData;
    }

    public /* synthetic */ RealtimeWatchData(int i, int i2, int i3, float f, int i4, int i5, long j, float f2, float f3, powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) == 0 ? i5 : 0, (i6 & 64) != 0 ? 0L : j, (i6 & 128) == 0 ? f2 : 0.0f, (i6 & 256) != 0 ? Float.MIN_VALUE : f3, (i6 & 512) != 0 ? null : settingsData);
    }

    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public final void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public final int getTotalActiveCalories() {
        return this.totalActiveCalories;
    }

    public final void setTotalActiveCalories(int i) {
        this.totalActiveCalories = i;
    }

    public final int getTotalSleep() {
        return this.totalSleep;
    }

    public final void setTotalSleep(int i) {
        this.totalSleep = i;
    }

    public final float getTotalDistance() {
        return this.totalDistance;
    }

    public final void setTotalDistance(float f) {
        this.totalDistance = f;
    }

    public final int getTotalSolarPower() {
        return this.totalSolarPower;
    }

    public final void setTotalSolarPower(int i) {
        this.totalSolarPower = i;
    }

    public final int getTotalThermalPower() {
        return this.totalThermalPower;
    }

    public final void setTotalThermalPower(int i) {
        this.totalThermalPower = i;
    }

    public final long getHeartRate() {
        return this.heartRate;
    }

    public final void setHeartRate(long j) {
        this.heartRate = j;
    }

    public final float getSkinTemp() {
        return this.skinTemp;
    }

    public final void setSkinTemp(float f) {
        this.skinTemp = f;
    }

    public final float getBatteryPercent() {
        return this.batteryPercent;
    }

    public final void setBatteryPercent(float f) {
        this.batteryPercent = f;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData getSettingsData() {
        return this.settingsData;
    }

    public final void setSettingsData(powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData) {
        this.settingsData = settingsData;
    }

    public final boolean isBatteryValid() {
        return !(this.batteryPercent == Float.MIN_VALUE);
    }
}
