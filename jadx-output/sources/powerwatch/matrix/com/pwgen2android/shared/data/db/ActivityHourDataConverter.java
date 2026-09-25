package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: TypeConverters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityHourDataConverter;", "", "()V", "fromRestingHours", "", "restingHours", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;", "fromSleepHours", "sleepHours", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepHourPeriod;", "fromSleepMins", "sleepMins", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepFiveMinPeriod;", "fromWalkingHours", "walkingHours", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingHourPeriod;", "toRestingHours", "toSleepHours", "toSleepMins", "toWalkingHours", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityHourDataConverter {
    public final java.lang.String fromRestingHours(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> restingHours) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHours, "restingHours");
        java.lang.String json = new com.google.gson.Gson().toJson(restingHours, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$fromRestingHours$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(restingHours, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod> toRestingHours(java.lang.String restingHours) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingHours, "restingHours");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(restingHours, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$toRestingHours$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(restingHours, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromWalkingHours(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> walkingHours) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHours, "walkingHours");
        java.lang.String json = new com.google.gson.Gson().toJson(walkingHours, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$fromWalkingHours$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(walkingHours, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> toWalkingHours(java.lang.String walkingHours) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingHours, "walkingHours");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(walkingHours, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$toWalkingHours$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(walkingHours, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromSleepMins(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> sleepMins) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMins, "sleepMins");
        java.lang.String json = new com.google.gson.Gson().toJson(sleepMins, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$fromSleepMins$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(sleepMins, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> toSleepMins(java.lang.String sleepMins) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepMins, "sleepMins");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(sleepMins, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$toSleepMins$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(sleepMins, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromSleepHours(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> sleepHours) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHours, "sleepHours");
        java.lang.String json = new com.google.gson.Gson().toJson(sleepHours, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$fromSleepHours$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(sleepHours, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> toSleepHours(java.lang.String sleepHours) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepHours, "sleepHours");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(sleepHours, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter$toSleepHours$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(sleepHours, type)");
        return (java.util.List) objFromJson;
    }
}
