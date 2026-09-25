package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/LastPeriodsContainer;", "", "walkingHour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "restingHour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "sleepHour", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;)V", "getRestingHour", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "getSleepHour", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "getWalkingHour", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LastPeriodsContainer {
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHour;
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHour;
    private final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHour;

    public LastPeriodsContainer() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer copy$default(powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer lastPeriodsContainer, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            walkingHourPeriod = lastPeriodsContainer.walkingHour;
        }
        if ((i & 2) != 0) {
            restingHourPeriod = lastPeriodsContainer.restingHour;
        }
        if ((i & 4) != 0) {
            sleepHourPeriod = lastPeriodsContainer.sleepHour;
        }
        return lastPeriodsContainer.copy(walkingHourPeriod, restingHourPeriod, sleepHourPeriod);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod getWalkingHour() {
        return this.walkingHour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod getRestingHour() {
        return this.restingHour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod getSleepHour() {
        return this.sleepHour;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer copy(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHour, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHour) {
        return new powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer(walkingHour, restingHour, sleepHour);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer lastPeriodsContainer = (powerwatch.matrix.com.pwgen2android.shared.sync.LastPeriodsContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walkingHour, lastPeriodsContainer.walkingHour) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingHour, lastPeriodsContainer.restingHour) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepHour, lastPeriodsContainer.sleepHour);
    }

    public int hashCode() {
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = this.walkingHour;
        int iHashCode = (walkingHourPeriod == null ? 0 : walkingHourPeriod.hashCode()) * 31;
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod = this.restingHour;
        int iHashCode2 = (iHashCode + (restingHourPeriod == null ? 0 : restingHourPeriod.hashCode())) * 31;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod = this.sleepHour;
        return iHashCode2 + (sleepHourPeriod != null ? sleepHourPeriod.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LastPeriodsContainer(walkingHour=" + this.walkingHour + ", restingHour=" + this.restingHour + ", sleepHour=" + this.sleepHour + ')';
    }

    public LastPeriodsContainer(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod) {
        this.walkingHour = walkingHourPeriod;
        this.restingHour = restingHourPeriod;
        this.sleepHour = sleepHourPeriod;
    }

    public /* synthetic */ LastPeriodsContainer(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod restingHourPeriod, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : walkingHourPeriod, (i & 2) != 0 ? null : restingHourPeriod, (i & 4) != 0 ? null : sleepHourPeriod);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod getWalkingHour() {
        return this.walkingHour;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod getRestingHour() {
        return this.restingHour;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod getSleepHour() {
        return this.sleepHour;
    }
}
