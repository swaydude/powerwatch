package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api;

/* JADX INFO: compiled from: TCXWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getTCXType", "", "type", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class TCXWriterKt {

    /* JADX INFO: compiled from: TCXWriter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_RUNNING.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_RUNNING.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_JOGGING.ordinal()] = 3;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_JOGGING.ordinal()] = 4;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_BIKING.ordinal()] = 5;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_BIKING.ordinal()] = 6;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_DRIVING.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final java.lang.String getTCXType(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        switch (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriterKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return com.google.android.gms.fitness.FitnessActivities.RUNNING;
            case 5:
            case 6:
            case 7:
                return com.google.android.gms.fitness.FitnessActivities.BIKING;
            default:
                return com.google.android.gms.fitness.FitnessActivities.WALKING;
        }
    }
}
