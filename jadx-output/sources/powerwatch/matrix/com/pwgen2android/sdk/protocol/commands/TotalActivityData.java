package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;", "", "lastLogTime", "", "steps", "distance", com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, "", "(JJJI)V", "getCalories", "()I", "getDistance", "()J", "getLastLogTime", "setLastLogTime", "(J)V", "getSteps", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TotalActivityData {
    private final int calories;
    private final long distance;
    private long lastLogTime;
    private final long steps;

    public TotalActivityData() {
        this(0L, 0L, 0L, 0, 15, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastLogTime() {
        return this.lastLogTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData copy(long lastLogTime, long steps, long distance, int calories) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData(lastLogTime, steps, distance, calories);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData totalActivityData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData) other;
        return this.lastLogTime == totalActivityData.lastLogTime && this.steps == totalActivityData.steps && this.distance == totalActivityData.distance && this.calories == totalActivityData.calories;
    }

    public int hashCode() {
        return (((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.lastLogTime) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.steps)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.distance)) * 31) + this.calories;
    }

    public java.lang.String toString() {
        return "TotalActivityData(lastLogTime=" + this.lastLogTime + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ')';
    }

    public TotalActivityData(long j, long j2, long j3, int i) {
        this.lastLogTime = j;
        this.steps = j2;
        this.distance = j3;
        this.calories = i;
    }

    public /* synthetic */ TotalActivityData(long j, long j2, long j3, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) == 0 ? j3 : 0L, (i2 & 8) != 0 ? 0 : i);
    }

    public final int getCalories() {
        return this.calories;
    }

    public final long getDistance() {
        return this.distance;
    }

    public final long getLastLogTime() {
        return this.lastLogTime;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final void setLastLogTime(long j) {
        this.lastLogTime = j;
    }
}
