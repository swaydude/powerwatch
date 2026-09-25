package powerwatch.matrix.com.pwgen2android.main.battery;

/* JADX INFO: compiled from: Resources.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "stepsReached", "caloriesReached", "sleepsReached", "powerReached", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaloriesReached", "()Ljava/lang/String;", "getPowerReached", "getSleepsReached", "getStepsReached", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GoalResource {
    private final java.lang.String caloriesReached;
    private final java.lang.String powerReached;
    private final java.lang.String sleepsReached;
    private final java.lang.String stepsReached;
    private final java.lang.String title;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.battery.GoalResource copy$default(powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalResource, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = goalResource.title;
        }
        if ((i & 2) != 0) {
            str2 = goalResource.stepsReached;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = goalResource.caloriesReached;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = goalResource.sleepsReached;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = goalResource.powerReached;
        }
        return goalResource.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getStepsReached() {
        return this.stepsReached;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getCaloriesReached() {
        return this.caloriesReached;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getSleepsReached() {
        return this.sleepsReached;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getPowerReached() {
        return this.powerReached;
    }

    public final powerwatch.matrix.com.pwgen2android.main.battery.GoalResource copy(java.lang.String title, java.lang.String stepsReached, java.lang.String caloriesReached, java.lang.String sleepsReached, java.lang.String powerReached) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsReached, "stepsReached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caloriesReached, "caloriesReached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepsReached, "sleepsReached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(powerReached, "powerReached");
        return new powerwatch.matrix.com.pwgen2android.main.battery.GoalResource(title, stepsReached, caloriesReached, sleepsReached, powerReached);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.battery.GoalResource)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalResource = (powerwatch.matrix.com.pwgen2android.main.battery.GoalResource) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, goalResource.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepsReached, goalResource.stepsReached) && kotlin.jvm.internal.Intrinsics.areEqual(this.caloriesReached, goalResource.caloriesReached) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepsReached, goalResource.sleepsReached) && kotlin.jvm.internal.Intrinsics.areEqual(this.powerReached, goalResource.powerReached);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.stepsReached.hashCode()) * 31) + this.caloriesReached.hashCode()) * 31) + this.sleepsReached.hashCode()) * 31) + this.powerReached.hashCode();
    }

    public java.lang.String toString() {
        return "GoalResource(title=" + this.title + ", stepsReached=" + this.stepsReached + ", caloriesReached=" + this.caloriesReached + ", sleepsReached=" + this.sleepsReached + ", powerReached=" + this.powerReached + ')';
    }

    public GoalResource(java.lang.String title, java.lang.String stepsReached, java.lang.String caloriesReached, java.lang.String sleepsReached, java.lang.String powerReached) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsReached, "stepsReached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caloriesReached, "caloriesReached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepsReached, "sleepsReached");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(powerReached, "powerReached");
        this.title = title;
        this.stepsReached = stepsReached;
        this.caloriesReached = caloriesReached;
        this.sleepsReached = sleepsReached;
        this.powerReached = powerReached;
    }

    public final java.lang.String getCaloriesReached() {
        return this.caloriesReached;
    }

    public final java.lang.String getPowerReached() {
        return this.powerReached;
    }

    public final java.lang.String getSleepsReached() {
        return this.sleepsReached;
    }

    public final java.lang.String getStepsReached() {
        return this.stepsReached;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }
}
