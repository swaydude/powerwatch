package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: TypeConverters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0007J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserActivitySessionConverter;", "", "()V", "fromActivityType", "", "activityType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;", "fromGPSPositions", "gpsPositions", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "fromHeartRates", "heartRates", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "fromRunningSplits", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;", "toActivityType", "toGPSPositions", "toHeartRates", "toRunningSplits", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserActivitySessionConverter {
    public final java.lang.String fromActivityType(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType activityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "activityType");
        java.lang.String strName = activityType.name();
        java.util.Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = strName.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType toActivityType(java.lang.String activityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "activityType");
        return powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.valueOf(activityType);
    }

    public final java.lang.String fromGPSPositions(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPositions, "gpsPositions");
        java.lang.String json = new com.google.gson.Gson().toJson(gpsPositions, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter$fromGPSPositions$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(gpsPositions, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> toGPSPositions(java.lang.String gpsPositions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPositions, "gpsPositions");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(gpsPositions, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter$toGPSPositions$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(gpsPositions, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromRunningSplits(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> gpsPositions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPositions, "gpsPositions");
        java.lang.String json = new com.google.gson.Gson().toJson(gpsPositions, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter$fromRunningSplits$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(gpsPositions, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> toRunningSplits(java.lang.String gpsPositions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPositions, "gpsPositions");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(gpsPositions, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter$toRunningSplits$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(gpsPositions, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromHeartRates(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRates, "heartRates");
        java.lang.String json = new com.google.gson.Gson().toJson(heartRates, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter$fromHeartRates$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(heartRates, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> toHeartRates(java.lang.String heartRates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRates, "heartRates");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(heartRates, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter$toHeartRates$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(heartRates, type)");
        return (java.util.List) objFromJson;
    }
}
