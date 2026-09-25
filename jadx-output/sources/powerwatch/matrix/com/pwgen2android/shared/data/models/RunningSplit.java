package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;", "", "splitDistance", "", "splitDuration", "", "(FJ)V", "getSplitDistance", "()F", "setSplitDistance", "(F)V", "getSplitDuration", "()J", "setSplitDuration", "(J)V", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RunningSplit {
    private float splitDistance;
    private long splitDuration;

    public RunningSplit() {
        this(0.0f, 0L, 3, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit, float f, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = runningSplit.splitDistance;
        }
        if ((i & 2) != 0) {
            j = runningSplit.splitDuration;
        }
        return runningSplit.copy(f, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSplitDistance() {
        return this.splitDistance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSplitDuration() {
        return this.splitDuration;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit copy(float splitDistance, long splitDuration) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit(splitDistance, splitDuration);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit = (powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.splitDistance), (java.lang.Object) java.lang.Float.valueOf(runningSplit.splitDistance)) && this.splitDuration == runningSplit.splitDuration;
    }

    public int hashCode() {
        return (java.lang.Float.floatToIntBits(this.splitDistance) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.splitDuration);
    }

    public java.lang.String toString() {
        return "RunningSplit(splitDistance=" + this.splitDistance + ", splitDuration=" + this.splitDuration + ')';
    }

    public RunningSplit(float f, long j) {
        this.splitDistance = f;
        this.splitDuration = j;
    }

    public /* synthetic */ RunningSplit(float f, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0L : j);
    }

    public final float getSplitDistance() {
        return this.splitDistance;
    }

    public final void setSplitDistance(float f) {
        this.splitDistance = f;
    }

    public final long getSplitDuration() {
        return this.splitDuration;
    }

    public final void setSplitDuration(long j) {
        this.splitDuration = j;
    }
}
