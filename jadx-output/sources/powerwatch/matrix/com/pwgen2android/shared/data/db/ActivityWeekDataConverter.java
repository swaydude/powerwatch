package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: TypeConverters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/ActivityWeekDataConverter;", "", "()V", "fromRestingWeeks", "", "restingWeeks", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingWeekPeriod;", "fromSleepWeeks", "sleepWeeks", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepWeekPeriod;", "fromWalkingWeeks", "walkingWeeks", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingWeekPeriod;", "toRestingWeeks", "toSleepWeeks", "toWalkingWeeks", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ActivityWeekDataConverter {
    public final java.lang.String fromRestingWeeks(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> restingWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeeks, "restingWeeks");
        java.lang.String json = new com.google.gson.Gson().toJson(restingWeeks, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityWeekDataConverter$fromRestingWeeks$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(restingWeeks, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod> toRestingWeeks(java.lang.String restingWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingWeeks, "restingWeeks");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(restingWeeks, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.RestingWeekPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityWeekDataConverter$toRestingWeeks$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(restingWeeks, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromWalkingWeeks(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> walkingWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeeks, "walkingWeeks");
        java.lang.String json = new com.google.gson.Gson().toJson(walkingWeeks, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityWeekDataConverter$fromWalkingWeeks$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(walkingWeeks, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod> toWalkingWeeks(java.lang.String walkingWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingWeeks, "walkingWeeks");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(walkingWeeks, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingWeekPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityWeekDataConverter$toWalkingWeeks$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(walkingWeeks, type)");
        return (java.util.List) objFromJson;
    }

    public final java.lang.String fromSleepWeeks(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> sleepWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeeks, "sleepWeeks");
        java.lang.String json = new com.google.gson.Gson().toJson(sleepWeeks, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityWeekDataConverter$fromSleepWeeks$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(sleepWeeks, type)");
        return json;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod> toSleepWeeks(java.lang.String sleepWeeks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepWeeks, "sleepWeeks");
        java.lang.Object objFromJson = new com.google.gson.Gson().fromJson(sleepWeeks, new com.google.gson.reflect.TypeToken<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.SleepWeekPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityWeekDataConverter$toSleepWeeks$type$1
        }.getType());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(sleepWeeks, type)");
        return (java.util.List) objFromJson;
    }
}
