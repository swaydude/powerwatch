package powerwatch.matrix.com.pwgen2android.main.dashboard.realtime;

/* JADX INFO: compiled from: RealTimeViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "", "bodyPower", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;", "solarPower", "stepsData", "distanceData", "heartBeatData", "caloriesData", "sleepData", "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V", "getBodyPower", "()Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;", "getCaloriesData", "getDistanceData", "getHeartBeatData", "getSleepData", "getSolarPower", "getStepsData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RealTimeData {
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue bodyPower;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue caloriesData;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue distanceData;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue heartBeatData;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue sleepData;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue solarPower;
    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue stepsData;

    public RealTimeData() {
        this(null, null, null, null, null, null, null, kotlinx.coroutines.scheduling.WorkQueueKt.MASK, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData realTimeData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue2, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue3, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue4, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue5, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue6, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            realTimeValue = realTimeData.bodyPower;
        }
        if ((i & 2) != 0) {
            realTimeValue2 = realTimeData.solarPower;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue8 = realTimeValue2;
        if ((i & 4) != 0) {
            realTimeValue3 = realTimeData.stepsData;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue9 = realTimeValue3;
        if ((i & 8) != 0) {
            realTimeValue4 = realTimeData.distanceData;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue10 = realTimeValue4;
        if ((i & 16) != 0) {
            realTimeValue5 = realTimeData.heartBeatData;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue11 = realTimeValue5;
        if ((i & 32) != 0) {
            realTimeValue6 = realTimeData.caloriesData;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue12 = realTimeValue6;
        if ((i & 64) != 0) {
            realTimeValue7 = realTimeData.sleepData;
        }
        return realTimeData.copy(realTimeValue, realTimeValue8, realTimeValue9, realTimeValue10, realTimeValue11, realTimeValue12, realTimeValue7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getBodyPower() {
        return this.bodyPower;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getSolarPower() {
        return this.solarPower;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getStepsData() {
        return this.stepsData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getDistanceData() {
        return this.distanceData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getHeartBeatData() {
        return this.heartBeatData;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getCaloriesData() {
        return this.caloriesData;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getSleepData() {
        return this.sleepData;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData copy(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue bodyPower, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue solarPower, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue stepsData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue distanceData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue heartBeatData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue caloriesData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue sleepData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyPower, "bodyPower");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(solarPower, "solarPower");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsData, "stepsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distanceData, "distanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartBeatData, "heartBeatData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caloriesData, "caloriesData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData(bodyPower, solarPower, stepsData, distanceData, heartBeatData, caloriesData, sleepData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData realTimeData = (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.bodyPower, realTimeData.bodyPower) && kotlin.jvm.internal.Intrinsics.areEqual(this.solarPower, realTimeData.solarPower) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepsData, realTimeData.stepsData) && kotlin.jvm.internal.Intrinsics.areEqual(this.distanceData, realTimeData.distanceData) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartBeatData, realTimeData.heartBeatData) && kotlin.jvm.internal.Intrinsics.areEqual(this.caloriesData, realTimeData.caloriesData) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepData, realTimeData.sleepData);
    }

    public int hashCode() {
        return (((((((((((this.bodyPower.hashCode() * 31) + this.solarPower.hashCode()) * 31) + this.stepsData.hashCode()) * 31) + this.distanceData.hashCode()) * 31) + this.heartBeatData.hashCode()) * 31) + this.caloriesData.hashCode()) * 31) + this.sleepData.hashCode();
    }

    public java.lang.String toString() {
        return "RealTimeData(bodyPower=" + this.bodyPower + ", solarPower=" + this.solarPower + ", stepsData=" + this.stepsData + ", distanceData=" + this.distanceData + ", heartBeatData=" + this.heartBeatData + ", caloriesData=" + this.caloriesData + ", sleepData=" + this.sleepData + ')';
    }

    public RealTimeData(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue bodyPower, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue solarPower, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue stepsData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue distanceData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue heartBeatData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue caloriesData, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue sleepData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyPower, "bodyPower");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(solarPower, "solarPower");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsData, "stepsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distanceData, "distanceData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartBeatData, "heartBeatData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caloriesData, "caloriesData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepData, "sleepData");
        this.bodyPower = bodyPower;
        this.solarPower = solarPower;
        this.stepsData = stepsData;
        this.distanceData = distanceData;
        this.heartBeatData = heartBeatData;
        this.caloriesData = caloriesData;
        this.sleepData = sleepData;
    }

    public /* synthetic */ RealTimeData(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue2, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue3, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue4, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue5, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue6, powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue2, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue3, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue4, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue5, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue6, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(0.0f, 0.0f, 3, null) : realTimeValue7);
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getBodyPower() {
        return this.bodyPower;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getSolarPower() {
        return this.solarPower;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getStepsData() {
        return this.stepsData;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getDistanceData() {
        return this.distanceData;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getHeartBeatData() {
        return this.heartBeatData;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getCaloriesData() {
        return this.caloriesData;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue getSleepData() {
        return this.sleepData;
    }
}
