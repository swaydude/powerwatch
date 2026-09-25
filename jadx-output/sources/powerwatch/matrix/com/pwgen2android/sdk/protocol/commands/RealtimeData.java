package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: ReceiveRealTimeCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RealtimeData;", "", "timestamp", "", "currentSteps", "currentDistance", "currentCalories", "", "(JJJI)V", "getCurrentCalories", "()I", "getCurrentDistance", "()J", "getCurrentSteps", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RealtimeData {
    private final int currentCalories;
    private final long currentDistance;
    private final long currentSteps;
    private final long timestamp;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCurrentSteps() {
        return this.currentSteps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCurrentDistance() {
        return this.currentDistance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCurrentCalories() {
        return this.currentCalories;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RealtimeData copy(long timestamp, long currentSteps, long currentDistance, int currentCalories) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RealtimeData(timestamp, currentSteps, currentDistance, currentCalories);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RealtimeData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RealtimeData realtimeData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RealtimeData) other;
        return this.timestamp == realtimeData.timestamp && this.currentSteps == realtimeData.currentSteps && this.currentDistance == realtimeData.currentDistance && this.currentCalories == realtimeData.currentCalories;
    }

    public int hashCode() {
        return (((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.timestamp) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.currentSteps)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.currentDistance)) * 31) + this.currentCalories;
    }

    public java.lang.String toString() {
        return "RealtimeData(timestamp=" + this.timestamp + ", currentSteps=" + this.currentSteps + ", currentDistance=" + this.currentDistance + ", currentCalories=" + this.currentCalories + ')';
    }

    public RealtimeData(long j, long j2, long j3, int i) {
        this.timestamp = j;
        this.currentSteps = j2;
        this.currentDistance = j3;
        this.currentCalories = i;
    }

    public final int getCurrentCalories() {
        return this.currentCalories;
    }

    public final long getCurrentDistance() {
        return this.currentDistance;
    }

    public final long getCurrentSteps() {
        return this.currentSteps;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
