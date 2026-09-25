package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GoalInfoData;", "", "stepsGoal", "", "distanceGoal", "", "caloriesGoal", "sleepGoal", "(IFII)V", "getCaloriesGoal", "()I", "getDistanceGoal", "()F", "getSleepGoal", "getStepsGoal", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GoalInfoData {
    private final int caloriesGoal;
    private final float distanceGoal;
    private final int sleepGoal;
    private final int stepsGoal;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData, int i, float f, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = goalInfoData.stepsGoal;
        }
        if ((i4 & 2) != 0) {
            f = goalInfoData.distanceGoal;
        }
        if ((i4 & 4) != 0) {
            i2 = goalInfoData.caloriesGoal;
        }
        if ((i4 & 8) != 0) {
            i3 = goalInfoData.sleepGoal;
        }
        return goalInfoData.copy(i, f, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStepsGoal() {
        return this.stepsGoal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDistanceGoal() {
        return this.distanceGoal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCaloriesGoal() {
        return this.caloriesGoal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSleepGoal() {
        return this.sleepGoal;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData copy(int stepsGoal, float distanceGoal, int caloriesGoal, int sleepGoal) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData(stepsGoal, distanceGoal, caloriesGoal, sleepGoal);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData goalInfoData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GoalInfoData) other;
        return this.stepsGoal == goalInfoData.stepsGoal && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.distanceGoal), (java.lang.Object) java.lang.Float.valueOf(goalInfoData.distanceGoal)) && this.caloriesGoal == goalInfoData.caloriesGoal && this.sleepGoal == goalInfoData.sleepGoal;
    }

    public int hashCode() {
        return (((((this.stepsGoal * 31) + java.lang.Float.floatToIntBits(this.distanceGoal)) * 31) + this.caloriesGoal) * 31) + this.sleepGoal;
    }

    public java.lang.String toString() {
        return "GoalInfoData(stepsGoal=" + this.stepsGoal + ", distanceGoal=" + this.distanceGoal + ", caloriesGoal=" + this.caloriesGoal + ", sleepGoal=" + this.sleepGoal + ')';
    }

    public GoalInfoData(int i, float f, int i2, int i3) {
        this.stepsGoal = i;
        this.distanceGoal = f;
        this.caloriesGoal = i2;
        this.sleepGoal = i3;
    }

    public final int getCaloriesGoal() {
        return this.caloriesGoal;
    }

    public final float getDistanceGoal() {
        return this.distanceGoal;
    }

    public final int getSleepGoal() {
        return this.sleepGoal;
    }

    public final int getStepsGoal() {
        return this.stepsGoal;
    }
}
