package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day;

/* JADX INFO: compiled from: CombinedPeriodDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/CombinedWeekPeriodDataContainer;", "", "walkingWeeks", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "restingWeeks", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;", "sleepWeeks", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getRestingWeeks", "()Ljava/util/List;", "getSleepWeeks", "getWalkingWeeks", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CombinedWeekPeriodDataContainer {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeeks;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeeks;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer copy$default(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer combinedWeekPeriodDataContainer, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = combinedWeekPeriodDataContainer.walkingWeeks;
        }
        if ((i & 2) != 0) {
            list2 = combinedWeekPeriodDataContainer.restingWeeks;
        }
        if ((i & 4) != 0) {
            list3 = combinedWeekPeriodDataContainer.sleepWeeks;
        }
        return combinedWeekPeriodDataContainer.copy(list, list2, list3);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> component1() {
        return this.walkingWeeks;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> component2() {
        return this.restingWeeks;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> component3() {
        return this.sleepWeeks;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer copy(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeeks, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeeks, "walkingWeeks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeeks, "restingWeeks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeeks, "sleepWeeks");
        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer(walkingWeeks, restingWeeks, sleepWeeks);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer combinedWeekPeriodDataContainer = (powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.CombinedWeekPeriodDataContainer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walkingWeeks, combinedWeekPeriodDataContainer.walkingWeeks) && kotlin.jvm.internal.Intrinsics.areEqual(this.restingWeeks, combinedWeekPeriodDataContainer.restingWeeks) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepWeeks, combinedWeekPeriodDataContainer.sleepWeeks);
    }

    public int hashCode() {
        return (((this.walkingWeeks.hashCode() * 31) + this.restingWeeks.hashCode()) * 31) + this.sleepWeeks.hashCode();
    }

    public java.lang.String toString() {
        return "CombinedWeekPeriodDataContainer(walkingWeeks=" + this.walkingWeeks + ", restingWeeks=" + this.restingWeeks + ", sleepWeeks=" + this.sleepWeeks + ')';
    }

    public CombinedWeekPeriodDataContainer(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeeks, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeeks, "walkingWeeks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeeks, "restingWeeks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeeks, "sleepWeeks");
        this.walkingWeeks = walkingWeeks;
        this.restingWeeks = restingWeeks;
        this.sleepWeeks = sleepWeeks;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> getWalkingWeeks() {
        return this.walkingWeeks;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> getRestingWeeks() {
        return this.restingWeeks;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> getSleepWeeks() {
        return this.sleepWeeks;
    }
}
