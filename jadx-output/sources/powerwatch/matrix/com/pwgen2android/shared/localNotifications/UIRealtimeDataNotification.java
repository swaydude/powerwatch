package powerwatch.matrix.com.pwgen2android.shared.localNotifications;

/* JADX INFO: compiled from: NotificationManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JI\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;", "", "steps", "", com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES, "Lkotlin/Pair;", "distance", "heartRate", "(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)V", "getCalories", "()Lkotlin/Pair;", "getDistance", "getHeartRate", "()Ljava/lang/String;", "getSteps", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UIRealtimeDataNotification {
    private final kotlin.Pair<java.lang.String, java.lang.String> calories;
    private final kotlin.Pair<java.lang.String, java.lang.String> distance;
    private final java.lang.String heartRate;
    private final java.lang.String steps;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification copy$default(powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification uIRealtimeDataNotification, java.lang.String str, kotlin.Pair pair, kotlin.Pair pair2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uIRealtimeDataNotification.steps;
        }
        if ((i & 2) != 0) {
            pair = uIRealtimeDataNotification.calories;
        }
        if ((i & 4) != 0) {
            pair2 = uIRealtimeDataNotification.distance;
        }
        if ((i & 8) != 0) {
            str2 = uIRealtimeDataNotification.heartRate;
        }
        return uIRealtimeDataNotification.copy(str, pair, pair2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getSteps() {
        return this.steps;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> component2() {
        return this.calories;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> component3() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getHeartRate() {
        return this.heartRate;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification copy(java.lang.String steps, kotlin.Pair<java.lang.String, java.lang.String> calories, kotlin.Pair<java.lang.String, java.lang.String> distance, java.lang.String heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "steps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calories, "calories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distance, "distance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        return new powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification(steps, calories, distance, heartRate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification uIRealtimeDataNotification = (powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.steps, uIRealtimeDataNotification.steps) && kotlin.jvm.internal.Intrinsics.areEqual(this.calories, uIRealtimeDataNotification.calories) && kotlin.jvm.internal.Intrinsics.areEqual(this.distance, uIRealtimeDataNotification.distance) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartRate, uIRealtimeDataNotification.heartRate);
    }

    public int hashCode() {
        return (((((this.steps.hashCode() * 31) + this.calories.hashCode()) * 31) + this.distance.hashCode()) * 31) + this.heartRate.hashCode();
    }

    public java.lang.String toString() {
        return "UIRealtimeDataNotification(steps=" + this.steps + ", calories=" + this.calories + ", distance=" + this.distance + ", heartRate=" + this.heartRate + ')';
    }

    public UIRealtimeDataNotification(java.lang.String steps, kotlin.Pair<java.lang.String, java.lang.String> calories, kotlin.Pair<java.lang.String, java.lang.String> distance, java.lang.String heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "steps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calories, "calories");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distance, "distance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        this.steps = steps;
        this.calories = calories;
        this.distance = distance;
        this.heartRate = heartRate;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> getCalories() {
        return this.calories;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> getDistance() {
        return this.distance;
    }

    public final java.lang.String getHeartRate() {
        return this.heartRate;
    }

    public final java.lang.String getSteps() {
        return this.steps;
    }
}
