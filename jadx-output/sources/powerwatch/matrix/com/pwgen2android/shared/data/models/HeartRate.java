package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "", "value", "", "startTime", "", "endTime", "(IJJ)V", "getEndTime", "()J", "setEndTime", "(J)V", "getStartTime", "setStartTime", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class HeartRate {
    private long endTime;
    private long startTime;
    private int value;

    public HeartRate() {
        this(0, 0L, 0L, 7, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, int i, long j, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = heartRate.value;
        }
        if ((i2 & 2) != 0) {
            j = heartRate.startTime;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = heartRate.endTime;
        }
        return heartRate.copy(i, j3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate copy(int value, long startTime, long endTime) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate(value, startTime, endTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate = (powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) other;
        return this.value == heartRate.value && this.startTime == heartRate.startTime && this.endTime == heartRate.endTime;
    }

    public int hashCode() {
        return (((this.value * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startTime)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.endTime);
    }

    public java.lang.String toString() {
        return "HeartRate(value=" + this.value + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ')';
    }

    public HeartRate(int i, long j, long j2) {
        this.value = i;
        this.startTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ HeartRate(int i, long j, long j2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2);
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }
}
