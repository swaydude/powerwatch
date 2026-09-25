package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: TypeConverters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityDayDataConverter;", "", "()V", "fromRestingDays", "", "restingDays", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "fromSleepDays", "sleepDays", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "fromWalkingDays", "walkingDays", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "toRestingDays", "toSleepDays", "toWalkingDays", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityDayDataConverter {
    public final java.lang.String fromRestingDays(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> restingDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDays, "restingDays");
        java.lang.String json = new com.google.gson.Gson().toJson(restingDays, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityDayDataConverter$fromRestingDays$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(restingDays, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod> toRestingDays(java.lang.String restingDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDays, "restingDays");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(restingDays, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityDayDataConverter$toRestingDays$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(restingDays, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromWalkingDays(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> walkingDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDays, "walkingDays");
        java.lang.String json = new com.google.gson.Gson().toJson(walkingDays, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityDayDataConverter$fromWalkingDays$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(walkingDays, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod> toWalkingDays(java.lang.String walkingDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDays, "walkingDays");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(walkingDays, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityDayDataConverter$toWalkingDays$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(walkingDays, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromSleepDays(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> sleepDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDays, "sleepDays");
        java.lang.String json = new com.google.gson.Gson().toJson(sleepDays, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityDayDataConverter$fromSleepDays$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(sleepDays, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod> toSleepDays(java.lang.String sleepDays) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDays, "sleepDays");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(sleepDays, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityDayDataConverter$toSleepDays$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(sleepDays, type)");
        return (java.util.List) objFromJson;
    }
}
