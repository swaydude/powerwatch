package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: Goals.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "", "id", "", com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, "", "distance", "", "power", com.google.android.gms.fitness.FitnessActivities.SLEEP, "steps", "createdAt", "shouldSync", "", "(JIFIIIJZ)V", "getCalories", "()I", "getCreatedAt", "()J", "getDistance", "()F", "getId", "getPower", "getShouldSync", "()Z", "getSleep", "getSteps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GoalConfiguration {
    private final int calories;
    private final long createdAt;
    private final float distance;
    private final long id;
    private final int power;
    private final boolean shouldSync;
    private final int sleep;
    private final int steps;

    public GoalConfiguration() {
        this(0L, 0, 0.0f, 0, 0, 0, 0L, false, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPower() {
        return this.power;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSleep() {
        return this.sleep;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShouldSync() {
        return this.shouldSync;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration copy(long id, int calories, float distance, int power, int sleep, int steps, long createdAt, boolean shouldSync) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration(id, calories, distance, power, sleep, steps, createdAt, shouldSync);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) other;
        return this.id == goalConfiguration.id && this.calories == goalConfiguration.calories && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.distance), (java.lang.Object) java.lang.Float.valueOf(goalConfiguration.distance)) && this.power == goalConfiguration.power && this.sleep == goalConfiguration.sleep && this.steps == goalConfiguration.steps && this.createdAt == goalConfiguration.createdAt && this.shouldSync == goalConfiguration.shouldSync;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iM0 = ((((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.id) * 31) + this.calories) * 31) + java.lang.Float.floatToIntBits(this.distance)) * 31) + this.power) * 31) + this.sleep) * 31) + this.steps) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.createdAt)) * 31;
        boolean z = this.shouldSync;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM0 + r1;
    }

    public java.lang.String toString() {
        return "GoalConfiguration(id=" + this.id + ", calories=" + this.calories + ", distance=" + this.distance + ", power=" + this.power + ", sleep=" + this.sleep + ", steps=" + this.steps + ", createdAt=" + this.createdAt + ", shouldSync=" + this.shouldSync + ')';
    }

    public GoalConfiguration(long j, int i, float f, int i2, int i3, int i4, long j2, boolean z) {
        this.id = j;
        this.calories = i;
        this.distance = f;
        this.power = i2;
        this.sleep = i3;
        this.steps = i4;
        this.createdAt = j2;
        this.shouldSync = z;
    }

    public final long getId() {
        return this.id;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final int getPower() {
        return this.power;
    }

    public final int getSleep() {
        return this.sleep;
    }

    public final int getSteps() {
        return this.steps;
    }

    public /* synthetic */ GoalConfiguration(long j, int i, float f, int i2, int i3, int i4, long j2, boolean z, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? 2000 : i, (i5 & 4) != 0 ? 5000.0f : f, (i5 & 8) != 0 ? 6000 : i2, (i5 & 16) != 0 ? 480 : i3, (i5 & 32) != 0 ? 5000 : i4, (i5 & 64) != 0 ? java.lang.System.currentTimeMillis() : j2, (i5 & 128) != 0 ? false : z);
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getShouldSync() {
        return this.shouldSync;
    }
}
