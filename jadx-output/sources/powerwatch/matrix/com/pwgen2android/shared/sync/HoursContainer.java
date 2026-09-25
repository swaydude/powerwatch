package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JI\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/HoursContainer;", "", "walkingHourPeriods", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "restingHourPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "sleepHourPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "userActivitySessions", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRestingHourPeriods", "()Ljava/util/List;", "getSleepHourPeriods", "getUserActivitySessions", "getWalkingHourPeriods", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class HoursContainer {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHourPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHourPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivitySessions;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHourPeriods;

    public HoursContainer() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer copy$default(powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer hoursContainer, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = hoursContainer.walkingHourPeriods;
        }
        if ((i & 2) != 0) {
            list2 = hoursContainer.restingHourPeriods;
        }
        if ((i & 4) != 0) {
            list3 = hoursContainer.sleepHourPeriods;
        }
        if ((i & 8) != 0) {
            list4 = hoursContainer.userActivitySessions;
        }
        return hoursContainer.copy(list, list2, list3, list4);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> component1() {
        return this.walkingHourPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> component2() {
        return this.restingHourPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> component3() {
        return this.sleepHourPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> component4() {
        return this.userActivitySessions;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer copy(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHourPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHourPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHourPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivitySessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriods, "walkingHourPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriods, "restingHourPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriods, "sleepHourPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessions, "userActivitySessions");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer(walkingHourPeriods, restingHourPeriods, sleepHourPeriods, userActivitySessions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer hoursContainer = (powerwatch.matrix.com.pwgen2android.shared.sync.HoursContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walkingHourPeriods, hoursContainer.walkingHourPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingHourPeriods, hoursContainer.restingHourPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepHourPeriods, hoursContainer.sleepHourPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.userActivitySessions, hoursContainer.userActivitySessions);
    }

    public int hashCode() {
        return (((((this.walkingHourPeriods.hashCode() * 31) + this.restingHourPeriods.hashCode()) * 31) + this.sleepHourPeriods.hashCode()) * 31) + this.userActivitySessions.hashCode();
    }

    public java.lang.String toString() {
        return "HoursContainer(walkingHourPeriods=" + this.walkingHourPeriods + ", restingHourPeriods=" + this.restingHourPeriods + ", sleepHourPeriods=" + this.sleepHourPeriods + ", userActivitySessions=" + this.userActivitySessions + ')';
    }

    public HoursContainer(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHourPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHourPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHourPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userActivitySessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHourPeriods, "walkingHourPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHourPeriods, "restingHourPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHourPeriods, "sleepHourPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userActivitySessions, "userActivitySessions");
        this.walkingHourPeriods = walkingHourPeriods;
        this.restingHourPeriods = restingHourPeriods;
        this.sleepHourPeriods = sleepHourPeriods;
        this.userActivitySessions = userActivitySessions;
    }

    public /* synthetic */ HoursContainer(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> getWalkingHourPeriods() {
        return this.walkingHourPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> getRestingHourPeriods() {
        return this.restingHourPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> getSleepHourPeriods() {
        return this.sleepHourPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getUserActivitySessions() {
        return this.userActivitySessions;
    }
}
