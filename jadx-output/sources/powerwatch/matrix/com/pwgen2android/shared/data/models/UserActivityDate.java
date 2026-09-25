package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "", "startTime", "", "(J)V", "getStartTime", "()J", "setStartTime", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UserActivityDate {
    private long startTime;

    public UserActivityDate() {
        this(0L, 1, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate userActivityDate, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = userActivityDate.startTime;
        }
        return userActivityDate.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate copy(long startTime) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate(startTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate) && this.startTime == ((powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate) other).startTime;
    }

    public int hashCode() {
        return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startTime);
    }

    public java.lang.String toString() {
        return "UserActivityDate(startTime=" + this.startTime + ')';
    }

    public UserActivityDate(long j) {
        this.startTime = j;
    }

    public /* synthetic */ UserActivityDate(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
