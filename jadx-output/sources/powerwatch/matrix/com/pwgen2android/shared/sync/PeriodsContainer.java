package powerwatch.matrix.com.pwgen2android.shared.sync;

/* JADX INFO: compiled from: WatchSynchronizer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003Jµ\u0001\u00102\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u0006:"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "", "dayActivitySessions", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "walkingDayPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "restingDayPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "sleepDayPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "walkingWeekPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "restingWeekPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;", "sleepWeekPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;", "walkingMonthPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingMonthPeriod;", "restingMonthPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;", "sleepMonthPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepMonthPeriod;", "realtimeWatchData", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V", "getDayActivitySessions", "()Ljava/util/List;", "getRealtimeWatchData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "getRestingDayPeriods", "getRestingMonthPeriods", "getRestingWeekPeriods", "getSleepDayPeriods", "getSleepMonthPeriods", "getSleepWeekPeriods", "getWalkingDayPeriods", "getWalkingMonthPeriods", "getWalkingWeekPeriods", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PeriodsContainer {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> dayActivitySessions;
    private final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDayPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> restingMonthPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeekPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDayPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod> sleepMonthPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeekPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDayPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> walkingMonthPeriods;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeekPeriods;

    public PeriodsContainer() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> component1() {
        return this.dayActivitySessions;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod> component10() {
        return this.sleepMonthPeriods;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData getRealtimeWatchData() {
        return this.realtimeWatchData;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> component2() {
        return this.walkingDayPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> component3() {
        return this.restingDayPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> component4() {
        return this.sleepDayPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> component5() {
        return this.walkingWeekPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> component6() {
        return this.restingWeekPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> component7() {
        return this.sleepWeekPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> component8() {
        return this.walkingMonthPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> component9() {
        return this.restingMonthPeriods;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer copy(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> dayActivitySessions, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDayPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDayPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDayPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeekPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeekPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeekPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> walkingMonthPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> restingMonthPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod> sleepMonthPeriods, powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayActivitySessions, "dayActivitySessions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriods, "walkingDayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriods, "restingDayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriods, "sleepDayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriods, "walkingWeekPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriods, "restingWeekPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriods, "sleepWeekPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriods, "walkingMonthPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriods, "restingMonthPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriods, "sleepMonthPeriods");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer(dayActivitySessions, walkingDayPeriods, restingDayPeriods, sleepDayPeriods, walkingWeekPeriods, restingWeekPeriods, sleepWeekPeriods, walkingMonthPeriods, restingMonthPeriods, sleepMonthPeriods, realtimeWatchData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer = (powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dayActivitySessions, periodsContainer.dayActivitySessions) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingDayPeriods, periodsContainer.walkingDayPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingDayPeriods, periodsContainer.restingDayPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepDayPeriods, periodsContainer.sleepDayPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingWeekPeriods, periodsContainer.walkingWeekPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingWeekPeriods, periodsContainer.restingWeekPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepWeekPeriods, periodsContainer.sleepWeekPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.walkingMonthPeriods, periodsContainer.walkingMonthPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingMonthPeriods, periodsContainer.restingMonthPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepMonthPeriods, periodsContainer.sleepMonthPeriods) && kotlin.jvm.internal.Intrinsics.areEqual(this.realtimeWatchData, periodsContainer.realtimeWatchData);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.dayActivitySessions.hashCode() * 31) + this.walkingDayPeriods.hashCode()) * 31) + this.restingDayPeriods.hashCode()) * 31) + this.sleepDayPeriods.hashCode()) * 31) + this.walkingWeekPeriods.hashCode()) * 31) + this.restingWeekPeriods.hashCode()) * 31) + this.sleepWeekPeriods.hashCode()) * 31) + this.walkingMonthPeriods.hashCode()) * 31) + this.restingMonthPeriods.hashCode()) * 31) + this.sleepMonthPeriods.hashCode()) * 31;
        powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData = this.realtimeWatchData;
        return iHashCode + (realtimeWatchData == null ? 0 : realtimeWatchData.hashCode());
    }

    public java.lang.String toString() {
        return "PeriodsContainer(dayActivitySessions=" + this.dayActivitySessions + ", walkingDayPeriods=" + this.walkingDayPeriods + ", restingDayPeriods=" + this.restingDayPeriods + ", sleepDayPeriods=" + this.sleepDayPeriods + ", walkingWeekPeriods=" + this.walkingWeekPeriods + ", restingWeekPeriods=" + this.restingWeekPeriods + ", sleepWeekPeriods=" + this.sleepWeekPeriods + ", walkingMonthPeriods=" + this.walkingMonthPeriods + ", restingMonthPeriods=" + this.restingMonthPeriods + ", sleepMonthPeriods=" + this.sleepMonthPeriods + ", realtimeWatchData=" + this.realtimeWatchData + ')';
    }

    public PeriodsContainer(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> dayActivitySessions, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDayPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDayPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDayPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeekPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeekPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeekPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> walkingMonthPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> restingMonthPeriods, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod> sleepMonthPeriods, powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayActivitySessions, "dayActivitySessions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriods, "walkingDayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriods, "restingDayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriods, "sleepDayPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeekPeriods, "walkingWeekPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeekPeriods, "restingWeekPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeekPeriods, "sleepWeekPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingMonthPeriods, "walkingMonthPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingMonthPeriods, "restingMonthPeriods");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMonthPeriods, "sleepMonthPeriods");
        this.dayActivitySessions = dayActivitySessions;
        this.walkingDayPeriods = walkingDayPeriods;
        this.restingDayPeriods = restingDayPeriods;
        this.sleepDayPeriods = sleepDayPeriods;
        this.walkingWeekPeriods = walkingWeekPeriods;
        this.restingWeekPeriods = restingWeekPeriods;
        this.sleepWeekPeriods = sleepWeekPeriods;
        this.walkingMonthPeriods = walkingMonthPeriods;
        this.restingMonthPeriods = restingMonthPeriods;
        this.sleepMonthPeriods = sleepMonthPeriods;
        this.realtimeWatchData = realtimeWatchData;
    }

    public /* synthetic */ PeriodsContainer(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.util.List list7, java.util.List list8, java.util.List list9, java.util.List list10, powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list6, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list7, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list8, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list9, (i & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list10, (i & 1024) != 0 ? null : realtimeWatchData);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getDayActivitySessions() {
        return this.dayActivitySessions;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> getWalkingDayPeriods() {
        return this.walkingDayPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> getRestingDayPeriods() {
        return this.restingDayPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> getSleepDayPeriods() {
        return this.sleepDayPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> getWalkingWeekPeriods() {
        return this.walkingWeekPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> getRestingWeekPeriods() {
        return this.restingWeekPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> getSleepWeekPeriods() {
        return this.sleepWeekPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingMonthPeriod> getWalkingMonthPeriods() {
        return this.walkingMonthPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingMonthPeriod> getRestingMonthPeriods() {
        return this.restingMonthPeriods;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepMonthPeriod> getSleepMonthPeriods() {
        return this.sleepMonthPeriods;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData getRealtimeWatchData() {
        return this.realtimeWatchData;
    }
}
