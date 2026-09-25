package powerwatch.matrix.com.pwgen2android.main.dashboard.realtime;

/* JADX INFO: compiled from: RealTimeViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;", "", "value", "", "goalValue", "(II)V", "", "(FF)V", "getGoalValue", "()F", "setGoalValue", "(F)V", "getValue", "setValue", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RealTimeValue {
    private float goalValue;
    private float value;

    /* JADX WARN: Illegal instructions before constructor call */
    public RealTimeValue() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = realTimeValue.value;
        }
        if ((i & 2) != 0) {
            f2 = realTimeValue.goalValue;
        }
        return realTimeValue.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getGoalValue() {
        return this.goalValue;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue copy(float value, float goalValue) {
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(value, goalValue);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue realTimeValue = (powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.value), (java.lang.Object) java.lang.Float.valueOf(realTimeValue.value)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.goalValue), (java.lang.Object) java.lang.Float.valueOf(realTimeValue.goalValue));
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.value) * 31) + java.lang.Float.floatToIntBits(this.goalValue);
    }

    public java.lang.String toString() {
        return "RealTimeValue(value=" + this.value + ", goalValue=" + this.goalValue + ')';
    }

    public RealTimeValue(float f, float f2) {
        this.value = f;
        this.goalValue = f2;
    }

    public /* synthetic */ RealTimeValue(float f, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public final float getGoalValue() {
        return this.goalValue;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setGoalValue(float f) {
        this.goalValue = f;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    public RealTimeValue(int i, int i2) {
        this(i, i2);
    }
}
