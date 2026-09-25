package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "", "(Ljava/lang/String;I)V", "ACTIVITY_STATIONARY", "ACTIVITY_WALKING", "ACTIVITY_RUNNING", "ACTIVITY_JOGGING", "ACTIVITY_BIKING", "ACTIVITY_INDOOR_WALKING", "ACTIVITY_INDOOR_RUNNING", "ACTIVITY_INDOOR_JOGGING", "ACTIVITY_INDOOR_BIKING", "ACTIVITY_DRIVING", "ACTIVITY_HIIT", "ACTIVITY_UNKNOWN", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum UserActivityType {
    ACTIVITY_STATIONARY,
    ACTIVITY_WALKING,
    ACTIVITY_RUNNING,
    ACTIVITY_JOGGING,
    ACTIVITY_BIKING,
    ACTIVITY_INDOOR_WALKING,
    ACTIVITY_INDOOR_RUNNING,
    ACTIVITY_INDOOR_JOGGING,
    ACTIVITY_INDOOR_BIKING,
    ACTIVITY_DRIVING,
    ACTIVITY_HIIT,
    ACTIVITY_UNKNOWN;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType[] valuesCustom() {
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType[] userActivityTypeArrValuesCustom = values();
        return (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType[]) java.util.Arrays.copyOf(userActivityTypeArrValuesCustom, userActivityTypeArrValuesCustom.length);
    }
}
